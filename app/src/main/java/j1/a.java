package j1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f2193a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final v0.a f2194b = new v0.a(v0.a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final v0.a f2195c = new v0.a(v0.a.f3177c);
    public static final v0.a d = new v0.a(v0.a.f3178e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f3, float f4, float f5) {
        return ((f4 - f3) * f5) + f3;
    }

    public static float b(float f3, float f4, float f5, float f6, float f7) {
        if (f7 <= f5) {
            return f3;
        }
        if (f7 >= f6) {
            return f4;
        }
        return a(f3, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i3, int i4, float f3) {
        return Math.round(f3 * (i4 - i3)) + i3;
    }
}
