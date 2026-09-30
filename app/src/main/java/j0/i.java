package j0;

import android.view.DisplayCutout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2159a;

    public i(DisplayCutout displayCutout) {
        this.f2159a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return this.f2159a.equals(((i) obj).f2159a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2159a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2159a + "}";
    }
}
