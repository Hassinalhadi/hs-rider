package g;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1773b;

    public /* synthetic */ v(int i3, Object obj) {
        this.f1772a = i3;
        this.f1773b = obj;
    }

    public final void onBackInvoked() {
        int i3 = this.f1772a;
        Object obj = this.f1773b;
        switch (i3) {
            case 0:
                ((c0) obj).C();
                return;
            case 1:
                ((Runnable) obj).run();
                return;
            default:
                ((y0.i) obj).a();
                return;
        }
    }
}
