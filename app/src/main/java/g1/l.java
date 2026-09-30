package g1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public c0.d[] f1843a;

    /* renamed from: b, reason: collision with root package name */
    public String f1844b;

    /* renamed from: c, reason: collision with root package name */
    public int f1845c;

    public l(l lVar) {
        this.f1843a = null;
        this.f1845c = 0;
        this.f1844b = lVar.f1844b;
        c0.d[] dVarArr = lVar.f1843a;
        c0.d[] dVarArr2 = new c0.d[dVarArr.length];
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            dVarArr2[i3] = new c0.d(dVarArr[i3]);
        }
        this.f1843a = dVarArr2;
    }

    public c0.d[] getPathData() {
        return this.f1843a;
    }

    public String getPathName() {
        return this.f1844b;
    }

    public void setPathData(c0.d[] dVarArr) {
        c0.d[] dVarArr2 = this.f1843a;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            for (int i3 = 0; i3 < dVarArr2.length; i3++) {
                c0.d dVar = dVarArr2[i3];
                char c3 = dVar.f1086a;
                c0.d dVar2 = dVarArr[i3];
                if (c3 == dVar2.f1086a && dVar.f1087b.length == dVar2.f1087b.length) {
                }
            }
            c0.d[] dVarArr3 = this.f1843a;
            for (int i4 = 0; i4 < dVarArr.length; i4++) {
                dVarArr3[i4].f1086a = dVarArr[i4].f1086a;
                int i5 = 0;
                while (true) {
                    float[] fArr = dVarArr[i4].f1087b;
                    if (i5 < fArr.length) {
                        dVarArr3[i4].f1087b[i5] = fArr[i5];
                        i5++;
                    }
                }
            }
            return;
        }
        c0.d[] dVarArr4 = new c0.d[dVarArr.length];
        for (int i6 = 0; i6 < dVarArr.length; i6++) {
            dVarArr4[i6] = new c0.d(dVarArr[i6]);
        }
        this.f1843a = dVarArr4;
    }

    public l() {
        this.f1843a = null;
        this.f1845c = 0;
    }
}
