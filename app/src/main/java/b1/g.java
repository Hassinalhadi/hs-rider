package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f767c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f768e;

    public /* synthetic */ g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f765a = i3;
        this.f768e = jVar;
        this.f766b = hVar;
        this.f767c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f765a) {
            case 0:
                this.f767c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f766b;
                c1 c1Var = hVar.f775a;
                j jVar = this.f768e;
                jVar.c(c1Var);
                jVar.f801r.remove(hVar.f775a);
                jVar.i();
                return;
            default:
                this.f767c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f766b;
                c1 c1Var2 = hVar2.f776b;
                j jVar2 = this.f768e;
                jVar2.c(c1Var2);
                jVar2.f801r.remove(hVar2.f776b);
                jVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f765a) {
            case 0:
                this.f768e.getClass();
                return;
            default:
                this.f768e.getClass();
                return;
        }
    }
}
