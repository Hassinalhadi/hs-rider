package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new b(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f441f;

    /* renamed from: g, reason: collision with root package name */
    public final String f442g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final int f443i;

    /* renamed from: j, reason: collision with root package name */
    public final int f444j;

    /* renamed from: k, reason: collision with root package name */
    public final String f445k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f446l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f447m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f448n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f449o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f450p;

    /* renamed from: q, reason: collision with root package name */
    public final int f451q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f452r;

    public o0(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f441f = parcel.readString();
        this.f442g = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        this.f443i = parcel.readInt();
        this.f444j = parcel.readInt();
        this.f445k = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f446l = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f447m = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f448n = z5;
        this.f449o = parcel.readBundle();
        this.f450p = parcel.readInt() != 0;
        this.f452r = parcel.readBundle();
        this.f451q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f441f);
        sb.append(" (");
        sb.append(this.f442g);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        int i3 = this.f444j;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.f445k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f446l) {
            sb.append(" retainInstance");
        }
        if (this.f447m) {
            sb.append(" removing");
        }
        if (this.f448n) {
            sb.append(" detached");
        }
        if (this.f450p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f441f);
        parcel.writeString(this.f442g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f443i);
        parcel.writeInt(this.f444j);
        parcel.writeString(this.f445k);
        parcel.writeInt(this.f446l ? 1 : 0);
        parcel.writeInt(this.f447m ? 1 : 0);
        parcel.writeInt(this.f448n ? 1 : 0);
        parcel.writeBundle(this.f449o);
        parcel.writeInt(this.f450p ? 1 : 0);
        parcel.writeBundle(this.f452r);
        parcel.writeInt(this.f451q);
    }

    public o0(u uVar) {
        this.f441f = uVar.getClass().getName();
        this.f442g = uVar.f494j;
        this.h = uVar.f502r;
        this.f443i = uVar.A;
        this.f444j = uVar.B;
        this.f445k = uVar.C;
        this.f446l = uVar.F;
        this.f447m = uVar.f501q;
        this.f448n = uVar.E;
        this.f449o = uVar.f495k;
        this.f450p = uVar.D;
        this.f451q = uVar.Q.ordinal();
    }
}
