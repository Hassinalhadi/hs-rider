package androidx.lifecycle;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public m f577a;

    /* renamed from: b, reason: collision with root package name */
    public p f578b;

    public final void a(r rVar, l lVar) {
        m a3 = lVar.a();
        m mVar = this.f577a;
        mVar.getClass();
        if (a3.compareTo(mVar) < 0) {
            mVar = a3;
        }
        this.f577a = mVar;
        this.f578b.b(rVar, lVar);
        this.f577a = a3;
    }
}
