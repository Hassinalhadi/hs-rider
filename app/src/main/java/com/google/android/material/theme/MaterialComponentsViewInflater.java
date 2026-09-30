package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.logistics.rider.lsposed.R;
import e2.x;
import g.f0;
import g2.a;
import k.d0;
import k.o;
import k.q;
import k.r;
import k.z0;
import k2.h;
import q1.c;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends f0 {
    @Override // g.f0
    public final o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.f0
    public final q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.f0
    public final r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.CompoundButton, android.view.View, y1.a, k.d0] */
    @Override // g.f0
    public final d0 d(Context context, AttributeSet attributeSet) {
        ?? d0Var = new d0(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = d0Var.getContext();
        TypedArray e3 = j.e(context2, attributeSet, i1.a.f1984q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (e3.hasValue(0)) {
            d0Var.setButtonTintList(h.l(context2, e3, 0));
        }
        d0Var.f3312k = e3.getBoolean(1, false);
        e3.recycle();
        return d0Var;
    }

    @Override // g.f0
    public final z0 e(Context context, AttributeSet attributeSet) {
        z0 z0Var = new z0(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = z0Var.getContext();
        if (h.Q(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = i1.a.f1988u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int e3 = f2.a.e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (e3 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, i1.a.f1987t);
                    int e4 = f2.a.e(z0Var.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (e4 >= 0) {
                        z0Var.setLineHeight(e4);
                    }
                }
            }
        }
        return z0Var;
    }
}
