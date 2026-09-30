package b0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f692a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f693b;

    public j(Resources resources, Resources.Theme theme) {
        this.f692a = resources;
        this.f693b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f692a.equals(jVar.f692a) && Objects.equals(this.f693b, jVar.f693b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f692a, this.f693b);
    }
}
