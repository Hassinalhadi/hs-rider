package l1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.a f2496c;

    public /* synthetic */ a(x.a aVar, View view, int i3) {
        this.f2494a = i3;
        this.f2496c = aVar;
        this.f2495b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        switch (this.f2494a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2496c;
                if (z2 && hideBottomViewOnScrollBehavior.f1125j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f2495b);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2496c;
                if (z2 && hideViewOnScrollBehavior.f1134j == 1) {
                    hideViewOnScrollBehavior.s(this.f2495b);
                    return;
                }
                return;
        }
    }
}
