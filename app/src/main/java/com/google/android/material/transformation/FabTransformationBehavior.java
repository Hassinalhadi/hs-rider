package com.google.android.material.transformation;

import a.b;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import x.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, x.a
    public final void b(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        b.i("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // x.a
    public final void c(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
