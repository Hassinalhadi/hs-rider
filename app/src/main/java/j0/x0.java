package j0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x0 extends w0 {
    public static final c1 h = c1.f(null, WindowInsets.CONSUMED);

    public x0(c1 c1Var, WindowInsets windowInsets) {
        super(c1Var, windowInsets);
    }

    @Override // j0.w0, j0.y0
    public c0.b f(int i3) {
        return c0.b.c(this.f2177c.getInsets(b1.a(i3)));
    }

    @Override // j0.w0, j0.y0
    public c0.b g(int i3) {
        return c0.b.c(this.f2177c.getInsetsIgnoringVisibility(b1.a(i3)));
    }
}
