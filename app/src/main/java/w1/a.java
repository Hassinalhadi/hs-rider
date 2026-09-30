package w1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.v0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends o0.b {
    public static final Parcelable.Creator<a> CREATOR = new v0(7);
    public boolean h;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
