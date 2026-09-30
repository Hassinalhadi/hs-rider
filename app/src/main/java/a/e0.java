package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f15a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.b f16b = new j2.b(new o(2, this));

    public e0(Runnable runnable) {
        this.f15a = runnable;
    }

    public final androidx.emoji2.text.w a() {
        return ((d0) this.f16b.a()).f12c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        j2.b bVar = this.f16b;
        ((d0) bVar.a()).f12c.c(new y0.i(onBackInvokedDispatcher, 0), 1);
        ((d0) bVar.a()).f12c.c(new y0.i(onBackInvokedDispatcher, 1000000), 0);
    }
}
