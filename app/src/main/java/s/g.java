package s;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends i {
    public int A0;
    public t.b B0;
    public v.f C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f2925a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f2926b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f2927s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2928t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2929u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2930v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2931w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f2932x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2933y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f2934z0;

    @Override // s.i
    public final void S() {
        for (int i3 = 0; i3 < this.f2942r0; i3++) {
            d dVar = this.f2941q0[i3];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i3) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f2888p0;
            if (iArr[1] == 3) {
                int i4 = dVar.f2891s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f2898z * i3);
                        if (i5 != dVar.k()) {
                            dVar.f2870g = true;
                            V(iArr[0], dVar.q(), 1, i5, dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.k();
                    }
                    if (i4 == 3) {
                        return (int) ((dVar2.q() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i3) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f2888p0;
            if (iArr[0] == 3) {
                int i4 = dVar.f2890r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f2895w * i3);
                        if (i5 != dVar.q()) {
                            dVar.f2870g = true;
                            V(1, i5, iArr[1], dVar.k(), dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.q();
                    }
                    if (i4 == 3) {
                        return (int) ((dVar2.k() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i3, int i4, int i5, int i6, d dVar) {
        v.f fVar;
        d dVar2;
        t.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f2903u0;
            }
        }
        bVar.f2962a = i3;
        bVar.f2963b = i5;
        bVar.f2964c = i4;
        bVar.d = i6;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f2965e);
        dVar.L(bVar.f2966f);
        dVar.E = bVar.h;
        dVar.I(bVar.f2967g);
    }

    @Override // s.d
    public final void b(q.c cVar, boolean z2) {
        boolean z3;
        boolean z4;
        d dVar;
        float f3;
        int i3;
        boolean z5;
        ArrayList arrayList = this.W0;
        super.b(cVar, z2);
        d dVar2 = this.T;
        if (dVar2 != null && ((e) dVar2).f2904v0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = this.T0;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            f fVar = (f) arrayList.get(i5);
                            if (i5 == size - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            fVar.b(i5, z3, z5);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i6 = 0; i6 < this.f2926b1; i6++) {
                        this.f2925a1[i6].D();
                    }
                    int[] iArr = this.Z0;
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    float f4 = this.J0;
                    d dVar3 = null;
                    int i9 = 0;
                    while (i9 < i7) {
                        if (z3) {
                            i3 = (i7 - i9) - 1;
                            f3 = 1.0f - this.J0;
                        } else {
                            f3 = f4;
                            i3 = i9;
                        }
                        d dVar4 = this.Y0[i3];
                        if (dVar4 != null) {
                            c cVar2 = dVar4.I;
                            if (dVar4.f2871g0 != 8) {
                                if (i9 == 0) {
                                    dVar4.f(cVar2, this.I, this.f2931w0);
                                    dVar4.f2874i0 = this.D0;
                                    dVar4.f2866d0 = f3;
                                }
                                if (i9 == i7 - 1) {
                                    dVar4.f(dVar4.K, this.K, this.f2932x0);
                                }
                                if (i9 > 0 && dVar3 != null) {
                                    c cVar3 = dVar3.K;
                                    dVar4.f(cVar2, cVar3, this.P0);
                                    dVar3.f(cVar3, cVar2, 0);
                                }
                                dVar3 = dVar4;
                            }
                        }
                        i9++;
                        f4 = f3;
                    }
                    for (int i10 = 0; i10 < i8; i10++) {
                        d dVar5 = this.X0[i10];
                        if (dVar5 != null) {
                            c cVar4 = dVar5.J;
                            if (dVar5.f2871g0 != 8) {
                                if (i10 == 0) {
                                    dVar5.f(cVar4, this.J, this.f2927s0);
                                    dVar5.f2876j0 = this.E0;
                                    dVar5.e0 = this.K0;
                                }
                                if (i10 == i8 - 1) {
                                    dVar5.f(dVar5.L, this.L, this.f2928t0);
                                }
                                if (i10 > 0 && dVar3 != null) {
                                    c cVar5 = dVar3.L;
                                    dVar5.f(cVar4, cVar5, this.Q0);
                                    dVar3.f(cVar5, cVar4, 0);
                                }
                                dVar3 = dVar5;
                            }
                        }
                    }
                    for (int i11 = 0; i11 < i7; i11++) {
                        for (int i12 = 0; i12 < i8; i12++) {
                            int i13 = (i12 * i7) + i11;
                            if (this.V0 == 1) {
                                i13 = (i11 * i8) + i12;
                            }
                            d[] dVarArr = this.f2925a1;
                            if (i13 < dVarArr.length && (dVar = dVarArr[i13]) != null && dVar.f2871g0 != 8) {
                                d dVar6 = this.Y0[i11];
                                d dVar7 = this.X0[i12];
                                if (dVar != dVar6) {
                                    dVar.f(dVar.I, dVar6.I, 0);
                                    dVar.f(dVar.K, dVar6.K, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.f(dVar.J, dVar7.J, 0);
                                    dVar.f(dVar.L, dVar7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    f fVar2 = (f) arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fVar2.b(i14, z3, z4);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f2933y0 = false;
    }
}
