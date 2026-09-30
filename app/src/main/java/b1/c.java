package b1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f725a = 0;

    /* renamed from: b, reason: collision with root package name */
    public c f726b;

    public final void a(int i3) {
        if (i3 >= 64) {
            c cVar = this.f726b;
            if (cVar != null) {
                cVar.a(i3 - 64);
                return;
            }
            return;
        }
        this.f725a &= ~(1 << i3);
    }

    public final int b(int i3) {
        c cVar = this.f726b;
        if (cVar == null) {
            long j3 = this.f725a;
            if (i3 >= 64) {
                return Long.bitCount(j3);
            }
            return Long.bitCount(((1 << i3) - 1) & j3);
        }
        if (i3 < 64) {
            return Long.bitCount(((1 << i3) - 1) & this.f725a);
        }
        return Long.bitCount(this.f725a) + cVar.b(i3 - 64);
    }

    public final void c() {
        if (this.f726b == null) {
            this.f726b = new c();
        }
    }

    public final boolean d(int i3) {
        if (i3 >= 64) {
            c();
            return this.f726b.d(i3 - 64);
        }
        if (((1 << i3) & this.f725a) != 0) {
            return true;
        }
        return false;
    }

    public final void e(int i3, boolean z2) {
        boolean z3;
        if (i3 >= 64) {
            c();
            this.f726b.e(i3 - 64, z2);
            return;
        }
        long j3 = this.f725a;
        if ((Long.MIN_VALUE & j3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j4 = (1 << i3) - 1;
        this.f725a = ((j3 & (~j4)) << 1) | (j3 & j4);
        if (z2) {
            h(i3);
        } else {
            a(i3);
        }
        if (!z3 && this.f726b == null) {
            return;
        }
        c();
        this.f726b.e(0, z3);
    }

    public final boolean f(int i3) {
        boolean z2;
        if (i3 >= 64) {
            c();
            return this.f726b.f(i3 - 64);
        }
        long j3 = 1 << i3;
        long j4 = this.f725a;
        if ((j4 & j3) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j5 = j4 & (~j3);
        this.f725a = j5;
        long j6 = j3 - 1;
        this.f725a = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
        c cVar = this.f726b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f726b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f725a = 0L;
        c cVar = this.f726b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i3) {
        if (i3 >= 64) {
            c();
            this.f726b.h(i3 - 64);
        } else {
            this.f725a |= 1 << i3;
        }
    }

    public final String toString() {
        if (this.f726b == null) {
            return Long.toBinaryString(this.f725a);
        }
        return this.f726b.toString() + "xx" + Long.toBinaryString(this.f725a);
    }
}
