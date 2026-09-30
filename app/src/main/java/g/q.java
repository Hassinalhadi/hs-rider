package g;

import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1767g;

    public /* synthetic */ q(c0 c0Var, int i3) {
        this.f1766f = i3;
        this.f1767g = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1766f) {
            case 0:
                c0 c0Var = this.f1767g;
                if ((c0Var.e0 & 1) != 0) {
                    c0Var.u(0);
                }
                if ((c0Var.e0 & 4096) != 0) {
                    c0Var.u(108);
                }
                c0Var.f1660d0 = false;
                c0Var.e0 = 0;
                return;
            default:
                c0 c0Var2 = this.f1767g;
                c0Var2.B.showAtLocation(c0Var2.A, 55, 0, 0);
                j0.k0 k0Var = c0Var2.D;
                if (k0Var != null) {
                    k0Var.b();
                }
                if (c0Var2.E && (viewGroup = c0Var2.F) != null && viewGroup.isLaidOut()) {
                    c0Var2.A.setAlpha(0.0f);
                    j0.k0 a3 = j0.j0.a(c0Var2.A);
                    a3.a(1.0f);
                    c0Var2.D = a3;
                    a3.d(new s(0, this));
                    return;
                }
                c0Var2.A.setAlpha(1.0f);
                c0Var2.A.setVisibility(0);
                return;
        }
    }
}
