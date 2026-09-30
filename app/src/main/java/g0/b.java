package g0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f1781a;

    /* renamed from: b, reason: collision with root package name */
    public String f1782b;

    /* renamed from: c, reason: collision with root package name */
    public List f1783c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f1781a, bVar.f1781a) && Objects.equals(this.f1782b, bVar.f1782b) && Objects.equals(this.f1783c, bVar.f1783c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1781a, this.f1782b, this.f1783c);
    }
}
