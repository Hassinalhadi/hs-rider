package q;

import androidx.emoji2.text.s;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f2708b;

    /* renamed from: c, reason: collision with root package name */
    public final s f2709c;

    /* renamed from: a, reason: collision with root package name */
    public int f2707a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2710e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f2711f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f2712g = new float[8];
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2713i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2714j = false;

    public a(b bVar, s sVar) {
        this.f2708b = bVar;
        this.f2709c = sVar;
    }

    public final void a(f fVar, float f3, boolean z2) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i3 = this.h;
            b bVar = this.f2708b;
            if (i3 == -1) {
                this.h = 0;
                this.f2712g[0] = f3;
                this.f2710e[0] = fVar.f2738g;
                this.f2711f[0] = -1;
                fVar.f2746p++;
                fVar.a(bVar);
                this.f2707a++;
                if (!this.f2714j) {
                    int i4 = this.f2713i + 1;
                    this.f2713i = i4;
                    int[] iArr = this.f2710e;
                    if (i4 >= iArr.length) {
                        this.f2714j = true;
                        this.f2713i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i3 != -1 && i6 < this.f2707a; i6++) {
                int i7 = this.f2710e[i3];
                int i8 = fVar.f2738g;
                if (i7 == i8) {
                    float[] fArr = this.f2712g;
                    float f4 = fArr[i3] + f3;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i3] = f4;
                    if (f4 == 0.0f) {
                        int i9 = this.h;
                        int[] iArr2 = this.f2711f;
                        if (i3 == i9) {
                            this.h = iArr2[i3];
                        } else {
                            iArr2[i5] = iArr2[i3];
                        }
                        if (z2) {
                            fVar.b(bVar);
                        }
                        if (this.f2714j) {
                            this.f2713i = i3;
                        }
                        fVar.f2746p--;
                        this.f2707a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i3;
                }
                i3 = this.f2711f[i3];
            }
            int i10 = this.f2713i;
            int i11 = i10 + 1;
            if (this.f2714j) {
                int[] iArr3 = this.f2710e;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f2710e;
            if (i10 >= iArr4.length && this.f2707a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f2710e;
                    if (i12 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                }
            }
            int[] iArr6 = this.f2710e;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.d * 2;
                this.d = i13;
                this.f2714j = false;
                this.f2713i = i10 - 1;
                this.f2712g = Arrays.copyOf(this.f2712g, i13);
                this.f2710e = Arrays.copyOf(this.f2710e, this.d);
                this.f2711f = Arrays.copyOf(this.f2711f, this.d);
            }
            this.f2710e[i10] = fVar.f2738g;
            this.f2712g[i10] = f3;
            int[] iArr7 = this.f2711f;
            if (i5 != -1) {
                iArr7[i10] = iArr7[i5];
                iArr7[i5] = i10;
            } else {
                iArr7[i10] = this.h;
                this.h = i10;
            }
            fVar.f2746p++;
            fVar.a(bVar);
            this.f2707a++;
            if (!this.f2714j) {
                this.f2713i++;
            }
            int i14 = this.f2713i;
            int[] iArr8 = this.f2710e;
            if (i14 >= iArr8.length) {
                this.f2714j = true;
                this.f2713i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f2707a; i4++) {
            f fVar = ((f[]) this.f2709c.d)[this.f2710e[i3]];
            if (fVar != null) {
                fVar.b(this.f2708b);
            }
            i3 = this.f2711f[i3];
        }
        this.h = -1;
        this.f2713i = -1;
        this.f2714j = false;
        this.f2707a = 0;
    }

    public final float c(f fVar) {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f2707a; i4++) {
            if (this.f2710e[i3] == fVar.f2738g) {
                return this.f2712g[i3];
            }
            i3 = this.f2711f[i3];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f2707a;
    }

    public final f e(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f2707a; i5++) {
            if (i5 == i3) {
                return ((f[]) this.f2709c.d)[this.f2710e[i4]];
            }
            i4 = this.f2711f[i4];
        }
        return null;
    }

    public final float f(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f2707a; i5++) {
            if (i5 == i3) {
                return this.f2712g[i4];
            }
            i4 = this.f2711f[i4];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f3) {
        if (f3 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i3 = this.h;
        b bVar = this.f2708b;
        if (i3 == -1) {
            this.h = 0;
            this.f2712g[0] = f3;
            this.f2710e[0] = fVar.f2738g;
            this.f2711f[0] = -1;
            fVar.f2746p++;
            fVar.a(bVar);
            this.f2707a++;
            if (!this.f2714j) {
                int i4 = this.f2713i + 1;
                this.f2713i = i4;
                int[] iArr = this.f2710e;
                if (i4 >= iArr.length) {
                    this.f2714j = true;
                    this.f2713i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i3 != -1 && i6 < this.f2707a; i6++) {
            int i7 = this.f2710e[i3];
            int i8 = fVar.f2738g;
            if (i7 == i8) {
                this.f2712g[i3] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i3;
            }
            i3 = this.f2711f[i3];
        }
        int i9 = this.f2713i;
        int i10 = i9 + 1;
        if (this.f2714j) {
            int[] iArr2 = this.f2710e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f2710e;
        if (i9 >= iArr3.length && this.f2707a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f2710e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f2710e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.d * 2;
            this.d = i12;
            this.f2714j = false;
            this.f2713i = i9 - 1;
            this.f2712g = Arrays.copyOf(this.f2712g, i12);
            this.f2710e = Arrays.copyOf(this.f2710e, this.d);
            this.f2711f = Arrays.copyOf(this.f2711f, this.d);
        }
        this.f2710e[i9] = fVar.f2738g;
        this.f2712g[i9] = f3;
        int[] iArr6 = this.f2711f;
        if (i5 != -1) {
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            iArr6[i9] = this.h;
            this.h = i9;
        }
        fVar.f2746p++;
        fVar.a(bVar);
        int i13 = this.f2707a + 1;
        this.f2707a = i13;
        if (!this.f2714j) {
            this.f2713i++;
        }
        int[] iArr7 = this.f2710e;
        if (i13 >= iArr7.length) {
            this.f2714j = true;
        }
        if (this.f2713i >= iArr7.length) {
            this.f2714j = true;
            this.f2713i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z2) {
        int i3 = this.h;
        if (i3 != -1) {
            int i4 = 0;
            int i5 = -1;
            while (i3 != -1 && i4 < this.f2707a) {
                if (this.f2710e[i3] == fVar.f2738g) {
                    int i6 = this.h;
                    int[] iArr = this.f2711f;
                    if (i3 == i6) {
                        this.h = iArr[i3];
                    } else {
                        iArr[i5] = iArr[i3];
                    }
                    if (z2) {
                        fVar.b(this.f2708b);
                    }
                    fVar.f2746p--;
                    this.f2707a--;
                    this.f2710e[i3] = -1;
                    if (this.f2714j) {
                        this.f2713i = i3;
                    }
                    return this.f2712g[i3];
                }
                i4++;
                i5 = i3;
                i3 = this.f2711f[i3];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final String toString() {
        int i3 = this.h;
        String str = "";
        for (int i4 = 0; i3 != -1 && i4 < this.f2707a; i4++) {
            str = (str.concat(" -> ") + this.f2712g[i3] + " : ") + ((f[]) this.f2709c.d)[this.f2710e[i3]];
            i3 = this.f2711f[i3];
        }
        return str;
    }
}
