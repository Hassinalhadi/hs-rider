package j0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class d0 {
    public static c1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c1 f3 = c1.f(null, rootWindowInsets);
        y0 y0Var = f3.f2146a;
        y0Var.n(f3);
        y0Var.d(view.getRootView());
        return f3;
    }

    public static void b(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
