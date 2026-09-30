package n1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import b1.v0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends o0.b {
    public static final Parcelable.Creator<a> CREATOR = new v0(4);
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2602i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2603j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2604k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2605l;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        boolean z3;
        this.h = parcel.readInt();
        this.f2602i = parcel.readInt();
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2603j = z2;
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2604k = z3;
        this.f2605l = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f2602i);
        parcel.writeInt(this.f2603j ? 1 : 0);
        parcel.writeInt(this.f2604k ? 1 : 0);
        parcel.writeInt(this.f2605l ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.N;
        this.f2602i = bottomSheetBehavior.f1148e;
        this.f2603j = bottomSheetBehavior.f1143b;
        this.f2604k = bottomSheetBehavior.I;
        this.f2605l = bottomSheetBehavior.J;
    }
}
