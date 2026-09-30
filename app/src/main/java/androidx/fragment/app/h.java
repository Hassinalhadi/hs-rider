package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f388c;
    public final /* synthetic */ i d;

    public h(View view, ViewGroup viewGroup, i iVar, v0 v0Var) {
        this.f386a = v0Var;
        this.f387b = viewGroup;
        this.f388c = view;
        this.d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f387b.post(new g(0, this));
        if (k0.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f386a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (k0.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f386a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
