package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import x.a;
import x.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1975g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // x.a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void c(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    @Override // x.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
