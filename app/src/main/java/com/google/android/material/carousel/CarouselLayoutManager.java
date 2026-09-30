package com.google.android.material.carousel;

import a.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.w0;
import androidx.recyclerview.widget.RecyclerView;
import b1.n0;
import b1.o0;
import b1.t0;
import b1.y0;
import b1.z0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.x;
import com.logistics.rider.lsposed.R;
import i1.a;
import p1.b;
import p1.c;
import p1.e;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends n0 implements y0 {

    /* renamed from: p, reason: collision with root package name */
    public final e f1195p;

    /* renamed from: q, reason: collision with root package name */
    public c f1196q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1197r;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        new b();
        this.f1197r = new View.OnLayoutChangeListener() { // from class: p1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                if (i7 - i5 == i11 - i9 && i8 - i6 == i12 - i10) {
                    return;
                }
                view.post(new k(10, CarouselLayoutManager.this));
            }
        };
        this.f1195p = new e();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1971b);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final float B0(float f3, float f4) {
        if (D0()) {
            return f3 - f4;
        }
        return f3 + f4;
    }

    public final boolean C0() {
        if (this.f1196q.f2700a == 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        if (C0() && C() == 1) {
            return true;
        }
        return false;
    }

    public final void E0(int i3) {
        c cVar;
        if (i3 != 0 && i3 != 1) {
            a.b.m(w0.d("invalid orientation:", i3));
            return;
        }
        c(null);
        c cVar2 = this.f1196q;
        if (cVar2 != null && i3 == cVar2.f2700a) {
            return;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                cVar = new c(this, 0);
            } else {
                a.b.m("invalid orientation");
                return;
            }
        } else {
            cVar = new c(this, 1);
        }
        this.f1196q = cVar;
        m0();
    }

    @Override // b1.n0
    public final boolean L() {
        return true;
    }

    @Override // b1.n0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        e eVar = this.f1195p;
        float f3 = eVar.f2703a;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f2703a = f3;
        float f4 = eVar.f2704b;
        if (f4 <= 0.0f) {
            f4 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f2704b = f4;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f1197r);
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1197r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (D0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (D0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r4, int r5, b1.t0 r6, b1.z0 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            p1.c r6 = r3.f1196q
            int r6 = r6.f2700a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.D0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.D0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = b1.n0.H(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = b1.n0.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            p1.c r3 = r3.f1196q
            r3.a()
            r3 = 0
            throw r3
        L7a:
            boolean r4 = r3.D0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r3 = r3.u(r6)
            return r3
        L8b:
            int r4 = b1.n0.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r3 = 0
            return r3
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = b1.n0.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            p1.c r3 = r3.f1196q
            r3.a()
            r3 = 0
            throw r3
        Lb6:
            boolean r4 = r3.D0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r3 = r3.u(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, b1.t0, b1.z0):android.view.View");
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(n0.H(u(0)));
            accessibilityEvent.setToIndex(n0.H(u(v() - 1)));
        }
    }

    @Override // b1.n0
    public final void X(int i3, int i4) {
        B();
    }

    @Override // b1.n0
    public final void Y() {
        B();
    }

    @Override // b1.y0
    public final PointF a(int i3) {
        return null;
    }

    @Override // b1.n0
    public final void a0(int i3, int i4) {
        B();
    }

    @Override // b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        int i3;
        if (z0Var.b() > 0) {
            if (C0()) {
                i3 = this.f874n;
            } else {
                i3 = this.f875o;
            }
            if (i3 > 0.0f) {
                D0();
                t0Var.d(0);
                a.b.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(t0Var);
    }

    @Override // b1.n0
    public final boolean d() {
        return C0();
    }

    @Override // b1.n0
    public final void d0(z0 z0Var) {
        if (v() == 0) {
            return;
        }
        n0.H(u(0));
    }

    @Override // b1.n0
    public final boolean e() {
        return !C0();
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        v();
        return 0;
    }

    @Override // b1.n0
    public final int k(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int l(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        v();
        return 0;
    }

    @Override // b1.n0
    public final int n(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int n0(int i3, t0 t0Var, z0 z0Var) {
        if (!C0() || v() == 0 || i3 == 0) {
            return 0;
        }
        t0Var.d(0);
        a.b.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // b1.n0
    public final int o(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int p0(int i3, t0 t0Var, z0 z0Var) {
        if (!e() || v() == 0 || i3 == 0) {
            return 0;
        }
        t0Var.d(0);
        a.b.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // b1.n0
    public final o0 r() {
        return new o0(-2, -2);
    }

    @Override // b1.n0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // b1.n0
    public final void y0(RecyclerView recyclerView, int i3) {
        x xVar = new x(this, recyclerView.getContext());
        xVar.f938a = i3;
        z0(xVar);
    }

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f1197r = new View.OnLayoutChangeListener() { // from class: p1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                if (i7 - i5 == i11 - i9 && i8 - i6 == i12 - i10) {
                    return;
                }
                view.post(new k(10, CarouselLayoutManager.this));
            }
        };
        this.f1195p = eVar;
        m0();
        E0(0);
    }

    @Override // b1.n0
    public final void o0(int i3) {
    }
}
