package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.lifecycle.e0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t f3;
        lVar.getClass();
        if ((activity instanceof r) && (f3 = ((r) activity).f()) != null) {
            f3.d(lVar);
        }
    }

    public static void b(Activity activity) {
        e0.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new e0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
