package t;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f2972a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2973b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2974c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2975e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f2976f;

    /* renamed from: g, reason: collision with root package name */
    public b f2977g;
    public ArrayList h;

    /* JADX WARN: Type inference failed for: r13v2, types: [t.l, java.lang.Object] */
    public final void a(f fVar, int i3, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        l lVar2 = oVar.f3002c;
        f fVar2 = oVar.f3006i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            s.e eVar = this.f2972a;
            if (oVar != eVar.d) {
                l lVar3 = lVar;
                if (oVar != eVar.f2867e) {
                    if (lVar == null) {
                        ?? obj = new Object();
                        obj.f2991a = null;
                        obj.f2992b = new ArrayList();
                        obj.f2991a = oVar;
                        arrayList.add(obj);
                        lVar3 = obj;
                    }
                    oVar.f3002c = lVar3;
                    lVar3.f2992b.add(oVar);
                    ArrayList arrayList2 = fVar3.f2986k;
                    int size = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        d dVar = (d) obj2;
                        if (dVar instanceof f) {
                            a((f) dVar, i3, arrayList, lVar3);
                        }
                    }
                    ArrayList arrayList3 = fVar2.f2986k;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj3 = arrayList3.get(i6);
                        i6++;
                        d dVar2 = (d) obj3;
                        if (dVar2 instanceof f) {
                            a((f) dVar2, i3, arrayList, lVar3);
                        }
                    }
                    if (i3 == 1 && (oVar instanceof m)) {
                        ArrayList arrayList4 = ((m) oVar).f2993k.f2986k;
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj4 = arrayList4.get(i7);
                            i7++;
                            d dVar3 = (d) obj4;
                            if (dVar3 instanceof f) {
                                a((f) dVar3, i3, arrayList, lVar3);
                            }
                        }
                    }
                    ArrayList arrayList5 = fVar3.f2987l;
                    int size4 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size4) {
                        Object obj5 = arrayList5.get(i8);
                        i8++;
                        a((f) obj5, i3, arrayList, lVar3);
                    }
                    ArrayList arrayList6 = fVar2.f2987l;
                    int size5 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size5) {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        a((f) obj6, i3, arrayList, lVar3);
                    }
                    if (i3 == 1 && (oVar instanceof m)) {
                        ArrayList arrayList7 = ((m) oVar).f2993k.f2987l;
                        int size6 = arrayList7.size();
                        while (i4 < size6) {
                            Object obj7 = arrayList7.get(i4);
                            i4++;
                            a((f) obj7, i3, arrayList, lVar3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        f(r11, 0, r10, 0, r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.f3003e.f2988m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f2858f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f2858f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.f3003e.f2988m = r12.q();
        r12.f2867e.f3003e.f2988m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.X != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.f2867e.f3003e.f2988m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.f3003e.d(r12.q());
        r12.f2867e.f3003e.d(r12.k());
        r12.f2861a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f2858f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f2858f != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(s.e r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.b(s.e):void");
    }

    public final void c() {
        s.e eVar = this.f2972a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f2975e;
        arrayList2.clear();
        s.e eVar2 = this.d;
        eVar2.d.f();
        eVar2.f2867e.f();
        arrayList2.add(eVar2.d);
        arrayList2.add(eVar2.f2867e);
        ArrayList arrayList3 = eVar2.f2899q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            s.d dVar = (s.d) obj;
            if (dVar instanceof s.h) {
                o oVar = new o(dVar);
                dVar.d.f();
                dVar.f2867e.f();
                oVar.f3004f = ((s.h) dVar).f2939u0;
                arrayList2.add(oVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f2862b == null) {
                        dVar.f2862b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f2862b);
                } else {
                    arrayList2.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f2864c == null) {
                        dVar.f2864c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f2864c);
                } else {
                    arrayList2.add(dVar.f2867e);
                }
                if (dVar instanceof s.i) {
                    arrayList2.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            o oVar2 = (o) obj3;
            if (oVar2.f3001b != eVar2) {
                oVar2.d();
            }
        }
        arrayList.clear();
        e(eVar.d, 0, arrayList);
        e(eVar.f2867e, 1, arrayList);
        this.f2973b = false;
    }

    public final int d(s.e eVar, int i3) {
        o oVar;
        o oVar2;
        ArrayList arrayList;
        int i4;
        long j3;
        float f3;
        long j4;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j5 = 0;
        int i5 = 0;
        long j6 = 0;
        while (i5 < size) {
            o oVar3 = ((l) arrayList2.get(i5)).f2991a;
            if (!(oVar3 instanceof c) ? !(i3 != 0 ? (oVar3 instanceof m) : (oVar3 instanceof k)) : ((c) oVar3).f3004f != i3) {
                arrayList = arrayList2;
                j3 = j5;
                i4 = i5;
            } else {
                if (i3 == 0) {
                    oVar = eVar2.d;
                } else {
                    oVar = eVar2.f2867e;
                }
                f fVar = oVar.h;
                if (i3 == 0) {
                    oVar2 = eVar2.d;
                } else {
                    oVar2 = eVar2.f2867e;
                }
                f fVar2 = oVar2.f3006i;
                f fVar3 = oVar3.h;
                f fVar4 = oVar3.f3006i;
                boolean contains = fVar3.f2987l.contains(fVar);
                boolean contains2 = fVar4.f2987l.contains(fVar2);
                long j7 = oVar3.j();
                if (contains && contains2) {
                    long b3 = l.b(fVar3, j5);
                    arrayList = arrayList2;
                    long a3 = l.a(fVar4, j5);
                    long j8 = b3 - j7;
                    int i6 = fVar4.f2982f;
                    i4 = i5;
                    if (j8 >= (-i6)) {
                        j8 += i6;
                    }
                    long j9 = fVar3.f2982f;
                    long j10 = ((-a3) - j7) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    s.d dVar = oVar3.f3001b;
                    if (i3 == 0) {
                        f3 = dVar.f2866d0;
                    } else if (i3 == 1) {
                        f3 = dVar.e0;
                    } else {
                        dVar.getClass();
                        f3 = -1.0f;
                    }
                    if (f3 > 0.0f) {
                        j4 = (((float) j8) / (1.0f - f3)) + (((float) j10) / f3);
                    } else {
                        j4 = 0;
                    }
                    float f4 = (float) j4;
                    j3 = (fVar3.f2982f + ((((f4 * f3) + 0.5f) + j7) + (((1.0f - f3) * f4) + 0.5f))) - fVar4.f2982f;
                } else {
                    arrayList = arrayList2;
                    i4 = i5;
                    if (contains) {
                        j3 = Math.max(l.b(fVar3, fVar3.f2982f), fVar3.f2982f + j7);
                    } else if (contains2) {
                        j3 = Math.max(-l.a(fVar4, fVar4.f2982f), (-fVar4.f2982f) + j7);
                    } else {
                        j3 = (oVar3.j() + fVar3.f2982f) - fVar4.f2982f;
                    }
                }
            }
            j6 = Math.max(j6, j3);
            i5 = i4 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            j5 = 0;
        }
        return (int) j6;
    }

    public final void e(o oVar, int i3, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.f3006i;
        ArrayList arrayList2 = fVar.f2986k;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i3, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i3, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f2986k;
        int size2 = arrayList3.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList3.get(i6);
            i6++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i3, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f3006i, i3, arrayList, null);
            }
        }
        if (i3 == 1) {
            ArrayList arrayList4 = ((m) oVar).f2993k.f2986k;
            int size3 = arrayList4.size();
            while (i4 < size3) {
                Object obj3 = arrayList4.get(i4);
                i4++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i3, arrayList, null);
                }
            }
        }
    }

    public final void f(int i3, int i4, int i5, int i6, s.d dVar) {
        b bVar = this.f2977g;
        bVar.f2962a = i3;
        bVar.f2963b = i5;
        bVar.f2964c = i4;
        bVar.d = i6;
        this.f2976f.b(dVar, bVar);
        dVar.O(bVar.f2965e);
        dVar.L(bVar.f2966f);
        dVar.E = bVar.h;
        dVar.I(bVar.f2967g);
    }

    public final void g() {
        boolean z2;
        boolean z3;
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f2972a.f2899q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            s.d dVar = (s.d) arrayList.get(i3);
            if (!dVar.f2861a) {
                int[] iArr = dVar.f2888p0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = dVar.f2890r;
                int i8 = dVar.f2891s;
                if (i5 != 2 && (i5 != 3 || i7 != 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i6 != 2 && (i6 != 3 || i8 != 1)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                g gVar = dVar.d.f3003e;
                boolean z4 = gVar.f2985j;
                g gVar2 = dVar.f2867e.f3003e;
                boolean z5 = gVar2.f2985j;
                boolean z6 = z2;
                if (z4 && z5) {
                    eVar.f(1, gVar.f2983g, 1, gVar2.f2983g, dVar);
                    dVar.f2861a = true;
                } else if (z4 && z3) {
                    f(1, gVar.f2983g, 2, gVar2.f2983g, dVar);
                    m mVar = dVar.f2867e;
                    if (i6 == 3) {
                        mVar.f3003e.f2988m = dVar.k();
                    } else {
                        mVar.f3003e.d(dVar.k());
                        dVar.f2861a = true;
                    }
                } else if (z5 && z6) {
                    f(2, gVar.f2983g, 1, gVar2.f2983g, dVar);
                    k kVar = dVar.d;
                    if (i5 == 3) {
                        kVar.f3003e.f2988m = dVar.q();
                    } else {
                        kVar.f3003e.d(dVar.q());
                        dVar.f2861a = true;
                    }
                }
                if (dVar.f2861a && (aVar = dVar.f2867e.f2994l) != null) {
                    aVar.d(dVar.a0);
                }
                eVar = this;
            }
            i3 = i4;
        }
    }
}
