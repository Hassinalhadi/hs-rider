package t2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements Iterator, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f3012f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3013g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f3014i;

    public a(int i3, int i4, int i5) {
        this.f3012f = i5;
        this.f3013g = i4;
        boolean z2 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z2 = true;
        }
        this.h = z2;
        this.f3014i = z2 ? i3 : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f3014i;
        if (i3 == this.f3013g) {
            if (this.h) {
                this.h = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f3014i = this.f3012f + i3;
        }
        return Integer.valueOf(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
