package j0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class s0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2177c;
    public c0.b d;

    /* renamed from: e, reason: collision with root package name */
    public int f2178e;

    public s0(c1 c1Var, WindowInsets windowInsets) {
        super(c1Var);
        this.d = null;
        this.f2177c = windowInsets;
    }

    public static boolean p(int i3, int i4) {
        if ((i3 & 6) == (i4 & 6)) {
            return true;
        }
        return false;
    }

    @Override // j0.y0
    public final c0.b i() {
        if (this.d == null) {
            WindowInsets windowInsets = this.f2177c;
            this.d = c0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override // j0.y0
    public boolean l() {
        return this.f2177c.isRound();
    }

    @Override // j0.y0
    public void o(int i3) {
        this.f2178e = i3;
    }

    @Override // j0.y0
    public void m(c0.b[] bVarArr) {
    }

    @Override // j0.y0
    public void n(c1 c1Var) {
    }
}
