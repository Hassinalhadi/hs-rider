package s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2909a;
    public c d;

    /* renamed from: e, reason: collision with root package name */
    public c f2912e;

    /* renamed from: f, reason: collision with root package name */
    public c f2913f;

    /* renamed from: g, reason: collision with root package name */
    public c f2914g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2915i;

    /* renamed from: j, reason: collision with root package name */
    public int f2916j;

    /* renamed from: k, reason: collision with root package name */
    public int f2917k;

    /* renamed from: q, reason: collision with root package name */
    public int f2923q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f2924r;

    /* renamed from: b, reason: collision with root package name */
    public d f2910b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f2911c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f2918l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2919m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f2920n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f2921o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2922p = 0;

    public f(g gVar, int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4) {
        this.f2924r = gVar;
        this.f2909a = i3;
        this.d = cVar;
        this.f2912e = cVar2;
        this.f2913f = cVar3;
        this.f2914g = cVar4;
        this.h = gVar.f2931w0;
        this.f2915i = gVar.f2927s0;
        this.f2916j = gVar.f2932x0;
        this.f2917k = gVar.f2928t0;
        this.f2923q = i4;
    }

    public final void a(d dVar) {
        int i3 = this.f2909a;
        int i4 = this.f2923q;
        int i5 = 0;
        g gVar = this.f2924r;
        if (i3 == 0) {
            int U = gVar.U(dVar, i4);
            if (dVar.f2888p0[0] == 3) {
                this.f2922p++;
                U = 0;
            }
            int i6 = gVar.P0;
            if (dVar.f2871g0 != 8) {
                i5 = i6;
            }
            this.f2918l = U + i5 + this.f2918l;
            int T = gVar.T(dVar, this.f2923q);
            if (this.f2910b == null || this.f2911c < T) {
                this.f2910b = dVar;
                this.f2911c = T;
                this.f2919m = T;
            }
        } else {
            int U2 = gVar.U(dVar, i4);
            int T2 = gVar.T(dVar, this.f2923q);
            if (dVar.f2888p0[1] == 3) {
                this.f2922p++;
                T2 = 0;
            }
            int i7 = gVar.Q0;
            if (dVar.f2871g0 != 8) {
                i5 = i7;
            }
            this.f2919m = T2 + i5 + this.f2919m;
            if (this.f2910b == null || this.f2911c < U2) {
                this.f2910b = dVar;
                this.f2911c = U2;
                this.f2918l = U2;
            }
        }
        this.f2921o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i3 = this.f2909a;
        int i4 = this.f2919m;
        if (i3 == 1) {
            return i4 - this.f2924r.Q0;
        }
        return i4;
    }

    public final int d() {
        int i3 = this.f2909a;
        int i4 = this.f2918l;
        if (i3 == 0) {
            return i4 - this.f2924r.P0;
        }
        return i4;
    }

    public final void e(int i3) {
        g gVar;
        int i4;
        int i5 = this.f2922p;
        if (i5 != 0) {
            int i6 = this.f2921o;
            int i7 = i3 / i5;
            int i8 = 0;
            while (true) {
                gVar = this.f2924r;
                if (i8 >= i6 || (i4 = this.f2920n + i8) >= gVar.f2926b1) {
                    break;
                }
                d dVar = gVar.f2925a1[i4];
                if (this.f2909a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.f2888p0;
                        if (iArr[0] == 3 && dVar.f2890r == 0) {
                            gVar.V(1, i7, iArr[1], dVar.k(), dVar);
                        }
                    }
                } else if (dVar != null) {
                    int[] iArr2 = dVar.f2888p0;
                    if (iArr2[1] == 3 && dVar.f2891s == 0) {
                        int i9 = i7;
                        gVar.V(iArr2[0], dVar.q(), 1, i9, dVar);
                        i7 = i9;
                    }
                }
                i8++;
            }
            this.f2918l = 0;
            this.f2919m = 0;
            this.f2910b = null;
            this.f2911c = 0;
            int i10 = this.f2921o;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f2920n + i11;
                if (i12 < gVar.f2926b1) {
                    d dVar2 = gVar.f2925a1[i12];
                    if (this.f2909a == 0) {
                        int q3 = dVar2.q();
                        int i13 = gVar.P0;
                        if (dVar2.f2871g0 == 8) {
                            i13 = 0;
                        }
                        this.f2918l = q3 + i13 + this.f2918l;
                        int T = gVar.T(dVar2, this.f2923q);
                        if (this.f2910b == null || this.f2911c < T) {
                            this.f2910b = dVar2;
                            this.f2911c = T;
                            this.f2919m = T;
                        }
                    } else {
                        int U = gVar.U(dVar2, this.f2923q);
                        int T2 = gVar.T(dVar2, this.f2923q);
                        int i14 = gVar.Q0;
                        if (dVar2.f2871g0 == 8) {
                            i14 = 0;
                        }
                        this.f2919m = T2 + i14 + this.f2919m;
                        if (this.f2910b == null || this.f2911c < U) {
                            this.f2910b = dVar2;
                            this.f2911c = U;
                            this.f2918l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4, int i5, int i6, int i7, int i8) {
        this.f2909a = i3;
        this.d = cVar;
        this.f2912e = cVar2;
        this.f2913f = cVar3;
        this.f2914g = cVar4;
        this.h = i4;
        this.f2915i = i5;
        this.f2916j = i6;
        this.f2917k = i7;
        this.f2923q = i8;
    }
}
