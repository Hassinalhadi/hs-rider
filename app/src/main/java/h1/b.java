package h1;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.f;
import n.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1902f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1903g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1904i;

    /* renamed from: j, reason: collision with root package name */
    public int f1905j;

    /* renamed from: k, reason: collision with root package name */
    public int f1906k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n.f, n.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n.f, n.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n.f, n.j] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // h1.a
    public final b a() {
        Parcel parcel = this.f1901e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1905j;
        if (i3 == this.f1902f) {
            i3 = this.f1903g;
        }
        return new b(parcel, dataPosition, i3, this.h + "  ", this.f1898a, this.f1899b, this.f1900c);
    }

    @Override // h1.a
    public final boolean e(int i3) {
        while (true) {
            int i4 = this.f1905j;
            int i5 = this.f1906k;
            if (i4 < this.f1903g) {
                if (i5 != i3) {
                    if (String.valueOf(i5).compareTo(String.valueOf(i3)) <= 0) {
                        int i6 = this.f1905j;
                        Parcel parcel = this.f1901e;
                        parcel.setDataPosition(i6);
                        int readInt = parcel.readInt();
                        this.f1906k = parcel.readInt();
                        this.f1905j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                if (i5 == i3) {
                    return true;
                }
                return false;
            }
        }
    }

    @Override // h1.a
    public final void h(int i3) {
        int i4 = this.f1904i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f1901e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1904i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f1904i = -1;
        this.f1906k = -1;
        this.f1901e = parcel;
        this.f1902f = i3;
        this.f1903g = i4;
        this.f1905j = i3;
        this.h = str;
    }
}
