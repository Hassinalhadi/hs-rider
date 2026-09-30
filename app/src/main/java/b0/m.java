package b0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f699k;

    /* renamed from: a, reason: collision with root package name */
    public final float f700a;

    /* renamed from: b, reason: collision with root package name */
    public final float f701b;

    /* renamed from: c, reason: collision with root package name */
    public final float f702c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f703e;

    /* renamed from: f, reason: collision with root package name */
    public final float f704f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f705g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f706i;

    /* renamed from: j, reason: collision with root package name */
    public final float f707j;

    static {
        float f3;
        float l3 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f675c;
        float f4 = fArr[0];
        float[][] fArr2 = b.f673a;
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f4 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f3 = 0.69f;
        } else {
            f3 = 0.655f;
        }
        float f12 = f3;
        float exp = (1.0f - (((float) Math.exp(((-l3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f13 = 1.0f / ((5.0f * l3) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(l3 * 5.0d))) + (f14 * l3);
        float l4 = b.l() / fArr[1];
        double d3 = l4;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr6[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[2];
        float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f699k = new m(l4, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f12, 1.0f, new float[]{(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f704f = f3;
        this.f700a = f4;
        this.f701b = f5;
        this.f702c = f6;
        this.d = f7;
        this.f703e = f8;
        this.f705g = fArr;
        this.h = f9;
        this.f706i = f10;
        this.f707j = f11;
    }
}
