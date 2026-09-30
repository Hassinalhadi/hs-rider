package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.f2;
import k.n0;
import k.q0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2015g;

    public /* synthetic */ d(int i3, Object obj) {
        this.f2014f = i3;
        this.f2015g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2014f) {
            case 0:
                g gVar = (g) this.f2015g;
                ArrayList arrayList = gVar.f2046m;
                if (gVar.b() && arrayList.size() > 0) {
                    int i3 = 0;
                    if (!((f) arrayList.get(0)).f2038a.D) {
                        View view = gVar.f2053t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                ((f) obj).f2038a.f();
                            }
                            return;
                        }
                        gVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f2015g;
                f2 f2Var = d0Var.f2021m;
                if (d0Var.b() && !f2Var.D) {
                    View view2 = d0Var.f2026r;
                    if (view2 != null && view2.isShown()) {
                        f2Var.f();
                        return;
                    } else {
                        d0Var.dismiss();
                        return;
                    }
                }
                return;
            case 2:
                q0 q0Var = (q0) this.f2015g;
                if (!q0Var.getInternalPopup().b()) {
                    q0Var.f2362k.e(q0Var.getTextDirection(), q0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                n0 n0Var = (n0) this.f2015g;
                q0 q0Var2 = n0Var.J;
                if (q0Var2.isAttachedToWindow() && q0Var2.getGlobalVisibleRect(n0Var.H)) {
                    n0Var.s();
                    n0Var.f();
                    return;
                } else {
                    n0Var.dismiss();
                    return;
                }
        }
    }
}
