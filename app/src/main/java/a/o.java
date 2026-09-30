package a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f57f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f58g;

    public /* synthetic */ o(int i3, Object obj) {
        this.f57f = i3;
        this.f58g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, y0.d] */
    @Override // o2.a
    public final Object a() {
        int i3 = this.f57f;
        Object obj = this.f58g;
        switch (i3) {
            case 0:
                ?? obj2 = new Object();
                ((p) obj).c().a().b(obj2);
                return obj2;
            case 1:
                return new e0(new k(1, (p) obj));
            default:
                return new d0((e0) obj);
        }
    }
}
