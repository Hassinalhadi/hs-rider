package b1;

import android.util.SparseArray;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f897a;

    /* renamed from: b, reason: collision with root package name */
    public int f898b;

    public final r0 a(int i3) {
        SparseArray sparseArray = this.f897a;
        r0 r0Var = (r0) sparseArray.get(i3);
        if (r0Var == null) {
            r0 r0Var2 = new r0();
            sparseArray.put(i3, r0Var2);
            return r0Var2;
        }
        return r0Var;
    }
}
