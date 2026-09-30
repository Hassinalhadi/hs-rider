package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import x.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // x.a
    public abstract void b(View view);

    @Override // x.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (!view.isLaidOut()) {
            ArrayList j3 = coordinatorLayout.j(view);
            int size = j3.size();
            for (int i4 = 0; i4 < size; i4++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
