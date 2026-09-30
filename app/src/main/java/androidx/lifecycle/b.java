package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f543a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f544b;

    public b(int i3, Method method) {
        this.f543a = i3;
        this.f544b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f543a == bVar.f543a && this.f544b.getName().equals(bVar.f544b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f544b.getName().hashCode() + (this.f543a * 31);
    }
}
