package androidx.fragment.app;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f368a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f369b = false;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f370c = new CopyOnWriteArrayList();
    public final /* synthetic */ k0 d;

    public c0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a(boolean z2) {
        boolean z3;
        y0.e eVar;
        this.f369b = z2;
        ArrayList arrayList = this.f368a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a.a0 a0Var = (a.a0) obj;
            if (a0Var.f3e && z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (a0Var.f1b != z3) {
                a0Var.f1b = z3;
                androidx.emoji2.text.w wVar = a0Var.f2c;
                if (wVar != null && (eVar = (y0.e) wVar.f321g) != null) {
                    eVar.b();
                }
            }
        }
    }
}
