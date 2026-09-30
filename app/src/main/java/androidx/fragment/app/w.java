package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w extends a.y implements androidx.lifecycle.p0, androidx.lifecycle.r, c1.f, n0 {

    /* renamed from: f, reason: collision with root package name */
    public final g.i f521f;

    /* renamed from: g, reason: collision with root package name */
    public final g.i f522g;
    public final Handler h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f523i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g.i f524j;

    public w(g.i iVar) {
        this.f524j = iVar;
        Handler handler = new Handler();
        this.f523i = new k0();
        this.f521f = iVar;
        this.f522g = iVar;
        this.h = handler;
    }

    @Override // a.y
    public final View R(int i3) {
        return this.f524j.findViewById(i3);
    }

    @Override // a.y
    public final boolean S() {
        Window window = this.f524j.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // c1.f
    public final c1.d b() {
        return this.f524j.f42i.f1098b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        return this.f524j.e();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f524j.f1717z;
    }

    @Override // androidx.fragment.app.n0
    public final void d() {
    }
}
