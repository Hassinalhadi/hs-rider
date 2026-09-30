package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2989a = new Object();

    public static boolean a(s.d dVar) {
        s.e eVar;
        boolean z2;
        boolean z3;
        int[] iArr = dVar.f2888p0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        s.d dVar2 = dVar.T;
        if (dVar2 != null) {
            eVar = (s.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i5 = eVar.f2888p0[0];
        }
        if (eVar != null) {
            int i6 = eVar.f2888p0[1];
        }
        if (i3 != 1 && !dVar.A() && i3 != 2 && ((i3 != 3 || dVar.f2890r != 0 || dVar.W != 0.0f || !dVar.t(0)) && (i3 != 3 || dVar.f2890r != 1 || !dVar.u(0, dVar.q())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 1 && !dVar.B() && i4 != 2 && ((i4 != 3 || dVar.f2891s != 0 || dVar.W != 0.0f || !dVar.t(1)) && (i4 != 3 || dVar.f2891s != 1 || !dVar.u(1, dVar.k())))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((dVar.W <= 0.0f || (!z2 && !z3)) && (!z2 || !z3)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [t.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [t.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static n b(s.d dVar, int i3, ArrayList arrayList, n nVar) {
        int i4;
        int i5;
        if (i3 == 0) {
            i4 = dVar.f2884n0;
        } else {
            i4 = dVar.f2886o0;
        }
        int i6 = 0;
        if (i4 != -1 && (nVar == 0 || i4 != nVar.f2997b)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i7);
                if (nVar2.f2997b == i4) {
                    if (nVar != 0) {
                        nVar.c(i3, nVar2);
                        arrayList.remove((Object) nVar);
                    }
                    nVar = nVar2;
                } else {
                    i7++;
                }
            }
        } else if (i4 != -1) {
            return nVar;
        }
        n nVar3 = nVar;
        if (nVar == 0) {
            if (dVar instanceof s.i) {
                s.i iVar = (s.i) dVar;
                int i8 = 0;
                while (true) {
                    if (i8 < iVar.f2942r0) {
                        s.d dVar2 = iVar.f2941q0[i8];
                        if ((i3 == 0 && (i5 = dVar2.f2884n0) != -1) || (i3 == 1 && (i5 = dVar2.f2886o0) != -1)) {
                            break;
                        }
                        i8++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 != -1) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        }
                        n nVar4 = (n) arrayList.get(i9);
                        if (nVar4.f2997b == i5) {
                            nVar = nVar4;
                            break;
                        }
                        i9++;
                    }
                }
            }
            if (nVar == 0) {
                nVar = new Object();
                nVar.f2996a = new ArrayList();
                nVar.d = null;
                nVar.f2999e = -1;
                int i10 = n.f2995f;
                n.f2995f = i10 + 1;
                nVar.f2997b = i10;
                nVar.f2998c = i3;
            }
            arrayList.add(nVar);
            nVar3 = nVar;
        }
        ArrayList arrayList2 = nVar3.f2996a;
        if (arrayList2.contains(dVar)) {
            return nVar3;
        }
        arrayList2.add(dVar);
        if (dVar instanceof s.h) {
            s.h hVar = (s.h) dVar;
            s.c cVar = hVar.f2938t0;
            if (hVar.f2939u0 == 0) {
                i6 = 1;
            }
            cVar.c(i6, arrayList, nVar3);
        }
        int i11 = nVar3.f2997b;
        if (i3 == 0) {
            dVar.f2884n0 = i11;
            dVar.I.c(i3, arrayList, nVar3);
            dVar.K.c(i3, arrayList, nVar3);
        } else {
            dVar.f2886o0 = i11;
            dVar.J.c(i3, arrayList, nVar3);
            dVar.M.c(i3, arrayList, nVar3);
            dVar.L.c(i3, arrayList, nVar3);
        }
        dVar.P.c(i3, arrayList, nVar3);
        return nVar3;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [t.b, java.lang.Object] */
    public static void c(int i3, s.d dVar, v.f fVar, boolean z2) {
        boolean z3;
        s.c cVar;
        s.c cVar2;
        boolean z4;
        boolean z5;
        s.c cVar3;
        s.c cVar4;
        if (!dVar.f2881m) {
            if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
                s.e.V(dVar, fVar, new Object());
            }
            s.c i4 = dVar.i(2);
            s.c i5 = dVar.i(4);
            int d = i4.d();
            int d3 = i5.d();
            HashSet hashSet = i4.f2854a;
            if (hashSet != null && i4.f2856c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    s.c cVar5 = (s.c) it.next();
                    s.d dVar2 = cVar5.d;
                    int i6 = i3 + 1;
                    boolean a3 = a(dVar2);
                    s.c cVar6 = dVar2.I;
                    s.c cVar7 = dVar2.K;
                    if (dVar2.z() && a3) {
                        z4 = true;
                        s.e.V(dVar2, fVar, new Object());
                    } else {
                        z4 = true;
                    }
                    if ((cVar5 == cVar6 && (cVar4 = cVar7.f2858f) != null && cVar4.f2856c) || (cVar5 == cVar7 && (cVar3 = cVar6.f2858f) != null && cVar3.f2856c)) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    int i7 = dVar2.f2888p0[0];
                    if (i7 == 3 && !a3) {
                        if (i7 == 3 && dVar2.f2894v >= 0 && dVar2.f2893u >= 0 && (dVar2.f2871g0 == 8 || (dVar2.f2890r == 0 && dVar2.W == 0.0f))) {
                            if (!dVar2.x() && !dVar2.F && z5 && !dVar2.x()) {
                                e(i6, dVar, fVar, dVar2, z2);
                            }
                        }
                    } else if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f2858f == null) {
                            int e3 = cVar6.e() + d;
                            dVar2.J(e3, dVar2.q() + e3);
                            c(i6, dVar2, fVar, z2);
                        } else if (cVar5 == cVar7 && cVar6.f2858f == null) {
                            int e4 = d - cVar7.e();
                            dVar2.J(e4 - dVar2.q(), e4);
                            c(i6, dVar2, fVar, z2);
                        } else if (z5 && !dVar2.x()) {
                            d(i6, dVar2, fVar, z2);
                        }
                    }
                }
            }
            if (dVar instanceof s.h) {
                return;
            }
            HashSet hashSet2 = i5.f2854a;
            if (hashSet2 != null && i5.f2856c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    s.c cVar8 = (s.c) it2.next();
                    s.d dVar3 = cVar8.d;
                    int i8 = i3 + 1;
                    boolean a4 = a(dVar3);
                    s.c cVar9 = dVar3.I;
                    s.c cVar10 = dVar3.K;
                    if (dVar3.z() && a4) {
                        s.e.V(dVar3, fVar, new Object());
                    }
                    if ((cVar8 == cVar9 && (cVar2 = cVar10.f2858f) != null && cVar2.f2856c) || (cVar8 == cVar10 && (cVar = cVar9.f2858f) != null && cVar.f2856c)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i9 = dVar3.f2888p0[0];
                    if (i9 == 3 && !a4) {
                        if (i9 == 3 && dVar3.f2894v >= 0 && dVar3.f2893u >= 0) {
                            if (dVar3.f2871g0 == 8 || (dVar3.f2890r == 0 && dVar3.W == 0.0f)) {
                                if (!dVar3.x() && !dVar3.F && z3 && !dVar3.x()) {
                                    e(i8, dVar, fVar, dVar3, z2);
                                }
                            }
                        }
                    } else if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f2858f == null) {
                            int e5 = cVar9.e() + d3;
                            dVar3.J(e5, dVar3.q() + e5);
                            c(i8, dVar3, fVar, z2);
                        } else if (cVar8 == cVar10 && cVar9.f2858f == null) {
                            int e6 = d3 - cVar10.e();
                            dVar3.J(e6 - dVar3.q(), e6);
                            c(i8, dVar3, fVar, z2);
                        } else if (z3 && !dVar3.x()) {
                            d(i8, dVar3, fVar, z2);
                        }
                    }
                }
            }
            dVar.f2881m = true;
        }
    }

    public static void d(int i3, s.d dVar, v.f fVar, boolean z2) {
        float f3;
        float f4 = dVar.f2866d0;
        s.c cVar = dVar.I;
        int d = cVar.f2858f.d();
        s.c cVar2 = dVar.K;
        int d3 = cVar2.f2858f.d();
        int e3 = cVar.e() + d;
        int e4 = d3 - cVar2.e();
        if (d == d3) {
            f4 = 0.5f;
        } else {
            d = e3;
            d3 = e4;
        }
        int q3 = dVar.q();
        int i4 = (d3 - d) - q3;
        if (d > d3) {
            i4 = (d - d3) - q3;
        }
        if (i4 > 0) {
            f3 = (f4 * i4) + 0.5f;
        } else {
            f3 = f4 * i4;
        }
        int i5 = ((int) f3) + d;
        int i6 = i5 + q3;
        if (d > d3) {
            i6 = i5 - q3;
        }
        dVar.J(i5, i6);
        c(i3 + 1, dVar, fVar, z2);
    }

    public static void e(int i3, s.d dVar, v.f fVar, s.d dVar2, boolean z2) {
        int q3;
        float f3 = dVar2.f2866d0;
        s.c cVar = dVar2.I;
        int e3 = cVar.e() + cVar.f2858f.d();
        s.c cVar2 = dVar2.K;
        int d = cVar2.f2858f.d() - cVar2.e();
        if (d >= e3) {
            int q4 = dVar2.q();
            if (dVar2.f2871g0 != 8) {
                int i4 = dVar2.f2890r;
                if (i4 == 2) {
                    if (dVar instanceof s.e) {
                        q3 = dVar.q();
                    } else {
                        q3 = dVar.T.q();
                    }
                    q4 = (int) (dVar2.f2866d0 * 0.5f * q3);
                } else if (i4 == 0) {
                    q4 = d - e3;
                }
                q4 = Math.max(dVar2.f2893u, q4);
                int i5 = dVar2.f2894v;
                if (i5 > 0) {
                    q4 = Math.min(i5, q4);
                }
            }
            int i6 = e3 + ((int) ((f3 * ((d - e3) - q4)) + 0.5f));
            dVar2.J(i6, q4 + i6);
            c(i3 + 1, dVar2, fVar, z2);
        }
    }

    public static void f(int i3, s.d dVar, v.f fVar) {
        float f3;
        float f4 = dVar.e0;
        s.c cVar = dVar.J;
        int d = cVar.f2858f.d();
        s.c cVar2 = dVar.L;
        int d3 = cVar2.f2858f.d();
        int e3 = cVar.e() + d;
        int e4 = d3 - cVar2.e();
        if (d == d3) {
            f4 = 0.5f;
        } else {
            d = e3;
            d3 = e4;
        }
        int k3 = dVar.k();
        int i4 = (d3 - d) - k3;
        if (d > d3) {
            i4 = (d - d3) - k3;
        }
        if (i4 > 0) {
            f3 = (f4 * i4) + 0.5f;
        } else {
            f3 = f4 * i4;
        }
        int i5 = (int) f3;
        int i6 = d + i5;
        int i7 = i6 + k3;
        if (d > d3) {
            i6 = d - i5;
            i7 = i6 - k3;
        }
        dVar.K(i6, i7);
        i(i3 + 1, dVar, fVar);
    }

    public static void g(int i3, s.d dVar, v.f fVar, s.d dVar2) {
        int k3;
        float f3 = dVar2.e0;
        s.c cVar = dVar2.J;
        int e3 = cVar.e() + cVar.f2858f.d();
        s.c cVar2 = dVar2.L;
        int d = cVar2.f2858f.d() - cVar2.e();
        if (d >= e3) {
            int k4 = dVar2.k();
            if (dVar2.f2871g0 != 8) {
                int i4 = dVar2.f2891s;
                if (i4 == 2) {
                    if (dVar instanceof s.e) {
                        k3 = dVar.k();
                    } else {
                        k3 = dVar.T.k();
                    }
                    k4 = (int) (f3 * 0.5f * k3);
                } else if (i4 == 0) {
                    k4 = d - e3;
                }
                k4 = Math.max(dVar2.f2896x, k4);
                int i5 = dVar2.f2897y;
                if (i5 > 0) {
                    k4 = Math.min(i5, k4);
                }
            }
            int i6 = e3 + ((int) ((f3 * ((d - e3) - k4)) + 0.5f));
            dVar2.K(i6, k4 + i6);
            i(i3 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i3, int i4, int i5, int i6) {
        boolean z2;
        boolean z3;
        if (i5 != 1 && i5 != 2 && (i5 != 4 || i3 == 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i6 != 1 && i6 != 2 && (i6 != 4 || i4 == 2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [t.b, java.lang.Object] */
    public static void i(int i3, s.d dVar, v.f fVar) {
        boolean z2;
        boolean z3;
        s.c cVar;
        s.c cVar2;
        boolean z4;
        s.c cVar3;
        s.c cVar4;
        if (!dVar.f2883n) {
            if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
                s.e.V(dVar, fVar, new Object());
            }
            s.c i4 = dVar.i(3);
            s.c i5 = dVar.i(5);
            int d = i4.d();
            int d3 = i5.d();
            HashSet hashSet = i4.f2854a;
            if (hashSet != null && i4.f2856c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    s.c cVar5 = (s.c) it.next();
                    s.d dVar2 = cVar5.d;
                    int i6 = i3 + 1;
                    boolean a3 = a(dVar2);
                    s.c cVar6 = dVar2.J;
                    s.c cVar7 = dVar2.L;
                    if (dVar2.z() && a3) {
                        s.e.V(dVar2, fVar, new Object());
                    }
                    if ((cVar5 == cVar6 && (cVar4 = cVar7.f2858f) != null && cVar4.f2856c) || (cVar5 == cVar7 && (cVar3 = cVar6.f2858f) != null && cVar3.f2856c)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i7 = dVar2.f2888p0[1];
                    if (i7 == 3 && !a3) {
                        if (i7 == 3 && dVar2.f2897y >= 0 && dVar2.f2896x >= 0 && (dVar2.f2871g0 == 8 || (dVar2.f2891s == 0 && dVar2.W == 0.0f))) {
                            if (!dVar2.y() && !dVar2.F && z4 && !dVar2.y()) {
                                g(i6, dVar, fVar, dVar2);
                            }
                        }
                    } else if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f2858f == null) {
                            int e3 = cVar6.e() + d;
                            dVar2.K(e3, dVar2.k() + e3);
                            i(i6, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f2858f == null) {
                            int e4 = d - cVar7.e();
                            dVar2.K(e4 - dVar2.k(), e4);
                            i(i6, dVar2, fVar);
                        } else if (z4 && !dVar2.y()) {
                            f(i6, dVar2, fVar);
                        }
                    }
                }
            }
            boolean z5 = true;
            z5 = true;
            z5 = true;
            if (dVar instanceof s.h) {
                return;
            }
            HashSet hashSet2 = i5.f2854a;
            if (hashSet2 != null && i5.f2856c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    s.c cVar8 = (s.c) it2.next();
                    s.d dVar3 = cVar8.d;
                    int i8 = i3 + 1;
                    boolean a4 = a(dVar3);
                    s.c cVar9 = dVar3.J;
                    s.c cVar10 = dVar3.L;
                    if (dVar3.z() && a4) {
                        s.e.V(dVar3, fVar, new Object());
                    }
                    if ((cVar8 == cVar9 && (cVar2 = cVar10.f2858f) != null && cVar2.f2856c) || (cVar8 == cVar10 && (cVar = cVar9.f2858f) != null && cVar.f2856c)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i9 = dVar3.f2888p0[1];
                    if (i9 == 3 && !a4) {
                        if (i9 == 3 && dVar3.f2897y >= 0 && dVar3.f2896x >= 0 && (dVar3.f2871g0 == 8 || (dVar3.f2891s == 0 && dVar3.W == 0.0f))) {
                            if (!dVar3.y() && !dVar3.F && z3 && !dVar3.y()) {
                                g(i8, dVar, fVar, dVar3);
                            }
                        }
                    } else if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f2858f == null) {
                            int e5 = cVar9.e() + d3;
                            dVar3.K(e5, dVar3.k() + e5);
                            i(i8, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f2858f == null) {
                            int e6 = d3 - cVar10.e();
                            dVar3.K(e6 - dVar3.k(), e6);
                            i(i8, dVar3, fVar);
                        } else if (z3 && !dVar3.y()) {
                            f(i8, dVar3, fVar);
                        }
                    }
                }
            }
            s.c i10 = dVar.i(6);
            if (i10.f2854a != null && i10.f2856c) {
                int d4 = i10.d();
                Iterator it3 = i10.f2854a.iterator();
                while (it3.hasNext()) {
                    s.c cVar11 = (s.c) it3.next();
                    s.d dVar4 = cVar11.d;
                    int i11 = i3 + 1;
                    boolean a5 = a(dVar4);
                    s.c cVar12 = dVar4.M;
                    if (dVar4.z() && a5) {
                        s.e.V(dVar4, fVar, new Object());
                    }
                    if (dVar4.f2888p0[z5 ? 1 : 0] != 3 || a5) {
                        if (!dVar4.z()) {
                            if (cVar11 == cVar12) {
                                int e7 = cVar11.e() + d4;
                                if (!dVar4.E) {
                                    z2 = z5 ? 1 : 0;
                                } else {
                                    int i12 = e7 - dVar4.a0;
                                    int i13 = dVar4.V + i12;
                                    dVar4.Z = i12;
                                    dVar4.J.l(i12);
                                    dVar4.L.l(i13);
                                    cVar12.l(e7);
                                    z2 = z5 ? 1 : 0;
                                    dVar4.f2879l = z2;
                                }
                                i(i11, dVar4, fVar);
                                z5 = z2;
                            }
                        }
                    }
                    z2 = z5 ? 1 : 0;
                    z5 = z2;
                }
            }
            dVar.f2883n = z5;
        }
    }
}
