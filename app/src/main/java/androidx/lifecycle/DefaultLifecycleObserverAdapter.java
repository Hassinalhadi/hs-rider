package androidx.lifecycle;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: f, reason: collision with root package name */
    public final d f533f;

    /* renamed from: g, reason: collision with root package name */
    public final p f534g;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f533f = dVar;
        this.f534g = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        int i3 = e.f555a[lVar.ordinal()];
        if (i3 != 3) {
            if (i3 == 7) {
                a.b.m("ON_ANY must not been send by anybody");
                return;
            }
        } else {
            this.f533f.a();
        }
        p pVar = this.f534g;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}
