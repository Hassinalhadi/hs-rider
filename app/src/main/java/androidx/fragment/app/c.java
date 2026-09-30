package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public final int[] f355f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f356g;
    public final int[] h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f357i;

    /* renamed from: j, reason: collision with root package name */
    public final int f358j;

    /* renamed from: k, reason: collision with root package name */
    public final String f359k;

    /* renamed from: l, reason: collision with root package name */
    public final int f360l;

    /* renamed from: m, reason: collision with root package name */
    public final int f361m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f362n;

    /* renamed from: o, reason: collision with root package name */
    public final int f363o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f364p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f365q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f366r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f367s;

    public c(a aVar) {
        String str;
        int size = aVar.f334a.size();
        this.f355f = new int[size * 6];
        if (aVar.f339g) {
            this.f356g = new ArrayList(size);
            this.h = new int[size];
            this.f357i = new int[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                r0 r0Var = (r0) aVar.f334a.get(i4);
                int i5 = i3 + 1;
                this.f355f[i3] = r0Var.f470a;
                ArrayList arrayList = this.f356g;
                u uVar = r0Var.f471b;
                if (uVar != null) {
                    str = uVar.f494j;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.f355f;
                iArr[i5] = r0Var.f472c ? 1 : 0;
                iArr[i3 + 2] = r0Var.d;
                iArr[i3 + 3] = r0Var.f473e;
                int i6 = i3 + 5;
                iArr[i3 + 4] = r0Var.f474f;
                i3 += 6;
                iArr[i6] = r0Var.f475g;
                this.h[i4] = r0Var.h.ordinal();
                this.f357i[i4] = r0Var.f476i.ordinal();
            }
            this.f358j = aVar.f338f;
            this.f359k = aVar.h;
            this.f360l = aVar.f349r;
            this.f361m = aVar.f340i;
            this.f362n = aVar.f341j;
            this.f363o = aVar.f342k;
            this.f364p = aVar.f343l;
            this.f365q = aVar.f344m;
            this.f366r = aVar.f345n;
            this.f367s = aVar.f346o;
            return;
        }
        a.b.i("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f355f);
        parcel.writeStringList(this.f356g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.f357i);
        parcel.writeInt(this.f358j);
        parcel.writeString(this.f359k);
        parcel.writeInt(this.f360l);
        parcel.writeInt(this.f361m);
        TextUtils.writeToParcel(this.f362n, parcel, 0);
        parcel.writeInt(this.f363o);
        TextUtils.writeToParcel(this.f364p, parcel, 0);
        parcel.writeStringList(this.f365q);
        parcel.writeStringList(this.f366r);
        parcel.writeInt(this.f367s ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f355f = parcel.createIntArray();
        this.f356g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.f357i = parcel.createIntArray();
        this.f358j = parcel.readInt();
        this.f359k = parcel.readString();
        this.f360l = parcel.readInt();
        this.f361m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f362n = (CharSequence) creator.createFromParcel(parcel);
        this.f363o = parcel.readInt();
        this.f364p = (CharSequence) creator.createFromParcel(parcel);
        this.f365q = parcel.createStringArrayList();
        this.f366r = parcel.createStringArrayList();
        this.f367s = parcel.readInt() != 0;
    }
}
