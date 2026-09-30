package g0;

import android.os.Handler;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public e f1807f;

    /* renamed from: g, reason: collision with root package name */
    public f f1808g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f1807f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new androidx.fragment.app.e(this.f1808g, obj, 2));
    }
}
