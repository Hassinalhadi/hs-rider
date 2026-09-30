package e2;

import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1409b;

    public /* synthetic */ a(r rVar, int i3) {
        this.f1408a = i3;
        this.f1409b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        int i3 = this.f1408a;
        r rVar = this.f1409b;
        switch (i3) {
            case 0:
                d dVar = (d) rVar;
                dVar.s(dVar.t());
                return;
            default:
                m mVar = (m) rVar;
                mVar.f1440l = z2;
                mVar.p();
                if (!z2) {
                    mVar.s(false);
                    mVar.f1441m = false;
                    return;
                }
                return;
        }
    }
}
