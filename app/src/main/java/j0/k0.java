package j0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2167a;

    public k0(View view) {
        this.f2167a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f2167a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f2167a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j3) {
        View view = (View) this.f2167a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(l0 l0Var) {
        View view = (View) this.f2167a.get();
        if (view != null) {
            if (l0Var != null) {
                view.animate().setListener(new e2.l(l0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f2167a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
