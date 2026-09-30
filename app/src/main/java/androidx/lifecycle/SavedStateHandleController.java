package androidx.lifecycle;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* renamed from: f, reason: collision with root package name */
    public boolean f540f;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f540f = false;
            rVar.f().f(this);
        }
    }
}
