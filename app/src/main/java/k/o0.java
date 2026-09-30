package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new androidx.fragment.app.b(13);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2344f;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f2344f ? (byte) 1 : (byte) 0);
    }
}
