package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f469f;

    public r(u uVar) {
        this.f469f = uVar;
    }

    @Override // a.y
    public final View R(int i3) {
        u uVar = this.f469f;
        View view = uVar.J;
        if (view != null) {
            return view.findViewById(i3);
        }
        a.b.k("Fragment ", uVar, " does not have a view");
        return null;
    }

    @Override // a.y
    public final boolean S() {
        if (this.f469f.J != null) {
            return true;
        }
        return false;
    }
}
