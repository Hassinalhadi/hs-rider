package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.f f1576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1577b;

    public j(n nVar, n.f fVar) {
        this.f1577b = nVar;
        this.f1576a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1576a.remove(animator);
        this.f1577b.f1599s.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1577b.f1599s.add(animator);
    }
}
