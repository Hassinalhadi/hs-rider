package j0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class w0 extends v0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c1 f2185g = c1.f(null, WindowInsets.CONSUMED);

    public w0(c1 c1Var, WindowInsets windowInsets) {
        super(c1Var, windowInsets);
    }

    @Override // j0.y0
    public c0.b f(int i3) {
        return c0.b.c(this.f2177c.getInsets(z0.a(i3)));
    }

    @Override // j0.y0
    public c0.b g(int i3) {
        return c0.b.c(this.f2177c.getInsetsIgnoringVisibility(z0.a(i3)));
    }

    @Override // j0.y0
    public final void d(View view) {
    }
}
