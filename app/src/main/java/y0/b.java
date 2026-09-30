package y0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3284a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3285b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3286c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3287e;

    public b(int i3, float f3, float f4, float f5, long j3) {
        this.f3284a = i3;
        this.f3285b = f3;
        this.f3286c = f4;
        this.d = f5;
        this.f3287e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3286c == bVar.f3286c && this.d == bVar.d && this.f3285b == bVar.f3285b && this.f3284a == bVar.f3284a && this.f3287e == bVar.f3287e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3287e) + ((Integer.hashCode(this.f3284a) + ((Float.hashCode(this.f3285b) + ((Float.hashCode(this.d) + (Float.hashCode(this.f3286c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f3286c + ", touchY=" + this.d + ", progress=" + this.f3285b + ", swipeEdge=" + this.f3284a + ", frameTimeMillis=" + this.f3287e + ')';
    }
}
