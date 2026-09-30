package com.google.android.material.textfield;

import a.b;
import a.k;
import a.y;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.emoji2.text.s;
import b2.f;
import b2.i;
import b2.j;
import b2.m;
import b2.n;
import com.google.android.material.internal.CheckableImageButton;
import e2.a0;
import e2.b0;
import e2.c0;
import e2.d0;
import e2.g;
import e2.o;
import e2.q;
import e2.t;
import e2.u;
import e2.x;
import e2.z;
import f1.h;
import f1.r;
import g2.a;
import j0.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.h1;
import k.z0;
import w1.c;
import w1.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final c B0;
    public h C;
    public boolean C0;
    public h D;
    public boolean D0;
    public ColorStateList E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public j L;
    public j M;
    public StateListDrawable N;
    public boolean O;
    public j P;
    public j Q;
    public n R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1323b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1324c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f1325d0;
    public final Rect e0;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f1326f;

    /* renamed from: f0, reason: collision with root package name */
    public final Rect f1327f0;

    /* renamed from: g, reason: collision with root package name */
    public final z f1328g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f1329g0;
    public final q h;

    /* renamed from: h0, reason: collision with root package name */
    public Typeface f1330h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f1331i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorDrawable f1332i0;

    /* renamed from: j, reason: collision with root package name */
    public EditText f1333j;

    /* renamed from: j0, reason: collision with root package name */
    public int f1334j0;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1335k;

    /* renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f1336k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1337l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorDrawable f1338l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1339m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1340m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1341n;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f1342n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1343o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f1344o0;

    /* renamed from: p, reason: collision with root package name */
    public final u f1345p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1346p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1347q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1348q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1349r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1350r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1351s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1352s0;

    /* renamed from: t, reason: collision with root package name */
    public c0 f1353t;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f1354t0;

    /* renamed from: u, reason: collision with root package name */
    public z0 f1355u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1356u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1357v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1358v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1359w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1360w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1361x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1362x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1363y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1364y0;

    /* renamed from: z, reason: collision with root package name */
    public z0 f1365z;

    /* renamed from: z0, reason: collision with root package name */
    public int f1366z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.logistics.rider.lsposed.R.attr.textInputStyle, com.logistics.rider.lsposed.R.style.Widget_Design_TextInputLayout), attributeSet, com.logistics.rider.lsposed.R.attr.textInputStyle);
        this.f1337l = -1;
        this.f1339m = -1;
        this.f1341n = -1;
        this.f1343o = -1;
        this.f1345p = new u(this);
        this.f1353t = new b(9);
        this.e0 = new Rect();
        this.f1327f0 = new Rect();
        this.f1329g0 = new RectF();
        this.f1336k0 = new LinkedHashSet();
        c cVar = new c(this);
        this.B0 = cVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1326f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = j1.a.f2193a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.f3205g != 8388659) {
            cVar.f3205g = 8388659;
            cVar.j(false);
        }
        w1.j.a(context2, attributeSet, com.logistics.rider.lsposed.R.attr.textInputStyle, com.logistics.rider.lsposed.R.style.Widget_Design_TextInputLayout);
        int[] iArr = i1.a.D;
        w1.j.b(context2, attributeSet, iArr, com.logistics.rider.lsposed.R.attr.textInputStyle, com.logistics.rider.lsposed.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.lsposed.R.attr.textInputStyle, com.logistics.rider.lsposed.R.style.Widget_Design_TextInputLayout);
        s sVar = new s(context2, obtainStyledAttributes);
        z zVar = new z(this, sVar);
        this.f1328g = zVar;
        this.I = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.D0 = obtainStyledAttributes.getBoolean(47, true);
        this.C0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.R = n.b(context2, attributeSet, com.logistics.rider.lsposed.R.attr.textInputStyle, com.logistics.rider.lsposed.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1331i = getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1323b0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        m f3 = this.R.f();
        if (dimension >= 0.0f) {
            f3.f1022e = new b2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            f3.f1023f = new b2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f3.f1024g = new b2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f3.h = new b2.a(dimension4);
        }
        this.R = f3.a();
        ColorStateList m3 = k2.h.m(context2, sVar, 7);
        if (m3 != null) {
            int defaultColor = m3.getDefaultColor();
            this.f1356u0 = defaultColor;
            this.f1325d0 = defaultColor;
            if (m3.isStateful()) {
                this.f1358v0 = m3.getColorForState(new int[]{-16842910}, -1);
                this.f1360w0 = m3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1362x0 = m3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1360w0 = this.f1356u0;
                ColorStateList z2 = y.z(context2, com.logistics.rider.lsposed.R.color.mtrl_filled_background_color);
                this.f1358v0 = z2.getColorForState(new int[]{-16842910}, -1);
                this.f1362x0 = z2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1325d0 = 0;
            this.f1356u0 = 0;
            this.f1358v0 = 0;
            this.f1360w0 = 0;
            this.f1362x0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList h = sVar.h(1);
            this.f1346p0 = h;
            this.f1344o0 = h;
        }
        ColorStateList m4 = k2.h.m(context2, sVar, 14);
        this.f1352s0 = obtainStyledAttributes.getColor(14, 0);
        this.f1348q0 = context2.getColor(com.logistics.rider.lsposed.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1364y0 = context2.getColor(com.logistics.rider.lsposed.R.color.mtrl_textinput_disabled_color);
        this.f1350r0 = context2.getColor(com.logistics.rider.lsposed.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m4 != null) {
            setBoxStrokeColorStateList(m4);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(k2.h.m(context2, sVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = sVar.h(24);
        this.H = sVar.h(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i3 = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z4 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1359w = obtainStyledAttributes.getResourceId(22, 0);
        this.f1357v = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.f1357v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1359w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(sVar.h(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(sVar.h(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(sVar.h(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(sVar.h(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(sVar.h(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(sVar.h(59));
        }
        q qVar = new q(this, sVar);
        this.h = qVar;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        sVar.t();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i3;
        EditText editText = this.f1333j;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int k3 = k2.h.k(this.f1333j, com.logistics.rider.lsposed.R.attr.colorControlHighlight);
            int i4 = this.U;
            int[][] iArr = I0;
            if (i4 == 2) {
                Context context = getContext();
                j jVar = this.L;
                TypedValue T = k2.h.T(context, com.logistics.rider.lsposed.R.attr.colorSurface, "TextInputLayout");
                int i5 = T.resourceId;
                if (i5 != 0) {
                    i3 = context.getColor(i5);
                } else {
                    i3 = T.data;
                }
                j jVar2 = new j(jVar.f999g.f982a);
                int C = k2.h.C(k3, i3, 0.1f);
                jVar2.m(new ColorStateList(iArr, new int[]{C, 0}));
                jVar2.setTint(i3);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{C, i3});
                j jVar3 = new j(jVar.f999g.f982a);
                jVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
            }
            if (i4 == 1) {
                j jVar4 = this.L;
                int i6 = this.f1325d0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{k2.h.C(k3, i6, 0.1f), i6}), jVar4, jVar4);
            }
            return null;
        }
        return this.L;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], h(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = h(true);
        }
        return this.M;
    }

    public static void m(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1333j == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1333j = editText;
            int i3 = this.f1337l;
            if (i3 != -1) {
                setMinEms(i3);
            } else {
                setMinWidth(this.f1341n);
            }
            int i4 = this.f1339m;
            if (i4 != -1) {
                setMaxEms(i4);
            } else {
                setMaxWidth(this.f1343o);
            }
            this.O = false;
            k();
            setTextInputAccessibilityDelegate(new b0(this));
            Typeface typeface = this.f1333j.getTypeface();
            c cVar = this.B0;
            cVar.n(typeface);
            float textSize = this.f1333j.getTextSize();
            if (cVar.h != textSize) {
                cVar.h = textSize;
                cVar.j(false);
            }
            float letterSpacing = this.f1333j.getLetterSpacing();
            if (cVar.X != letterSpacing) {
                cVar.X = letterSpacing;
                cVar.j(false);
            }
            int gravity = this.f1333j.getGravity();
            int i5 = (gravity & (-113)) | 48;
            if (cVar.f3205g != i5) {
                cVar.f3205g = i5;
                cVar.j(false);
            }
            if (cVar.f3203f != gravity) {
                cVar.f3203f = gravity;
                cVar.j(false);
            }
            this.f1366z0 = editText.getMinimumHeight();
            this.f1333j.addTextChangedListener(new a0(this, editText));
            if (this.f1344o0 == null) {
                this.f1344o0 = this.f1333j.getHintTextColors();
            }
            if (this.I) {
                if (TextUtils.isEmpty(this.J)) {
                    CharSequence hint = this.f1333j.getHint();
                    this.f1335k = hint;
                    setHint(hint);
                    this.f1333j.setHint((CharSequence) null);
                }
                this.K = true;
            }
            r();
            if (this.f1355u != null) {
                p(this.f1333j.getText());
            }
            t();
            this.f1345p.b();
            this.f1328g.bringToFront();
            q qVar = this.h;
            qVar.bringToFront();
            Iterator it = this.f1336k0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this);
            }
            qVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        b.m("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.J)) {
            this.J = charSequence;
            c cVar = this.B0;
            if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
                cVar.B = charSequence;
                cVar.C = null;
                cVar.j(false);
            }
            if (!this.A0) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1363y == z2) {
            return;
        }
        z0 z0Var = this.f1365z;
        if (z2) {
            if (z0Var != null) {
                this.f1326f.addView(z0Var);
                this.f1365z.setVisibility(0);
            }
        } else {
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.f1365z = null;
        }
        this.f1363y = z2;
    }

    public final void a() {
        if (this.f1333j != null && this.U == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.f1333j;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1333j.getPaddingEnd(), getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else {
                    if (k2.h.A(getContext())) {
                        EditText editText2 = this.f1333j;
                        editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1333j.getPaddingEnd(), getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                        return;
                    }
                    return;
                }
            }
            EditText editText3 = this.f1333j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.B0.f() + this.f1331i), this.f1333j.getPaddingEnd(), getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f1326f;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i3, layoutParams);
    }

    public final void b(float f3) {
        c cVar = this.B0;
        if (cVar.f3197b == f3) {
            return;
        }
        int i3 = 1;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(k2.h.S(getContext(), com.logistics.rider.lsposed.R.attr.motionEasingEmphasizedInterpolator, j1.a.f2194b));
            this.E0.setDuration(k2.h.R(getContext(), com.logistics.rider.lsposed.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new b1.m(i3, this));
        }
        this.E0.setFloatValues(cVar.f3197b, f3);
        this.E0.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i3;
        int i4;
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.f999g.f982a;
        n nVar2 = this.R;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.U == 2 && (i3 = this.W) > -1 && (i4 = this.f1324c0) != 0) {
            j jVar2 = this.L;
            jVar2.f999g.f990k = i3;
            jVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i4);
            b2.h hVar = jVar2.f999g;
            if (hVar.f985e != valueOf2) {
                hVar.f985e = valueOf2;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i5 = this.f1325d0;
        if (this.U == 1) {
            i5 = c0.a.b(this.f1325d0, k2.h.j(getContext(), com.logistics.rider.lsposed.R.attr.colorSurface, 0));
        }
        this.f1325d0 = i5;
        this.L.m(ColorStateList.valueOf(i5));
        j jVar3 = this.P;
        if (jVar3 != null && this.Q != null) {
            if (this.W > -1 && this.f1324c0 != 0) {
                if (this.f1333j.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f1348q0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f1324c0);
                }
                jVar3.m(valueOf);
                this.Q.m(ColorStateList.valueOf(this.f1324c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z2;
        if (this.f1333j != null) {
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = rect.bottom;
            Rect rect2 = this.f1327f0;
            rect2.bottom = i3;
            int i4 = this.U;
            if (i4 != 1) {
                int i5 = rect.left;
                if (i4 != 2) {
                    rect2.left = i(i5, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z2);
                    return rect2;
                }
                rect2.left = this.f1333j.getPaddingLeft() + i5;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.f1333j.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z2);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText = this.f1333j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.f1335k != null) {
            boolean z2 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f1333j.setHint(this.f1335k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
                return;
            } finally {
                this.f1333j.setHint(hint);
                this.K = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i3);
        onProvideAutofillVirtualStructure(viewStructure, i3);
        FrameLayout frameLayout = this.f1326f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i3);
            if (childAt == this.f1333j) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.I;
        c cVar = this.B0;
        if (z2) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.f3202e;
            int save = canvas2.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f3 = cVar.f3219q;
                float f4 = cVar.f3220r;
                float f5 = cVar.F;
                if (f5 != 1.0f) {
                    canvas2.scale(f5, f5, f3, f4);
                }
                if ((cVar.e0 > 1 || cVar.f3204f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.f3219q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f4);
                    float f6 = alpha;
                    textPaint.setAlpha((int) (cVar.f3200c0 * f6));
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        float f7 = cVar.H;
                        float f8 = cVar.I;
                        float f9 = cVar.J;
                        int i4 = cVar.K;
                        textPaint.setShadowLayer(f7, f8, f9, c0.a.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                    }
                    cVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (cVar.f3198b0 * f6));
                    if (i3 >= 31) {
                        float f10 = cVar.H;
                        float f11 = cVar.I;
                        float f12 = cVar.J;
                        int i5 = cVar.K;
                        textPaint.setShadowLayer(f10, f11, f12, c0.a.d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.f3201d0;
                    float f13 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                    if (i3 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String trim = cVar.f3201d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                } else {
                    canvas2.translate(f3, f4);
                    cVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q != null && (jVar = this.P) != null) {
            jVar.draw(canvas2);
            if (this.f1333j.isFocused()) {
                Rect bounds = this.Q.getBounds();
                Rect bounds2 = this.P.getBounds();
                float f14 = cVar.f3197b;
                int centerX = bounds2.centerX();
                bounds.left = j1.a.c(centerX, bounds2.left, f14);
                bounds.right = j1.a.c(centerX, bounds2.right, f14);
                this.Q.draw(canvas2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.F0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.F0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            w1.c r3 = r4.B0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f3212k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f3210j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f1333j
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.F0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.I) {
            int i3 = this.U;
            c cVar = this.B0;
            if (i3 != 0) {
                if (i3 == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (cVar.f() / 2.0f);
                    }
                    float f3 = cVar.f();
                    TextPaint textPaint = cVar.P;
                    textPaint.setTextSize(cVar.f3208i);
                    textPaint.setTypeface(cVar.f3221s);
                    textPaint.setLetterSpacing(cVar.W);
                    return Math.max(0, (int) (f3 - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) cVar.f();
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.h = k2.h.R(getContext(), com.logistics.rider.lsposed.R.attr.motionDurationShort2, 87);
        hVar.f1589i = k2.h.S(getContext(), com.logistics.rider.lsposed.R.attr.motionEasingLinearInterpolator, j1.a.f2193a);
        return hVar;
    }

    public final boolean g() {
        if (this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof g)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1333j;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public j getBoxBackground() {
        int i3 = this.U;
        if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException();
        }
        return this.L;
    }

    public int getBoxBackgroundColor() {
        return this.f1325d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.R;
        RectF rectF = this.f1329g0;
        if (layoutDirection == 1) {
            return nVar.h.a(rectF);
        }
        return nVar.f1034g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.R;
        RectF rectF = this.f1329g0;
        if (layoutDirection == 1) {
            return nVar.f1034g.a(rectF);
        }
        return nVar.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.R;
        RectF rectF = this.f1329g0;
        if (layoutDirection == 1) {
            return nVar.f1032e.a(rectF);
        }
        return nVar.f1033f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.R;
        RectF rectF = this.f1329g0;
        if (layoutDirection == 1) {
            return nVar.f1033f.a(rectF);
        }
        return nVar.f1032e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1352s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1354t0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1323b0;
    }

    public int getCounterMaxLength() {
        return this.f1349r;
    }

    public CharSequence getCounterOverflowDescription() {
        z0 z0Var;
        if (this.f1347q && this.f1351s && (z0Var = this.f1355u) != null) {
            return z0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F;
    }

    public ColorStateList getCounterTextColor() {
        return this.E;
    }

    public ColorStateList getCursorColor() {
        return this.G;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1344o0;
    }

    public EditText getEditText() {
        return this.f1333j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.f1457l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.f1457l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.f1463r;
    }

    public int getEndIconMode() {
        return this.h.f1459n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.f1464s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.f1457l;
    }

    public CharSequence getError() {
        u uVar = this.f1345p;
        if (uVar.f1494q) {
            return uVar.f1493p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1345p.f1497t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1345p.f1496s;
    }

    public int getErrorCurrentTextColors() {
        z0 z0Var = this.f1345p.f1495r;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1345p;
        if (uVar.f1501x) {
            return uVar.f1500w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        z0 z0Var = this.f1345p.f1502y;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.B0;
        return cVar.g(cVar.f3212k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1346p0;
    }

    public c0 getLengthCounter() {
        return this.f1353t;
    }

    public int getMaxEms() {
        return this.f1339m;
    }

    public int getMaxWidth() {
        return this.f1343o;
    }

    public int getMinEms() {
        return this.f1337l;
    }

    public int getMinWidth() {
        return this.f1341n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.f1457l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.f1457l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1363y) {
            return this.f1361x;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A;
    }

    public CharSequence getPrefixText() {
        return this.f1328g.h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1328g.f1521g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1328g.f1521g;
    }

    public n getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1328g.f1522i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1328g.f1522i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1328g.f1525l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1328g.f1526m;
    }

    public CharSequence getSuffixText() {
        return this.h.f1466u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.f1467v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.f1467v;
    }

    public Typeface getTypeface() {
        return this.f1330h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, b2.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, a.y] */
    public final j h(boolean z2) {
        float f3;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i3;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_shape_corner_size_small_component);
        if (z2) {
            f3 = dimensionPixelOffset2;
        } else {
            f3 = 0.0f;
        }
        EditText editText = this.f1333j;
        if (editText instanceof x) {
            dimensionPixelOffset = ((x) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        int i4 = 0;
        f fVar = new f(i4);
        f fVar2 = new f(i4);
        f fVar3 = new f(i4);
        f fVar4 = new f(i4);
        b2.a aVar = new b2.a(f3);
        b2.a aVar2 = new b2.a(f3);
        b2.a aVar3 = new b2.a(dimensionPixelOffset2);
        b2.a aVar4 = new b2.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f1029a = obj;
        obj5.f1030b = obj2;
        obj5.f1031c = obj3;
        obj5.d = obj4;
        obj5.f1032e = aVar;
        obj5.f1033f = aVar2;
        obj5.f1034g = aVar4;
        obj5.h = aVar3;
        obj5.f1035i = fVar;
        obj5.f1036j = fVar2;
        obj5.f1037k = fVar3;
        obj5.f1038l = fVar4;
        EditText editText2 = this.f1333j;
        if (editText2 instanceof x) {
            colorStateList = ((x) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            i[] iVarArr = j.H;
            TypedValue T = k2.h.T(context, com.logistics.rider.lsposed.R.attr.colorSurface, j.class.getSimpleName());
            int i5 = T.resourceId;
            if (i5 != 0) {
                i3 = context.getColor(i5);
            } else {
                i3 = T.data;
            }
            colorStateList = ColorStateList.valueOf(i3);
        }
        j jVar = new j();
        jVar.j(context);
        jVar.m(colorStateList);
        jVar.l(dimensionPixelOffset);
        jVar.setShapeAppearanceModel(obj5);
        b2.h hVar = jVar.f999g;
        if (hVar.h == null) {
            hVar.h = new Rect();
        }
        jVar.f999g.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i3, boolean z2) {
        int compoundPaddingLeft;
        if (!z2 && getPrefixText() != null) {
            compoundPaddingLeft = this.f1328g.a();
        } else if (z2 && getSuffixText() != null) {
            compoundPaddingLeft = this.h.c();
        } else {
            compoundPaddingLeft = this.f1333j.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i3;
    }

    public final int j(int i3, boolean z2) {
        int compoundPaddingRight;
        if (!z2 && getSuffixText() != null) {
            compoundPaddingRight = this.h.c();
        } else if (z2 && getPrefixText() != null) {
            compoundPaddingRight = this.f1328g.a();
        } else {
            compoundPaddingRight = this.f1333j.getCompoundPaddingRight();
        }
        return i3 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [b2.j, e2.g] */
    public final void k() {
        int i3 = this.U;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    if (this.I && !(this.L instanceof g)) {
                        n nVar = this.R;
                        int i4 = g.J;
                        if (nVar == null) {
                            nVar = new n();
                        }
                        e2.f fVar = new e2.f(nVar, new RectF());
                        ?? jVar = new j(fVar);
                        jVar.I = fVar;
                        this.L = jVar;
                    } else {
                        this.L = new j(this.R);
                    }
                    this.P = null;
                    this.Q = null;
                } else {
                    throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.L = new j(this.R);
                this.P = new j();
                this.Q = new j();
            }
        } else {
            this.L = null;
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (k2.h.A(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.f1333j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i5 = this.U;
                if (i5 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i5 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(z0 z0Var, int i3) {
        try {
            z0Var.setTextAppearance(i3);
            if (z0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z0Var.setTextAppearance(com.logistics.rider.lsposed.R.style.TextAppearance_AppCompat_Caption);
        z0Var.setTextColor(getContext().getColor(com.logistics.rider.lsposed.R.color.design_error));
    }

    public final boolean o() {
        u uVar = this.f1345p;
        if (uVar.f1492o == 1 && uVar.f1495r != null && !TextUtils.isEmpty(uVar.f1493p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.h;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.H0 = false;
        if (this.f1333j != null && this.f1333j.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1328g.getMeasuredHeight()))) {
            this.f1333j.setMinimumHeight(max);
            z2 = true;
        }
        boolean s3 = s();
        if (!z2 && !s3) {
            return;
        }
        this.f1333j.post(new k(7, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        float descent;
        int i7;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z2, i3, i4, i5, i6);
        EditText editText = this.f1333j;
        if (editText != null) {
            Rect rect = this.e0;
            d.a(this, editText, rect);
            j jVar = this.P;
            if (jVar != null) {
                int i8 = rect.bottom;
                jVar.setBounds(rect.left, i8 - this.a0, rect.right, i8);
            }
            j jVar2 = this.Q;
            if (jVar2 != null) {
                int i9 = rect.bottom;
                jVar2.setBounds(rect.left, i9 - this.f1323b0, rect.right, i9);
            }
            if (this.I) {
                float textSize = this.f1333j.getTextSize();
                c cVar = this.B0;
                float f3 = cVar.h;
                TextPaint textPaint = cVar.P;
                if (f3 != textSize) {
                    cVar.h = textSize;
                    cVar.j(false);
                }
                int gravity = this.f1333j.getGravity();
                int i10 = (gravity & (-113)) | 48;
                if (cVar.f3205g != i10) {
                    cVar.f3205g = i10;
                    cVar.j(false);
                }
                if (cVar.f3203f != gravity) {
                    cVar.f3203f = gravity;
                    cVar.j(false);
                }
                Rect d = d(rect);
                int i11 = d.left;
                int i12 = d.top;
                int i13 = d.right;
                int i14 = d.bottom;
                Rect rect2 = cVar.d;
                if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
                    rect2.set(i11, i12, i13, i14);
                    cVar.N = true;
                }
                if (this.f1333j != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(cVar.h);
                        textPaint.setTypeface(cVar.f3224v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(cVar.h);
                        textPaint.setTypeface(cVar.f3224v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = cVar.f3214l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.f1333j.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.f1327f0;
                    rect3.left = compoundPaddingLeft;
                    if (this.U == 1 && this.f1333j.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.U == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(cVar.h);
                            textPaint.setTypeface(cVar.f3224v);
                            textPaint.setLetterSpacing(cVar.X);
                            i7 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i7 = 0;
                        }
                        compoundPaddingTop = (this.f1333j.getCompoundPaddingTop() + rect.top) - i7;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.f1333j.getCompoundPaddingRight();
                    if (this.U == 1 && this.f1333j.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.f1333j.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i15 = rect3.left;
                    int i16 = rect3.top;
                    int i17 = rect3.right;
                    Rect rect4 = cVar.f3199c;
                    if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom || true != cVar.f3213k0) {
                        rect4.set(i15, i16, i17, compoundPaddingBottom);
                        cVar.N = true;
                        cVar.f3213k0 = true;
                    }
                    cVar.j(false);
                    if (g() && !this.A0) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        float f3;
        boolean z2;
        EditText editText;
        super.onMeasure(i3, i4);
        boolean z3 = this.H0;
        q qVar = this.h;
        if (!z3) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.f1365z != null && (editText = this.f1333j) != null) {
            this.f1365z.setGravity(editText.getGravity());
            this.f1365z.setPadding(this.f1333j.getCompoundPaddingLeft(), this.f1333j.getCompoundPaddingTop(), this.f1333j.getCompoundPaddingRight(), this.f1333j.getCompoundPaddingBottom());
        }
        qVar.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.f1333j.getMeasuredWidth() - this.f1333j.getCompoundPaddingLeft()) - this.f1333j.getCompoundPaddingRight();
            c cVar = this.B0;
            TextPaint textPaint = cVar.P;
            textPaint.setTextSize(cVar.f3208i);
            textPaint.setTypeface(cVar.f3221s);
            textPaint.setLetterSpacing(cVar.W);
            float f4 = measuredWidth;
            cVar.f3209i0 = cVar.e(cVar.f3204f0, textPaint, cVar.B, (cVar.f3208i / cVar.h) * f4, cVar.D).getHeight();
            textPaint.setTextSize(cVar.h);
            textPaint.setTypeface(cVar.f3224v);
            textPaint.setLetterSpacing(cVar.X);
            cVar.f3211j0 = cVar.e(cVar.e0, textPaint, cVar.B, f4, cVar.D).getHeight();
            EditText editText2 = this.f1333j;
            Rect rect = this.e0;
            d.a(this, editText2, rect);
            Rect d = d(rect);
            int i5 = d.left;
            int i6 = d.top;
            int i7 = d.right;
            int i8 = d.bottom;
            Rect rect2 = cVar.d;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i7 || rect2.bottom != i8) {
                rect2.set(i5, i6, i7, i8);
                cVar.N = true;
            }
            v();
            a();
            if (this.f1333j != null) {
                int i9 = cVar.f3211j0;
                if (i9 != -1) {
                    f3 = i9;
                } else {
                    TextPaint textPaint2 = cVar.P;
                    textPaint2.setTextSize(cVar.h);
                    textPaint2.setTypeface(cVar.f3224v);
                    textPaint2.setLetterSpacing(cVar.X);
                    f3 = -textPaint2.ascent();
                }
                float f5 = 0.0f;
                if (this.f1361x != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.f1365z.getPaint());
                    textPaint3.setTextSize(this.f1365z.getTextSize());
                    textPaint3.setTypeface(this.f1365z.getTypeface());
                    textPaint3.setLetterSpacing(this.f1365z.getLetterSpacing());
                    w1.g gVar = new w1.g(this.f1361x, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    gVar.f3245k = z2;
                    gVar.f3244j = true;
                    float lineSpacingExtra = this.f1365z.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.f1365z.getLineSpacingMultiplier();
                    gVar.f3242g = lineSpacingExtra;
                    gVar.h = lineSpacingMultiplier;
                    gVar.f3247m = new a.c0(this);
                    StaticLayout a3 = gVar.a();
                    if (this.U == 1) {
                        f5 = cVar.f() + this.V + this.f1331i;
                    }
                    f5 += a3.getHeight();
                }
                float max = Math.max(f3, f5);
                if (this.f1333j.getMeasuredHeight() < max) {
                    this.f1333j.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d0 d0Var = (d0) parcelable;
        super.onRestoreInstanceState(d0Var.f2612f);
        setError(d0Var.h);
        if (d0Var.f1424i) {
            post(new androidx.fragment.app.g(6, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, b2.n] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z2 = true;
        if (i3 != 1) {
            z2 = false;
        }
        if (z2 != this.S) {
            b2.d dVar = this.R.f1032e;
            RectF rectF = this.f1329g0;
            float a3 = dVar.a(rectF);
            float a4 = this.R.f1033f.a(rectF);
            float a5 = this.R.h.a(rectF);
            float a6 = this.R.f1034g.a(rectF);
            n nVar = this.R;
            y yVar = nVar.f1029a;
            y yVar2 = nVar.f1030b;
            y yVar3 = nVar.d;
            y yVar4 = nVar.f1031c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            b2.a aVar = new b2.a(a4);
            b2.a aVar2 = new b2.a(a3);
            b2.a aVar3 = new b2.a(a6);
            b2.a aVar4 = new b2.a(a5);
            ?? obj = new Object();
            obj.f1029a = yVar2;
            obj.f1030b = yVar;
            obj.f1031c = yVar3;
            obj.d = yVar4;
            obj.f1032e = aVar;
            obj.f1033f = aVar2;
            obj.f1034g = aVar4;
            obj.h = aVar3;
            obj.f1035i = fVar;
            obj.f1036j = fVar2;
            obj.f1037k = fVar3;
            obj.f1038l = fVar4;
            this.S = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, o0.b, e2.d0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ?? bVar = new o0.b(super.onSaveInstanceState());
        if (o()) {
            bVar.h = getError();
        }
        q qVar = this.h;
        if (qVar.f1459n != 0 && qVar.f1457l.f1294i) {
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.f1424i = z2;
        return bVar;
    }

    public final void p(Editable editable) {
        int i3;
        boolean z2;
        int i4;
        h0.b bVar;
        ((b) this.f1353t).getClass();
        if (editable != null) {
            i3 = editable.length();
        } else {
            i3 = 0;
        }
        boolean z3 = this.f1351s;
        int i5 = this.f1349r;
        String str = null;
        if (i5 == -1) {
            this.f1355u.setText(String.valueOf(i3));
            this.f1355u.setContentDescription(null);
            this.f1351s = false;
        } else {
            if (i3 > i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f1351s = z2;
            Context context = getContext();
            z0 z0Var = this.f1355u;
            int i6 = this.f1349r;
            if (this.f1351s) {
                i4 = com.logistics.rider.lsposed.R.string.character_counter_overflowed_content_description;
            } else {
                i4 = com.logistics.rider.lsposed.R.string.character_counter_content_description;
            }
            z0Var.setContentDescription(context.getString(i4, Integer.valueOf(i3), Integer.valueOf(i6)));
            if (z3 != this.f1351s) {
                q();
            }
            String str2 = h0.b.f1885b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = h0.b.f1887e;
            } else {
                bVar = h0.b.d;
            }
            z0 z0Var2 = this.f1355u;
            String string = getContext().getString(com.logistics.rider.lsposed.R.string.character_counter_pattern, Integer.valueOf(i3), Integer.valueOf(this.f1349r));
            bVar.getClass();
            h0.f fVar = h0.g.f1895a;
            if (string != null) {
                str = bVar.c(string).toString();
            }
            z0Var2.setText(str);
        }
        if (this.f1333j != null && z3 != this.f1351s) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i3;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z0 z0Var = this.f1355u;
        if (z0Var != null) {
            if (this.f1351s) {
                i3 = this.f1357v;
            } else {
                i3 = this.f1359w;
            }
            n(z0Var, i3);
            if (!this.f1351s && (colorStateList2 = this.E) != null) {
                this.f1355u.setTextColor(colorStateList2);
            }
            if (this.f1351s && (colorStateList = this.F) != null) {
                this.f1355u.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue P = k2.h.P(context, com.logistics.rider.lsposed.R.attr.colorControlActivated);
            if (P != null) {
                int i3 = P.resourceId;
                if (i3 != 0) {
                    colorStateList2 = y.z(context, i3);
                } else {
                    int i4 = P.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1333j;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.f1333j.getTextCursorDrawable().mutate();
            if ((o() || (this.f1355u != null && this.f1351s)) && (colorStateList = this.H) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f1325d0 != i3) {
            this.f1325d0 = i3;
            this.f1356u0 = i3;
            this.f1360w0 = i3;
            this.f1362x0 = i3;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(getContext().getColor(i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1356u0 = defaultColor;
        this.f1325d0 = defaultColor;
        this.f1358v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1360w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1362x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 != this.U) {
            this.U = i3;
            if (this.f1333j != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.V = i3;
    }

    public void setBoxCornerFamily(int i3) {
        m f3 = this.R.f();
        b2.d dVar = this.R.f1032e;
        f3.f1019a = y.x(i3);
        f3.f1022e = dVar;
        b2.d dVar2 = this.R.f1033f;
        f3.f1020b = y.x(i3);
        f3.f1023f = dVar2;
        b2.d dVar3 = this.R.h;
        f3.d = y.x(i3);
        f3.h = dVar3;
        b2.d dVar4 = this.R.f1034g;
        f3.f1021c = y.x(i3);
        f3.f1024g = dVar4;
        this.R = f3.a();
        c();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f1352s0 != i3) {
            this.f1352s0 = i3;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1348q0 = colorStateList.getDefaultColor();
            this.f1364y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1350r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1352s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1352s0 != colorStateList.getDefaultColor()) {
            this.f1352s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1354t0 != colorStateList) {
            this.f1354t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.a0 = i3;
        z();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.f1323b0 = i3;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1347q != z2) {
            u uVar = this.f1345p;
            Editable editable = null;
            if (z2) {
                z0 z0Var = new z0(getContext(), null);
                this.f1355u = z0Var;
                z0Var.setId(com.logistics.rider.lsposed.R.id.textinput_counter);
                Typeface typeface = this.f1330h0;
                if (typeface != null) {
                    this.f1355u.setTypeface(typeface);
                }
                this.f1355u.setMaxLines(1);
                uVar.a(this.f1355u, 2);
                ((ViewGroup.MarginLayoutParams) this.f1355u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1355u != null) {
                    EditText editText = this.f1333j;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                uVar.g(this.f1355u, 2);
                this.f1355u = null;
            }
            this.f1347q = z2;
        }
    }

    public void setCounterMaxLength(int i3) {
        Editable text;
        if (this.f1349r != i3) {
            if (i3 > 0) {
                this.f1349r = i3;
            } else {
                this.f1349r = -1;
            }
            if (this.f1347q && this.f1355u != null) {
                EditText editText = this.f1333j;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f1357v != i3) {
            this.f1357v = i3;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f1359w != i3) {
            this.f1359w = i3;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (!o() && (this.f1355u == null || !this.f1351s)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1344o0 = colorStateList;
        this.f1346p0 = colorStateList;
        if (this.f1333j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.h.f1457l.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.h.f1457l.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i3) {
        CharSequence charSequence;
        q qVar = this.h;
        if (i3 != 0) {
            charSequence = qVar.getResources().getText(i3);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = qVar.f1457l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i3) {
        Drawable drawable;
        q qVar = this.h;
        if (i3 != 0) {
            drawable = y.B(qVar.getContext(), i3);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = qVar.f1452f;
        CheckableImageButton checkableImageButton = qVar.f1457l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            y.h(textInputLayout, checkableImageButton, qVar.f1461p, qVar.f1462q);
            y.Z(textInputLayout, checkableImageButton, qVar.f1461p);
        }
    }

    public void setEndIconMinSize(int i3) {
        q qVar = this.h;
        if (i3 >= 0) {
            if (i3 != qVar.f1463r) {
                qVar.f1463r = i3;
                CheckableImageButton checkableImageButton = qVar.f1457l;
                checkableImageButton.setMinimumWidth(i3);
                checkableImageButton.setMinimumHeight(i3);
                CheckableImageButton checkableImageButton2 = qVar.h;
                checkableImageButton2.setMinimumWidth(i3);
                checkableImageButton2.setMinimumHeight(i3);
                return;
            }
            return;
        }
        qVar.getClass();
        b.m("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i3) {
        this.h.g(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.h;
        CheckableImageButton checkableImageButton = qVar.f1457l;
        View.OnLongClickListener onLongClickListener = qVar.f1465t;
        checkableImageButton.setOnClickListener(onClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.h;
        qVar.f1465t = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f1457l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.h;
        qVar.f1464s = scaleType;
        qVar.f1457l.setScaleType(scaleType);
        qVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.h;
        if (qVar.f1461p != colorStateList) {
            qVar.f1461p = colorStateList;
            y.h(qVar.f1452f, qVar.f1457l, colorStateList, qVar.f1462q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.h;
        if (qVar.f1462q != mode) {
            qVar.f1462q = mode;
            y.h(qVar.f1452f, qVar.f1457l, qVar.f1461p, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.h.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1345p;
        if (!uVar.f1494q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.c();
            uVar.f1493p = charSequence;
            uVar.f1495r.setText(charSequence);
            int i3 = uVar.f1491n;
            if (i3 != 1) {
                uVar.f1492o = 1;
            }
            uVar.i(i3, uVar.f1492o, uVar.h(uVar.f1495r, charSequence));
            return;
        }
        uVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        u uVar = this.f1345p;
        uVar.f1497t = i3;
        z0 z0Var = uVar.f1495r;
        if (z0Var != null) {
            z0Var.setAccessibilityLiveRegion(i3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1345p;
        uVar.f1496s = charSequence;
        z0 z0Var = uVar.f1495r;
        if (z0Var != null) {
            z0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1345p;
        TextInputLayout textInputLayout = uVar.h;
        if (uVar.f1494q == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            z0 z0Var = new z0(uVar.f1485g, null);
            uVar.f1495r = z0Var;
            z0Var.setId(com.logistics.rider.lsposed.R.id.textinput_error);
            uVar.f1495r.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f1495r.setTypeface(typeface);
            }
            int i3 = uVar.f1498u;
            uVar.f1498u = i3;
            z0 z0Var2 = uVar.f1495r;
            if (z0Var2 != null) {
                uVar.h.n(z0Var2, i3);
            }
            ColorStateList colorStateList = uVar.f1499v;
            uVar.f1499v = colorStateList;
            z0 z0Var3 = uVar.f1495r;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f1496s;
            uVar.f1496s = charSequence;
            z0 z0Var4 = uVar.f1495r;
            if (z0Var4 != null) {
                z0Var4.setContentDescription(charSequence);
            }
            int i4 = uVar.f1497t;
            uVar.f1497t = i4;
            z0 z0Var5 = uVar.f1495r;
            if (z0Var5 != null) {
                z0Var5.setAccessibilityLiveRegion(i4);
            }
            uVar.f1495r.setVisibility(4);
            uVar.a(uVar.f1495r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f1495r, 0);
            uVar.f1495r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f1494q = z2;
    }

    public void setErrorIconDrawable(int i3) {
        Drawable drawable;
        q qVar = this.h;
        if (i3 != 0) {
            drawable = y.B(qVar.getContext(), i3);
        } else {
            drawable = null;
        }
        qVar.i(drawable);
        y.Z(qVar.f1452f, qVar.h, qVar.f1454i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.h;
        CheckableImageButton checkableImageButton = qVar.h;
        View.OnLongClickListener onLongClickListener = qVar.f1456k;
        checkableImageButton.setOnClickListener(onClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.h;
        qVar.f1456k = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.h;
        if (qVar.f1454i != colorStateList) {
            qVar.f1454i = colorStateList;
            y.h(qVar.f1452f, qVar.h, colorStateList, qVar.f1455j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.h;
        if (qVar.f1455j != mode) {
            qVar.f1455j = mode;
            y.h(qVar.f1452f, qVar.h, qVar.f1454i, mode);
        }
    }

    public void setErrorTextAppearance(int i3) {
        u uVar = this.f1345p;
        uVar.f1498u = i3;
        z0 z0Var = uVar.f1495r;
        if (z0Var != null) {
            uVar.h.n(z0Var, i3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1345p;
        uVar.f1499v = colorStateList;
        z0 z0Var = uVar.f1495r;
        if (z0Var != null && colorStateList != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.C0 != z2) {
            this.C0 = z2;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1345p;
        if (isEmpty) {
            if (uVar.f1501x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f1501x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f1500w = charSequence;
        uVar.f1502y.setText(charSequence);
        int i3 = uVar.f1491n;
        if (i3 != 2) {
            uVar.f1492o = 2;
        }
        uVar.i(i3, uVar.f1492o, uVar.h(uVar.f1502y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1345p;
        uVar.A = colorStateList;
        z0 z0Var = uVar.f1502y;
        if (z0Var != null && colorStateList != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1345p;
        TextInputLayout textInputLayout = uVar.h;
        if (uVar.f1501x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            z0 z0Var = new z0(uVar.f1485g, null);
            uVar.f1502y = z0Var;
            z0Var.setId(com.logistics.rider.lsposed.R.id.textinput_helper_text);
            uVar.f1502y.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f1502y.setTypeface(typeface);
            }
            uVar.f1502y.setVisibility(4);
            uVar.f1502y.setAccessibilityLiveRegion(1);
            int i3 = uVar.f1503z;
            uVar.f1503z = i3;
            z0 z0Var2 = uVar.f1502y;
            if (z0Var2 != null) {
                z0Var2.setTextAppearance(i3);
            }
            ColorStateList colorStateList = uVar.A;
            uVar.A = colorStateList;
            z0 z0Var3 = uVar.f1502y;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            uVar.a(uVar.f1502y, 1);
            uVar.f1502y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i4 = uVar.f1491n;
            if (i4 == 2) {
                uVar.f1492o = 0;
            }
            uVar.i(i4, uVar.f1492o, uVar.h(uVar.f1502y, ""));
            uVar.g(uVar.f1502y, 1);
            uVar.f1502y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f1501x = z2;
    }

    public void setHelperTextTextAppearance(int i3) {
        u uVar = this.f1345p;
        uVar.f1503z = i3;
        z0 z0Var = uVar.f1502y;
        if (z0Var != null) {
            z0Var.setTextAppearance(i3);
        }
    }

    public void setHint(int i3) {
        CharSequence charSequence;
        if (i3 != 0) {
            charSequence = getResources().getText(i3);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.D0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.I) {
            this.I = z2;
            if (!z2) {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f1333j.getHint())) {
                    this.f1333j.setHint(this.J);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1333j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f1333j.setHint((CharSequence) null);
                }
                this.K = true;
            }
            if (this.f1333j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i3) {
        c cVar = this.B0;
        if (i3 != cVar.f3204f0) {
            cVar.f3204f0 = i3;
            cVar.j(false);
        }
        if (i3 != cVar.e0) {
            cVar.e0 = i3;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i3) {
        c cVar = this.B0;
        TextInputLayout textInputLayout = cVar.f3196a;
        z1.d dVar = new z1.d(textInputLayout.getContext(), i3);
        ColorStateList colorStateList = dVar.f3364k;
        if (colorStateList != null) {
            cVar.f3212k = colorStateList;
        }
        float f3 = dVar.f3365l;
        if (f3 != 0.0f) {
            cVar.f3208i = f3;
        }
        ColorStateList colorStateList2 = dVar.f3356a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = dVar.f3360f;
        cVar.U = dVar.f3361g;
        cVar.S = dVar.h;
        cVar.W = dVar.f3363j;
        z1.a aVar = cVar.f3228z;
        if (aVar != null) {
            aVar.f3350c = true;
        }
        w1.b bVar = new w1.b(cVar);
        dVar.a();
        cVar.f3228z = new z1.a(bVar, dVar.f3369p);
        dVar.b(textInputLayout.getContext(), cVar.f3228z);
        cVar.j(false);
        this.f1346p0 = cVar.f3212k;
        if (this.f1333j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1346p0 != colorStateList) {
            if (this.f1344o0 == null) {
                c cVar = this.B0;
                if (cVar.f3212k != colorStateList) {
                    cVar.f3212k = colorStateList;
                    cVar.j(false);
                }
            }
            this.f1346p0 = colorStateList;
            if (this.f1333j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(c0 c0Var) {
        this.f1353t = c0Var;
    }

    public void setMaxEms(int i3) {
        this.f1339m = i3;
        EditText editText = this.f1333j;
        if (editText != null && i3 != -1) {
            editText.setMaxEms(i3);
        }
    }

    public void setMaxWidth(int i3) {
        this.f1343o = i3;
        EditText editText = this.f1333j;
        if (editText != null && i3 != -1) {
            editText.setMaxWidth(i3);
        }
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.f1337l = i3;
        EditText editText = this.f1333j;
        if (editText != null && i3 != -1) {
            editText.setMinEms(i3);
        }
    }

    public void setMinWidth(int i3) {
        this.f1341n = i3;
        EditText editText = this.f1333j;
        if (editText != null && i3 != -1) {
            editText.setMinWidth(i3);
        }
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        CharSequence charSequence;
        q qVar = this.h;
        if (i3 != 0) {
            charSequence = qVar.getResources().getText(i3);
        } else {
            charSequence = null;
        }
        qVar.f1457l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        Drawable drawable;
        q qVar = this.h;
        if (i3 != 0) {
            drawable = y.B(qVar.getContext(), i3);
        } else {
            drawable = null;
        }
        qVar.f1457l.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.h;
        if (z2 && qVar.f1459n != 1) {
            qVar.g(1);
        } else if (!z2) {
            qVar.g(0);
        } else {
            qVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.h;
        qVar.f1461p = colorStateList;
        y.h(qVar.f1452f, qVar.f1457l, colorStateList, qVar.f1462q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.h;
        qVar.f1462q = mode;
        y.h(qVar.f1452f, qVar.f1457l, qVar.f1461p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f1365z == null) {
            z0 z0Var = new z0(getContext(), null);
            this.f1365z = z0Var;
            z0Var.setId(com.logistics.rider.lsposed.R.id.textinput_placeholder);
            this.f1365z.setImportantForAccessibility(1);
            this.f1365z.setAccessibilityLiveRegion(1);
            h f3 = f();
            this.C = f3;
            f3.f1588g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            j0.h(this.f1365z, new com.google.android.material.datepicker.g(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1363y) {
                setPlaceholderTextEnabled(true);
            }
            this.f1361x = charSequence;
        }
        EditText editText = this.f1333j;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.B = i3;
        z0 z0Var = this.f1365z;
        if (z0Var != null) {
            z0Var.setTextAppearance(i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            z0 z0Var = this.f1365z;
            if (z0Var != null && colorStateList != null) {
                z0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        z zVar = this.f1328g;
        zVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        zVar.h = charSequence2;
        zVar.f1521g.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i3) {
        this.f1328g.f1521g.setTextAppearance(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1328g.f1521g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.L;
        if (jVar != null && jVar.f999g.f982a != nVar) {
            this.R = nVar;
            c();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1328g.f1522i.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i3) {
        CharSequence charSequence;
        if (i3 != 0) {
            charSequence = getResources().getText(i3);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            drawable = y.B(getContext(), i3);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i3) {
        z zVar = this.f1328g;
        if (i3 >= 0) {
            if (i3 != zVar.f1525l) {
                zVar.f1525l = i3;
                CheckableImageButton checkableImageButton = zVar.f1522i;
                checkableImageButton.setMinimumWidth(i3);
                checkableImageButton.setMinimumHeight(i3);
                return;
            }
            return;
        }
        zVar.getClass();
        b.m("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1328g;
        CheckableImageButton checkableImageButton = zVar.f1522i;
        View.OnLongClickListener onLongClickListener = zVar.f1527n;
        checkableImageButton.setOnClickListener(onClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1328g;
        zVar.f1527n = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f1522i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1328g;
        zVar.f1526m = scaleType;
        zVar.f1522i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1328g;
        if (zVar.f1523j != colorStateList) {
            zVar.f1523j = colorStateList;
            y.h(zVar.f1520f, zVar.f1522i, colorStateList, zVar.f1524k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1328g;
        if (zVar.f1524k != mode) {
            zVar.f1524k = mode;
            y.h(zVar.f1520f, zVar.f1522i, zVar.f1523j, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1328g.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        q qVar = this.h;
        qVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        qVar.f1466u = charSequence2;
        qVar.f1467v.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i3) {
        this.h.f1467v.setTextAppearance(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.f1467v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(b0 b0Var) {
        EditText editText = this.f1333j;
        if (editText != null) {
            j0.h(editText, b0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1330h0) {
            this.f1330h0 = typeface;
            this.B0.n(typeface);
            u uVar = this.f1345p;
            if (typeface != uVar.B) {
                uVar.B = typeface;
                z0 z0Var = uVar.f1495r;
                if (z0Var != null) {
                    z0Var.setTypeface(typeface);
                }
                z0 z0Var2 = uVar.f1502y;
                if (z0Var2 != null) {
                    z0Var2.setTypeface(typeface);
                }
            }
            z0 z0Var3 = this.f1355u;
            if (z0Var3 != null) {
                z0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        z0 z0Var;
        EditText editText = this.f1333j;
        if (editText != null && this.U == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = h1.f2266a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(k.u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f1351s && (z0Var = this.f1355u) != null) {
                mutate.setColorFilter(k.u.c(z0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.f1333j.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.f1333j;
        if (editText != null && this.L != null) {
            if ((this.O || editText.getBackground() == null) && this.U != 0) {
                this.f1333j.setBackground(getEditTextBoxBackground());
                this.O = true;
            }
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f1326f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e3 = e();
            if (e3 != layoutParams.topMargin) {
                layoutParams.topMargin = e3;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        z0 z0Var;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1333j;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        EditText editText2 = this.f1333j;
        if (editText2 != null && editText2.hasFocus()) {
            z5 = true;
        } else {
            z5 = false;
        }
        ColorStateList colorStateList3 = this.f1344o0;
        c cVar = this.B0;
        if (colorStateList3 != null) {
            cVar.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f1344o0;
            int i3 = this.f1364y0;
            if (colorStateList4 != null) {
                i3 = colorStateList4.getColorForState(new int[]{-16842910}, i3);
            }
            cVar.k(ColorStateList.valueOf(i3));
        } else if (o()) {
            z0 z0Var2 = this.f1345p.f1495r;
            if (z0Var2 != null) {
                colorStateList2 = z0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.k(colorStateList2);
        } else if (this.f1351s && (z0Var = this.f1355u) != null) {
            cVar.k(z0Var.getTextColors());
        } else if (z5 && (colorStateList = this.f1346p0) != null && cVar.f3212k != colorStateList) {
            cVar.f3212k = colorStateList;
            cVar.j(false);
        }
        q qVar = this.h;
        z zVar = this.f1328g;
        if (!z4 && this.C0 && (!isEnabled() || !z5)) {
            if (z3 || !this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z2 && this.D0) {
                    b(0.0f);
                } else {
                    cVar.m(0.0f);
                }
                if (g() && !((g) this.L).I.f1426r.isEmpty() && g()) {
                    ((g) this.L).s(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.A0 = true;
                z0 z0Var3 = this.f1365z;
                if (z0Var3 != null && this.f1363y) {
                    z0Var3.setText((CharSequence) null);
                    r.a(this.f1326f, this.D);
                    this.f1365z.setVisibility(4);
                }
                zVar.f1528o = true;
                zVar.e();
                qVar.f1468w = true;
                qVar.n();
                return;
            }
            return;
        }
        if (!z3 && !this.A0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.E0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.E0.cancel();
        }
        if (z2 && this.D0) {
            b(1.0f);
        } else {
            cVar.m(1.0f);
        }
        this.A0 = false;
        if (g()) {
            l();
        }
        EditText editText3 = this.f1333j;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        x(editable);
        zVar.f1528o = false;
        zVar.e();
        qVar.f1468w = false;
        qVar.n();
    }

    public final void x(Editable editable) {
        int i3;
        ((b) this.f1353t).getClass();
        if (editable != null) {
            i3 = editable.length();
        } else {
            i3 = 0;
        }
        FrameLayout frameLayout = this.f1326f;
        if (i3 == 0 && !this.A0) {
            if (this.f1365z != null && this.f1363y && !TextUtils.isEmpty(this.f1361x)) {
                this.f1365z.setText(this.f1361x);
                r.a(frameLayout, this.C);
                this.f1365z.setVisibility(0);
                this.f1365z.bringToFront();
                return;
            }
            return;
        }
        z0 z0Var = this.f1365z;
        if (z0Var != null && this.f1363y) {
            z0Var.setText((CharSequence) null);
            r.a(frameLayout, this.D);
            this.f1365z.setVisibility(4);
        }
    }

    public final void y(boolean z2, boolean z3) {
        int defaultColor = this.f1354t0.getDefaultColor();
        int colorForState = this.f1354t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1354t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1324c0 = colorForState2;
        } else if (z3) {
            this.f1324c0 = colorForState;
        } else {
            this.f1324c0 = defaultColor;
        }
    }

    public final void z() {
        boolean z2;
        z0 z0Var;
        EditText editText;
        EditText editText2;
        if (this.L != null && this.U != 0) {
            boolean z3 = false;
            if (!isFocused() && ((editText2 = this.f1333j) == null || !editText2.hasFocus())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (isHovered() || ((editText = this.f1333j) != null && editText.isHovered())) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.f1324c0 = this.f1364y0;
            } else if (o()) {
                if (this.f1354t0 != null) {
                    y(z2, z3);
                } else {
                    this.f1324c0 = getErrorCurrentTextColors();
                }
            } else if (this.f1351s && (z0Var = this.f1355u) != null) {
                if (this.f1354t0 != null) {
                    y(z2, z3);
                } else {
                    this.f1324c0 = z0Var.getCurrentTextColor();
                }
            } else if (z2) {
                this.f1324c0 = this.f1352s0;
            } else if (z3) {
                this.f1324c0 = this.f1350r0;
            } else {
                this.f1324c0 = this.f1348q0;
            }
            r();
            q qVar = this.h;
            TextInputLayout textInputLayout = qVar.f1452f;
            CheckableImageButton checkableImageButton = qVar.f1457l;
            TextInputLayout textInputLayout2 = qVar.f1452f;
            qVar.l();
            y.Z(textInputLayout2, qVar.h, qVar.f1454i);
            y.Z(textInputLayout2, checkableImageButton, qVar.f1461p);
            if (qVar.b() instanceof e2.m) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    y.h(textInputLayout, checkableImageButton, qVar.f1461p, qVar.f1462q);
                }
            }
            z zVar = this.f1328g;
            y.Z(zVar.f1520f, zVar.f1522i, zVar.f1523j);
            if (this.U == 2) {
                int i3 = this.W;
                if (z2 && isEnabled()) {
                    this.W = this.f1323b0;
                } else {
                    this.W = this.a0;
                }
                if (this.W != i3 && g() && !this.A0) {
                    if (g()) {
                        ((g) this.L).s(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    l();
                }
            }
            if (this.U == 1) {
                if (!isEnabled()) {
                    this.f1325d0 = this.f1358v0;
                } else if (z3 && !z2) {
                    this.f1325d0 = this.f1362x0;
                } else if (z2) {
                    this.f1325d0 = this.f1360w0;
                } else {
                    this.f1325d0 = this.f1356u0;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1328g.f1522i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1328g.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.f1457l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.f1457l.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.h.f1457l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.h;
        TextInputLayout textInputLayout = qVar.f1452f;
        CheckableImageButton checkableImageButton = qVar.f1457l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            y.h(textInputLayout, checkableImageButton, qVar.f1461p, qVar.f1462q);
            y.Z(textInputLayout, checkableImageButton, qVar.f1461p);
        }
    }
}
