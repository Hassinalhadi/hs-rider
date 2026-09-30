package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ b0 this$0;

    /* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
    /* loaded from: classes.dex */
    public static final class a extends f {
        final /* synthetic */ b0 this$0;

        public a(b0 b0Var) {
            this.this$0 = b0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            b0 b0Var = this.this$0;
            int i3 = b0Var.f547g + 1;
            b0Var.f547g = i3;
            if (i3 == 1) {
                if (b0Var.h) {
                    b0Var.f550k.d(l.ON_RESUME);
                    b0Var.h = false;
                } else {
                    Handler handler = b0Var.f549j;
                    handler.getClass();
                    handler.removeCallbacks(b0Var.f551l);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            b0 b0Var = this.this$0;
            int i3 = b0Var.f546f + 1;
            b0Var.f546f = i3;
            if (i3 == 1 && b0Var.f548i) {
                b0Var.f550k.d(l.ON_START);
                b0Var.f548i = false;
            }
        }
    }

    public a0(b0 b0Var) {
        this.this$0 = b0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        b0 b0Var = this.this$0;
        int i3 = b0Var.f547g - 1;
        b0Var.f547g = i3;
        if (i3 == 0) {
            Handler handler = b0Var.f549j;
            handler.getClass();
            handler.postDelayed(b0Var.f551l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        b0 b0Var = this.this$0;
        int i3 = b0Var.f546f - 1;
        b0Var.f546f = i3;
        if (i3 == 0 && b0Var.h) {
            b0Var.f550k.d(l.ON_STOP);
            b0Var.f548i = true;
        }
    }
}
