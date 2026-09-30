package e2;

import android.animation.ValueAnimator;
import android.view.View;
import g.m0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1427a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1428b;

    public /* synthetic */ h(androidx.emoji2.text.m mVar, View view) {
        this.f1428b = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f1427a;
        Object obj = this.f1428b;
        switch (i3) {
            case 0:
                ((m) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((m0) ((androidx.emoji2.text.m) obj).f299g).d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ h(m mVar) {
        this.f1428b = mVar;
    }
}
