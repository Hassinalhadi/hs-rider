package k;

import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final g f2274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f2275g;

    public i(k kVar, g gVar) {
        this.f2275g = kVar;
        this.f2274f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.k kVar;
        k kVar2 = this.f2275g;
        j.m mVar = kVar2.h;
        if (mVar != null && (kVar = mVar.f2076e) != null) {
            kVar.g(mVar);
        }
        View view = (View) kVar2.f2294m;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f2274f;
            if (!gVar.b()) {
                if (gVar.f2134e != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            kVar2.f2305x = gVar;
        }
        kVar2.f2307z = null;
    }
}
