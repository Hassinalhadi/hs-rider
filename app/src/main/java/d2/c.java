package d2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b2.n;
import com.logistics.rider.lsposed.R;
import k2.h;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final b f1398n = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final n f1399f;

    /* renamed from: g, reason: collision with root package name */
    public int f1400g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1401i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1402j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1403k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1404l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1405m;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(g2.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, i1.a.A);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f1400g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1399f = n.b(context2, attributeSet, 0, 0).a();
        }
        this.h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(h.l(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(j.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1401i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1402j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1403k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1398n);
        setFocusable(true);
        if (getBackground() == null) {
            int C = h.C(h.k(this, R.attr.colorSurface), h.k(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            n nVar = this.f1399f;
            if (nVar != null) {
                int i3 = d.f1406a;
                b2.j jVar = new b2.j(nVar);
                jVar.m(ColorStateList.valueOf(C));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f1406a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(C);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1404l;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1401i;
    }

    public int getAnimationMode() {
        return this.f1400g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.h;
    }

    public int getMaxInlineActionWidth() {
        return this.f1403k;
    }

    public int getMaxWidth() {
        return this.f1402j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int i5 = this.f1402j;
        if (i5 > 0 && getMeasuredWidth() > i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
        }
    }

    public void setAnimationMode(int i3) {
        this.f1400g = i3;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1404l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f1404l);
            drawable.setTintMode(this.f1405m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1404l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f1405m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1405m = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        b bVar;
        if (onClickListener != null) {
            bVar = null;
        } else {
            bVar = f1398n;
        }
        setOnTouchListener(bVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
