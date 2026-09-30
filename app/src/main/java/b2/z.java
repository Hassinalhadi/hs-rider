package b2;

import android.util.StateSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f1070a;

    /* renamed from: b, reason: collision with root package name */
    public n f1071b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f1072c;
    public n[] d;

    /* renamed from: e, reason: collision with root package name */
    public y f1073e;

    /* renamed from: f, reason: collision with root package name */
    public y f1074f;

    /* renamed from: g, reason: collision with root package name */
    public y f1075g;
    public y h;

    public z(n nVar) {
        b();
        a(StateSet.WILD_CARD, nVar);
    }

    public final void a(int[] iArr, n nVar) {
        int i3 = this.f1070a;
        if (i3 == 0 || iArr.length == 0) {
            this.f1071b = nVar;
        }
        int[][] iArr2 = this.f1072c;
        if (i3 >= iArr2.length) {
            int i4 = i3 + 10;
            int[][] iArr3 = new int[i4];
            System.arraycopy(iArr2, 0, iArr3, 0, i3);
            this.f1072c = iArr3;
            n[] nVarArr = new n[i4];
            System.arraycopy(this.d, 0, nVarArr, 0, i3);
            this.d = nVarArr;
        }
        int[][] iArr4 = this.f1072c;
        int i5 = this.f1070a;
        iArr4[i5] = iArr;
        this.d[i5] = nVar;
        this.f1070a = i5 + 1;
    }

    public final void b() {
        this.f1071b = new n();
        this.f1072c = new int[10];
        this.d = new n[10];
    }
}
