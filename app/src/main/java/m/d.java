package m;

import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2519g = true;
    public final /* synthetic */ f h;

    public d(f fVar) {
        this.h = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        boolean z2;
        c cVar2 = this.f2518f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f2517i;
            this.f2518f = cVar3;
            if (cVar3 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2519g = z2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2519g) {
            if (this.h.f2520f != null) {
                return true;
            }
            return false;
        }
        c cVar = this.f2518f;
        if (cVar != null && cVar.h != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f2519g) {
            this.f2519g = false;
            this.f2518f = this.h.f2520f;
        } else {
            c cVar2 = this.f2518f;
            if (cVar2 != null) {
                cVar = cVar2.h;
            } else {
                cVar = null;
            }
            this.f2518f = cVar;
        }
        return this.f2518f;
    }
}
