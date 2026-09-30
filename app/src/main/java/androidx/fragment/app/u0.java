package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f512g;
    public final /* synthetic */ l h;

    public /* synthetic */ u0(l lVar, v0 v0Var, int i3) {
        this.f511f = i3;
        this.h = lVar;
        this.f512g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f511f) {
            case 0:
                ArrayList arrayList = this.h.f422b;
                v0 v0Var = this.f512g;
                if (arrayList.contains(v0Var)) {
                    w0.a(v0Var.f517c.J, v0Var.f515a);
                    return;
                }
                return;
            default:
                l lVar = this.h;
                ArrayList arrayList2 = lVar.f422b;
                v0 v0Var2 = this.f512g;
                arrayList2.remove(v0Var2);
                lVar.f423c.remove(v0Var2);
                return;
        }
    }
}
