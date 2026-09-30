package b2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f971a;

    /* renamed from: b, reason: collision with root package name */
    public final float f972b;

    public b(float f3, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f971a;
            f3 += ((b) dVar).f972b;
        }
        this.f971a = dVar;
        this.f972b = f3;
    }

    @Override // b2.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f971a.a(rectF) + this.f972b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f971a.equals(bVar.f971a) && this.f972b == bVar.f972b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f971a, Float.valueOf(this.f972b)});
    }
}
