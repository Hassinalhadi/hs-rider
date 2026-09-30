package k1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.j0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a extends x.a {

    /* renamed from: a, reason: collision with root package name */
    public b f2479a;

    @Override // x.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        r(coordinatorLayout, view, i3);
        if (this.f2479a == null) {
            this.f2479a = new b(view);
        }
        b bVar = this.f2479a;
        View view2 = (View) bVar.f2482c;
        bVar.f2480a = view2.getTop();
        bVar.f2481b = view2.getLeft();
        b bVar2 = this.f2479a;
        View view3 = (View) bVar2.f2482c;
        int top = 0 - (view3.getTop() - bVar2.f2480a);
        WeakHashMap weakHashMap = j0.f2160a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f2481b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.q(view, i3);
    }
}
