package com.google.android.material.button;

import a.k;
import a.y;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import b2.a0;
import b2.c0;
import b2.m;
import b2.n;
import b2.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.q;
import k2.h;
import o1.a;
import o1.b;
import o1.c;
import o1.f;
import q0.e;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class MaterialButton extends q implements Checkable, x {
    public static final int[] K = {R.attr.state_checkable};
    public static final int[] L = {R.attr.state_checked};
    public static final a M = new Object();
    public LinearLayout.LayoutParams A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public c0 F;
    public int G;
    public float H;
    public float I;
    public e J;

    /* renamed from: i */
    public final f f1170i;

    /* renamed from: j */
    public final LinkedHashSet f1171j;

    /* renamed from: k */
    public b f1172k;

    /* renamed from: l */
    public PorterDuff.Mode f1173l;

    /* renamed from: m */
    public ColorStateList f1174m;

    /* renamed from: n */
    public Drawable f1175n;

    /* renamed from: o */
    public String f1176o;

    /* renamed from: p */
    public int f1177p;

    /* renamed from: q */
    public int f1178q;

    /* renamed from: r */
    public int f1179r;

    /* renamed from: s */
    public int f1180s;

    /* renamed from: t */
    public boolean f1181t;

    /* renamed from: u */
    public boolean f1182u;

    /* renamed from: v */
    public int f1183v;

    /* renamed from: w */
    public int f1184w;

    /* renamed from: x */
    public float f1185x;

    /* renamed from: y */
    public int f1186y;

    /* renamed from: z */
    public int f1187z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(g2.a.b(context, attributeSet, com.logistics.rider.lsposed.R.attr.materialButtonStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Button, new int[]{com.logistics.rider.lsposed.R.attr.materialSizeOverlay}), attributeSet, com.logistics.rider.lsposed.R.attr.materialButtonStyle);
        n a3;
        this.f1171j = new LinkedHashSet();
        this.f1181t = false;
        this.f1182u = false;
        this.f1184w = -1;
        this.f1185x = -1.0f;
        this.f1186y = -1;
        this.f1187z = -1;
        this.E = -1;
        Context context2 = getContext();
        TypedArray e3 = j.e(context2, attributeSet, i1.a.f1977j, com.logistics.rider.lsposed.R.attr.materialButtonStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1180s = e3.getDimensionPixelSize(13, 0);
        int i3 = e3.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1173l = j.f(i3, mode);
        this.f1174m = h.l(getContext(), e3, 15);
        this.f1175n = h.o(getContext(), e3, 11);
        this.f1183v = e3.getInteger(12, 1);
        this.f1177p = e3.getDimensionPixelSize(14, 0);
        a0 b3 = a0.b(context2, e3, 19);
        if (b3 != null) {
            a3 = b3.c();
        } else {
            a3 = n.b(context2, attributeSet, com.logistics.rider.lsposed.R.attr.materialButtonStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Button).a();
        }
        boolean z2 = e3.getBoolean(17, false);
        f fVar = new f(this, a3);
        this.f1170i = fVar;
        fVar.f2627f = e3.getDimensionPixelOffset(2, 0);
        fVar.f2628g = e3.getDimensionPixelOffset(3, 0);
        fVar.h = e3.getDimensionPixelOffset(4, 0);
        fVar.f2629i = e3.getDimensionPixelOffset(5, 0);
        if (e3.hasValue(9)) {
            int dimensionPixelSize = e3.getDimensionPixelSize(9, -1);
            fVar.f2630j = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            m f4 = fVar.f2624b.f();
            f4.f1022e = new b2.a(f3);
            f4.f1023f = new b2.a(f3);
            f4.f1024g = new b2.a(f3);
            f4.h = new b2.a(f3);
            fVar.f2624b = f4.a();
            fVar.f2625c = null;
            fVar.d();
            fVar.f2639s = true;
        }
        fVar.f2631k = e3.getDimensionPixelSize(22, 0);
        fVar.f2632l = j.f(e3.getInt(8, -1), mode);
        fVar.f2633m = h.l(getContext(), e3, 7);
        fVar.f2634n = h.l(getContext(), e3, 21);
        fVar.f2635o = h.l(getContext(), e3, 18);
        fVar.f2640t = e3.getBoolean(6, false);
        fVar.f2643w = e3.getDimensionPixelSize(10, 0);
        fVar.f2641u = e3.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e3.hasValue(0)) {
            fVar.f2638r = true;
            setSupportBackgroundTintList(fVar.f2633m);
            setSupportBackgroundTintMode(fVar.f2632l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f2627f, paddingTop + fVar.h, paddingEnd + fVar.f2628g, paddingBottom + fVar.f2629i);
        setCheckedInternal(e3.getBoolean(1, false));
        if (b3 != null) {
            fVar.d = d();
            if (fVar.f2625c != null) {
                fVar.d();
            }
            fVar.f2625c = b3;
            fVar.d();
        }
        setOpticalCenterEnabled(z2);
        e3.recycle();
        setCompoundDrawablePadding(this.f1180s);
        h(this.f1175n != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.C = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.H;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        b2.j a3;
        if (!this.B || !this.D || (a3 = this.f1170i.a(false)) == null) {
            return 0;
        }
        return (int) (a3.g() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil(f3);
    }

    private void setCheckedInternal(boolean z2) {
        f fVar = this.f1170i;
        if (fVar != null && fVar.f2640t && this.f1181t != z2) {
            this.f1181t = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1181t;
                if (!materialButtonToggleGroup.f1190q) {
                    materialButtonToggleGroup.f(getId(), z3);
                }
            }
            if (!this.f1182u) {
                this.f1182u = true;
                Iterator it = this.f1171j.iterator();
                if (!it.hasNext()) {
                    this.f1182u = false;
                } else {
                    it.next().getClass();
                    a.b.c();
                }
            }
        }
    }

    public void setDisplayedWidthIncrease(float f3) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.H != f3) {
            this.H = f3;
            j();
            invalidate();
            if (getParent() instanceof o1.e) {
                o1.e eVar = (o1.e) getParent();
                int i3 = (int) this.H;
                int indexOfChild = eVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i4 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i4 >= 0) {
                            if (eVar.c(i4)) {
                                materialButton2 = (MaterialButton) eVar.getChildAt(i4);
                                break;
                            }
                            i4--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = eVar.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild >= childCount) {
                            break;
                        } else if (eVar.c(indexOfChild)) {
                            materialButton = (MaterialButton) eVar.getChildAt(indexOfChild);
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i3);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i3);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i3 / 2);
                            materialButton.setDisplayedWidthDecrease((i3 + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final q0.f d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue P = h.P(context, com.logistics.rider.lsposed.R.attr.motionSpringFastSpatial);
        int[] iArr = i1.a.f1986s;
        if (P == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, com.logistics.rider.lsposed.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(P.resourceId, iArr);
        }
        q0.f fVar = new q0.f();
        try {
            float f3 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f3 != Float.MIN_VALUE) {
                float f4 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f4 != Float.MIN_VALUE) {
                    if (f3 > 0.0f) {
                        fVar.f2775a = Math.sqrt(f3);
                        fVar.f2777c = false;
                        if (f4 >= 0.0f) {
                            fVar.f2776b = f4;
                            fVar.f2777c = false;
                            obtainStyledAttributes.recycle();
                            return fVar;
                        }
                        throw new IllegalArgumentException("Damping ratio must be non-negative");
                    }
                    throw new IllegalArgumentException("Spring stiffness constant must be positive.");
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        f fVar = this.f1170i;
        if (fVar != null && !fVar.f2638r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            b2.c0 r0 = r8.F
            if (r0 != 0) goto L6
            goto L85
        L6:
            q0.e r0 = r8.J
            if (r0 != 0) goto L19
            q0.e r0 = new q0.e
            o1.a r1 = com.google.android.material.button.MaterialButton.M
            r0.<init>(r8, r1)
            r8.J = r0
            q0.f r1 = r8.d()
            r0.f2772j = r1
        L19:
            boolean r0 = r8.D
            if (r0 == 0) goto L85
            int r0 = r8.G
            b2.c0 r1 = r8.F
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f978c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f976a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.f978c
            r5 = r4
        L42:
            int r6 = r1.f976a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            androidx.emoji2.text.m r1 = r1.f977b
            goto L5d
        L59:
            androidx.emoji2.text.m[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f299g
            b2.b0 r1 = (b2.b0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f974b
            int r1 = r1.f973a
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            q0.e r1 = r8.J
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            q0.e r8 = r8.J
            r8.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i3 = this.f1183v;
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3 && i3 != 4) {
                if (i3 != 16 && i3 != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.f1175n, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.f1175n, null);
            return;
        }
        setCompoundDrawablesRelative(this.f1175n, null, null, null);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f1176o)) {
            return this.f1176o;
        }
        f fVar = this.f1170i;
        if (fVar != null && fVar.f2640t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.E;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f1170i.f2630j;
        }
        return 0;
    }

    public q0.f getCornerSpringForce() {
        return this.f1170i.d;
    }

    public Drawable getIcon() {
        return this.f1175n;
    }

    public int getIconGravity() {
        return this.f1183v;
    }

    public int getIconPadding() {
        return this.f1180s;
    }

    public int getIconSize() {
        return this.f1177p;
    }

    public ColorStateList getIconTint() {
        return this.f1174m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1173l;
    }

    public int getInsetBottom() {
        return this.f1170i.f2629i;
    }

    public int getInsetTop() {
        return this.f1170i.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f1170i.f2635o;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        if (e()) {
            return this.f1170i.f2624b;
        }
        a.b.i("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public a0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f1170i.f2625c;
        }
        a.b.i("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f1170i.f2634n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f1170i.f2631k;
        }
        return 0;
    }

    @Override // k.q
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f1170i.f2633m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // k.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f1170i.f2632l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z2) {
        Drawable drawable = this.f1175n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1175n = mutate;
            mutate.setTintList(this.f1174m);
            PorterDuff.Mode mode = this.f1173l;
            if (mode != null) {
                this.f1175n.setTintMode(mode);
            }
            int i3 = this.f1177p;
            if (i3 == 0) {
                i3 = this.f1175n.getIntrinsicWidth();
            }
            int i4 = this.f1177p;
            if (i4 == 0) {
                i4 = this.f1175n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1175n;
            int i5 = this.f1178q;
            int i6 = this.f1179r;
            drawable2.setBounds(i5, i6, i3 + i5, i4 + i6);
            this.f1175n.setVisible(true, z2);
        }
        if (z2) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i7 = this.f1183v;
        if (((i7 != 1 && i7 != 2) || drawable3 == this.f1175n) && (((i7 != 3 && i7 != 4) || drawable5 == this.f1175n) && ((i7 != 16 && i7 != 32) || drawable4 == this.f1175n))) {
            return;
        }
        g();
    }

    public final void i(int i3, int i4) {
        boolean z2;
        if (this.f1175n != null && getLayout() != null) {
            int i5 = this.f1183v;
            boolean z3 = true;
            if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
                if (i5 != 16 && i5 != 32) {
                    return;
                }
                this.f1178q = 0;
                if (i5 == 16) {
                    this.f1179r = 0;
                    h(false);
                    return;
                }
                int i6 = this.f1177p;
                if (i6 == 0) {
                    i6 = this.f1175n.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i6) - this.f1180s) - getPaddingBottom()) / 2);
                if (this.f1179r != max) {
                    this.f1179r = max;
                    h(false);
                    return;
                }
                return;
            }
            this.f1179r = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i7 = this.f1183v;
            if (i7 != 1 && i7 != 3 && ((i7 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i7 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i8 = this.f1177p;
                if (i8 == 0) {
                    i8 = this.f1175n.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i3 - getTextLayoutWidth()) - getPaddingEnd()) - i8) - this.f1180s) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1183v != 4) {
                    z3 = false;
                }
                if (z2 != z3) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f1178q != textLayoutWidth) {
                    this.f1178q = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.f1178q = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1181t;
    }

    public final void j() {
        int i3 = (int) (this.H - this.I);
        int i4 = (i3 / 2) + this.C;
        getLayoutParams().width = (int) (this.f1185x + i3);
        setPaddingRelative(this.f1186y + i4, getPaddingTop(), (this.f1187z + i3) - i4, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            y.c0(this, this.f1170i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        f fVar = this.f1170i;
        if (fVar != null && fVar.f2640t) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        if (this.f1181t) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    @Override // k.q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1181t);
    }

    @Override // k.q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        f fVar = this.f1170i;
        if (fVar != null && fVar.f2640t) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setChecked(this.f1181t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z2, i3, i4, i5, i6);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i8 = getResources().getConfiguration().orientation;
        if (this.f1184w != i8) {
            this.f1184w = i8;
            this.f1185x = -1.0f;
        }
        if (this.f1185x == -1.0f) {
            this.f1185x = getMeasuredWidth();
            if (this.A == null && (getParent() instanceof o1.e) && ((o1.e) getParent()).getButtonSizeChange() != null) {
                this.A = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A);
                layoutParams.width = (int) this.f1185x;
                setLayoutParams(layoutParams);
            }
        }
        boolean z3 = false;
        if (this.E == -1) {
            if (this.f1175n == null) {
                i7 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i9 = this.f1177p;
                if (i9 == 0) {
                    i9 = this.f1175n.getIntrinsicWidth();
                }
                i7 = iconPadding + i9;
            }
            this.E = (getMeasuredWidth() - getTextLayoutWidth()) - i7;
        }
        if (this.f1186y == -1) {
            this.f1186y = getPaddingStart();
        }
        if (this.f1187z == -1) {
            this.f1187z = getPaddingEnd();
        }
        if ((getParent() instanceof o1.e) && ((o1.e) getParent()).getOrientation() == 0) {
            z3 = true;
        }
        this.D = z3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f2612f);
        setChecked(cVar.h);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, o1.c, o0.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new o0.b(super.onSaveInstanceState());
        bVar.h = this.f1181t;
        return bVar;
    }

    @Override // k.q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f1170i.f2641u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1175n != null) {
            if (this.f1175n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1176o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.a(false) != null) {
                fVar.a(false).setTint(i3);
                return;
            }
            return;
        }
        super.setBackgroundColor(i3);
    }

    @Override // k.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                f fVar = this.f1170i;
                fVar.f2638r = true;
                MaterialButton materialButton = fVar.f2623a;
                materialButton.setSupportBackgroundTintList(fVar.f2633m);
                materialButton.setSupportBackgroundTintMode(fVar.f2632l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.q, android.view.View
    public void setBackgroundResource(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            drawable = y.B(getContext(), i3);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (e()) {
            this.f1170i.f2640t = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedInternal(z2);
    }

    public void setCornerRadius(int i3) {
        if (e()) {
            f fVar = this.f1170i;
            if (!fVar.f2639s || fVar.f2630j != i3) {
                fVar.f2630j = i3;
                fVar.f2639s = true;
                float f3 = i3;
                m f4 = fVar.f2624b.f();
                f4.f1022e = new b2.a(f3);
                f4.f1023f = new b2.a(f3);
                f4.f1024g = new b2.a(f3);
                f4.h = new b2.a(f3);
                fVar.f2624b = f4.a();
                fVar.f2625c = null;
                fVar.d();
            }
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    public void setCornerSpringForce(q0.f fVar) {
        f fVar2 = this.f1170i;
        fVar2.d = fVar;
        if (fVar2.f2625c != null) {
            fVar2.d();
        }
    }

    public void setDisplayedWidthDecrease(int i3) {
        this.I = Math.min(i3, this.E);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (e()) {
            this.f1170i.a(false).l(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1175n != drawable) {
            this.f1175n = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f1183v != i3) {
            this.f1183v = i3;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f1180s != i3) {
            this.f1180s = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            drawable = y.B(getContext(), i3);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i3) {
        if (i3 >= 0) {
            if (this.f1177p != i3) {
                this.f1177p = i3;
                h(true);
                return;
            }
            return;
        }
        a.b.m("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1174m != colorStateList) {
            this.f1174m = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1173l != mode) {
            this.f1173l = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(y.z(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        f fVar = this.f1170i;
        fVar.b(fVar.h, i3);
    }

    public void setInsetTop(int i3) {
        f fVar = this.f1170i;
        fVar.b(i3, fVar.f2629i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f1172k = bVar;
    }

    public void setOpticalCenterEnabled(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            f fVar = this.f1170i;
            if (z2) {
                a.c0 c0Var = new a.c0(this);
                fVar.f2626e = c0Var;
                b2.j a3 = fVar.a(false);
                if (a3 != null) {
                    a3.G = c0Var;
                }
            } else {
                fVar.f2626e = null;
                b2.j a4 = fVar.a(false);
                if (a4 != null) {
                    a4.G = null;
                }
            }
            post(new k(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        b bVar = this.f1172k;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((androidx.emoji2.text.m) bVar).f299g).invalidate();
        }
        super.setPressed(z2);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1170i;
            MaterialButton materialButton = fVar.f2623a;
            if (fVar.f2635o != colorStateList) {
                fVar.f2635o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i3) {
        if (e()) {
            setRippleColor(y.z(getContext(), i3));
        }
    }

    @Override // b2.x
    public void setShapeAppearanceModel(n nVar) {
        if (e()) {
            f fVar = this.f1170i;
            fVar.f2624b = nVar;
            fVar.f2625c = null;
            fVar.d();
            return;
        }
        a.b.i("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (e()) {
            f fVar = this.f1170i;
            fVar.f2637q = z2;
            fVar.e();
        }
    }

    public void setSizeChange(c0 c0Var) {
        if (this.F != c0Var) {
            this.F = c0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(a0 a0Var) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.d == null && a0Var.d()) {
                fVar.d = d();
                if (fVar.f2625c != null) {
                    fVar.d();
                }
            }
            fVar.f2625c = a0Var;
            fVar.d();
            return;
        }
        a.b.i("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.f2634n != colorStateList) {
                fVar.f2634n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i3) {
        if (e()) {
            setStrokeColor(y.z(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.f2631k != i3) {
                fVar.f2631k = i3;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // k.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.f2633m != colorStateList) {
                fVar.f2633m = colorStateList;
                if (fVar.a(false) != null) {
                    fVar.a(false).setTintList(fVar.f2633m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // k.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            f fVar = this.f1170i;
            if (fVar.f2632l != mode) {
                fVar.f2632l = mode;
                if (fVar.a(false) != null && fVar.f2632l != null) {
                    fVar.a(false).setTintMode(fVar.f2632l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f1170i.f2641u = z2;
    }

    @Override // android.widget.TextView
    public void setWidth(int i3) {
        this.f1185x = -1.0f;
        super.setWidth(i3);
    }

    public void setWidthChangeMax(int i3) {
        if (this.G != i3) {
            this.G = i3;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1181t);
    }
}
