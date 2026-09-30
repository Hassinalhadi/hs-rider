package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f760c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f762f;

    public f(j jVar, c1 c1Var, int i3, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f762f = jVar;
        this.f758a = c1Var;
        this.f759b = i3;
        this.f760c = view;
        this.d = i4;
        this.f761e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f759b;
        View view = this.f760c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f761e.setListener(null);
        j jVar = this.f762f;
        c1 c1Var = this.f758a;
        jVar.c(c1Var);
        jVar.f799p.remove(c1Var);
        jVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f762f.getClass();
    }
}
