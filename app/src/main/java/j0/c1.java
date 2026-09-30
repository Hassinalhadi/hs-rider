package j0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f2145b;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f2146a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f2145b = x0.h;
        } else {
            f2145b = w0.f2185g;
        }
    }

    public c1(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.f2146a = new x0(this, windowInsets);
        } else {
            this.f2146a = new w0(this, windowInsets);
        }
    }

    public static c1 f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        c1 c1Var = new c1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = j0.f2160a;
            c1 a3 = d0.a(view);
            y0 y0Var = c1Var.f2146a;
            y0Var.n(a3);
            y0Var.d(view.getRootView());
            y0Var.o(view.getWindowSystemUiVisibility());
        }
        return c1Var;
    }

    public final int a() {
        return this.f2146a.i().d;
    }

    public final int b() {
        return this.f2146a.i().f1082a;
    }

    public final int c() {
        return this.f2146a.i().f1084c;
    }

    public final int d() {
        return this.f2146a.i().f1083b;
    }

    public final WindowInsets e() {
        y0 y0Var = this.f2146a;
        if (y0Var instanceof s0) {
            return ((s0) y0Var).f2177c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return Objects.equals(this.f2146a, ((c1) obj).f2146a);
    }

    public final int hashCode() {
        y0 y0Var = this.f2146a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public c1() {
        this.f2146a = new y0(this);
    }
}
