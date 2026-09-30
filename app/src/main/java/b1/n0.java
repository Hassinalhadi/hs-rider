package b1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.s f863a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f864b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.p f865c;
    public final androidx.emoji2.text.p d;

    /* renamed from: e, reason: collision with root package name */
    public y f866e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f867f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f868g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f869i;

    /* renamed from: j, reason: collision with root package name */
    public int f870j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f871k;

    /* renamed from: l, reason: collision with root package name */
    public int f872l;

    /* renamed from: m, reason: collision with root package name */
    public int f873m;

    /* renamed from: n, reason: collision with root package name */
    public int f874n;

    /* renamed from: o, reason: collision with root package name */
    public int f875o;

    public n0() {
        l0 l0Var = new l0(this, 0);
        l0 l0Var2 = new l0(this, 1);
        this.f865c = new androidx.emoji2.text.p(l0Var);
        this.d = new androidx.emoji2.text.p(l0Var2);
        this.f867f = false;
        this.f868g = false;
        this.h = true;
        this.f869i = true;
    }

    public static int A(View view) {
        Rect rect = ((o0) view.getLayoutParams()).f878b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((o0) view.getLayoutParams()).f877a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.m0, java.lang.Object] */
    public static m0 I(Context context, AttributeSet attributeSet, int i3, int i4) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f70a, i3, i4);
        obj.f833a = obtainStyledAttributes.getInt(0, 1);
        obj.f834b = obtainStyledAttributes.getInt(10, 1);
        obj.f835c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i5 > 0 && i3 != i5) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i3) {
                return false;
            }
            return true;
        }
        if (size < i3) {
            return false;
        }
        return true;
    }

    public static void N(View view, int i3, int i4, int i5, int i6) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect = o0Var.f878b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) o0Var).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int g(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i4, i5);
            }
            return size;
        }
        return Math.min(size, Math.max(i4, i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.n0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((o0) view.getLayoutParams()).f878b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        e0 e0Var;
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            e0Var = recyclerView.getAdapter();
        } else {
            e0Var = null;
        }
        if (e0Var != null) {
            return e0Var.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f864b;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(t0 t0Var, z0 z0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((o0) view.getLayoutParams()).f878b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f864b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f864b.f629o;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i3) {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            int g3 = recyclerView.f619j.g();
            for (int i4 = 0; i4 < g3; i4++) {
                recyclerView.f619j.f(i4).offsetLeftAndRight(i3);
            }
        }
    }

    public void P(int i3) {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            int g3 = recyclerView.f619j.g();
            for (int i4 = 0; i4 < g3; i4++) {
                recyclerView.f619j.f(i4).offsetTopAndBottom(i3);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i3, t0 t0Var, z0 z0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f864b;
        t0 t0Var = recyclerView.f614g;
        z0 z0Var = recyclerView.f618i0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f864b.canScrollVertically(-1) && !this.f864b.canScrollHorizontally(-1) && !this.f864b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            e0 e0Var = this.f864b.f631p;
            if (e0Var != null) {
                accessibilityEvent.setItemCount(e0Var.a());
            }
        }
    }

    public final void V(View view, k0.d dVar) {
        c1 I = RecyclerView.I(view);
        if (I != null && !I.h()) {
            androidx.emoji2.text.s sVar = this.f863a;
            if (!((ArrayList) sVar.d).contains(I.f729a)) {
                RecyclerView recyclerView = this.f864b;
                W(recyclerView.f614g, recyclerView.f618i0, view, dVar);
            }
        }
    }

    public final void b(View view, int i3, boolean z2) {
        int i4;
        c1 I = RecyclerView.I(view);
        if (!z2 && !I.h()) {
            this.f864b.f621k.F(I);
        } else {
            n.j jVar = (n.j) this.f864b.f621k.f301g;
            m1 m1Var = (m1) jVar.get(I);
            if (m1Var == null) {
                m1Var = m1.a();
                jVar.put(I, m1Var);
            }
            m1Var.f836a |= 1;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (!I.p() && !I.i()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f864b;
            androidx.emoji2.text.s sVar = this.f863a;
            int i5 = -1;
            if (parent == recyclerView) {
                c cVar = (c) sVar.f310c;
                int indexOfChild = ((d0) sVar.f309b).f748a.indexOfChild(view);
                if (indexOfChild == -1 || cVar.d(indexOfChild)) {
                    i4 = -1;
                } else {
                    i4 = indexOfChild - cVar.b(indexOfChild);
                }
                if (i3 == -1) {
                    i3 = this.f863a.g();
                }
                if (i4 != -1) {
                    if (i4 != i3) {
                        n0 n0Var = this.f864b.f633q;
                        View u2 = n0Var.u(i4);
                        if (u2 != null) {
                            n0Var.u(i4);
                            n0Var.f863a.d(i4);
                            o0 o0Var2 = (o0) u2.getLayoutParams();
                            c1 I2 = RecyclerView.I(u2);
                            boolean h = I2.h();
                            RecyclerView recyclerView2 = n0Var.f864b;
                            if (h) {
                                n.j jVar2 = (n.j) recyclerView2.f621k.f301g;
                                m1 m1Var2 = (m1) jVar2.get(I2);
                                if (m1Var2 == null) {
                                    m1Var2 = m1.a();
                                    jVar2.put(I2, m1Var2);
                                }
                                m1Var2.f836a = 1 | m1Var2.f836a;
                            } else {
                                recyclerView2.f621k.F(I2);
                            }
                            n0Var.f863a.b(u2, i3, o0Var2, I2.h());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + n0Var.f864b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f864b.indexOfChild(view) + this.f864b.y());
                }
            } else {
                sVar.a(view, i3, false);
                o0Var.f879c = true;
                y yVar = this.f866e;
                if (yVar != null && yVar.f941e) {
                    yVar.f939b.getClass();
                    c1 I3 = RecyclerView.I(view);
                    if (I3 != null) {
                        i5 = I3.b();
                    }
                    if (i5 == yVar.f938a) {
                        yVar.f942f = view;
                    }
                }
            }
        } else {
            if (I.i()) {
                I.f740n.k(I);
            } else {
                I.f736j &= -33;
            }
            this.f863a.b(view, i3, view.getLayoutParams(), false);
        }
        if (o0Var.d) {
            I.f729a.invalidate();
            o0Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(t0 t0Var, z0 z0Var);

    public abstract boolean d();

    public abstract void d0(z0 z0Var);

    public abstract boolean e();

    public boolean f(o0 o0Var) {
        if (o0Var != null) {
            return true;
        }
        return false;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(t0 t0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            if (!RecyclerView.I(u(v3)).o()) {
                View u2 = u(v3);
                k0(v3);
                t0Var.g(u2);
            }
        }
    }

    public final void i0(t0 t0Var) {
        ArrayList arrayList;
        int size = t0Var.f906a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = t0Var.f906a;
            if (i3 < 0) {
                break;
            }
            View view = ((c1) arrayList.get(i3)).f729a;
            c1 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.f864b.removeDetachedView(view, false);
                }
                j0 j0Var = this.f864b.N;
                if (j0Var != null) {
                    j0Var.d(I);
                }
                I.n(true);
                c1 I2 = RecyclerView.I(view);
                I2.f740n = null;
                I2.f741o = false;
                I2.f736j &= -33;
                t0Var.h(I2);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = t0Var.f907b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f864b.invalidate();
        }
    }

    public abstract int j(z0 z0Var);

    public final void j0(View view, t0 t0Var) {
        androidx.emoji2.text.s sVar = this.f863a;
        d0 d0Var = (d0) sVar.f309b;
        int indexOfChild = d0Var.f748a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) sVar.f310c).f(indexOfChild)) {
                sVar.v(view);
            }
            d0Var.h(indexOfChild);
        }
        t0Var.g(view);
    }

    public abstract int k(z0 z0Var);

    public final void k0(int i3) {
        if (u(i3) != null) {
            androidx.emoji2.text.s sVar = this.f863a;
            int l3 = sVar.l(i3);
            d0 d0Var = (d0) sVar.f309b;
            View childAt = d0Var.f748a.getChildAt(l3);
            if (childAt != null) {
                if (((c) sVar.f310c).f(l3)) {
                    sVar.v(childAt);
                }
                d0Var.h(l3);
            }
        }
    }

    public abstract int l(z0 z0Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f874n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f875o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f874n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f875o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f864b
            android.graphics.Rect r5 = r5.f625m
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.n0.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(z0 z0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f864b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(z0 z0Var);

    public abstract int n0(int i3, t0 t0Var, z0 z0Var);

    public abstract int o(z0 z0Var);

    public abstract void o0(int i3);

    public final void p(t0 t0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u2 = u(v3);
            c1 I = RecyclerView.I(u2);
            if (!I.o()) {
                if (I.f() && !I.h() && !this.f864b.f631p.f755b) {
                    k0(v3);
                    t0Var.h(I);
                } else {
                    u(v3);
                    this.f863a.d(v3);
                    t0Var.i(u2);
                    this.f864b.f621k.F(I);
                }
            }
        }
    }

    public abstract int p0(int i3, t0 t0Var, z0 z0Var);

    public View q(int i3) {
        int v3 = v();
        for (int i4 = 0; i4 < v3; i4++) {
            View u2 = u(i4);
            c1 I = RecyclerView.I(u2);
            if (I != null && I.b() == i3 && !I.o() && (this.f864b.f618i0.f957g || !I.h())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract o0 r();

    public final void r0(int i3, int i4) {
        this.f874n = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f872l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.B0;
        }
        this.f875o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f873m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.B0;
        }
    }

    public o0 s(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    public void s0(Rect rect, int i3, int i4) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.f864b;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        this.f864b.setMeasuredDimension(g(i3, F, recyclerView.getMinimumWidth()), g(i4, D, this.f864b.getMinimumHeight()));
    }

    public o0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof o0) {
            return new o0((o0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new o0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new o0(layoutParams);
    }

    public final void t0(int i3, int i4) {
        int v3 = v();
        if (v3 == 0) {
            this.f864b.n(i3, i4);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v3; i9++) {
            View u2 = u(i9);
            Rect rect = this.f864b.f625m;
            y(u2, rect);
            int i10 = rect.left;
            if (i10 < i8) {
                i8 = i10;
            }
            int i11 = rect.right;
            if (i11 > i5) {
                i5 = i11;
            }
            int i12 = rect.top;
            if (i12 < i6) {
                i6 = i12;
            }
            int i13 = rect.bottom;
            if (i13 > i7) {
                i7 = i13;
            }
        }
        this.f864b.f625m.set(i8, i6, i5, i7);
        s0(this.f864b.f625m, i3, i4);
    }

    public final View u(int i3) {
        androidx.emoji2.text.s sVar = this.f863a;
        if (sVar != null) {
            return sVar.f(i3);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f864b = null;
            this.f863a = null;
            this.f874n = 0;
            this.f875o = 0;
        } else {
            this.f864b = recyclerView;
            this.f863a = recyclerView.f619j;
            this.f874n = recyclerView.getWidth();
            this.f875o = recyclerView.getHeight();
        }
        this.f872l = 1073741824;
        this.f873m = 1073741824;
    }

    public final int v() {
        androidx.emoji2.text.s sVar = this.f863a;
        if (sVar != null) {
            return sVar.g();
        }
        return 0;
    }

    public final boolean v0(View view, int i3, int i4, o0 o0Var) {
        if (!view.isLayoutRequested() && this.h && M(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) o0Var).width) && M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) o0Var).height)) {
            return false;
        }
        return true;
    }

    public boolean w0() {
        return false;
    }

    public int x(t0 t0Var, z0 z0Var) {
        return -1;
    }

    public final boolean x0(View view, int i3, int i4, o0 o0Var) {
        if (this.h && M(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) o0Var).width) && M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) o0Var).height)) {
            return false;
        }
        return true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.B0;
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect2 = o0Var.f878b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i3);

    public final void z0(y yVar) {
        y yVar2 = this.f866e;
        if (yVar2 != null && yVar != yVar2 && yVar2.f941e) {
            yVar2.i();
        }
        this.f866e = yVar;
        RecyclerView recyclerView = this.f864b;
        b1 b1Var = recyclerView.f613f0;
        b1Var.f724l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        if (yVar.h) {
            Log.w("RecyclerView", "An instance of " + yVar.getClass().getSimpleName() + " was started more than once. Each instance of" + yVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        yVar.f939b = recyclerView;
        yVar.f940c = this;
        int i3 = yVar.f938a;
        if (i3 != -1) {
            recyclerView.f618i0.f952a = i3;
            yVar.f941e = true;
            yVar.d = true;
            yVar.f942f = recyclerView.f633q.q(i3);
            yVar.f939b.f613f0.a();
            yVar.h = true;
            return;
        }
        a.b.m("Invalid target position");
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i3) {
    }

    public void Q() {
    }

    public void Y() {
    }

    public void X(int i3, int i4) {
    }

    public void Z(int i3, int i4) {
    }

    public void a0(int i3, int i4) {
    }

    public void b0(int i3, int i4) {
    }

    public void i(int i3, p pVar) {
    }

    public void W(t0 t0Var, z0 z0Var, View view, k0.d dVar) {
    }

    public void h(int i3, int i4, z0 z0Var, p pVar) {
    }
}
