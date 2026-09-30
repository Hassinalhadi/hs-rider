package b1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f827a;

    /* renamed from: b, reason: collision with root package name */
    public int f828b;

    /* renamed from: c, reason: collision with root package name */
    public int f829c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f830e;

    public final boolean a() {
        int i3;
        int i4;
        int i5;
        int i6 = this.f827a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.d;
            int i9 = this.f828b;
            if (i8 > i9) {
                i5 = 1;
            } else if (i8 == i9) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            if ((i5 & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.d;
            int i11 = this.f829c;
            if (i10 > i11) {
                i4 = 1;
            } else if (i10 == i11) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.f830e;
            int i13 = this.f828b;
            if (i12 > i13) {
                i3 = 1;
            } else if (i12 == i13) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.f830e;
            int i15 = this.f829c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if (((i7 << 12) & i6) == 0) {
                return false;
            }
        }
        return true;
    }
}
