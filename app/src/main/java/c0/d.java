package c0;

import a.y;
import android.graphics.Path;
import android.util.Log;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public char f1086a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1087b;

    public d(d dVar) {
        this.f1086a = dVar.f1086a;
        float[] fArr = dVar.f1087b;
        this.f1087b = y.v(fArr, fArr.length);
    }

    public static void a(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z2, boolean z3) {
        double d;
        double d3;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = f3;
        double d5 = f4;
        double d6 = f7;
        double d7 = ((d5 * sin) + (d4 * cos)) / d6;
        double d8 = f8;
        double d9 = ((d5 * cos) + ((-f3) * sin)) / d8;
        double d10 = f6;
        double d11 = ((d10 * sin) + (f5 * cos)) / d6;
        double d12 = ((d10 * cos) + ((-f5) * sin)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d14 * d14) + (d13 * d13);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d17);
            float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
            a(path, f3, f4, f5, f6, f7 * sqrt, sqrt * f8, f9, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d18);
        double d19 = sqrt2 * d13;
        double d20 = sqrt2 * d14;
        if (z2 == z3) {
            d = d15 - d20;
            d3 = d16 + d19;
        } else {
            d = d15 + d20;
            d3 = d16 - d19;
        }
        double atan2 = Math.atan2(d9 - d3, d7 - d);
        double atan22 = Math.atan2(d12 - d3, d11 - d) - atan2;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d21 = d * d6;
        double d22 = d3 * d8;
        double d23 = (d21 * cos) - (d22 * sin);
        double d24 = (d22 * cos) + (d21 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d25 = -d6;
        double d26 = d25 * cos2;
        double d27 = d8 * sin2;
        double d28 = (d26 * sin3) - (d27 * cos3);
        double d29 = d25 * sin2;
        double d30 = d8 * cos2;
        double d31 = atan22 / ceil;
        double d32 = (cos3 * d30) + (sin3 * d29);
        double d33 = d4;
        double d34 = d5;
        int i3 = 0;
        double d35 = atan2;
        while (i3 < ceil) {
            double d36 = d35 + d31;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            int i4 = ceil;
            double d37 = (((d6 * cos2) * cos4) + d23) - (d27 * sin4);
            double d38 = (d30 * sin4) + (d6 * sin2 * cos4) + d24;
            double d39 = (d26 * sin4) - (d27 * cos4);
            double d40 = (cos4 * d30) + (sin4 * d29);
            double d41 = d36 - d35;
            double tan = Math.tan(d41 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d41)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * sqrt3) + d33), (float) ((d32 * sqrt3) + d34), (float) (d37 - (sqrt3 * d39)), (float) (d38 - (sqrt3 * d40)), (float) d37, (float) d38);
            i3++;
            d34 = d38;
            cos2 = cos2;
            d29 = d29;
            d35 = d36;
            d32 = d40;
            d33 = d37;
            ceil = i4;
            d28 = d39;
            d31 = d31;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i3;
        float[] fArr;
        int i4;
        d dVar;
        int i5;
        char c3;
        boolean z2;
        boolean z3;
        float f3;
        float f4;
        d dVar2;
        boolean z4;
        boolean z5;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i6 = 0;
        int i7 = 0;
        char c4 = 'm';
        while (i7 < length) {
            d dVar3 = dVarArr2[i7];
            char c5 = dVar3.f1086a;
            float[] fArr3 = dVar3.f1087b;
            float f13 = fArr2[i6];
            float f14 = fArr2[1];
            float f15 = fArr2[2];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            int i8 = i6;
            float f18 = fArr2[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    break;
            }
            i3 = 2;
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i9 = i8;
            while (i9 < fArr3.length) {
                if (c5 != 'A') {
                    if (c5 != 'C') {
                        if (c5 != 'H') {
                            if (c5 != 'Q') {
                                if (c5 != 'V') {
                                    if (c5 != 'a') {
                                        if (c5 != 'c') {
                                            if (c5 != 'h') {
                                                if (c5 != 'q') {
                                                    if (c5 != 'v') {
                                                        if (c5 != 'L') {
                                                            if (c5 != 'M') {
                                                                if (c5 != 'S') {
                                                                    if (c5 != 'T') {
                                                                        if (c5 != 'l') {
                                                                            if (c5 != 'm') {
                                                                                if (c5 != 's') {
                                                                                    if (c5 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i4 = i9;
                                                                                        dVar = dVar3;
                                                                                        f4 = f21;
                                                                                    } else {
                                                                                        if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                            f12 = 0.0f;
                                                                                            f11 = 0.0f;
                                                                                        } else {
                                                                                            f11 = f21 - f15;
                                                                                            f12 = f22 - f16;
                                                                                        }
                                                                                        int i10 = i9 + 1;
                                                                                        path2.rQuadTo(f11, f12, fArr3[i9], fArr3[i10]);
                                                                                        float f23 = f11 + f21;
                                                                                        float f24 = f12 + f22;
                                                                                        float f25 = f21 + fArr3[i9];
                                                                                        f22 += fArr3[i10];
                                                                                        f16 = f24;
                                                                                        fArr = fArr3;
                                                                                        i4 = i9;
                                                                                        dVar = dVar3;
                                                                                        f4 = f25;
                                                                                        f15 = f23;
                                                                                    }
                                                                                    f3 = f22;
                                                                                } else {
                                                                                    if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                                        f10 = 0.0f;
                                                                                        f9 = 0.0f;
                                                                                    } else {
                                                                                        f9 = f22 - f16;
                                                                                        f10 = f21 - f15;
                                                                                    }
                                                                                    int i11 = i9;
                                                                                    int i12 = i11 + 1;
                                                                                    int i13 = i11 + 2;
                                                                                    int i14 = i11 + 3;
                                                                                    fArr = fArr3;
                                                                                    i4 = i11;
                                                                                    path2.rCubicTo(f10, f9, fArr3[i11], fArr3[i12], fArr3[i13], fArr3[i14]);
                                                                                    f5 = fArr[i4] + f21;
                                                                                    f6 = fArr[i12] + f22;
                                                                                    f21 += fArr[i13];
                                                                                    f7 = fArr[i14];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i4 = i9;
                                                                                float f26 = fArr[i4];
                                                                                f21 += f26;
                                                                                float f27 = fArr[i4 + 1];
                                                                                f22 += f27;
                                                                                if (i4 > 0) {
                                                                                    path2.rLineTo(f26, f27);
                                                                                } else {
                                                                                    path2.rMoveTo(f26, f27);
                                                                                    dVar = dVar3;
                                                                                    f4 = f21;
                                                                                    f19 = f4;
                                                                                    f3 = f22;
                                                                                    f20 = f3;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i4 = i9;
                                                                            int i15 = i4 + 1;
                                                                            path2.rLineTo(fArr[i4], fArr[i15]);
                                                                            f21 += fArr[i4];
                                                                            f8 = fArr[i15];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i4 = i9;
                                                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                                            f21 = (f21 * 2.0f) - f15;
                                                                            f22 = (f22 * 2.0f) - f16;
                                                                        }
                                                                        int i16 = i4 + 1;
                                                                        path2.quadTo(f21, f22, fArr[i4], fArr[i16]);
                                                                        f4 = fArr[i4];
                                                                        f3 = fArr[i16];
                                                                        dVar = dVar3;
                                                                        f15 = f21;
                                                                        f16 = f22;
                                                                    }
                                                                    i5 = i7;
                                                                    c3 = c5;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i4 = i9;
                                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                                        f21 = (f21 * 2.0f) - f15;
                                                                        f22 = (f22 * 2.0f) - f16;
                                                                    }
                                                                    float f28 = f21;
                                                                    float f29 = f22;
                                                                    int i17 = i4 + 1;
                                                                    int i18 = i4 + 2;
                                                                    int i19 = i4 + 3;
                                                                    path2.cubicTo(f28, f29, fArr[i4], fArr[i17], fArr[i18], fArr[i19]);
                                                                    float f30 = fArr[i4];
                                                                    f15 = f30;
                                                                    f16 = fArr[i17];
                                                                    f4 = fArr[i18];
                                                                    f3 = fArr[i19];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i4 = i9;
                                                                f4 = fArr[i4];
                                                                f3 = fArr[i4 + 1];
                                                                if (i4 > 0) {
                                                                    path2.lineTo(f4, f3);
                                                                } else {
                                                                    path2.moveTo(f4, f3);
                                                                    f19 = f4;
                                                                    f20 = f3;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i4 = i9;
                                                            int i20 = i4 + 1;
                                                            path2.lineTo(fArr[i4], fArr[i20]);
                                                            f4 = fArr[i4];
                                                            f3 = fArr[i20];
                                                        }
                                                        i5 = i7;
                                                        dVar = dVar3;
                                                        c3 = c5;
                                                    } else {
                                                        fArr = fArr3;
                                                        i4 = i9;
                                                        path2.rLineTo(0.0f, fArr[i4]);
                                                        f8 = fArr[i4];
                                                    }
                                                    f22 += f8;
                                                } else {
                                                    fArr = fArr3;
                                                    i4 = i9;
                                                    int i21 = i4 + 1;
                                                    int i22 = i4 + 2;
                                                    int i23 = i4 + 3;
                                                    path2.rQuadTo(fArr[i4], fArr[i21], fArr[i22], fArr[i23]);
                                                    f5 = fArr[i4] + f21;
                                                    f6 = fArr[i21] + f22;
                                                    f21 += fArr[i22];
                                                    f7 = fArr[i23];
                                                }
                                                f22 += f7;
                                                f15 = f5;
                                                f16 = f6;
                                            } else {
                                                fArr = fArr3;
                                                i4 = i9;
                                                path2.rLineTo(fArr[i4], 0.0f);
                                                f21 += fArr[i4];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i4 = i9;
                                            int i24 = i4 + 2;
                                            int i25 = i4 + 3;
                                            int i26 = i4 + 4;
                                            int i27 = i4 + 5;
                                            path2.rCubicTo(fArr[i4], fArr[i4 + 1], fArr[i24], fArr[i25], fArr[i26], fArr[i27]);
                                            float f31 = fArr[i24] + f21;
                                            float f32 = fArr[i25] + f22;
                                            f21 += fArr[i26];
                                            f22 += fArr[i27];
                                            f15 = f31;
                                            f16 = f32;
                                        }
                                        dVar = dVar3;
                                        f4 = f21;
                                        f3 = f22;
                                        i5 = i7;
                                        c3 = c5;
                                    } else {
                                        fArr = fArr3;
                                        i4 = i9;
                                        int i28 = i4 + 5;
                                        float f33 = fArr[i28] + f21;
                                        int i29 = i4 + 6;
                                        float f34 = fArr[i29] + f22;
                                        float f35 = fArr[i4];
                                        float f36 = fArr[i4 + 1];
                                        float f37 = fArr[i4 + 2];
                                        if (fArr[i4 + 3] != 0.0f) {
                                            dVar2 = dVar3;
                                            z4 = 1;
                                        } else {
                                            dVar2 = dVar3;
                                            z4 = i8;
                                        }
                                        dVar = dVar2;
                                        float f38 = f21;
                                        c3 = c5;
                                        if (fArr[i4 + 4] != 0.0f) {
                                            z5 = 1;
                                        } else {
                                            z5 = i8;
                                        }
                                        float f39 = f22;
                                        i5 = i7;
                                        a(path, f38, f39, f33, f34, f35, f36, f37, z4, z5);
                                        f4 = f38 + fArr[i28];
                                        f3 = f39 + fArr[i29];
                                        f15 = f4;
                                        f16 = f3;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i4 = i9;
                                    i5 = i7;
                                    dVar = dVar3;
                                    f4 = f21;
                                    c3 = c5;
                                    path2.lineTo(f4, fArr[i4]);
                                    f3 = fArr[i4];
                                }
                            } else {
                                fArr = fArr3;
                                i4 = i9;
                                i5 = i7;
                                dVar = dVar3;
                                c3 = c5;
                                int i30 = i4 + 1;
                                int i31 = i4 + 2;
                                int i32 = i4 + 3;
                                path2.quadTo(fArr[i4], fArr[i30], fArr[i31], fArr[i32]);
                                float f40 = fArr[i4];
                                float f41 = fArr[i30];
                                float f42 = fArr[i31];
                                float f43 = fArr[i32];
                                f15 = f40;
                                f16 = f41;
                                f4 = f42;
                                f3 = f43;
                            }
                        } else {
                            fArr = fArr3;
                            i4 = i9;
                            dVar = dVar3;
                            c3 = c5;
                            f3 = f22;
                            i5 = i7;
                            path2.lineTo(fArr[i4], f3);
                            f4 = fArr[i4];
                        }
                    } else {
                        fArr = fArr3;
                        i4 = i9;
                        i5 = i7;
                        dVar = dVar3;
                        c3 = c5;
                        int i33 = i4 + 2;
                        int i34 = i4 + 3;
                        int i35 = i4 + 4;
                        int i36 = i4 + 5;
                        path2.cubicTo(fArr[i4], fArr[i4 + 1], fArr[i33], fArr[i34], fArr[i35], fArr[i36]);
                        float f44 = fArr[i35];
                        float f45 = fArr[i36];
                        f15 = fArr[i33];
                        f16 = fArr[i34];
                        f3 = f45;
                        f4 = f44;
                    }
                } else {
                    fArr = fArr3;
                    i4 = i9;
                    dVar = dVar3;
                    float f46 = f21;
                    float f47 = f22;
                    i5 = i7;
                    c3 = c5;
                    int i37 = i4 + 5;
                    float f48 = fArr[i37];
                    int i38 = i4 + 6;
                    float f49 = fArr[i38];
                    float f50 = fArr[i4];
                    float f51 = fArr[i4 + 1];
                    float f52 = fArr[i4 + 2];
                    if (fArr[i4 + 3] != 0.0f) {
                        z2 = 1;
                    } else {
                        z2 = i8;
                    }
                    if (fArr[i4 + 4] != 0.0f) {
                        z3 = 1;
                    } else {
                        z3 = i8;
                    }
                    a(path, f46, f47, f48, f49, f50, f51, f52, z2, z3);
                    f15 = fArr[i37];
                    f3 = fArr[i38];
                    f16 = f3;
                    f4 = f15;
                }
                i9 = i4 + i3;
                path2 = path;
                dVar3 = dVar;
                c5 = c3;
                i7 = i5;
                f21 = f4;
                f22 = f3;
                c4 = c5;
                fArr3 = fArr;
            }
            fArr2[i8] = f21;
            fArr2[1] = f22;
            fArr2[2] = f15;
            fArr2[3] = f16;
            fArr2[4] = f19;
            fArr2[5] = f20;
            c4 = dVar3.f1086a;
            i7++;
            dVarArr2 = dVarArr;
            path2 = path;
            i6 = i8;
        }
    }

    public d(char c3, float[] fArr) {
        this.f1086a = c3;
        this.f1087b = fArr;
    }
}
