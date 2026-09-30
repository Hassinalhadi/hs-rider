package t2;

import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Iterable, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f3015f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3016g;
    public final int h;

    static {
        new b(1, 0, 1);
    }

    public b(int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != Integer.MIN_VALUE) {
                this.f3015f = i3;
                if (i5 > 0) {
                    if (i3 < i4) {
                        int i6 = i4 % i5;
                        int i7 = i3 % i5;
                        int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                        i4 -= i8 < 0 ? i8 + i5 : i8;
                    }
                } else if (i5 < 0) {
                    if (i3 > i4) {
                        int i9 = -i5;
                        int i10 = i3 % i9;
                        int i11 = i4 % i9;
                        int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                        i4 += i12 < 0 ? i12 + i9 : i12;
                    }
                } else {
                    a.b.m("Step is zero.");
                    throw null;
                }
                this.f3016g = i4;
                this.h = i5;
                return;
            }
            a.b.m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        a.b.m("Step must be non-zero.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.f3015f == bVar.f3015f && this.f3016g == bVar.f3016g) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3015f * 31) + this.f3016g;
    }

    public final boolean isEmpty() {
        if (this.f3015f > this.f3016g) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f3015f, this.f3016g, this.h);
    }

    public final String toString() {
        return this.f3015f + ".." + this.f3016g;
    }
}
