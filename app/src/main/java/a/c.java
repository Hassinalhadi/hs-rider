package a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.i f8g;

    public /* synthetic */ c(g.i iVar, int i3) {
        this.f7f = i3;
        this.f8g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f7f;
        g.i iVar = this.f8g;
        switch (i3) {
            case 0:
                n.c(iVar);
                return;
            default:
                iVar.invalidateOptionsMenu();
                return;
        }
    }
}
