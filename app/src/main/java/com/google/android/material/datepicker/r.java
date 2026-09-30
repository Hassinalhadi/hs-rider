package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new androidx.fragment.app.b(11);

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f1269f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1270g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1271i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1272j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1273k;

    /* renamed from: l, reason: collision with root package name */
    public String f1274l;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a3 = z.a(calendar);
        this.f1269f = a3;
        this.f1270g = a3.get(2);
        this.h = a3.get(1);
        this.f1271i = a3.getMaximum(7);
        this.f1272j = a3.getActualMaximum(5);
        this.f1273k = a3.getTimeInMillis();
    }

    public static r a(int i3, int i4) {
        Calendar c3 = z.c(null);
        c3.set(1, i3);
        c3.set(2, i4);
        return new r(c3);
    }

    public static r b(long j3) {
        Calendar c3 = z.c(null);
        c3.setTimeInMillis(j3);
        return new r(c3);
    }

    public final String c() {
        if (this.f1274l == null) {
            long timeInMillis = this.f1269f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z.f1286a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1274l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1274l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1269f.compareTo(((r) obj).f1269f);
    }

    public final int d(r rVar) {
        if (this.f1269f instanceof GregorianCalendar) {
            return (rVar.f1270g - this.f1270g) + ((rVar.h - this.h) * 12);
        }
        a.b.m("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f1270g == rVar.f1270g && this.h == rVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1270g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.f1270g);
    }
}
