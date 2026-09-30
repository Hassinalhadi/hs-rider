package q;

import androidx.emoji2.text.p;
import b1.o;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f2734f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f2735g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public p f2736i;

    @Override // q.b
    public final f d(boolean[] zArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < this.h; i4++) {
            f[] fVarArr = this.f2734f;
            f fVar = fVarArr[i4];
            if (!zArr[fVar.f2738g]) {
                p pVar = this.f2736i;
                pVar.f301g = fVar;
                int i5 = 8;
                if (i3 == -1) {
                    while (i5 >= 0) {
                        float f3 = ((f) pVar.f301g).f2743m[i5];
                        if (f3 <= 0.0f) {
                            if (f3 < 0.0f) {
                                i3 = i4;
                                break;
                            }
                            i5--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i3];
                    while (true) {
                        if (i5 >= 0) {
                            float f4 = fVar2.f2743m[i5];
                            float f5 = ((f) pVar.f301g).f2743m[i5];
                            if (f5 == f4) {
                                i5--;
                            } else if (f5 >= f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        return this.f2734f[i3];
    }

    @Override // q.b
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // q.b
    public final void i(c cVar, b bVar, boolean z2) {
        f fVar = bVar.f2715a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f2743m;
        a aVar = bVar.d;
        int d = aVar.d();
        for (int i3 = 0; i3 < d; i3++) {
            f e3 = aVar.e(i3);
            float f3 = aVar.f(i3);
            p pVar = this.f2736i;
            pVar.f301g = e3;
            if (e3.f2737f) {
                boolean z3 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((f) pVar.f301g).f2743m;
                    float f4 = (fArr[i4] * f3) + fArr2[i4];
                    fArr2[i4] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        ((f) pVar.f301g).f2743m[i4] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((d) pVar.h).k((f) pVar.f301g);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f5 = fArr[i5];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f3;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        ((f) pVar.f301g).f2743m[i5] = f6;
                    } else {
                        ((f) pVar.f301g).f2743m[i5] = 0.0f;
                    }
                }
                j(e3);
            }
            this.f2716b = (bVar.f2716b * f3) + this.f2716b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i3;
        f[] fVarArr;
        int i4 = this.h + 1;
        f[] fVarArr2 = this.f2734f;
        if (i4 > fVarArr2.length) {
            f[] fVarArr3 = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
            this.f2734f = fVarArr3;
            this.f2735g = (f[]) Arrays.copyOf(fVarArr3, fVarArr3.length * 2);
        }
        f[] fVarArr4 = this.f2734f;
        int i5 = this.h;
        fVarArr4[i5] = fVar;
        int i6 = i5 + 1;
        this.h = i6;
        if (i6 > 1 && fVarArr4[i5].f2738g > fVar.f2738g) {
            int i7 = 0;
            while (true) {
                i3 = this.h;
                fVarArr = this.f2735g;
                if (i7 >= i3) {
                    break;
                }
                fVarArr[i7] = this.f2734f[i7];
                i7++;
            }
            Arrays.sort(fVarArr, 0, i3, new o(1));
            for (int i8 = 0; i8 < this.h; i8++) {
                this.f2734f[i8] = this.f2735g[i8];
            }
        }
        fVar.f2737f = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i3 = 0;
        while (i3 < this.h) {
            if (this.f2734f[i3] == fVar) {
                while (true) {
                    int i4 = this.h;
                    if (i3 < i4 - 1) {
                        f[] fVarArr = this.f2734f;
                        int i5 = i3 + 1;
                        fVarArr[i3] = fVarArr[i5];
                        i3 = i5;
                    } else {
                        this.h = i4 - 1;
                        fVar.f2737f = false;
                        return;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    @Override // q.b
    public final String toString() {
        p pVar = this.f2736i;
        String str = " goal -> (" + this.f2716b + ") : ";
        for (int i3 = 0; i3 < this.h; i3++) {
            pVar.f301g = this.f2734f[i3];
            str = str + pVar + " ";
        }
        return str;
    }
}
