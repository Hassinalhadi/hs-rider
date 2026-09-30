package t;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (!fVar.f2980c || fVar.f2985j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f2987l.get(0)).f2983g * ((s.h) this.f3001b).f2935q0) + 0.5f));
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3001b;
        s.h hVar = (s.h) dVar;
        int i3 = hVar.f2936r0;
        int i4 = hVar.f2937s0;
        int i5 = hVar.f2939u0;
        f fVar = this.h;
        if (i5 == 1) {
            if (i3 != -1) {
                fVar.f2987l.add(dVar.T.d.h);
                this.f3001b.T.d.h.f2986k.add(fVar);
                fVar.f2982f = i3;
            } else if (i4 != -1) {
                fVar.f2987l.add(dVar.T.d.f3006i);
                this.f3001b.T.d.f3006i.f2986k.add(fVar);
                fVar.f2982f = -i4;
            } else {
                fVar.f2979b = true;
                fVar.f2987l.add(dVar.T.d.f3006i);
                this.f3001b.T.d.f3006i.f2986k.add(fVar);
            }
            m(this.f3001b.d.h);
            m(this.f3001b.d.f3006i);
            return;
        }
        if (i3 != -1) {
            fVar.f2987l.add(dVar.T.f2867e.h);
            this.f3001b.T.f2867e.h.f2986k.add(fVar);
            fVar.f2982f = i3;
        } else if (i4 != -1) {
            fVar.f2987l.add(dVar.T.f2867e.f3006i);
            this.f3001b.T.f2867e.f3006i.f2986k.add(fVar);
            fVar.f2982f = -i4;
        } else {
            fVar.f2979b = true;
            fVar.f2987l.add(dVar.T.f2867e.f3006i);
            this.f3001b.T.f2867e.f3006i.f2986k.add(fVar);
        }
        m(this.f3001b.f2867e.h);
        m(this.f3001b.f2867e.f3006i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3001b;
        int i3 = ((s.h) dVar).f2939u0;
        f fVar = this.h;
        if (i3 == 1) {
            dVar.Y = fVar.f2983g;
        } else {
            dVar.Z = fVar.f2983g;
        }
    }

    @Override // t.o
    public final void f() {
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
