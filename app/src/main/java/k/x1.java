package k;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f2436a;

    public x1(a2 a2Var) {
        this.f2436a = a2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        a2 a2Var = this.f2436a;
        if (a2Var.E.isShowing()) {
            a2Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2436a.dismiss();
    }
}
