package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m0 implements PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j.d f2320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f2321g;

    public m0(n0 n0Var, j.d dVar) {
        this.f2321g = n0Var;
        this.f2320f = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2321g.J.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2320f);
        }
    }
}
