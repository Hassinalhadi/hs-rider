package l;

import java.util.concurrent.Executors;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f2490b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2491a;

    public a(int i3) {
        switch (i3) {
            case 1:
                this.f2491a = new Object();
                Executors.newFixedThreadPool(4, new b());
                return;
            default:
                this.f2491a = new a(1);
                return;
        }
    }

    public static a Z() {
        if (f2490b != null) {
            return f2490b;
        }
        synchronized (a.class) {
            try {
                if (f2490b == null) {
                    f2490b = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2490b;
    }
}
