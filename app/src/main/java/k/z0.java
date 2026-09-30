package k;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class z0 extends TextView {

    /* renamed from: f, reason: collision with root package name */
    public final p f2458f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f2459g;
    public x h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2460i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f2461j;

    /* renamed from: k, reason: collision with root package name */
    public Future f2462k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        n2.a(context);
        this.f2460i = false;
        this.f2461j = null;
        m2.a(this, getContext());
        p pVar = new p(this);
        this.f2458f = pVar;
        pVar.d(attributeSet, i3);
        w0 w0Var = new w0(this);
        this.f2459g = w0Var;
        w0Var.f(attributeSet, i3);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    private x getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new x(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2458f;
        if (pVar != null) {
            pVar.a();
        }
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (super.getAutoSizeTextType() == 1) {
            return 1;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public x0 getSuperCaller() {
        if (this.f2461j == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f2461j = new y0(this);
            } else {
                this.f2461j = new c0(this);
            }
        }
        return this.f2461j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2458f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2458f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2459g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2459g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2462k;
        if (future != null) {
            try {
                this.f2462k = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public h0.c getTextMetricsParamsCompat() {
        return new h0.c(getTextMetricsParams());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2459g.getClass();
        a.y.O(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        Future future = this.f2462k;
        if (future != null) {
            try {
                this.f2462k = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        super.setAutoSizeTextTypeWithDefaults(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2458f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2458f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i3 != 0) {
            drawable = a.y.B(context, i3);
        } else {
            drawable = null;
        }
        if (i4 != 0) {
            drawable2 = a.y.B(context, i4);
        } else {
            drawable2 = null;
        }
        if (i5 != 0) {
            drawable3 = a.y.B(context, i5);
        } else {
            drawable3 = null;
        }
        if (i6 != 0) {
            drawable4 = a.y.B(context, i6);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i3 != 0) {
            drawable = a.y.B(context, i3);
        } else {
            drawable = null;
        }
        if (i4 != 0) {
            drawable2 = a.y.B(context, i4);
        } else {
            drawable2 = null;
        }
        if (i5 != 0) {
            drawable3 = a.y.B(context, i5);
        } else {
            drawable3 = null;
        }
        if (i6 != 0) {
            drawable4 = a.y.B(context, i6);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((k2.h) getEmojiTextViewHelper().f2435b.f299g).p(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        super.setFirstBaselineToTopHeight(i3);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        super.setLastBaselineToBottomHeight(i3);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i3, float f3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().a(i3, f3);
        } else if (i4 >= 34) {
            j0.t.h(this, i3, f3);
        } else {
            k2.h.W(this, Math.round(TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(h0.d dVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2458f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2458f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f2459g;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f2459g;
        w0Var.i(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<h0.d> future) {
        this.f2462k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(h0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f1890b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(cVar.f1889a);
        setBreakStrategy(cVar.f1891c);
        setHyphenationFrequency(cVar.d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.f2460i) {
            return;
        }
        if (typeface != null && i3 > 0) {
            Context context = getContext();
            b2.f fVar = c0.e.f1088a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i3);
            } else {
                a.b.m("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.f2460i = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f2460i = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        k2.h.W(this, i3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2459g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
