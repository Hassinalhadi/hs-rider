package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b0.l;
import com.google.android.material.datepicker.j;
import j.o;
import j.z;
import j0.j0;
import k.r1;
import k.z2;
import w1.e;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements z {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public o G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final j K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        j jVar = new j(3, this);
        this.K = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.logistics.rider.lsposed.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.logistics.rider.lsposed.R.id.design_menu_item_text);
        this.E = checkedTextView;
        j0.h(checkedTextView, jVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.logistics.rider.lsposed.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // j.z
    public final void c(o oVar) {
        int i3;
        StateListDrawable stateListDrawable;
        this.G = oVar;
        int i4 = oVar.f2097a;
        if (i4 > 0) {
            setId(i4);
        }
        if (oVar.isVisible()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        setVisibility(i3);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.logistics.rider.lsposed.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f2100e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f2111q);
        z2.a(this, oVar.f2112r);
        o oVar2 = this.G;
        CharSequence charSequence = oVar2.f2100e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && oVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                r1 r1Var = (r1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) r1Var).width = -1;
                this.F.setLayoutParams(r1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            r1 r1Var2 = (r1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) r1Var2).width = -2;
            this.F.setLayoutParams(r1Var2);
        }
    }

    @Override // j.z
    public o getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        o oVar = this.G;
        if (oVar != null && oVar.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.C != z2) {
            this.C = z2;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z2) {
        int i3;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z2);
        Typeface typeface = checkedTextView.getTypeface();
        if (z2 && this.D) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        checkedTextView.setTypeface(typeface, i3);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
            }
            int i3 = this.A;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f696a;
                Drawable drawable2 = resources.getDrawable(com.logistics.rider.lsposed.R.drawable.navigation_empty_icon, theme);
                this.J = drawable2;
                if (drawable2 != null) {
                    int i4 = this.A;
                    drawable2.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.E.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.A = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z2;
        this.H = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z2;
        o oVar = this.G;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.E.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.B = z2;
    }

    public void setTextAppearance(int i3) {
        this.E.setTextAppearance(i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
