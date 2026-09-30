package j2;

import java.io.Serializable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public o2.a f2204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f2205g = c.f2206b;
    public final Object h = this;

    public b(o2.a aVar) {
        this.f2204f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f2205g;
        c cVar = c.f2206b;
        if (obj2 != cVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.f2205g;
            if (obj == cVar) {
                o2.a aVar = this.f2204f;
                aVar.getClass();
                obj = aVar.a();
                this.f2205g = obj;
                this.f2204f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f2205g != c.f2206b) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
