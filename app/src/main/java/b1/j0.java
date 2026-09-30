package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public d0 f802a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f803b;

    /* renamed from: c, reason: collision with root package name */
    public long f804c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f805e;

    /* renamed from: f, reason: collision with root package name */
    public long f806f;

    public static void b(c1 c1Var) {
        RecyclerView recyclerView;
        int i3 = c1Var.f736j;
        if (!c1Var.f() && (i3 & 4) == 0 && (recyclerView = c1Var.f744r) != null) {
            recyclerView.F(c1Var);
        }
    }

    public abstract boolean a(c1 c1Var, c1 c1Var2, i0 i0Var, i0 i0Var2);

    public final void c(c1 c1Var) {
        d0 d0Var = this.f802a;
        if (d0Var != null) {
            RecyclerView recyclerView = d0Var.f748a;
            boolean z2 = true;
            c1Var.n(true);
            View view = c1Var.f729a;
            if (c1Var.h != null && c1Var.f735i == null) {
                c1Var.h = null;
            }
            c1Var.f735i = null;
            if ((c1Var.f736j & 16) == 0) {
                t0 t0Var = recyclerView.f614g;
                recyclerView.a0();
                androidx.emoji2.text.s sVar = recyclerView.f619j;
                c cVar = (c) sVar.f310c;
                d0 d0Var2 = (d0) sVar.f309b;
                int indexOfChild = d0Var2.f748a.indexOfChild(view);
                if (indexOfChild == -1) {
                    sVar.v(view);
                } else if (cVar.d(indexOfChild)) {
                    cVar.f(indexOfChild);
                    sVar.v(view);
                    d0Var2.h(indexOfChild);
                } else {
                    z2 = false;
                }
                if (z2) {
                    c1 I = RecyclerView.I(view);
                    t0Var.k(I);
                    t0Var.h(I);
                }
                recyclerView.b0(!z2);
                if (!z2 && c1Var.j()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(c1 c1Var);

    public abstract void e();

    public abstract boolean f();
}
