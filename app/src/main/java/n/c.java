package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Set {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2558f;

    public c(f fVar) {
        this.f2558f = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2558f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2558f.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f2558f.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        f fVar = this.f2558f;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (fVar.h == set.size()) {
                        if (fVar.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        f fVar = this.f2558f;
        int i3 = 0;
        for (int i4 = fVar.h - 1; i4 >= 0; i4--) {
            Object f3 = fVar.f(i4);
            if (f3 == null) {
                hashCode = 0;
            } else {
                hashCode = f3.hashCode();
            }
            i3 += hashCode;
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2558f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2558f, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f2558f;
        int d = fVar.d(obj);
        if (d >= 0) {
            fVar.g(d);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f2558f.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f2558f;
        int i3 = fVar.h;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(fVar.f(i4))) {
                fVar.g(i4);
            }
        }
        if (i3 != fVar.h) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2558f.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f2558f;
        int i3 = fVar.h;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = fVar.f(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f2558f;
        int i3 = fVar.h;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = fVar.f(i4);
        }
        return objArr;
    }
}
