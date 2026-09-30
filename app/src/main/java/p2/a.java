package p2;

import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o2.e;
import o2.f;
import o2.g;
import o2.h;
import o2.i;
import o2.j;
import o2.k;
import o2.l;
import o2.m;
import o2.n;
import o2.o;
import o2.p;
import o2.q;
import o2.r;
import o2.s;
import o2.t;
import o2.u;
import o2.v;
import o2.w;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {
    static {
        List asList = Arrays.asList(o2.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, o2.b.class, o2.c.class, o2.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        asList.getClass();
        ArrayList arrayList = new ArrayList(asList.size());
        int i3 = 0;
        for (Object obj : asList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(new j2.a((Class) obj, Integer.valueOf(i3)));
                i3 = i4;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        k2.i.Z(arrayList);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && k2.h.q(this).equals(k2.h.q((a) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return k2.h.q(this).hashCode();
    }

    public final String toString() {
        return j0.class + " (Kotlin reflection is not available)";
    }
}
