package s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f2943a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(s.e r40, q.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.a(s.e, q.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, q.c cVar, d dVar) {
        dVar.f2885o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f2888p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f2887p = -1;
        int[] iArr2 = eVar.f2888p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i3 = cVar6.f2859g;
            int q3 = eVar.q() - cVar5.f2859g;
            cVar6.f2860i = cVar.k(cVar6);
            cVar5.f2860i = cVar.k(cVar5);
            cVar.d(cVar6.f2860i, i3);
            cVar.d(cVar5.f2860i, q3);
            dVar.f2885o = 2;
            dVar.Y = i3;
            int i4 = q3 - i3;
            dVar.U = i4;
            int i5 = dVar.f2863b0;
            if (i4 < i5) {
                dVar.U = i5;
            }
        }
        if (iArr2[1] != 2 && iArr[1] == 4) {
            int i6 = cVar4.f2859g;
            int k3 = eVar.k() - cVar3.f2859g;
            cVar4.f2860i = cVar.k(cVar4);
            cVar3.f2860i = cVar.k(cVar3);
            cVar.d(cVar4.f2860i, i6);
            cVar.d(cVar3.f2860i, k3);
            if (dVar.a0 > 0 || dVar.f2871g0 == 8) {
                q.f k4 = cVar.k(cVar2);
                cVar2.f2860i = k4;
                cVar.d(k4, dVar.a0 + i6);
            }
            dVar.f2887p = 2;
            dVar.Z = i6;
            int i7 = k3 - i6;
            dVar.V = i7;
            int i8 = dVar.f2865c0;
            if (i7 < i8) {
                dVar.V = i8;
            }
        }
    }

    public static final boolean c(int i3, int i4) {
        if ((i3 & i4) == i4) {
            return true;
        }
        return false;
    }
}
