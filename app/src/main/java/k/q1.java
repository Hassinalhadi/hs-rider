package k;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class q1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final float f2365f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2366g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final View f2367i;

    /* renamed from: j, reason: collision with root package name */
    public p1 f2368j;

    /* renamed from: k, reason: collision with root package name */
    public p1 f2369k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2370l;

    /* renamed from: m, reason: collision with root package name */
    public int f2371m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f2372n = new int[2];

    public q1(View view) {
        this.f2367i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2365f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2366g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        p1 p1Var = this.f2369k;
        View view = this.f2367i;
        if (p1Var != null) {
            view.removeCallbacks(p1Var);
        }
        p1 p1Var2 = this.f2368j;
        if (p1Var2 != null) {
            view.removeCallbacks(p1Var2);
        }
    }

    public abstract j.c0 b();

    public abstract boolean c();

    public boolean d() {
        j.c0 b3 = b();
        if (b3 != null && b3.b()) {
            b3.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.q1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2370l = false;
        this.f2371m = -1;
        p1 p1Var = this.f2368j;
        if (p1Var != null) {
            this.f2367i.removeCallbacks(p1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
