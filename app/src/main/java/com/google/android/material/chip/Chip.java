package com.google.android.material.chip;

import a.y;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import b2.n;
import b2.x;
import com.google.android.material.chip.Chip;
import g2.a;
import h0.f;
import h0.g;
import j0.j0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k.r;
import k2.h;
import r1.b;
import r1.c;
import r1.d;
import r1.e;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class Chip extends r implements x, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final b A;

    /* renamed from: j, reason: collision with root package name */
    public e f1198j;

    /* renamed from: k, reason: collision with root package name */
    public InsetDrawable f1199k;

    /* renamed from: l, reason: collision with root package name */
    public RippleDrawable f1200l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f1201m;

    /* renamed from: n, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1202n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1203o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1204p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1205q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1206r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1207s;

    /* renamed from: t, reason: collision with root package name */
    public int f1208t;

    /* renamed from: u, reason: collision with root package name */
    public int f1209u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1210v;

    /* renamed from: w, reason: collision with root package name */
    public final d f1211w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1212x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f1213y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f1214z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.logistics.rider.lsposed.R.attr.chipStyle);
        z1.d dVar;
        j1.b bVar;
        j1.b bVar2;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1213y = new Rect();
        this.f1214z = new RectF();
        this.A = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                a.b.n("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            a.b.n("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        a.b.n("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    a.b.n("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                a.b.n("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f2822p0;
        int[] iArr = i1.a.f1972c;
        TypedArray e3 = j.e(context3, attributeSet, iArr, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.P0 = e3.hasValue(37);
        Context context4 = eVar.f2822p0;
        ColorStateList l3 = h.l(context4, e3, 24);
        if (eVar.I != l3) {
            eVar.I = l3;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList l4 = h.l(context4, e3, 11);
        if (eVar.J != l4) {
            eVar.J = l4;
            eVar.onStateChange(eVar.getState());
        }
        float dimension2 = e3.getDimension(19, 0.0f);
        if (eVar.K != dimension2) {
            eVar.K = dimension2;
            eVar.invalidateSelf();
            eVar.z();
        }
        if (e3.hasValue(12)) {
            eVar.F(e3.getDimension(12, 0.0f));
        }
        eVar.K(h.l(context4, e3, 22));
        eVar.L(e3.getDimension(23, 0.0f));
        eVar.V(h.l(context4, e3, 36));
        String text = e3.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.P, text)) {
            eVar.P = text;
            eVar.f2828v0.d = true;
            eVar.invalidateSelf();
            eVar.z();
        }
        if (e3.hasValue(0) && (resourceId3 = e3.getResourceId(0, 0)) != 0) {
            dVar = new z1.d(context4, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f3365l = e3.getDimension(1, dVar.f3365l);
        eVar.W(dVar);
        int i3 = e3.getInt(3, 0);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    eVar.M0 = TextUtils.TruncateAt.END;
                }
            } else {
                eVar.M0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            eVar.M0 = TextUtils.TruncateAt.START;
        }
        eVar.J(e3.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.J(e3.getBoolean(15, false));
        }
        eVar.G(h.o(context4, e3, 14));
        if (e3.hasValue(17)) {
            eVar.I(h.l(context4, e3, 17));
        }
        eVar.H(e3.getDimension(16, -1.0f));
        eVar.S(e3.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.S(e3.getBoolean(26, false));
        }
        eVar.M(h.o(context4, e3, 25));
        eVar.R(h.l(context4, e3, 30));
        eVar.O(e3.getDimension(28, 0.0f));
        eVar.B(e3.getBoolean(6, false));
        eVar.E(e3.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.E(e3.getBoolean(8, false));
        }
        eVar.C(h.o(context4, e3, 7));
        if (e3.hasValue(9)) {
            eVar.D(h.l(context4, e3, 9));
        }
        if (e3.hasValue(39) && (resourceId2 = e3.getResourceId(39, 0)) != 0) {
            bVar = j1.b.a(context4, resourceId2);
        } else {
            bVar = null;
        }
        eVar.f2812f0 = bVar;
        if (e3.hasValue(33) && (resourceId = e3.getResourceId(33, 0)) != 0) {
            bVar2 = j1.b.a(context4, resourceId);
        } else {
            bVar2 = null;
        }
        eVar.f2813g0 = bVar2;
        float dimension3 = e3.getDimension(21, 0.0f);
        if (eVar.f2814h0 != dimension3) {
            eVar.f2814h0 = dimension3;
            eVar.invalidateSelf();
            eVar.z();
        }
        eVar.U(e3.getDimension(35, 0.0f));
        eVar.T(e3.getDimension(34, 0.0f));
        float dimension4 = e3.getDimension(41, 0.0f);
        if (eVar.f2817k0 != dimension4) {
            eVar.f2817k0 = dimension4;
            eVar.invalidateSelf();
            eVar.z();
        }
        float dimension5 = e3.getDimension(40, 0.0f);
        if (eVar.f2818l0 != dimension5) {
            eVar.f2818l0 = dimension5;
            eVar.invalidateSelf();
            eVar.z();
        }
        eVar.P(e3.getDimension(29, 0.0f));
        eVar.N(e3.getDimension(27, 0.0f));
        float dimension6 = e3.getDimension(13, 0.0f);
        if (eVar.f2821o0 != dimension6) {
            eVar.f2821o0 = dimension6;
            eVar.invalidateSelf();
            eVar.z();
        }
        eVar.O0 = e3.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e3.recycle();
        j.a(context2, attributeSet, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1207s = obtainStyledAttributes.getBoolean(32, false);
        TypedValue P = h.P(context2, com.logistics.rider.lsposed.R.attr.minTouchTargetSize);
        if (P != null && P.type == 5) {
            dimension = P.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(com.logistics.rider.lsposed.R.dimen.mtrl_min_touch_target_size);
        }
        this.f1209u = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.l(getElevation());
        j.a(context2, attributeSet, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1211w = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f1203o);
        setText(eVar.P);
        setEllipsize(eVar.M0);
        g();
        if (!this.f1198j.N0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f1207s) {
            setMinHeight(this.f1209u);
        }
        this.f1208t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f1202n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1214z;
        rectF.setEmpty();
        if (c() && this.f1201m != null) {
            e eVar = this.f1198j;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.Z()) {
                float f3 = eVar.f2821o0 + eVar.f2820n0 + eVar.Z + eVar.f2819m0 + eVar.f2818l0;
                if (eVar.getLayoutDirection() == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f3;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i3 = (int) closeIconTouchBounds.left;
        int i4 = (int) closeIconTouchBounds.top;
        int i5 = (int) closeIconTouchBounds.right;
        int i6 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1213y;
        rect.set(i3, i4, i5, i6);
        return rect;
    }

    private z1.d getTextAppearance() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2828v0.f3252f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1205q != z2) {
            this.f1205q = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1204p != z2) {
            this.f1204p = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i3) {
        int i4;
        this.f1209u = i3;
        int i5 = 0;
        if (!this.f1207s) {
            InsetDrawable insetDrawable = this.f1199k;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f1199k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        int max = Math.max(0, i3 - ((int) this.f1198j.K));
        int max2 = Math.max(0, i3 - this.f1198j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1199k;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f1199k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        if (max2 > 0) {
            i4 = max2 / 2;
        } else {
            i4 = 0;
        }
        if (max > 0) {
            i5 = max / 2;
        }
        int i6 = i5;
        if (this.f1199k != null) {
            Rect rect = new Rect();
            this.f1199k.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i4 && rect.right == i4) {
                e();
                return;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        this.f1199k = new InsetDrawable((Drawable) this.f1198j, i4, i6, i4, i6);
        e();
    }

    public final boolean c() {
        e eVar = this.f1198j;
        if (eVar != null) {
            Drawable drawable = eVar.W;
            if (drawable == null) {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d() {
        e eVar;
        if (c() && (eVar = this.f1198j) != null && eVar.V && this.f1201m != null) {
            j0.h(this, this.f1211w);
            this.f1212x = true;
        } else {
            j0.h(this, null);
            this.f1212x = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i3;
        if (!this.f1212x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f1211w;
        AccessibilityManager accessibilityManager = dVar.h;
        int i4 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i3 = dVar.f2673m) != Integer.MIN_VALUE) {
                    if (i3 != Integer.MIN_VALUE) {
                        dVar.f2673m = Integer.MIN_VALUE;
                        dVar.r(Integer.MIN_VALUE, 128);
                        dVar.r(i3, 256);
                        return true;
                    }
                }
            } else {
                float x3 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = dVar.f2808q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x3, y2)) {
                    i4 = 1;
                }
                int i5 = dVar.f2673m;
                if (i5 != i4) {
                    dVar.f2673m = i4;
                    dVar.r(i4, 128);
                    dVar.r(i5, 256);
                    return true;
                }
            }
            return true;
        }
        if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1212x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1211w;
        dVar.getClass();
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i4 = 130;
                                        }
                                    } else {
                                        i4 = 17;
                                    }
                                } else {
                                    i4 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i3 < repeatCount && dVar.m(i4, null)) {
                                    i3++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = dVar.f2672l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f2808q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1201m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1212x) {
                                chip.f1211w.r(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = dVar.m(1, null);
            }
        }
        if (z2 && dVar.f2672l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // k.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1198j;
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        if (eVar != null && e.y(eVar.W)) {
            e eVar2 = this.f1198j;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f1206r) {
                i4 = isEnabled + 1;
            }
            int i5 = i4;
            if (this.f1205q) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (this.f1204p) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (isChecked()) {
                i7 = i6 + 1;
            }
            int[] iArr = new int[i7];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i3 = 1;
            }
            if (this.f1206r) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.f1205q) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.f1204p) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            z2 = eVar2.Q(iArr);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        ColorStateList colorStateList = this.f1198j.O;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1200l = new RippleDrawable(colorStateList, getBackgroundDrawable(), null);
        this.f1198j.getClass();
        setBackground(this.f1200l);
        f();
    }

    public final void f() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f1198j) != null) {
            int v3 = (int) (eVar.v() + eVar.f2821o0 + eVar.f2818l0);
            e eVar2 = this.f1198j;
            int u2 = (int) (eVar2.u() + eVar2.f2814h0 + eVar2.f2817k0);
            if (this.f1199k != null) {
                Rect rect = new Rect();
                this.f1199k.getPadding(rect);
                u2 += rect.left;
                v3 += rect.right;
            }
            setPaddingRelative(u2, getPaddingTop(), v3, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f1198j;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        z1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1210v)) {
            return this.f1210v;
        }
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2809b0) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1199k;
        if (insetDrawable == null) {
            return this.f1198j;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2811d0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.e0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1198j;
        if (eVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, eVar.w());
    }

    public Drawable getChipDrawable() {
        return this.f1198j;
    }

    public float getChipEndPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2821o0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1198j;
        if (eVar == null || (drawable = eVar.R) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.T;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.S;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.K;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2814h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.M;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f1198j;
        if (eVar == null || (drawable = eVar.W) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.a0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2820n0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.Z;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2819m0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.M0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1212x) {
            d dVar = this.f1211w;
            if (dVar.f2672l == 1 || dVar.f2671k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public j1.b getHideMotionSpec() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2813g0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2816j0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2815i0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.O;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.f1198j.f999g.f982a;
    }

    public j1.b getShowMotionSpec() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2812f0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2818l0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f1198j;
        if (eVar != null) {
            return eVar.f2817k0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y.c0(this, this.f1198j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2809b0) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        super.onFocusChanged(z2, i3, rect);
        if (this.f1212x) {
            d dVar = this.f1211w;
            int i4 = dVar.f2672l;
            if (i4 != Integer.MIN_VALUE) {
                dVar.j(i4);
            }
            if (z2) {
                dVar.m(i3, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2809b0) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f1208t != i3) {
            this.f1208t = i3;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f1204p
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f1204p
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f1201m
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f1212x
            if (r0 == 0) goto L43
            r1.d r0 = r5.f1211w
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1210v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f1200l) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f1200l) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // k.r, android.view.View
    public void setBackgroundResource(int i3) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.B(z2);
        }
    }

    public void setCheckableResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.B(eVar.f2822p0.getResources().getBoolean(i3));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        e eVar = this.f1198j;
        if (eVar == null) {
            this.f1203o = z2;
        } else if (eVar.f2809b0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.C(y.B(eVar.f2822p0, i3));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.D(y.z(eVar.f2822p0, i3));
        }
    }

    public void setCheckedIconVisible(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.E(eVar.f2822p0.getResources().getBoolean(i3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.J != colorStateList) {
            eVar.J = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i3) {
        ColorStateList z2;
        e eVar = this.f1198j;
        if (eVar != null && eVar.J != (z2 = y.z(eVar.f2822p0, i3))) {
            eVar.J = z2;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.F(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.F(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f1198j;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.L0 = new WeakReference(null);
            }
            this.f1198j = eVar;
            eVar.N0 = false;
            eVar.L0 = new WeakReference(this);
            b(this.f1209u);
        }
    }

    public void setChipEndPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2821o0 != f3) {
            eVar.f2821o0 = f3;
            eVar.invalidateSelf();
            eVar.z();
        }
    }

    public void setChipEndPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            float dimension = eVar.f2822p0.getResources().getDimension(i3);
            if (eVar.f2821o0 != dimension) {
                eVar.f2821o0 = dimension;
                eVar.invalidateSelf();
                eVar.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.G(y.B(eVar.f2822p0, i3));
        }
    }

    public void setChipIconSize(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.H(f3);
        }
    }

    public void setChipIconSizeResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.H(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.I(y.z(eVar.f2822p0, i3));
        }
    }

    public void setChipIconVisible(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.J(eVar.f2822p0.getResources().getBoolean(i3));
        }
    }

    public void setChipMinHeight(float f3) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.K != f3) {
            eVar.K = f3;
            eVar.invalidateSelf();
            eVar.z();
        }
    }

    public void setChipMinHeightResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            float dimension = eVar.f2822p0.getResources().getDimension(i3);
            if (eVar.K != dimension) {
                eVar.K = dimension;
                eVar.invalidateSelf();
                eVar.z();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2814h0 != f3) {
            eVar.f2814h0 = f3;
            eVar.invalidateSelf();
            eVar.z();
        }
    }

    public void setChipStartPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            float dimension = eVar.f2822p0.getResources().getDimension(i3);
            if (eVar.f2814h0 != dimension) {
                eVar.f2814h0 = dimension;
                eVar.invalidateSelf();
                eVar.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.K(y.z(eVar.f2822p0, i3));
        }
    }

    public void setChipStrokeWidth(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.L(f3);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.L(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.M(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        h0.b bVar;
        e eVar = this.f1198j;
        if (eVar != null && eVar.a0 != charSequence) {
            String str = h0.b.f1885b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = h0.b.f1887e;
            } else {
                bVar = h0.b.d;
            }
            bVar.getClass();
            f fVar = g.f1895a;
            eVar.a0 = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.N(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.N(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.M(y.B(eVar.f2822p0, i3));
        }
        d();
    }

    public void setCloseIconSize(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.O(f3);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.O(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.P(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.P(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.R(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.R(y.z(eVar.f2822p0, i3));
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // k.r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                a.b.n("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        a.b.n("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // k.r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                a.b.n("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        a.b.n("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            if (i5 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
                return;
            } else {
                a.b.n("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        a.b.n("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            if (i5 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i3, i4, i5, i6);
                return;
            } else {
                a.b.n("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        a.b.n("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.l(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1198j != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                e eVar = this.f1198j;
                if (eVar != null) {
                    eVar.M0 = truncateAt;
                    return;
                }
                return;
            }
            a.b.n("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1207s = z2;
        b(this.f1209u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(j1.b bVar) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.f2813g0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.f2813g0 = j1.b.a(eVar.f2822p0, i3);
        }
    }

    public void setIconEndPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.T(f3);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.T(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    public void setIconStartPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.U(f3);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.U(eVar.f2822p0.getResources().getDimension(i3));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.f1198j == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 <= 1) {
            super.setLines(i3);
        } else {
            a.b.n("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 <= 1) {
            super.setMaxLines(i3);
        } else {
            a.b.n("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.O0 = i3;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 <= 1) {
            super.setMinLines(i3);
        } else {
            a.b.n("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1202n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1201m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.V(colorStateList);
        }
        this.f1198j.getClass();
        e();
    }

    public void setRippleColorResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.V(y.z(eVar.f2822p0, i3));
            this.f1198j.getClass();
            e();
        }
    }

    @Override // b2.x
    public void setShapeAppearanceModel(n nVar) {
        this.f1198j.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(j1.b bVar) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.f2812f0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.f2812f0 = j1.b.a(eVar.f2822p0, i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
        } else {
            a.b.n("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f1198j;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.N0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            e eVar2 = this.f1198j;
            if (eVar2 != null && !TextUtils.equals(eVar2.P, charSequence)) {
                eVar2.P = charSequence;
                eVar2.f2828v0.d = true;
                eVar2.invalidateSelf();
                eVar2.z();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.W(new z1.d(eVar.f2822p0, i3));
        }
        g();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2818l0 != f3) {
            eVar.f2818l0 = f3;
            eVar.invalidateSelf();
            eVar.z();
        }
    }

    public void setTextEndPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            float dimension = eVar.f2822p0.getResources().getDimension(i3);
            if (eVar.f2818l0 != dimension) {
                eVar.f2818l0 = dimension;
                eVar.invalidateSelf();
                eVar.z();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        super.setTextSize(i3, f3);
        e eVar = this.f1198j;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics());
            w1.h hVar = eVar.f2828v0;
            z1.d dVar = hVar.f3252f;
            if (dVar != null) {
                dVar.f3365l = applyDimension;
                hVar.f3248a.setTextSize(applyDimension);
                eVar.z();
                eVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f3) {
        e eVar = this.f1198j;
        if (eVar != null && eVar.f2817k0 != f3) {
            eVar.f2817k0 = f3;
            eVar.invalidateSelf();
            eVar.z();
        }
    }

    public void setTextStartPaddingResource(int i3) {
        e eVar = this.f1198j;
        if (eVar != null) {
            float dimension = eVar.f2822p0.getResources().getDimension(i3);
            if (eVar.f2817k0 != dimension) {
                eVar.f2817k0 = dimension;
                eVar.invalidateSelf();
                eVar.z();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.S(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.E(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.J(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a.b.n("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            a.b.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a.b.n("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            a.b.n("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(z1.d dVar) {
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.W(dVar);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        e eVar = this.f1198j;
        if (eVar != null) {
            eVar.W(new z1.d(eVar.f2822p0, i3));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(w1.f fVar) {
    }
}
