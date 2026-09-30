package y0;

import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f3288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3289b;

    public c(List list, int i3) {
        this.f3288a = list;
        this.f3289b = i3;
        if (!list.isEmpty() || i3 != -1) {
            if (!list.isEmpty()) {
                int size = list.size();
                if (i3 >= 0 && i3 < size) {
                    return;
                }
            }
            throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i3 + "', bounds = '" + new t2.b(0, list.size() - 1, 1) + "'.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3289b == cVar.f3289b && p2.d.a(this.f3288a, cVar.f3288a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3288a.hashCode() + (this.f3289b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f3289b + ", mergedHistory=" + this.f3288a + ')';
    }

    public c() {
        this(k2.e.f2487f, -1);
    }
}
