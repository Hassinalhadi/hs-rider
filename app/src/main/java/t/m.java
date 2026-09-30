package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f2993k;

    /* renamed from: l, reason: collision with root package name */
    public a f2994l;

    @Override // t.d
    public final void a(d dVar) {
        float f3;
        float f4;
        float f5;
        int i3;
        if (q.e.a(this.f3007j) != 3) {
            g gVar = this.f3003e;
            if (gVar.f2980c && !gVar.f2985j && this.d == 3) {
                s.d dVar2 = this.f3001b;
                int i4 = dVar2.f2891s;
                if (i4 != 2) {
                    if (i4 == 3) {
                        g gVar2 = dVar2.d.f3003e;
                        if (gVar2.f2985j) {
                            int i5 = dVar2.X;
                            if (i5 != -1) {
                                if (i5 != 0) {
                                    if (i5 != 1) {
                                        i3 = 0;
                                        gVar.d(i3);
                                    } else {
                                        f3 = gVar2.f2983g;
                                        f4 = dVar2.W;
                                    }
                                } else {
                                    f5 = gVar2.f2983g * dVar2.W;
                                    i3 = (int) (f5 + 0.5f);
                                    gVar.d(i3);
                                }
                            } else {
                                f3 = gVar2.f2983g;
                                f4 = dVar2.W;
                            }
                            f5 = f3 / f4;
                            i3 = (int) (f5 + 0.5f);
                            gVar.d(i3);
                        }
                    }
                } else {
                    s.d dVar3 = dVar2.T;
                    if (dVar3 != null) {
                        if (dVar3.f2867e.f3003e.f2985j) {
                            gVar.d((int) ((r5.f2983g * dVar2.f2898z) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.h;
            boolean z2 = fVar.f2980c;
            ArrayList arrayList = fVar.f2987l;
            if (z2) {
                f fVar2 = this.f3006i;
                boolean z3 = fVar2.f2980c;
                ArrayList arrayList2 = fVar2.f2987l;
                if (z3) {
                    if (!fVar.f2985j || !fVar2.f2985j || !gVar.f2985j) {
                        if (!gVar.f2985j && this.d == 3) {
                            s.d dVar4 = this.f3001b;
                            if (dVar4.f2890r == 0 && !dVar4.y()) {
                                f fVar3 = (f) arrayList.get(0);
                                f fVar4 = (f) arrayList2.get(0);
                                int i6 = fVar3.f2983g + fVar.f2982f;
                                int i7 = fVar4.f2983g + fVar2.f2982f;
                                fVar.d(i6);
                                fVar2.d(i7);
                                gVar.d(i7 - i6);
                                return;
                            }
                        }
                        if (!gVar.f2985j && this.d == 3 && this.f3000a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar5 = (f) arrayList.get(0);
                            int i8 = (((f) arrayList2.get(0)).f2983g + fVar2.f2982f) - (fVar5.f2983g + fVar.f2982f);
                            int i9 = gVar.f2988m;
                            if (i8 < i9) {
                                gVar.d(i8);
                            } else {
                                gVar.d(i9);
                            }
                        }
                        if (gVar.f2985j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar6 = (f) arrayList.get(0);
                            f fVar7 = (f) arrayList2.get(0);
                            int i10 = fVar6.f2983g;
                            int i11 = fVar.f2982f + i10;
                            int i12 = fVar7.f2983g;
                            int i13 = fVar2.f2982f + i12;
                            float f6 = this.f3001b.e0;
                            if (fVar6 == fVar7) {
                                f6 = 0.5f;
                            } else {
                                i10 = i11;
                                i12 = i13;
                            }
                            fVar.d((int) ((((i12 - i10) - gVar.f2983g) * f6) + i10 + 0.5f));
                            fVar2.d(fVar.f2983g + gVar.f2983g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        s.d dVar5 = this.f3001b;
        l(dVar5.J, dVar5.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v105, types: [t.a, t.g] */
    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        f fVar = this.f2993k;
        s.d dVar5 = this.f3001b;
        boolean z2 = dVar5.f2861a;
        g gVar = this.f3003e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f2985j;
        ArrayList arrayList = gVar.f2986k;
        ArrayList arrayList2 = gVar.f2987l;
        f fVar2 = this.f3006i;
        f fVar3 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3001b;
            this.d = dVar6.f2888p0[1];
            if (dVar6.E) {
                this.f2994l = new g(this);
            }
            int i3 = this.d;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = this.f3001b.T) != null && dVar4.f2888p0[1] == 1) {
                    int k3 = (dVar4.k() - this.f3001b.J.e()) - this.f3001b.L.e();
                    o.b(fVar3, dVar4.f2867e.h, this.f3001b.J.e());
                    o.b(fVar2, dVar4.f2867e.f3006i, -this.f3001b.L.e());
                    gVar.d(k3);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(this.f3001b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3001b).T) != null && dVar2.f2888p0[1] == 1) {
            o.b(fVar3, dVar2.f2867e.h, dVar.J.e());
            o.b(fVar2, dVar2.f2867e.f3006i, -this.f3001b.L.e());
            return;
        }
        boolean z4 = gVar.f2985j;
        if (z4) {
            s.d dVar7 = this.f3001b;
            if (dVar7.f2861a) {
                s.c[] cVarArr = dVar7.Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f2858f;
                if (cVar2 != null && cVarArr[3].f2858f != null) {
                    boolean y2 = dVar7.y();
                    s.d dVar8 = this.f3001b;
                    if (y2) {
                        fVar3.f2982f = dVar8.Q[2].e();
                        fVar2.f2982f = -this.f3001b.Q[3].e();
                    } else {
                        f h = o.h(dVar8.Q[2]);
                        if (h != null) {
                            o.b(fVar3, h, this.f3001b.Q[2].e());
                        }
                        f h3 = o.h(this.f3001b.Q[3]);
                        if (h3 != null) {
                            o.b(fVar2, h3, -this.f3001b.Q[3].e());
                        }
                        fVar3.f2979b = true;
                        fVar2.f2979b = true;
                    }
                    s.d dVar9 = this.f3001b;
                    if (dVar9.E) {
                        o.b(fVar, fVar3, dVar9.a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(fVar3, h4, this.f3001b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f2983g);
                        s.d dVar10 = this.f3001b;
                        if (dVar10.E) {
                            o.b(fVar, fVar3, dVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f2858f != null) {
                    f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(fVar2, h5, -this.f3001b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f2983g);
                    }
                    s.d dVar11 = this.f3001b;
                    if (dVar11.E) {
                        o.b(fVar, fVar3, dVar11.a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f2858f != null) {
                    f h6 = o.h(cVar4);
                    if (h6 != null) {
                        o.b(fVar, h6, 0);
                        o.b(fVar3, fVar, -this.f3001b.a0);
                        o.b(fVar2, fVar3, gVar.f2983g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof s.i) && dVar7.T != null && dVar7.i(7).f2858f == null) {
                    s.d dVar12 = this.f3001b;
                    o.b(fVar3, dVar12.T.f2867e.h, dVar12.s());
                    o.b(fVar2, fVar3, gVar.f2983g);
                    s.d dVar13 = this.f3001b;
                    if (dVar13.E) {
                        o.b(fVar, fVar3, dVar13.a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z4 && this.d == 3) {
            s.d dVar14 = this.f3001b;
            int i4 = dVar14.f2891s;
            if (i4 != 2) {
                if (i4 == 3 && !dVar14.y()) {
                    s.d dVar15 = this.f3001b;
                    if (dVar15.f2890r != 3) {
                        g gVar2 = dVar15.d.f3003e;
                        arrayList2.add(gVar2);
                        gVar2.f2986k.add(gVar);
                        gVar.f2979b = true;
                        arrayList.add(fVar3);
                        arrayList.add(fVar2);
                    }
                }
            } else {
                s.d dVar16 = dVar14.T;
                if (dVar16 != null) {
                    g gVar3 = dVar16.f2867e.f3003e;
                    arrayList2.add(gVar3);
                    gVar3.f2986k.add(gVar);
                    gVar.f2979b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        } else {
            gVar.b(this);
        }
        s.d dVar17 = this.f3001b;
        s.c[] cVarArr2 = dVar17.Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f2858f;
        if (cVar6 != null && cVarArr2[3].f2858f != null) {
            boolean y3 = dVar17.y();
            s.d dVar18 = this.f3001b;
            if (y3) {
                fVar3.f2982f = dVar18.Q[2].e();
                fVar2.f2982f = -this.f3001b.Q[3].e();
            } else {
                f h7 = o.h(dVar18.Q[2]);
                f h8 = o.h(this.f3001b.Q[3]);
                if (h7 != null) {
                    h7.b(this);
                }
                if (h8 != null) {
                    h8.b(this);
                }
                this.f3007j = 4;
            }
            if (this.f3001b.E) {
                c(fVar, fVar3, 1, this.f2994l);
            }
        } else if (cVar6 != null) {
            f h9 = o.h(cVar5);
            if (h9 != null) {
                o.b(fVar3, h9, this.f3001b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f3001b.E) {
                    c(fVar, fVar3, 1, this.f2994l);
                }
                if (this.d == 3) {
                    s.d dVar19 = this.f3001b;
                    if (dVar19.W > 0.0f) {
                        k kVar = dVar19.d;
                        if (kVar.d == 3) {
                            kVar.f3003e.f2986k.add(gVar);
                            arrayList2.add(this.f3001b.d.f3003e);
                            gVar.f2978a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f2858f != null) {
                f h10 = o.h(cVar7);
                if (h10 != null) {
                    o.b(fVar2, h10, -this.f3001b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f3001b.E) {
                        c(fVar, fVar3, 1, this.f2994l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f2858f != null) {
                    f h11 = o.h(cVar8);
                    if (h11 != null) {
                        o.b(fVar, h11, 0);
                        c(fVar3, fVar, -1, this.f2994l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar17 instanceof s.i) && (dVar3 = dVar17.T) != null) {
                    o.b(fVar3, dVar3.f2867e.h, dVar17.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f3001b.E) {
                        c(fVar, fVar3, 1, this.f2994l);
                    }
                    if (this.d == 3) {
                        s.d dVar20 = this.f3001b;
                        if (dVar20.W > 0.0f) {
                            k kVar2 = dVar20.d;
                            if (kVar2.d == 3) {
                                kVar2.f3003e.f2986k.add(gVar);
                                arrayList2.add(this.f3001b.d.f3003e);
                                gVar.f2978a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f2980c = true;
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f2985j) {
            this.f3001b.Z = fVar.f2983g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3002c = null;
        this.h.c();
        this.f3006i.c();
        this.f2993k.c();
        this.f3003e.c();
        this.f3005g = false;
    }

    @Override // t.o
    public final boolean k() {
        if (this.d == 3 && this.f3001b.f2891s != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        this.f3005g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f2985j = false;
        f fVar2 = this.f3006i;
        fVar2.c();
        fVar2.f2985j = false;
        f fVar3 = this.f2993k;
        fVar3.c();
        fVar3.f2985j = false;
        this.f3003e.f2985j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3001b.f2872h0;
    }
}
