package v2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3186a;

    public a(c cVar) {
        this.f3186a = new AtomicReference(cVar);
    }

    @Override // v2.d
    public final Iterator iterator() {
        d dVar = (d) this.f3186a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        a.b.i("This sequence can be consumed only once.");
        return null;
    }
}
