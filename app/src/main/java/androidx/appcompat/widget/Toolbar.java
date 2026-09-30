package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.emoji2.text.s;
import androidx.fragment.app.d0;
import androidx.fragment.app.g;
import com.google.android.material.datepicker.l;
import com.logistics.rider.lsposed.R;
import f.a;
import i.h;
import j.m;
import j.o;
import j0.g0;
import j0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.g1;
import k.j2;
import k.k;
import k.q2;
import k.r2;
import k.s2;
import k.t2;
import k.u2;
import k.v2;
import k.w2;
import k.x2;
import k.y;
import k.y2;
import k.z;
import k.z0;
import k.z2;
import o0.b;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final s L;
    public ArrayList M;
    public final r2 N;
    public y2 O;
    public k P;
    public t2 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final g V;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuView f173f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f174g;
    public z0 h;

    /* renamed from: i, reason: collision with root package name */
    public y f175i;

    /* renamed from: j, reason: collision with root package name */
    public z f176j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f177k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f178l;

    /* renamed from: m, reason: collision with root package name */
    public y f179m;

    /* renamed from: n, reason: collision with root package name */
    public View f180n;

    /* renamed from: o, reason: collision with root package name */
    public Context f181o;

    /* renamed from: p, reason: collision with root package name */
    public int f182p;

    /* renamed from: q, reason: collision with root package name */
    public int f183q;

    /* renamed from: r, reason: collision with root package name */
    public int f184r;

    /* renamed from: s, reason: collision with root package name */
    public final int f185s;

    /* renamed from: t, reason: collision with root package name */
    public final int f186t;

    /* renamed from: u, reason: collision with root package name */
    public int f187u;

    /* renamed from: v, reason: collision with root package name */
    public int f188v;

    /* renamed from: w, reason: collision with root package name */
    public int f189w;

    /* renamed from: x, reason: collision with root package name */
    public int f190x;

    /* renamed from: y, reason: collision with root package name */
    public j2 f191y;

    /* renamed from: z, reason: collision with root package name */
    public int f192z;

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new s(new q2(this, 1));
        this.M = new ArrayList();
        this.N = new r2(this);
        this.V = new g(9, this);
        Context context2 = getContext();
        int[] iArr = a.f1549w;
        s r3 = s.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r3.f310c;
        WeakHashMap weakHashMap = j0.f2160a;
        g0.b(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        TypedArray typedArray2 = (TypedArray) r3.f310c;
        this.f183q = typedArray2.getResourceId(28, 0);
        this.f184r = typedArray2.getResourceId(19, 0);
        this.B = typedArray2.getInteger(0, 8388627);
        this.f185s = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f190x = dimensionPixelOffset;
        this.f189w = dimensionPixelOffset;
        this.f188v = dimensionPixelOffset;
        this.f187u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f187u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f188v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f189w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f190x = dimensionPixelOffset5;
        }
        this.f186t = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        d();
        j2 j2Var = this.f191y;
        j2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j2Var.f2285e = dimensionPixelSize;
            j2Var.f2282a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j2Var.f2286f = dimensionPixelSize2;
            j2Var.f2283b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f192z = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f177k = r3.i(4);
        this.f178l = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f181o = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable i4 = r3.i(16);
        if (i4 != null) {
            setNavigationIcon(i4);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable i5 = r3.i(11);
        if (i5 != null) {
            setLogo(i5);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(r3.h(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(r3.h(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        r3.t();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.u2, android.view.ViewGroup$MarginLayoutParams] */
    public static u2 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f2414b = 0;
        marginLayoutParams.f2413a = 8388627;
        return marginLayoutParams;
    }

    public static u2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof u2;
        if (z2) {
            u2 u2Var = (u2) layoutParams;
            u2 u2Var2 = new u2(u2Var);
            u2Var2.f2414b = 0;
            u2Var2.f2414b = u2Var.f2414b;
            return u2Var2;
        }
        if (z2) {
            u2 u2Var3 = new u2((u2) layoutParams);
            u2Var3.f2414b = 0;
            return u2Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            u2 u2Var4 = new u2(marginLayoutParams);
            u2Var4.f2414b = 0;
            ((ViewGroup.MarginLayoutParams) u2Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) u2Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) u2Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) u2Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return u2Var4;
        }
        u2 u2Var5 = new u2(layoutParams);
        u2Var5.f2414b = 0;
        return u2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        boolean z2;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (z2) {
            for (int i4 = childCount - 1; i4 >= 0; i4--) {
                View childAt = getChildAt(i4);
                u2 u2Var = (u2) childAt.getLayoutParams();
                if (u2Var.f2414b == 0 && s(childAt)) {
                    int i5 = u2Var.f2413a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            u2 u2Var2 = (u2) childAt2.getLayoutParams();
            if (u2Var2.f2414b == 0 && s(childAt2)) {
                int i7 = u2Var2.f2413a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        u2 u2Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u2Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            u2Var = i(layoutParams);
        } else {
            u2Var = (u2) layoutParams;
        }
        u2Var.f2414b = 1;
        if (z2 && this.f180n != null) {
            view.setLayoutParams(u2Var);
            this.J.add(view);
        } else {
            addView(view, u2Var);
        }
    }

    public final void c() {
        if (this.f179m == null) {
            y yVar = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f179m = yVar;
            yVar.setImageDrawable(this.f177k);
            this.f179m.setContentDescription(this.f178l);
            u2 h = h();
            h.f2413a = (this.f185s & 112) | 8388611;
            h.f2414b = 2;
            this.f179m.setLayoutParams(h);
            this.f179m.setOnClickListener(new l(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof u2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k.j2] */
    public final void d() {
        if (this.f191y == null) {
            ?? obj = new Object();
            obj.f2282a = 0;
            obj.f2283b = 0;
            obj.f2284c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.f2285e = 0;
            obj.f2286f = 0;
            obj.f2287g = false;
            obj.h = false;
            this.f191y = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f173f;
        if (actionMenuView.f154u == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new t2(this);
            }
            this.f173f.setExpandedActionViewsExclusive(true);
            mVar.b(this.Q, this.f181o);
            t();
        }
    }

    public final void f() {
        if (this.f173f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f173f = actionMenuView;
            actionMenuView.setPopupTheme(this.f182p);
            this.f173f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f173f;
            r2 r2Var = new r2(this);
            actionMenuView2.getClass();
            actionMenuView2.f159z = r2Var;
            u2 h = h();
            h.f2413a = (this.f185s & 112) | 8388613;
            this.f173f.setLayoutParams(h);
            b(this.f173f, false);
        }
    }

    public final void g() {
        if (this.f175i == null) {
            this.f175i = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            u2 h = h();
            h.f2413a = (this.f185s & 112) | 8388611;
            this.f175i.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.u2, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f2413a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1530b);
        marginLayoutParams.f2413a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f2414b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        y yVar = this.f179m;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        y yVar = this.f179m;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        j2 j2Var = this.f191y;
        if (j2Var != null) {
            if (j2Var.f2287g) {
                return j2Var.f2282a;
            }
            return j2Var.f2283b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.A;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        j2 j2Var = this.f191y;
        if (j2Var != null) {
            return j2Var.f2282a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        j2 j2Var = this.f191y;
        if (j2Var != null) {
            return j2Var.f2283b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        j2 j2Var = this.f191y;
        if (j2Var != null) {
            if (j2Var.f2287g) {
                return j2Var.f2283b;
            }
            return j2Var.f2282a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f192z;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f173f;
        if (actionMenuView != null && (mVar = actionMenuView.f154u) != null && mVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.A, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f192z, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        z zVar = this.f176j;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        z zVar = this.f176j;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f173f.getMenu();
    }

    public View getNavButtonView() {
        return this.f175i;
    }

    public CharSequence getNavigationContentDescription() {
        y yVar = this.f175i;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        y yVar = this.f175i;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f173f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f181o;
    }

    public int getPopupTheme() {
        return this.f182p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.f190x;
    }

    public int getTitleMarginEnd() {
        return this.f188v;
    }

    public int getTitleMarginStart() {
        return this.f187u;
    }

    public int getTitleMarginTop() {
        return this.f189w;
    }

    public final TextView getTitleTextView() {
        return this.f174g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k.y2] */
    public g1 getWrapper() {
        boolean z2;
        Drawable drawable;
        if (this.O == null) {
            ?? obj = new Object();
            obj.f2454n = 0;
            obj.f2443a = this;
            obj.h = getTitle();
            obj.f2449i = getSubtitle();
            if (obj.h != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj.f2448g = z2;
            obj.f2447f = getNavigationIcon();
            String str = null;
            s r3 = s.r(getContext(), null, a.f1529a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) r3.f310c;
            obj.f2455o = r3.i(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f2448g = true;
                obj.h = text;
                if ((obj.f2444b & 8) != 0) {
                    setTitle(text);
                    if (obj.f2448g) {
                        j0.i(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f2449i = text2;
                if ((obj.f2444b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable i3 = r3.i(20);
            if (i3 != null) {
                obj.f2446e = i3;
                obj.c();
            }
            Drawable i4 = r3.i(17);
            if (i4 != null) {
                obj.d = i4;
                obj.c();
            }
            if (obj.f2447f == null && (drawable = obj.f2455o) != null) {
                obj.f2447f = drawable;
                if ((obj.f2444b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f2445c;
                if (view != null && (obj.f2444b & 16) != 0) {
                    removeView(view);
                }
                obj.f2445c = inflate;
                if (inflate != null && (obj.f2444b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f2444b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f191y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f183q = resourceId2;
                z0 z0Var = this.f174g;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f184r = resourceId3;
                z0 z0Var2 = this.h;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r3.t();
            if (R.string.abc_action_bar_up_description != obj.f2454n) {
                obj.f2454n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = obj.f2454n;
                    if (i5 != 0) {
                        str = getContext().getString(i5);
                    }
                    obj.f2450j = str;
                    obj.b();
                }
            }
            obj.f2450j = getNavigationContentDescription();
            setNavigationOnClickListener(new x2(obj));
            this.O = obj;
        }
        return this.O;
    }

    public final int j(View view, int i3) {
        int i4;
        u2 u2Var = (u2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 > 0) {
            i4 = (measuredHeight - i3) / 2;
        } else {
            i4 = 0;
        }
        int i5 = u2Var.f2413a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.B & 112;
        }
        if (i5 != 48) {
            if (i5 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i7 = ((ViewGroup.MarginLayoutParams) u2Var).topMargin;
                if (i6 < i7) {
                    i6 = i7;
                } else {
                    int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
                    int i9 = ((ViewGroup.MarginLayoutParams) u2Var).bottomMargin;
                    if (i8 < i9) {
                        i6 = Math.max(0, i6 - (i9 - i8));
                    }
                }
                return paddingTop + i6;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u2Var).bottomMargin) - i4;
        }
        return getPaddingTop() - i4;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.f310c).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f373a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        if (view.getParent() != this && !this.J.contains(view)) {
            return false;
        }
        return true;
    }

    public final int o(View view, int i3, int i4, int[] iArr) {
        u2 u2Var = (u2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) u2Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u2Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        char c3;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c3 = 0;
        } else {
            c3 = 1;
            objArr = false;
        }
        if (s(this.f175i)) {
            r(this.f175i, i3, 0, i4, this.f186t);
            i5 = k(this.f175i) + this.f175i.getMeasuredWidth();
            i6 = Math.max(0, l(this.f175i) + this.f175i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f175i.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (s(this.f179m)) {
            r(this.f179m, i3, 0, i4, this.f186t);
            i5 = k(this.f179m) + this.f179m.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f179m) + this.f179m.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f179m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.f173f)) {
            r(this.f173f, i3, max, i4, this.f186t);
            i8 = k(this.f173f) + this.f173f.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f173f) + this.f173f.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f173f.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i8);
        if (s(this.f180n)) {
            max3 += q(this.f180n, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f180n) + this.f180n.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f180n.getMeasuredState());
        }
        if (s(this.f176j)) {
            max3 += q(this.f176j, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f176j) + this.f176j.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f176j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((u2) childAt.getLayoutParams()).f2414b == 0 && s(childAt)) {
                max3 += q(childAt, i3, max3, i4, 0, iArr);
                int max4 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f189w + this.f190x;
        int i16 = this.f187u + this.f188v;
        if (s(this.f174g)) {
            q(this.f174g, i3, i14 + i16, i4, i15, iArr);
            int k3 = k(this.f174g) + this.f174g.getMeasuredWidth();
            i9 = l(this.f174g) + this.f174g.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f174g.getMeasuredState());
            i11 = k3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (s(this.h)) {
            i11 = Math.max(i11, q(this.h, i3, i14 + i16, i4, i15 + i9, iArr));
            i9 += l(this.h) + this.h.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.h.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.R) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        m mVar;
        MenuItem findItem;
        if (!(parcelable instanceof w2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w2 w2Var = (w2) parcelable;
        super.onRestoreInstanceState(w2Var.f2612f);
        ActionMenuView actionMenuView = this.f173f;
        if (actionMenuView != null) {
            mVar = actionMenuView.f154u;
        } else {
            mVar = null;
        }
        int i3 = w2Var.h;
        if (i3 != 0 && this.Q != null && mVar != null && (findItem = mVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (w2Var.f2433i) {
            g gVar = this.V;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        j2 j2Var = this.f191y;
        boolean z2 = true;
        if (i3 != 1) {
            z2 = false;
        }
        if (z2 == j2Var.f2287g) {
            return;
        }
        j2Var.f2287g = z2;
        if (j2Var.h) {
            if (z2) {
                int i4 = j2Var.d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = j2Var.f2285e;
                }
                j2Var.f2282a = i4;
                int i5 = j2Var.f2284c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = j2Var.f2286f;
                }
                j2Var.f2283b = i5;
                return;
            }
            int i6 = j2Var.f2284c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = j2Var.f2285e;
            }
            j2Var.f2282a = i6;
            int i7 = j2Var.d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = j2Var.f2286f;
            }
            j2Var.f2283b = i7;
            return;
        }
        j2Var.f2282a = j2Var.f2285e;
        j2Var.f2283b = j2Var.f2286f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, o0.b, k.w2] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        k kVar;
        o oVar;
        ?? bVar = new b(super.onSaveInstanceState());
        t2 t2Var = this.Q;
        if (t2Var != null && (oVar = t2Var.f2409g) != null) {
            bVar.h = oVar.f2097a;
        }
        ActionMenuView actionMenuView = this.f173f;
        if (actionMenuView != null && (kVar = actionMenuView.f158y) != null && kVar.k()) {
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.f2433i = z2;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final int p(View view, int i3, int i4, int[] iArr) {
        u2 u2Var = (u2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) u2Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) u2Var).leftMargin);
    }

    public final int q(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.U != z2) {
            this.U = z2;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        y yVar = this.f179m;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f179m.setImageDrawable(drawable);
        } else {
            y yVar = this.f179m;
            if (yVar != null) {
                yVar.setImageDrawable(this.f177k);
            }
        }
    }

    public void setCollapsible(boolean z2) {
        this.R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.A) {
            this.A = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f192z) {
            this.f192z = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        z zVar = this.f176j;
        if (drawable != null) {
            if (zVar == null) {
                this.f176j = new z(getContext(), null, 0);
            }
            if (!n(this.f176j)) {
                b(this.f176j, true);
            }
        } else if (zVar != null && n(zVar)) {
            removeView(this.f176j);
            this.J.remove(this.f176j);
        }
        z zVar2 = this.f176j;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f176j == null) {
            this.f176j = new z(getContext(), null, 0);
        }
        z zVar = this.f176j;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        y yVar = this.f175i;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            z2.a(this.f175i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f175i)) {
                b(this.f175i, true);
            }
        } else {
            y yVar = this.f175i;
            if (yVar != null && n(yVar)) {
                removeView(this.f175i);
                this.J.remove(this.f175i);
            }
        }
        y yVar2 = this.f175i;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f175i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f173f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f182p != i3) {
            this.f182p = i3;
            if (i3 == 0) {
                this.f181o = getContext();
            } else {
                this.f181o = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z0 z0Var = this.h;
        if (!isEmpty) {
            if (z0Var == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.h = z0Var2;
                z0Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f184r;
                if (i3 != 0) {
                    this.h.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (z0Var != null && n(z0Var)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        z0 z0Var3 = this.h;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z0 z0Var = this.f174g;
        if (!isEmpty) {
            if (z0Var == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.f174g = z0Var2;
                z0Var2.setSingleLine();
                this.f174g.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f183q;
                if (i3 != 0) {
                    this.f174g.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f174g.setTextColor(colorStateList);
                }
            }
            if (!n(this.f174g)) {
                b(this.f174g, true);
            }
        } else if (z0Var != null && n(z0Var)) {
            removeView(this.f174g);
            this.J.remove(this.f174g);
        }
        z0 z0Var3 = this.f174g;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i3) {
        this.f190x = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f188v = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f187u = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f189w = i3;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        z0 z0Var = this.f174g;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = s2.a(this);
            t2 t2Var = this.Q;
            if (t2Var != null && t2Var.f2409g != null && a3 != null && isAttachedToWindow() && this.U) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.T == null) {
                if (this.S == null) {
                    this.S = s2.b(new q2(this, 0));
                }
                s2.c(a3, this.S);
                this.T = a3;
                return;
            }
            if (!z2 && (onBackInvokedDispatcher = this.T) != null) {
                s2.d(onBackInvokedDispatcher, this.S);
                this.T = null;
            }
        }
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(a.y.B(getContext(), i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(a.y.B(getContext(), i3));
    }

    public void setLogo(int i3) {
        setLogo(a.y.B(getContext(), i3));
    }

    public void setOnMenuItemClickListener(v2 v2Var) {
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
