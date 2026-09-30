package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: f, reason: collision with root package name */
    public final long f30f = SystemClock.uptimeMillis() + 10000;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f31g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g.i f32i;

    public l(g.i iVar) {
        this.f32i = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f31g = runnable;
        View decorView = this.f32i.getWindow().getDecorView();
        decorView.getClass();
        if (this.h) {
            if (p2.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new k(0, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f31g;
        if (runnable != null) {
            runnable.run();
            this.f31g = null;
            w wVar = (w) this.f32i.f45l.a();
            synchronized (wVar.f65a) {
                z2 = wVar.f66b;
            }
            if (z2) {
                this.h = false;
                this.f32i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f30f) {
            this.h = false;
            this.f32i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
