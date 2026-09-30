package androidx.lifecycle;

import android.os.Bundle;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* renamed from: f, reason: collision with root package name */
    public final i0 f539f;

    public SavedStateHandleAttacher(i0 i0Var) {
        this.f539f = i0Var;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_CREATE) {
            rVar.f().f(this);
            i0 i0Var = this.f539f;
            if (!i0Var.f562b) {
                Bundle c3 = i0Var.f561a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = i0Var.f563c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c3 != null) {
                    bundle.putAll(c3);
                }
                i0Var.f563c = bundle;
                i0Var.f562b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
    }
}
