package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1625a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1626b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1627c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1628e;

    public z(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f1628e = hVar;
        this.f1625a = viewGroup;
        this.f1626b = view;
        this.f1627c = view2;
    }

    @Override // f1.l
    public final void b(n nVar) {
        if (this.d) {
            g();
        }
    }

    @Override // f1.l
    public final void c(n nVar) {
        nVar.x(this);
    }

    public final void g() {
        this.f1627c.setTag(R.id.save_overlay_view, null);
        this.f1625a.getOverlay().remove(this.f1626b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            g();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1625a.getOverlay().remove(this.f1626b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f1626b;
        if (view.getParent() == null) {
            this.f1625a.getOverlay().add(view);
        } else {
            this.f1628e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f1627c;
            View view2 = this.f1626b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f1625a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // f1.l
    public final void a(n nVar) {
    }

    @Override // f1.l
    public final void d() {
    }

    @Override // f1.l
    public final void e() {
    }
}
