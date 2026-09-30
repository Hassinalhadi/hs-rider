package k;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i0 extends q1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f2276o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q0 f2277p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(q0 q0Var, q0 q0Var2, n0 n0Var) {
        super(q0Var2);
        this.f2277p = q0Var;
        this.f2276o = n0Var;
    }

    @Override // k.q1
    public final j.c0 b() {
        return this.f2276o;
    }

    @Override // k.q1
    public final boolean c() {
        q0 q0Var = this.f2277p;
        if (!q0Var.getInternalPopup().b()) {
            q0Var.f2362k.e(q0Var.getTextDirection(), q0Var.getTextAlignment());
            return true;
        }
        return true;
    }
}
