package g0;

import android.os.Process;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f1805f;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f1805f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1805f);
        super.run();
    }
}
