package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.d
    public final void a(d dVar) {
        s.a aVar = (s.a) this.f3001b;
        int i3 = aVar.f2835s0;
        f fVar = this.h;
        ArrayList arrayList = fVar.f2987l;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i7 = ((f) obj).f2983g;
            if (i5 == -1 || i7 < i5) {
                i5 = i7;
            }
            if (i4 < i7) {
                i4 = i7;
            }
        }
        if (i3 != 0 && i3 != 2) {
            fVar.d(i4 + aVar.f2837u0);
        } else {
            fVar.d(i5 + aVar.f2837u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3001b;
        if (dVar instanceof s.a) {
            f fVar = this.h;
            fVar.f2979b = true;
            ArrayList arrayList = fVar.f2987l;
            s.a aVar = (s.a) dVar;
            int i3 = aVar.f2835s0;
            boolean z2 = aVar.f2836t0;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            fVar.f2981e = 7;
                            while (i4 < aVar.f2942r0) {
                                s.d dVar2 = aVar.f2941q0[i4];
                                if (z2 || dVar2.f2871g0 != 8) {
                                    f fVar2 = dVar2.f2867e.f3006i;
                                    fVar2.f2986k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i4++;
                            }
                            m(this.f3001b.f2867e.h);
                            m(this.f3001b.f2867e.f3006i);
                            return;
                        }
                        return;
                    }
                    fVar.f2981e = 6;
                    while (i4 < aVar.f2942r0) {
                        s.d dVar3 = aVar.f2941q0[i4];
                        if (z2 || dVar3.f2871g0 != 8) {
                            f fVar3 = dVar3.f2867e.h;
                            fVar3.f2986k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i4++;
                    }
                    m(this.f3001b.f2867e.h);
                    m(this.f3001b.f2867e.f3006i);
                    return;
                }
                fVar.f2981e = 5;
                while (i4 < aVar.f2942r0) {
                    s.d dVar4 = aVar.f2941q0[i4];
                    if (z2 || dVar4.f2871g0 != 8) {
                        f fVar4 = dVar4.d.f3006i;
                        fVar4.f2986k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i4++;
                }
                m(this.f3001b.d.h);
                m(this.f3001b.d.f3006i);
                return;
            }
            fVar.f2981e = 4;
            while (i4 < aVar.f2942r0) {
                s.d dVar5 = aVar.f2941q0[i4];
                if (z2 || dVar5.f2871g0 != 8) {
                    f fVar5 = dVar5.d.h;
                    fVar5.f2986k.add(fVar);
                    arrayList.add(fVar5);
                }
                i4++;
            }
            m(this.f3001b.d.h);
            m(this.f3001b.d.f3006i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3001b;
        if (dVar instanceof s.a) {
            int i3 = ((s.a) dVar).f2835s0;
            f fVar = this.h;
            if (i3 != 0 && i3 != 1) {
                dVar.Z = fVar.f2983g;
            } else {
                dVar.Y = fVar.f2983g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f3002c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f2986k.add(fVar);
        fVar.f2987l.add(fVar2);
    }
}
