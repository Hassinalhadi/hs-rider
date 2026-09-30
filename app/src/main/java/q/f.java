package q;

import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2737f;

    /* renamed from: j, reason: collision with root package name */
    public float f2740j;

    /* renamed from: q, reason: collision with root package name */
    public int f2747q;

    /* renamed from: g, reason: collision with root package name */
    public int f2738g = -1;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2739i = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2741k = false;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f2742l = new float[9];

    /* renamed from: m, reason: collision with root package name */
    public final float[] f2743m = new float[9];

    /* renamed from: n, reason: collision with root package name */
    public b[] f2744n = new b[16];

    /* renamed from: o, reason: collision with root package name */
    public int f2745o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2746p = 0;

    public f(int i3) {
        this.f2747q = i3;
    }

    public final void a(b bVar) {
        int i3 = 0;
        while (true) {
            int i4 = this.f2745o;
            b[] bVarArr = this.f2744n;
            if (i3 < i4) {
                if (bVarArr[i3] == bVar) {
                    return;
                } else {
                    i3++;
                }
            } else {
                if (i4 >= bVarArr.length) {
                    this.f2744n = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2744n;
                int i5 = this.f2745o;
                bVarArr2[i5] = bVar;
                this.f2745o = i5 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i3 = this.f2745o;
        int i4 = 0;
        while (i4 < i3) {
            if (this.f2744n[i4] == bVar) {
                while (i4 < i3 - 1) {
                    b[] bVarArr = this.f2744n;
                    int i5 = i4 + 1;
                    bVarArr[i4] = bVarArr[i5];
                    i4 = i5;
                }
                this.f2745o--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f2747q = 5;
        this.f2739i = 0;
        this.f2738g = -1;
        this.h = -1;
        this.f2740j = 0.0f;
        this.f2741k = false;
        int i3 = this.f2745o;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f2744n[i4] = null;
        }
        this.f2745o = 0;
        this.f2746p = 0;
        this.f2737f = false;
        Arrays.fill(this.f2743m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2738g - ((f) obj).f2738g;
    }

    public final void d(c cVar, float f3) {
        this.f2740j = f3;
        this.f2741k = true;
        int i3 = this.f2745o;
        this.h = -1;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f2744n[i4].h(cVar, this, false);
        }
        this.f2745o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i3 = this.f2745o;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f2744n[i4].i(cVar, bVar, false);
        }
        this.f2745o = 0;
    }

    public final String toString() {
        return "" + this.f2738g;
    }
}
