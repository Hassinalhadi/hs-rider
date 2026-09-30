package com.google.android.material.timepicker;

import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.logistics.rider.lsposed.R;
import j0.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v.n;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final RectF A;
    public final Rect B;
    public final SparseArray C;
    public final c D;
    public final int[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String[] K;
    public float L;
    public final ColorStateList M;

    /* renamed from: y, reason: collision with root package name */
    public final ClockHandView f1369y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1370z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1370z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList l3 = k2.h.l(context, obtainStyledAttributes, 1);
        this.M = l3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1369y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = l3.getColorForState(new int[]{android.R.attr.state_selected}, l3.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, l3.getDefaultColor()};
        clockHandView.h.add(this);
        int defaultColor = y.z(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList l4 = k2.h.l(context, obtainStyledAttributes, 0);
        setBackgroundColor(l4 != null ? l4.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.D = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < Math.max(this.K.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.K[i3]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                z2 = i4 > 1 ? true : z2;
                j0.h(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.f1369y;
        if (clockHandView2.f1373g && !z2) {
            clockHandView2.f1383r = 1;
        }
        clockHandView2.f1373g = z2;
        clockHandView2.invalidate();
        this.H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i5 = this.f1391w;
            if (intValue == 2) {
                i5 = Math.round(i5 * 0.66f);
            }
            Iterator it = list.iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = nVar.f3165c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new v.i());
                }
                v.j jVar = ((v.i) hashMap2.get(Integer.valueOf(id))).d;
                jVar.f3137z = R.id.circle_center;
                jVar.A = i5;
                jVar.B = f3;
                f3 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i6 < sparseArray.size()) {
                ((TextView) sparseArray.get(i6)).setVisibility(0);
                i6++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f1369y.f1377l;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i3 = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.f1370z;
            rectF = this.A;
            if (i3 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f3) {
                    textView = textView2;
                    f3 = height;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textView3.setSelected(z2);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.B);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.E, this.F, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
