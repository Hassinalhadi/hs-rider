package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b2.f f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.f f1226b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k2.h.T(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, i1.a.f1980m);
        b2.f.f(context, obtainStyledAttributes.getResourceId(4, 0));
        b2.f.f(context, obtainStyledAttributes.getResourceId(2, 0));
        b2.f.f(context, obtainStyledAttributes.getResourceId(3, 0));
        b2.f.f(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList l3 = k2.h.l(context, obtainStyledAttributes, 7);
        this.f1225a = b2.f.f(context, obtainStyledAttributes.getResourceId(9, 0));
        b2.f.f(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1226b = b2.f.f(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(l3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
