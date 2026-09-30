package s;

import androidx.emoji2.text.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.o;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final t.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f2899q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final s f2900r0 = new s(this);

    /* renamed from: s0, reason: collision with root package name */
    public final t.e f2901s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2902t0;

    /* renamed from: u0, reason: collision with root package name */
    public v.f f2903u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f2904v0;

    /* renamed from: w0, reason: collision with root package name */
    public final q.c f2905w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f2906x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f2907y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f2908z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [t.b, java.lang.Object] */
    public e() {
        ?? obj = new Object();
        obj.f2973b = true;
        obj.f2974c = true;
        obj.f2975e = new ArrayList();
        new ArrayList();
        obj.f2976f = null;
        obj.f2977g = new Object();
        obj.h = new ArrayList();
        obj.f2972a = this;
        obj.d = this;
        this.f2901s0 = obj;
        this.f2903u0 = null;
        this.f2904v0 = false;
        this.f2905w0 = new q.c();
        this.f2908z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new Object();
    }

    public static void V(d dVar, v.f fVar, t.b bVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        if (fVar == null) {
            return;
        }
        int i5 = dVar.f2871g0;
        int[] iArr = dVar.f2892t;
        if (i5 != 8 && !(dVar instanceof h) && !(dVar instanceof a)) {
            int[] iArr2 = dVar.f2888p0;
            bVar.f2962a = iArr2[0];
            bVar.f2963b = iArr2[1];
            bVar.f2964c = dVar.q();
            bVar.d = dVar.k();
            bVar.f2968i = false;
            bVar.f2969j = 0;
            if (bVar.f2962a == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar.f2963b == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && dVar.W > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && dVar.W > 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z2 && dVar.t(0) && dVar.f2890r == 0 && !z4) {
                bVar.f2962a = 2;
                if (z3 && dVar.f2891s == 0) {
                    bVar.f2962a = 1;
                }
                z2 = false;
            }
            if (z3 && dVar.t(1) && dVar.f2891s == 0 && !z5) {
                bVar.f2963b = 2;
                if (z2 && dVar.f2890r == 0) {
                    bVar.f2963b = 1;
                }
                z3 = false;
            }
            if (dVar.A()) {
                bVar.f2962a = 1;
                z2 = false;
            }
            if (dVar.B()) {
                bVar.f2963b = 1;
                z3 = false;
            }
            if (z4) {
                if (iArr[0] == 4) {
                    bVar.f2962a = 1;
                } else if (!z3) {
                    if (bVar.f2963b == 1) {
                        i4 = bVar.d;
                    } else {
                        bVar.f2962a = 2;
                        fVar.b(dVar, bVar);
                        i4 = bVar.f2966f;
                    }
                    bVar.f2962a = 1;
                    bVar.f2964c = (int) (dVar.W * i4);
                }
            }
            if (z5) {
                if (iArr[1] == 4) {
                    bVar.f2963b = 1;
                } else if (!z2) {
                    if (bVar.f2962a == 1) {
                        i3 = bVar.f2964c;
                    } else {
                        bVar.f2963b = 2;
                        fVar.b(dVar, bVar);
                        i3 = bVar.f2965e;
                    }
                    bVar.f2963b = 1;
                    int i6 = dVar.X;
                    float f3 = dVar.W;
                    if (i6 == -1) {
                        bVar.d = (int) (i3 / f3);
                    } else {
                        bVar.d = (int) (f3 * i3);
                    }
                }
            }
            fVar.b(dVar, bVar);
            dVar.O(bVar.f2965e);
            dVar.L(bVar.f2966f);
            dVar.E = bVar.h;
            dVar.I(bVar.f2967g);
            bVar.f2969j = 0;
            return;
        }
        bVar.f2965e = 0;
        bVar.f2966f = 0;
    }

    @Override // s.d
    public final void C() {
        this.f2905w0.t();
        this.f2906x0 = 0;
        this.f2907y0 = 0;
        this.f2899q0.clear();
        super.C();
    }

    @Override // s.d
    public final void F(s sVar) {
        super.F(sVar);
        int size = this.f2899q0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f2899q0.get(i3)).F(sVar);
        }
    }

    @Override // s.d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f2899q0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f2899q0.get(i3)).P(z2, z3);
        }
    }

    public final void R(d dVar, int i3) {
        if (i3 == 0) {
            int i4 = this.f2908z0 + 1;
            b[] bVarArr = this.C0;
            if (i4 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i5 = this.f2908z0;
            bVarArr2[i5] = new b(dVar, 0, this.f2904v0);
            this.f2908z0 = i5 + 1;
            return;
        }
        if (i3 == 1) {
            int i6 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i6 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i7 = this.A0;
            bVarArr4[i7] = new b(dVar, 1, this.f2904v0);
            this.A0 = i7 + 1;
        }
    }

    public final void S(q.c cVar) {
        e eVar;
        q.c cVar2;
        int i3;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f2899q0.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) this.f2899q0.get(i4);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                d dVar2 = (d) this.f2899q0.get(i5);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i6 = 0; i6 < aVar.f2942r0; i6++) {
                        d dVar3 = aVar.f2941q0[i6];
                        if (aVar.f2836t0 || dVar3.c()) {
                            int i7 = aVar.f2835s0;
                            if (i7 != 0 && i7 != 1) {
                                if (i7 == 2 || i7 == 3) {
                                    dVar3.S[1] = true;
                                }
                            } else {
                                dVar3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar4 = (d) this.f2899q0.get(i8);
            dVar4.getClass();
            boolean z3 = dVar4 instanceof g;
            if (z3 || (dVar4 instanceof h)) {
                if (z3) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i9 = 0; i9 < gVar.f2942r0; i9++) {
                    if (hashSet.contains(gVar.f2941q0[i9])) {
                        gVar.b(cVar, W);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (q.c.f2719q) {
            HashSet hashSet2 = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar5 = (d) this.f2899q0.get(i10);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f2888p0[0] == 2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, i3, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(eVar, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar7 = (d) eVar.f2899q0.get(i11);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f2888p0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        dVar7.M(1);
                    }
                    if (i13 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i12 == 2) {
                        dVar7.M(i12);
                    }
                    if (i13 == 2) {
                        dVar7.N(i13);
                    }
                } else {
                    j.b(eVar, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.f2908z0 > 0) {
            j.a(eVar, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(eVar, cVar2, null, 1);
        }
    }

    public final boolean T(int i3, boolean z2) {
        boolean z3;
        t.e eVar = this.f2901s0;
        ArrayList arrayList = eVar.f2975e;
        e eVar2 = eVar.f2972a;
        boolean z4 = false;
        int j3 = eVar2.j(0);
        int j4 = eVar2.j(1);
        int r3 = eVar2.r();
        int s3 = eVar2.s();
        if (z2 && (j3 == 2 || j4 == 2)) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.f3004f == i3 && !oVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i3 == 0) {
                if (z2 && j3 == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.d.f3003e.d(eVar2.q());
                }
            } else if (z2 && j4 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f2867e.f3003e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f2888p0;
        if (i3 == 0) {
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int q3 = eVar2.q() + r3;
                eVar2.d.f3006i.d(q3);
                eVar2.d.f3003e.d(q3 - r3);
                z3 = true;
            }
            z3 = false;
        } else {
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int k3 = eVar2.k() + s3;
                eVar2.f2867e.f3006i.d(k3);
                eVar2.f2867e.f3003e.d(k3 - s3);
                z3 = true;
            }
            z3 = false;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            o oVar2 = (o) obj2;
            if (oVar2.f3004f == i3 && (oVar2.f3001b != eVar2 || oVar2.f3005g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                o oVar3 = (o) obj3;
                if (oVar3.f3004f == i3 && (z3 || oVar3.f3001b != eVar2)) {
                    if (!oVar3.h.f2985j) {
                        break;
                    }
                    if (!oVar3.f3006i.f2985j) {
                        break;
                    }
                    if (!(oVar3 instanceof t.c) && !oVar3.f3003e.f2985j) {
                        break;
                    }
                }
            } else {
                z4 = true;
                break;
            }
        }
        eVar2.M(j3);
        eVar2.N(j4);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x082a A[LOOP:14: B:279:0x0828->B:280:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x062f  */
    /* JADX WARN: Type inference failed for: r6v89, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.U():void");
    }

    public final boolean W(int i3) {
        if ((this.D0 & i3) == i3) {
            return true;
        }
        return false;
    }

    @Override // s.d
    public final void n(StringBuilder sb) {
        sb.append(this.f2875j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f2899q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
