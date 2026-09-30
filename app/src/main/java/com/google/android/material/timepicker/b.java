package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1387f;

    public b(ClockFaceView clockFaceView) {
        this.f1387f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1387f;
        ClockHandView clockHandView = clockFaceView.f1369y;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.f1374i) - clockFaceView.G;
            if (height != clockFaceView.f1391w) {
                clockFaceView.f1391w = height;
                clockFaceView.m();
                clockHandView.f1382q = clockFaceView.f1391w;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
