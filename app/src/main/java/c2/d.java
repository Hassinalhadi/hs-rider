package c2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import b1.v0;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends o0.b {
    public static final Parcelable.Creator<d> CREATOR = new v0(1);
    public final int h;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.h);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = sideSheetBehavior.h;
    }
}
