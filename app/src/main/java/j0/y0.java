package j0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f2188b;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f2189a;

    static {
        r0 p0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            p0Var = new q0();
        } else {
            p0Var = new p0();
        }
        f2188b = p0Var.b().f2146a.a().f2146a.b().f2146a.c();
    }

    public y0(c1 c1Var) {
        this.f2189a = c1Var;
    }

    public c1 a() {
        return this.f2189a;
    }

    public c1 b() {
        return this.f2189a;
    }

    public c1 c() {
        return this.f2189a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (l() == y0Var.l() && k() == y0Var.k() && Objects.equals(i(), y0Var.i()) && Objects.equals(h(), y0Var.h()) && Objects.equals(e(), y0Var.e())) {
            return true;
        }
        return false;
    }

    public c0.b f(int i3) {
        return c0.b.f1081e;
    }

    public c0.b g(int i3) {
        if ((i3 & 8) == 0) {
            return c0.b.f1081e;
        }
        a.b.m("Unable to query the maximum insets for IME");
        return null;
    }

    public c0.b h() {
        return c0.b.f1081e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), e());
    }

    public c0.b i() {
        return c0.b.f1081e;
    }

    public c1 j(int i3, int i4, int i5, int i6) {
        return f2188b;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public void d(View view) {
    }

    public void m(c0.b[] bVarArr) {
    }

    public void n(c1 c1Var) {
    }

    public void o(int i3) {
    }
}
