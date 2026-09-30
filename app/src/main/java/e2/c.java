package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1415b;

    public /* synthetic */ c(d dVar, int i3) {
        this.f1414a = i3;
        this.f1415b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1414a) {
            case 1:
                this.f1415b.f1473b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1414a) {
            case 0:
                this.f1415b.f1473b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
