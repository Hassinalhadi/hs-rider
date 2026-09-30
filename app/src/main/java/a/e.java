package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.i f14g;

    public /* synthetic */ e(g.i iVar, int i3) {
        this.f13f = i3;
        this.f14g = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, y0.d] */
    @Override // o2.a
    public final Object a() {
        switch (this.f13f) {
            case 0:
                this.f14g.reportFullyDrawn();
                return j2.c.f2207c;
            case 1:
                g.i iVar = this.f14g;
                return new w(iVar.f44k, new e(iVar, 0));
            case 2:
                ?? obj = new Object();
                this.f14g.g().a().b(obj);
                return obj;
            default:
                g.i iVar2 = this.f14g;
                e0 e0Var = new e0(new c(iVar2, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!p2.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new d(iVar2, e0Var, 0));
                    } else {
                        iVar2.f40f.a(new f(e0Var, iVar2));
                    }
                }
                return e0Var;
        }
    }
}
