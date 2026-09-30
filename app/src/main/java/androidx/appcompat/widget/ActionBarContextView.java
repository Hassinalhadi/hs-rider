package androidx.appcompat.widget;

import a.b;
import a.y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.l;
import com.logistics.rider.lsposed.R;
import j.a0;
import j.m;
import j0.j0;
import j0.k0;
import k.a;
import k.g;
import k.k;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public final a f115f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f116g;
    public ActionMenuView h;

    /* renamed from: i, reason: collision with root package name */
    public k f117i;

    /* renamed from: j, reason: collision with root package name */
    public int f118j;

    /* renamed from: k, reason: collision with root package name */
    public k0 f119k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f120l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f121m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f122n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f123o;

    /* renamed from: p, reason: collision with root package name */
    public View f124p;

    /* renamed from: q, reason: collision with root package name */
    public View f125q;

    /* renamed from: r, reason: collision with root package name */
    public View f126r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f127s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f128t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f129u;

    /* renamed from: v, reason: collision with root package name */
    public final int f130v;

    /* renamed from: w, reason: collision with root package name */
    public final int f131w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f132x;

    /* renamed from: y, reason: collision with root package name */
    public final int f133y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f115f = new a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f116g = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f116g = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = y.B(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f130v = obtainStyledAttributes.getResourceId(5, 0);
        this.f131w = obtainStyledAttributes.getResourceId(4, 0);
        this.f118j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f133y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i4);
        return Math.max(0, i3 - view.getMeasuredWidth());
    }

    public static int g(View view, int i3, int i4, int i5, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z2) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(i.a aVar) {
        View view = this.f124p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f133y, (ViewGroup) this, false);
            this.f124p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f124p);
        }
        View findViewById = this.f124p.findViewById(R.id.action_mode_close_button);
        this.f125q = findViewById;
        findViewById.setOnClickListener(new l(2, aVar));
        m c3 = aVar.c();
        k kVar = this.f117i;
        if (kVar != null) {
            kVar.f();
            g gVar = kVar.f2306y;
            if (gVar != null && gVar.b()) {
                gVar.f2137i.dismiss();
            }
        }
        k kVar2 = new k(getContext());
        this.f117i = kVar2;
        kVar2.f2298q = true;
        kVar2.f2299r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c3.b(this.f117i, this.f116g);
        k kVar3 = this.f117i;
        a0 a0Var = kVar3.f2294m;
        if (a0Var == null) {
            a0 a0Var2 = (a0) kVar3.f2290i.inflate(kVar3.f2292k, (ViewGroup) this, false);
            kVar3.f2294m = a0Var2;
            a0Var2.a(kVar3.h);
            kVar3.g();
        }
        a0 a0Var3 = kVar3.f2294m;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        int i3;
        if (this.f127s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f127s = linearLayout;
            this.f128t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f129u = (TextView) this.f127s.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f130v;
            if (i4 != 0) {
                this.f128t.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f131w;
            if (i5 != 0) {
                this.f129u.setTextAppearance(getContext(), i5);
            }
        }
        this.f128t.setText(this.f122n);
        this.f129u.setText(this.f123o);
        boolean isEmpty = TextUtils.isEmpty(this.f122n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f123o);
        TextView textView = this.f129u;
        int i6 = 8;
        if (!isEmpty2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        LinearLayout linearLayout2 = this.f127s;
        if (!isEmpty || !isEmpty2) {
            i6 = 0;
        }
        linearLayout2.setVisibility(i6);
        if (this.f127s.getParent() == null) {
            addView(this.f127s);
        }
    }

    public final void e() {
        removeAllViews();
        this.f126r = null;
        this.h = null;
        this.f117i = null;
        View view = this.f125q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f119k != null) {
            return this.f115f.f2210g;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f118j;
    }

    public CharSequence getSubtitle() {
        return this.f123o;
    }

    public CharSequence getTitle() {
        return this.f122n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            k0 k0Var = this.f119k;
            if (k0Var != null) {
                k0Var.b();
            }
            super.setVisibility(i3);
        }
    }

    public final k0 i(int i3, long j3) {
        k0 k0Var = this.f119k;
        if (k0Var != null) {
            k0Var.b();
        }
        a aVar = this.f115f;
        if (i3 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            k0 a3 = j0.a(this);
            a3.a(1.0f);
            a3.c(j3);
            aVar.h.f119k = a3;
            aVar.f2210g = i3;
            a3.d(aVar);
            return a3;
        }
        k0 a4 = j0.a(this);
        a4.a(0.0f);
        a4.c(j3);
        aVar.h.f119k = a4;
        aVar.f2210g = i3;
        a4.d(aVar);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i3;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f1529a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        k kVar = this.f117i;
        if (kVar != null) {
            Configuration configuration2 = kVar.f2289g.getResources().getConfiguration();
            int i4 = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i4 <= 600 && ((i4 <= 960 || i5 <= 720) && (i4 <= 720 || i5 <= 960))) {
                if (i4 < 500 && ((i4 <= 640 || i5 <= 480) && (i4 <= 480 || i5 <= 640))) {
                    if (i4 >= 360) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 5;
            }
            kVar.f2302u = i3;
            m mVar = kVar.h;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f117i;
        if (kVar != null) {
            kVar.f();
            g gVar = this.f117i.f2306y;
            if (gVar != null && gVar.b()) {
                gVar.f2137i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f121m = false;
        }
        if (!this.f121m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f121m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f121m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        boolean z3;
        int paddingLeft;
        int paddingRight;
        int i7;
        int i8;
        int i9;
        int i10;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            paddingLeft = (i5 - i3) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f124p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f124p.getLayoutParams();
            if (z3) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (z3) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            if (z3) {
                i9 = paddingLeft - i7;
            } else {
                i9 = paddingLeft + i7;
            }
            int g3 = g(this.f124p, i9, paddingTop, paddingTop2, z3) + i9;
            if (z3) {
                i10 = g3 - i8;
            } else {
                i10 = g3 + i8;
            }
            paddingLeft = i10;
        }
        LinearLayout linearLayout = this.f127s;
        if (linearLayout != null && this.f126r == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.f127s, paddingLeft, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f126r;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z3);
        }
        if (z3) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i5 - i3) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int i7 = 1073741824;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            if (View.MeasureSpec.getMode(i4) != 0) {
                int size = View.MeasureSpec.getSize(i3);
                int i8 = this.f118j;
                if (i8 <= 0) {
                    i8 = View.MeasureSpec.getSize(i4);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i9 = i8 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
                View view = this.f124p;
                if (view != null) {
                    int f3 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f124p.getLayoutParams();
                    paddingLeft = f3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.h;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.h, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f127s;
                if (linearLayout != null && this.f126r == null) {
                    if (this.f132x) {
                        this.f127s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f127s.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f127s;
                        if (z2) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        linearLayout2.setVisibility(i6);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f126r;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i10 = layoutParams.width;
                    if (i10 != -2) {
                        i5 = 1073741824;
                    } else {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i10 >= 0) {
                        paddingLeft = Math.min(i10, paddingLeft);
                    }
                    int i11 = layoutParams.height;
                    if (i11 == -2) {
                        i7 = Integer.MIN_VALUE;
                    }
                    if (i11 >= 0) {
                        i9 = Math.min(i11, i9);
                    }
                    this.f126r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i9, i7));
                }
                if (this.f118j <= 0) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i12) {
                            i12 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i12);
                    return;
                }
                setMeasuredDimension(size, i8);
                return;
            }
            b.i(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        b.i(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f120l = false;
        }
        if (!this.f120l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f120l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f120l = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f118j = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f126r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f126r = view;
        if (view != null && (linearLayout = this.f127s) != null) {
            removeView(linearLayout);
            this.f127s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f123o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f122n = charSequence;
        d();
        j0.i(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f132x) {
            requestLayout();
        }
        this.f132x = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
