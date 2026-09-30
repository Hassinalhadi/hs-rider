package e2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.v0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d0 extends o0.b {
    public static final Parcelable.Creator<d0> CREATOR = new v0(2);
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1424i;

    public d0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1424i = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.h) + "}";
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        TextUtils.writeToParcel(this.h, parcel, i3);
        parcel.writeInt(this.f1424i ? 1 : 0);
    }
}
