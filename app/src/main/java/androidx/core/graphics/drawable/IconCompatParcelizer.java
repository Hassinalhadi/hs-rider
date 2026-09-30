package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h1.a;
import h1.b;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(a aVar) {
        int readInt;
        ?? obj = new Object();
        obj.f238a = -1;
        byte[] bArr = null;
        obj.f240c = null;
        obj.d = null;
        obj.f241e = 0;
        obj.f242f = 0;
        obj.f243g = null;
        obj.h = IconCompat.f237k;
        obj.f244i = null;
        if (!aVar.e(1)) {
            readInt = -1;
        } else {
            readInt = ((b) aVar).f1901e.readInt();
        }
        obj.f238a = readInt;
        byte[] bArr2 = obj.f240c;
        if (!aVar.e(2)) {
            bArr = bArr2;
        } else {
            Parcel parcel = ((b) aVar).f1901e;
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
            }
        }
        obj.f240c = bArr;
        obj.d = aVar.f(obj.d, 3);
        int i3 = obj.f241e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f1901e.readInt();
        }
        obj.f241e = i3;
        int i4 = obj.f242f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f1901e.readInt();
        }
        obj.f242f = i4;
        obj.f243g = (ColorStateList) aVar.f(obj.f243g, 6);
        String str = obj.f244i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1901e.readString();
        }
        obj.f244i = str;
        String str2 = obj.f245j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1901e.readString();
        }
        obj.f245j = str2;
        obj.h = PorterDuff.Mode.valueOf(obj.f244i);
        switch (obj.f238a) {
            case -1:
                Parcelable parcelable = obj.d;
                if (parcelable != null) {
                    obj.f239b = parcelable;
                    return obj;
                }
                a.b.m("Invalid icon");
                return null;
            case 0:
            default:
                return obj;
            case 1:
            case 5:
                Parcelable parcelable2 = obj.d;
                if (parcelable2 != null) {
                    obj.f239b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.f240c;
                obj.f239b = bArr3;
                obj.f238a = 3;
                obj.f241e = 0;
                obj.f242f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case 6:
                String str3 = new String(obj.f240c, Charset.forName("UTF-16"));
                obj.f239b = str3;
                if (obj.f238a == 2 && obj.f245j == null) {
                    obj.f245j = str3.split(":", -1)[0];
                }
                return obj;
            case 3:
                obj.f239b = obj.f240c;
                return obj;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f244i = iconCompat.h.name();
        switch (iconCompat.f238a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f239b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f239b;
                break;
            case 2:
                iconCompat.f240c = ((String) iconCompat.f239b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f240c = (byte[]) iconCompat.f239b;
                break;
            case 4:
            case 6:
                iconCompat.f240c = iconCompat.f239b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f238a;
        if (-1 != i3) {
            aVar.h(1);
            ((b) aVar).f1901e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f240c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f1901e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1901e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f241e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f1901e.writeInt(i4);
        }
        int i5 = iconCompat.f242f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).f1901e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f243g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1901e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f244i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1901e.writeString(str);
        }
        String str2 = iconCompat.f245j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1901e.writeString(str2);
        }
    }
}
