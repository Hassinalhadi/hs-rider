package x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import b1.v0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends o0.b {
    public static final Parcelable.Creator<f> CREATOR = new v0(8);
    public SparseArray h;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.h = new SparseArray(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            this.h.append(iArr[i3], readParcelableArray[i3]);
        }
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4;
        super.writeToParcel(parcel, i3);
        SparseArray sparseArray = this.h;
        if (sparseArray != null) {
            i4 = sparseArray.size();
        } else {
            i4 = 0;
        }
        parcel.writeInt(i4);
        int[] iArr = new int[i4];
        Parcelable[] parcelableArr = new Parcelable[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i5] = this.h.keyAt(i5);
            parcelableArr[i5] = (Parcelable) this.h.valueAt(i5);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i3);
    }
}
