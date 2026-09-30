package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w0 extends o0.b {
    public static final Parcelable.Creator<w0> CREATOR = new v0(0);
    public Parcelable h;

    public w0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readParcelable(classLoader == null ? n0.class.getClassLoader() : classLoader);
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.h, 0);
    }
}
