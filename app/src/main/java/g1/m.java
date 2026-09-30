package g1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f1846p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f1847a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f1848b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f1849c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1850e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f1851f;

    /* renamed from: g, reason: collision with root package name */
    public final j f1852g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1853i;

    /* renamed from: j, reason: collision with root package name */
    public float f1854j;

    /* renamed from: k, reason: collision with root package name */
    public float f1855k;

    /* renamed from: l, reason: collision with root package name */
    public int f1856l;

    /* renamed from: m, reason: collision with root package name */
    public String f1857m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f1858n;

    /* renamed from: o, reason: collision with root package name */
    public final n.f f1859o;

    /* JADX WARN: Type inference failed for: r0v4, types: [n.f, n.j] */
    public m(m mVar) {
        this.f1849c = new Matrix();
        this.h = 0.0f;
        this.f1853i = 0.0f;
        this.f1854j = 0.0f;
        this.f1855k = 0.0f;
        this.f1856l = 255;
        this.f1857m = null;
        this.f1858n = null;
        ?? jVar = new n.j(0);
        this.f1859o = jVar;
        this.f1852g = new j(mVar.f1852g, jVar);
        this.f1847a = new Path(mVar.f1847a);
        this.f1848b = new Path(mVar.f1848b);
        this.h = mVar.h;
        this.f1853i = mVar.f1853i;
        this.f1854j = mVar.f1854j;
        this.f1855k = mVar.f1855k;
        this.f1856l = mVar.f1856l;
        this.f1857m = mVar.f1857m;
        String str = mVar.f1857m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f1858n = mVar.f1858n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i3, int i4) {
        int i5;
        float f3;
        float f4;
        int i6;
        float f5;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f1834a;
        ArrayList arrayList = jVar.f1835b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f1834a;
        matrix3.preConcat(jVar.f1841j);
        canvas.save();
        char c3 = 0;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            k kVar = (k) arrayList.get(i7);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i3, i4);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f6 = i3 / this.f1854j;
                float f7 = i4 / this.f1855k;
                float min = Math.min(f6, f7);
                Matrix matrix4 = this.f1849c;
                matrix4.set(matrix3);
                matrix4.postScale(f6, f7);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c3], fArr[1]);
                boolean z2 = c3;
                i5 = i7;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f8 = (fArr[z2 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    f3 = Math.abs(f8) / max;
                } else {
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    Path path = this.f1847a;
                    path.reset();
                    c0.d[] dVarArr = lVar.f1843a;
                    if (dVarArr != null) {
                        c0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f1848b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f1845c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f9 = iVar.f1828i;
                        if (f9 != 0.0f || iVar.f1829j != 1.0f) {
                            float f10 = iVar.f1830k;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (iVar.f1829j + f10) % 1.0f;
                            if (this.f1851f == null) {
                                this.f1851f = new PathMeasure();
                            }
                            this.f1851f.setPath(path, z2);
                            float length = this.f1851f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f1851f;
                            if (f13 > f14) {
                                pathMeasure.getSegment(f13, length, path, true);
                                f4 = 0.0f;
                                this.f1851f.getSegment(0.0f, f14, path, true);
                            } else {
                                f4 = 0.0f;
                                pathMeasure.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f4, f4);
                        }
                        path2.addPath(path, matrix4);
                        b0.d dVar = iVar.f1826f;
                        if (((Shader) dVar.f678b) != null || dVar.f677a != 0) {
                            if (this.f1850e == null) {
                                i6 = 16777215;
                                Paint paint = new Paint(1);
                                this.f1850e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i6 = 16777215;
                            }
                            Paint paint2 = this.f1850e;
                            Shader shader = (Shader) dVar.f678b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f5 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = dVar.f677a;
                                float f15 = iVar.h;
                                PorterDuff.Mode mode = p.f1871o;
                                f5 = 255.0f;
                                paint2.setColor((i8 & i6) | (((int) (Color.alpha(i8) * f15)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f1845c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f5 = 255.0f;
                            i6 = 16777215;
                        }
                        b0.d dVar2 = iVar.d;
                        if (((Shader) dVar2.f678b) != null || dVar2.f677a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f1832m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f1831l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f1833n);
                            Shader shader2 = (Shader) dVar2.f678b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f1827g * f5));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i9 = dVar2.f677a;
                                float f16 = iVar.f1827g;
                                PorterDuff.Mode mode2 = p.f1871o;
                                paint4.setColor((i9 & i6) | (((int) (Color.alpha(i9) * f16)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f1825e * min * f3);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i7 = i5 + 1;
                c3 = 0;
            }
            i5 = i7;
            i7 = i5 + 1;
            c3 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1856l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f1856l = i3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [n.f, n.j] */
    public m() {
        this.f1849c = new Matrix();
        this.h = 0.0f;
        this.f1853i = 0.0f;
        this.f1854j = 0.0f;
        this.f1855k = 0.0f;
        this.f1856l = 255;
        this.f1857m = null;
        this.f1858n = null;
        this.f1859o = new n.j(0);
        this.f1852g = new j();
        this.f1847a = new Path();
        this.f1848b = new Path();
    }
}
