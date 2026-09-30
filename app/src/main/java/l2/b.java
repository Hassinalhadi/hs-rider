package l2;

import a.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k2.h;
import p2.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends k2.a implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2506g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final b f2507i;

    /* renamed from: j, reason: collision with root package name */
    public final c f2508j;

    public b(Object[] objArr, int i3, int i4, b bVar, c cVar) {
        int i5;
        objArr.getClass();
        cVar.getClass();
        this.f2505f = objArr;
        this.f2506g = i3;
        this.h = i4;
        this.f2507i = bVar;
        this.f2508j = cVar;
        i5 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // k2.a
    public final int a() {
        f();
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        g();
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 <= i4) {
            e(this.f2506g + i3, obj);
        } else {
            a.b.j("index: ", i3, ", size: ", i4);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        g();
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(this.f2506g + i3, collection, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return false;
    }

    @Override // k2.a
    public final Object b(int i3) {
        g();
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 < i4) {
            return h(this.f2506g + i3);
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f2506g, this.h);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2508j;
        b bVar = this.f2507i;
        if (bVar != null) {
            bVar.d(i3, collection, i4);
        } else {
            c cVar2 = c.f2509i;
            cVar.d(i3, collection, i4);
        }
        this.f2505f = cVar.f2510f;
        this.h += i4;
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2508j;
        b bVar = this.f2507i;
        if (bVar != null) {
            bVar.e(i3, obj);
        } else {
            c cVar2 = c.f2509i;
            cVar.e(i3, obj);
        }
        this.f2505f = cVar.f2510f;
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f2505f;
                int i3 = this.h;
                if (i3 == list.size()) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (d.a(objArr[this.f2506g + i4], list.get(i4))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i3;
        i3 = ((AbstractList) this.f2508j).modCount;
        if (i3 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (!this.f2508j.h) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 < i4) {
            return this.f2505f[this.f2506g + i3];
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    public final Object h(int i3) {
        Object h;
        ((AbstractList) this).modCount++;
        b bVar = this.f2507i;
        if (bVar != null) {
            h = bVar.h(i3);
        } else {
            c cVar = c.f2509i;
            h = this.f2508j.h(i3);
        }
        this.h--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3;
        f();
        Object[] objArr = this.f2505f;
        int i4 = this.h;
        int i5 = 1;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[this.f2506g + i6];
            int i7 = i5 * 31;
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i5 = i7 + i3;
        }
        return i5;
    }

    public final void i(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f2507i;
        if (bVar != null) {
            bVar.i(i3, i4);
        } else {
            c cVar = c.f2509i;
            this.f2508j.i(i3, i4);
        }
        this.h -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i3 = 0; i3 < this.h; i3++) {
            if (d.a(this.f2505f[this.f2506g + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i3, int i4, Collection collection, boolean z2) {
        int j3;
        b bVar = this.f2507i;
        if (bVar != null) {
            j3 = bVar.j(i3, i4, collection, z2);
        } else {
            c cVar = c.f2509i;
            j3 = this.f2508j.j(i3, i4, collection, z2);
        }
        if (j3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.h -= j3;
        return j3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i3 = this.h - 1; i3 >= 0; i3--) {
            if (d.a(this.f2505f[this.f2506g + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 <= i4) {
            return new a(this, i3);
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.f2506g, this.h, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.f2506g, this.h, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        g();
        f();
        int i4 = this.h;
        if (i3 >= 0 && i3 < i4) {
            Object[] objArr = this.f2505f;
            int i5 = this.f2506g;
            Object obj2 = objArr[i5 + i3];
            objArr[i5 + i3] = obj;
            return obj2;
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        y.o(i3, i4, this.h);
        return new b(this.f2505f, this.f2506g + i3, i4 - i3, this, this.f2508j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i3 = this.h;
        Object[] objArr2 = this.f2505f;
        int i4 = this.f2506g;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i4, i3 + i4, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        k2.c.h0(objArr2, objArr, 0, i4, i3 + i4);
        int i5 = this.h;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return h.b(this.f2505f, this.f2506g, this.h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f2506g + this.h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.f2506g + this.h, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f2505f;
        int i3 = this.h;
        int i4 = this.f2506g;
        return k2.c.j0(objArr, i4, i3 + i4);
    }
}
