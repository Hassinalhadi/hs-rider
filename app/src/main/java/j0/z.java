package j0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public int f2190a;

    /* renamed from: b, reason: collision with root package name */
    public int f2191b;

    /* renamed from: c, reason: collision with root package name */
    public int f2192c;
    public Object d;

    public z() {
        if (b2.f.f979g == null) {
            b2.f.f979g = new b2.f(17);
        }
    }

    public int a(int i3) {
        if (i3 < this.f2192c) {
            return ((ByteBuffer) this.d).getShort(this.f2191b + i3);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2191b) {
            c(view, obj);
            return;
        }
        b bVar = null;
        if (Build.VERSION.SDK_INT >= this.f2191b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f2190a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            WeakHashMap weakHashMap = j0.f2160a;
            View.AccessibilityDelegate a3 = g0.a(view);
            if (a3 != null) {
                if (a3 instanceof a) {
                    bVar = ((a) a3).f2140a;
                } else {
                    bVar = new b(a3);
                }
            }
            if (bVar == null) {
                bVar = new b();
            }
            j0.h(view, bVar);
            view.setTag(this.f2190a, obj);
            j0.d(view, this.f2192c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
