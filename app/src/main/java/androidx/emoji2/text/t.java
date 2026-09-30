package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: f, reason: collision with root package name */
    public final Context f311f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.d f312g;
    public final b2.f h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f313i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public Handler f314j;

    /* renamed from: k, reason: collision with root package name */
    public ThreadPoolExecutor f315k;

    /* renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f316l;

    /* renamed from: m, reason: collision with root package name */
    public a.y f317m;

    public t(Context context, g0.d dVar) {
        a.y.n(context, "Context cannot be null");
        this.f311f = context.getApplicationContext();
        this.f312g = dVar;
        this.h = u.d;
    }

    public final void a() {
        synchronized (this.f313i) {
            try {
                this.f317m = null;
                Handler handler = this.f314j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f314j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f316l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f315k = null;
                this.f316l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0.i b() {
        try {
            b2.f fVar = this.h;
            Context context = this.f311f;
            g0.d dVar = this.f312g;
            fVar.getClass();
            g.f a3 = g0.c.a(context, List.of(dVar));
            int i3 = a3.f1705f;
            if (i3 == 0) {
                g0.i[] iVarArr = (g0.i[]) ((List) a3.f1706g).get(0);
                if (iVarArr != null && iVarArr.length != 0) {
                    return iVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + i3 + ")");
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // androidx.emoji2.text.i
    public final void p(a.y yVar) {
        synchronized (this.f313i) {
            this.f317m = yVar;
        }
        synchronized (this.f313i) {
            try {
                if (this.f317m == null) {
                    return;
                }
                if (this.f315k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f316l = threadPoolExecutor;
                    this.f315k = threadPoolExecutor;
                }
                this.f315k.execute(new a.k(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
