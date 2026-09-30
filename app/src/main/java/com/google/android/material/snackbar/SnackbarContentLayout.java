package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.logistics.rider.lsposed.R;
import j1.a;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public TextView f1319f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1320g;
    public int h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.S(context, R.attr.motionEasingEmphasizedInterpolator, a.f2194b);
    }

    public final boolean a(int i3, int i4, int i5) {
        boolean z2;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1319f.getPaddingTop() == i4 && this.f1319f.getPaddingBottom() == i5) {
            return z2;
        }
        TextView textView = this.f1319f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.f1320g;
    }

    public TextView getMessageView() {
        return this.f1319f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1319f = (TextView) findViewById(R.id.snackbar_text);
        this.f1320g = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z2;
        super.onMeasure(i3, i4);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f1319f.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.h > 0 && this.f1320g.getMeasuredWidth() > this.h) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i3, i4);
        }
    }

    public void setMaxInlineActionWidth(int i3) {
        this.h = i3;
    }
}
