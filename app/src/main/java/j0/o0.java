package j0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class o0 extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f2172a;

    public o0(c1 c1Var) {
        super(c1Var);
        WindowInsets.Builder builder;
        WindowInsets e3 = c1Var.e();
        if (e3 != null) {
            builder = new WindowInsets.Builder(e3);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f2172a = builder;
    }

    @Override // j0.r0
    public c1 b() {
        a();
        c1 f3 = c1.f(null, this.f2172a.build());
        f3.f2146a.m(null);
        return f3;
    }

    @Override // j0.r0
    public void c(c0.b bVar) {
        this.f2172a.setSystemWindowInsets(bVar.d());
    }

    public o0() {
        this.f2172a = new WindowInsets.Builder();
    }
}
