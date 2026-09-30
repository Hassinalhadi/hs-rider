package f1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends n {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // f1.n
    public final void A(long j3) {
        ArrayList arrayList;
        this.h = j3;
        if (j3 >= 0 && (arrayList = this.F) != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((n) this.F.get(i3)).A(j3);
            }
        }
    }

    @Override // f1.n
    public final void B(a.y yVar) {
        this.J |= 8;
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).B(yVar);
        }
    }

    @Override // f1.n
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((n) this.F.get(i3)).C(timeInterpolator);
            }
        }
        this.f1589i = timeInterpolator;
    }

    @Override // f1.n
    public final void D(b2.f fVar) {
        super.D(fVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i3 = 0; i3 < this.F.size(); i3++) {
                ((n) this.F.get(i3)).D(fVar);
            }
        }
    }

    @Override // f1.n
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).E();
        }
    }

    @Override // f1.n
    public final void F(long j3) {
        this.f1588g = j3;
    }

    @Override // f1.n
    public final String H(String str) {
        String H = super.H(str);
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            H = H + "\n" + ((n) this.F.get(i3)).H(str.concat("  "));
        }
        return H;
    }

    public final void I(n nVar) {
        this.F.add(nVar);
        nVar.f1594n = this;
        long j3 = this.h;
        if (j3 >= 0) {
            nVar.A(j3);
        }
        if ((this.J & 1) != 0) {
            nVar.C(this.f1589i);
        }
        if ((this.J & 2) != 0) {
            nVar.E();
        }
        if ((this.J & 4) != 0) {
            nVar.D(this.A);
        }
        if ((this.J & 8) != 0) {
            nVar.B(null);
        }
    }

    @Override // f1.n
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).c();
        }
    }

    @Override // f1.n
    public final void d(u uVar) {
        View view = uVar.f1617b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                n nVar = (n) obj;
                if (nVar.t(view)) {
                    nVar.d(uVar);
                    uVar.f1618c.add(nVar);
                }
            }
        }
    }

    @Override // f1.n
    public final void f(u uVar) {
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).f(uVar);
        }
    }

    @Override // f1.n
    public final void g(u uVar) {
        View view = uVar.f1617b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                n nVar = (n) obj;
                if (nVar.t(view)) {
                    nVar.g(uVar);
                    uVar.f1618c.add(nVar);
                }
            }
        }
    }

    @Override // f1.n
    /* renamed from: j */
    public final n clone() {
        a aVar = (a) super.clone();
        aVar.F = new ArrayList();
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            n clone = ((n) this.F.get(i3)).clone();
            aVar.F.add(clone);
            clone.f1594n = aVar;
        }
        return aVar;
    }

    @Override // f1.n
    public final void l(ViewGroup viewGroup, androidx.emoji2.text.w wVar, androidx.emoji2.text.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j3 = this.f1588g;
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) this.F.get(i3);
            if (j3 > 0 && (this.G || i3 == 0)) {
                long j4 = nVar.f1588g;
                if (j4 > 0) {
                    nVar.F(j4 + j3);
                } else {
                    nVar.F(j3);
                }
            }
            nVar.l(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    @Override // f1.n
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).w(view);
        }
    }

    @Override // f1.n
    public final n x(l lVar) {
        super.x(lVar);
        return this;
    }

    @Override // f1.n
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.F.get(i3)).y(view);
        }
    }

    @Override // f1.n
    public final void z() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        s sVar = new s();
        sVar.f1615b = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((n) obj).a(sVar);
        }
        this.H = this.F.size();
        if (!this.G) {
            int i5 = 1;
            while (true) {
                int size2 = this.F.size();
                arrayList = this.F;
                if (i5 >= size2) {
                    break;
                }
                ((n) arrayList.get(i5 - 1)).a(new s((n) this.F.get(i5)));
                i5++;
            }
            n nVar = (n) arrayList.get(0);
            if (nVar != null) {
                nVar.z();
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.F;
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            ((n) obj2).z();
        }
    }
}
