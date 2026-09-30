package o0;

import android.os.Parcel;
import android.os.Parcelable;
import b1.v0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    public final Parcelable f2612f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f2611g = new b();
    public static final Parcelable.Creator<b> CREATOR = new v0(5);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2612f = parcelable == f2611g ? null : parcelable;
        } else {
            a.b.m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2612f, i3);
    }

    public b() {
        this.f2612f = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2612f = readParcelable == null ? f2611g : readParcelable;
    }
}
