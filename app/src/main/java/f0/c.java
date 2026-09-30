package f0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1553a;

    /* renamed from: b, reason: collision with root package name */
    public b f1554b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1555c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f1555c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1554b != bVar) {
                this.f1554b = bVar;
                if (this.f1553a) {
                    bVar.onCancel();
                }
            }
        }
    }
}
