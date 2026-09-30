package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f2988m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f2981e = 2;
        } else {
            this.f2981e = 3;
        }
    }

    @Override // t.f
    public final void d(int i3) {
        if (!this.f2985j) {
            this.f2985j = true;
            this.f2983g = i3;
            ArrayList arrayList = this.f2986k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }
}
