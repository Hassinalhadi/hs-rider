package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1477c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f1478e;

    public s(u uVar, int i3, TextView textView, int i4, TextView textView2) {
        this.f1478e = uVar;
        this.f1475a = i3;
        this.f1476b = textView;
        this.f1477c = i4;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i3 = this.f1475a;
        u uVar = this.f1478e;
        uVar.f1491n = i3;
        uVar.f1489l = null;
        TextView textView = this.f1476b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1477c == 1 && (z0Var = uVar.f1495r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
