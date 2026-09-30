package b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j1 implements Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new androidx.fragment.app.b(7);

    /* renamed from: f, reason: collision with root package name */
    public int f807f;

    /* renamed from: g, reason: collision with root package name */
    public int f808g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f809i;

    /* renamed from: j, reason: collision with root package name */
    public int f810j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f811k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f812l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f813m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f814n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f815o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f807f);
        parcel.writeInt(this.f808g);
        parcel.writeInt(this.h);
        if (this.h > 0) {
            parcel.writeIntArray(this.f809i);
        }
        parcel.writeInt(this.f810j);
        if (this.f810j > 0) {
            parcel.writeIntArray(this.f811k);
        }
        parcel.writeInt(this.f813m ? 1 : 0);
        parcel.writeInt(this.f814n ? 1 : 0);
        parcel.writeInt(this.f815o ? 1 : 0);
        parcel.writeList(this.f812l);
    }
}
