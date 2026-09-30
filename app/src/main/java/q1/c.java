package q1;

import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.emoji2.text.s;
import b0.l;
import com.logistics.rider.lsposed.R;
import g1.d;
import g1.e;
import g1.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.r;
import k2.h;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends r {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final f B;
    public final a C;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2786j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2787k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2788l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2789m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2791o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2792p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2793q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f2794r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2795s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f2796t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2797u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f2798v;

    /* renamed from: w, reason: collision with root package name */
    public int f2799w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f2800x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2801y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2802z;

    public c(Context context, AttributeSet attributeSet) {
        super(g2.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f2786j = new LinkedHashSet();
        this.f2787k = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = l.f696a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f1824f = drawable;
        drawable.setCallback(fVar.f1823k);
        new e(fVar.f1824f.getConstantState());
        this.B = fVar;
        this.C = new a(this);
        Context context3 = getContext();
        this.f2793q = getButtonDrawable();
        this.f2796t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        j.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = i1.a.f1982o;
        j.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        s sVar = new s(context3, obtainStyledAttributes);
        this.f2794r = sVar.i(2);
        if (this.f2793q != null && h.Q(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f2793q = y.B(context3, R.drawable.mtrl_checkbox_button);
                this.f2795s = true;
                if (this.f2794r == null) {
                    this.f2794r = y.B(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f2797u = h.m(context3, sVar, 3);
        this.f2798v = j.f(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2789m = obtainStyledAttributes.getBoolean(10, false);
        this.f2790n = obtainStyledAttributes.getBoolean(6, true);
        this.f2791o = obtainStyledAttributes.getBoolean(9, false);
        this.f2792p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        sVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i3 = this.f2799w;
        if (i3 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i3 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2788l == null) {
            int k3 = h.k(this, R.attr.colorControlActivated);
            int k4 = h.k(this, R.attr.colorError);
            int k5 = h.k(this, R.attr.colorSurface);
            int k6 = h.k(this, R.attr.colorOnSurface);
            this.f2788l = new ColorStateList(F, new int[]{h.C(k5, k4, 1.0f), h.C(k5, k3, 1.0f), h.C(k5, k6, 0.54f), h.C(k5, k6, 0.38f), h.C(k5, k6, 0.38f)});
        }
        return this.f2788l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2796t;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e2.l lVar;
        Drawable drawable = this.f2793q;
        ColorStateList colorStateList3 = this.f2796t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f2793q = drawable;
        Drawable drawable2 = this.f2794r;
        ColorStateList colorStateList4 = this.f2797u;
        PorterDuff.Mode mode = this.f2798v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f2794r = drawable2;
        if (this.f2795s) {
            f fVar = this.B;
            if (fVar != null) {
                d dVar = fVar.f1820g;
                Drawable drawable3 = fVar.f1824f;
                a aVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f2783a == null) {
                        aVar.f2783a = new g1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f2783a);
                }
                ArrayList arrayList = fVar.f1822j;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f1822j.size() == 0 && (lVar = fVar.f1821i) != null) {
                        dVar.f1817b.removeListener(lVar);
                        fVar.f1821i = null;
                    }
                }
                Drawable drawable4 = fVar.f1824f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f2783a == null) {
                        aVar.f2783a = new g1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f2783a);
                } else if (aVar != null) {
                    if (fVar.f1822j == null) {
                        fVar.f1822j = new ArrayList();
                    }
                    if (!fVar.f1822j.contains(aVar)) {
                        fVar.f1822j.add(aVar);
                        if (fVar.f1821i == null) {
                            fVar.f1821i = new e2.l(2, fVar);
                        }
                        dVar.f1817b.addListener(fVar.f1821i);
                    }
                }
            }
            Drawable drawable5 = this.f2793q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f2793q).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f2793q;
        if (drawable6 != null && (colorStateList2 = this.f2796t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f2794r;
        if (drawable7 != null && (colorStateList = this.f2797u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f2793q;
        Drawable drawable9 = this.f2794r;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f3 = intrinsicWidth / intrinsicHeight;
                if (f3 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f3);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f3 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f2793q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2794r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2797u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2798v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2796t;
    }

    public int getCheckedState() {
        return this.f2799w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2792p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f2799w == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2789m && this.f2796t == null && this.f2797u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.f2791o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        int i4 = 0;
        while (true) {
            if (i4 < onCreateDrawableState.length) {
                int i5 = onCreateDrawableState[i4];
                if (i5 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i5 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i4] = 16842912;
                    break;
                }
                i4++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f2800x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.f2790n && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i3 = 1;
            if (getLayoutDirection() == 1) {
                i3 = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i3;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f2791o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f2792p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f2785f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, q1.b, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2785f = getCheckedState();
        return baseSavedState;
    }

    @Override // k.r, android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(y.B(getContext(), i3));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2794r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i3) {
        setButtonIconDrawable(y.B(getContext(), i3));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2797u == colorStateList) {
            return;
        }
        this.f2797u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2798v == mode) {
            return;
        }
        this.f2798v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2796t == colorStateList) {
            return;
        }
        this.f2796t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f2790n = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i3) {
        boolean z2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2799w != i3) {
            this.f2799w = i3;
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setChecked(z2);
            refreshDrawableState();
            if (this.f2802z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f2801y) {
                this.f2801y = true;
                LinkedHashSet linkedHashSet = this.f2787k;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        a.b.c();
                        return;
                    }
                }
                if (this.f2799w != 2 && (onCheckedChangeListener = this.A) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f2801y = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2792p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i3) {
        CharSequence charSequence;
        if (i3 != 0) {
            charSequence = getResources().getText(i3);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z2) {
        if (this.f2791o != z2) {
            this.f2791o = z2;
            refreshDrawableState();
            Iterator it = this.f2786j.iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next().getClass();
            a.b.c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f2802z = charSequence;
        if (charSequence == null) {
            if (charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f2789m = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // k.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f2793q = drawable;
        this.f2795s = false;
        a();
    }
}
