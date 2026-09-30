package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements d1.b {
    @Override // d1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.emoji2.text.u, androidx.emoji2.text.f] */
    @Override // d1.b
    public final Object b(Context context) {
        Object obj;
        ?? fVar = new f(new m(context));
        fVar.f280a = 1;
        if (j.f286k == null) {
            synchronized (j.f285j) {
                try {
                    if (j.f286k == null) {
                        j.f286k = new j(fVar);
                    }
                } finally {
                }
            }
        }
        d1.a c3 = d1.a.c(context);
        c3.getClass();
        synchronized (d1.a.f1394e) {
            try {
                obj = c3.f1395a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t f3 = ((androidx.lifecycle.r) obj).f();
        f3.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
            @Override // androidx.lifecycle.d
            public final void a() {
                b.a(Looper.getMainLooper()).postDelayed(new Object(), 500L);
                f3.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
