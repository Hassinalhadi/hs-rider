package y0;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import g.v;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends d {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f3306c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f3307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3308f;

    public i(OnBackInvokedDispatcher onBackInvokedDispatcher, int i3) {
        OnBackInvokedCallback jVar;
        this.f3306c = onBackInvokedDispatcher;
        this.d = i3;
        if (Build.VERSION.SDK_INT == 33) {
            jVar = new v(2, this);
        } else {
            jVar = new j(this);
        }
        this.f3307e = jVar;
    }

    @Override // y0.d
    public final void b(boolean z2) {
        if (z2 && !this.f3308f) {
            this.f3306c.registerOnBackInvokedCallback(this.d, this.f3307e);
            this.f3308f = true;
        } else if (!z2 && this.f3308f) {
            this.f3306c.unregisterOnBackInvokedCallback(this.f3307e);
            this.f3308f = false;
        }
    }
}
