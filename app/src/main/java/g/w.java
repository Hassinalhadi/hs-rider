package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, c0 c0Var) {
        Objects.requireNonNull(c0Var);
        v vVar = new v(0, c0Var);
        a.a.g(obj).registerOnBackInvokedCallback(1000000, vVar);
        return vVar;
    }

    public static void c(Object obj, Object obj2) {
        a.a.g(obj).unregisterOnBackInvokedCallback(a.a.c(obj2));
    }
}
