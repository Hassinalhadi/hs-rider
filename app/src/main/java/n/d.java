package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f2559f;

    /* renamed from: g, reason: collision with root package name */
    public int f2560g = -1;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f2561i;

    public d(f fVar) {
        this.f2561i = fVar;
        this.f2559f = fVar.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.h) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i3 = this.f2560g;
                f fVar = this.f2561i;
                if (p2.d.a(key, fVar.f(i3)) && p2.d.a(entry.getValue(), fVar.i(this.f2560g))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        a.b.i("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.f2561i.f(this.f2560g);
        }
        a.b.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.f2561i.i(this.f2560g);
        }
        a.b.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2560g < this.f2559f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.h) {
            int i3 = this.f2560g;
            f fVar = this.f2561i;
            Object f3 = fVar.f(i3);
            Object i4 = fVar.i(this.f2560g);
            int i5 = 0;
            if (f3 == null) {
                hashCode = 0;
            } else {
                hashCode = f3.hashCode();
            }
            if (i4 != null) {
                i5 = i4.hashCode();
            }
            return hashCode ^ i5;
        }
        a.b.i("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2560g++;
            this.h = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.h) {
            this.f2561i.g(this.f2560g);
            this.f2560g--;
            this.f2559f--;
            this.h = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.f2561i.h(this.f2560g, obj);
        }
        a.b.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
