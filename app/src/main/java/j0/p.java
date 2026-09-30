package j0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final View f2173f;

    /* renamed from: g, reason: collision with root package name */
    public ViewTreeObserver f2174g;
    public final Runnable h;

    public p(View view, Runnable runnable) {
        this.f2173f = view;
        this.f2174g = view.getViewTreeObserver();
        this.h = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            p pVar = new p(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(pVar);
            view.addOnAttachStateChangeListener(pVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2174g.isAlive();
        View view = this.f2173f;
        if (isAlive) {
            this.f2174g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2174g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2174g.isAlive();
        View view2 = this.f2173f;
        if (isAlive) {
            this.f2174g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
