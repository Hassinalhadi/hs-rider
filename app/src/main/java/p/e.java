package p;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends k2.h {
    @Override // k2.h
    public final void N(f fVar, f fVar2) {
        fVar.f2655b = fVar2;
    }

    @Override // k2.h
    public final void O(f fVar, Thread thread) {
        fVar.f2654a = thread;
    }

    @Override // k2.h
    public final boolean e(g gVar, c cVar) {
        c cVar2 = c.f2647b;
        synchronized (gVar) {
            try {
                if (gVar.f2661g == cVar) {
                    gVar.f2661g = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k2.h
    public final boolean f(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f2660f == obj) {
                    gVar.f2660f = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k2.h
    public final boolean g(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.h == fVar) {
                    gVar.h = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
