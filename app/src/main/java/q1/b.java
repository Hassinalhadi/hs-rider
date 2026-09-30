package q1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(15);

    /* renamed from: f, reason: collision with root package name */
    public int f2785f;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i3 = this.f2785f;
        if (i3 != 1) {
            if (i3 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Integer.valueOf(this.f2785f));
    }
}
