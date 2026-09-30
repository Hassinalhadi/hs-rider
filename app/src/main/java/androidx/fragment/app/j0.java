package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f396b;

    public j0(k0 k0Var, int i3) {
        this.f396b = k0Var;
        this.f395a = i3;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k0 k0Var = this.f396b;
        u uVar = k0Var.f417w;
        int i3 = this.f395a;
        if (uVar != null && i3 < 0 && uVar.g().N(-1, 0)) {
            return false;
        }
        return k0Var.O(arrayList, arrayList2, i3, 1);
    }
}
