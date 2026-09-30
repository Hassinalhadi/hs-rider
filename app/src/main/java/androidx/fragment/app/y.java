package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f530g;

    public y(z zVar, q0 q0Var) {
        this.f530g = zVar;
        this.f529f = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q0 q0Var = this.f529f;
        u uVar = q0Var.f467c;
        q0Var.k();
        l.f((ViewGroup) uVar.J.getParent(), this.f530g.f531f.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
