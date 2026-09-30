package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.emoji2.text.w;
import b1.i0;
import b1.o;
import com.logistics.rider.lsposed.R;
import i0.c;
import j0.a0;
import j0.c0;
import j0.c1;
import j0.j0;
import j0.l;
import j0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import n.j;
import w.a;
import w1.b;
import x.d;
import x.e;
import x.f;
import x.g;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements l, m {
    public static final ThreadLocal A;
    public static final o B;
    public static final c C;

    /* renamed from: y, reason: collision with root package name */
    public static final String f212y;

    /* renamed from: z, reason: collision with root package name */
    public static final Class[] f213z;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f214f;

    /* renamed from: g, reason: collision with root package name */
    public final w f215g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f216i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f217j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f218k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f219l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f220m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f221n;

    /* renamed from: o, reason: collision with root package name */
    public View f222o;

    /* renamed from: p, reason: collision with root package name */
    public View f223p;

    /* renamed from: q, reason: collision with root package name */
    public e f224q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f225r;

    /* renamed from: s, reason: collision with root package name */
    public c1 f226s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f227t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f228u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f229v;

    /* renamed from: w, reason: collision with root package name */
    public b f230w;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f231x;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f212y = str;
        B = new o(3);
        f213z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new c();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, b1.i0] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f214f = new ArrayList();
        this.f215g = new w(5);
        this.h = new ArrayList();
        this.f216i = new ArrayList();
        this.f217j = new int[2];
        this.f218k = new int[2];
        this.f231x = new Object();
        int[] iArr = a.f3191a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f221n = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f221n[i3] = (int) (r10[i3] * f3);
            }
        }
        this.f228u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new x.c(this));
        WeakHashMap weakHashMap = j0.f2160a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i3, Rect rect, Rect rect2, d dVar, int i4, int i5) {
        int width;
        int height;
        int i6 = dVar.f3264c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i3);
        int i7 = dVar.d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i3);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        if (i10 != 1) {
            if (i10 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i11 != 16) {
            if (i11 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i8 != 1) {
            if (i8 != 5) {
                width -= i4;
            }
        } else {
            width -= i4 / 2;
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height -= i5;
            }
        } else {
            height -= i5 / 2;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f3263b) {
            x.b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (x.b) cls.getAnnotation(x.b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    x.a aVar = (x.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    x.a aVar2 = dVar.f3262a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f3262a = aVar;
                        dVar.f3263b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            dVar.f3263b = true;
        }
        return dVar;
    }

    public static void u(View view, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = dVar.f3268i;
        if (i4 != i3) {
            WeakHashMap weakHashMap = j0.f2160a;
            view.offsetLeftAndRight(i3 - i4);
            dVar.f3268i = i3;
        }
    }

    public static void v(View view, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = dVar.f3269j;
        if (i4 != i3) {
            WeakHashMap weakHashMap = j0.f2160a;
            view.offsetTopAndBottom(i3 - i4);
            dVar.f3269j = i3;
        }
    }

    @Override // j0.l
    public final void a(View view, View view2, int i3, int i4) {
        i0 i0Var = this.f231x;
        if (i4 == 1) {
            i0Var.f786b = i3;
        } else {
            i0Var.f785a = i3;
        }
        this.f223p = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // j0.l
    public final void b(View view, int i3) {
        i0 i0Var = this.f231x;
        if (i3 == 1) {
            i0Var.f786b = 0;
        } else {
            i0Var.f785a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i3)) {
                x.a aVar = dVar.f3262a;
                if (aVar != null) {
                    aVar.p(childAt, view, i3);
                }
                if (i3 != 0) {
                    if (i3 == 1) {
                        dVar.f3273n = false;
                    }
                } else {
                    dVar.f3272m = false;
                }
            }
        }
        this.f223p = null;
    }

    @Override // j0.l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
        x.a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i5) && (aVar = dVar.f3262a) != null) {
                    int[] iArr2 = this.f217j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i3, i4, iArr2, i5);
                    if (i3 > 0) {
                        min = Math.max(i6, iArr2[0]);
                    } else {
                        min = Math.min(i6, iArr2[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr2[1]);
                    } else {
                        min2 = Math.min(i7, iArr2[1]);
                    }
                    i7 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // j0.m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        x.a aVar;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i7) && (aVar = dVar.f3262a) != null) {
                    int[] iArr2 = this.f217j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i4, i5, i6, iArr2);
                    if (i5 > 0) {
                        i8 = Math.max(i8, iArr2[0]);
                    } else {
                        i8 = Math.min(i8, iArr2[0]);
                    }
                    if (i6 > 0) {
                        i9 = Math.max(i9, iArr2[1]);
                    } else {
                        i9 = Math.min(i9, iArr2[1]);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x.a aVar = ((d) view.getLayoutParams()).f3262a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f228u;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // j0.l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        d(view, i3, i4, i5, i6, 0, this.f218k);
    }

    @Override // j0.l
    public final boolean f(View view, View view2, int i3, int i4) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                x.a aVar = dVar.f3262a;
                if (aVar != null) {
                    boolean o3 = aVar.o(childAt, i3, i4);
                    z2 |= o3;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            dVar.f3273n = o3;
                        }
                    } else {
                        dVar.f3272m = o3;
                    }
                } else if (i4 != 0) {
                    if (i4 == 1) {
                        dVar.f3273n = false;
                    }
                } else {
                    dVar.f3272m = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f214f);
    }

    public final c1 getLastWindowInsets() {
        return this.f226s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.f231x;
        return i0Var.f786b | i0Var.f785a;
    }

    public Drawable getStatusBarBackground() {
        return this.f228u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i3 + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z2) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        j jVar = (j) this.f215g.f321g;
        int i3 = jVar.h;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i3; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i4));
            }
        }
        ArrayList arrayList3 = this.f216i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f3276a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f3276a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f3277b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i3) {
        int[] iArr = this.f221n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i3);
            return 0;
        }
        if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i3 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i3, int i4) {
        c cVar = C;
        Rect g3 = g();
        k(view, g3);
        try {
            return g3.contains(i3, i4);
        } finally {
            g3.setEmpty();
            cVar.c(g3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f225r) {
            if (this.f224q == null) {
                this.f224q = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f224q);
        }
        if (this.f226s == null) {
            WeakHashMap weakHashMap = j0.f2160a;
            if (getFitsSystemWindows()) {
                a0.b(this);
            }
        }
        this.f220m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f225r && this.f224q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f224q);
        }
        View view = this.f223p;
        if (view != null) {
            b(view, 0);
        }
        this.f220m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        super.onDraw(canvas);
        if (this.f227t && this.f228u != null) {
            c1 c1Var = this.f226s;
            if (c1Var != null) {
                i3 = c1Var.d();
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                this.f228u.setBounds(0, 0, getWidth(), i3);
                this.f228u.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r3 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r3;
        }
        t(true);
        return r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        x.a aVar;
        WeakHashMap weakHashMap = j0.f2160a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f214f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f3262a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    x.a aVar = dVar.f3262a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        x.a aVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f3262a) != null) {
                    z2 |= aVar.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        c(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        e(view, i3, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f2612f);
        SparseArray sparseArray = fVar.h;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            x.a aVar = n(childAt).f3262a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.f, android.os.Parcelable, o0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        ?? bVar = new o0.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            x.a aVar = ((d) childAt.getLayoutParams()).f3262a;
            if (id != -1 && aVar != null && (n2 = aVar.n(childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        bVar.h = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f222o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f222o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (x.d) r6
            x.a r6 = r6.f3262a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f222o
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f222o
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i3) {
        Rect g3;
        Rect g4;
        int i4;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f3270k;
        if (view2 == null && dVar.f3266f != -1) {
            a.b.i("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        c cVar = C;
        if (view2 != null) {
            g3 = g();
            g4 = g();
            try {
                k(view2, g3);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i3, g3, g4, dVar2, measuredWidth, measuredHeight);
                h(dVar2, g4, measuredWidth, measuredHeight);
                view.layout(g4.left, g4.top, g4.right, g4.bottom);
                return;
            } finally {
                g3.setEmpty();
                cVar.c(g3);
                g4.setEmpty();
                cVar.c(g4);
            }
        }
        int i5 = dVar.f3265e;
        if (i5 >= 0) {
            d dVar3 = (d) view.getLayoutParams();
            int i6 = dVar3.f3264c;
            if (i6 == 0) {
                i6 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i6, i3);
            int i7 = absoluteGravity & 7;
            int i8 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i3 == 1) {
                i5 = width - i5;
            }
            int m3 = m(i5) - measuredWidth2;
            if (i7 != 1) {
                if (i7 == 5) {
                    m3 += measuredWidth2;
                }
            } else {
                m3 += measuredWidth2 / 2;
            }
            if (i8 != 16) {
                if (i8 != 80) {
                    i4 = 0;
                } else {
                    i4 = measuredHeight2;
                }
            } else {
                i4 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, Math.min(m3, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, Math.min(i4, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        g3 = g();
        g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin);
        if (this.f226s != null) {
            WeakHashMap weakHashMap = j0.f2160a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g3.left = this.f226s.b() + g3.left;
                g3.top = this.f226s.d() + g3.top;
                g3.right -= this.f226s.c();
                g3.bottom -= this.f226s.a();
            }
        }
        g4 = g();
        int i9 = dVar4.f3264c;
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        if ((i9 & 112) == 0) {
            i9 |= 48;
        }
        Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g4, i3);
        view.layout(g4.left, g4.top, g4.right, g4.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i3) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            if (isChildrenDrawingOrderEnabled) {
                i4 = getChildDrawingOrder(childCount, i5);
            } else {
                i4 = i5;
            }
            arrayList.add(getChildAt(i4));
        }
        o oVar = B;
        if (oVar != null) {
            Collections.sort(arrayList, oVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            x.a aVar = ((d) view.getLayoutParams()).f3262a;
            if (z2 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i3 != 0) {
                        if (i3 == 1) {
                            aVar.q(view, motionEvent2);
                        }
                    } else {
                        aVar.f(this, view, motionEvent2);
                    }
                }
            } else if (!z2 && aVar != null) {
                if (i3 != 0) {
                    if (i3 == 1) {
                        z2 = aVar.q(view, motionEvent);
                    }
                } else {
                    z2 = aVar.f(this, view, motionEvent);
                }
                if (z2) {
                    this.f222o = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        x.a aVar = ((d) view.getLayoutParams()).f3262a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f219l) {
            t(false);
            this.f219l = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.f214f;
        arrayList.clear();
        w wVar = this.f215g;
        j jVar = (j) wVar.f321g;
        i0.b bVar = (i0.b) wVar.f320f;
        j jVar2 = (j) wVar.f321g;
        int i3 = jVar.h;
        for (int i4 = 0; i4 < i3; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
        }
        jVar.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            d n2 = n(childAt);
            int i6 = n2.f3266f;
            if (i6 == -1) {
                n2.f3271l = null;
                n2.f3270k = null;
            } else {
                View view = n2.f3270k;
                if (view != null && view.getId() == i6) {
                    View view2 = n2.f3270k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            n2.f3271l = null;
                            n2.f3270k = null;
                        }
                    }
                    n2.f3271l = view2;
                }
                View findViewById = findViewById(i6);
                n2.f3270k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            n2.f3271l = null;
                            n2.f3270k = null;
                        } else {
                            a.b.i("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n2.f3271l = null;
                                    n2.f3270k = null;
                                } else {
                                    a.b.i("Anchor must not be a descendant of the anchored view");
                                    return;
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        n2.f3271l = findViewById;
                    }
                } else if (isInEditMode()) {
                    n2.f3271l = null;
                    n2.f3270k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                }
            }
            if (!jVar2.containsKey(childAt)) {
                jVar2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i5) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != n2.f3271l) {
                        WeakHashMap weakHashMap = j0.f2160a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((d) childAt2.getLayoutParams()).f3267g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            x.a aVar = n2.f3262a;
                            if (aVar != null) {
                                aVar.b(childAt);
                            }
                        }
                    }
                    if (!jVar2.containsKey(childAt2) && !jVar2.containsKey(childAt2)) {
                        jVar2.put(childAt2, null);
                    }
                    if (jVar2.containsKey(childAt2) && jVar2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) jVar2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) bVar.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            jVar2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        a.b.m("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) wVar.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) wVar.f322i;
        hashSet.clear();
        int i8 = jVar2.h;
        for (int i9 = 0; i9 < i8; i9++) {
            wVar.d(jVar2.f(i9), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f229v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.f228u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f228u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f228u.setState(getDrawableState());
                }
                Drawable drawable4 = this.f228u;
                WeakHashMap weakHashMap = j0.f2160a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f228u;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.f228u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = j0.f2160a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            drawable = getContext().getDrawable(i3);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        boolean z2;
        super.setVisibility(i3);
        if (i3 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f228u;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f228u.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            x.a aVar = ((d) childAt.getLayoutParams()).f3262a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((d) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f222o = null;
        this.f219l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f228u) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = j0.f2160a;
        if (getFitsSystemWindows()) {
            if (this.f230w == null) {
                this.f230w = new b(this);
            }
            c0.i(this, this.f230w);
            setSystemUiVisibility(1280);
            return;
        }
        c0.i(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
