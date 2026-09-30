package j2;

import java.io.Serializable;
import p2.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2202f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2203g;

    public a(Object obj, Object obj2) {
        this.f2202f = obj;
        this.f2203g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (d.a(this.f2202f, aVar.f2202f) && d.a(this.f2203g, aVar.f2203g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Object obj = this.f2202f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i4 = hashCode * 31;
        Object obj2 = this.f2203g;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "(" + this.f2202f + ", " + this.f2203g + ')';
    }
}
