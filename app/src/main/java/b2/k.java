package b2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1018a;

    public k(float f3) {
        this.f1018a = f3;
    }

    @Override // b2.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1018a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.f1018a == ((k) obj).f1018a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1018a)});
    }

    public final String toString() {
        return ((int) (this.f1018a * 100.0f)) + "%";
    }
}
