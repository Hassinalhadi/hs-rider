package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import j0.l0;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1433b;

    public l(l0 l0Var, View view) {
        this.f1432a = 3;
        this.f1433b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1432a) {
            case 3:
                ((l0) this.f1433b).c();
                return;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1433b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f142o = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1432a) {
            case 0:
                m mVar = (m) this.f1433b;
                mVar.p();
                mVar.f1446r.start();
                return;
            case 1:
                ((f1.n) this.f1433b).m();
                animator.removeListener(this);
                return;
            case 2:
                g1.f fVar = (g1.f) this.f1433b;
                ArrayList arrayList = new ArrayList(fVar.f1822j);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ColorStateList colorStateList = ((q1.a) arrayList.get(i3)).f2784b.f2796t;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                return;
            case 3:
                ((l0) this.f1433b).a();
                return;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1433b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f142o = false;
                return;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.f1433b).f1126k = null;
                return;
            default:
                ((HideViewOnScrollBehavior) this.f1433b).f1135k = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1432a) {
            case 2:
                g1.f fVar = (g1.f) this.f1433b;
                ArrayList arrayList = new ArrayList(fVar.f1822j);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    q1.c cVar = ((q1.a) arrayList.get(i3)).f2784b;
                    ColorStateList colorStateList = cVar.f2796t;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(cVar.f2800x, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 3:
                ((l0) this.f1433b).g();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ l(int i3, Object obj) {
        this.f1432a = i3;
        this.f1433b = obj;
    }
}
