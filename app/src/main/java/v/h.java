package v;

import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3085a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3086b;

    /* renamed from: c, reason: collision with root package name */
    public int f3087c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3088e;

    /* renamed from: f, reason: collision with root package name */
    public int f3089f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3090g;
    public String[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f3091i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3092j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3093k;

    /* renamed from: l, reason: collision with root package name */
    public int f3094l;

    public final void a(int i3, float f3) {
        int i4 = this.f3089f;
        int[] iArr = this.d;
        if (i4 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3088e;
            this.f3088e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i5 = this.f3089f;
        iArr2[i5] = i3;
        float[] fArr2 = this.f3088e;
        this.f3089f = i5 + 1;
        fArr2[i5] = f3;
    }

    public final void b(int i3, int i4) {
        int i5 = this.f3087c;
        int[] iArr = this.f3085a;
        if (i5 >= iArr.length) {
            this.f3085a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3086b;
            this.f3086b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3085a;
        int i6 = this.f3087c;
        iArr3[i6] = i3;
        int[] iArr4 = this.f3086b;
        this.f3087c = i6 + 1;
        iArr4[i6] = i4;
    }

    public final void c(int i3, boolean z2) {
        int i4 = this.f3094l;
        int[] iArr = this.f3092j;
        if (i4 >= iArr.length) {
            this.f3092j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3093k;
            this.f3093k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3092j;
        int i5 = this.f3094l;
        iArr2[i5] = i3;
        boolean[] zArr2 = this.f3093k;
        this.f3094l = i5 + 1;
        zArr2[i5] = z2;
    }

    public final void d(String str, int i3) {
        int i4 = this.f3091i;
        int[] iArr = this.f3090g;
        if (i4 >= iArr.length) {
            this.f3090g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3090g;
        int i5 = this.f3091i;
        iArr2[i5] = i3;
        String[] strArr2 = this.h;
        this.f3091i = i5 + 1;
        strArr2[i5] = str;
    }
}
