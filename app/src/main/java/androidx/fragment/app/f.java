package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f380c;
    public final /* synthetic */ v0 d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f381e;

    public f(ViewGroup viewGroup, View view, boolean z2, v0 v0Var, i iVar) {
        this.f378a = viewGroup;
        this.f379b = view;
        this.f380c = z2;
        this.d = v0Var;
        this.f381e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f378a;
        View view = this.f379b;
        viewGroup.endViewTransition(view);
        boolean z2 = this.f380c;
        v0 v0Var = this.d;
        if (z2) {
            w0.a(view, v0Var.f515a);
        }
        this.f381e.d();
        if (k0.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has ended.");
        }
    }
}
