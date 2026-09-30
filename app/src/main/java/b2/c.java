package b2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f975a;

    public c(float f3) {
        this.f975a = f3;
    }

    @Override // b2.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f3 = this.f975a;
        if (f3 < 0.0f) {
            return 0.0f;
        }
        if (f3 > min) {
            return min;
        }
        return f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f975a == ((c) obj).f975a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f975a)});
    }
}
