package androidx.recyclerview.widget;

import a.b;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.p;
import androidx.fragment.app.w0;
import b1.n0;
import b1.o0;
import b1.s;
import b1.t0;
import b1.u;
import b1.w;
import b1.z0;
import j0.j0;
import java.util.WeakHashMap;
import k0.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final p K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new p(5);
        this.L = new Rect();
        m1(n0.I(context, attributeSet, i3, i4).f834b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final boolean A0() {
        if (this.f608z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(z0 z0Var, w wVar, b1.p pVar) {
        int i3;
        int i4 = this.F;
        for (int i5 = 0; i5 < this.F && (i3 = wVar.d) >= 0 && i3 < z0Var.b() && i4 > 0; i5++) {
            pVar.a(wVar.d, Math.max(0, wVar.f925g));
            this.K.getClass();
            i4--;
            wVar.d += wVar.f923e;
        }
    }

    @Override // b1.n0
    public final int J(t0 t0Var, z0 z0Var) {
        if (this.f598p == 0) {
            return this.F;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return i1(z0Var.b() - 1, t0Var, z0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(t0 t0Var, z0 z0Var, boolean z2, boolean z3) {
        int i3;
        int i4;
        int v3 = v();
        int i5 = 1;
        if (z3) {
            i4 = v() - 1;
            i3 = -1;
            i5 = -1;
        } else {
            i3 = v3;
            i4 = 0;
        }
        int b3 = z0Var.b();
        H0();
        int k3 = this.f600r.k();
        int g3 = this.f600r.g();
        View view = null;
        View view2 = null;
        while (i4 != i3) {
            View u2 = u(i4);
            int H = n0.H(u2);
            if (H >= 0 && H < b3 && j1(H, t0Var, z0Var) == 0) {
                if (((o0) u2.getLayoutParams()).f877a.h()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f600r.e(u2) < g3 && this.f600r.b(u2) >= k3) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i4 += i5;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f863a.d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, b1.t0 r25, b1.z0 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, b1.t0, b1.z0):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f917b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(b1.t0 r19, b1.z0 r20, b1.w r21, b1.v r22) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U0(b1.t0, b1.z0, b1.w, b1.v):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(t0 t0Var, z0 z0Var, u uVar, int i3) {
        boolean z2;
        n1();
        if (z0Var.b() > 0 && !z0Var.f957g) {
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int j12 = j1(uVar.f913b, t0Var, z0Var);
            if (z2) {
                while (j12 > 0) {
                    int i4 = uVar.f913b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    uVar.f913b = i5;
                    j12 = j1(i5, t0Var, z0Var);
                }
            } else {
                int b3 = z0Var.b() - 1;
                int i6 = uVar.f913b;
                while (i6 < b3) {
                    int i7 = i6 + 1;
                    int j13 = j1(i7, t0Var, z0Var);
                    if (j13 <= j12) {
                        break;
                    }
                    i6 = i7;
                    j12 = j13;
                }
                uVar.f913b = i6;
            }
        }
        g1();
    }

    @Override // b1.n0
    public final void W(t0 t0Var, z0 z0Var, View view, d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            V(view, dVar);
            return;
        }
        s sVar = (s) layoutParams;
        int i12 = i1(sVar.f877a.b(), t0Var, z0Var);
        int i3 = this.f598p;
        int i4 = sVar.f895e;
        int i5 = sVar.f896f;
        if (i3 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, i4, i5, false, false));
        }
    }

    @Override // b1.n0
    public final void X(int i3, int i4) {
        p pVar = this.K;
        pVar.w();
        ((SparseIntArray) pVar.h).clear();
    }

    @Override // b1.n0
    public final void Y() {
        p pVar = this.K;
        pVar.w();
        ((SparseIntArray) pVar.h).clear();
    }

    @Override // b1.n0
    public final void Z(int i3, int i4) {
        p pVar = this.K;
        pVar.w();
        ((SparseIntArray) pVar.h).clear();
    }

    @Override // b1.n0
    public final void a0(int i3, int i4) {
        p pVar = this.K;
        pVar.w();
        ((SparseIntArray) pVar.h).clear();
    }

    @Override // b1.n0
    public final void b0(int i3, int i4) {
        p pVar = this.K;
        pVar.w();
        ((SparseIntArray) pVar.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z2) {
        if (!z2) {
            super.b1(false);
        } else {
            b.n("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        boolean z2 = z0Var.f957g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z2) {
            int v3 = v();
            for (int i3 = 0; i3 < v3; i3++) {
                s sVar = (s) u(i3).getLayoutParams();
                int b3 = sVar.f877a.b();
                sparseIntArray2.put(b3, sVar.f896f);
                sparseIntArray.put(b3, sVar.f895e);
            }
        }
        super.c0(t0Var, z0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void d0(z0 z0Var) {
        super.d0(z0Var);
        this.E = false;
    }

    @Override // b1.n0
    public final boolean f(o0 o0Var) {
        return o0Var instanceof s;
    }

    public final void f1(int i3) {
        int i4;
        int[] iArr = this.G;
        int i5 = this.F;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i5 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i3 / i5;
        int i8 = i3 % i5;
        int i9 = 0;
        for (int i10 = 1; i10 <= i5; i10++) {
            i6 += i8;
            if (i6 > 0 && i5 - i6 < i8) {
                i4 = i7 + 1;
                i6 -= i5;
            } else {
                i4 = i7;
            }
            i9 += i4;
            iArr[i10] = i9;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr != null && viewArr.length == this.F) {
            return;
        }
        this.H = new View[this.F];
    }

    public final int h1(int i3, int i4) {
        if (this.f598p == 1 && T0()) {
            int[] iArr = this.G;
            int i5 = this.F;
            return iArr[i5 - i3] - iArr[(i5 - i3) - i4];
        }
        int[] iArr2 = this.G;
        return iArr2[i4 + i3] - iArr2[i3];
    }

    public final int i1(int i3, t0 t0Var, z0 z0Var) {
        boolean z2 = z0Var.f957g;
        p pVar = this.K;
        if (!z2) {
            int i4 = this.F;
            pVar.getClass();
            return p.v(i3, i4);
        }
        int b3 = t0Var.b(i3);
        if (b3 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
            return 0;
        }
        int i5 = this.F;
        pVar.getClass();
        return p.v(b3, i5);
    }

    public final int j1(int i3, t0 t0Var, z0 z0Var) {
        boolean z2 = z0Var.f957g;
        p pVar = this.K;
        if (!z2) {
            int i4 = this.F;
            pVar.getClass();
            return i3 % i4;
        }
        int i5 = this.J.get(i3, -1);
        if (i5 != -1) {
            return i5;
        }
        int b3 = t0Var.b(i3);
        if (b3 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
            return 0;
        }
        int i6 = this.F;
        pVar.getClass();
        return b3 % i6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int k(z0 z0Var) {
        return E0(z0Var);
    }

    public final int k1(int i3, t0 t0Var, z0 z0Var) {
        boolean z2 = z0Var.f957g;
        p pVar = this.K;
        if (!z2) {
            pVar.getClass();
            return 1;
        }
        int i4 = this.I.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        if (t0Var.b(i3) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
            return 1;
        }
        pVar.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int l(z0 z0Var) {
        return F0(z0Var);
    }

    public final void l1(View view, int i3, boolean z2) {
        int i4;
        int i5;
        boolean v02;
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.f878b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
        int h12 = h1(sVar.f895e, sVar.f896f);
        if (this.f598p == 1) {
            i5 = n0.w(false, h12, i3, i7, ((ViewGroup.MarginLayoutParams) sVar).width);
            i4 = n0.w(true, this.f600r.l(), this.f873m, i6, ((ViewGroup.MarginLayoutParams) sVar).height);
        } else {
            int w3 = n0.w(false, h12, i3, i6, ((ViewGroup.MarginLayoutParams) sVar).height);
            int w4 = n0.w(true, this.f600r.l(), this.f872l, i7, ((ViewGroup.MarginLayoutParams) sVar).width);
            i4 = w3;
            i5 = w4;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (z2) {
            v02 = x0(view, i5, i4, o0Var);
        } else {
            v02 = v0(view, i5, i4, o0Var);
        }
        if (v02) {
            view.measure(i5, i4);
        }
    }

    public final void m1(int i3) {
        if (i3 == this.F) {
            return;
        }
        this.E = true;
        if (i3 >= 1) {
            this.F = i3;
            this.K.w();
            m0();
            return;
        }
        b.m(w0.d("Span count should be at least 1. Provided ", i3));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int n(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int n0(int i3, t0 t0Var, z0 z0Var) {
        n1();
        g1();
        return super.n0(i3, t0Var, z0Var);
    }

    public final void n1() {
        int D;
        int G;
        if (this.f598p == 1) {
            D = this.f874n - F();
            G = E();
        } else {
            D = this.f875o - D();
            G = G();
        }
        f1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int o(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int p0(int i3, t0 t0Var, z0 z0Var) {
        n1();
        g1();
        return super.p0(i3, t0Var, z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final o0 r() {
        if (this.f598p == 0) {
            return new s(-2, -1);
        }
        return new s(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b1.s, b1.o0] */
    @Override // b1.n0
    public final o0 s(Context context, AttributeSet attributeSet) {
        ?? o0Var = new o0(context, attributeSet);
        o0Var.f895e = -1;
        o0Var.f896f = 0;
        return o0Var;
    }

    @Override // b1.n0
    public final void s0(Rect rect, int i3, int i4) {
        int g3;
        int g4;
        if (this.G == null) {
            super.s0(rect, i3, i4);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f598p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f864b;
            WeakHashMap weakHashMap = j0.f2160a;
            g4 = n0.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g3 = n0.g(i3, iArr[iArr.length - 1] + F, this.f864b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f864b;
            WeakHashMap weakHashMap2 = j0.f2160a;
            g3 = n0.g(i3, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g4 = n0.g(i4, iArr2[iArr2.length - 1] + D, this.f864b.getMinimumHeight());
        }
        this.f864b.setMeasuredDimension(g3, g4);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [b1.s, b1.o0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [b1.s, b1.o0] */
    @Override // b1.n0
    public final o0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? o0Var = new o0((ViewGroup.MarginLayoutParams) layoutParams);
            o0Var.f895e = -1;
            o0Var.f896f = 0;
            return o0Var;
        }
        ?? o0Var2 = new o0(layoutParams);
        o0Var2.f895e = -1;
        o0Var2.f896f = 0;
        return o0Var2;
    }

    @Override // b1.n0
    public final int x(t0 t0Var, z0 z0Var) {
        if (this.f598p == 1) {
            return this.F;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return i1(z0Var.b() - 1, t0Var, z0Var) + 1;
    }

    public GridLayoutManager(int i3) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new p(5);
        this.L = new Rect();
        m1(i3);
    }
}
