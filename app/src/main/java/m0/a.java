package m0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.emoji2.text.p;
import androidx.fragment.app.w0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2524b;

    /* renamed from: c, reason: collision with root package name */
    public c0.b f2525c;
    public c0.b d;

    /* renamed from: e, reason: collision with root package name */
    public c f2526e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f2527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2528g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m0.b, java.lang.Object] */
    public a(int i3, int i4) {
        ?? obj = new Object();
        obj.f2529a = -1;
        obj.f2530b = -1;
        c0.b bVar = c0.b.f1081e;
        obj.f2531c = bVar;
        obj.d = false;
        obj.f2532e = null;
        obj.f2533f = 0.0f;
        obj.f2534g = 0.0f;
        obj.h = 1.0f;
        this.f2524b = obj;
        this.f2525c = bVar;
        this.d = bVar;
        this.f2526e = null;
        if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 8) {
            a.b.m(w0.d("Unexpected side: ", i3));
            throw null;
        }
        this.f2523a = i3;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f2527f = colorDrawable;
        this.h = 0;
        this.f2528g = true;
        if (i4 != 0) {
            this.h = i4;
            colorDrawable.setColor(i4);
            obj.f2532e = colorDrawable;
            p pVar = obj.f2535i;
            if (pVar != null) {
                ((View) pVar.h).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f3) {
        float f4 = f3 * 1.0f;
        b bVar = this.f2524b;
        if (bVar.h != f4) {
            bVar.h = f4;
            p pVar = bVar.f2535i;
            if (pVar != null) {
                ((View) pVar.h).setAlpha(f4);
            }
        }
    }

    public final void b(float f3) {
        float f4 = f3 * 1.0f;
        b bVar = this.f2524b;
        int i3 = this.f2523a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 == 8) {
                        float f5 = (1.0f - f4) * bVar.f2530b;
                        if (bVar.f2534g != f5) {
                            bVar.f2534g = f5;
                            p pVar = bVar.f2535i;
                            if (pVar != null) {
                                ((View) pVar.h).setTranslationY(f5);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                float f6 = (1.0f - f4) * bVar.f2529a;
                if (bVar.f2533f != f6) {
                    bVar.f2533f = f6;
                    p pVar2 = bVar.f2535i;
                    if (pVar2 != null) {
                        ((View) pVar2.h).setTranslationX(f6);
                        return;
                    }
                    return;
                }
                return;
            }
            float f7 = (-(1.0f - f4)) * bVar.f2530b;
            if (bVar.f2534g != f7) {
                bVar.f2534g = f7;
                p pVar3 = bVar.f2535i;
                if (pVar3 != null) {
                    ((View) pVar3.h).setTranslationY(f7);
                    return;
                }
                return;
            }
            return;
        }
        float f8 = (-(1.0f - f4)) * bVar.f2529a;
        if (bVar.f2533f != f8) {
            bVar.f2533f = f8;
            p pVar4 = bVar.f2535i;
            if (pVar4 != null) {
                ((View) pVar4.h).setTranslationX(f8);
            }
        }
    }
}
