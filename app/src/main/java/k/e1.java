package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e1 extends ToggleButton {

    /* renamed from: f, reason: collision with root package name */
    public final p f2251f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f2252g;
    public x h;

    public e1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        m2.a(this, getContext());
        p pVar = new p(this);
        this.f2251f = pVar;
        pVar.d(attributeSet, R.attr.buttonStyleToggle);
        w0 w0Var = new w0(this);
        this.f2252g = w0Var;
        w0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private x getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new x(this);
        }
        return this.h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2251f;
        if (pVar != null) {
            pVar.a();
        }
        w0 w0Var = this.f2252g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2251f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2251f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2252g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2252g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2251f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2251f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2252g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2252g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((k2.h) getEmojiTextViewHelper().f2435b.f299g).p(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2251f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2251f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f2252g;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f2252g;
        w0Var.i(mode);
        w0Var.b();
    }
}
