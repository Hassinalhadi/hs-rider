package q;

import androidx.emoji2.text.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class b {
    public final a d;

    /* renamed from: a, reason: collision with root package name */
    public f f2715a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f2716b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2717c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2718e = false;

    public b(s sVar) {
        this.d = new a(this, sVar);
    }

    public final void a(c cVar, int i3) {
        this.d.g(cVar.j(i3), 1.0f);
        this.d.g(cVar.j(i3), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f2716b = i3;
        }
        a aVar = this.d;
        if (!z2) {
            aVar.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, 1.0f);
        } else {
            aVar.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, -1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f2716b = i3;
        }
        a aVar = this.d;
        if (!z2) {
            aVar.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, -1.0f);
        } else {
            aVar.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, 1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f2715a == null && this.f2716b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i3;
        int d = this.d.d();
        f fVar2 = null;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < d; i4++) {
            float f4 = this.d.f(i4);
            if (f4 < 0.0f) {
                f e3 = this.d.e(i4);
                if ((zArr == null || !zArr[e3.f2738g]) && e3 != fVar && (((i3 = e3.f2747q) == 3 || i3 == 4) && f4 < f3)) {
                    f3 = f4;
                    fVar2 = e3;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f2715a;
        if (fVar2 != null) {
            this.d.g(fVar2, -1.0f);
            this.f2715a.h = -1;
            this.f2715a = null;
        }
        float h = this.d.h(fVar, true) * (-1.0f);
        this.f2715a = fVar;
        if (h == 1.0f) {
            return;
        }
        this.f2716b /= h;
        a aVar = this.d;
        int i3 = aVar.h;
        for (int i4 = 0; i3 != -1 && i4 < aVar.f2707a; i4++) {
            float[] fArr = aVar.f2712g;
            fArr[i3] = fArr[i3] / h;
            i3 = aVar.f2711f[i3];
        }
    }

    public final void h(c cVar, f fVar, boolean z2) {
        if (fVar.f2741k) {
            float c3 = this.d.c(fVar);
            this.f2716b = (fVar.f2740j * c3) + this.f2716b;
            this.d.h(fVar, z2);
            if (z2) {
                fVar.b(this);
            }
            if (this.d.d() == 0) {
                this.f2718e = true;
                cVar.f2721b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z2) {
        a aVar = this.d;
        aVar.getClass();
        float c3 = aVar.c(bVar.f2715a);
        aVar.h(bVar.f2715a, z2);
        a aVar2 = bVar.d;
        int d = aVar2.d();
        for (int i3 = 0; i3 < d; i3++) {
            f e3 = aVar2.e(i3);
            aVar.a(e3, aVar2.c(e3) * c3, z2);
        }
        this.f2716b = (bVar.f2716b * c3) + this.f2716b;
        if (z2) {
            bVar.f2715a.b(this);
        }
        if (this.f2715a != null && this.d.d() == 0) {
            this.f2718e = true;
            cVar.f2721b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.f r0 = r10.f2715a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.f r1 = r10.f2715a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.f2716b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f2716b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            q.a r5 = r10.d
            int r5 = r5.d()
        L40:
            if (r3 >= r5) goto Lcf
            q.a r6 = r10.d
            q.f r6 = r6.e(r3)
            if (r6 != 0) goto L4c
            goto Lcb
        L4c:
            q.a r7 = r10.d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L58
            goto Lcb
        L58:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L77
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L9d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L75:
            float r7 = r7 * r9
            goto L9d
        L77:
            if (r8 <= 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L9d
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L75
        L9d:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Lca
        Lb3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Lca:
            r1 = r4
        Lcb:
            int r3 = r3 + 1
            goto L40
        Lcf:
            if (r1 != 0) goto Le3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "0.0"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.toString():java.lang.String");
    }
}
