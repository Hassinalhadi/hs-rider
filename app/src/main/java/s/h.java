package s;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f2935q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f2936r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f2937s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f2938t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f2939u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f2940v0;

    public h() {
        this.R.clear();
        this.R.add(this.f2938t0);
        int length = this.Q.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.Q[i3] = this.f2938t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f2940v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f2940v0;
    }

    @Override // s.d
    public final void Q(q.c cVar, boolean z2) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f2938t0;
        cVar.getClass();
        int n2 = q.c.n(cVar2);
        if (this.f2939u0 == 1) {
            this.Y = n2;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n2;
        O(this.T.q());
        L(0);
    }

    public final void R(int i3) {
        this.f2938t0.l(i3);
        this.f2940v0 = true;
    }

    public final void S(int i3) {
        if (this.f2939u0 != i3) {
            this.f2939u0 = i3;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.f2939u0 == 1) {
                this.f2938t0 = this.I;
            } else {
                this.f2938t0 = this.J;
            }
            arrayList.add(this.f2938t0);
            c[] cVarArr = this.Q;
            int length = cVarArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                cVarArr[i4] = this.f2938t0;
            }
        }
    }

    @Override // s.d
    public final void b(q.c cVar, boolean z2) {
        boolean z3;
        e eVar = (e) this.T;
        if (eVar != null) {
            Object i3 = eVar.i(2);
            Object i4 = eVar.i(4);
            d dVar = this.T;
            boolean z4 = true;
            if (dVar != null && dVar.f2888p0[0] == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f2939u0 == 0) {
                i3 = eVar.i(3);
                i4 = eVar.i(5);
                d dVar2 = this.T;
                if (dVar2 == null || dVar2.f2888p0[1] != 2) {
                    z4 = false;
                }
                z3 = z4;
            }
            if (this.f2940v0) {
                c cVar2 = this.f2938t0;
                if (cVar2.f2856c) {
                    q.f k3 = cVar.k(cVar2);
                    cVar.d(k3, this.f2938t0.d());
                    if (this.f2936r0 != -1) {
                        if (z3) {
                            cVar.f(cVar.k(i4), k3, 0, 5);
                        }
                    } else if (this.f2937s0 != -1 && z3) {
                        q.f k4 = cVar.k(i4);
                        cVar.f(k3, cVar.k(i3), 0, 5);
                        cVar.f(k4, k3, 0, 5);
                    }
                    this.f2940v0 = false;
                    return;
                }
            }
            if (this.f2936r0 != -1) {
                q.f k5 = cVar.k(this.f2938t0);
                cVar.e(k5, cVar.k(i3), this.f2936r0, 8);
                if (z3) {
                    cVar.f(cVar.k(i4), k5, 0, 5);
                    return;
                }
                return;
            }
            if (this.f2937s0 != -1) {
                q.f k6 = cVar.k(this.f2938t0);
                q.f k7 = cVar.k(i4);
                cVar.e(k6, k7, -this.f2937s0, 8);
                if (z3) {
                    cVar.f(k6, cVar.k(i3), 0, 5);
                    cVar.f(k7, k6, 0, 5);
                    return;
                }
                return;
            }
            if (this.f2935q0 != -1.0f) {
                q.f k8 = cVar.k(this.f2938t0);
                q.f k9 = cVar.k(i4);
                float f3 = this.f2935q0;
                q.b l3 = cVar.l();
                l3.d.g(k8, -1.0f);
                l3.d.g(k9, f3);
                cVar.c(l3);
            }
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i3) {
        int a3 = q.e.a(i3);
        if (a3 != 1) {
            if (a3 != 2) {
                if (a3 != 3) {
                    if (a3 != 4) {
                        return null;
                    }
                }
            }
            if (this.f2939u0 == 0) {
                return this.f2938t0;
            }
            return null;
        }
        if (this.f2939u0 == 1) {
            return this.f2938t0;
        }
        return null;
    }
}
