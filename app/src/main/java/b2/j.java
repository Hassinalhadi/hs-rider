package b2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class j extends Drawable implements x {
    public static final i[] H;
    public boolean A;
    public n B;
    public q0.f C;
    public final q0.e[] D;
    public float[] E;
    public float[] F;
    public a.c0 G;

    /* renamed from: f, reason: collision with root package name */
    public final g f998f;

    /* renamed from: g, reason: collision with root package name */
    public h f999g;
    public final v[] h;

    /* renamed from: i, reason: collision with root package name */
    public final v[] f1000i;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f1001j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1002k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1003l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f1004m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f1005n;

    /* renamed from: o, reason: collision with root package name */
    public final Path f1006o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f1007p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1008q;

    /* renamed from: r, reason: collision with root package name */
    public final Region f1009r;

    /* renamed from: s, reason: collision with root package name */
    public final Region f1010s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f1011t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f1012u;

    /* renamed from: v, reason: collision with root package name */
    public final g f1013v;

    /* renamed from: w, reason: collision with root package name */
    public final p f1014w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f1015x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f1016y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f1017z;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        H = new i[4];
        int i3 = 0;
        while (true) {
            i[] iVarArr = H;
            if (i3 < iVarArr.length) {
                iVarArr[i3] = new i(i3);
                i3++;
            } else {
                return;
            }
        }
    }

    public j(h hVar) {
        p pVar;
        this.f998f = new g(this);
        this.h = new v[4];
        this.f1000i = new v[4];
        this.f1001j = new BitSet(8);
        this.f1004m = new Matrix();
        this.f1005n = new Path();
        this.f1006o = new Path();
        this.f1007p = new RectF();
        this.f1008q = new RectF();
        this.f1009r = new Region();
        this.f1010s = new Region();
        Paint paint = new Paint(1);
        this.f1011t = paint;
        Paint paint2 = new Paint(1);
        this.f1012u = paint2;
        new a2.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.f1039a;
        } else {
            pVar = new p();
        }
        this.f1014w = pVar;
        this.f1017z = new RectF();
        this.A = true;
        this.D = new q0.e[4];
        this.f999g = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        o(getState());
        this.f1013v = new g(this);
    }

    public static float b(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.e(rectF)) {
                return nVar.f1032e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f3 = fArr[0];
            for (int i3 = 1; i3 < fArr.length; i3++) {
                if (fArr[i3] != f3) {
                    return -1.0f;
                }
            }
        }
        if (nVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        h hVar = this.f999g;
        this.f1014w.a(hVar.f982a, this.E, hVar.f989j, rectF, this.f1013v, path);
        if (this.f999g.f988i != 1.0f) {
            Matrix matrix = this.f1004m;
            matrix.reset();
            float f3 = this.f999g.f988i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1017z, true);
    }

    public final int c(int i3) {
        float f3;
        int i4;
        h hVar = this.f999g;
        float f4 = hVar.f993n + 0.0f + hVar.f992m;
        v1.a aVar = hVar.f984c;
        if (aVar != null && aVar.f3182a && c0.a.d(i3, 255) == aVar.d) {
            if (aVar.f3185e > 0.0f && f4 > 0.0f) {
                f3 = Math.min(((((float) Math.log1p(f4 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f3 = 0.0f;
            }
            int alpha = Color.alpha(i3);
            int C = k2.h.C(c0.a.d(i3, 255), aVar.f3183b, f3);
            if (f3 > 0.0f && (i4 = aVar.f3184c) != 0) {
                C = c0.a.b(c0.a.d(i4, v1.a.f3181f), C);
            }
            return c0.a.d(C, alpha);
        }
        return i3;
    }

    public final void d(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float b3 = b(rectF, nVar, fArr);
        if (b3 >= 0.0f) {
            float f3 = b3 * this.f999g.f989j;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if (r18.f999g.f982a.d() != false) goto L29;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.j.draw(android.graphics.Canvas):void");
    }

    public void e(Canvas canvas) {
        n nVar = this.B;
        float[] fArr = this.F;
        RectF f3 = f();
        RectF rectF = this.f1008q;
        rectF.set(f3);
        float h = h();
        rectF.inset(h, h);
        d(canvas, this.f1012u, this.f1006o, nVar, fArr, rectF);
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.f1007p;
        rectF.set(bounds);
        return rectF;
    }

    public final float g() {
        float[] fArr = this.E;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF f3 = f();
        n nVar = this.f999g.f982a;
        p pVar = this.f1014w;
        pVar.getClass();
        float a3 = nVar.f1032e.a(f3);
        n nVar2 = this.f999g.f982a;
        pVar.getClass();
        float a4 = nVar2.h.a(f3) + a3;
        n nVar3 = this.f999g.f982a;
        pVar.getClass();
        float a5 = a4 - nVar3.f1034g.a(f3);
        n nVar4 = this.f999g.f982a;
        pVar.getClass();
        return (a5 - nVar4.f1033f.a(f3)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f999g.f991l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f999g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f999g.getClass();
        RectF f3 = f();
        if (f3.isEmpty()) {
            return;
        }
        float b3 = b(f3, this.f999g.f982a, this.E);
        if (b3 >= 0.0f) {
            outline.setRoundRect(getBounds(), b3 * this.f999g.f989j);
            return;
        }
        boolean z2 = this.f1002k;
        Path path = this.f1005n;
        if (z2) {
            a(f3, path);
            this.f1002k = false;
        }
        u1.a.a(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f999g.h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1009r;
        region.set(bounds);
        RectF f3 = f();
        Path path = this.f1005n;
        a(f3, path);
        Region region2 = this.f1010s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        if (i()) {
            return this.f1012u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean i() {
        Paint.Style style = this.f999g.f996q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1012u.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1002k = true;
        this.f1003l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f999g.f986f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.f999g.getClass();
                ColorStateList colorStateList2 = this.f999g.f985e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f999g.d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        a0 a0Var = this.f999g.f983b;
                        if (a0Var == null || !a0Var.d()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void j(Context context) {
        this.f999g.f984c = new v1.a(context);
        r();
    }

    public final void k(q0.f fVar) {
        if (this.C != fVar) {
            this.C = fVar;
            int i3 = 0;
            while (true) {
                q0.e[] eVarArr = this.D;
                if (i3 < eVarArr.length) {
                    if (eVarArr[i3] == null) {
                        eVarArr[i3] = new q0.e(this, H[i3]);
                    }
                    q0.e eVar = eVarArr[i3];
                    q0.f fVar2 = new q0.f();
                    float f3 = (float) fVar.f2776b;
                    if (f3 >= 0.0f) {
                        fVar2.f2776b = f3;
                        fVar2.f2777c = false;
                        double d = fVar.f2775a;
                        float f4 = (float) (d * d);
                        if (f4 > 0.0f) {
                            fVar2.f2775a = Math.sqrt(f4);
                            fVar2.f2777c = false;
                            eVar.f2772j = fVar2;
                            i3++;
                        } else {
                            a.b.m("Spring stiffness constant must be positive.");
                            return;
                        }
                    } else {
                        a.b.m("Damping ratio must be non-negative");
                        return;
                    }
                } else {
                    p(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void l(float f3) {
        h hVar = this.f999g;
        if (hVar.f993n != f3) {
            hVar.f993n = f3;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        h hVar = this.f999g;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f999g = new h(this.f999g);
        return this;
    }

    public final void n(a0 a0Var) {
        h hVar = this.f999g;
        if (hVar.f983b != a0Var) {
            hVar.f983b = a0Var;
            p(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean o(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f999g.d != null && color2 != (colorForState2 = this.f999g.d.getColorForState(iArr, (color2 = (paint2 = this.f1011t).getColor())))) {
            paint2.setColor(colorForState2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f999g.f985e != null && color != (colorForState = this.f999g.f985e.getColorForState(iArr, (color = (paint = this.f1012u).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1002k = true;
        this.f1003l = true;
        super.onBoundsChange(rect);
        if (this.f999g.f983b != null && !rect.isEmpty()) {
            p(getState(), this.A);
        }
        this.A = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        if (this.f999g.f983b != null) {
            p(iArr, false);
        }
        boolean o3 = o(iArr);
        boolean q3 = q();
        if (o3 || q3) {
            z2 = true;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final void p(int[] iArr, boolean z2) {
        boolean z3;
        n a3;
        d dVar;
        int i3;
        RectF f3 = f();
        if (this.f999g.f983b != null && !f3.isEmpty()) {
            if (this.C == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            if (this.E == null) {
                this.E = new float[4];
            }
            a0 a0Var = this.f999g.f983b;
            n[] nVarArr = a0Var.d;
            int i4 = a0Var.f965a;
            int[][] iArr2 = a0Var.f967c;
            y yVar = a0Var.h;
            y yVar2 = a0Var.f970g;
            y yVar3 = a0Var.f969f;
            y yVar4 = a0Var.f968e;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    i5 = -1;
                    break;
                }
            }
            if (i5 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i6 = 0;
                while (true) {
                    if (i6 < i4) {
                        if (StateSet.stateSetMatches(iArr2[i6], iArr3)) {
                            i3 = i6;
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                i5 = i3;
            }
            if (yVar4 == null && yVar3 == null && yVar2 == null && yVar == null) {
                a3 = nVarArr[i5];
            } else {
                m f4 = nVarArr[i5].f();
                if (yVar4 != null) {
                    f4.f1022e = yVar4.c(iArr);
                }
                if (yVar3 != null) {
                    f4.f1023f = yVar3.c(iArr);
                }
                if (yVar2 != null) {
                    f4.h = yVar2.c(iArr);
                }
                if (yVar != null) {
                    f4.f1024g = yVar.c(iArr);
                }
                a3 = f4.a();
            }
            for (int i7 = 0; i7 < 4; i7++) {
                this.f1014w.getClass();
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            dVar = a3.f1033f;
                        } else {
                            dVar = a3.f1032e;
                        }
                    } else {
                        dVar = a3.h;
                    }
                } else {
                    dVar = a3.f1034g;
                }
                float a4 = dVar.a(f3);
                if (z4) {
                    this.E[i7] = a4;
                }
                q0.e[] eVarArr = this.D;
                q0.e eVar = eVarArr[i7];
                if (eVar != null) {
                    eVar.a(a4);
                    if (z4) {
                        eVarArr[i7].d();
                    }
                }
            }
            if (z4) {
                invalidateSelf();
            }
        }
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1015x;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1016y;
        h hVar = this.f999g;
        ColorStateList colorStateList = hVar.f986f;
        PorterDuff.Mode mode = hVar.f987g;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.f1011t.getColor();
            int c3 = c(color);
            if (c3 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c3, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f1015x = porterDuffColorFilter;
        this.f999g.getClass();
        this.f1016y = null;
        this.f999g.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f1015x) || !Objects.equals(porterDuffColorFilter3, this.f1016y)) {
            return true;
        }
        return false;
    }

    public final void r() {
        h hVar = this.f999g;
        float f3 = hVar.f993n + 0.0f;
        hVar.f994o = (int) Math.ceil(0.75f * f3);
        this.f999g.f995p = (int) Math.ceil(f3 * 0.25f);
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        h hVar = this.f999g;
        if (hVar.f991l != i3) {
            hVar.f991l = i3;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f999g.getClass();
        super.invalidateSelf();
    }

    @Override // b2.x
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.f999g;
        hVar.f982a = nVar;
        hVar.f983b = null;
        this.E = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f999g.f986f = colorStateList;
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f999g;
        if (hVar.f987g != mode) {
            hVar.f987g = mode;
            q();
            super.invalidateSelf();
        }
    }

    public j(Context context, AttributeSet attributeSet, int i3, int i4) {
        this(n.b(context, attributeSet, i3, i4).a());
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j() {
        this(new n());
    }
}
