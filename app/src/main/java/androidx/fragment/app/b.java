package androidx.fragment.app;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import b1.i1;
import b1.j1;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f352a;

    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.View$BaseSavedState, k.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [android.view.View$BaseSavedState, n0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [android.view.View$BaseSavedState, q1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.fragment.app.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.fragment.app.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [b1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, b1.i1] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, b1.j1] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        boolean z3;
        Intent intent;
        boolean z4;
        switch (this.f352a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                ?? obj = new Object();
                obj.f389f = parcel.readString();
                obj.f390g = parcel.readInt();
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.f428j = null;
                obj2.f429k = new ArrayList();
                obj2.f430l = new ArrayList();
                obj2.f425f = parcel.createStringArrayList();
                obj2.f426g = parcel.createStringArrayList();
                obj2.h = (c[]) parcel.createTypedArray(c.CREATOR);
                obj2.f427i = parcel.readInt();
                obj2.f428j = parcel.readString();
                obj2.f429k = parcel.createStringArrayList();
                obj2.f430l = parcel.createTypedArrayList(d.CREATOR);
                obj2.f431m = parcel.createTypedArrayList(h0.CREATOR);
                return obj2;
            case 4:
                return new o0(parcel);
            case 5:
                ?? obj3 = new Object();
                obj3.f930f = parcel.readInt();
                obj3.f931g = parcel.readInt();
                boolean z5 = true;
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj3.h = z5;
                return obj3;
            case 6:
                ?? obj4 = new Object();
                obj4.f787f = parcel.readInt();
                obj4.f788g = parcel.readInt();
                boolean z6 = true;
                if (parcel.readInt() != 1) {
                    z6 = false;
                }
                obj4.f789i = z6;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj4.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 7:
                ?? obj5 = new Object();
                obj5.f807f = parcel.readInt();
                obj5.f808g = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj5.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj5.f809i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj5.f810j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj5.f811k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z7 = false;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj5.f813m = z2;
                if (parcel.readInt() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                obj5.f814n = z3;
                if (parcel.readInt() == 1) {
                    z7 = true;
                }
                obj5.f815o = z7;
                obj5.f812l = parcel.readArrayList(i1.class.getClassLoader());
                return obj5;
            case 8:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    intent = null;
                } else {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new c.a(intent, readInt4);
            case 9:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), parcel.readInt());
            case 10:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 11:
                return com.google.android.material.datepicker.r.a(parcel.readInt(), parcel.readInt());
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                baseSavedState.f2344f = z4;
                return baseSavedState;
            case 14:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f2601f = parcel.readInt();
                return baseSavedState2;
            default:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f2785f = ((Integer) parcel.readValue(q1.b.class.getClassLoader())).intValue();
                return baseSavedState3;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f352a) {
            case 0:
                return new c[i3];
            case 1:
                return new d[i3];
            case 2:
                return new h0[i3];
            case 3:
                return new l0[i3];
            case 4:
                return new o0[i3];
            case 5:
                return new b1.x[i3];
            case 6:
                return new i1[i3];
            case 7:
                return new j1[i3];
            case 8:
                return new c.a[i3];
            case 9:
                return new com.google.android.material.datepicker.b[i3];
            case 10:
                return new com.google.android.material.datepicker.d[i3];
            case 11:
                return new com.google.android.material.datepicker.r[i3];
            case 12:
                return new ParcelImpl[i3];
            case 13:
                return new k.o0[i3];
            case 14:
                return new n0.g[i3];
            default:
                return new q1.b[i3];
        }
    }
}
