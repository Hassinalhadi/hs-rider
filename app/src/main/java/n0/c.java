package n0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f3, float f4) {
        try {
            return edgeEffect.onPullDistance(f3, f4);
        } catch (Throwable unused) {
            edgeEffect.onPull(f3, f4);
            return 0.0f;
        }
    }
}
