package com.google.android.material.bottomsheet;

import a.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.p;
import androidx.fragment.app.w0;
import b1.m;
import b2.j;
import b2.n;
import c2.c;
import c2.e;
import com.logistics.rider.lsposed.R;
import g.f;
import j0.c0;
import j0.g0;
import j0.j0;
import j0.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k.s0;
import k2.h;
import p0.d;
import x.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final e A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public d O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1142a;
    public int a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1143b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1144b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1145c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1146c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f1147d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1148e;
    public final SparseIntArray e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1149f;

    /* renamed from: f0, reason: collision with root package name */
    public final c f1150f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1151g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final j f1152i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1153j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1154k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1155l;

    /* renamed from: m, reason: collision with root package name */
    public int f1156m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1157n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1158o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1159p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1160q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1161r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1162s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1163t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1164u;

    /* renamed from: v, reason: collision with root package name */
    public int f1165v;

    /* renamed from: w, reason: collision with root package name */
    public int f1166w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1167x;

    /* renamed from: y, reason: collision with root package name */
    public final n f1168y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1169z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i3;
        this.f1142a = 0;
        this.f1143b = true;
        this.f1154k = -1;
        this.f1155l = -1;
        this.A = new e(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1144b0 = -1;
        this.e0 = new SparseIntArray();
        this.f1150f0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1970a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1153j = h.l(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f1168y = n.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        n nVar = this.f1168y;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f1152i = jVar;
            jVar.j(context);
            ColorStateList colorStateList = this.f1153j;
            if (colorStateList != null) {
                this.f1152i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1152i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new m(2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1154k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1155l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            A(i3);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f1157n = obtainStyledAttributes.getBoolean(14, false);
        boolean z3 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f1143b != z3) {
            this.f1143b = z3;
            if (this.W != null) {
                r();
            }
            C((this.f1143b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f1142a = obtainStyledAttributes.getInt(11, 0);
        float f3 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.F = f3;
            if (this.W != null) {
                this.E = (int) ((1.0f - f3) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.C = i4;
                    G(this.N, true);
                } else {
                    b.m("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    b.m("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.d = obtainStyledAttributes.getInt(12, 500);
            this.f1158o = obtainStyledAttributes.getBoolean(18, false);
            this.f1159p = obtainStyledAttributes.getBoolean(19, false);
            this.f1160q = obtainStyledAttributes.getBoolean(20, false);
            this.f1161r = obtainStyledAttributes.getBoolean(21, true);
            this.f1162s = obtainStyledAttributes.getBoolean(15, false);
            this.f1163t = obtainStyledAttributes.getBoolean(16, false);
            this.f1164u = obtainStyledAttributes.getBoolean(17, false);
            this.f1167x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f1145c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        b.m("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static View v(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View v3 = v(viewGroup.getChildAt(i3));
                    if (v3 != null) {
                        return v3;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int w(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i5 = Math.min(size, i5);
            }
            return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
    }

    public final void A(int i3) {
        boolean z2 = this.f1149f;
        if (i3 == -1) {
            if (!z2) {
                this.f1149f = true;
            } else {
                return;
            }
        } else {
            if (!z2 && this.f1148e == i3) {
                return;
            }
            this.f1149f = false;
            this.f1148e = Math.max(0, i3);
        }
        I();
    }

    public final void B(int i3) {
        String str;
        int i4;
        if (i3 != 1 && i3 != 2) {
            if (!this.I && i3 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i3);
                return;
            }
            if (i3 == 6 && this.f1143b && y(i3) <= this.D) {
                i4 = 3;
            } else {
                i4 = i3;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                s0 s0Var = new s0(this, view, i4);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(s0Var);
                    return;
                } else {
                    s0Var.run();
                    return;
                }
            }
            C(i3);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i3 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void C(int i3) {
        if (this.N != i3) {
            this.N = i3;
            if (i3 != 4 && i3 != 3 && i3 != 6) {
                boolean z2 = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i3 == 3) {
                H(true);
            } else if (i3 == 6 || i3 == 5 || i3 == 4) {
                H(false);
            }
            G(i3, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                F();
            } else {
                arrayList.get(0).getClass();
                b.c();
            }
        }
    }

    public final boolean D(View view, float f3) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f3 * this.S) + view.getTop()) - this.G) / t() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            p0.d r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f2693r = r3
            r3 = -1
            r1.f2680c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f2678a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f2693r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f2693r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            c2.e r2 = r2.A
            r2.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i3;
        boolean z2;
        j0.b bVar;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            j0.f(view, 524288);
            j0.d(view, 0);
            j0.f(view, 262144);
            j0.d(view, 0);
            j0.f(view, 1048576);
            j0.d(view, 0);
            SparseIntArray sparseIntArray = this.e0;
            int i4 = sparseIntArray.get(0, -1);
            if (i4 != -1) {
                j0.f(view, i4);
                j0.d(view, 0);
                sparseIntArray.delete(0);
            }
            int i5 = 6;
            if (!this.f1143b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                f fVar = new f(this, 6);
                ArrayList b3 = j0.b(view);
                int i6 = 0;
                while (true) {
                    if (i6 < b3.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((k0.c) b3.get(i6)).f2473a).getLabel())) {
                            i3 = ((k0.c) b3.get(i6)).a();
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 0;
                        int i8 = -1;
                        while (true) {
                            int[] iArr = j0.f2161b;
                            if (i7 >= 32 || i8 != -1) {
                                break;
                            }
                            int i9 = iArr[i7];
                            boolean z3 = true;
                            for (int i10 = 0; i10 < b3.size(); i10++) {
                                if (((k0.c) b3.get(i10)).a() != i9) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z3 &= z2;
                            }
                            if (z3) {
                                i8 = i9;
                            }
                            i7++;
                        }
                        i3 = i8;
                    }
                }
                if (i3 != -1) {
                    k0.c cVar = new k0.c(null, i3, string, fVar, null);
                    View.AccessibilityDelegate a3 = g0.a(view);
                    if (a3 == null) {
                        bVar = null;
                    } else if (a3 instanceof j0.a) {
                        bVar = ((j0.a) a3).f2140a;
                    } else {
                        bVar = new j0.b(a3);
                    }
                    if (bVar == null) {
                        bVar = new j0.b();
                    }
                    j0.h(view, bVar);
                    j0.f(view, cVar.a());
                    j0.b(view).add(cVar);
                    j0.d(view, 0);
                }
                sparseIntArray.put(0, i3);
            }
            if (this.I && this.N != 5) {
                j0.g(view, k0.c.f2470j, new f(this, 5));
            }
            int i11 = this.N;
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 == 6) {
                        j0.g(view, k0.c.f2469i, new f(this, 4));
                        j0.g(view, k0.c.h, new f(this, 3));
                        return;
                    }
                    return;
                }
                if (this.f1143b) {
                    i5 = 3;
                }
                j0.g(view, k0.c.h, new f(this, i5));
                return;
            }
            if (this.f1143b) {
                i5 = 4;
            }
            j0.g(view, k0.c.f2469i, new f(this, i5));
        }
    }

    public final void G(int i3, boolean z2) {
        boolean z3;
        j jVar;
        if (i3 != 2) {
            if (this.N == 3 && (this.f1167x || z())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f1169z != z3 && (jVar = this.f1152i) != null) {
                this.f1169z = z3;
                ValueAnimator valueAnimator = this.B;
                float f3 = 1.0f;
                if (z2 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f4 = jVar.f999g.f989j;
                    if (z3) {
                        f3 = s();
                    }
                    valueAnimator.setFloatValues(f4, f3);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f1169z) {
                    f3 = s();
                }
                b2.h hVar = jVar.f999g;
                if (hVar.f989j != f3) {
                    hVar.f989j = f3;
                    jVar.f1002k = true;
                    jVar.f1003l = true;
                    jVar.invalidateSelf();
                }
            }
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.f1147d0 == null) {
                        this.f1147d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.W.get() && z2) {
                        this.f1147d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.f1147d0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // x.a
    public final void c(x.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // x.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        View view2;
        int i3;
        d dVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.a0 = -1;
                this.f1144b0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f1146c0 = false;
                    this.a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x3 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                this.f1144b0 = y2;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x3, y2)) {
                        this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f1146c0 = true;
                    }
                }
                if (this.a0 == -1 && !coordinatorLayout.o(view, x3, this.f1144b0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.P = z2;
            }
            if (this.P || (dVar = this.O) == null || !dVar.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i3 = this.f1144b0) == -1 || Math.abs(i3 - motionEvent.getY()) <= this.O.f2679b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, w1.l] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        boolean z2;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f1151g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (!this.f1157n && !this.f1149f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f1158o || this.f1159p || this.f1160q || this.f1162s || this.f1163t || this.f1164u || z2) {
                h0.f fVar = new h0.f(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f3256a = paddingStart;
                obj.f3257b = paddingEnd;
                obj.f3258c = paddingBottom;
                p pVar = new p(fVar, (Object) obj, 20);
                WeakHashMap weakHashMap = j0.f2160a;
                c0.i(view, pVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            n1.b bVar = new n1.b(view);
            WeakHashMap weakHashMap2 = j0.f2160a;
            view.setWindowInsetsAnimationCallback(new m0(bVar));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            h.R(context, R.attr.motionDurationMedium2, 300);
            h.R(context, R.attr.motionDurationShort3, 150);
            h.R(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.f1152i;
            if (jVar != null) {
                view.setBackground(jVar);
                float f3 = this.H;
                if (f3 == -1.0f) {
                    f3 = view.getElevation();
                }
                jVar.l(f3);
            } else {
                ColorStateList colorStateList = this.f1153j;
                if (colorStateList != null) {
                    c0.f(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f1150f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i3);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i4 = this.V;
        int i5 = i4 - height;
        int i6 = this.f1166w;
        if (i5 < i6) {
            boolean z3 = this.f1161r;
            int i7 = this.f1155l;
            if (z3) {
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.T = i4;
            } else {
                int i8 = i4 - i6;
                if (i7 != -1) {
                    i8 = Math.min(i8, i7);
                }
                this.T = i8;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i9 = this.N;
        if (i9 == 3) {
            int x3 = x();
            WeakHashMap weakHashMap3 = j0.f2160a;
            view.offsetTopAndBottom(x3);
        } else if (i9 == 6) {
            int i10 = this.E;
            WeakHashMap weakHashMap4 = j0.f2160a;
            view.offsetTopAndBottom(i10);
        } else if (this.I && i9 == 5) {
            int i11 = this.V;
            WeakHashMap weakHashMap5 = j0.f2160a;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.G;
            WeakHashMap weakHashMap6 = j0.f2160a;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = j0.f2160a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        b.c();
        return false;
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f1154k, marginLayoutParams.width), w(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1155l, marginLayoutParams.height));
        return true;
    }

    @Override // x.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // x.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        View view3;
        if (i5 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i6 = top - i4;
                boolean z2 = this.K;
                boolean z3 = this.L;
                if (i4 > 0) {
                    if (!this.R && !z3 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    }
                    if (i6 < x()) {
                        int x3 = top - x();
                        iArr[1] = x3;
                        WeakHashMap weakHashMap = j0.f2160a;
                        view.offsetTopAndBottom(-x3);
                        C(3);
                    } else if (z2) {
                        iArr[1] = i4;
                        WeakHashMap weakHashMap2 = j0.f2160a;
                        view.offsetTopAndBottom(-i4);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i4 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !z3 && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        int i7 = this.G;
                        if (i6 > i7 && !this.I) {
                            int i8 = top - i7;
                            iArr[1] = i8;
                            WeakHashMap weakHashMap3 = j0.f2160a;
                            view.offsetTopAndBottom(-i8);
                            C(4);
                        } else {
                            if (!z2) {
                                return;
                            }
                            iArr[1] = i4;
                            WeakHashMap weakHashMap4 = j0.f2160a;
                            view.offsetTopAndBottom(-i4);
                            C(1);
                        }
                    }
                }
                u(view.getTop());
                this.Q = i4;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        n1.a aVar = (n1.a) parcelable;
        int i3 = this.f1142a;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.f1148e = aVar.f2602i;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f1143b = aVar.f2603j;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.I = aVar.f2604k;
            }
            if (i3 == -1 || (i3 & 8) == 8) {
                this.J = aVar.f2605l;
            }
        }
        int i4 = aVar.h;
        if (i4 != 1 && i4 != 2) {
            this.N = i4;
        } else {
            this.N = 4;
        }
    }

    @Override // x.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new n1.a(this);
    }

    @Override // x.a
    public final boolean o(View view, int i3, int i4) {
        this.Q = 0;
        this.R = false;
        if ((i3 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f1143b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1145c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.a0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f1143b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f1143b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // x.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.N;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.O;
        if (dVar != null && (this.K || i3 == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.f1144b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.f1144b0 - motionEvent.getY());
            d dVar2 = this.O;
            if (abs > dVar2.f2679b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t3 = t();
        boolean z2 = this.f1143b;
        int i3 = this.V;
        if (z2) {
            this.G = Math.max(i3 - t3, this.D);
        } else {
            this.G = i3 - t3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            b2.j r0 = r5.f1152i
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L89
            b2.j r2 = r5.f1152i
            float[] r3 = r2.E
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            b2.h r3 = r2.f999g
            b2.n r3 = r3.f982a
            b2.d r3 = r3.f1032e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
        L41:
            android.view.RoundedCorner r3 = j0.c.h(r0)
            if (r3 == 0) goto L56
            int r3 = j0.c.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = r1
        L57:
            b2.j r5 = r5.f1152i
            float[] r2 = r5.E
            if (r2 == 0) goto L61
            r5 = 0
            r5 = r2[r5]
            goto L6f
        L61:
            b2.h r2 = r5.f999g
            b2.n r2 = r2.f982a
            b2.d r2 = r2.f1033f
            android.graphics.RectF r5 = r5.f()
            float r5 = r2.a(r5)
        L6f:
            android.view.RoundedCorner r0 = j0.c.m(r0)
            if (r0 == 0) goto L84
            int r0 = j0.c.c(r0)
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L84
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L84
            float r1 = r0 / r5
        L84:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i3;
        int i4;
        int i5;
        if (this.f1149f) {
            i3 = Math.min(Math.max(this.f1151g, this.V - ((this.U * 9) / 16)), this.T);
            i4 = this.f1165v;
        } else {
            if (!this.f1157n && !this.f1158o && (i5 = this.f1156m) > 0) {
                return Math.max(this.f1148e, i5 + this.h);
            }
            i3 = this.f1148e;
            i4 = this.f1165v;
        }
        return i3 + i4;
    }

    public final void u(int i3) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i4 = this.G;
                if (i3 <= i4 && i4 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    b.c();
                }
            }
        }
    }

    public final int x() {
        int i3;
        if (this.f1143b) {
            return this.D;
        }
        if (this.f1161r) {
            i3 = 0;
        } else {
            i3 = this.f1166w;
        }
        return Math.max(this.C, i3);
    }

    public final int y(int i3) {
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return this.E;
                    }
                    b.m(w0.d("Invalid state to get top offset: ", i3));
                    return 0;
                }
                return this.V;
            }
            return this.G;
        }
        return x();
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior() {
        this.f1142a = 0;
        this.f1143b = true;
        this.f1154k = -1;
        this.f1155l = -1;
        this.A = new e(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1144b0 = -1;
        this.e0 = new SparseIntArray();
        this.f1150f0 = new c(this, 1);
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
    }
}
