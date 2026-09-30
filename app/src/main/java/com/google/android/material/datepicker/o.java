package com.google.android.material.datepicker;

import android.view.View;
import j0.c1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o implements j0.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f1251g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1253j;

    public o(View view, int i3, int i4, int i5, int i6) {
        this.f1250f = i3;
        this.f1251g = view;
        this.h = i4;
        this.f1252i = i5;
        this.f1253j = i6;
    }

    @Override // j0.n
    public final c1 d(View view, c1 c1Var) {
        c0.b f3 = c1Var.f2146a.f(519);
        View view2 = this.f1251g;
        int i3 = this.f1250f;
        if (i3 >= 0) {
            view2.getLayoutParams().height = i3 + f3.f1083b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + f3.f1082a, this.f1252i + f3.f1083b, this.f1253j + f3.f1084c, view2.getPaddingBottom());
        return c1Var;
    }
}
