package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b2.m;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public final g f1390v;

    /* renamed from: w, reason: collision with root package name */
    public int f1391w;

    /* renamed from: x, reason: collision with root package name */
    public final b2.j f1392x;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        b2.j jVar = new b2.j();
        this.f1392x = jVar;
        b2.k kVar = new b2.k(0.5f);
        m f3 = jVar.f999g.f982a.f();
        f3.f1022e = kVar;
        f3.f1023f = kVar;
        f3.f1024g = kVar;
        f3.h = kVar;
        jVar.setShapeAppearanceModel(f3.a());
        this.f1392x.m(ColorStateList.valueOf(-1));
        setBackground(this.f1392x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1990w, R.attr.materialClockStyle, 0);
        this.f1391w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1390v = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f1390v;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f1390v;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i3) {
        this.f1392x.m(ColorStateList.valueOf(i3));
    }
}
