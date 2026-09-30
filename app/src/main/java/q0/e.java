package q0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.emoji2.text.p;
import b2.x;
import java.util.ArrayList;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: m, reason: collision with root package name */
    public static final d f2759m = new d(1);

    /* renamed from: n, reason: collision with root package name */
    public static final d f2760n = new d(2);

    /* renamed from: o, reason: collision with root package name */
    public static final d f2761o = new d(3);

    /* renamed from: p, reason: collision with root package name */
    public static final d f2762p = new d(4);

    /* renamed from: q, reason: collision with root package name */
    public static final d f2763q = new d(5);

    /* renamed from: r, reason: collision with root package name */
    public static final d f2764r = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public final x f2767c;
    public final h d;

    /* renamed from: g, reason: collision with root package name */
    public final float f2770g;

    /* renamed from: j, reason: collision with root package name */
    public f f2772j;

    /* renamed from: k, reason: collision with root package name */
    public float f2773k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2774l;

    /* renamed from: a, reason: collision with root package name */
    public float f2765a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2766b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2768e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f2769f = 0;
    public final ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2771i = new ArrayList();

    public e(x xVar, h hVar) {
        this.f2767c = xVar;
        this.d = hVar;
        if (hVar != f2761o && hVar != f2762p && hVar != f2763q) {
            if (hVar == f2764r) {
                this.f2770g = 0.00390625f;
            } else if (hVar != f2759m && hVar != f2760n) {
                this.f2770g = 1.0f;
            } else {
                this.f2770g = 0.002f;
            }
        } else {
            this.f2770g = 0.1f;
        }
        this.f2772j = null;
        this.f2773k = Float.MAX_VALUE;
        this.f2774l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f2751i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new p(17)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [q0.a, java.lang.Object] */
    public final void a(float f3) {
        float durationScale;
        if (this.f2768e) {
            this.f2773k = f3;
            return;
        }
        if (this.f2772j == null) {
            this.f2772j = new f(f3);
        }
        f fVar = this.f2772j;
        double d = f3;
        fVar.f2781i = d;
        double d3 = (float) d;
        if (d3 <= Float.MAX_VALUE) {
            if (d3 >= -3.4028235E38f) {
                double abs = Math.abs(this.f2770g * 0.75f);
                fVar.d = abs;
                fVar.f2778e = abs * 62.5d;
                p pVar = b().f2755e;
                pVar.getClass();
                if (Thread.currentThread() == ((Looper) pVar.h).getThread()) {
                    boolean z2 = this.f2768e;
                    if (!z2 && !z2) {
                        this.f2768e = true;
                        float t3 = this.d.t(this.f2767c);
                        this.f2766b = t3;
                        if (t3 <= Float.MAX_VALUE && t3 >= -3.4028235E38f) {
                            c b3 = b();
                            ArrayList arrayList = b3.f2753b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b3.f2755e.f301g).postFrameCallback(new b(b3.d));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    b3.f2757g = durationScale;
                                    if (b3.h == null) {
                                        b3.h = new p(16, b3);
                                    }
                                    final p pVar2 = b3.h;
                                    if (((a) pVar2.f301g) == null) {
                                        ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: q0.a
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f4) {
                                                ((c) p.this.h).f2757g = f4;
                                            }
                                        };
                                        pVar2.f301g = r12;
                                        ValueAnimator.registerDurationScaleChangeListener(r12);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        a.b.m("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            a.b.n("Final position of the spring cannot be less than the min value.");
            return;
        }
        a.b.n("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f3) {
        this.d.X(this.f2767c, f3);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2771i;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    i3++;
                } else {
                    arrayList.get(i3).getClass();
                    a.b.c();
                    return;
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void d() {
        if (this.f2772j.f2776b > 0.0d) {
            p pVar = b().f2755e;
            pVar.getClass();
            if (Thread.currentThread() == ((Looper) pVar.h).getThread()) {
                if (this.f2768e) {
                    this.f2774l = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        a.b.n("Spring animations can only come to an end when there is damping");
    }
}
