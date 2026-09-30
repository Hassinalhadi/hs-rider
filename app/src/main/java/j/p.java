package j;

import android.view.ActionProvider;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.m f2121a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2122b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2122b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        androidx.emoji2.text.m mVar = this.f2121a;
        if (mVar != null) {
            m mVar2 = ((o) mVar.f299g).f2108n;
            mVar2.h = true;
            mVar2.p(true);
        }
    }
}
