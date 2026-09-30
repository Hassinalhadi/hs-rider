package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f2991a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2992b;

    public static long a(f fVar, long j3) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f2986k;
        if (oVar instanceof j) {
            return j3;
        }
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j4 = Math.min(j4, a(fVar2, fVar2.f2982f + j3));
                }
            }
        }
        f fVar3 = oVar.f3006i;
        f fVar4 = oVar.h;
        if (fVar == fVar3) {
            long j5 = j3 - oVar.j();
            return Math.min(Math.min(j4, a(fVar4, j5)), j5 - fVar4.f2982f);
        }
        return j4;
    }

    public static long b(f fVar, long j3) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.f2986k;
        if (oVar instanceof j) {
            return j3;
        }
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j4 = Math.max(j4, b(fVar2, fVar2.f2982f + j3));
                }
            }
        }
        f fVar3 = oVar.h;
        f fVar4 = oVar.f3006i;
        if (fVar == fVar3) {
            long j5 = oVar.j() + j3;
            return Math.max(Math.max(j4, b(fVar4, j5)), j5 - fVar4.f2982f);
        }
        return j4;
    }
}
