package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import b2.f;
import j.a0;
import j.l;
import j.m;
import j.o;
import k.g;
import k.j;
import k.k;
import k.n;
import k.r1;
import k.r2;
import k.s1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ActionMenuView extends s1 implements l, a0 {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public n E;

    /* renamed from: u, reason: collision with root package name */
    public m f154u;

    /* renamed from: v, reason: collision with root package name */
    public Context f155v;

    /* renamed from: w, reason: collision with root package name */
    public int f156w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f157x;

    /* renamed from: y, reason: collision with root package name */
    public k f158y;

    /* renamed from: z, reason: collision with root package name */
    public r2 f159z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f3);
        this.D = (int) (f3 * 4.0f);
        this.f155v = context;
        this.f156w = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.m] */
    public static k.m j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f2315a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k.m] */
    public static k.m k(ViewGroup.LayoutParams layoutParams) {
        k.m mVar;
        if (layoutParams != null) {
            if (layoutParams instanceof k.m) {
                k.m mVar2 = (k.m) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) mVar2);
                layoutParams2.f2315a = mVar2.f2315a;
                mVar = layoutParams2;
            } else {
                mVar = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) mVar).gravity = 16;
            }
            return mVar;
        }
        return j();
    }

    @Override // j.a0
    public final void a(m mVar) {
        this.f154u = mVar;
    }

    @Override // j.l
    public final boolean b(o oVar) {
        return this.f154u.q(oVar, null, 0);
    }

    @Override // k.s1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k.m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.s1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ r1 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    @Override // k.s1
    /* renamed from: g */
    public final r1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // k.s1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // k.s1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f154u == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f154u = mVar;
            mVar.f2076e = new androidx.emoji2.text.m(18, this);
            k kVar = new k(context);
            this.f158y = kVar;
            kVar.f2298q = true;
            kVar.f2299r = true;
            kVar.f2291j = new f(13);
            this.f154u.b(kVar, this.f155v);
            k kVar2 = this.f158y;
            kVar2.f2294m = this;
            this.f154u = kVar2.h;
        }
        return this.f154u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k kVar = this.f158y;
        j jVar = kVar.f2295n;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f2297p) {
            return kVar.f2296o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f156w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // k.s1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ r1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i3) {
        boolean z2 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof k.l)) {
            z2 = ((k.l) childAt).a();
        }
        if (i3 > 0 && (childAt2 instanceof k.l)) {
            return ((k.l) childAt2).b() | z2;
        }
        return z2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVar = this.f158y;
        if (kVar != null) {
            kVar.g();
            if (this.f158y.k()) {
                this.f158y.f();
                this.f158y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f158y;
        if (kVar != null) {
            kVar.f();
            g gVar = kVar.f2306y;
            if (gVar != null && gVar.b()) {
                gVar.f2137i.dismiss();
            }
        }
    }

    @Override // k.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        boolean z3;
        int i7;
        int width;
        int i8;
        if (!this.A) {
            super.onLayout(z2, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i5 - i3;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                k.m mVar = (k.m) childAt.getLayoutParams();
                if (mVar.f2315a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    l(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i7 = paddingRight / i17;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, i7);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                k.m mVar2 = (k.m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f2315a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            k.m mVar3 = (k.m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f2315a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.s1, android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        ?? r11;
        boolean z5;
        int i9;
        int i10;
        ActionMenuItemView actionMenuItemView;
        boolean z6;
        int i11;
        boolean z7;
        m mVar;
        boolean z8 = this.A;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A = z2;
        if (z8 != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.A && (mVar = this.f154u) != null && size != this.B) {
            this.B = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (this.A && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i4);
            int size2 = View.MeasureSpec.getSize(i3);
            int size3 = View.MeasureSpec.getSize(i4);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
            int i12 = size2 - paddingRight;
            int i13 = this.C;
            int i14 = i12 / i13;
            int i15 = i12 % i13;
            if (i14 == 0) {
                setMeasuredDimension(i12, 0);
                return;
            }
            int i16 = (i15 / i14) + i13;
            int childCount2 = getChildCount();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            boolean z9 = false;
            int i21 = 0;
            long j3 = 0;
            while (true) {
                i5 = this.D;
                if (i20 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i20);
                int i22 = size3;
                int i23 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i10 = i16;
                } else {
                    boolean z10 = childAt instanceof ActionMenuItemView;
                    i18++;
                    if (z10) {
                        childAt.setPadding(i5, 0, i5, 0);
                    }
                    k.m mVar2 = (k.m) childAt.getLayoutParams();
                    mVar2.f2319f = false;
                    mVar2.f2317c = 0;
                    mVar2.f2316b = 0;
                    mVar2.d = false;
                    ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
                    ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                    if (z10 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    mVar2.f2318e = z5;
                    if (mVar2.f2315a) {
                        i9 = 1;
                    } else {
                        i9 = i14;
                    }
                    k.m mVar3 = (k.m) childAt.getLayoutParams();
                    int i24 = i14;
                    i10 = i16;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i23, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z10) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z11 = z6;
                    if (i9 > 0 && (!z6 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i9, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i11 = measuredWidth / i10;
                        if (measuredWidth % i10 != 0) {
                            i11++;
                        }
                        if (z11 && i11 < 2) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (!mVar3.f2315a && z11) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    mVar3.d = z7;
                    mVar3.f2316b = i11;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, 1073741824), makeMeasureSpec);
                    i19 = Math.max(i19, i11);
                    if (mVar2.d) {
                        i21++;
                    }
                    if (mVar2.f2315a) {
                        z9 = true;
                    }
                    i14 = i24 - i11;
                    i17 = Math.max(i17, childAt.getMeasuredHeight());
                    if (i11 == 1) {
                        j3 |= 1 << i20;
                    }
                }
                i20++;
                size3 = i22;
                paddingBottom = i23;
                i16 = i10;
            }
            int i25 = size3;
            int i26 = i14;
            int i27 = i16;
            if (z9 && i18 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i28 = i26;
            boolean z12 = false;
            while (i21 > 0 && i28 > 0) {
                int i29 = Integer.MAX_VALUE;
                long j4 = 0;
                int i30 = 0;
                int i31 = 0;
                while (i31 < childCount2) {
                    int i32 = i17;
                    k.m mVar4 = (k.m) getChildAt(i31).getLayoutParams();
                    boolean z13 = z3;
                    if (mVar4.d) {
                        int i33 = mVar4.f2316b;
                        if (i33 < i29) {
                            j4 = 1 << i31;
                            i29 = i33;
                            i30 = 1;
                        } else if (i33 == i29) {
                            j4 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z3 = z13;
                    i17 = i32;
                }
                i6 = i17;
                boolean z14 = z3;
                j3 |= j4;
                if (i30 > i28) {
                    break;
                }
                int i34 = i29 + 1;
                int i35 = 0;
                while (i35 < childCount2) {
                    View childAt2 = getChildAt(i35);
                    k.m mVar5 = (k.m) childAt2.getLayoutParams();
                    boolean z15 = z9;
                    long j5 = 1 << i35;
                    if ((j4 & j5) == 0) {
                        if (mVar5.f2316b == i34) {
                            j3 |= j5;
                        }
                    } else {
                        if (z14 && mVar5.f2318e) {
                            r11 = 1;
                            r11 = 1;
                            if (i28 == 1) {
                                childAt2.setPadding(i5 + i27, 0, i5, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        mVar5.f2316b += r11;
                        mVar5.f2319f = r11;
                        i28--;
                    }
                    i35++;
                    z9 = z15;
                }
                z3 = z14;
                i17 = i6;
                z12 = true;
            }
            i6 = i17;
            if (!z9 && i18 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i28 > 0 && j3 != 0 && (i28 < i18 - 1 || z4 || i19 > 1)) {
                float bitCount = Long.bitCount(j3);
                if (!z4) {
                    if ((j3 & 1) != 0 && !((k.m) getChildAt(0).getLayoutParams()).f2318e) {
                        bitCount -= 0.5f;
                    }
                    int i36 = childCount2 - 1;
                    if ((j3 & (1 << i36)) != 0 && !((k.m) getChildAt(i36).getLayoutParams()).f2318e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i28 * i27) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z16 = z12;
                for (int i37 = 0; i37 < childCount2; i37++) {
                    if ((j3 & (1 << i37)) != 0) {
                        View childAt3 = getChildAt(i37);
                        k.m mVar6 = (k.m) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            mVar6.f2317c = i8;
                            mVar6.f2319f = true;
                            if (i37 == 0 && !mVar6.f2318e) {
                                ((LinearLayout.LayoutParams) mVar6).leftMargin = (-i8) / 2;
                            }
                            z16 = true;
                        } else if (mVar6.f2315a) {
                            mVar6.f2317c = i8;
                            mVar6.f2319f = true;
                            ((LinearLayout.LayoutParams) mVar6).rightMargin = (-i8) / 2;
                            z16 = true;
                        } else {
                            if (i37 != 0) {
                                ((LinearLayout.LayoutParams) mVar6).leftMargin = i8 / 2;
                            }
                            if (i37 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) mVar6).rightMargin = i8 / 2;
                            }
                        }
                    }
                }
                z12 = z16;
            }
            if (z12) {
                for (int i38 = 0; i38 < childCount2; i38++) {
                    View childAt4 = getChildAt(i38);
                    k.m mVar7 = (k.m) childAt4.getLayoutParams();
                    if (mVar7.f2319f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar7.f2316b * i27) + mVar7.f2317c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i7 = i6;
            } else {
                i7 = i25;
            }
            setMeasuredDimension(i12, i7);
            return;
        }
        for (int i39 = 0; i39 < childCount; i39++) {
            k.m mVar8 = (k.m) getChildAt(i39).getLayoutParams();
            ((LinearLayout.LayoutParams) mVar8).rightMargin = 0;
            ((LinearLayout.LayoutParams) mVar8).leftMargin = 0;
        }
        super.onMeasure(i3, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f158y.f2303v = z2;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.E = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k kVar = this.f158y;
        j jVar = kVar.f2295n;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.f2297p = true;
            kVar.f2296o = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f157x = z2;
    }

    public void setPopupTheme(int i3) {
        if (this.f156w != i3) {
            this.f156w = i3;
            if (i3 == 0) {
                this.f155v = getContext();
            } else {
                this.f155v = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(k kVar) {
        this.f158y = kVar;
        kVar.f2294m = this;
        this.f154u = kVar.h;
    }

    @Override // k.s1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
