package a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c0 f5a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6b;

    public b0(androidx.fragment.app.c0 c0Var, androidx.lifecycle.r rVar) {
        c0Var.getClass();
        this.f5a = c0Var;
        this.f6b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!p2.d.a(this.f5a, b0Var.f5a) || !this.f6b.equals(b0Var.f6b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6b.hashCode() + (this.f5a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f5a + ", owner=" + this.f6b + ')';
    }
}
