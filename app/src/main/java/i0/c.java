package i0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1969c;

    public c() {
        super(12);
        this.f1969c = new Object();
    }

    @Override // i0.b
    public final Object a() {
        Object a3;
        synchronized (this.f1969c) {
            a3 = super.a();
        }
        return a3;
    }

    @Override // i0.b
    public final boolean c(Object obj) {
        boolean c3;
        synchronized (this.f1969c) {
            c3 = super.c(obj);
        }
        return c3;
    }
}
