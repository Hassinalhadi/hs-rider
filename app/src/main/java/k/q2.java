package k;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2374g;

    public /* synthetic */ q2(Toolbar toolbar, int i3) {
        this.f2373f = i3;
        this.f2374g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.o oVar;
        int i3 = this.f2373f;
        Toolbar toolbar = this.f2374g;
        switch (i3) {
            case 0:
                t2 t2Var = toolbar.Q;
                if (t2Var == null) {
                    oVar = null;
                } else {
                    oVar = t2Var.f2409g;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
