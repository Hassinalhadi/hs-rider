package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1 f2354g;

    public /* synthetic */ p1(q1 q1Var, int i3) {
        this.f2353f = i3;
        this.f2354g = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2353f) {
            case 0:
                ViewParent parent = this.f2354g.f2367i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                q1 q1Var = this.f2354g;
                q1Var.a();
                View view = q1Var.f2367i;
                if (view.isEnabled() && !view.isLongClickable() && q1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    q1Var.f2370l = true;
                    return;
                }
                return;
        }
    }
}
