package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class d0 extends RadioButton implements n0.i {

    /* renamed from: f, reason: collision with root package name */
    public final c1.d f2241f;

    /* renamed from: g, reason: collision with root package name */
    public final p f2242g;
    public final w0 h;

    /* renamed from: i, reason: collision with root package name */
    public x f2243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        n2.a(context);
        m2.a(this, getContext());
        c1.d dVar = new c1.d(this);
        this.f2241f = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        p pVar = new p(this);
        this.f2242g = pVar;
        pVar.d(attributeSet, R.attr.radioButtonStyle);
        w0 w0Var = new w0(this);
        this.h = w0Var;
        w0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2243i == null) {
            this.f2243i = new x(this);
        }
        return this.f2243i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2242g;
        if (pVar != null) {
            pVar.a();
        }
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2242g;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2242g;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    @Override // n0.i
    public ColorStateList getSupportButtonTintList() {
        c1.d dVar = this.f2241f;
        if (dVar != null) {
            return (ColorStateList) dVar.f1095e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        c1.d dVar = this.f2241f;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1096f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2242g;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2242g;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        c1.d dVar = this.f2241f;
        if (dVar != null) {
            if (dVar.f1094c) {
                dVar.f1094c = false;
            } else {
                dVar.f1094c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.h;
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
        p pVar = this.f2242g;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2242g;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    @Override // n0.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        c1.d dVar = this.f2241f;
        if (dVar != null) {
            dVar.f1095e = colorStateList;
            dVar.f1092a = true;
            dVar.a();
        }
    }

    @Override // n0.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        c1.d dVar = this.f2241f;
        if (dVar != null) {
            dVar.f1096f = mode;
            dVar.f1093b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.h;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.h;
        w0Var.i(mode);
        w0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(a.y.B(getContext(), i3));
    }
}
