package a;

import android.graphics.Typeface;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(Object obj, Object obj2, int i3) {
        this.f10f = i3;
        this.f11g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10f) {
            case 0:
                g.i iVar = (g.i) this.f11g;
                iVar.f40f.a(new f((e0) this.h, iVar));
                return;
            case 1:
                ((b0.b) this.f11g).h((Typeface) this.h);
                return;
            default:
                g.n nVar = (g.n) this.f11g;
                try {
                    ((Runnable) this.h).run();
                    return;
                } finally {
                    nVar.a();
                }
        }
    }
}
