package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends j implements Map {

    /* renamed from: i, reason: collision with root package name */
    public a f2563i;

    /* renamed from: j, reason: collision with root package name */
    public c f2564j;

    /* renamed from: k, reason: collision with root package name */
    public e f2565k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(0);
        int i3 = jVar.h;
        b(this.h + i3);
        if (this.h == 0) {
            if (i3 > 0) {
                k2.c.g0(0, 0, i3, jVar.f2573f, this.f2573f);
                k2.c.h0(jVar.f2574g, this.f2574g, 0, 0, i3 << 1);
                this.h = i3;
                return;
            }
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            put(jVar.f(i4), jVar.i(i4));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f2563i;
        if (aVar == null) {
            a aVar2 = new a(this);
            this.f2563i = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i3 = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i3 != this.h) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f2564j;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f2564j = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f2565k;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f2565k = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
