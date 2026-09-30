package m;

import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2513f;

    /* renamed from: g, reason: collision with root package name */
    public c f2514g;
    public final /* synthetic */ int h;

    public b(c cVar, c cVar2, int i3) {
        this.h = i3;
        this.f2513f = cVar2;
        this.f2514g = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f2513f == cVar && cVar == this.f2514g) {
            this.f2514g = null;
            this.f2513f = null;
        }
        c cVar4 = this.f2513f;
        if (cVar4 == cVar) {
            switch (this.h) {
                case 0:
                    cVar2 = cVar4.f2517i;
                    break;
                default:
                    cVar2 = cVar4.h;
                    break;
            }
            this.f2513f = cVar2;
        }
        c cVar5 = this.f2514g;
        if (cVar5 == cVar) {
            c cVar6 = this.f2513f;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f2514g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.h) {
            case 0:
                return cVar.h;
            default:
                return cVar.f2517i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2514g != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f2514g;
        c cVar3 = this.f2513f;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f2514g = cVar;
        return cVar2;
    }
}
