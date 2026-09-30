package t;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f3000a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f3001b;

    /* renamed from: c, reason: collision with root package name */
    public l f3002c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3003e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3004f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3005g = false;
    public final f h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f3006i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3007j = 1;

    public o(s.d dVar) {
        this.f3001b = dVar;
    }

    public static void b(f fVar, f fVar2, int i3) {
        fVar.f2987l.add(fVar2);
        fVar.f2982f = i3;
        fVar2.f2986k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f2858f;
        if (cVar2 != null) {
            s.d dVar = cVar2.d;
            int a3 = q.e.a(cVar2.f2857e);
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 != 3) {
                        if (a3 != 4) {
                            if (a3 != 5) {
                                return null;
                            }
                            return dVar.f2867e.f2993k;
                        }
                        return dVar.f2867e.f3006i;
                    }
                    return dVar.d.f3006i;
                }
                return dVar.f2867e.h;
            }
            return dVar.d.h;
        }
        return null;
    }

    public static f i(s.c cVar, int i3) {
        o oVar;
        s.c cVar2 = cVar.f2858f;
        if (cVar2 != null) {
            s.d dVar = cVar2.d;
            if (i3 == 0) {
                oVar = dVar.d;
            } else {
                oVar = dVar.f2867e;
            }
            int a3 = q.e.a(cVar2.f2857e);
            if (a3 != 1 && a3 != 2) {
                if (a3 != 3 && a3 != 4) {
                    return null;
                }
                return oVar.f3006i;
            }
            return oVar.h;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i3, g gVar) {
        fVar.f2987l.add(fVar2);
        fVar.f2987l.add(this.f3003e);
        fVar.h = i3;
        fVar.f2984i = gVar;
        fVar2.f2986k.add(fVar);
        gVar.f2986k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i3, int i4) {
        s.d dVar = this.f3001b;
        if (i4 == 0) {
            int i5 = dVar.f2894v;
            int max = Math.max(dVar.f2893u, i3);
            if (i5 > 0) {
                max = Math.min(i5, i3);
            }
            if (max != i3) {
                return max;
            }
        } else {
            int i6 = dVar.f2897y;
            int max2 = Math.max(dVar.f2896x, i3);
            if (i6 > 0) {
                max2 = Math.min(i6, i3);
            }
            if (max2 != i3) {
                return max2;
            }
        }
        return i3;
    }

    public long j() {
        if (this.f3003e.f2985j) {
            return r2.f2983g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3000a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(s.c r12, s.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o.l(s.c, s.c, int):void");
    }
}
