package q;

import androidx.emoji2.text.p;
import androidx.emoji2.text.s;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f2719q = false;
    public final d d;

    /* renamed from: m, reason: collision with root package name */
    public final s f2730m;

    /* renamed from: p, reason: collision with root package name */
    public b f2733p;

    /* renamed from: a, reason: collision with root package name */
    public int f2720a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2721b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f2722c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2723e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f2724f = 32;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f2726i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f2727j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f2728k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f2729l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f2731n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f2732o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f2725g = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [q.b, q.d, java.lang.Object] */
    public c() {
        s();
        s sVar = new s();
        sVar.f309b = new i0.b();
        sVar.f310c = new i0.b();
        sVar.d = new f[32];
        this.f2730m = sVar;
        ?? bVar = new b(sVar);
        bVar.f2734f = new f[128];
        bVar.f2735g = new f[128];
        bVar.h = 0;
        bVar.f2736i = new p(15, (Object) bVar);
        this.d = bVar;
        this.f2733p = new b(sVar);
    }

    public static int n(Object obj) {
        f fVar = ((s.c) obj).f2860i;
        if (fVar != null) {
            return (int) (fVar.f2740j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i3) {
        i0.b bVar = (i0.b) this.f2730m.f310c;
        int i4 = bVar.f1968b;
        f fVar = null;
        if (i4 > 0) {
            int i5 = i4 - 1;
            ?? r3 = bVar.f1967a;
            ?? r4 = r3[i5];
            r3[i5] = 0;
            bVar.f1968b = i5;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i3);
            fVar2.f2747q = i3;
        } else {
            fVar2.c();
            fVar2.f2747q = i3;
        }
        int i6 = this.f2732o;
        int i7 = this.f2720a;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            this.f2720a = i8;
            this.f2731n = (f[]) Arrays.copyOf(this.f2731n, i8);
        }
        f[] fVarArr = this.f2731n;
        int i9 = this.f2732o;
        this.f2732o = i9 + 1;
        fVarArr[i9] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i3, float f3, f fVar3, f fVar4, int i4, int i5) {
        b l3 = l();
        if (fVar2 == fVar3) {
            l3.d.g(fVar, 1.0f);
            l3.d.g(fVar4, 1.0f);
            l3.d.g(fVar2, -2.0f);
        } else {
            a aVar = l3.d;
            if (f3 == 0.5f) {
                aVar.g(fVar, 1.0f);
                l3.d.g(fVar2, -1.0f);
                l3.d.g(fVar3, -1.0f);
                l3.d.g(fVar4, 1.0f);
                if (i3 > 0 || i4 > 0) {
                    l3.f2716b = (-i3) + i4;
                }
            } else if (f3 <= 0.0f) {
                aVar.g(fVar, -1.0f);
                l3.d.g(fVar2, 1.0f);
                l3.f2716b = i3;
            } else if (f3 >= 1.0f) {
                aVar.g(fVar4, -1.0f);
                l3.d.g(fVar3, 1.0f);
                l3.f2716b = -i4;
            } else {
                float f4 = 1.0f - f3;
                aVar.g(fVar, f4 * 1.0f);
                l3.d.g(fVar2, f4 * (-1.0f));
                l3.d.g(fVar3, (-1.0f) * f3);
                l3.d.g(fVar4, 1.0f * f3);
                if (i3 > 0 || i4 > 0) {
                    l3.f2716b = (i4 * f3) + ((-i3) * f4);
                }
            }
        }
        if (i5 != 8) {
            l3.a(this, i5);
        }
        c(l3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f2746p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f2746p <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f2746p <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f2746p <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(q.b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.c(q.b):void");
    }

    public final void d(f fVar, int i3) {
        int i4 = fVar.h;
        if (i4 == -1) {
            fVar.d(this, i3);
            for (int i5 = 0; i5 < this.f2722c + 1; i5++) {
                f fVar2 = ((f[]) this.f2730m.d)[i5];
            }
            return;
        }
        if (i4 != -1) {
            b bVar = this.f2725g[i4];
            if (bVar.f2718e) {
                bVar.f2716b = i3;
                return;
            }
            if (bVar.d.d() == 0) {
                bVar.f2718e = true;
                bVar.f2716b = i3;
                return;
            }
            b l3 = l();
            if (i3 < 0) {
                l3.f2716b = i3 * (-1);
                l3.d.g(fVar, 1.0f);
            } else {
                l3.f2716b = i3;
                l3.d.g(fVar, -1.0f);
            }
            c(l3);
            return;
        }
        b l4 = l();
        l4.f2715a = fVar;
        float f3 = i3;
        fVar.f2740j = f3;
        l4.f2716b = f3;
        l4.f2718e = true;
        c(l4);
    }

    public final void e(f fVar, f fVar2, int i3, int i4) {
        if (i4 == 8 && fVar2.f2741k && fVar.h == -1) {
            fVar.d(this, fVar2.f2740j + i3);
            return;
        }
        b l3 = l();
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            l3.f2716b = i3;
        }
        a aVar = l3.d;
        if (!z2) {
            aVar.g(fVar, -1.0f);
            l3.d.g(fVar2, 1.0f);
        } else {
            aVar.g(fVar, 1.0f);
            l3.d.g(fVar2, -1.0f);
        }
        if (i4 != 8) {
            l3.a(this, i4);
        }
        c(l3);
    }

    public final void f(f fVar, f fVar2, int i3, int i4) {
        b l3 = l();
        f m3 = m();
        m3.f2739i = 0;
        l3.b(fVar, fVar2, m3, i3);
        if (i4 != 8) {
            l3.d.g(j(i4), (int) (l3.d.c(m3) * (-1.0f)));
        }
        c(l3);
    }

    public final void g(f fVar, f fVar2, int i3, int i4) {
        b l3 = l();
        f m3 = m();
        m3.f2739i = 0;
        l3.c(fVar, fVar2, m3, i3);
        if (i4 != 8) {
            l3.d.g(j(i4), (int) (l3.d.c(m3) * (-1.0f)));
        }
        c(l3);
    }

    public final void h(b bVar) {
        int i3;
        if (bVar.f2718e) {
            bVar.f2715a.d(this, bVar.f2716b);
        } else {
            b[] bVarArr = this.f2725g;
            int i4 = this.f2728k;
            bVarArr[i4] = bVar;
            f fVar = bVar.f2715a;
            fVar.h = i4;
            this.f2728k = i4 + 1;
            fVar.e(this, bVar);
        }
        if (this.f2721b) {
            int i5 = 0;
            while (i5 < this.f2728k) {
                if (this.f2725g[i5] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f2725g[i5];
                if (bVar2 != null && bVar2.f2718e) {
                    bVar2.f2715a.d(this, bVar2.f2716b);
                    ((i0.b) this.f2730m.f309b).b(bVar2);
                    this.f2725g[i5] = null;
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (true) {
                        i3 = this.f2728k;
                        if (i6 >= i3) {
                            break;
                        }
                        b[] bVarArr2 = this.f2725g;
                        int i8 = i6 - 1;
                        b bVar3 = bVarArr2[i6];
                        bVarArr2[i8] = bVar3;
                        f fVar2 = bVar3.f2715a;
                        if (fVar2.h == i6) {
                            fVar2.h = i8;
                        }
                        i7 = i6;
                        i6++;
                    }
                    if (i7 < i3) {
                        this.f2725g[i7] = null;
                    }
                    this.f2728k = i3 - 1;
                    i5--;
                }
                i5++;
            }
            this.f2721b = false;
        }
    }

    public final void i() {
        for (int i3 = 0; i3 < this.f2728k; i3++) {
            b bVar = this.f2725g[i3];
            bVar.f2715a.f2740j = bVar.f2716b;
        }
    }

    public final f j(int i3) {
        if (this.f2727j + 1 >= this.f2724f) {
            o();
        }
        f a3 = a(4);
        float[] fArr = a3.f2743m;
        int i4 = this.f2722c + 1;
        this.f2722c = i4;
        this.f2727j++;
        a3.f2738g = i4;
        a3.f2739i = i3;
        ((f[]) this.f2730m.d)[i4] = a3;
        d dVar = this.d;
        dVar.f2736i.f301g = a3;
        Arrays.fill(fArr, 0.0f);
        fArr[a3.f2739i] = 1.0f;
        dVar.j(a3);
        return a3;
    }

    public final f k(Object obj) {
        if (obj != null) {
            if (this.f2727j + 1 >= this.f2724f) {
                o();
            }
            if (obj instanceof s.c) {
                s.c cVar = (s.c) obj;
                f fVar = cVar.f2860i;
                if (fVar == null) {
                    cVar.k();
                    fVar = cVar.f2860i;
                }
                int i3 = fVar.f2738g;
                s sVar = this.f2730m;
                if (i3 != -1 && i3 <= this.f2722c && ((f[]) sVar.d)[i3] != null) {
                    return fVar;
                }
                if (i3 != -1) {
                    fVar.c();
                }
                int i4 = this.f2722c + 1;
                this.f2722c = i4;
                this.f2727j++;
                fVar.f2738g = i4;
                fVar.f2747q = 1;
                ((f[]) sVar.d)[i4] = fVar;
                return fVar;
            }
            return null;
        }
        return null;
    }

    public final b l() {
        Object obj;
        s sVar = this.f2730m;
        i0.b bVar = (i0.b) sVar.f309b;
        int i3 = bVar.f1968b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = bVar.f1967a;
            obj = objArr[i4];
            objArr[i4] = null;
            bVar.f1968b = i4;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(sVar);
        }
        bVar2.f2715a = null;
        bVar2.d.b();
        bVar2.f2716b = 0.0f;
        bVar2.f2718e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f2727j + 1 >= this.f2724f) {
            o();
        }
        f a3 = a(3);
        int i3 = this.f2722c + 1;
        this.f2722c = i3;
        this.f2727j++;
        a3.f2738g = i3;
        ((f[]) this.f2730m.d)[i3] = a3;
        return a3;
    }

    public final void o() {
        int i3 = this.f2723e * 2;
        this.f2723e = i3;
        this.f2725g = (b[]) Arrays.copyOf(this.f2725g, i3);
        s sVar = this.f2730m;
        sVar.d = (f[]) Arrays.copyOf((f[]) sVar.d, this.f2723e);
        int i4 = this.f2723e;
        this.f2726i = new boolean[i4];
        this.f2724f = i4;
        this.f2729l = i4;
    }

    public final void p() {
        d dVar = this.d;
        if (dVar.e()) {
            i();
            return;
        }
        if (this.h) {
            for (int i3 = 0; i3 < this.f2728k; i3++) {
                if (!this.f2725g[i3].f2718e) {
                    q(dVar);
                    return;
                }
            }
            i();
            return;
        }
        q(dVar);
    }

    public final void q(d dVar) {
        int i3 = 0;
        while (true) {
            if (i3 >= this.f2728k) {
                break;
            }
            b bVar = this.f2725g[i3];
            int i4 = 1;
            if (bVar.f2715a.f2747q != 1) {
                float f3 = 0.0f;
                if (bVar.f2716b < 0.0f) {
                    boolean z2 = false;
                    int i5 = 0;
                    while (!z2) {
                        i5 += i4;
                        float f4 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < this.f2728k) {
                            b bVar2 = this.f2725g[i8];
                            if (bVar2.f2715a.f2747q != i4 && !bVar2.f2718e && bVar2.f2716b < f3) {
                                int d = bVar2.d.d();
                                int i10 = 0;
                                while (i10 < d) {
                                    f e3 = bVar2.d.e(i10);
                                    float c3 = bVar2.d.c(e3);
                                    if (c3 > f3) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = e3.f2742l[i11] / c3;
                                            if ((f5 < f4 && i11 == i9) || i11 > i9) {
                                                i9 = i11;
                                                i7 = e3.f2738g;
                                                i6 = i8;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i10++;
                                    f3 = 0.0f;
                                }
                            }
                            i8++;
                            f3 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            b bVar3 = this.f2725g[i6];
                            bVar3.f2715a.h = -1;
                            bVar3.g(((f[]) this.f2730m.d)[i7]);
                            f fVar = bVar3.f2715a;
                            fVar.h = i6;
                            fVar.e(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i5 > this.f2727j / 2) {
                            z2 = true;
                        }
                        f3 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i3++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2727j; i4++) {
            this.f2726i[i4] = false;
        }
        boolean z3 = false;
        int i5 = 0;
        while (!z3) {
            int i6 = 1;
            i5++;
            if (i5 < this.f2727j * 2) {
                f fVar = bVar.f2715a;
                if (fVar != null) {
                    this.f2726i[fVar.f2738g] = true;
                }
                f d = bVar.d(this.f2726i);
                if (d != null) {
                    boolean[] zArr = this.f2726i;
                    int i7 = d.f2738g;
                    if (!zArr[i7]) {
                        zArr[i7] = true;
                    } else {
                        return;
                    }
                }
                if (d != null) {
                    float f3 = Float.MAX_VALUE;
                    int i8 = i3;
                    int i9 = -1;
                    while (i8 < this.f2728k) {
                        b bVar2 = this.f2725g[i8];
                        if (bVar2.f2715a.f2747q != i6 && !bVar2.f2718e) {
                            a aVar = bVar2.d;
                            int i10 = aVar.h;
                            if (i10 != -1) {
                                for (int i11 = 0; i10 != -1 && i11 < aVar.f2707a; i11++) {
                                    if (aVar.f2710e[i10] == d.f2738g) {
                                        z2 = true;
                                        break;
                                    }
                                    i10 = aVar.f2711f[i10];
                                }
                            }
                            z2 = false;
                            if (z2) {
                                float c3 = bVar2.d.c(d);
                                if (c3 < 0.0f) {
                                    float f4 = (-bVar2.f2716b) / c3;
                                    if (f4 < f3) {
                                        f3 = f4;
                                        i9 = i8;
                                    }
                                }
                            }
                        }
                        i8++;
                        i6 = 1;
                    }
                    if (i9 > -1) {
                        b bVar3 = this.f2725g[i9];
                        bVar3.f2715a.h = -1;
                        bVar3.g(d);
                        f fVar2 = bVar3.f2715a;
                        fVar2.h = i9;
                        fVar2.e(this, bVar3);
                    }
                } else {
                    z3 = true;
                }
                i3 = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i3 = 0; i3 < this.f2728k; i3++) {
            b bVar = this.f2725g[i3];
            if (bVar != null) {
                ((i0.b) this.f2730m.f309b).b(bVar);
            }
            this.f2725g[i3] = null;
        }
    }

    public final void t() {
        s sVar;
        int i3 = 0;
        while (true) {
            sVar = this.f2730m;
            f[] fVarArr = (f[]) sVar.d;
            if (i3 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i3];
            if (fVar != null) {
                fVar.c();
            }
            i3++;
        }
        i0.b bVar = (i0.b) sVar.f310c;
        f[] fVarArr2 = this.f2731n;
        int i4 = this.f2732o;
        bVar.getClass();
        if (i4 > fVarArr2.length) {
            i4 = fVarArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            f fVar2 = fVarArr2[i5];
            int i6 = bVar.f1968b;
            Object[] objArr = bVar.f1967a;
            if (i6 < objArr.length) {
                objArr[i6] = fVar2;
                bVar.f1968b = i6 + 1;
            }
        }
        this.f2732o = 0;
        Arrays.fill((f[]) sVar.d, (Object) null);
        this.f2722c = 0;
        d dVar = this.d;
        dVar.h = 0;
        dVar.f2716b = 0.0f;
        this.f2727j = 1;
        for (int i7 = 0; i7 < this.f2728k; i7++) {
            b bVar2 = this.f2725g[i7];
        }
        s();
        this.f2728k = 0;
        this.f2733p = new b(sVar);
    }
}
