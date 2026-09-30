package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.logistics.rider.lsposed.R;
import f.a;
import j0.g0;
import j0.j0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f161f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162g;
    public int h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        int[] iArr = a.f1537k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = j0.f2160a;
        g0.b(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f161f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f161f);
        }
    }

    private void setStacked(boolean z2) {
        int i3;
        int i4;
        if (this.f162g != z2) {
            if (!z2 || this.f161f) {
                this.f162g = z2;
                setOrientation(z2 ? 1 : 0);
                if (z2) {
                    i3 = 8388613;
                } else {
                    i3 = 80;
                }
                setGravity(i3);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z2) {
                        i4 = 8;
                    } else {
                        i4 = 4;
                    }
                    findViewById.setVisibility(i4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        int i7 = 0;
        if (this.f161f) {
            if (size > this.h && this.f162g) {
                setStacked(false);
            }
            this.h = size;
        }
        if (!this.f162g && View.MeasureSpec.getMode(i3) == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        } else {
            i5 = i3;
            z2 = false;
        }
        super.onMeasure(i5, i4);
        if (this.f161f && !this.f162g && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i3, i4);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 < childCount) {
                if (getChildAt(i8).getVisibility() == 0) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f162g) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    }
                    i9++;
                }
                if (i6 >= 0) {
                    i7 = getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i7 = measuredHeight;
                }
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = j0.f2160a;
        if (getMinimumHeight() != i7) {
            setMinimumHeight(i7);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f161f != z2) {
            this.f161f = z2;
            if (!z2 && this.f162g) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
