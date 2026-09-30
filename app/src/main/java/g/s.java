package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1771g;

    public /* synthetic */ s(int i3, Object obj) {
        this.f1770f = i3;
        this.f1771g = obj;
    }

    @Override // j0.l0
    public final void a() {
        int i3 = this.f1770f;
        Object obj = this.f1771g;
        switch (i3) {
            case 0:
                c0 c0Var = ((q) obj).f1767g;
                c0Var.A.setAlpha(1.0f);
                c0Var.D.d(null);
                c0Var.D = null;
                return;
            case 1:
                c0 c0Var2 = (c0) obj;
                c0Var2.A.setAlpha(1.0f);
                c0Var2.D.d(null);
                c0Var2.D = null;
                return;
            default:
                c0 c0Var3 = (c0) ((androidx.emoji2.text.p) obj).h;
                c0Var3.A.setVisibility(8);
                PopupWindow popupWindow = c0Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (c0Var3.A.getParent() instanceof View) {
                    View view = (View) c0Var3.A.getParent();
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    j0.a0.b(view);
                }
                c0Var3.A.e();
                c0Var3.D.d(null);
                c0Var3.D = null;
                ViewGroup viewGroup = c0Var3.F;
                WeakHashMap weakHashMap2 = j0.j0.f2160a;
                j0.a0.b(viewGroup);
                return;
        }
    }

    @Override // a.y, j0.l0
    public void g() {
        int i3 = this.f1770f;
        Object obj = this.f1771g;
        switch (i3) {
            case 0:
                ((q) obj).f1767g.A.setVisibility(0);
                return;
            case 1:
                c0 c0Var = (c0) obj;
                c0Var.A.setVisibility(0);
                if (c0Var.A.getParent() instanceof View) {
                    View view = (View) c0Var.A.getParent();
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    j0.a0.b(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
