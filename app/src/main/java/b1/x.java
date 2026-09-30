package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new androidx.fragment.app.b(5);

    /* renamed from: f, reason: collision with root package name */
    public int f930f;

    /* renamed from: g, reason: collision with root package name */
    public int f931g;
    public boolean h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f930f);
        parcel.writeInt(this.f931g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
