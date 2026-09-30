package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f318a;

    /* renamed from: b, reason: collision with root package name */
    public z f319b;

    public v(int i3) {
        this.f318a = new SparseArray(i3);
    }

    public final void a(z zVar, int i3, int i4) {
        v vVar;
        int a3 = zVar.a(i3);
        SparseArray sparseArray = this.f318a;
        if (sparseArray == null) {
            vVar = null;
        } else {
            vVar = (v) sparseArray.get(a3);
        }
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(zVar.a(i3), vVar);
        }
        if (i4 > i3) {
            vVar.a(zVar, i3 + 1, i4);
        } else {
            vVar.f319b = zVar;
        }
    }
}
