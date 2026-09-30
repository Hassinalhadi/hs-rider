package w1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.s1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class e extends s1 {

    /* renamed from: u, reason: collision with root package name */
    public Drawable f3231u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f3232v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3233w;

    /* renamed from: x, reason: collision with root package name */
    public int f3234x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f3235y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3236z;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3232v = new Rect();
        this.f3233w = new Rect();
        this.f3234x = 119;
        this.f3235y = true;
        this.f3236z = false;
        j.a(context, attributeSet, 0, 0);
        int[] iArr = i1.a.h;
        j.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f3234x = obtainStyledAttributes.getInt(1, this.f3234x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3235y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3231u;
        if (drawable != null) {
            if (this.f3236z) {
                this.f3236z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f3235y;
                Rect rect = this.f3232v;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i3 = this.f3234x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f3233w;
                Gravity.apply(i3, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f3231u;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3231u;
        if (drawable != null && drawable.isStateful()) {
            this.f3231u.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3231u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3234x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3231u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        this.f3236z = z2 | this.f3236z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f3236z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3231u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3231u);
            }
            this.f3231u = drawable;
            this.f3236z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3234x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f3234x != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3234x = i3;
            if (i3 == 119 && this.f3231u != null) {
                this.f3231u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3231u) {
            return false;
        }
        return true;
    }
}
