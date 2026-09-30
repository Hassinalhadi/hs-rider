package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2237g;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f2236f = i3;
        this.f2237g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2236f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2237g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.f136i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2237g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.B = actionBarOverlayLayout2.f136i.animate().translationY(-actionBarOverlayLayout2.f136i.getHeight()).setListener(actionBarOverlayLayout2.C);
                return;
        }
    }
}
