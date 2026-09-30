package f1;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.f f1607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1608b;

    public p(q qVar, n.f fVar) {
        this.f1608b = qVar;
        this.f1607a = fVar;
    }

    @Override // f1.l
    public final void c(n nVar) {
        ((ArrayList) this.f1607a.get(this.f1608b.f1610g)).remove(nVar);
        nVar.x(this);
    }
}
