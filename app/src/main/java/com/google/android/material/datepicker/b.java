package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(9);

    /* renamed from: f, reason: collision with root package name */
    public final r f1219f;

    /* renamed from: g, reason: collision with root package name */
    public final r f1220g;
    public final d h;

    /* renamed from: i, reason: collision with root package name */
    public final r f1221i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1222j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1223k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1224l;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i3) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1219f = rVar;
        this.f1220g = rVar2;
        this.f1221i = rVar3;
        this.f1222j = i3;
        this.h = dVar;
        if (rVar3 != null && rVar.f1269f.compareTo(rVar3.f1269f) > 0) {
            a.b.m("start Month cannot be after current Month");
            throw null;
        }
        if (rVar3 != null && rVar3.f1269f.compareTo(rVar2.f1269f) > 0) {
            a.b.m("current Month cannot be after end Month");
            throw null;
        }
        if (i3 >= 0 && i3 <= z.c(null).getMaximum(7)) {
            this.f1224l = rVar.d(rVar2) + 1;
            this.f1223k = (rVar2.h - rVar.h) + 1;
        } else {
            a.b.m("firstDayOfWeek is not valid");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1219f.equals(bVar.f1219f) && this.f1220g.equals(bVar.f1220g) && Objects.equals(this.f1221i, bVar.f1221i) && this.f1222j == bVar.f1222j && this.h.equals(bVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1219f, this.f1220g, this.f1221i, Integer.valueOf(this.f1222j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f1219f, 0);
        parcel.writeParcelable(this.f1220g, 0);
        parcel.writeParcelable(this.f1221i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.f1222j);
    }
}
