package j0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class t0 extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public c0.b f2179f;

    public t0(c1 c1Var, WindowInsets windowInsets) {
        super(c1Var, windowInsets);
        this.f2179f = null;
    }

    @Override // j0.y0
    public c1 b() {
        return c1.f(null, this.f2177c.consumeStableInsets());
    }

    @Override // j0.y0
    public c1 c() {
        return c1.f(null, this.f2177c.consumeSystemWindowInsets());
    }

    @Override // j0.y0
    public final c0.b h() {
        if (this.f2179f == null) {
            WindowInsets windowInsets = this.f2177c;
            this.f2179f = c0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2179f;
    }

    @Override // j0.y0
    public boolean k() {
        return this.f2177c.isConsumed();
    }
}
