package o1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.v0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends o0.b {
    public static final Parcelable.Creator<c> CREATOR = new v0(6);
    public boolean h;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.h = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
