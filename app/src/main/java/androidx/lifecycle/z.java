package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class z {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.getClass();
        activityLifecycleCallbacks.getClass();
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
