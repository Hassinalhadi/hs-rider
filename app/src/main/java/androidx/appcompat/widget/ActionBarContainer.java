package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.logistics.rider.lsposed.R;
import f.a;
import k.b;
import k.k2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f107f;

    /* renamed from: g, reason: collision with root package name */
    public View f108g;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f109i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f110j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f111k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f112l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113m;

    /* renamed from: n, reason: collision with root package name */
    public final int f114n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1529a);
        boolean z2 = false;
        this.f109i = obtainStyledAttributes.getDrawable(0);
        this.f110j = obtainStyledAttributes.getDrawable(2);
        this.f114n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f112l = true;
            this.f111k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f112l ? !(this.f109i != null || this.f110j != null) : this.f111k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f109i;
        if (drawable != null && drawable.isStateful()) {
            this.f109i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f110j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f110j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f111k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f111k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f109i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f110j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f111k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f108g = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f107f && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        boolean z3 = true;
        if (this.f112l) {
            Drawable drawable = this.f111k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f109i != null) {
                if (this.f108g.getVisibility() == 0) {
                    this.f109i.setBounds(this.f108g.getLeft(), this.f108g.getTop(), this.f108g.getRight(), this.f108g.getBottom());
                } else {
                    View view = this.h;
                    if (view != null && view.getVisibility() == 0) {
                        this.f109i.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                    } else {
                        this.f109i.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z3 = false;
            }
            this.f113m = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f108g == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f114n) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f108g == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f109i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f109i);
        }
        this.f109i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f108g;
            if (view != null) {
                this.f109i.setBounds(view.getLeft(), this.f108g.getTop(), this.f108g.getRight(), this.f108g.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f112l ? !(this.f109i != null || this.f110j != null) : this.f111k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f111k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f111k);
        }
        this.f111k = drawable;
        boolean z2 = this.f112l;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f111k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f109i != null || this.f110j != null) : this.f111k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f110j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f110j);
        }
        this.f110j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f113m && this.f110j != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f112l ? !(this.f109i != null || this.f110j != null) : this.f111k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        int i3;
        this.f107f = z2;
        if (z2) {
            i3 = 393216;
        } else {
            i3 = 262144;
        }
        setDescendantFocusability(i3);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        boolean z2;
        super.setVisibility(i3);
        if (i3 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f109i;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f110j;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f111k;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f109i;
        boolean z2 = this.f112l;
        if (drawable != drawable2 || z2) {
            if (drawable != this.f110j || !this.f113m) {
                if ((drawable == this.f111k && z2) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(k2 k2Var) {
    }
}
