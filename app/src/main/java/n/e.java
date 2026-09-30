package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2562f;

    public e(f fVar) {
        this.f2562f = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f2562f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f2562f.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2562f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2562f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f2562f;
        int a3 = fVar.a(obj);
        if (a3 >= 0) {
            fVar.g(a3);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f2562f;
        int i3 = fVar.h;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < i3) {
            if (collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i3--;
                z2 = true;
            }
            i4++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f2562f;
        int i3 = fVar.h;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < i3) {
            if (!collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i3--;
                z2 = true;
            }
            i4++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2562f.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f2562f;
        int i3 = fVar.h;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f2562f;
        int i3 = fVar.h;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        return objArr;
    }
}
