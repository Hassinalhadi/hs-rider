package b2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: a, reason: collision with root package name */
    public final t f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1052c;

    public r(t tVar, float f3, float f4) {
        this.f1050a = tVar;
        this.f1051b = f3;
        this.f1052c = f4;
    }

    public final float a() {
        t tVar = this.f1050a;
        return (float) Math.toDegrees(Math.atan((tVar.f1059c - this.f1052c) / (tVar.f1058b - this.f1051b)));
    }
}
