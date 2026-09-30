package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f17f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f18g;

    public /* synthetic */ f(e0 e0Var, n nVar) {
        this.f17f = e0Var;
        this.f18g = nVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar == androidx.lifecycle.l.ON_CREATE) {
            OnBackInvokedDispatcher d = a.d(this.f18g);
            d.getClass();
            this.f17f.b(d);
        }
    }
}
