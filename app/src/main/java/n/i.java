package n;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2571a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2572b = new Object();

    public static final int a(g gVar, Object obj, int i3) {
        int i4 = gVar.h;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = o.a.a(i4, i3, gVar.f2566f);
            if (a3 < 0 || p2.d.a(obj, gVar.f2567g[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && gVar.f2566f[i5] == i3) {
                if (p2.d.a(obj, gVar.f2567g[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && gVar.f2566f[i6] == i3; i6--) {
                if (p2.d.a(obj, gVar.f2567g[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
