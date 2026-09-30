package f1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1614a = 1;

    /* renamed from: b, reason: collision with root package name */
    public n f1615b;

    public s(n nVar) {
        this.f1615b = nVar;
    }

    @Override // f1.o, f1.l
    public void a(n nVar) {
        switch (this.f1614a) {
            case 1:
                a aVar = (a) this.f1615b;
                if (!aVar.I) {
                    aVar.G();
                    aVar.I = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // f1.l
    public final void c(n nVar) {
        switch (this.f1614a) {
            case 0:
                this.f1615b.z();
                nVar.x(this);
                return;
            default:
                a aVar = (a) this.f1615b;
                int i3 = aVar.H - 1;
                aVar.H = i3;
                if (i3 == 0) {
                    aVar.I = false;
                    aVar.m();
                }
                nVar.x(this);
                return;
        }
    }

    public /* synthetic */ s() {
    }
}
