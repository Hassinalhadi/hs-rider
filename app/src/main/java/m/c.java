package m;

import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2515f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2516g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public c f2517i;

    public c(Object obj, Object obj2) {
        this.f2515f = obj;
        this.f2516g = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2515f.equals(cVar.f2515f) && this.f2516g.equals(cVar.f2516g)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2515f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2516g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2516g.hashCode() ^ this.f2515f.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2515f + "=" + this.f2516g;
    }
}
