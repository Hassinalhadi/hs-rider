package y0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends k2.h {

    /* renamed from: a, reason: collision with root package name */
    public final b f3305a;

    public g(b bVar) {
        bVar.getClass();
        this.f3305a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass() && p2.d.a(this.f3305a, ((g) obj).f3305a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3305a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f3305a + ", direction=-1)";
    }
}
