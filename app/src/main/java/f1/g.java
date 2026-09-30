package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f1574a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1575b = false;

    public g(View view) {
        this.f1574a = view;
    }

    @Override // f1.l
    public final void d() {
        float f3;
        View view = this.f1574a;
        if (view.getVisibility() == 0) {
            b bVar = w.f1619a;
            f3 = view.getTransitionAlpha();
        } else {
            f3 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f3));
    }

    @Override // f1.l
    public final void e() {
        this.f1574a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        b bVar = w.f1619a;
        this.f1574a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f1575b;
        View view = this.f1574a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (!z2) {
            b bVar = w.f1619a;
            view.setTransitionAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1574a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f1575b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // f1.l
    public final void a(n nVar) {
    }

    @Override // f1.l
    public final void b(n nVar) {
    }

    @Override // f1.l
    public final void c(n nVar) {
    }

    @Override // f1.l
    public final void f(n nVar) {
    }
}
