package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f371f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f372g;

    public d(Parcel parcel) {
        this.f371f = parcel.createStringArrayList();
        this.f372g = parcel.createTypedArrayList(c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f371f);
        parcel.writeTypedList(this.f372g);
    }
}
