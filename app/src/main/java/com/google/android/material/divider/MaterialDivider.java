package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import b2.j;
import com.logistics.rider.lsposed.R;
import g2.a;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public final j f1287f;

    /* renamed from: g, reason: collision with root package name */
    public int f1288g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1289i;

    /* renamed from: j, reason: collision with root package name */
    public int f1290j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f1287f = new j();
        TypedArray e3 = w1.j.e(context2, attributeSet, i1.a.f1983p, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f1288g = e3.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f1289i = e3.getDimensionPixelOffset(2, 0);
        this.f1290j = e3.getDimensionPixelOffset(1, 0);
        setDividerColor(h.l(context2, e3, 0).getDefaultColor());
        e3.recycle();
    }

    public int getDividerColor() {
        return this.h;
    }

    public int getDividerInsetEnd() {
        return this.f1290j;
    }

    public int getDividerInsetStart() {
        return this.f1289i;
    }

    public int getDividerThickness() {
        return this.f1288g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        int width;
        int i4;
        super.onDraw(canvas);
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            i3 = this.f1290j;
        } else {
            i3 = this.f1289i;
        }
        if (z2) {
            width = getWidth();
            i4 = this.f1289i;
        } else {
            width = getWidth();
            i4 = this.f1290j;
        }
        int i5 = width - i4;
        int bottom = getBottom() - getTop();
        j jVar = this.f1287f;
        jVar.setBounds(i3, 0, i5, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i4);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i5 = this.f1288g;
        if (i5 > 0 && measuredHeight != i5) {
            measuredHeight = i5;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i3) {
        if (this.h != i3) {
            this.h = i3;
            this.f1287f.m(ColorStateList.valueOf(i3));
            invalidate();
        }
    }

    public void setDividerColorResource(int i3) {
        setDividerColor(getContext().getColor(i3));
    }

    public void setDividerInsetEnd(int i3) {
        this.f1290j = i3;
    }

    public void setDividerInsetEndResource(int i3) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i3));
    }

    public void setDividerInsetStart(int i3) {
        this.f1289i = i3;
    }

    public void setDividerInsetStartResource(int i3) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i3));
    }

    public void setDividerThickness(int i3) {
        if (this.f1288g != i3) {
            this.f1288g = i3;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i3) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i3));
    }
}
