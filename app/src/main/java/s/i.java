package s;

import java.util.ArrayList;
import t.n;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f2941q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f2942r0 = 0;

    public final void R(int i3, ArrayList arrayList, n nVar) {
        for (int i4 = 0; i4 < this.f2942r0; i4++) {
            d dVar = this.f2941q0[i4];
            ArrayList arrayList2 = nVar.f2996a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i5 = 0; i5 < this.f2942r0; i5++) {
            t.h.b(this.f2941q0[i5], i3, arrayList, nVar);
        }
    }

    public void S() {
    }
}
