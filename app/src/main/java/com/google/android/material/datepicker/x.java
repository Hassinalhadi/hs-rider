package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x extends b1.y {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1285q = 0;

    public /* synthetic */ x(Context context) {
        super(context);
    }

    @Override // b1.y
    public int b(View view, int i3) {
        switch (this.f1285q) {
            case 1:
                return 0;
            default:
                return super.b(view, i3);
        }
    }

    @Override // b1.y
    public int c(View view, int i3) {
        switch (this.f1285q) {
            case 1:
                return 0;
            default:
                return super.c(view, i3);
        }
    }

    @Override // b1.y
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1285q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // b1.y
    public PointF f(int i3) {
        switch (this.f1285q) {
            case 1:
                return null;
            default:
                return super.f(i3);
        }
    }

    public x(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
