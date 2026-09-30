package b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new androidx.fragment.app.b(6);

    /* renamed from: f, reason: collision with root package name */
    public int f787f;

    /* renamed from: g, reason: collision with root package name */
    public int f788g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f789i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f787f + ", mGapDir=" + this.f788g + ", mHasUnwantedGapAfter=" + this.f789i + ", mGapPerSpan=" + Arrays.toString(this.h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f787f);
        parcel.writeInt(this.f788g);
        parcel.writeInt(this.f789i ? 1 : 0);
        int[] iArr = this.h;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.h);
        } else {
            parcel.writeInt(0);
        }
    }
}
