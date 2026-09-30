package androidx.recyclerview.widget;

import a.b;
import a.y;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.p;
import androidx.fragment.app.g;
import b1.g1;
import b1.h1;
import b1.j1;
import b1.k1;
import b1.m0;
import b1.n0;
import b1.o0;
import b1.t;
import b1.t0;
import b1.y0;
import b1.z0;
import j0.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends n0 implements y0 {
    public final p B;
    public final int C;
    public boolean D;
    public boolean E;
    public j1 F;
    public final Rect G;
    public final g1 H;
    public final boolean I;
    public int[] J;
    public final g K;

    /* renamed from: p, reason: collision with root package name */
    public final int f653p;

    /* renamed from: q, reason: collision with root package name */
    public final k1[] f654q;

    /* renamed from: r, reason: collision with root package name */
    public final f f655r;

    /* renamed from: s, reason: collision with root package name */
    public final f f656s;

    /* renamed from: t, reason: collision with root package name */
    public final int f657t;

    /* renamed from: u, reason: collision with root package name */
    public int f658u;

    /* renamed from: v, reason: collision with root package name */
    public final t f659v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f660w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f662y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f661x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f663z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [b1.t, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f653p = -1;
        this.f660w = false;
        p pVar = new p(6, false);
        this.B = pVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new g1(this);
        this.I = true;
        this.K = new g(5, this);
        m0 I = n0.I(context, attributeSet, i3, i4);
        int i5 = I.f833a;
        if (i5 != 0 && i5 != 1) {
            b.m("invalid orientation.");
            throw null;
        }
        c(null);
        if (i5 != this.f657t) {
            this.f657t = i5;
            f fVar = this.f655r;
            this.f655r = this.f656s;
            this.f656s = fVar;
            m0();
        }
        int i6 = I.f834b;
        c(null);
        if (i6 != this.f653p) {
            pVar.b();
            m0();
            this.f653p = i6;
            this.f662y = new BitSet(this.f653p);
            this.f654q = new k1[this.f653p];
            for (int i7 = 0; i7 < this.f653p; i7++) {
                this.f654q[i7] = new k1(this, i7);
            }
            m0();
        }
        boolean z2 = I.f835c;
        c(null);
        j1 j1Var = this.F;
        if (j1Var != null && j1Var.f813m != z2) {
            j1Var.f813m = z2;
        }
        this.f660w = z2;
        m0();
        ?? obj = new Object();
        obj.f899a = true;
        obj.f903f = 0;
        obj.f904g = 0;
        this.f659v = obj;
        this.f655r = f.a(this, this.f657t);
        this.f656s = f.a(this, 1 - this.f657t);
    }

    public static int b1(int i3, int i4, int i5) {
        int mode;
        if ((i4 == 0 && i5 == 0) || ((mode = View.MeasureSpec.getMode(i3)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i3;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i4) - i5), mode);
    }

    @Override // b1.n0
    public final boolean A0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.f868g) {
            if (this.f661x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.b();
                this.f867f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return y.s(z0Var, this.f655r, F0(z2), E0(z2), this, this.I, this.f661x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0260, code lost:
    
        T0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D0(b1.t0 r20, b1.t r21, b1.z0 r22) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D0(b1.t0, b1.t, b1.z0):int");
    }

    public final View E0(boolean z2) {
        int k3 = this.f655r.k();
        int g3 = this.f655r.g();
        View view = null;
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u2 = u(v3);
            int e3 = this.f655r.e(u2);
            int b3 = this.f655r.b(u2);
            if (b3 > k3 && e3 < g3) {
                if (b3 > g3 && z2) {
                    if (view == null) {
                        view = u2;
                    }
                } else {
                    return u2;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z2) {
        int k3 = this.f655r.k();
        int g3 = this.f655r.g();
        int v3 = v();
        View view = null;
        for (int i3 = 0; i3 < v3; i3++) {
            View u2 = u(i3);
            int e3 = this.f655r.e(u2);
            if (this.f655r.b(u2) > k3 && e3 < g3) {
                if (e3 < k3 && z2) {
                    if (view == null) {
                        view = u2;
                    }
                } else {
                    return u2;
                }
            }
        }
        return view;
    }

    public final void G0(t0 t0Var, z0 z0Var, boolean z2) {
        int g3;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g3 = this.f655r.g() - K0) > 0) {
            int i3 = g3 - (-X0(-g3, t0Var, z0Var));
            if (z2 && i3 > 0) {
                this.f655r.o(i3);
            }
        }
    }

    public final void H0(t0 t0Var, z0 z0Var, boolean z2) {
        int k3;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k3 = L0 - this.f655r.k()) > 0) {
            int X0 = k3 - X0(k3, t0Var, z0Var);
            if (z2 && X0 > 0) {
                this.f655r.o(-X0);
            }
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return n0.H(u(0));
    }

    public final int J0() {
        int v3 = v();
        if (v3 == 0) {
            return 0;
        }
        return n0.H(u(v3 - 1));
    }

    public final int K0(int i3) {
        int g3 = this.f654q[0].g(i3);
        for (int i4 = 1; i4 < this.f653p; i4++) {
            int g4 = this.f654q[i4].g(i3);
            if (g4 > g3) {
                g3 = g4;
            }
        }
        return g3;
    }

    @Override // b1.n0
    public final boolean L() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int L0(int i3) {
        int i4 = this.f654q[0].i(i3);
        for (int i5 = 1; i5 < this.f653p; i5++) {
            int i6 = this.f654q[i5].i(i3);
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N0() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    @Override // b1.n0
    public final void O(int i3) {
        super.O(i3);
        for (int i4 = 0; i4 < this.f653p; i4++) {
            k1 k1Var = this.f654q[i4];
            int i5 = k1Var.f818b;
            if (i5 != Integer.MIN_VALUE) {
                k1Var.f818b = i5 + i3;
            }
            int i6 = k1Var.f819c;
            if (i6 != Integer.MIN_VALUE) {
                k1Var.f819c = i6 + i3;
            }
        }
    }

    public final boolean O0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public final void P(int i3) {
        super.P(i3);
        for (int i4 = 0; i4 < this.f653p; i4++) {
            k1 k1Var = this.f654q[i4];
            int i5 = k1Var.f818b;
            if (i5 != Integer.MIN_VALUE) {
                k1Var.f818b = i5 + i3;
            }
            int i6 = k1Var.f819c;
            if (i6 != Integer.MIN_VALUE) {
                k1Var.f819c = i6 + i3;
            }
        }
    }

    public final void P0(View view, int i3, int i4) {
        RecyclerView recyclerView = this.f864b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        h1 h1Var = (h1) view.getLayoutParams();
        int b12 = b1(i3, ((ViewGroup.MarginLayoutParams) h1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) h1Var).rightMargin + rect.right);
        int b13 = b1(i4, ((ViewGroup.MarginLayoutParams) h1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) h1Var).bottomMargin + rect.bottom);
        if (v0(view, b12, b13, h1Var)) {
            view.measure(b12, b13);
        }
    }

    @Override // b1.n0
    public final void Q() {
        this.B.b();
        for (int i3 = 0; i3 < this.f653p; i3++) {
            this.f654q[i3].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a4, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
    
        if (r11 != r16.f661x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x040a, code lost:
    
        if (B0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0192, code lost:
    
        if (r16.f661x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(b1.t0 r17, b1.z0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(b1.t0, b1.z0, boolean):void");
    }

    public final boolean R0(int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f657t == 0) {
            if (i3 == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 == this.f661x) {
                return false;
            }
            return true;
        }
        if (i3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == this.f661x) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != O0()) {
            return false;
        }
        return true;
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f864b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i3 = 0; i3 < this.f653p; i3++) {
            this.f654q[i3].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i3, z0 z0Var) {
        int I0;
        int i4;
        if (i3 > 0) {
            I0 = J0();
            i4 = 1;
        } else {
            I0 = I0();
            i4 = -1;
        }
        t tVar = this.f659v;
        tVar.f899a = true;
        Z0(I0, z0Var);
        Y0(i4);
        tVar.f901c = I0 + tVar.d;
        tVar.f900b = Math.abs(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0051, code lost:
    
        if (r8.f657t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0057, code lost:
    
        if (r8.f657t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0063, code lost:
    
        if (O0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x006f, code lost:
    
        if (O0() == false) goto L37;
     */
    @Override // b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r9, int r10, b1.t0 r11, b1.z0 r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, b1.t0, b1.z0):android.view.View");
    }

    public final void T0(t0 t0Var, t tVar) {
        if (tVar.f899a && !tVar.f905i) {
            int i3 = tVar.f900b;
            int i4 = tVar.f902e;
            if (i3 == 0) {
                if (i4 == -1) {
                    U0(t0Var, tVar.f904g);
                    return;
                } else {
                    V0(t0Var, tVar.f903f);
                    return;
                }
            }
            int i5 = 1;
            if (i4 == -1) {
                int i6 = tVar.f903f;
                int i7 = this.f654q[0].i(i6);
                while (i5 < this.f653p) {
                    int i8 = this.f654q[i5].i(i6);
                    if (i8 > i7) {
                        i7 = i8;
                    }
                    i5++;
                }
                int i9 = i6 - i7;
                int i10 = tVar.f904g;
                if (i9 >= 0) {
                    i10 -= Math.min(i9, tVar.f900b);
                }
                U0(t0Var, i10);
                return;
            }
            int i11 = tVar.f904g;
            int g3 = this.f654q[0].g(i11);
            while (i5 < this.f653p) {
                int g4 = this.f654q[i5].g(i11);
                if (g4 < g3) {
                    g3 = g4;
                }
                i5++;
            }
            int i12 = g3 - tVar.f904g;
            int i13 = tVar.f903f;
            if (i12 >= 0) {
                i13 += Math.min(i12, tVar.f900b);
            }
            V0(t0Var, i13);
        }
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 != null && E0 != null) {
                int H = n0.H(F0);
                int H2 = n0.H(E0);
                if (H < H2) {
                    accessibilityEvent.setFromIndex(H);
                    accessibilityEvent.setToIndex(H2);
                } else {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H);
                }
            }
        }
    }

    public final void U0(t0 t0Var, int i3) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u2 = u(v3);
            if (this.f655r.e(u2) >= i3 && this.f655r.n(u2) >= i3) {
                h1 h1Var = (h1) u2.getLayoutParams();
                h1Var.getClass();
                if (((ArrayList) h1Var.f780e.f821f).size() != 1) {
                    k1 k1Var = h1Var.f780e;
                    ArrayList arrayList = (ArrayList) k1Var.f821f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    h1 h1Var2 = (h1) view.getLayoutParams();
                    h1Var2.f780e = null;
                    if (h1Var2.f877a.h() || h1Var2.f877a.k()) {
                        k1Var.d -= ((StaggeredGridLayoutManager) k1Var.f822g).f655r.c(view);
                    }
                    if (size == 1) {
                        k1Var.f818b = Integer.MIN_VALUE;
                    }
                    k1Var.f819c = Integer.MIN_VALUE;
                    j0(u2, t0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void V0(t0 t0Var, int i3) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f655r.b(u2) <= i3 && this.f655r.m(u2) <= i3) {
                h1 h1Var = (h1) u2.getLayoutParams();
                h1Var.getClass();
                if (((ArrayList) h1Var.f780e.f821f).size() != 1) {
                    k1 k1Var = h1Var.f780e;
                    ArrayList arrayList = (ArrayList) k1Var.f821f;
                    View view = (View) arrayList.remove(0);
                    h1 h1Var2 = (h1) view.getLayoutParams();
                    h1Var2.f780e = null;
                    if (arrayList.size() == 0) {
                        k1Var.f819c = Integer.MIN_VALUE;
                    }
                    if (h1Var2.f877a.h() || h1Var2.f877a.k()) {
                        k1Var.d -= ((StaggeredGridLayoutManager) k1Var.f822g).f655r.c(view);
                    }
                    k1Var.f818b = Integer.MIN_VALUE;
                    j0(u2, t0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W0() {
        if (this.f657t != 1 && O0()) {
            this.f661x = !this.f660w;
        } else {
            this.f661x = this.f660w;
        }
    }

    @Override // b1.n0
    public final void X(int i3, int i4) {
        M0(i3, i4, 1);
    }

    public final int X0(int i3, t0 t0Var, z0 z0Var) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        S0(i3, z0Var);
        t tVar = this.f659v;
        int D0 = D0(t0Var, tVar, z0Var);
        if (tVar.f900b >= D0) {
            if (i3 < 0) {
                i3 = -D0;
            } else {
                i3 = D0;
            }
        }
        this.f655r.o(-i3);
        this.D = this.f661x;
        tVar.f900b = 0;
        T0(t0Var, tVar);
        return i3;
    }

    @Override // b1.n0
    public final void Y() {
        this.B.b();
        m0();
    }

    public final void Y0(int i3) {
        boolean z2;
        t tVar = this.f659v;
        tVar.f902e = i3;
        boolean z3 = this.f661x;
        int i4 = 1;
        if (i3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 != z2) {
            i4 = -1;
        }
        tVar.d = i4;
    }

    @Override // b1.n0
    public final void Z(int i3, int i4) {
        M0(i3, i4, 8);
    }

    public final void Z0(int i3, z0 z0Var) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        t tVar = this.f659v;
        boolean z3 = false;
        tVar.f900b = 0;
        tVar.f901c = i3;
        b1.y yVar = this.f866e;
        if (yVar != null && yVar.f941e && (i6 = z0Var.f952a) != -1) {
            boolean z4 = this.f661x;
            if (i6 < i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            f fVar = this.f655r;
            if (z4 == z2) {
                i4 = fVar.l();
                i5 = 0;
            } else {
                i5 = fVar.l();
                i4 = 0;
            }
        } else {
            i4 = 0;
            i5 = 0;
        }
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null && recyclerView.f623l) {
            tVar.f903f = this.f655r.k() - i5;
            tVar.f904g = this.f655r.g() + i4;
        } else {
            tVar.f904g = this.f655r.f() + i4;
            tVar.f903f = -i5;
        }
        tVar.h = false;
        tVar.f899a = true;
        if (this.f655r.i() == 0 && this.f655r.f() == 0) {
            z3 = true;
        }
        tVar.f905i = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.f661x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f661x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // b1.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f661x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.I0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f661x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f657t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // b1.n0
    public final void a0(int i3, int i4) {
        M0(i3, i4, 2);
    }

    public final void a1(k1 k1Var, int i3, int i4) {
        int i5 = k1Var.d;
        int i6 = k1Var.f820e;
        if (i3 == -1) {
            int i7 = k1Var.f818b;
            if (i7 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) k1Var.f821f).get(0);
                h1 h1Var = (h1) view.getLayoutParams();
                k1Var.f818b = ((StaggeredGridLayoutManager) k1Var.f822g).f655r.e(view);
                h1Var.getClass();
                i7 = k1Var.f818b;
            }
            if (i7 + i5 <= i4) {
                this.f662y.set(i6, false);
                return;
            }
            return;
        }
        int i8 = k1Var.f819c;
        if (i8 == Integer.MIN_VALUE) {
            k1Var.a();
            i8 = k1Var.f819c;
        }
        if (i8 - i5 >= i4) {
            this.f662y.set(i6, false);
        }
    }

    @Override // b1.n0
    public final void b0(int i3, int i4) {
        M0(i3, i4, 4);
    }

    @Override // b1.n0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        Q0(t0Var, z0Var, true);
    }

    @Override // b1.n0
    public final boolean d() {
        if (this.f657t == 0) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public final void d0(z0 z0Var) {
        this.f663z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // b1.n0
    public final boolean e() {
        if (this.f657t == 1) {
            return true;
        }
        return false;
    }

    @Override // b1.n0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof j1) {
            j1 j1Var = (j1) parcelable;
            this.F = j1Var;
            if (this.f663z != -1) {
                j1Var.f807f = -1;
                j1Var.f808g = -1;
                j1Var.f809i = null;
                j1Var.h = 0;
                j1Var.f810j = 0;
                j1Var.f811k = null;
                j1Var.f812l = null;
            }
            m0();
        }
    }

    @Override // b1.n0
    public final boolean f(o0 o0Var) {
        return o0Var instanceof h1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, b1.j1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Parcelable, java.lang.Object, b1.j1] */
    @Override // b1.n0
    public final Parcelable f0() {
        int I0;
        View F0;
        int i3;
        int k3;
        int[] iArr;
        j1 j1Var = this.F;
        if (j1Var != null) {
            ?? obj = new Object();
            obj.h = j1Var.h;
            obj.f807f = j1Var.f807f;
            obj.f808g = j1Var.f808g;
            obj.f809i = j1Var.f809i;
            obj.f810j = j1Var.f810j;
            obj.f811k = j1Var.f811k;
            obj.f813m = j1Var.f813m;
            obj.f814n = j1Var.f814n;
            obj.f815o = j1Var.f815o;
            obj.f812l = j1Var.f812l;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f813m = this.f660w;
        obj2.f814n = this.D;
        obj2.f815o = this.E;
        p pVar = this.B;
        if (pVar != null && (iArr = (int[]) pVar.f301g) != null) {
            obj2.f811k = iArr;
            obj2.f810j = iArr.length;
            obj2.f812l = (ArrayList) pVar.h;
        } else {
            obj2.f810j = 0;
        }
        int i4 = -1;
        if (v() > 0) {
            if (this.D) {
                I0 = J0();
            } else {
                I0 = I0();
            }
            obj2.f807f = I0;
            if (this.f661x) {
                F0 = E0(true);
            } else {
                F0 = F0(true);
            }
            if (F0 != null) {
                i4 = n0.H(F0);
            }
            obj2.f808g = i4;
            int i5 = this.f653p;
            obj2.h = i5;
            obj2.f809i = new int[i5];
            for (int i6 = 0; i6 < this.f653p; i6++) {
                boolean z2 = this.D;
                k1[] k1VarArr = this.f654q;
                if (z2) {
                    i3 = k1VarArr[i6].g(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        k3 = this.f655r.g();
                        i3 -= k3;
                        obj2.f809i[i6] = i3;
                    } else {
                        obj2.f809i[i6] = i3;
                    }
                } else {
                    i3 = k1VarArr[i6].i(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        k3 = this.f655r.k();
                        i3 -= k3;
                        obj2.f809i[i6] = i3;
                    } else {
                        obj2.f809i[i6] = i3;
                    }
                }
            }
            return obj2;
        }
        obj2.f807f = -1;
        obj2.f808g = -1;
        obj2.h = 0;
        return obj2;
    }

    @Override // b1.n0
    public final void g0(int i3) {
        if (i3 == 0) {
            B0();
        }
    }

    @Override // b1.n0
    public final void h(int i3, int i4, z0 z0Var, b1.p pVar) {
        t tVar;
        int g3;
        int i5;
        if (this.f657t != 0) {
            i3 = i4;
        }
        if (v() != 0 && i3 != 0) {
            S0(i3, z0Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f653p) {
                this.J = new int[this.f653p];
            }
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.f653p;
                tVar = this.f659v;
                if (i6 >= i8) {
                    break;
                }
                if (tVar.d == -1) {
                    g3 = tVar.f903f;
                    i5 = this.f654q[i6].i(g3);
                } else {
                    g3 = this.f654q[i6].g(tVar.f904g);
                    i5 = tVar.f904g;
                }
                int i9 = g3 - i5;
                if (i9 >= 0) {
                    this.J[i7] = i9;
                    i7++;
                }
                i6++;
            }
            Arrays.sort(this.J, 0, i7);
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = tVar.f901c;
                if (i11 >= 0 && i11 < z0Var.b()) {
                    pVar.a(tVar.f901c, this.J[i10]);
                    tVar.f901c += tVar.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return y.r(z0Var, this.f655r, F0(z2), E0(z2), this, this.I);
    }

    @Override // b1.n0
    public final int k(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // b1.n0
    public final int l(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return y.t(z0Var, this.f655r, F0(z2), E0(z2), this, this.I);
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return y.r(z0Var, this.f655r, F0(z2), E0(z2), this, this.I);
    }

    @Override // b1.n0
    public final int n(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // b1.n0
    public final int n0(int i3, t0 t0Var, z0 z0Var) {
        return X0(i3, t0Var, z0Var);
    }

    @Override // b1.n0
    public final int o(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return y.t(z0Var, this.f655r, F0(z2), E0(z2), this, this.I);
    }

    @Override // b1.n0
    public final void o0(int i3) {
        j1 j1Var = this.F;
        if (j1Var != null && j1Var.f807f != i3) {
            j1Var.f809i = null;
            j1Var.h = 0;
            j1Var.f807f = -1;
            j1Var.f808g = -1;
        }
        this.f663z = i3;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // b1.n0
    public final int p0(int i3, t0 t0Var, z0 z0Var) {
        return X0(i3, t0Var, z0Var);
    }

    @Override // b1.n0
    public final o0 r() {
        if (this.f657t == 0) {
            return new o0(-2, -1);
        }
        return new o0(-1, -2);
    }

    @Override // b1.n0
    public final o0 s(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    @Override // b1.n0
    public final void s0(Rect rect, int i3, int i4) {
        int g3;
        int g4;
        int F = F() + E();
        int D = D() + G();
        int i5 = this.f657t;
        int i6 = this.f653p;
        if (i5 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f864b;
            WeakHashMap weakHashMap = j0.f2160a;
            g4 = n0.g(i4, height, recyclerView.getMinimumHeight());
            g3 = n0.g(i3, (this.f658u * i6) + F, this.f864b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f864b;
            WeakHashMap weakHashMap2 = j0.f2160a;
            g3 = n0.g(i3, width, recyclerView2.getMinimumWidth());
            g4 = n0.g(i4, (this.f658u * i6) + D, this.f864b.getMinimumHeight());
        }
        this.f864b.setMeasuredDimension(g3, g4);
    }

    @Override // b1.n0
    public final o0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new o0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new o0(layoutParams);
    }

    @Override // b1.n0
    public final void y0(RecyclerView recyclerView, int i3) {
        b1.y yVar = new b1.y(recyclerView.getContext());
        yVar.f938a = i3;
        z0(yVar);
    }
}
