package androidx.activity;

import a.a0;
import a.e0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$addCallback$lifecycleObserver$1 implements p, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f74f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f75g;

    public OnBackPressedDispatcher$addCallback$lifecycleObserver$1(a0 a0Var, e0 e0Var, t tVar) {
        this.f74f = a0Var;
        this.f75g = tVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        l lVar2 = l.ON_START;
        a0 a0Var = this.f74f;
        if (lVar == lVar2) {
            a0Var.b(true);
        } else if (lVar == l.ON_STOP) {
            a0Var.b(false);
        }
        if (lVar == l.ON_DESTROY) {
            a0Var.a();
            this.f75g.f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f75g.f(this);
    }
}
