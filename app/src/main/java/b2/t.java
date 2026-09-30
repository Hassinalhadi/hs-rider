package b2;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public float f1058b;

    /* renamed from: c, reason: collision with root package name */
    public float f1059c;

    @Override // b2.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1060a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1058b, this.f1059c);
        path.transform(matrix);
    }
}
