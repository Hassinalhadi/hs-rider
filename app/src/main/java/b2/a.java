package b2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f964a;

    public a(float f3) {
        this.f964a = f3;
    }

    @Override // b2.d
    public final float a(RectF rectF) {
        return this.f964a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f964a == ((a) obj).f964a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f964a)});
    }

    public final String toString() {
        return this.f964a + "px";
    }
}
