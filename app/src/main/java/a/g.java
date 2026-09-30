package a;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22g;

    public /* synthetic */ g(int i3, Object obj) {
        this.f21f = i3;
        this.f22g = obj;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        Window window;
        View peekDecorView;
        int i3 = this.f21f;
        Object obj = this.f22g;
        switch (i3) {
            case 0:
                g.i iVar = (g.i) obj;
                if (lVar == androidx.lifecycle.l.ON_STOP && (window = iVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                g.i iVar2 = (g.i) obj;
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    iVar2.f41g.f667b = null;
                    if (!iVar2.isChangingConfigurations()) {
                        iVar2.e().a();
                    }
                    l lVar2 = iVar2.f44k;
                    g.i iVar3 = lVar2.f32i;
                    iVar3.getWindow().getDecorView().removeCallbacks(lVar2);
                    iVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar2);
                    return;
                }
                return;
            default:
                c1.d dVar = (c1.d) obj;
                dVar.getClass();
                if (lVar == androidx.lifecycle.l.ON_START) {
                    dVar.f1094c = true;
                    return;
                } else {
                    if (lVar == androidx.lifecycle.l.ON_STOP) {
                        dVar.f1094c = false;
                        return;
                    }
                    return;
                }
        }
    }
}
