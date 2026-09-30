package s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f2835s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2836t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2837u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f2838v0;

    @Override // s.d
    public final boolean A() {
        return this.f2838v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f2838v0;
    }

    public final boolean T() {
        int i3;
        int i4;
        int i5;
        boolean z2 = true;
        int i6 = 0;
        while (true) {
            i3 = this.f2942r0;
            if (i6 >= i3) {
                break;
            }
            d dVar = this.f2941q0[i6];
            if ((this.f2836t0 || dVar.c()) && ((((i4 = this.f2835s0) == 0 || i4 == 1) && !dVar.A()) || (((i5 = this.f2835s0) == 2 || i5 == 3) && !dVar.B()))) {
                z2 = false;
            }
            i6++;
        }
        if (!z2 || i3 <= 0) {
            return false;
        }
        int i7 = 0;
        boolean z3 = false;
        for (int i8 = 0; i8 < this.f2942r0; i8++) {
            d dVar2 = this.f2941q0[i8];
            if (this.f2836t0 || dVar2.c()) {
                if (!z3) {
                    int i9 = this.f2835s0;
                    if (i9 == 0) {
                        i7 = dVar2.i(2).d();
                    } else if (i9 == 1) {
                        i7 = dVar2.i(4).d();
                    } else if (i9 == 2) {
                        i7 = dVar2.i(3).d();
                    } else if (i9 == 3) {
                        i7 = dVar2.i(5).d();
                    }
                    z3 = true;
                }
                int i10 = this.f2835s0;
                if (i10 == 0) {
                    i7 = Math.min(i7, dVar2.i(2).d());
                } else if (i10 == 1) {
                    i7 = Math.max(i7, dVar2.i(4).d());
                } else if (i10 == 2) {
                    i7 = Math.min(i7, dVar2.i(3).d());
                } else if (i10 == 3) {
                    i7 = Math.max(i7, dVar2.i(5).d());
                }
            }
        }
        int i11 = i7 + this.f2837u0;
        int i12 = this.f2835s0;
        if (i12 != 0 && i12 != 1) {
            K(i11, i11);
        } else {
            J(i11, i11);
        }
        this.f2838v0 = true;
        return true;
    }

    public final int U() {
        int i3 = this.f2835s0;
        if (i3 != 0 && i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // s.d
    public final void b(q.c cVar, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i7 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f2860i = cVar.k(cVar6);
        }
        int i8 = this.f2835s0;
        if (i8 >= 0 && i8 < 4) {
            c cVar7 = cVarArr[i8];
            if (!this.f2838v0) {
                T();
            }
            if (this.f2838v0) {
                this.f2838v0 = false;
                int i9 = this.f2835s0;
                if (i9 != 0 && i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        cVar.d(cVar3.f2860i, this.Z);
                        cVar.d(cVar5.f2860i, this.Z);
                        return;
                    }
                    return;
                }
                cVar.d(cVar2.f2860i, this.Y);
                cVar.d(cVar4.f2860i, this.Y);
                return;
            }
            for (int i10 = 0; i10 < this.f2942r0; i10++) {
                d dVar = this.f2941q0[i10];
                if ((this.f2836t0 || dVar.c()) && ((((i6 = this.f2835s0) == 0 || i6 == 1) && dVar.f2888p0[0] == 3 && dVar.I.f2858f != null && dVar.K.f2858f != null) || ((i6 == 2 || i6 == 3) && dVar.f2888p0[1] == 3 && dVar.J.f2858f != null && dVar.L.f2858f != null))) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
            if (!cVar2.g() && !cVar4.g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!cVar3.g() && !cVar5.g()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z3 && (((i5 = this.f2835s0) == 0 && z4) || ((i5 == 2 && z5) || ((i5 == 1 && z4) || (i5 == 3 && z5))))) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                i3 = 4;
            } else {
                i3 = 5;
            }
            int i11 = 0;
            while (i11 < this.f2942r0) {
                d dVar2 = this.f2941q0[i11];
                if (this.f2836t0 || dVar2.c()) {
                    q.f k3 = cVar.k(dVar2.Q[this.f2835s0]);
                    c[] cVarArr2 = dVar2.Q;
                    int i12 = this.f2835s0;
                    c cVar8 = cVarArr2[i12];
                    cVar8.f2860i = k3;
                    c cVar9 = cVar8.f2858f;
                    if (cVar9 != null && cVar9.d == this) {
                        i4 = cVar8.f2859g;
                    } else {
                        i4 = 0;
                    }
                    if (i12 != 0 && i12 != i7) {
                        q.f fVar = cVar7.f2860i;
                        int i13 = this.f2837u0 + i4;
                        q.b l3 = cVar.l();
                        q.f m3 = cVar.m();
                        m3.f2739i = 0;
                        l3.b(fVar, k3, m3, i13);
                        cVar.c(l3);
                    } else {
                        q.f fVar2 = cVar7.f2860i;
                        int i14 = this.f2837u0 - i4;
                        q.b l4 = cVar.l();
                        q.f m4 = cVar.m();
                        m4.f2739i = 0;
                        l4.c(fVar2, k3, m4, i14);
                        cVar.c(l4);
                    }
                    cVar.e(cVar7.f2860i, k3, this.f2837u0 + i4, i3);
                }
                i11++;
                i7 = 2;
            }
            int i15 = this.f2835s0;
            if (i15 == 0) {
                cVar.e(cVar4.f2860i, cVar2.f2860i, 0, 8);
                cVar.e(cVar2.f2860i, this.T.K.f2860i, 0, 4);
                cVar.e(cVar2.f2860i, this.T.I.f2860i, 0, 0);
                return;
            }
            if (i15 == 1) {
                cVar.e(cVar2.f2860i, cVar4.f2860i, 0, 8);
                cVar.e(cVar2.f2860i, this.T.I.f2860i, 0, 4);
                cVar.e(cVar2.f2860i, this.T.K.f2860i, 0, 0);
            } else if (i15 == 2) {
                cVar.e(cVar5.f2860i, cVar3.f2860i, 0, 8);
                cVar.e(cVar3.f2860i, this.T.L.f2860i, 0, 4);
                cVar.e(cVar3.f2860i, this.T.J.f2860i, 0, 0);
            } else if (i15 == 3) {
                cVar.e(cVar3.f2860i, cVar5.f2860i, 0, 8);
                cVar.e(cVar3.f2860i, this.T.J.f2860i, 0, 4);
                cVar.e(cVar3.f2860i, this.T.L.f2860i, 0, 0);
            }
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final String toString() {
        String str = "[Barrier] " + this.f2872h0 + " {";
        for (int i3 = 0; i3 < this.f2942r0; i3++) {
            d dVar = this.f2941q0[i3];
            if (i3 > 0) {
                str = str.concat(", ");
            }
            str = str + dVar.f2872h0;
        }
        return str.concat("}");
    }
}
