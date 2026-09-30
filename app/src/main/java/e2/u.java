package e2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1482c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1483e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1484f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1485g;
    public final TextInputLayout h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1486i;

    /* renamed from: j, reason: collision with root package name */
    public int f1487j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1488k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1489l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1490m;

    /* renamed from: n, reason: collision with root package name */
    public int f1491n;

    /* renamed from: o, reason: collision with root package name */
    public int f1492o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1493p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1494q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1495r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1496s;

    /* renamed from: t, reason: collision with root package name */
    public int f1497t;

    /* renamed from: u, reason: collision with root package name */
    public int f1498u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1499v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1500w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1501x;

    /* renamed from: y, reason: collision with root package name */
    public z0 f1502y;

    /* renamed from: z, reason: collision with root package name */
    public int f1503z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1485g = context;
        this.h = textInputLayout;
        this.f1490m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1480a = k2.h.R(context, R.attr.motionDurationShort4, 217);
        this.f1481b = k2.h.R(context, R.attr.motionDurationMedium4, 167);
        this.f1482c = k2.h.R(context, R.attr.motionDurationShort4, 167);
        this.d = k2.h.S(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, j1.a.d);
        LinearInterpolator linearInterpolator = j1.a.f2193a;
        this.f1483e = k2.h.S(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1484f = k2.h.S(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i3) {
        if (this.f1486i == null && this.f1488k == null) {
            Context context = this.f1485g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1486i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1486i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1488k = new FrameLayout(context);
            this.f1486i.addView(this.f1488k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i3 != 0 && i3 != 1) {
            this.f1486i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f1488k.setVisibility(0);
            this.f1488k.addView(z0Var);
        }
        this.f1486i.setVisibility(0);
        this.f1487j++;
    }

    public final void b() {
        if (this.f1486i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1485g;
                boolean A = k2.h.A(context);
                LinearLayout linearLayout = this.f1486i;
                int paddingStart = editText.getPaddingStart();
                if (A) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (A) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (A) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1489l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, z0 z0Var, int i3, int i4, int i5) {
        boolean z3;
        float f3;
        long j3;
        TimeInterpolator timeInterpolator;
        if (z0Var != null && z2) {
            if (i3 == i5 || i3 == i4) {
                if (i5 == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.ALPHA, f3);
                int i6 = this.f1482c;
                if (z3) {
                    j3 = this.f1481b;
                } else {
                    j3 = i6;
                }
                ofFloat.setDuration(j3);
                if (z3) {
                    timeInterpolator = this.f1483e;
                } else {
                    timeInterpolator = this.f1484f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i3 == i5 && i4 != 0) {
                    ofFloat.setStartDelay(i6);
                }
                arrayList.add(ofFloat);
                if (i5 == i3 && i4 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.TRANSLATION_Y, -this.f1490m, 0.0f);
                    ofFloat2.setDuration(this.f1480a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay(i6);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            return this.f1502y;
        }
        return this.f1495r;
    }

    public final void f() {
        this.f1493p = null;
        c();
        if (this.f1491n == 1) {
            if (this.f1501x && !TextUtils.isEmpty(this.f1500w)) {
                this.f1492o = 2;
            } else {
                this.f1492o = 0;
            }
        }
        i(this.f1491n, this.f1492o, h(this.f1495r, ""));
    }

    public final void g(z0 z0Var, int i3) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1486i;
        if (linearLayout != null) {
            if ((i3 == 0 || i3 == 1) && (frameLayout = this.f1488k) != null) {
                frameLayout.removeView(z0Var);
            } else {
                linearLayout.removeView(z0Var);
            }
            int i4 = this.f1487j - 1;
            this.f1487j = i4;
            LinearLayout linearLayout2 = this.f1486i;
            if (i4 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f1492o != this.f1491n || z0Var == null || !TextUtils.equals(z0Var.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i3, int i4, boolean z2) {
        TextView e3;
        TextView e4;
        u uVar = this;
        if (i3 == i4) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            uVar.f1489l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar.d(arrayList, uVar.f1501x, uVar.f1502y, 2, i3, i4);
            uVar.d(arrayList, uVar.f1494q, uVar.f1495r, 1, i3, i4);
            int size = arrayList.size();
            long j3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Animator animator = (Animator) arrayList.get(i5);
                j3 = Math.max(j3, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j3);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            s sVar = new s(this, i4, e(i3), i3, uVar.e(i4));
            uVar = this;
            animatorSet.addListener(sVar);
            animatorSet.start();
        } else if (i3 != i4) {
            if (i4 != 0 && (e4 = uVar.e(i4)) != null) {
                e4.setVisibility(0);
                e4.setAlpha(1.0f);
            }
            if (i3 != 0 && (e3 = e(i3)) != null) {
                e3.setVisibility(4);
                if (i3 == 1) {
                    e3.setText((CharSequence) null);
                }
            }
            uVar.f1491n = i4;
        }
        TextInputLayout textInputLayout = uVar.h;
        textInputLayout.t();
        textInputLayout.w(z2, false);
        textInputLayout.z();
    }
}
