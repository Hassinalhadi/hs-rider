package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p0 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f463g;

    public /* synthetic */ p0(int i3, Object obj) {
        this.f462f = i3;
        this.f463g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f462f;
        Object obj = this.f463g;
        switch (i3) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = j0.j0.f2160a;
                j0.a0.b(view2);
                return;
            case 1:
                e2.q qVar = (e2.q) obj;
                AccessibilityManager accessibilityManager = qVar.f1470y;
                if (qVar.f1471z != null && accessibilityManager != null && qVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(qVar.f1471z);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f462f) {
            case 0:
                return;
            case 1:
                e2.q qVar = (e2.q) this.f463g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = qVar.f1471z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = qVar.f1470y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 2:
                j.g gVar = (j.g) this.f463g;
                ViewTreeObserver viewTreeObserver = gVar.C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.C = view.getViewTreeObserver();
                    }
                    gVar.C.removeGlobalOnLayoutListener(gVar.f2047n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                j.d0 d0Var = (j.d0) this.f463g;
                ViewTreeObserver viewTreeObserver2 = d0Var.f2028t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f2028t = view.getViewTreeObserver();
                    }
                    d0Var.f2028t.removeGlobalOnLayoutListener(d0Var.f2022n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f463g;
                l1.a aVar = hideBottomViewOnScrollBehavior.h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f1123g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f463g;
                l1.a aVar2 = hideViewOnScrollBehavior.f1129c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f1128b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f1129c = null;
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
