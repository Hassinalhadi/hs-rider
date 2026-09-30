package n0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2577a;

    /* renamed from: b, reason: collision with root package name */
    public int f2578b;

    /* renamed from: c, reason: collision with root package name */
    public float f2579c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f2580e;

    /* renamed from: f, reason: collision with root package name */
    public long f2581f;

    /* renamed from: g, reason: collision with root package name */
    public long f2582g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f2583i;

    public final float a(long j3) {
        long j4 = this.f2580e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f2582g;
        if (j5 >= 0 && j3 >= j5) {
            float f3 = this.h;
            return (d.b(((float) (j3 - j5)) / this.f2583i, 0.0f, 1.0f) * f3) + (1.0f - f3);
        }
        return d.b(((float) (j3 - j4)) / this.f2577a, 0.0f, 1.0f) * 0.5f;
    }
}
