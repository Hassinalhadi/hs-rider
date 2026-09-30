package l2;

import a.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k2.h;
import p2.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends k2.a implements RandomAccess, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final c f2509i;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2510f;

    /* renamed from: g, reason: collision with root package name */
    public int f2511g;
    public boolean h;

    static {
        c cVar = new c(0);
        cVar.h = true;
        f2509i = cVar;
    }

    public c(int i3) {
        if (i3 >= 0) {
            this.f2510f = new Object[i3];
        } else {
            a.b.m("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // k2.a
    public final int a() {
        return this.f2511g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        f();
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 <= i4) {
            ((AbstractList) this).modCount++;
            g(i3, 1);
            this.f2510f[i3] = obj;
            return;
        }
        a.b.j("index: ", i3, ", size: ", i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        f();
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(i3, collection, size);
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
        f();
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 < i4) {
            return h(i3);
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f2511g);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        g(i3, i4);
        Iterator it = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f2510f[i3 + i5] = it.next();
        }
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        g(i3, 1);
        this.f2510f[i3] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f2510f;
                int i3 = this.f2511g;
                if (i3 == list.size()) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (d.a(objArr[i4], list.get(i4))) {
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
        if (!this.h) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i3, int i4) {
        int i5 = this.f2511g + i4;
        if (i5 >= 0) {
            Object[] objArr = this.f2510f;
            if (i5 > objArr.length) {
                int length = objArr.length;
                int i6 = length + (length >> 1);
                if (i6 - i5 < 0) {
                    i6 = i5;
                }
                if (i6 - 2147483639 > 0) {
                    if (i5 > 2147483639) {
                        i6 = Integer.MAX_VALUE;
                    } else {
                        i6 = 2147483639;
                    }
                }
                this.f2510f = Arrays.copyOf(objArr, i6);
            }
            Object[] objArr2 = this.f2510f;
            k2.c.h0(objArr2, objArr2, i3 + i4, i3, this.f2511g);
            this.f2511g += i4;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 < i4) {
            return this.f2510f[i3];
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    public final Object h(int i3) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f2510f;
        Object obj = objArr[i3];
        k2.c.h0(objArr, objArr, i3, i3 + 1, this.f2511g);
        Object[] objArr2 = this.f2510f;
        int i4 = this.f2511g - 1;
        objArr2.getClass();
        objArr2[i4] = null;
        this.f2511g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3;
        Object[] objArr = this.f2510f;
        int i4 = this.f2511g;
        int i5 = 1;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
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
        Object[] objArr = this.f2510f;
        k2.c.h0(objArr, objArr, i3, i3 + i4, this.f2511g);
        Object[] objArr2 = this.f2510f;
        int i5 = this.f2511g;
        objArr2.getClass();
        for (int i6 = i5 - i4; i6 < i5; i6++) {
            objArr2[i6] = null;
        }
        this.f2511g -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f2511g; i3++) {
            if (d.a(this.f2510f[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f2511g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i3, int i4, Collection collection, boolean z2) {
        Object[] objArr;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            objArr = this.f2510f;
            if (i5 >= i4) {
                break;
            }
            int i7 = i3 + i5;
            if (collection.contains(objArr[i7]) == z2) {
                Object[] objArr2 = this.f2510f;
                i5++;
                objArr2[i6 + i3] = objArr2[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        k2.c.h0(objArr, objArr, i3 + i6, i4 + i3, this.f2511g);
        Object[] objArr3 = this.f2510f;
        int i9 = this.f2511g;
        objArr3.getClass();
        for (int i10 = i9 - i8; i10 < i9; i10++) {
            objArr3[i10] = null;
        }
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2511g -= i8;
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f2511g - 1; i3 >= 0; i3--) {
            if (d.a(this.f2510f[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 <= i4) {
            return new a(this, i3);
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        f();
        if (j(0, this.f2511g, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        f();
        if (j(0, this.f2511g, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        f();
        int i4 = this.f2511g;
        if (i3 >= 0 && i3 < i4) {
            Object[] objArr = this.f2510f;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
            return obj2;
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        y.o(i3, i4, this.f2511g);
        return new b(this.f2510f, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i3 = this.f2511g;
        Object[] objArr2 = this.f2510f;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i3, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        k2.c.h0(objArr2, objArr, 0, 0, i3);
        int i4 = this.f2511g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return h.b(this.f2510f, 0, this.f2511g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i3 = this.f2511g;
        ((AbstractList) this).modCount++;
        g(i3, 1);
        this.f2510f[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        f();
        int size = collection.size();
        d(this.f2511g, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k2.c.j0(this.f2510f, 0, this.f2511g);
    }
}
