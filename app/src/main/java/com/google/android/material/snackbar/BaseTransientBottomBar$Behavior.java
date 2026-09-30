package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.m;
import b2.f;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d2.c;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final f h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(8);
        this.f1139e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1140f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (m.h == null) {
                    m.h = new m(9);
                }
                synchronized (m.h.f299g) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (m.h == null) {
                m.h = new m(9);
            }
            synchronized (m.h.f299g) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof c;
    }
}
