package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2970k;

    /* renamed from: l, reason: collision with root package name */
    public int f2971l;

    public c(s.d dVar, int i3) {
        super(dVar);
        s.d dVar2;
        o oVar;
        int i4;
        o oVar2;
        ArrayList arrayList = new ArrayList();
        this.f2970k = arrayList;
        this.f3004f = i3;
        s.d dVar3 = this.f3001b;
        s.d m3 = dVar3.m(i3);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m3;
            if (dVar3 == null) {
                break;
            } else {
                m3 = dVar3.m(this.f3004f);
            }
        }
        this.f3001b = dVar2;
        int i5 = this.f3004f;
        if (i5 == 0) {
            oVar = dVar2.d;
        } else if (i5 == 1) {
            oVar = dVar2.f2867e;
        } else {
            oVar = null;
        }
        arrayList.add(oVar);
        s.d l3 = dVar2.l(this.f3004f);
        while (l3 != null) {
            int i6 = this.f3004f;
            if (i6 == 0) {
                oVar2 = l3.d;
            } else if (i6 == 1) {
                oVar2 = l3.f2867e;
            } else {
                oVar2 = null;
            }
            arrayList.add(oVar2);
            l3 = l3.l(this.f3004f);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            o oVar3 = (o) obj;
            int i8 = this.f3004f;
            if (i8 == 0) {
                oVar3.f3001b.f2862b = this;
            } else if (i8 == 1) {
                oVar3.f3001b.f2864c = this;
            }
        }
        if (this.f3004f == 0 && ((s.e) this.f3001b.T).f2904v0 && arrayList.size() > 1) {
            this.f3001b = ((o) arrayList.get(arrayList.size() - 1)).f3001b;
        }
        int i9 = this.f3004f;
        s.d dVar4 = this.f3001b;
        if (i9 == 0) {
            i4 = dVar4.f2874i0;
        } else {
            i4 = dVar4.f2876j0;
        }
        this.f2971l = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(t.d r28) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.a(t.d):void");
    }

    @Override // t.o
    public final void d() {
        ArrayList arrayList = this.f2970k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        s.d dVar = ((o) arrayList.get(0)).f3001b;
        s.d dVar2 = ((o) arrayList.get(size2 - 1)).f3001b;
        int i4 = this.f3004f;
        f fVar = this.f3006i;
        f fVar2 = this.h;
        if (i4 == 0) {
            s.c cVar = dVar.I;
            s.c cVar2 = dVar2.K;
            f i5 = o.i(cVar, 0);
            int e3 = cVar.e();
            s.d m3 = m();
            if (m3 != null) {
                e3 = m3.I.e();
            }
            if (i5 != null) {
                o.b(fVar2, i5, e3);
            }
            f i6 = o.i(cVar2, 0);
            int e4 = cVar2.e();
            s.d n2 = n();
            if (n2 != null) {
                e4 = n2.K.e();
            }
            if (i6 != null) {
                o.b(fVar, i6, -e4);
            }
        } else {
            s.c cVar3 = dVar.J;
            s.c cVar4 = dVar2.L;
            f i7 = o.i(cVar3, 1);
            int e5 = cVar3.e();
            s.d m4 = m();
            if (m4 != null) {
                e5 = m4.J.e();
            }
            if (i7 != null) {
                o.b(fVar2, i7, e5);
            }
            f i8 = o.i(cVar4, 1);
            int e6 = cVar4.e();
            s.d n3 = n();
            if (n3 != null) {
                e6 = n3.L.e();
            }
            if (i8 != null) {
                o.b(fVar, i8, -e6);
            }
        }
        fVar2.f2978a = this;
        fVar.f2978a = this;
    }

    @Override // t.o
    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2970k;
            if (i3 < arrayList.size()) {
                ((o) arrayList.get(i3)).e();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f3002c = null;
        ArrayList arrayList = this.f2970k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((o) obj).f();
        }
    }

    @Override // t.o
    public final long j() {
        ArrayList arrayList = this.f2970k;
        int size = arrayList.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j3 = r4.f3006i.f2982f + ((o) arrayList.get(i3)).j() + j3 + r4.h.f2982f;
        }
        return j3;
    }

    @Override // t.o
    public final boolean k() {
        ArrayList arrayList = this.f2970k;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((o) arrayList.get(i3)).k()) {
                return false;
            }
        }
        return true;
    }

    public final s.d m() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2970k;
            if (i3 < arrayList.size()) {
                s.d dVar = ((o) arrayList.get(i3)).f3001b;
                if (dVar.f2871g0 != 8) {
                    return dVar;
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    public final s.d n() {
        ArrayList arrayList = this.f2970k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s.d dVar = ((o) arrayList.get(size)).f3001b;
            if (dVar.f2871g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f3004f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.f2970k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
