package l2;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements ListIterator, q2.a {

    /* renamed from: g, reason: collision with root package name */
    public int f2502g;

    /* renamed from: i, reason: collision with root package name */
    public int f2503i;

    /* renamed from: j, reason: collision with root package name */
    public final k2.a f2504j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2501f = 0;
    public int h = -1;

    public a(c cVar, int i3) {
        int i4;
        this.f2504j = cVar;
        this.f2502g = i3;
        i4 = ((AbstractList) cVar).modCount;
        this.f2503i = i4;
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((b) this.f2504j).f2508j).modCount;
        if (i3 == this.f2503i) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        int i4;
        switch (this.f2501f) {
            case 0:
                a();
                b bVar = (b) this.f2504j;
                int i5 = this.f2502g;
                this.f2502g = i5 + 1;
                bVar.add(i5, obj);
                this.h = -1;
                i3 = ((AbstractList) bVar).modCount;
                this.f2503i = i3;
                return;
            default:
                b();
                c cVar = (c) this.f2504j;
                int i6 = this.f2502g;
                this.f2502g = i6 + 1;
                cVar.add(i6, obj);
                this.h = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.f2503i = i4;
                return;
        }
    }

    public void b() {
        int i3;
        i3 = ((AbstractList) ((c) this.f2504j)).modCount;
        if (i3 == this.f2503i) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2501f) {
            case 0:
                if (this.f2502g < ((b) this.f2504j).h) {
                    return true;
                }
                return false;
            default:
                if (this.f2502g < ((c) this.f2504j).f2511g) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2501f) {
            case 0:
                if (this.f2502g > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f2502g > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2501f) {
            case 0:
                a();
                int i3 = this.f2502g;
                b bVar = (b) this.f2504j;
                if (i3 < bVar.h) {
                    this.f2502g = i3 + 1;
                    this.h = i3;
                    return bVar.f2505f[bVar.f2506g + i3];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i4 = this.f2502g;
                c cVar = (c) this.f2504j;
                if (i4 < cVar.f2511g) {
                    this.f2502g = i4 + 1;
                    this.h = i4;
                    return cVar.f2510f[i4];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2501f) {
            case 0:
                return this.f2502g;
            default:
                return this.f2502g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2501f) {
            case 0:
                a();
                int i3 = this.f2502g;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.f2502g = i4;
                    this.h = i4;
                    b bVar = (b) this.f2504j;
                    return bVar.f2505f[bVar.f2506g + i4];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i5 = this.f2502g;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.f2502g = i6;
                    this.h = i6;
                    return ((c) this.f2504j).f2510f[i6];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i3;
        switch (this.f2501f) {
            case 0:
                i3 = this.f2502g;
                break;
            default:
                i3 = this.f2502g;
                break;
        }
        return i3 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        int i4;
        switch (this.f2501f) {
            case 0:
                b bVar = (b) this.f2504j;
                a();
                int i5 = this.h;
                if (i5 != -1) {
                    bVar.b(i5);
                    this.f2502g = this.h;
                    this.h = -1;
                    i3 = ((AbstractList) bVar).modCount;
                    this.f2503i = i3;
                    return;
                }
                a.b.i("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c cVar = (c) this.f2504j;
                b();
                int i6 = this.h;
                if (i6 != -1) {
                    cVar.b(i6);
                    this.f2502g = this.h;
                    this.h = -1;
                    i4 = ((AbstractList) cVar).modCount;
                    this.f2503i = i4;
                    return;
                }
                a.b.i("Call next() or previous() before removing element from the iterator.");
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2501f) {
            case 0:
                a();
                int i3 = this.h;
                if (i3 != -1) {
                    ((b) this.f2504j).set(i3, obj);
                    return;
                } else {
                    a.b.i("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                b();
                int i4 = this.h;
                if (i4 != -1) {
                    ((c) this.f2504j).set(i4, obj);
                    return;
                } else {
                    a.b.i("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public a(b bVar, int i3) {
        int i4;
        this.f2504j = bVar;
        this.f2502g = i3;
        i4 = ((AbstractList) bVar).modCount;
        this.f2503i = i4;
    }
}
