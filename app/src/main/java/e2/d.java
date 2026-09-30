package e2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f1416e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1417f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1418g;
    public final TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f1419i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f1420j;

    /* renamed from: k, reason: collision with root package name */
    public final a f1421k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1422l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1423m;

    public d(q qVar) {
        super(qVar);
        this.f1420j = new com.google.android.material.datepicker.n(1, this);
        this.f1421k = new a(this, 0);
        this.f1416e = k2.h.R(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1417f = k2.h.R(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f1418g = k2.h.S(qVar.getContext(), R.attr.motionEasingLinearInterpolator, j1.a.f2193a);
        this.h = k2.h.S(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, j1.a.d);
    }

    @Override // e2.r
    public final void a() {
        if (this.f1473b.f1466u != null) {
            return;
        }
        s(t());
    }

    @Override // e2.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // e2.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // e2.r
    public final View.OnFocusChangeListener e() {
        return this.f1421k;
    }

    @Override // e2.r
    public final View.OnClickListener f() {
        return this.f1420j;
    }

    @Override // e2.r
    public final View.OnFocusChangeListener g() {
        return this.f1421k;
    }

    @Override // e2.r
    public final void l(EditText editText) {
        this.f1419i = editText;
        this.f1472a.setEndIconVisible(t());
    }

    @Override // e2.r
    public final void o(boolean z2) {
        if (this.f1473b.f1466u == null) {
            return;
        }
        s(z2);
    }

    @Override // e2.r
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f1417f);
        final int i3 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f1413b;

            {
                this.f1413b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        this.f1413b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1413b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1418g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f1416e;
        ofFloat2.setDuration(i4);
        final int i5 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f1413b;

            {
                this.f1413b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        this.f1413b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1413b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1422l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1422l.addListener(new c(this, i5));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i4);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f1413b;

            {
                this.f1413b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        this.f1413b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1413b.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f1423m = ofFloat3;
        ofFloat3.addListener(new c(this, i3));
    }

    @Override // e2.r
    public final void r() {
        EditText editText = this.f1419i;
        if (editText != null) {
            editText.post(new a.k(5, this));
        }
    }

    public final void s(boolean z2) {
        boolean z3;
        if (this.f1473b.d() == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && !this.f1422l.isRunning()) {
            this.f1423m.cancel();
            this.f1422l.start();
            if (z3) {
                this.f1422l.end();
                return;
            }
            return;
        }
        if (!z2) {
            this.f1422l.cancel();
            this.f1423m.start();
            if (z3) {
                this.f1423m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.f1419i;
        if (editText != null) {
            if ((editText.hasFocus() || this.d.hasFocus()) && this.f1419i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
