package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f823a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f824b;

    public l(n nVar) {
        this.f824b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f823a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f823a) {
            this.f823a = false;
            return;
        }
        n nVar = this.f824b;
        if (((Float) nVar.f862z.getAnimatedValue()).floatValue() == 0.0f) {
            nVar.A = 0;
            nVar.f(0);
        } else {
            nVar.A = 2;
            nVar.f855s.invalidate();
        }
    }
}
