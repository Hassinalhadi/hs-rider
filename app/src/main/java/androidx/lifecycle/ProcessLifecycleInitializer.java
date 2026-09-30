package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements d1.b {
    @Override // d1.b
    public final List a() {
        return k2.e.f2487f;
    }

    @Override // d1.b
    public final Object b(Context context) {
        context.getClass();
        d1.a c3 = d1.a.c(context);
        c3.getClass();
        if (c3.f1396b.contains(ProcessLifecycleInitializer.class)) {
            if (!o.f575a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
            }
            b0 b0Var = b0.f545m;
            b0Var.getClass();
            b0Var.f549j = new Handler();
            b0Var.f550k.d(l.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(b0Var));
            return b0Var;
        }
        a.b.i("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
