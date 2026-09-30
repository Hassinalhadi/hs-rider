package b2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends u {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1053b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1054c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1055e;

    /* renamed from: f, reason: collision with root package name */
    public float f1056f;

    /* renamed from: g, reason: collision with root package name */
    public float f1057g;

    public s(float f3, float f4, float f5, float f6) {
        this.f1053b = f3;
        this.f1054c = f4;
        this.d = f5;
        this.f1055e = f6;
    }

    @Override // b2.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1060a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f3 = this.d;
        float f4 = this.f1055e;
        RectF rectF = h;
        rectF.set(this.f1053b, this.f1054c, f3, f4);
        path.arcTo(rectF, this.f1056f, this.f1057g, false);
        path.transform(matrix);
    }
}
