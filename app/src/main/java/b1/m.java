package b1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f832b;

    public /* synthetic */ m(int i3, Object obj) {
        this.f831a = i3;
        this.f832b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f831a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                n nVar = (n) this.f832b;
                nVar.f841c.setAlpha(floatValue);
                nVar.d.setAlpha(floatValue);
                nVar.f855s.invalidate();
                return;
            case 1:
                ((TextInputLayout) this.f832b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2.j jVar = ((BottomSheetBehavior) this.f832b).f1152i;
                if (jVar != null) {
                    b2.h hVar = jVar.f999g;
                    if (hVar.f989j != floatValue2) {
                        hVar.f989j = floatValue2;
                        jVar.f1002k = true;
                        jVar.f1003l = true;
                        jVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
