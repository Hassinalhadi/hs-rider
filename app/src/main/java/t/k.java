package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2990k = new int[2];

    public static void m(int[] iArr, int i3, int i4, int i5, int i6, float f3, int i7) {
        int i8 = i4 - i3;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 == 1) {
                    iArr[0] = i8;
                    iArr[1] = (int) ((i8 * f3) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i9 * f3) + 0.5f);
            iArr[1] = i9;
            return;
        }
        int i10 = (int) ((i9 * f3) + 0.5f);
        int i11 = (int) ((i8 / f3) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(t.d r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.a(t.d):void");
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        int i3;
        s.d dVar3;
        s.d dVar4;
        int i4;
        s.d dVar5 = this.f3001b;
        boolean z2 = dVar5.f2861a;
        g gVar = this.f3003e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f2985j;
        ArrayList arrayList = gVar.f2986k;
        ArrayList arrayList2 = gVar.f2987l;
        f fVar = this.f3006i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3001b;
            int i5 = dVar6.f2888p0[0];
            this.d = i5;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = dVar6.T) != null && ((i4 = dVar4.f2888p0[0]) == 1 || i4 == 4)) {
                    int q3 = (dVar4.q() - this.f3001b.I.e()) - this.f3001b.K.e();
                    o.b(fVar2, dVar4.d.h, this.f3001b.I.e());
                    o.b(fVar, dVar4.d.f3006i, -this.f3001b.K.e());
                    gVar.d(q3);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3001b).T) != null && ((i3 = dVar2.f2888p0[0]) == 1 || i3 == 4)) {
            o.b(fVar2, dVar2.d.h, dVar.I.e());
            o.b(fVar, dVar2.d.f3006i, -this.f3001b.K.e());
            return;
        }
        if (gVar.f2985j) {
            s.d dVar7 = this.f3001b;
            if (dVar7.f2861a) {
                s.c[] cVarArr = dVar7.Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f2858f;
                if (cVar2 != null && cVarArr[1].f2858f != null) {
                    boolean x3 = dVar7.x();
                    s.d dVar8 = this.f3001b;
                    if (x3) {
                        fVar2.f2982f = dVar8.Q[0].e();
                        fVar.f2982f = -this.f3001b.Q[1].e();
                        return;
                    }
                    f h = o.h(dVar8.Q[0]);
                    if (h != null) {
                        o.b(fVar2, h, this.f3001b.Q[0].e());
                    }
                    f h3 = o.h(this.f3001b.Q[1]);
                    if (h3 != null) {
                        o.b(fVar, h3, -this.f3001b.Q[1].e());
                    }
                    fVar2.f2979b = true;
                    fVar.f2979b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(fVar2, h4, this.f3001b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f2983g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f2858f != null) {
                    f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(fVar, h5, -this.f3001b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f2983g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof s.i) && dVar7.T != null && dVar7.i(7).f2858f == null) {
                    s.d dVar9 = this.f3001b;
                    o.b(fVar2, dVar9.T.d.h, dVar9.r());
                    o.b(fVar, fVar2, gVar.f2983g);
                    return;
                }
                return;
            }
        }
        if (this.d == 3) {
            s.d dVar10 = this.f3001b;
            int i6 = dVar10.f2890r;
            if (i6 != 2) {
                if (i6 == 3) {
                    if (dVar10.f2891s == 3) {
                        fVar2.f2978a = this;
                        fVar.f2978a = this;
                        m mVar = dVar10.f2867e;
                        mVar.h.f2978a = this;
                        mVar.f3006i.f2978a = this;
                        gVar.f2978a = this;
                        if (dVar10.y()) {
                            arrayList2.add(this.f3001b.f2867e.f3003e);
                            this.f3001b.f2867e.f3003e.f2986k.add(gVar);
                            m mVar2 = this.f3001b.f2867e;
                            mVar2.f3003e.f2978a = this;
                            arrayList2.add(mVar2.h);
                            arrayList2.add(this.f3001b.f2867e.f3006i);
                            this.f3001b.f2867e.h.f2986k.add(gVar);
                            this.f3001b.f2867e.f3006i.f2986k.add(gVar);
                        } else {
                            boolean x4 = this.f3001b.x();
                            s.d dVar11 = this.f3001b;
                            if (x4) {
                                dVar11.f2867e.f3003e.f2987l.add(gVar);
                                arrayList.add(this.f3001b.f2867e.f3003e);
                            } else {
                                dVar11.f2867e.f3003e.f2987l.add(gVar);
                            }
                        }
                    } else {
                        g gVar2 = dVar10.f2867e.f3003e;
                        arrayList2.add(gVar2);
                        gVar2.f2986k.add(gVar);
                        this.f3001b.f2867e.h.f2986k.add(gVar);
                        this.f3001b.f2867e.f3006i.f2986k.add(gVar);
                        gVar.f2979b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.f2987l.add(gVar);
                        fVar.f2987l.add(gVar);
                    }
                }
            } else {
                s.d dVar12 = dVar10.T;
                if (dVar12 != null) {
                    g gVar3 = dVar12.f2867e.f3003e;
                    arrayList2.add(gVar3);
                    gVar3.f2986k.add(gVar);
                    gVar.f2979b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        s.d dVar13 = this.f3001b;
        s.c[] cVarArr2 = dVar13.Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f2858f;
        if (cVar5 != null && cVarArr2[1].f2858f != null) {
            boolean x5 = dVar13.x();
            s.d dVar14 = this.f3001b;
            if (x5) {
                fVar2.f2982f = dVar14.Q[0].e();
                fVar.f2982f = -this.f3001b.Q[1].e();
                return;
            }
            f h6 = o.h(dVar14.Q[0]);
            f h7 = o.h(this.f3001b.Q[1]);
            if (h6 != null) {
                h6.b(this);
            }
            if (h7 != null) {
                h7.b(this);
            }
            this.f3007j = 4;
            return;
        }
        if (cVar5 != null) {
            f h8 = o.h(cVar4);
            if (h8 != null) {
                o.b(fVar2, h8, this.f3001b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f2858f != null) {
            f h9 = o.h(cVar6);
            if (h9 != null) {
                o.b(fVar, h9, -this.f3001b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if (!(dVar13 instanceof s.i) && (dVar3 = dVar13.T) != null) {
            o.b(fVar2, dVar3.d.h, dVar13.r());
            c(fVar, fVar2, 1, gVar);
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f2985j) {
            this.f3001b.Y = fVar.f2983g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3002c = null;
        this.h.c();
        this.f3006i.c();
        this.f3003e.c();
        this.f3005g = false;
    }

    @Override // t.o
    public final boolean k() {
        if (this.d == 3 && this.f3001b.f2890r != 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        this.f3005g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f2985j = false;
        f fVar2 = this.f3006i;
        fVar2.c();
        fVar2.f2985j = false;
        this.f3003e.f2985j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3001b.f2872h0;
    }
}
