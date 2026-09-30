package r1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import b2.g;
import b2.j;
import b2.m;
import b2.n;
import b2.p;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import w1.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends j implements Drawable.Callback {
    public static final int[] Q0 = {R.attr.state_enabled};
    public static final ShapeDrawable R0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E0;
    public ColorFilter F0;
    public PorterDuffColorFilter G0;
    public ColorStateList H0;
    public ColorStateList I;
    public PorterDuff.Mode I0;
    public ColorStateList J;
    public int[] J0;
    public float K;
    public ColorStateList K0;
    public float L;
    public WeakReference L0;
    public ColorStateList M;
    public TextUtils.TruncateAt M0;
    public float N;
    public boolean N0;
    public ColorStateList O;
    public int O0;
    public CharSequence P;
    public boolean P0;
    public boolean Q;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public RippleDrawable X;
    public ColorStateList Y;
    public float Z;
    public SpannableStringBuilder a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2809b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2810c0;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f2811d0;
    public ColorStateList e0;

    /* renamed from: f0, reason: collision with root package name */
    public j1.b f2812f0;

    /* renamed from: g0, reason: collision with root package name */
    public j1.b f2813g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f2814h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f2815i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f2816j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f2817k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f2818l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f2819m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f2820n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f2821o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Context f2822p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Paint f2823q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Paint.FontMetrics f2824r0;

    /* renamed from: s0, reason: collision with root package name */
    public final RectF f2825s0;

    /* renamed from: t0, reason: collision with root package name */
    public final PointF f2826t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Path f2827u0;

    /* renamed from: v0, reason: collision with root package name */
    public final h f2828v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2829w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f2830x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f2831y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f2832z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.lsposed.R.attr.chipStyle, com.logistics.rider.lsposed.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = -1.0f;
        this.f2823q0 = new Paint(1);
        this.f2824r0 = new Paint.FontMetrics();
        this.f2825s0 = new RectF();
        this.f2826t0 = new PointF();
        this.f2827u0 = new Path();
        this.E0 = 255;
        this.I0 = PorterDuff.Mode.SRC_IN;
        this.L0 = new WeakReference(null);
        j(context);
        this.f2822p0 = context;
        h hVar = new h(this);
        this.f2828v0 = hVar;
        this.P = "";
        hVar.f3248a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q0;
        setState(iArr);
        Q(iArr);
        this.N0 = true;
        R0.setTint(-1);
    }

    public static void a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean y(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.e.A(int[], int[]):boolean");
    }

    public final void B(boolean z2) {
        if (this.f2809b0 != z2) {
            this.f2809b0 = z2;
            float u2 = u();
            if (!z2 && this.C0) {
                this.C0 = false;
            }
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.f2811d0 != drawable) {
            float u2 = u();
            this.f2811d0 = drawable;
            float u3 = u();
            a0(this.f2811d0);
            s(this.f2811d0);
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            if (this.f2810c0 && (drawable = this.f2811d0) != null && this.f2809b0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f2810c0 != z2) {
            boolean X = X();
            this.f2810c0 = z2;
            boolean X2 = X();
            if (X != X2) {
                Drawable drawable = this.f2811d0;
                if (X2) {
                    s(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void F(float f3) {
        if (this.L != f3) {
            this.L = f3;
            m f4 = this.f999g.f982a.f();
            f4.f1022e = new b2.a(f3);
            f4.f1023f = new b2.a(f3);
            f4.f1024g = new b2.a(f3);
            f4.h = new b2.a(f3);
            setShapeAppearanceModel(f4.a());
        }
    }

    public final void G(Drawable drawable) {
        Drawable drawable2 = this.R;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u2 = u();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.R = drawable3;
            float u3 = u();
            a0(drawable2);
            if (Y()) {
                s(this.R);
            }
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void H(float f3) {
        if (this.T != f3) {
            float u2 = u();
            this.T = f3;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.U = true;
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (Y()) {
                this.R.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z2) {
        if (this.Q != z2) {
            boolean Y = Y();
            this.Q = z2;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.R;
                if (Y2) {
                    s(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (this.P0) {
                b2.h hVar = this.f999g;
                if (hVar.f985e != colorStateList) {
                    hVar.f985e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f3) {
        if (this.N != f3) {
            this.N = f3;
            this.f2823q0.setStrokeWidth(f3);
            if (this.P0) {
                this.f999g.f990k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2 = this.W;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v3 = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.W = drawable3;
            ColorStateList colorStateList = this.O;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.X = new RippleDrawable(colorStateList, this.W, R0);
            float v4 = v();
            a0(drawable2);
            if (Z()) {
                s(this.W);
            }
            invalidateSelf();
            if (v3 != v4) {
                z();
            }
        }
    }

    public final void N(float f3) {
        if (this.f2820n0 != f3) {
            this.f2820n0 = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final void O(float f3) {
        if (this.Z != f3) {
            this.Z = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final void P(float f3) {
        if (this.f2819m0 != f3) {
            this.f2819m0 = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final boolean Q(int[] iArr) {
        if (!Arrays.equals(this.J0, iArr)) {
            this.J0 = iArr;
            if (Z()) {
                return A(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void R(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (Z()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void S(boolean z2) {
        if (this.V != z2) {
            boolean Z = Z();
            this.V = z2;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.W;
                if (Z2) {
                    s(drawable);
                } else {
                    a0(drawable);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void T(float f3) {
        if (this.f2816j0 != f3) {
            float u2 = u();
            this.f2816j0 = f3;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void U(float f3) {
        if (this.f2815i0 != f3) {
            float u2 = u();
            this.f2815i0 = f3;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            this.K0 = null;
            onStateChange(getState());
        }
    }

    public final void W(z1.d dVar) {
        h hVar = this.f2828v0;
        b bVar = hVar.f3249b;
        TextPaint textPaint = hVar.f3248a;
        if (hVar.f3252f != dVar) {
            hVar.f3252f = dVar;
            if (dVar != null) {
                Context context = this.f2822p0;
                dVar.e(context, textPaint, bVar);
                e eVar = (e) hVar.f3251e.get();
                if (eVar != null) {
                    textPaint.drawableState = eVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                hVar.d = true;
            }
            e eVar2 = (e) hVar.f3251e.get();
            if (eVar2 != null) {
                eVar2.z();
                eVar2.invalidateSelf();
                eVar2.onStateChange(eVar2.getState());
            }
        }
    }

    public final boolean X() {
        if (this.f2810c0 && this.f2811d0 != null && this.C0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (this.Q && this.R != null) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.V && this.W != null) {
            return true;
        }
        return false;
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3;
        Canvas canvas2;
        int i4;
        float f3;
        boolean z2;
        int i5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i3 = this.E0) != 0) {
            if (i3 < 255) {
                canvas2 = canvas;
                i4 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i3);
            } else {
                canvas2 = canvas;
                i4 = 0;
            }
            boolean z3 = this.P0;
            Paint paint = this.f2823q0;
            RectF rectF = this.f2825s0;
            if (!z3) {
                paint.setColor(this.f2829w0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, w(), w(), paint);
            }
            if (!this.P0) {
                paint.setColor(this.f2830x0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.F0;
                if (colorFilter == null) {
                    colorFilter = this.G0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, w(), w(), paint);
            }
            if (this.P0) {
                super.draw(canvas);
            }
            if (this.N > 0.0f && !this.P0) {
                paint.setColor(this.f2832z0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.P0) {
                    ColorFilter colorFilter2 = this.F0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.G0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f4 = bounds.left;
                float f5 = this.N / 2.0f;
                rectF.set(f4 + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
                float f6 = this.L - (this.N / 2.0f);
                canvas2.drawRoundRect(rectF, f6, f6, paint);
            }
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.P0) {
                canvas2.drawRoundRect(rectF, w(), w(), paint);
                f3 = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                b2.h hVar = this.f999g;
                n nVar = hVar.f982a;
                float[] fArr = this.E;
                float f7 = hVar.f989j;
                g gVar = this.f1013v;
                p pVar = this.f1014w;
                f3 = 2.0f;
                Path path = this.f2827u0;
                pVar.a(nVar, fArr, f7, rectF2, gVar, path);
                d(canvas2, paint, path, this.f999g.f982a, this.E, f());
            }
            if (Y()) {
                t(bounds, rectF);
                float f8 = rectF.left;
                float f9 = rectF.top;
                canvas2.translate(f8, f9);
                this.R.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.R.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (X()) {
                t(bounds, rectF);
                float f10 = rectF.left;
                float f11 = rectF.top;
                canvas2.translate(f10, f11);
                this.f2811d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f2811d0.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (this.N0 && this.P != null) {
                PointF pointF = this.f2826t0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.P;
                h hVar2 = this.f2828v0;
                if (charSequence != null) {
                    float u2 = u() + this.f2814h0 + this.f2817k0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + u2;
                    } else {
                        pointF.x = bounds.right - u2;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = hVar2.f3248a;
                    Paint.FontMetrics fontMetrics = this.f2824r0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f3);
                }
                rectF.setEmpty();
                if (this.P != null) {
                    float u3 = u() + this.f2814h0 + this.f2817k0;
                    float v3 = v() + this.f2821o0 + this.f2818l0;
                    int layoutDirection = getLayoutDirection();
                    int i6 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = i6 + u3;
                        rectF.right = bounds.right - v3;
                    } else {
                        rectF.left = i6 + v3;
                        rectF.right = bounds.right - u3;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                z1.d dVar = hVar2.f3252f;
                TextPaint textPaint2 = hVar2.f3248a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    hVar2.f3252f.d(this.f2822p0, textPaint2, hVar2.f3249b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(hVar2.a(this.P.toString())) > Math.round(rectF.width())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i5 = save;
                } else {
                    i5 = 0;
                }
                CharSequence charSequence2 = this.P;
                if (z2 && this.M0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.M0);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z2) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (Z()) {
                rectF.setEmpty();
                if (Z()) {
                    float f12 = this.f2821o0 + this.f2820n0;
                    if (getLayoutDirection() == 0) {
                        float f13 = bounds.right - f12;
                        rectF.right = f13;
                        rectF.left = f13 - this.Z;
                    } else {
                        float f14 = bounds.left + f12;
                        rectF.left = f14;
                        rectF.right = f14 + this.Z;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f15 = this.Z;
                    float f16 = exactCenterY - (f15 / f3);
                    rectF.top = f16;
                    rectF.bottom = f16 + f15;
                }
                float f17 = rectF.left;
                float f18 = rectF.top;
                canvas2.translate(f17, f18);
                this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.X.setBounds(this.W.getBounds());
                this.X.jumpToCurrentState();
                this.X.draw(canvas2);
                canvas2.translate(-f17, -f18);
            }
            if (this.E0 < 255) {
                canvas2.restoreToCount(i4);
            }
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(v() + this.f2828v0.a(this.P.toString()) + u() + this.f2814h0 + this.f2817k0 + this.f2818l0 + this.f2821o0), this.O0);
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.L);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K, this.L);
        }
        outline2.setAlpha(this.E0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!x(this.I) && !x(this.J) && !x(this.M)) {
            z1.d dVar = this.f2828v0.f3252f;
            if (dVar == null || (colorStateList = dVar.f3364k) == null || !colorStateList.isStateful()) {
                if ((!this.f2810c0 || this.f2811d0 == null || !this.f2809b0) && !y(this.R) && !y(this.f2811d0) && !x(this.H0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (Y()) {
            onLayoutDirectionChanged |= this.R.setLayoutDirection(i3);
        }
        if (X()) {
            onLayoutDirectionChanged |= this.f2811d0.setLayoutDirection(i3);
        }
        if (Z()) {
            onLayoutDirectionChanged |= this.W.setLayoutDirection(i3);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (Y()) {
            onLevelChange |= this.R.setLevel(i3);
        }
        if (X()) {
            onLevelChange |= this.f2811d0.setLevel(i3);
        }
        if (Z()) {
            onLevelChange |= this.W.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.J0);
    }

    public final void s(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.W) {
                if (drawable.isStateful()) {
                    drawable.setState(this.J0);
                }
                drawable.setTintList(this.Y);
                return;
            }
            Drawable drawable2 = this.R;
            if (drawable == drawable2 && this.U) {
                drawable2.setTintList(this.S);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.E0 != i3) {
            this.E0 = i3;
            invalidateSelf();
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F0 != colorFilter) {
            this.F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.I0 != mode) {
            this.I0 = mode;
            ColorStateList colorStateList = this.H0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.G0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (Y()) {
            visible |= this.R.setVisible(z2, z3);
        }
        if (X()) {
            visible |= this.f2811d0.setVisible(z2, z3);
        }
        if (Z()) {
            visible |= this.W.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!Y() && !X()) {
            return;
        }
        float f3 = this.f2814h0 + this.f2815i0;
        if (this.C0) {
            drawable = this.f2811d0;
        } else {
            drawable = this.R;
        }
        float f4 = this.T;
        if (f4 <= 0.0f && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f5 = rect.left + f3;
            rectF.left = f5;
            rectF.right = f5 + f4;
        } else {
            float f6 = rect.right - f3;
            rectF.right = f6;
            rectF.left = f6 - f4;
        }
        if (this.C0) {
            drawable2 = this.f2811d0;
        } else {
            drawable2 = this.R;
        }
        float f7 = this.T;
        if (f7 <= 0.0f && drawable2 != null) {
            f7 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2822p0.getResources().getDisplayMetrics()));
            if (drawable2.getIntrinsicHeight() <= f7) {
                f7 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f7;
    }

    public final float u() {
        Drawable drawable;
        if (!Y() && !X()) {
            return 0.0f;
        }
        float f3 = this.f2815i0;
        if (this.C0) {
            drawable = this.f2811d0;
        } else {
            drawable = this.R;
        }
        float f4 = this.T;
        if (f4 <= 0.0f && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        return f4 + f3 + this.f2816j0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (Z()) {
            return this.f2819m0 + this.Z + this.f2820n0;
        }
        return 0.0f;
    }

    public final float w() {
        if (this.P0) {
            float[] fArr = this.E;
            if (fArr != null) {
                return fArr[3];
            }
            return this.f999g.f982a.f1032e.a(f());
        }
        return this.L;
    }

    public final void z() {
        Chip chip = (Chip) this.L0.get();
        if (chip != null) {
            chip.b(chip.f1209u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }
}
