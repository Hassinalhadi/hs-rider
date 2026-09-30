package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f425f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f426g;
    public c[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f427i;

    /* renamed from: j, reason: collision with root package name */
    public String f428j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f429k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f430l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f431m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f425f);
        parcel.writeStringList(this.f426g);
        parcel.writeTypedArray(this.h, i3);
        parcel.writeInt(this.f427i);
        parcel.writeString(this.f428j);
        parcel.writeStringList(this.f429k);
        parcel.writeTypedList(this.f430l);
        parcel.writeTypedList(this.f431m);
    }
}
