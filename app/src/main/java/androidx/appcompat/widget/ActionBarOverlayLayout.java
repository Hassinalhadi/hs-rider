package androidx.appcompat.widget;

import a.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import b1.i0;
import c0.b;
import com.logistics.rider.lsposed.R;
import g.m0;
import i.j;
import j.x;
import j0.a0;
import j0.c0;
import j0.c1;
import j0.j0;
import j0.l;
import j0.m;
import j0.p0;
import j0.q0;
import j0.r0;
import j0.y0;
import java.util.WeakHashMap;
import k.c;
import k.d;
import k.e;
import k.f;
import k.g1;
import k.k;
import k.t2;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements l, m {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final c1 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final e2.l C;
    public final c D;
    public final c E;
    public final i0 F;
    public final f G;

    /* renamed from: f, reason: collision with root package name */
    public int f134f;

    /* renamed from: g, reason: collision with root package name */
    public int f135g;
    public ContentFrameLayout h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f136i;

    /* renamed from: j, reason: collision with root package name */
    public g1 f137j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f138k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f139l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f140m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f141n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f142o;

    /* renamed from: p, reason: collision with root package name */
    public int f143p;

    /* renamed from: q, reason: collision with root package name */
    public int f144q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f145r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f146s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f147t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f148u;

    /* renamed from: v, reason: collision with root package name */
    public c1 f149v;

    /* renamed from: w, reason: collision with root package name */
    public c1 f150w;

    /* renamed from: x, reason: collision with root package name */
    public c1 f151x;

    /* renamed from: y, reason: collision with root package name */
    public c1 f152y;

    /* renamed from: z, reason: collision with root package name */
    public d f153z;

    static {
        r0 p0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            p0Var = new q0();
        } else {
            p0Var = new p0();
        }
        p0Var.c(b.b(0, 1, 0, 1));
        I = p0Var.b();
        J = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, b1.i0] */
    /* JADX WARN: Type inference failed for: r3v15, types: [k.f, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f135g = 0;
        this.f145r = new Rect();
        this.f146s = new Rect();
        this.f147t = new Rect();
        this.f148u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c1 c1Var = c1.f2145b;
        this.f149v = c1Var;
        this.f150w = c1Var;
        this.f151x = c1Var;
        this.f152y = c1Var;
        this.C = new e2.l(4, this);
        this.D = new c(this, 0);
        this.E = new c(this, 1);
        i(context);
        this.F = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.G = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i4;
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i6;
            z3 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i8;
            z3 = true;
        }
        if (z2) {
            int i9 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i10;
                return true;
            }
        }
        return z3;
    }

    @Override // j0.l
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // j0.l
    public final void b(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // j0.m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i3, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f138k != null) {
            if (this.f136i.getVisibility() == 0) {
                i3 = (int) (this.f136i.getTranslationY() + this.f136i.getBottom() + 0.5f);
            } else {
                i3 = 0;
            }
            this.f138k.setBounds(0, i3, getWidth(), this.f138k.getIntrinsicHeight() + i3);
            this.f138k.draw(canvas);
        }
    }

    @Override // j0.l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i3, i4, i5, i6);
        }
    }

    @Override // j0.l
    public final boolean f(View view, View view2, int i3, int i4) {
        if (i4 == 0 && onStartNestedScroll(view, view2, i3)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f136i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.F;
        return i0Var.f786b | i0Var.f785a;
    }

    public CharSequence getTitle() {
        k();
        return ((y2) this.f137j).f2443a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        boolean z2 = false;
        this.f134f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f138k = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i3) {
        k();
        if (i3 != 2) {
            if (i3 != 5) {
                if (i3 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((y2) this.f137j).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((y2) this.f137j).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        g1 wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f136i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof g1) {
                wrapper = (g1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                a.b.i("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.f137j = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        y2 y2Var = (y2) this.f137j;
        Toolbar toolbar = y2Var.f2443a;
        if (y2Var.f2453m == null) {
            y2Var.f2453m = new k(toolbar.getContext());
        }
        k kVar = y2Var.f2453m;
        kVar.f2291j = xVar;
        j.m mVar = (j.m) menu;
        if (mVar != null || toolbar.f173f != null) {
            toolbar.f();
            j.m mVar2 = toolbar.f173f.f154u;
            if (mVar2 == mVar) {
                return;
            }
            if (mVar2 != null) {
                mVar2.r(toolbar.P);
                mVar2.r(toolbar.Q);
            }
            if (toolbar.Q == null) {
                toolbar.Q = new t2(toolbar);
            }
            kVar.f2303v = true;
            Context context = toolbar.f181o;
            if (mVar != null) {
                mVar.b(kVar, context);
                mVar.b(toolbar.Q, toolbar.f181o);
            } else {
                kVar.c(context, null);
                toolbar.Q.c(toolbar.f181o, null);
                kVar.g();
                toolbar.Q.g();
            }
            toolbar.f173f.setPopupTheme(toolbar.f182p);
            toolbar.f173f.setPresenter(kVar);
            toolbar.P = kVar;
            toolbar.t();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        c1 f3 = c1.f(this, windowInsets);
        boolean g3 = g(this.f136i, new Rect(f3.b(), f3.d(), f3.c(), f3.a()), false);
        WeakHashMap weakHashMap = j0.f2160a;
        Rect rect = this.f145r;
        c0.a(this, f3, rect);
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        y0 y0Var = f3.f2146a;
        c1 j3 = y0Var.j(i3, i4, i5, i6);
        this.f149v = j3;
        boolean z2 = true;
        if (!this.f150w.equals(j3)) {
            this.f150w = this.f149v;
            g3 = true;
        }
        Rect rect2 = this.f146s;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = g3;
        }
        if (z2) {
            requestLayout();
        }
        return y0Var.a().f2146a.c().f2146a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = j0.f2160a;
        a0.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (this.f141n && z2) {
            this.A.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.A.getFinalY() > this.f136i.getHeight()) {
                h();
                this.E.run();
            } else {
                h();
                this.D.run();
            }
            this.f142o = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f143p + i4;
        this.f143p = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        m0 m0Var;
        j jVar;
        this.F.f785a = i3;
        this.f143p = getActionBarHideOffset();
        h();
        d dVar = this.f153z;
        if (dVar != null && (jVar = (m0Var = (m0) dVar).f1749s) != null) {
            jVar.a();
            m0Var.f1749s = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) != 0 && this.f136i.getVisibility() == 0) {
            return this.f141n;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f141n && !this.f142o) {
            if (this.f143p <= this.f136i.getHeight()) {
                h();
                postDelayed(this.D, 600L);
            } else {
                h();
                postDelayed(this.E, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        boolean z2;
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i3);
        k();
        int i4 = this.f144q ^ i3;
        this.f144q = i3;
        if ((i3 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        d dVar = this.f153z;
        if (dVar != null) {
            m0 m0Var = (m0) dVar;
            m0Var.f1745o = !z3;
            if (!z2 && z3) {
                if (!m0Var.f1746p) {
                    m0Var.f1746p = true;
                    m0Var.f(true);
                }
            } else if (m0Var.f1746p) {
                m0Var.f1746p = false;
                m0Var.f(true);
            }
        }
        if ((i4 & 256) != 0 && this.f153z != null) {
            WeakHashMap weakHashMap = j0.f2160a;
            a0.b(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f135g = i3;
        d dVar = this.f153z;
        if (dVar != null) {
            ((m0) dVar).f1744n = i3;
        }
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f136i.setTranslationY(-Math.max(0, Math.min(i3, this.f136i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f153z = dVar;
        if (getWindowToken() != null) {
            ((m0) this.f153z).f1744n = this.f135g;
            int i3 = this.f144q;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = j0.f2160a;
                a0.b(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f140m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f141n) {
            this.f141n = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i3) {
        Drawable drawable;
        k();
        y2 y2Var = (y2) this.f137j;
        if (i3 != 0) {
            drawable = y.B(y2Var.f2443a.getContext(), i3);
        } else {
            drawable = null;
        }
        y2Var.d = drawable;
        y2Var.c();
    }

    public void setLogo(int i3) {
        Drawable drawable;
        k();
        y2 y2Var = (y2) this.f137j;
        if (i3 != 0) {
            drawable = y.B(y2Var.f2443a.getContext(), i3);
        } else {
            drawable = null;
        }
        y2Var.f2446e = drawable;
        y2Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f139l = z2;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((y2) this.f137j).f2451k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        y2 y2Var = (y2) this.f137j;
        if (!y2Var.f2448g) {
            Toolbar toolbar = y2Var.f2443a;
            y2Var.h = charSequence;
            if ((y2Var.f2444b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (y2Var.f2448g) {
                    j0.i(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        y2 y2Var = (y2) this.f137j;
        y2Var.d = drawable;
        y2Var.c();
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // j0.l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }
}
