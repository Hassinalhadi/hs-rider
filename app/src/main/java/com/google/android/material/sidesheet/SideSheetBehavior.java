package com.google.android.material.sidesheet;

import a.b;
import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.k;
import b2.j;
import b2.m;
import b2.n;
import c2.c;
import c2.e;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.logistics.rider.lsposed.R;
import j0.c0;
import j0.f0;
import j0.j0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k2.h;
import p0.d;
import x.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public y f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1301c;
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1302e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1303f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1304g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public d f1305i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1306j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1307k;

    /* renamed from: l, reason: collision with root package name */
    public int f1308l;

    /* renamed from: m, reason: collision with root package name */
    public int f1309m;

    /* renamed from: n, reason: collision with root package name */
    public int f1310n;

    /* renamed from: o, reason: collision with root package name */
    public int f1311o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1312p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1313q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1314r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1315s;

    /* renamed from: t, reason: collision with root package name */
    public int f1316t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1317u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1318v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1302e = new e(this);
        this.f1304g = true;
        this.h = 5;
        this.f1307k = 0.1f;
        this.f1314r = -1;
        this.f1317u = new LinkedHashSet();
        this.f1318v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1993z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1301c = h.l(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = n.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1314r = resourceId;
            WeakReference weakReference = this.f1313q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1313q = null;
            WeakReference weakReference2 = this.f1312p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        n nVar = this.d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f1300b = jVar;
            jVar.j(context);
            ColorStateList colorStateList = this.f1301c;
            if (colorStateList != null) {
                this.f1300b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1300b.setTint(typedValue.data);
            }
        }
        this.f1303f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1304g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // x.a
    public final void c(x.d dVar) {
        this.f1312p = null;
        this.f1305i = null;
    }

    @Override // x.a
    public final void e() {
        this.f1312p = null;
        this.f1305i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (j0.f0.a(r4) != null) goto L6;
     */
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L10
            java.util.WeakHashMap r3 = j0.j0.f2160a
            java.lang.CharSequence r3 = j0.f0.a(r4)
            if (r3 == 0) goto L59
        L10:
            boolean r3 = r2.f1304g
            if (r3 == 0) goto L59
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L24
            android.view.VelocityTracker r4 = r2.f1315s
            if (r4 == 0) goto L24
            r4.recycle()
            r4 = 0
            r2.f1315s = r4
        L24:
            android.view.VelocityTracker r4 = r2.f1315s
            if (r4 != 0) goto L2e
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f1315s = r4
        L2e:
            android.view.VelocityTracker r4 = r2.f1315s
            r4.addMovement(r5)
            if (r3 == 0) goto L42
            if (r3 == r0) goto L3b
            r4 = 3
            if (r3 == r4) goto L3b
            goto L49
        L3b:
            boolean r3 = r2.f1306j
            if (r3 == 0) goto L49
            r2.f1306j = r1
            return r1
        L42:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f1316t = r3
        L49:
            boolean r3 = r2.f1306j
            if (r3 != 0) goto L58
            p0.d r2 = r2.f1305i
            if (r2 == 0) goto L58
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L58
            return r0
        L58:
            return r1
        L59:
            r2.f1306j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        int i4;
        View view2;
        View view3;
        int i5;
        int H;
        int i6;
        View findViewById;
        int i7;
        int i8 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1312p;
        j jVar = this.f1300b;
        int i9 = 0;
        if (weakReference == null) {
            this.f1312p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            h.R(context, R.attr.motionDurationMedium2, 300);
            h.R(context, R.attr.motionDurationShort3, 150);
            h.R(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f3 = this.f1303f;
                if (f3 == -1.0f) {
                    f3 = view.getElevation();
                }
                jVar.l(f3);
            } else {
                ColorStateList colorStateList = this.f1301c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = j0.f2160a;
                    c0.f(view, colorStateList);
                }
            }
            if (this.h == 5) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            WeakHashMap weakHashMap2 = j0.f2160a;
            if (f0.a(view) == null) {
                j0.i(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((x.d) view.getLayoutParams()).f3264c, i3) == 3) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        y yVar = this.f1299a;
        if (yVar == null || yVar.J() != i4) {
            x.d dVar = null;
            n nVar = this.d;
            if (i4 == 0) {
                this.f1299a = new c2.a(this, i8);
                if (nVar != null) {
                    WeakReference weakReference2 = this.f1312p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof x.d)) {
                        dVar = (x.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        m f4 = nVar.f();
                        f4.f1023f = new b2.a(0.0f);
                        f4.f1024g = new b2.a(0.0f);
                        n a3 = f4.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            } else if (i4 == 1) {
                this.f1299a = new c2.a(this, i9);
                if (nVar != null) {
                    WeakReference weakReference3 = this.f1312p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof x.d)) {
                        dVar = (x.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        m f5 = nVar.f();
                        f5.f1022e = new b2.a(0.0f);
                        f5.h = new b2.a(0.0f);
                        n a4 = f5.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + i4 + ". Must be 0 or 1.");
            }
        }
        if (this.f1305i == null) {
            this.f1305i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f1318v);
        }
        int H2 = this.f1299a.H(view);
        coordinatorLayout.q(view, i3);
        this.f1309m = coordinatorLayout.getWidth();
        this.f1310n = this.f1299a.I(coordinatorLayout);
        this.f1308l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i5 = this.f1299a.j(marginLayoutParams);
        } else {
            i5 = 0;
        }
        this.f1311o = i5;
        int i10 = this.h;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 5) {
                    H = this.f1299a.E();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.h);
                }
            } else {
                H = 0;
            }
        } else {
            H = H2 - this.f1299a.H(view);
        }
        WeakHashMap weakHashMap3 = j0.f2160a;
        view.offsetLeftAndRight(H);
        if (this.f1313q == null && (i6 = this.f1314r) != -1 && (findViewById = coordinatorLayout.findViewById(i6)) != null) {
            this.f1313q = new WeakReference(findViewById);
        }
        Iterator it = this.f1317u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                b.c();
                return false;
            }
        }
        return true;
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        int i3 = ((c2.d) parcelable).h;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.h = i3;
    }

    @Override // x.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c2.d(this);
    }

    @Override // x.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f1305i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1315s) != null) {
            velocityTracker.recycle();
            this.f1315s = null;
        }
        if (this.f1315s == null) {
            this.f1315s = VelocityTracker.obtain();
        }
        this.f1315s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1306j && s()) {
            float abs = Math.abs(this.f1316t - motionEvent.getX());
            d dVar = this.f1305i;
            if (abs > dVar.f2679b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1306j;
    }

    public final void r(int i3) {
        View view;
        int i4;
        if (this.h != i3) {
            this.h = i3;
            WeakReference weakReference = this.f1312p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.h == 5) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            Iterator it = this.f1317u.iterator();
            if (!it.hasNext()) {
                u();
            } else {
                it.next().getClass();
                b.c();
            }
        }
    }

    public final boolean s() {
        if (this.f1305i != null) {
            if (this.f1304g || this.h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r(2);
        r2.f1302e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            a.y r0 = r2.f1299a
            int r0 = r0.E()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = androidx.fragment.app.w0.d(r2, r4)
            a.b.m(r2)
            return
        L17:
            a.y r0 = r2.f1299a
            int r0 = r0.D()
        L1d:
            p0.d r1 = r2.f1305i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.f2693r = r3
            r3 = -1
            r1.f2680c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.f2678a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.f2693r
            if (r5 == 0) goto L49
            r5 = 0
            r1.f2693r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.r(r3)
            c2.e r2 = r2.f1302e
            r2.a(r4)
            return
        L55:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1312p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            j0.f(view, 262144);
            j0.d(view, 0);
            j0.f(view, 1048576);
            j0.d(view, 0);
            final int i3 = 5;
            if (this.h != 5) {
                j0.g(view, k0.c.f2470j, new k0.m() { // from class: c2.b
                    @Override // k0.m
                    public final boolean i(View view2) {
                        String str;
                        int i4 = i3;
                        if (i4 != 1 && i4 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f1312p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f1312p.get();
                                k kVar = new k(sideSheetBehavior, i4, 1);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(kVar);
                                    return true;
                                }
                                kVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i4);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i4 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        sb.append(str);
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                });
            }
            final int i4 = 3;
            if (this.h != 3) {
                j0.g(view, k0.c.h, new k0.m() { // from class: c2.b
                    @Override // k0.m
                    public final boolean i(View view2) {
                        String str;
                        int i42 = i4;
                        if (i42 != 1 && i42 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f1312p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f1312p.get();
                                k kVar = new k(sideSheetBehavior, i42, 1);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(kVar);
                                    return true;
                                }
                                kVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i42);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i42 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        sb.append(str);
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                });
            }
        }
    }

    public SideSheetBehavior() {
        this.f1302e = new e(this);
        this.f1304g = true;
        this.h = 5;
        this.f1307k = 0.1f;
        this.f1314r = -1;
        this.f1317u = new LinkedHashSet();
        this.f1318v = new c(this, 0);
    }
}
