package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g implements Collection, Set, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public int[] f2566f = o.a.f2609a;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2567g = o.a.f2610b;
    public int h;

    public final Object a(int i3) {
        int i4 = this.h;
        Object[] objArr = this.f2567g;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f2566f;
        int i6 = 8;
        if (iArr.length > 8 && i4 < iArr.length / 3) {
            if (i4 > 8) {
                i6 = i4 + (i4 >> 1);
            }
            int[] iArr2 = new int[i6];
            this.f2566f = iArr2;
            this.f2567g = new Object[i6];
            if (i3 > 0) {
                k2.c.g0(0, 0, i3, iArr, iArr2);
                k2.c.i0(objArr, this.f2567g, 0, i3, 6);
            }
            if (i3 < i5) {
                int i7 = i3 + 1;
                k2.c.g0(i3, i7, i4, iArr, this.f2566f);
                k2.c.h0(objArr, this.f2567g, i3, i7, i4);
            }
        } else {
            if (i3 < i5) {
                int i8 = i3 + 1;
                k2.c.g0(i3, i8, i4, iArr, iArr);
                Object[] objArr2 = this.f2567g;
                k2.c.h0(objArr2, objArr2, i3, i8, i4);
            }
            this.f2567g[i5] = null;
        }
        if (i4 == this.h) {
            this.h = i5;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int a3;
        int i4 = this.h;
        if (obj == null) {
            a3 = i.a(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            a3 = i.a(this, obj, hashCode);
        }
        if (a3 >= 0) {
            return false;
        }
        int i5 = ~a3;
        int[] iArr = this.f2566f;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f2567g;
            int[] iArr2 = new int[i6];
            this.f2566f = iArr2;
            this.f2567g = new Object[i6];
            if (i4 == this.h) {
                if (iArr2.length != 0) {
                    k2.c.g0(0, 0, iArr.length, iArr, iArr2);
                    k2.c.i0(objArr, this.f2567g, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f2566f;
            int i7 = i5 + 1;
            k2.c.g0(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f2567g;
            k2.c.h0(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.h;
        if (i4 == i8) {
            int[] iArr4 = this.f2566f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f2567g[i5] = obj;
                this.h = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.h;
        int i3 = this.h;
        int[] iArr = this.f2566f;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2567g;
            int[] iArr2 = new int[size];
            this.f2566f = iArr2;
            this.f2567g = new Object[size];
            if (i3 > 0) {
                k2.c.g0(0, 0, i3, iArr, iArr2);
                k2.c.i0(objArr, this.f2567g, 0, this.h, 6);
            }
        }
        if (this.h == i3) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z2 |= add(it.next());
            }
            return z2;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.h != 0) {
            this.f2566f = o.a.f2609a;
            this.f2567g = o.a.f2610b;
            this.h = 0;
        }
        if (this.h == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int a3;
        if (obj == null) {
            a3 = i.a(this, null, 0);
        } else {
            a3 = i.a(this, obj, obj.hashCode());
        }
        if (a3 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof Set) && this.h == ((Set) obj).size()) {
                try {
                    int i3 = this.h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (((Set) obj).contains(this.f2567g[i4])) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f2566f;
        int i3 = this.h;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.h <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a3;
        if (obj == null) {
            a3 = i.a(this, null, 0);
        } else {
            a3 = i.a(this, obj, obj.hashCode());
        }
        if (a3 < 0) {
            return false;
        }
        a(a3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z2 = false;
        for (int i3 = this.h - 1; -1 < i3; i3--) {
            if (!collection.contains(this.f2567g[i3])) {
                a(i3);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i3 = this.h;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        k2.c.h0(this.f2567g, objArr, 0, 0, this.h);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2567g[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return k2.c.j0(this.f2567g, 0, this.h);
    }
}
