package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k0 extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f1726g;

    public /* synthetic */ k0(m0 m0Var, int i3) {
        this.f1725f = i3;
        this.f1726g = m0Var;
    }

    @Override // j0.l0
    public final void a() {
        View view;
        int i3 = this.f1725f;
        m0 m0Var = this.f1726g;
        switch (i3) {
            case 0:
                if (m0Var.f1745o && (view = m0Var.f1738g) != null) {
                    view.setTranslationY(0.0f);
                    m0Var.d.setTranslationY(0.0f);
                }
                m0Var.d.setVisibility(8);
                m0Var.d.setTransitioning(false);
                m0Var.f1749s = null;
                androidx.emoji2.text.p pVar = m0Var.f1741k;
                if (pVar != null) {
                    pVar.A(m0Var.f1740j);
                    m0Var.f1740j = null;
                    m0Var.f1741k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m0Var.f1735c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    j0.a0.b(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                m0Var.f1749s = null;
                m0Var.d.requestLayout();
                return;
        }
    }
}
