package y0;

import a.a0;
import a.c0;
import a.d0;
import a.e0;
import androidx.emoji2.text.w;
import androidx.fragment.app.k0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public w f3290a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3291b;

    public final void a() {
        w wVar = this.f3290a;
        if (wVar != null) {
            if (!this.f3291b) {
                wVar.e(this, null);
            }
            e eVar = (e) wVar.f321g;
            c0 c0Var = (c0) wVar.f320f;
            eVar.getClass();
            if (equals(eVar.h) && -1 == eVar.f3297g) {
                a0 a0Var = eVar.f3296f;
                if (a0Var == null) {
                    a0Var = eVar.c(-1);
                }
                eVar.f3296f = null;
                eVar.f3297g = 0;
                eVar.h = null;
                if (a0Var == null) {
                    ((e0) c0Var.f9f).f15a.run();
                } else {
                    k0 k0Var = a0Var.d.d;
                    k0Var.y(true);
                    if (k0Var.h.f369b) {
                        k0Var.M();
                    } else {
                        ((d0) k0Var.f402g.f16b.a()).a();
                    }
                }
                eVar.f3292a.b(f.f3304a);
            }
            this.f3291b = false;
            return;
        }
        a.b.i("This input is not added to any dispatcher.");
    }

    public void b(boolean z2) {
    }
}
