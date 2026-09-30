package b0;

import android.graphics.Color;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f668a;

    /* renamed from: b, reason: collision with root package name */
    public final float f669b;

    /* renamed from: c, reason: collision with root package name */
    public final float f670c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f671e;

    /* renamed from: f, reason: collision with root package name */
    public final float f672f;

    public a(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f668a = f3;
        this.f669b = f4;
        this.f670c = f5;
        this.d = f6;
        this.f671e = f7;
        this.f672f = f8;
    }

    public static a a(int i3) {
        float f3;
        m mVar = m.f699k;
        float e3 = b.e(Color.red(i3));
        float e4 = b.e(Color.green(i3));
        float e5 = b.e(Color.blue(i3));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[2] * e5) + (fArr2[1] * e4) + (fArr2[0] * e3);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[2] * e5) + (fArr3[1] * e4) + (fArr3[0] * e3);
        float[] fArr4 = fArr[2];
        float f6 = (e5 * fArr4[2]) + (e4 * fArr4[1]) + (e3 * fArr4[0]);
        float[][] fArr5 = b.f673a;
        float[] fArr6 = fArr5[0];
        float f7 = (fArr6[2] * f6) + (fArr6[1] * f5) + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f8 = (fArr7[2] * f6) + (fArr7[1] * f5) + (fArr7[0] * f4);
        float[] fArr8 = fArr5[2];
        float f9 = (f6 * fArr8[2]) + (f5 * fArr8[1]) + (f4 * fArr8[0]);
        float[] fArr9 = mVar.f705g;
        float f10 = mVar.f706i;
        float f11 = mVar.d;
        float f12 = mVar.f700a;
        float f13 = fArr9[0] * f7;
        float f14 = fArr9[1] * f8;
        float f15 = fArr9[2] * f9;
        float f16 = mVar.h;
        float pow = (float) Math.pow((Math.abs(f13) * f16) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f15) * f16) / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f17 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * mVar.f701b) / f12, mVar.f707j * f11)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f23 = f12 + 4.0f;
        if (atan2 < 20.14d) {
            f3 = 360.0f + atan2;
        } else {
            f3 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f704f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f3 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f703e) * mVar.f702c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f11) / f23);
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f10 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f22;
        return new a(atan2, pow5, pow4, f24, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static a b(float f3, float f4, float f5) {
        m mVar = m.f699k;
        float f6 = mVar.d;
        Math.sqrt(f3 / 100.0d);
        float f7 = mVar.f700a + 4.0f;
        float f8 = mVar.f706i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(r1))) * mVar.d) / f7);
        float f9 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((f8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f3, f9, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(m mVar) {
        float f3;
        float f4 = this.f669b;
        double d = f4;
        float f5 = this.f670c;
        if (d != 0.0d) {
            double d3 = f5;
            if (d3 != 0.0d) {
                f3 = f4 / ((float) Math.sqrt(d3 / 100.0d));
                float f6 = mVar.f704f;
                float f7 = mVar.h;
                float pow = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f6), 0.73d), 1.1111111111111112d);
                double d4 = (this.f668a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
                float pow2 = mVar.f700a * ((float) Math.pow(f5 / 100.0d, (1.0d / mVar.d) / mVar.f707j));
                float f8 = cos * 3846.1538f * mVar.f703e * mVar.f702c;
                float f9 = pow2 / mVar.f701b;
                float sin = (float) Math.sin(d4);
                float cos2 = (float) Math.cos(d4);
                float f10 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f8 * 23.0f)));
                float f11 = cos2 * f10;
                float f12 = f10 * sin;
                float f13 = f9 * 460.0f;
                float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
                float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
                float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
                float f17 = 100.0f / f7;
                float signum = Math.signum(f14) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float signum2 = Math.signum(f15) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float signum3 = Math.signum(f16) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
                float[] fArr = mVar.f705g;
                float f18 = signum / fArr[0];
                float f19 = signum2 / fArr[1];
                float f20 = signum3 / fArr[2];
                float[][] fArr2 = b.f674b;
                float[] fArr3 = fArr2[0];
                float f21 = (fArr3[2] * f20) + (fArr3[1] * f19) + (fArr3[0] * f18);
                float[] fArr4 = fArr2[1];
                float f22 = (fArr4[2] * f20) + (fArr4[1] * f19) + (fArr4[0] * f18);
                float[] fArr5 = fArr2[2];
                return c0.a.a(f21, f22, (f20 * fArr5[2]) + (f19 * fArr5[1]) + (f18 * fArr5[0]));
            }
        }
        f3 = 0.0f;
        float f62 = mVar.f704f;
        float f72 = mVar.h;
        float pow3 = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f62), 0.73d), 1.1111111111111112d);
        double d42 = (this.f668a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d42) + 3.8d)) * 0.25f;
        float pow22 = mVar.f700a * ((float) Math.pow(f5 / 100.0d, (1.0d / mVar.d) / mVar.f707j));
        float f82 = cos3 * 3846.1538f * mVar.f703e * mVar.f702c;
        float f92 = pow22 / mVar.f701b;
        float sin2 = (float) Math.sin(d42);
        float cos22 = (float) Math.cos(d42);
        float f102 = (((0.305f + f92) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f82 * 23.0f)));
        float f112 = cos22 * f102;
        float f122 = f102 * sin2;
        float f132 = f92 * 460.0f;
        float f142 = ((288.0f * f122) + ((451.0f * f112) + f132)) / 1403.0f;
        float f152 = ((f132 - (891.0f * f112)) - (261.0f * f122)) / 1403.0f;
        float f162 = ((f132 - (f112 * 220.0f)) - (f122 * 6300.0f)) / 1403.0f;
        float f172 = 100.0f / f72;
        float signum4 = Math.signum(f142) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float signum22 = Math.signum(f152) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float signum32 = Math.signum(f162) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d));
        float[] fArr6 = mVar.f705g;
        float f182 = signum4 / fArr6[0];
        float f192 = signum22 / fArr6[1];
        float f202 = signum32 / fArr6[2];
        float[][] fArr22 = b.f674b;
        float[] fArr32 = fArr22[0];
        float f212 = (fArr32[2] * f202) + (fArr32[1] * f192) + (fArr32[0] * f182);
        float[] fArr42 = fArr22[1];
        float f222 = (fArr42[2] * f202) + (fArr42[1] * f192) + (fArr42[0] * f182);
        float[] fArr52 = fArr22[2];
        return c0.a.a(f212, f222, (f202 * fArr52[2]) + (f192 * fArr52[1]) + (f182 * fArr52[0]));
    }
}
