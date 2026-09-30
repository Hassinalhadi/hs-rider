package k2;

import a.y;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f2483i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f2484f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2485g = f2483i;
    public int h;

    @Override // k2.a
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.h;
        if (i3 >= 0 && i3 <= i5) {
            if (i3 == i5) {
                addLast(obj);
                return;
            }
            if (i3 == 0) {
                addFirst(obj);
                return;
            }
            i();
            d(this.h + 1);
            int h = h(this.f2484f + i3);
            int i6 = this.h;
            if (i3 < ((i6 + 1) >> 1)) {
                if (h == 0) {
                    Object[] objArr = this.f2485g;
                    objArr.getClass();
                    i4 = objArr.length - 1;
                } else {
                    i4 = h - 1;
                }
                int i7 = this.f2484f;
                if (i7 == 0) {
                    Object[] objArr2 = this.f2485g;
                    objArr2.getClass();
                    i7 = objArr2.length;
                }
                int i8 = i7 - 1;
                int i9 = this.f2484f;
                Object[] objArr3 = this.f2485g;
                if (i4 >= i9) {
                    objArr3[i8] = objArr3[i9];
                    c.h0(objArr3, objArr3, i9, i9 + 1, i4 + 1);
                } else {
                    c.h0(objArr3, objArr3, i9 - 1, i9, objArr3.length);
                    Object[] objArr4 = this.f2485g;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    c.h0(objArr4, objArr4, 0, 1, i4 + 1);
                }
                this.f2485g[i4] = obj;
                this.f2484f = i8;
            } else {
                int h3 = h(i6 + this.f2484f);
                Object[] objArr5 = this.f2485g;
                if (h < h3) {
                    c.h0(objArr5, objArr5, h + 1, h, h3);
                } else {
                    c.h0(objArr5, objArr5, 1, 0, h3);
                    Object[] objArr6 = this.f2485g;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    c.h0(objArr6, objArr6, h + 1, h, objArr6.length - 1);
                }
                this.f2485g[h] = obj;
            }
            this.h++;
            return;
        }
        a.b.j("index: ", i3, ", size: ", i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        int i4 = this.h;
        if (i3 >= 0 && i3 <= i4) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i3 == this.h) {
                return addAll(collection);
            }
            i();
            d(collection.size() + this.h);
            int h = h(this.h + this.f2484f);
            int h3 = h(this.f2484f + i3);
            int size = collection.size();
            if (i3 < ((this.h + 1) >> 1)) {
                int i5 = this.f2484f;
                int i6 = i5 - size;
                Object[] objArr = this.f2485g;
                if (h3 >= i5) {
                    if (i6 >= 0) {
                        c.h0(objArr, objArr, i6, i5, h3);
                    } else {
                        i6 += objArr.length;
                        int i7 = h3 - i5;
                        int length = objArr.length - i6;
                        if (length >= i7) {
                            c.h0(objArr, objArr, i6, i5, h3);
                        } else {
                            c.h0(objArr, objArr, i6, i5, i5 + length);
                            Object[] objArr2 = this.f2485g;
                            c.h0(objArr2, objArr2, 0, this.f2484f + length, h3);
                        }
                    }
                } else {
                    c.h0(objArr, objArr, i6, i5, objArr.length);
                    Object[] objArr3 = this.f2485g;
                    if (size >= h3) {
                        c.h0(objArr3, objArr3, objArr3.length - size, 0, h3);
                    } else {
                        c.h0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f2485g;
                        c.h0(objArr4, objArr4, 0, size, h3);
                    }
                }
                this.f2484f = i6;
                c(f(h3 - size), collection);
                return true;
            }
            int i8 = h3 + size;
            Object[] objArr5 = this.f2485g;
            if (h3 < h) {
                int i9 = size + h;
                if (i9 <= objArr5.length) {
                    c.h0(objArr5, objArr5, i8, h3, h);
                } else if (i8 >= objArr5.length) {
                    c.h0(objArr5, objArr5, i8 - objArr5.length, h3, h);
                } else {
                    int length2 = h - (i9 - objArr5.length);
                    c.h0(objArr5, objArr5, 0, length2, h);
                    Object[] objArr6 = this.f2485g;
                    c.h0(objArr6, objArr6, i8, h3, length2);
                }
            } else {
                c.h0(objArr5, objArr5, size, 0, h);
                Object[] objArr7 = this.f2485g;
                if (i8 >= objArr7.length) {
                    c.h0(objArr7, objArr7, i8 - objArr7.length, h3, objArr7.length);
                } else {
                    c.h0(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.f2485g;
                    c.h0(objArr8, objArr8, i8, h3, objArr8.length - size);
                }
            }
            c(h3, collection);
            return true;
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return false;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.h + 1);
        int i3 = this.f2484f;
        if (i3 == 0) {
            Object[] objArr = this.f2485g;
            objArr.getClass();
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f2484f = i4;
        this.f2485g[i4] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f2485g[h(a() + this.f2484f)] = obj;
        this.h = a() + 1;
    }

    @Override // k2.a
    public final Object b(int i3) {
        int i4 = this.h;
        if (i3 >= 0 && i3 < i4) {
            if (i3 == a() - 1) {
                return removeLast();
            }
            if (i3 == 0) {
                return removeFirst();
            }
            i();
            int h = h(this.f2484f + i3);
            Object[] objArr = this.f2485g;
            Object obj = objArr[h];
            int i5 = this.h >> 1;
            int i6 = this.f2484f;
            if (i3 < i5) {
                if (h >= i6) {
                    c.h0(objArr, objArr, i6 + 1, i6, h);
                } else {
                    c.h0(objArr, objArr, 1, 0, h);
                    Object[] objArr2 = this.f2485g;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i7 = this.f2484f;
                    c.h0(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
                }
                Object[] objArr3 = this.f2485g;
                int i8 = this.f2484f;
                objArr3[i8] = null;
                this.f2484f = e(i8);
            } else {
                int h3 = h((a() - 1) + i6);
                Object[] objArr4 = this.f2485g;
                if (h <= h3) {
                    c.h0(objArr4, objArr4, h, h + 1, h3 + 1);
                } else {
                    c.h0(objArr4, objArr4, h, h + 1, objArr4.length);
                    Object[] objArr5 = this.f2485g;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    c.h0(objArr5, objArr5, 0, 1, h3 + 1);
                }
                this.f2485g[h3] = null;
            }
            this.h--;
            return obj;
        }
        a.b.j("index: ", i3, ", size: ", i4);
        return null;
    }

    public final void c(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2485g.length;
        while (i3 < length && it.hasNext()) {
            this.f2485g[i3] = it.next();
            i3++;
        }
        int i4 = this.f2484f;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f2485g[i5] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f2484f, h(a() + this.f2484f));
        }
        this.f2484f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i3) {
        if (i3 >= 0) {
            Object[] objArr = this.f2485g;
            if (i3 <= objArr.length) {
                return;
            }
            if (objArr == f2483i) {
                if (i3 < 10) {
                    i3 = 10;
                }
                this.f2485g = new Object[i3];
                return;
            }
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                if (i3 > 2147483639) {
                    i4 = Integer.MAX_VALUE;
                } else {
                    i4 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i4];
            c.h0(objArr, objArr2, 0, this.f2484f, objArr.length);
            Object[] objArr3 = this.f2485g;
            int length2 = objArr3.length;
            int i5 = this.f2484f;
            c.h0(objArr3, objArr2, length2 - i5, 0, i5);
            this.f2484f = 0;
            this.f2485g = objArr2;
            return;
        }
        a.b.i("Deque is too big.");
    }

    public final int e(int i3) {
        this.f2485g.getClass();
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int f(int i3) {
        if (i3 < 0) {
            return i3 + this.f2485g.length;
        }
        return i3;
    }

    public final void g(int i3, int i4) {
        Object[] objArr = this.f2485g;
        if (i3 < i4) {
            objArr.getClass();
            Arrays.fill(objArr, i3, i4, (Object) null);
        } else {
            Arrays.fill(objArr, i3, objArr.length, (Object) null);
            Object[] objArr2 = this.f2485g;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i4, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int a3 = a();
        if (i3 >= 0 && i3 < a3) {
            return this.f2485g[h(this.f2484f + i3)];
        }
        a.b.j("index: ", i3, ", size: ", a3);
        return null;
    }

    public final int h(int i3) {
        Object[] objArr = this.f2485g;
        if (i3 >= objArr.length) {
            return i3 - objArr.length;
        }
        return i3;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int h = h(a() + this.f2484f);
        int i4 = this.f2484f;
        if (i4 < h) {
            while (i4 < h) {
                if (p2.d.a(obj, this.f2485g[i4])) {
                    i3 = this.f2484f;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 >= h) {
            int length = this.f2485g.length;
            while (true) {
                if (i4 < length) {
                    if (p2.d.a(obj, this.f2485g[i4])) {
                        i3 = this.f2484f;
                        break;
                    }
                    i4++;
                } else {
                    for (int i5 = 0; i5 < h; i5++) {
                        if (p2.d.a(obj, this.f2485g[i5])) {
                            i4 = i5 + this.f2485g.length;
                            i3 = this.f2484f;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int h = h(this.h + this.f2484f);
        int i4 = this.f2484f;
        if (i4 < h) {
            length = h - 1;
            if (i4 <= length) {
                while (!p2.d.a(obj, this.f2485g[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f2484f;
                return length - i3;
            }
            return -1;
        }
        if (i4 > h) {
            while (true) {
                h--;
                Object[] objArr = this.f2485g;
                if (-1 < h) {
                    if (p2.d.a(obj, objArr[h])) {
                        length = h + this.f2485g.length;
                        i3 = this.f2484f;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i5 = this.f2484f;
                    if (i5 <= length) {
                        while (!p2.d.a(obj, this.f2485g[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i3 = this.f2484f;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2485g.length != 0) {
            int h3 = h(this.h + this.f2484f);
            int i3 = this.f2484f;
            if (i3 < h3) {
                h = i3;
                while (true) {
                    objArr = this.f2485g;
                    if (i3 >= h3) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (!collection.contains(obj)) {
                        this.f2485g[h] = obj;
                        h++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                objArr.getClass();
                Arrays.fill(objArr, h, h3, (Object) null);
            } else {
                int length = this.f2485g.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2485g;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj2)) {
                        this.f2485g[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                h = h(i4);
                for (int i5 = 0; i5 < h3; i5++) {
                    Object[] objArr3 = this.f2485g;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (!collection.contains(obj3)) {
                        this.f2485g[h] = obj3;
                        h = e(h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.h = f(h - this.f2484f);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            i();
            Object[] objArr = this.f2485g;
            int i3 = this.f2484f;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f2484f = e(i3);
            this.h = a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            i();
            int h = h((size() - 1) + this.f2484f);
            Object[] objArr = this.f2485g;
            Object obj = objArr[h];
            objArr[h] = null;
            this.h = a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        y.o(i3, i4, this.h);
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.h) {
            clear();
            return;
        }
        if (i5 == 1) {
            b(i3);
            return;
        }
        i();
        int i6 = this.h - i4;
        int i7 = this.f2484f;
        if (i3 < i6) {
            int h = h((i3 - 1) + i7);
            int h3 = h(this.f2484f + (i4 - 1));
            while (i3 > 0) {
                int i8 = h + 1;
                int min = Math.min(i3, Math.min(i8, h3 + 1));
                Object[] objArr = this.f2485g;
                int i9 = h3 - min;
                int i10 = h - min;
                c.h0(objArr, objArr, i9 + 1, i10 + 1, i8);
                h = f(i10);
                h3 = f(i9);
                i3 -= min;
            }
            int h4 = h(this.f2484f + i5);
            g(this.f2484f, h4);
            this.f2484f = h4;
        } else {
            int h5 = h(i7 + i4);
            int h6 = h(this.f2484f + i3);
            int i11 = this.h;
            while (true) {
                i11 -= i4;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2485g;
                i4 = Math.min(i11, Math.min(objArr2.length - h5, objArr2.length - h6));
                Object[] objArr3 = this.f2485g;
                int i12 = h5 + i4;
                c.h0(objArr3, objArr3, h6, h5, i12);
                h5 = h(i12);
                h6 = h(h6 + i4);
            }
            int h7 = h(this.h + this.f2484f);
            g(f(h7 - i5), h7);
        }
        this.h -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2485g.length != 0) {
            int h3 = h(this.h + this.f2484f);
            int i3 = this.f2484f;
            if (i3 < h3) {
                h = i3;
                while (true) {
                    objArr = this.f2485g;
                    if (i3 >= h3) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.f2485g[h] = obj;
                        h++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                objArr.getClass();
                Arrays.fill(objArr, h, h3, (Object) null);
            } else {
                int length = this.f2485g.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2485g;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f2485g[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                h = h(i4);
                for (int i5 = 0; i5 < h3; i5++) {
                    Object[] objArr3 = this.f2485g;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f2485g[h] = obj3;
                        h = e(h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.h = f(h - this.f2484f);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int a3 = a();
        if (i3 >= 0 && i3 < a3) {
            int h = h(this.f2484f + i3);
            Object[] objArr = this.f2485g;
            Object obj2 = objArr[h];
            objArr[h] = obj;
            return obj2;
        }
        a.b.j("index: ", i3, ", size: ", a3);
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i3 = this.h;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int h = h(this.h + this.f2484f);
        int i4 = this.f2484f;
        if (i4 < h) {
            c.i0(this.f2485g, objArr, i4, h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2485g;
            c.h0(objArr2, objArr, 0, this.f2484f, objArr2.length);
            Object[] objArr3 = this.f2485g;
            c.h0(objArr3, objArr, objArr3.length - this.f2484f, 0, h);
        }
        int i5 = this.h;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f2484f), collection);
        return true;
    }
}
