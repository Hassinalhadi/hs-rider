package k;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w2 extends o0.b {
    public static final Parcelable.Creator<w2> CREATOR = new b1.v0(3);
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2433i;

    public w2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        this.h = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2433i = z2;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f2433i ? 1 : 0);
    }
}
