package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1621b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1622c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1624f = false;
    public final boolean d = true;

    public y(View view, int i3) {
        this.f1620a = view;
        this.f1621b = i3;
        this.f1622c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // f1.l
    public final void c(n nVar) {
        nVar.x(this);
    }

    @Override // f1.l
    public final void d() {
        g(false);
        if (!this.f1624f) {
            b bVar = w.f1619a;
            this.f1620a.setTransitionVisibility(this.f1621b);
        }
    }

    @Override // f1.l
    public final void e() {
        g(true);
        if (!this.f1624f) {
            b bVar = w.f1619a;
            this.f1620a.setTransitionVisibility(0);
        }
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (this.d && this.f1623e != z2 && (viewGroup = this.f1622c) != null) {
            this.f1623e = z2;
            v.b(viewGroup, z2);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1624f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            if (!this.f1624f) {
                b bVar = w.f1619a;
                this.f1620a.setTransitionVisibility(this.f1621b);
                ViewGroup viewGroup = this.f1622c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            b bVar = w.f1619a;
            this.f1620a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.f1622c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1624f) {
            b bVar = w.f1619a;
            this.f1620a.setTransitionVisibility(this.f1621b);
            ViewGroup viewGroup = this.f1622c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // f1.l
    public final void a(n nVar) {
    }

    @Override // f1.l
    public final void b(n nVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
