package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f752c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f753e;

    public e(j jVar, c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f753e = jVar;
        this.f751b = c1Var;
        this.d = viewPropertyAnimator;
        this.f752c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f750a) {
            case 1:
                this.f752c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f750a) {
            case 0:
                this.d.setListener(null);
                this.f752c.setAlpha(1.0f);
                j jVar = this.f753e;
                c1 c1Var = this.f751b;
                jVar.c(c1Var);
                jVar.f800q.remove(c1Var);
                jVar.i();
                return;
            default:
                this.d.setListener(null);
                j jVar2 = this.f753e;
                c1 c1Var2 = this.f751b;
                jVar2.c(c1Var2);
                jVar2.f798o.remove(c1Var2);
                jVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f750a) {
            case 0:
                this.f753e.getClass();
                return;
            default:
                this.f753e.getClass();
                return;
        }
    }

    public e(j jVar, c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f753e = jVar;
        this.f751b = c1Var;
        this.f752c = view;
        this.d = viewPropertyAnimator;
    }
}
