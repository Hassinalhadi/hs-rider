package e2;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.p0;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q extends LinearLayout {
    public final n A;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f1452f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f1453g;
    public final CheckableImageButton h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f1454i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f1455j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f1456k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckableImageButton f1457l;

    /* renamed from: m, reason: collision with root package name */
    public final p f1458m;

    /* renamed from: n, reason: collision with root package name */
    public int f1459n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f1460o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f1461p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f1462q;

    /* renamed from: r, reason: collision with root package name */
    public int f1463r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f1464s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f1465t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f1466u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f1467v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1468w;

    /* renamed from: x, reason: collision with root package name */
    public EditText f1469x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1470y;

    /* renamed from: z, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f1471z;

    public q(TextInputLayout textInputLayout, androidx.emoji2.text.s sVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1459n = 0;
        this.f1460o = new LinkedHashSet();
        this.A = new n(this);
        o oVar = new o(this);
        this.f1470y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1452f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1453g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a3 = a(this, from, R.id.text_input_error_icon);
        this.h = a3;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f1457l = a4;
        this.f1458m = new p(this, sVar);
        z0 z0Var = new z0(getContext(), null);
        this.f1467v = z0Var;
        TypedArray typedArray = (TypedArray) sVar.f310c;
        if (typedArray.hasValue(38)) {
            this.f1454i = k2.h.m(getContext(), sVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1455j = w1.j.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(sVar.i(37));
        }
        a3.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a3.setImportantForAccessibility(2);
        a3.setClickable(false);
        a3.setPressable(false);
        a3.setCheckable(false);
        a3.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f1461p = k2.h.m(getContext(), sVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1462q = w1.j.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f1461p = k2.h.m(getContext(), sVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f1462q = w1.j.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f1463r) {
                this.f1463r = dimensionPixelSize;
                a4.setMinimumWidth(dimensionPixelSize);
                a4.setMinimumHeight(dimensionPixelSize);
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType u2 = a.y.u(typedArray.getInt(31, -1));
                this.f1464s = u2;
                a4.setScaleType(u2);
                a3.setScaleType(u2);
            }
            z0Var.setVisibility(8);
            z0Var.setId(R.id.textinput_suffix_text);
            z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            z0Var.setAccessibilityLiveRegion(1);
            z0Var.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                z0Var.setTextColor(sVar.h(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.f1466u = TextUtils.isEmpty(text3) ? null : text3;
            z0Var.setText(text3);
            n();
            frameLayout.addView(a4);
            addView(z0Var);
            addView(frameLayout);
            addView(a3);
            textInputLayout.f1336k0.add(oVar);
            if (textInputLayout.f1333j != null) {
                oVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new p0(1, this));
            return;
        }
        a.b.m("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i3);
        if (k2.h.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r eVar;
        int i3 = this.f1459n;
        p pVar = this.f1458m;
        SparseArray sparseArray = pVar.f1449a;
        r rVar = (r) sparseArray.get(i3);
        if (rVar == null) {
            q qVar = pVar.f1450b;
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                eVar = new m(qVar);
                            } else {
                                a.b.m(w0.d("Invalid end icon mode: ", i3));
                                return null;
                            }
                        } else {
                            eVar = new d(qVar);
                        }
                    } else {
                        eVar = new y(qVar, pVar.d);
                    }
                } else {
                    eVar = new e(qVar, 1);
                }
            } else {
                eVar = new e(qVar, 0);
            }
            sparseArray.append(i3, eVar);
            return eVar;
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f1457l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.f1467v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.f1453g.getVisibility() == 0 && this.f1457l.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b3 = b();
        boolean j3 = b3.j();
        CheckableImageButton checkableImageButton = this.f1457l;
        boolean z5 = true;
        if (j3 && (z4 = checkableImageButton.f1294i) != b3.k()) {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        } else {
            z3 = false;
        }
        if ((b3 instanceof m) && (isActivated = checkableImageButton.isActivated()) != ((m) b3).f1440l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z5 = z3;
        }
        if (!z2 && !z5) {
            return;
        }
        a.y.Z(this.f1452f, checkableImageButton, this.f1461p);
    }

    public final void g(int i3) {
        boolean z2;
        Drawable drawable;
        if (this.f1459n == i3) {
            return;
        }
        r b3 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f1471z;
        AccessibilityManager accessibilityManager = this.f1470y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.f1471z = null;
        b3.r();
        this.f1459n = i3;
        Iterator it = this.f1460o.iterator();
        if (!it.hasNext()) {
            if (i3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            h(z2);
            r b4 = b();
            int i4 = this.f1458m.f1451c;
            if (i4 == 0) {
                i4 = b4.d();
            }
            if (i4 != 0) {
                drawable = a.y.B(getContext(), i4);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f1457l;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f1452f;
            if (drawable != null) {
                a.y.h(textInputLayout, checkableImageButton, this.f1461p, this.f1462q);
                a.y.Z(textInputLayout, checkableImageButton, this.f1461p);
            }
            int c3 = b4.c();
            if (c3 != 0) {
                charSequence = getResources().getText(c3);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b4.j());
            if (b4.i(textInputLayout.getBoxBackgroundMode())) {
                b4.q();
                AccessibilityManager.TouchExplorationStateChangeListener h = b4.h();
                this.f1471z = h;
                if (h != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.f1471z);
                }
                View.OnClickListener f3 = b4.f();
                View.OnLongClickListener onLongClickListener = this.f1465t;
                checkableImageButton.setOnClickListener(f3);
                a.y.b0(checkableImageButton, onLongClickListener);
                EditText editText = this.f1469x;
                if (editText != null) {
                    b4.l(editText);
                    j(b4);
                }
                a.y.h(textInputLayout, checkableImageButton, this.f1461p, this.f1462q);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
        }
        it.next().getClass();
        a.b.c();
    }

    public final void h(boolean z2) {
        int i3;
        if (d() != z2) {
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            this.f1457l.setVisibility(i3);
            k();
            m();
            this.f1452f.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        l();
        a.y.h(this.f1452f, checkableImageButton, this.f1454i, this.f1455j);
    }

    public final void j(r rVar) {
        if (this.f1469x != null) {
            if (rVar.e() != null) {
                this.f1469x.setOnFocusChangeListener(rVar.e());
            }
            if (rVar.g() != null) {
                this.f1457l.setOnFocusChangeListener(rVar.g());
            }
        }
    }

    public final void k() {
        int i3;
        boolean z2;
        int i4 = 8;
        if (this.f1457l.getVisibility() == 0 && !e()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f1453g.setVisibility(i3);
        if (this.f1466u != null && !this.f1468w) {
            z2 = false;
        } else {
            z2 = 8;
        }
        if (d() || e() || !z2) {
            i4 = 0;
        }
        setVisibility(i4);
    }

    public final void l() {
        int i3;
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1452f;
        if (drawable != null && textInputLayout.f1345p.f1494q && textInputLayout.o()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        checkableImageButton.setVisibility(i3);
        k();
        m();
        if (this.f1459n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i3;
        TextInputLayout textInputLayout = this.f1452f;
        if (textInputLayout.f1333j == null) {
            return;
        }
        if (!d() && !e()) {
            i3 = textInputLayout.f1333j.getPaddingEnd();
        } else {
            i3 = 0;
        }
        this.f1467v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1333j.getPaddingTop(), i3, textInputLayout.f1333j.getPaddingBottom());
    }

    public final void n() {
        int i3;
        z0 z0Var = this.f1467v;
        int visibility = z0Var.getVisibility();
        boolean z2 = false;
        if (this.f1466u != null && !this.f1468w) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        if (visibility != i3) {
            r b3 = b();
            if (i3 == 0) {
                z2 = true;
            }
            b3.o(z2);
        }
        k();
        z0Var.setVisibility(i3);
        this.f1452f.s();
    }
}
