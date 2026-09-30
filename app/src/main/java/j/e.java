package j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f2035g;
    public final /* synthetic */ m h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.m f2036i;

    public e(androidx.emoji2.text.m mVar, f fVar, o oVar, m mVar2) {
        this.f2036i = mVar;
        this.f2034f = fVar;
        this.f2035g = oVar;
        this.h = mVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = (g) this.f2036i.f299g;
        f fVar = this.f2034f;
        if (fVar != null) {
            gVar.E = true;
            fVar.f2039b.c(false);
            gVar.E = false;
        }
        o oVar = this.f2035g;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.h.q(oVar, null, 4);
        }
    }
}
