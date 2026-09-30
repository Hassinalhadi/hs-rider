package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f1291f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1292g;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1291f = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f1291f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i5 - i3) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.f1291f != -1 && childAt.getBaseline() != -1) {
                    i7 = (this.f1291f + paddingTop) - childAt.getBaseline();
                } else {
                    i7 = paddingTop;
                }
                childAt.layout(i9, i7, measuredWidth + i9, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i3, i4);
                i5 = Math.max(i5, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i9 = Math.max(i9, baseline);
                    i10 = Math.max(i10, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        if (i9 != -1) {
            if (this.f1292g) {
                i6 = Math.max(i6, Math.max(i10, getPaddingBottom()) + i9);
            }
            this.f1291f = i9;
        }
        if (!this.f1292g) {
            i6 = getPaddingBottom() + i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i3, i8), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i4, i8 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z2) {
        this.f1292g = z2;
    }
}
