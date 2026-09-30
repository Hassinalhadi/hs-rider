package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import h1.a;
import h1.b;
import h1.c;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(a aVar) {
        ?? obj = new Object();
        c cVar = obj.f232a;
        boolean z2 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        obj.f232a = (IconCompat) cVar;
        CharSequence charSequence = obj.f233b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1901e);
        }
        obj.f233b = charSequence;
        CharSequence charSequence2 = obj.f234c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1901e);
        }
        obj.f234c = charSequence2;
        obj.d = (PendingIntent) aVar.f(obj.d, 4);
        boolean z3 = obj.f235e;
        if (aVar.e(5)) {
            if (((b) aVar).f1901e.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        obj.f235e = z3;
        boolean z4 = obj.f236f;
        if (!aVar.e(6)) {
            z2 = z4;
        } else if (((b) aVar).f1901e.readInt() == 0) {
            z2 = false;
        }
        obj.f236f = z2;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f232a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f233b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1901e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f234c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f235e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f236f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
