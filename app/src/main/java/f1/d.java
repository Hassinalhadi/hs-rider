package f1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1566a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1567b;

    public d(ViewGroup viewGroup) {
        this.f1567b = viewGroup;
    }

    @Override // f1.o, f1.l
    public final void b(n nVar) {
        v.b(this.f1567b, false);
        this.f1566a = true;
    }

    @Override // f1.l
    public final void c(n nVar) {
        if (!this.f1566a) {
            v.b(this.f1567b, false);
        }
        nVar.x(this);
    }

    @Override // f1.o, f1.l
    public final void d() {
        v.b(this.f1567b, false);
    }

    @Override // f1.o, f1.l
    public final void e() {
        v.b(this.f1567b, true);
    }
}
