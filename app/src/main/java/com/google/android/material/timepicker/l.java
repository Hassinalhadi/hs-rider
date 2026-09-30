package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f1393f;

    public l(GestureDetector gestureDetector) {
        this.f1393f = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f1393f.onTouchEvent(motionEvent);
        }
        return false;
    }
}
