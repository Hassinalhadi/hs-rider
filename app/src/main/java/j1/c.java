package j1;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f2198a;

    /* renamed from: b, reason: collision with root package name */
    public long f2199b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f2200c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2201e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f2200c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f2194b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2198a != cVar.f2198a || this.f2199b != cVar.f2199b || this.d != cVar.d || this.f2201e != cVar.f2201e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j3 = this.f2198a;
        long j4 = this.f2199b;
        return ((((a().getClass().hashCode() + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.d) * 31) + this.f2201e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f2198a + " duration: " + this.f2199b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f2201e + "}\n";
    }
}
