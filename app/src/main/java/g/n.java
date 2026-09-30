package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1755f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1756g = new ArrayDeque();
    public final o h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f1757i;

    public n(o oVar) {
        this.h = oVar;
    }

    public final void a() {
        synchronized (this.f1755f) {
            try {
                Runnable runnable = (Runnable) this.f1756g.poll();
                this.f1757i = runnable;
                if (runnable != null) {
                    this.h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1755f) {
            try {
                this.f1756g.add(new a.d(this, runnable, 2));
                if (this.f1757i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
