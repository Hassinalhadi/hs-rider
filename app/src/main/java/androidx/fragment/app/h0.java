package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new b(2);

    /* renamed from: f, reason: collision with root package name */
    public String f389f;

    /* renamed from: g, reason: collision with root package name */
    public int f390g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f389f);
        parcel.writeInt(this.f390g);
    }
}
