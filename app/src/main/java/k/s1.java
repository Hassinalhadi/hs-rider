package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class s1 extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2388f;

    /* renamed from: g, reason: collision with root package name */
    public int f2389g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2390i;

    /* renamed from: j, reason: collision with root package name */
    public int f2391j;

    /* renamed from: k, reason: collision with root package name */
    public int f2392k;

    /* renamed from: l, reason: collision with root package name */
    public float f2393l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2394m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2395n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2396o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2397p;

    /* renamed from: q, reason: collision with root package name */
    public int f2398q;

    /* renamed from: r, reason: collision with root package name */
    public int f2399r;

    /* renamed from: s, reason: collision with root package name */
    public int f2400s;

    /* renamed from: t, reason: collision with root package name */
    public int f2401t;

    public s1(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, 0);
        this.f2388f = true;
        this.f2389g = -1;
        this.h = 0;
        this.f2391j = 8388659;
        int[] iArr = f.a.f1540n;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(context, attributeSet, iArr, 0);
        TypedArray typedArray = (TypedArray) r3.f310c;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        j0.g0.b(this, context, iArr, attributeSet, typedArray, 0, 0);
        TypedArray typedArray2 = (TypedArray) r3.f310c;
        int i4 = typedArray2.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray2.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z2 = typedArray2.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2393l = typedArray2.getFloat(4, -1.0f);
        this.f2389g = typedArray2.getInt(3, -1);
        this.f2394m = typedArray2.getBoolean(7, false);
        setDividerDrawable(r3.i(5));
        this.f2400s = typedArray2.getInt(8, 0);
        this.f2401t = typedArray2.getDimensionPixelSize(6, 0);
        r3.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r1;
    }

    public final void d(Canvas canvas, int i3) {
        this.f2397p.setBounds(getPaddingLeft() + this.f2401t, i3, (getWidth() - getPaddingRight()) - this.f2401t, this.f2399r + i3);
        this.f2397p.draw(canvas);
    }

    public final void e(Canvas canvas, int i3) {
        this.f2397p.setBounds(i3, getPaddingTop() + this.f2401t, this.f2398q + i3, (getHeight() - getPaddingBottom()) - this.f2401t);
        this.f2397p.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r2v4, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r1 generateDefaultLayoutParams() {
        int i3 = this.f2390i;
        if (i3 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i3 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public r1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f2389g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f2389g;
        if (childCount > i4) {
            View childAt = getChildAt(i4);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f2389g == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i5 = this.h;
            if (this.f2390i == 1 && (i3 = this.f2391j & 112) != 48) {
                if (i3 != 16) {
                    if (i3 == 80) {
                        i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2392k;
                    }
                } else {
                    i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2392k) / 2;
                }
            }
            return i5 + ((LinearLayout.LayoutParams) ((r1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2389g;
    }

    public Drawable getDividerDrawable() {
        return this.f2397p;
    }

    public int getDividerPadding() {
        return this.f2401t;
    }

    public int getDividerWidth() {
        return this.f2398q;
    }

    public int getGravity() {
        return this.f2391j;
    }

    public int getOrientation() {
        return this.f2390i;
    }

    public int getShowDividers() {
        return this.f2400s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2393l;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v5, types: [k.r1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public r1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof r1) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i3) {
        if (i3 == 0) {
            if ((this.f2400s & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i4 = this.f2400s;
        if (i3 == childCount) {
            if ((i4 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i4 & 2) != 0) {
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z2;
        int right;
        int left;
        int i3;
        int left2;
        int bottom;
        if (this.f2397p != null) {
            int i4 = 0;
            if (this.f2390i == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i4)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((r1) childAt.getLayoutParams())).topMargin) - this.f2399r);
                    }
                    i4++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f2399r;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((r1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i4)) {
                    r1 r1Var = (r1) childAt3.getLayoutParams();
                    if (z2) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) r1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) r1Var).leftMargin) - this.f2398q;
                    }
                    e(canvas, left2);
                }
                i4++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z2) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i3 = this.f2398q;
                        right = left - i3;
                    }
                } else {
                    r1 r1Var2 = (r1) childAt4.getLayoutParams();
                    if (z2) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) r1Var2).leftMargin;
                        i3 = this.f2398q;
                        right = left - i3;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) r1Var2).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f2388f = z2;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f2389g = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2397p) {
            return;
        }
        this.f2397p = drawable;
        boolean z2 = false;
        if (drawable != null) {
            this.f2398q = drawable.getIntrinsicWidth();
            this.f2399r = drawable.getIntrinsicHeight();
        } else {
            this.f2398q = 0;
            this.f2399r = 0;
        }
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f2401t = i3;
    }

    public void setGravity(int i3) {
        if (this.f2391j != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f2391j = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f2391j;
        if ((8388615 & i5) != i4) {
            this.f2391j = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2394m = z2;
    }

    public void setOrientation(int i3) {
        if (this.f2390i != i3) {
            this.f2390i = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f2400s) {
            requestLayout();
        }
        this.f2400s = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f2391j;
        if ((i5 & 112) != i4) {
            this.f2391j = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f2393l = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
