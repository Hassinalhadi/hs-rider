package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f440g;

    public o(p pVar, r rVar) {
        this.f440g = pVar;
        this.f439f = rVar;
    }

    @Override // a.y
    public final View R(int i3) {
        r rVar = this.f439f;
        if (rVar.S()) {
            return rVar.R(i3);
        }
        Dialog dialog = this.f440g.f458h0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    @Override // a.y
    public final boolean S() {
        if (!this.f439f.S() && !this.f440g.f461k0) {
            return false;
        }
        return true;
    }
}
