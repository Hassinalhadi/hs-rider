package e2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;
import java.util.List;
import java.util.Locale;
import k.a2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x extends k.o {

    /* renamed from: j, reason: collision with root package name */
    public final a2 f1509j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f1510k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1511l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1512m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1513n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f1514o;

    /* renamed from: p, reason: collision with root package name */
    public int f1515p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f1516q;

    public x(Context context, AttributeSet attributeSet) {
        super(g2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1511l = new Rect();
        Context context2 = getContext();
        TypedArray e3 = w1.j.e(context2, attributeSet, i1.a.f1976i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (e3.hasValue(0) && e3.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1512m = e3.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1513n = e3.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (e3.hasValue(2)) {
            this.f1514o = ColorStateList.valueOf(e3.getColor(2, 0));
        }
        this.f1515p = e3.getColor(4, 0);
        this.f1516q = k2.h.l(context2, e3, 5);
        this.f1510k = (AccessibilityManager) context2.getSystemService("accessibility");
        a2 a2Var = new a2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f1509j = a2Var;
        a2Var.D = true;
        a2Var.E.setFocusable(true);
        a2Var.f2227t = this;
        a2Var.E.setInputMethodMode(2);
        a2Var.o(getAdapter());
        a2Var.f2228u = new v(0, this);
        if (e3.hasValue(6)) {
            setSimpleItems(e3.getResourceId(6, 0));
        }
        e3.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1510k;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f1509j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1514o;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b3 = b();
        if (b3 != null && b3.K) {
            return b3.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f1513n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1515p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1516q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b3 = b();
        if (b3 != null && b3.K && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1509j.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int selectedItemPosition;
        super.onMeasure(i3, i4);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b3 = b();
            int i5 = 0;
            if (adapter != null && b3 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                a2 a2Var = this.f1509j;
                if (!a2Var.E.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = a2Var.h.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b3);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = a2Var.E.getBackground();
                if (background != null) {
                    Rect rect = this.f1511l;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b3.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t3) {
        super.setAdapter(t3);
        this.f1509j.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        a2 a2Var = this.f1509j;
        if (a2Var != null) {
            a2Var.m(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i3) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i3));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1514o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof b2.j) {
            ((b2.j) dropDownBackground).m(this.f1514o);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1509j.f2229v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i3) {
        super.setRawInputType(i3);
        TextInputLayout b3 = b();
        if (b3 != null) {
            b3.u();
        }
    }

    public void setSimpleItemSelectedColor(int i3) {
        this.f1515p = i3;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1516q = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.f1512m, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f1509j.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i3) {
        setSimpleItems(getResources().getStringArray(i3));
    }
}
