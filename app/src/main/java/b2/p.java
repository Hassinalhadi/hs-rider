package b2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final w[] f1040a = new w[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f1041b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f1042c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f1043e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f1044f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final w f1045g = new w();
    public final float[] h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1046i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f1047j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f1048k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1049l = true;

    public p() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f1040a[i3] = new w();
            this.f1041b[i3] = new Matrix();
            this.f1042c[i3] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n nVar, float[] fArr, float f3, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i3;
        w[] wVarArr;
        Matrix[] matrixArr2;
        boolean z2;
        float f4;
        f fVar;
        boolean z3;
        d cVar;
        a.y yVar;
        int i4;
        path.rewind();
        Path path2 = this.f1043e;
        path2.rewind();
        Path path3 = this.f1044f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = this.f1042c;
            fArr2 = this.h;
            wVarArr = this.f1040a;
            matrixArr2 = this.f1041b;
            z2 = 0;
            if (i5 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            cVar = nVar.f1033f;
                        } else {
                            cVar = nVar.f1032e;
                        }
                    } else {
                        cVar = nVar.h;
                    }
                } else {
                    cVar = nVar.f1034g;
                }
            } else {
                cVar = new c(fArr[i5]);
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        yVar = nVar.f1030b;
                    } else {
                        yVar = nVar.f1029a;
                    }
                } else {
                    yVar = nVar.d;
                }
            } else {
                yVar = nVar.f1031c;
            }
            w wVar = wVarArr[i5];
            yVar.getClass();
            yVar.A(wVar, f3, cVar.a(rectF));
            int i6 = i5 + 1;
            float f5 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = this.d;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i4 = i5;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i4 = i5;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i4 = i5;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i4 = i5;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f5);
            w wVar2 = wVarArr[i4];
            fArr2[0] = wVar2.f1062b;
            fArr2[1] = wVar2.f1063c;
            matrixArr2[i4].mapPoints(fArr2);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i4].preRotate(f5);
            i5 = i6;
        }
        int i7 = 0;
        for (i3 = 4; i7 < i3; i3 = 4) {
            w wVar3 = wVarArr[i7];
            wVar3.getClass();
            fArr2[z2] = 0.0f;
            fArr2[1] = wVar3.f1061a;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 == 0) {
                path.moveTo(fArr2[z2], fArr2[1]);
            } else {
                path.lineTo(fArr2[z2], fArr2[1]);
            }
            wVarArr[i7].b(matrixArr2[i7], path);
            if (gVar != null) {
                w wVar4 = wVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                j jVar = gVar.f981a;
                f4 = 0.0f;
                BitSet bitSet = jVar.f1001j;
                wVar4.getClass();
                bitSet.set(i7, z2);
                v[] vVarArr = jVar.h;
                wVar4.a(wVar4.f1064e);
                vVarArr[i7] = new q(new ArrayList(wVar4.f1066g), new Matrix(matrix));
            } else {
                f4 = 0.0f;
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            w wVar5 = wVarArr[i7];
            fArr2[0] = wVar5.f1062b;
            fArr2[1] = wVar5.f1063c;
            matrixArr2[i7].mapPoints(fArr2);
            w wVar6 = wVarArr[i9];
            wVar6.getClass();
            float[] fArr3 = this.f1046i;
            fArr3[0] = f4;
            fArr3[1] = wVar6.f1061a;
            matrixArr2[i9].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            w[] wVarArr2 = wVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f4);
            w wVar7 = wVarArr2[i7];
            fArr2[0] = wVar7.f1062b;
            fArr2[1] = wVar7.f1063c;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 != 1 && i7 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            w wVar8 = this.f1045g;
            wVar8.d(0.0f, 270.0f, 0.0f);
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        fVar = nVar.f1036j;
                    } else {
                        fVar = nVar.f1035i;
                    }
                } else {
                    fVar = nVar.f1038l;
                }
            } else {
                fVar = nVar.f1037k;
            }
            fVar.getClass();
            wVar8.c(max, 0.0f);
            Path path4 = this.f1047j;
            path4.reset();
            wVar8.b(matrixArr3[i7], path4);
            if (this.f1049l && (b(path4, i7) || b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = wVar8.f1061a;
                matrixArr3[i7].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                wVar8.b(matrixArr3[i7], path2);
            } else {
                wVar8.b(matrixArr3[i7], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i7];
                j jVar2 = gVar.f981a;
                z3 = false;
                jVar2.f1001j.set(i7 + 4, false);
                v[] vVarArr2 = jVar2.f1000i;
                wVar8.a(wVar8.f1064e);
                vVarArr2[i7] = new q(new ArrayList(wVar8.f1066g), new Matrix(matrix2));
            } else {
                z3 = false;
            }
            matrixArr = matrixArr3;
            i7 = i8;
            z2 = z3;
            wVarArr = wVarArr2;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i3) {
        Path path2 = this.f1048k;
        path2.reset();
        this.f1040a[i3].b(this.f1041b[i3], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
