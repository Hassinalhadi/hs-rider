package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 extends MultiAutoCompleteTextView {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2211i = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    public final p f2212f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f2213g;
    public final c0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.lsposed.R.attr.autoCompleteTextViewStyle);
        n2.a(context);
        m2.a(this, getContext());
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(getContext(), attributeSet, f2211i, com.logistics.rider.lsposed.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r3.f310c).hasValue(0)) {
            setDropDownBackgroundDrawable(r3.i(0));
        }
        r3.t();
        p pVar = new p(this);
        this.f2212f = pVar;
        pVar.d(attributeSet, com.logistics.rider.lsposed.R.attr.autoCompleteTextViewStyle);
        w0 w0Var = new w0(this);
        this.f2213g = w0Var;
        w0Var.f(attributeSet, com.logistics.rider.lsposed.R.attr.autoCompleteTextViewStyle);
        w0Var.b();
        c0 c0Var = new c0(this);
        this.h = c0Var;
        c0Var.c(attributeSet, com.logistics.rider.lsposed.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener b3 = c0Var.b(keyListener);
            if (b3 != keyListener) {
                super.setKeyListener(b3);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2212f;
        if (pVar != null) {
            pVar.a();
        }
        w0 w0Var = this.f2213g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2212f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2212f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2213g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2213g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.y.O(editorInfo, onCreateInputConnection, this);
        return this.h.d(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2212f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2212f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2213g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2213g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(a.y.B(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.h.e(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2212f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2212f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f2213g;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f2213g;
        w0Var.i(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f2213g;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }
}
