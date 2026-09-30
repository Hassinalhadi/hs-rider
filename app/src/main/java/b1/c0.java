package b1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c0 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f727a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        switch (this.f727a) {
            case 0:
            default:
                float f4 = f3 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }
}
