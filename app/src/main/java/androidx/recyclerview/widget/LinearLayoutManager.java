package androidx.recyclerview.widget;

import a.b;
import a.y;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.f;
import androidx.fragment.app.w0;
import b1.c1;
import b1.m0;
import b1.n0;
import b1.o0;
import b1.p;
import b1.t0;
import b1.u;
import b1.v;
import b1.w;
import b1.x;
import b1.y0;
import b1.z0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class LinearLayoutManager extends n0 implements y0 {
    public final u A;
    public final v B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f598p;

    /* renamed from: q, reason: collision with root package name */
    public w f599q;

    /* renamed from: r, reason: collision with root package name */
    public f f600r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f601s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f602t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f604v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f605w;

    /* renamed from: x, reason: collision with root package name */
    public int f606x;

    /* renamed from: y, reason: collision with root package name */
    public int f607y;

    /* renamed from: z, reason: collision with root package name */
    public x f608z;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, b1.v] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f598p = 1;
        this.f602t = false;
        this.f603u = false;
        this.f604v = false;
        this.f605w = true;
        this.f606x = -1;
        this.f607y = Integer.MIN_VALUE;
        this.f608z = null;
        this.A = new u();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        m0 I = n0.I(context, attributeSet, i3, i4);
        a1(I.f833a);
        boolean z2 = I.f835c;
        c(null);
        if (z2 != this.f602t) {
            this.f602t = z2;
            m0();
        }
        b1(I.d);
    }

    @Override // b1.n0
    public boolean A0() {
        if (this.f608z == null && this.f601s == this.f604v) {
            return true;
        }
        return false;
    }

    public void B0(z0 z0Var, int[] iArr) {
        int i3;
        int i4;
        if (z0Var.f952a != -1) {
            i3 = this.f600r.l();
        } else {
            i3 = 0;
        }
        if (this.f599q.f924f == -1) {
            i4 = 0;
        } else {
            i4 = i3;
            i3 = 0;
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public void C0(z0 z0Var, w wVar, p pVar) {
        int i3 = wVar.d;
        if (i3 >= 0 && i3 < z0Var.b()) {
            pVar.a(i3, Math.max(0, wVar.f925g));
        }
    }

    public final int D0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f600r;
        boolean z2 = !this.f605w;
        return y.r(z0Var, fVar, K0(z2), J0(z2), this, this.f605w);
    }

    public final int E0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f600r;
        boolean z2 = !this.f605w;
        return y.s(z0Var, fVar, K0(z2), J0(z2), this, this.f605w, this.f603u);
    }

    public final int F0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f600r;
        boolean z2 = !this.f605w;
        return y.t(z0Var, fVar, K0(z2), J0(z2), this, this.f605w);
    }

    public final int G0(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 17) {
                    if (i3 != 33) {
                        if (i3 != 66) {
                            if (i3 == 130 && this.f598p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f598p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f598p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f598p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f598p != 1 && T0()) {
                return -1;
            }
            return 1;
        }
        if (this.f598p == 1 || !T0()) {
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b1.w, java.lang.Object] */
    public final void H0() {
        if (this.f599q == null) {
            ?? obj = new Object();
            obj.f920a = true;
            obj.h = 0;
            obj.f926i = 0;
            obj.f928k = null;
            this.f599q = obj;
        }
    }

    public final int I0(t0 t0Var, w wVar, z0 z0Var, boolean z2) {
        int i3;
        int i4 = wVar.f922c;
        int i5 = wVar.f925g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                wVar.f925g = i5 + i4;
            }
            W0(t0Var, wVar);
        }
        int i6 = wVar.f922c + wVar.h;
        while (true) {
            if ((!wVar.f929l && i6 <= 0) || (i3 = wVar.d) < 0 || i3 >= z0Var.b()) {
                break;
            }
            v vVar = this.B;
            vVar.f916a = 0;
            vVar.f917b = false;
            vVar.f918c = false;
            vVar.d = false;
            U0(t0Var, z0Var, wVar, vVar);
            if (!vVar.f917b) {
                int i7 = wVar.f921b;
                int i8 = vVar.f916a;
                wVar.f921b = (wVar.f924f * i8) + i7;
                if (!vVar.f918c || wVar.f928k != null || !z0Var.f957g) {
                    wVar.f922c -= i8;
                    i6 -= i8;
                }
                int i9 = wVar.f925g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    wVar.f925g = i10;
                    int i11 = wVar.f922c;
                    if (i11 < 0) {
                        wVar.f925g = i10 + i11;
                    }
                    W0(t0Var, wVar);
                }
                if (z2 && vVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - wVar.f922c;
    }

    public final View J0(boolean z2) {
        if (this.f603u) {
            return N0(0, v(), z2);
        }
        return N0(v() - 1, -1, z2);
    }

    public final View K0(boolean z2) {
        if (this.f603u) {
            return N0(v() - 1, -1, z2);
        }
        return N0(0, v(), z2);
    }

    @Override // b1.n0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return n0.H(N0);
    }

    public final View M0(int i3, int i4) {
        int i5;
        int i6;
        H0();
        if (i4 > i3 || i4 < i3) {
            if (this.f600r.e(u(i3)) < this.f600r.k()) {
                i5 = 16644;
                i6 = 16388;
            } else {
                i5 = 4161;
                i6 = 4097;
            }
            if (this.f598p == 0) {
                return this.f865c.u(i3, i4, i5, i6);
            }
            return this.d.u(i3, i4, i5, i6);
        }
        return u(i3);
    }

    public final View N0(int i3, int i4, boolean z2) {
        int i5;
        H0();
        if (z2) {
            i5 = 24579;
        } else {
            i5 = 320;
        }
        if (this.f598p == 0) {
            return this.f865c.u(i3, i4, i5, 320);
        }
        return this.d.u(i3, i4, i5, 320);
    }

    public View O0(t0 t0Var, z0 z0Var, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        H0();
        int v3 = v();
        if (z3) {
            i4 = v() - 1;
            i3 = -1;
            i5 = -1;
        } else {
            i3 = v3;
            i4 = 0;
            i5 = 1;
        }
        int b3 = z0Var.b();
        int k3 = this.f600r.k();
        int g3 = this.f600r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i4 != i3) {
            View u2 = u(i4);
            int H = n0.H(u2);
            int e3 = this.f600r.e(u2);
            int b4 = this.f600r.b(u2);
            if (H >= 0 && H < b3) {
                if (((o0) u2.getLayoutParams()).f877a.h()) {
                    if (view3 == null) {
                        view3 = u2;
                    }
                } else {
                    if (b4 <= k3 && e3 < k3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (e3 >= g3 && b4 > g3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z4 && !z5) {
                        return u2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    }
                }
            }
            i4 += i5;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int P0(int i3, t0 t0Var, z0 z0Var, boolean z2) {
        int g3;
        int g4 = this.f600r.g() - i3;
        if (g4 > 0) {
            int i4 = -Z0(-g4, t0Var, z0Var);
            int i5 = i3 + i4;
            if (z2 && (g3 = this.f600r.g() - i5) > 0) {
                this.f600r.o(g3);
                return g3 + i4;
            }
            return i4;
        }
        return 0;
    }

    public final int Q0(int i3, t0 t0Var, z0 z0Var, boolean z2) {
        int k3;
        int k4 = i3 - this.f600r.k();
        if (k4 > 0) {
            int i4 = -Z0(k4, t0Var, z0Var);
            int i5 = i3 + i4;
            if (z2 && (k3 = i5 - this.f600r.k()) > 0) {
                this.f600r.o(-k3);
                return i4 - k3;
            }
            return i4;
        }
        return 0;
    }

    public final View R0() {
        int v3;
        if (this.f603u) {
            v3 = 0;
        } else {
            v3 = v() - 1;
        }
        return u(v3);
    }

    public final View S0() {
        int i3;
        if (this.f603u) {
            i3 = v() - 1;
        } else {
            i3 = 0;
        }
        return u(i3);
    }

    @Override // b1.n0
    public View T(View view, int i3, t0 t0Var, z0 z0Var) {
        int G0;
        View M0;
        View R0;
        Y0();
        if (v() != 0 && (G0 = G0(i3)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.f600r.l() * 0.33333334f), false, z0Var);
            w wVar = this.f599q;
            wVar.f925g = Integer.MIN_VALUE;
            wVar.f920a = false;
            I0(t0Var, wVar, z0Var, true);
            boolean z2 = this.f603u;
            if (G0 == -1) {
                if (z2) {
                    M0 = M0(v() - 1, -1);
                } else {
                    M0 = M0(0, v());
                }
            } else if (z2) {
                M0 = M0(0, v());
            } else {
                M0 = M0(v() - 1, -1);
            }
            if (G0 == -1) {
                R0 = S0();
            } else {
                R0 = R0();
            }
            if (R0.hasFocusable()) {
                if (M0 != null) {
                    return R0;
                }
            } else {
                return M0;
            }
        }
        return null;
    }

    public final boolean T0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        int H;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            if (N0 == null) {
                H = -1;
            } else {
                H = n0.H(N0);
            }
            accessibilityEvent.setFromIndex(H);
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(t0 t0Var, z0 z0Var, w wVar, v vVar) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        View b3 = wVar.b(t0Var);
        if (b3 == null) {
            vVar.f917b = true;
            return;
        }
        o0 o0Var = (o0) b3.getLayoutParams();
        List list = wVar.f928k;
        boolean z4 = this.f603u;
        int i7 = wVar.f924f;
        if (list == null) {
            if (i7 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                b(b3, -1, false);
            } else {
                b(b3, 0, false);
            }
        } else {
            if (i7 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                b(b3, -1, true);
            } else {
                b(b3, 0, true);
            }
        }
        o0 o0Var2 = (o0) b3.getLayoutParams();
        Rect J = this.f864b.J(b3);
        int i8 = J.left + J.right;
        int i9 = J.top + J.bottom;
        int w3 = n0.w(d(), this.f874n, this.f872l, F() + E() + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) o0Var2).width);
        int w4 = n0.w(e(), this.f875o, this.f873m, D() + G() + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin + ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) o0Var2).height);
        if (v0(b3, w3, w4, o0Var2)) {
            b3.measure(w3, w4);
        }
        vVar.f916a = this.f600r.c(b3);
        if (this.f598p == 1) {
            if (T0()) {
                i6 = this.f874n - F();
                i4 = i6 - this.f600r.d(b3);
            } else {
                int E = E();
                i6 = this.f600r.d(b3) + E;
                i4 = E;
            }
            int i10 = wVar.f924f;
            i5 = wVar.f921b;
            int i11 = vVar.f916a;
            if (i10 == -1) {
                int i12 = i5 - i11;
                i3 = i5;
                i5 = i12;
            } else {
                i3 = i11 + i5;
            }
        } else {
            int G = G();
            int d = this.f600r.d(b3) + G;
            int i13 = wVar.f924f;
            int i14 = wVar.f921b;
            int i15 = vVar.f916a;
            if (i13 == -1) {
                int i16 = i14 - i15;
                i6 = i14;
                i5 = G;
                i3 = d;
                i4 = i16;
            } else {
                int i17 = i14 + i15;
                i3 = d;
                i4 = i14;
                i5 = G;
                i6 = i17;
            }
        }
        n0.N(b3, i4, i5, i6, i3);
        if (o0Var.f877a.h() || o0Var.f877a.k()) {
            vVar.f918c = true;
        }
        vVar.d = b3.hasFocusable();
    }

    public final void W0(t0 t0Var, w wVar) {
        if (wVar.f920a && !wVar.f929l) {
            int i3 = wVar.f925g;
            int i4 = wVar.f926i;
            if (wVar.f924f == -1) {
                int v3 = v();
                if (i3 >= 0) {
                    int f3 = (this.f600r.f() - i3) + i4;
                    if (this.f603u) {
                        for (int i5 = 0; i5 < v3; i5++) {
                            View u2 = u(i5);
                            if (this.f600r.e(u2) < f3 || this.f600r.n(u2) < f3) {
                                X0(t0Var, 0, i5);
                                return;
                            }
                        }
                        return;
                    }
                    int i6 = v3 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View u3 = u(i7);
                        if (this.f600r.e(u3) < f3 || this.f600r.n(u3) < f3) {
                            X0(t0Var, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i3 >= 0) {
                int i8 = i3 - i4;
                int v4 = v();
                if (this.f603u) {
                    int i9 = v4 - 1;
                    for (int i10 = i9; i10 >= 0; i10--) {
                        View u4 = u(i10);
                        if (this.f600r.b(u4) > i8 || this.f600r.m(u4) > i8) {
                            X0(t0Var, i9, i10);
                            return;
                        }
                    }
                    return;
                }
                for (int i11 = 0; i11 < v4; i11++) {
                    View u5 = u(i11);
                    if (this.f600r.b(u5) > i8 || this.f600r.m(u5) > i8) {
                        X0(t0Var, 0, i11);
                        return;
                    }
                }
            }
        }
    }

    public final void X0(t0 t0Var, int i3, int i4) {
        if (i3 != i4) {
            if (i4 > i3) {
                for (int i5 = i4 - 1; i5 >= i3; i5--) {
                    View u2 = u(i5);
                    k0(i5);
                    t0Var.g(u2);
                }
                return;
            }
            while (i3 > i4) {
                View u3 = u(i3);
                k0(i3);
                t0Var.g(u3);
                i3--;
            }
        }
    }

    public final void Y0() {
        if (this.f598p != 1 && T0()) {
            this.f603u = !this.f602t;
        } else {
            this.f603u = this.f602t;
        }
    }

    public final int Z0(int i3, t0 t0Var, z0 z0Var) {
        int i4;
        if (v() != 0 && i3 != 0) {
            H0();
            this.f599q.f920a = true;
            if (i3 > 0) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            int abs = Math.abs(i3);
            c1(i4, abs, true, z0Var);
            w wVar = this.f599q;
            int I0 = I0(t0Var, wVar, z0Var, false) + wVar.f925g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i3 = i4 * I0;
                }
                this.f600r.o(-i3);
                this.f599q.f927j = i3;
                return i3;
            }
        }
        return 0;
    }

    @Override // b1.y0
    public final PointF a(int i3) {
        if (v() == 0) {
            return null;
        }
        boolean z2 = false;
        int i4 = 1;
        if (i3 < n0.H(u(0))) {
            z2 = true;
        }
        if (z2 != this.f603u) {
            i4 = -1;
        }
        if (this.f598p == 0) {
            return new PointF(i4, 0.0f);
        }
        return new PointF(0.0f, i4);
    }

    public final void a1(int i3) {
        if (i3 != 0 && i3 != 1) {
            b.m(w0.d("invalid orientation:", i3));
            return;
        }
        c(null);
        if (i3 == this.f598p && this.f600r != null) {
            return;
        }
        f a3 = f.a(this, i3);
        this.f600r = a3;
        this.A.f912a = a3;
        this.f598p = i3;
        m0();
    }

    public void b1(boolean z2) {
        c(null);
        if (this.f604v == z2) {
            return;
        }
        this.f604v = z2;
        m0();
    }

    @Override // b1.n0
    public final void c(String str) {
        if (this.f608z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // b1.n0
    public void c0(t0 t0Var, z0 z0Var) {
        View view;
        int i3;
        View view2;
        View O0;
        boolean z2;
        boolean z3;
        int l3;
        int i4;
        boolean z4;
        boolean z5;
        int e3;
        int l4;
        int i5;
        boolean z6;
        int i6;
        int i7;
        ?? r4;
        List list;
        boolean z7;
        int i8;
        int i9;
        int P0;
        int i10;
        View q3;
        int e4;
        int i11;
        int i12;
        int i13 = -1;
        if ((this.f608z != null || this.f606x != -1) && z0Var.b() == 0) {
            h0(t0Var);
            return;
        }
        x xVar = this.f608z;
        if (xVar != null && (i12 = xVar.f930f) >= 0) {
            this.f606x = i12;
        }
        H0();
        boolean z8 = false;
        this.f599q.f920a = false;
        Y0();
        RecyclerView recyclerView = this.f864b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f863a.d).contains(view)) {
            view = null;
        }
        u uVar = this.A;
        if (uVar.f915e && this.f606x == -1 && this.f608z == null) {
            if (view != null && (this.f600r.e(view) >= this.f600r.g() || this.f600r.b(view) <= this.f600r.k())) {
                uVar.b(view, n0.H(view));
            }
        } else {
            uVar.c();
            uVar.d = this.f603u ^ this.f604v;
            if (!z0Var.f957g && (i4 = this.f606x) != -1) {
                if (i4 >= 0 && i4 < z0Var.b()) {
                    int i14 = this.f606x;
                    uVar.f913b = i14;
                    x xVar2 = this.f608z;
                    if (xVar2 != null && xVar2.f930f >= 0) {
                        boolean z9 = xVar2.h;
                        uVar.d = z9;
                        f fVar = this.f600r;
                        if (z9) {
                            uVar.f914c = fVar.g() - this.f608z.f931g;
                        } else {
                            uVar.f914c = fVar.k() + this.f608z.f931g;
                        }
                    } else if (this.f607y == Integer.MIN_VALUE) {
                        View q4 = q(i14);
                        if (q4 != null) {
                            if (this.f600r.c(q4) > this.f600r.l()) {
                                uVar.a();
                            } else {
                                int e5 = this.f600r.e(q4) - this.f600r.k();
                                f fVar2 = this.f600r;
                                if (e5 < 0) {
                                    uVar.f914c = fVar2.k();
                                    uVar.d = false;
                                } else if (fVar2.g() - this.f600r.b(q4) < 0) {
                                    uVar.f914c = this.f600r.g();
                                    uVar.d = true;
                                } else {
                                    boolean z10 = uVar.d;
                                    f fVar3 = this.f600r;
                                    if (z10) {
                                        int b3 = fVar3.b(q4);
                                        f fVar4 = this.f600r;
                                        if (Integer.MIN_VALUE == fVar4.f280a) {
                                            l4 = 0;
                                        } else {
                                            l4 = fVar4.l() - fVar4.f280a;
                                        }
                                        e3 = l4 + b3;
                                    } else {
                                        e3 = fVar3.e(q4);
                                    }
                                    uVar.f914c = e3;
                                }
                            }
                        } else {
                            if (v() > 0) {
                                if (this.f606x < n0.H(u(0))) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 == this.f603u) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uVar.d = z5;
                            }
                            uVar.a();
                        }
                    } else {
                        boolean z11 = this.f603u;
                        uVar.d = z11;
                        f fVar5 = this.f600r;
                        if (z11) {
                            uVar.f914c = fVar5.g() - this.f607y;
                        } else {
                            uVar.f914c = fVar5.k() + this.f607y;
                        }
                    }
                    uVar.f915e = true;
                } else {
                    this.f606x = -1;
                    this.f607y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f864b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f863a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    o0 o0Var = (o0) view2.getLayoutParams();
                    if (!o0Var.f877a.h() && o0Var.f877a.b() >= 0 && o0Var.f877a.b() < z0Var.b()) {
                        uVar.b(view2, n0.H(view2));
                        uVar.f915e = true;
                    }
                }
                boolean z12 = this.f601s;
                boolean z13 = this.f604v;
                if (z12 == z13 && (O0 = O0(t0Var, z0Var, uVar.d, z13)) != null) {
                    int H = n0.H(O0);
                    boolean z14 = uVar.d;
                    f fVar6 = uVar.f912a;
                    if (z14) {
                        int b4 = fVar6.b(O0);
                        f fVar7 = uVar.f912a;
                        if (Integer.MIN_VALUE == fVar7.f280a) {
                            l3 = 0;
                        } else {
                            l3 = fVar7.l() - fVar7.f280a;
                        }
                        uVar.f914c = l3 + b4;
                    } else {
                        uVar.f914c = fVar6.e(O0);
                    }
                    uVar.f913b = H;
                    if (!z0Var.f957g && A0()) {
                        int e6 = this.f600r.e(O0);
                        int b5 = this.f600r.b(O0);
                        int k3 = this.f600r.k();
                        int g3 = this.f600r.g();
                        if (b5 <= k3 && e6 < k3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (e6 >= g3 && b5 > g3) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 || z3) {
                            if (uVar.d) {
                                k3 = g3;
                            }
                            uVar.f914c = k3;
                        }
                    }
                    uVar.f915e = true;
                }
            }
            uVar.a();
            if (this.f604v) {
                i3 = z0Var.b() - 1;
            } else {
                i3 = 0;
            }
            uVar.f913b = i3;
            uVar.f915e = true;
        }
        w wVar = this.f599q;
        if (wVar.f927j >= 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        wVar.f924f = i5;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(z0Var, iArr);
        int k4 = this.f600r.k() + Math.max(0, iArr[0]);
        int h = this.f600r.h() + Math.max(0, iArr[1]);
        if (z0Var.f957g && (i10 = this.f606x) != -1 && this.f607y != Integer.MIN_VALUE && (q3 = q(i10)) != null) {
            boolean z15 = this.f603u;
            f fVar8 = this.f600r;
            if (z15) {
                i11 = fVar8.g() - this.f600r.b(q3);
                e4 = this.f607y;
            } else {
                e4 = fVar8.e(q3) - this.f600r.k();
                i11 = this.f607y;
            }
            int i15 = i11 - e4;
            if (i15 > 0) {
                k4 += i15;
            } else {
                h -= i15;
            }
        }
        boolean z16 = uVar.d;
        boolean z17 = this.f603u;
        if (!z16 ? !z17 : z17) {
            i13 = 1;
        }
        V0(t0Var, z0Var, uVar, i13);
        p(t0Var);
        w wVar2 = this.f599q;
        if (this.f600r.i() == 0 && this.f600r.f() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        wVar2.f929l = z6;
        this.f599q.getClass();
        this.f599q.f926i = 0;
        boolean z18 = uVar.d;
        int i16 = uVar.f913b;
        if (z18) {
            e1(i16, uVar.f914c);
            w wVar3 = this.f599q;
            wVar3.h = k4;
            I0(t0Var, wVar3, z0Var, false);
            w wVar4 = this.f599q;
            i7 = wVar4.f921b;
            int i17 = wVar4.d;
            int i18 = wVar4.f922c;
            if (i18 > 0) {
                h += i18;
            }
            d1(uVar.f913b, uVar.f914c);
            w wVar5 = this.f599q;
            wVar5.h = h;
            wVar5.d += wVar5.f923e;
            I0(t0Var, wVar5, z0Var, false);
            w wVar6 = this.f599q;
            i6 = wVar6.f921b;
            int i19 = wVar6.f922c;
            if (i19 > 0) {
                e1(i17, i7);
                w wVar7 = this.f599q;
                wVar7.h = i19;
                I0(t0Var, wVar7, z0Var, false);
                i7 = this.f599q.f921b;
            }
        } else {
            d1(i16, uVar.f914c);
            w wVar8 = this.f599q;
            wVar8.h = h;
            I0(t0Var, wVar8, z0Var, false);
            w wVar9 = this.f599q;
            i6 = wVar9.f921b;
            int i20 = wVar9.d;
            int i21 = wVar9.f922c;
            if (i21 > 0) {
                k4 += i21;
            }
            e1(uVar.f913b, uVar.f914c);
            w wVar10 = this.f599q;
            wVar10.h = k4;
            wVar10.d += wVar10.f923e;
            I0(t0Var, wVar10, z0Var, false);
            w wVar11 = this.f599q;
            int i22 = wVar11.f921b;
            int i23 = wVar11.f922c;
            if (i23 > 0) {
                d1(i20, i6);
                w wVar12 = this.f599q;
                wVar12.h = i23;
                I0(t0Var, wVar12, z0Var, false);
                i6 = this.f599q.f921b;
            }
            i7 = i22;
        }
        if (v() > 0) {
            if (this.f603u ^ this.f604v) {
                int P02 = P0(i6, t0Var, z0Var, true);
                i8 = i7 + P02;
                i9 = i6 + P02;
                P0 = Q0(i8, t0Var, z0Var, false);
            } else {
                int Q0 = Q0(i7, t0Var, z0Var, true);
                i8 = i7 + Q0;
                i9 = i6 + Q0;
                P0 = P0(i9, t0Var, z0Var, false);
            }
            i7 = i8 + P0;
            i6 = i9 + P0;
        }
        if (z0Var.f960k && v() != 0 && !z0Var.f957g && A0()) {
            List list2 = t0Var.d;
            int size = list2.size();
            int H2 = n0.H(u(0));
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i24 < size) {
                c1 c1Var = (c1) list2.get(i24);
                boolean h3 = c1Var.h();
                View view3 = c1Var.f729a;
                if (!h3) {
                    if (c1Var.b() < H2) {
                        z7 = true;
                    } else {
                        z7 = z8;
                    }
                    boolean z19 = this.f603u;
                    f fVar9 = this.f600r;
                    if (z7 != z19) {
                        i25 += fVar9.c(view3);
                    } else {
                        i26 += fVar9.c(view3);
                    }
                }
                i24++;
                z8 = false;
            }
            this.f599q.f928k = list2;
            if (i25 > 0) {
                e1(n0.H(S0()), i7);
                w wVar13 = this.f599q;
                wVar13.h = i25;
                r4 = 0;
                wVar13.f922c = 0;
                wVar13.a(null);
                I0(t0Var, this.f599q, z0Var, false);
            } else {
                r4 = 0;
            }
            if (i26 > 0) {
                d1(n0.H(R0()), i6);
                w wVar14 = this.f599q;
                wVar14.h = i26;
                wVar14.f922c = r4;
                list = null;
                wVar14.a(null);
                I0(t0Var, this.f599q, z0Var, r4);
            } else {
                list = null;
            }
            this.f599q.f928k = list;
        }
        if (!z0Var.f957g) {
            f fVar10 = this.f600r;
            fVar10.f280a = fVar10.l();
        } else {
            uVar.c();
        }
        this.f601s = this.f604v;
    }

    public final void c1(int i3, int i4, boolean z2, z0 z0Var) {
        boolean z3;
        int i5;
        int k3;
        w wVar = this.f599q;
        boolean z4 = false;
        int i6 = 1;
        if (this.f600r.i() == 0 && this.f600r.f() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        wVar.f929l = z3;
        this.f599q.f924f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i3 == 1) {
            z4 = true;
        }
        w wVar2 = this.f599q;
        if (z4) {
            i5 = max2;
        } else {
            i5 = max;
        }
        wVar2.h = i5;
        if (!z4) {
            max = max2;
        }
        wVar2.f926i = max;
        if (z4) {
            wVar2.h = this.f600r.h() + i5;
            View R0 = R0();
            w wVar3 = this.f599q;
            if (this.f603u) {
                i6 = -1;
            }
            wVar3.f923e = i6;
            int H = n0.H(R0);
            w wVar4 = this.f599q;
            wVar3.d = H + wVar4.f923e;
            wVar4.f921b = this.f600r.b(R0);
            k3 = this.f600r.b(R0) - this.f600r.g();
        } else {
            View S0 = S0();
            w wVar5 = this.f599q;
            wVar5.h = this.f600r.k() + wVar5.h;
            w wVar6 = this.f599q;
            if (!this.f603u) {
                i6 = -1;
            }
            wVar6.f923e = i6;
            int H2 = n0.H(S0);
            w wVar7 = this.f599q;
            wVar6.d = H2 + wVar7.f923e;
            wVar7.f921b = this.f600r.e(S0);
            k3 = (-this.f600r.e(S0)) + this.f600r.k();
        }
        w wVar8 = this.f599q;
        wVar8.f922c = i4;
        if (z2) {
            wVar8.f922c = i4 - k3;
        }
        wVar8.f925g = k3;
    }

    @Override // b1.n0
    public final boolean d() {
        if (this.f598p == 0) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public void d0(z0 z0Var) {
        this.f608z = null;
        this.f606x = -1;
        this.f607y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i3, int i4) {
        int i5;
        this.f599q.f922c = this.f600r.g() - i4;
        w wVar = this.f599q;
        if (this.f603u) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        wVar.f923e = i5;
        wVar.d = i3;
        wVar.f924f = 1;
        wVar.f921b = i4;
        wVar.f925g = Integer.MIN_VALUE;
    }

    @Override // b1.n0
    public final boolean e() {
        if (this.f598p == 1) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof x) {
            x xVar = (x) parcelable;
            this.f608z = xVar;
            if (this.f606x != -1) {
                xVar.f930f = -1;
            }
            m0();
        }
    }

    public final void e1(int i3, int i4) {
        int i5;
        this.f599q.f922c = i4 - this.f600r.k();
        w wVar = this.f599q;
        wVar.d = i3;
        if (this.f603u) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        wVar.f923e = i5;
        wVar.f924f = -1;
        wVar.f921b = i4;
        wVar.f925g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, b1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, b1.x, java.lang.Object] */
    @Override // b1.n0
    public final Parcelable f0() {
        x xVar = this.f608z;
        if (xVar != null) {
            ?? obj = new Object();
            obj.f930f = xVar.f930f;
            obj.f931g = xVar.f931g;
            obj.h = xVar.h;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            H0();
            boolean z2 = this.f601s ^ this.f603u;
            obj2.h = z2;
            if (z2) {
                View R0 = R0();
                obj2.f931g = this.f600r.g() - this.f600r.b(R0);
                obj2.f930f = n0.H(R0);
                return obj2;
            }
            View S0 = S0();
            obj2.f930f = n0.H(S0);
            obj2.f931g = this.f600r.e(S0) - this.f600r.k();
            return obj2;
        }
        obj2.f930f = -1;
        return obj2;
    }

    @Override // b1.n0
    public final void h(int i3, int i4, z0 z0Var, p pVar) {
        int i5;
        if (this.f598p != 0) {
            i3 = i4;
        }
        if (v() != 0 && i3 != 0) {
            H0();
            if (i3 > 0) {
                i5 = 1;
            } else {
                i5 = -1;
            }
            c1(i5, Math.abs(i3), true, z0Var);
            C0(z0Var, this.f599q, pVar);
        }
    }

    @Override // b1.n0
    public final void i(int i3, p pVar) {
        boolean z2;
        int i4;
        x xVar = this.f608z;
        int i5 = -1;
        if (xVar != null && (i4 = xVar.f930f) >= 0) {
            z2 = xVar.h;
        } else {
            Y0();
            z2 = this.f603u;
            i4 = this.f606x;
            if (i4 == -1) {
                i4 = z2 ? i3 - 1 : 0;
            }
        }
        if (!z2) {
            i5 = 1;
        }
        for (int i6 = 0; i6 < this.C && i4 >= 0 && i4 < i3; i6++) {
            pVar.a(i4, 0);
            i4 += i5;
        }
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // b1.n0
    public int k(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // b1.n0
    public int l(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // b1.n0
    public int n(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // b1.n0
    public int n0(int i3, t0 t0Var, z0 z0Var) {
        if (this.f598p == 1) {
            return 0;
        }
        return Z0(i3, t0Var, z0Var);
    }

    @Override // b1.n0
    public int o(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // b1.n0
    public final void o0(int i3) {
        this.f606x = i3;
        this.f607y = Integer.MIN_VALUE;
        x xVar = this.f608z;
        if (xVar != null) {
            xVar.f930f = -1;
        }
        m0();
    }

    @Override // b1.n0
    public int p0(int i3, t0 t0Var, z0 z0Var) {
        if (this.f598p == 0) {
            return 0;
        }
        return Z0(i3, t0Var, z0Var);
    }

    @Override // b1.n0
    public final View q(int i3) {
        int v3 = v();
        if (v3 == 0) {
            return null;
        }
        int H = i3 - n0.H(u(0));
        if (H >= 0 && H < v3) {
            View u2 = u(H);
            if (n0.H(u2) == i3) {
                return u2;
            }
        }
        return super.q(i3);
    }

    @Override // b1.n0
    public o0 r() {
        return new o0(-2, -2);
    }

    @Override // b1.n0
    public final boolean w0() {
        if (this.f873m != 1073741824 && this.f872l != 1073741824) {
            int v3 = v();
            for (int i3 = 0; i3 < v3; i3++) {
                ViewGroup.LayoutParams layoutParams = u(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b1.n0
    public void y0(RecyclerView recyclerView, int i3) {
        b1.y yVar = new b1.y(recyclerView.getContext());
        yVar.f938a = i3;
        z0(yVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, b1.v] */
    public LinearLayoutManager(int i3) {
        this.f598p = 1;
        this.f602t = false;
        this.f603u = false;
        this.f604v = false;
        this.f605w = true;
        this.f606x = -1;
        this.f607y = Integer.MIN_VALUE;
        this.f608z = null;
        this.A = new u();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        a1(i3);
        c(null);
        if (this.f602t) {
            this.f602t = false;
            m0();
        }
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
    }

    public void V0(t0 t0Var, z0 z0Var, u uVar, int i3) {
    }
}
