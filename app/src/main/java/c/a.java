package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new androidx.fragment.app.b(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f1076f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f1077g;

    public a(Intent intent, int i3) {
        this.f1076f = i3;
        this.f1077g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f1076f;
        if (i3 != -1) {
            if (i3 != 0) {
                str = String.valueOf(i3);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f1077g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4;
        parcel.getClass();
        parcel.writeInt(this.f1076f);
        Intent intent = this.f1077g;
        if (intent == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        parcel.writeInt(i4);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }
}
