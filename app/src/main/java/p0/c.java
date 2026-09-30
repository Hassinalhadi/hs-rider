package p0;

import android.graphics.Rect;
import b2.f;
import java.util.Comparator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2674a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2675b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2676c;
    public final f d;

    public c(boolean z2, f fVar) {
        this.f2676c = z2;
        this.d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.f2674a;
        ((k0.d) obj).f(rect);
        Rect rect2 = this.f2675b;
        ((k0.d) obj2).f(rect2);
        int i3 = rect.top;
        int i4 = rect2.top;
        if (i3 >= i4) {
            if (i3 <= i4) {
                int i5 = rect.left;
                int i6 = rect2.left;
                boolean z2 = this.f2676c;
                if (i5 < i6) {
                    if (!z2) {
                        return -1;
                    }
                    return 1;
                }
                if (i5 > i6) {
                    if (z2) {
                        return -1;
                    }
                    return 1;
                }
                int i7 = rect.bottom;
                int i8 = rect2.bottom;
                if (i7 >= i8) {
                    if (i7 <= i8) {
                        int i9 = rect.right;
                        int i10 = rect2.right;
                        if (i9 < i10) {
                            if (!z2) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i9 > i10) {
                            if (z2) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
