package k;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2282a;

    /* renamed from: b, reason: collision with root package name */
    public int f2283b;

    /* renamed from: c, reason: collision with root package name */
    public int f2284c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2285e;

    /* renamed from: f, reason: collision with root package name */
    public int f2286f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2287g;
    public boolean h;

    public final void a(int i3, int i4) {
        this.f2284c = i3;
        this.d = i4;
        this.h = true;
        if (this.f2287g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f2282a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f2283b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2282a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2283b = i4;
        }
    }
}
