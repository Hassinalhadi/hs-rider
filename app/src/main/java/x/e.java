package x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3275f;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f3275f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f3275f.p(0);
        return true;
    }
}
