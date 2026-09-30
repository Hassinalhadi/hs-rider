package a;

import android.view.View;
import j0.c1;
import j0.y0;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements j0.n, o2.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9f;

    public /* synthetic */ c0(Object obj) {
        this.f9f = obj;
    }

    @Override // j0.n
    public c1 d(View view, c1 c1Var) {
        m0.g gVar = (m0.g) this.f9f;
        ArrayList arrayList = gVar.f2548b;
        y0 y0Var = c1Var.f2146a;
        c0.b a3 = c0.b.a(y0Var.f(519), y0Var.f(64));
        c0.b a4 = c0.b.a(y0Var.g(519), y0Var.g(64));
        if (!a3.equals(gVar.f2549c) || !a4.equals(gVar.d)) {
            gVar.f2549c = a3;
            gVar.d = a4;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m0.c cVar = (m0.c) arrayList.get(size);
                cVar.f2538c = a3;
                cVar.d = a4;
                cVar.c();
            }
        }
        return c1Var;
    }
}
