package c0;

import android.graphics.Insets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1081e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1084c;
    public final int d;

    public b(int i3, int i4, int i5, int i6) {
        this.f1082a = i3;
        this.f1083b = i4;
        this.f1084c = i5;
        this.d = i6;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.min(bVar.f1082a, bVar2.f1082a), Math.min(bVar.f1083b, bVar2.f1083b), Math.min(bVar.f1084c, bVar2.f1084c), Math.min(bVar.d, bVar2.d));
    }

    public static b b(int i3, int i4, int i5, int i6) {
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return f1081e;
        }
        return new b(i3, i4, i5, i6);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.f1082a, this.f1083b, this.f1084c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f1082a == bVar.f1082a && this.f1084c == bVar.f1084c && this.f1083b == bVar.f1083b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1082a * 31) + this.f1083b) * 31) + this.f1084c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1082a + ", top=" + this.f1083b + ", right=" + this.f1084c + ", bottom=" + this.d + '}';
    }
}
