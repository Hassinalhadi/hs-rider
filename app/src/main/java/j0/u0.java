package j0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class u0 extends t0 {
    public u0(c1 c1Var, WindowInsets windowInsets) {
        super(c1Var, windowInsets);
    }

    @Override // j0.y0
    public c1 a() {
        return c1.f(null, this.f2177c.consumeDisplayCutout());
    }

    @Override // j0.y0
    public i e() {
        DisplayCutout displayCutout = this.f2177c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // j0.y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (Objects.equals(this.f2177c, u0Var.f2177c) && Objects.equals(null, null) && s0.p(this.f2178e, u0Var.f2178e)) {
            return true;
        }
        return false;
    }

    @Override // j0.y0
    public int hashCode() {
        return this.f2177c.hashCode();
    }
}
