package w1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3196a;
    public float a0;

    /* renamed from: b, reason: collision with root package name */
    public float f3197b;

    /* renamed from: b0, reason: collision with root package name */
    public float f3198b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3199c;

    /* renamed from: c0, reason: collision with root package name */
    public float f3200c0;
    public final Rect d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f3201d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f3202e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3210j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3212k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f3213k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3214l;

    /* renamed from: m, reason: collision with root package name */
    public float f3215m;

    /* renamed from: n, reason: collision with root package name */
    public float f3216n;

    /* renamed from: o, reason: collision with root package name */
    public float f3217o;

    /* renamed from: p, reason: collision with root package name */
    public float f3218p;

    /* renamed from: q, reason: collision with root package name */
    public float f3219q;

    /* renamed from: r, reason: collision with root package name */
    public float f3220r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f3221s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f3222t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f3223u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f3224v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f3225w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f3226x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f3227y;

    /* renamed from: z, reason: collision with root package name */
    public z1.a f3228z;

    /* renamed from: f, reason: collision with root package name */
    public int f3203f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f3205g = 16;
    public float h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f3208i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;
    public int e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f3204f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f3206g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f3207h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f3209i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f3211j0 = -1;

    public c(TextInputLayout textInputLayout) {
        this.f3196a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.f3199c = new Rect();
        this.f3202e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i3, int i4, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i4) * f3) + (Color.alpha(i3) * f4)), Math.round((Color.red(i4) * f3) + (Color.red(i3) * f4)), Math.round((Color.green(i4) * f3) + (Color.green(i3) * f4)), Math.round((Color.blue(i4) * f3) + (Color.blue(i3) * f4)));
    }

    public static float h(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return j1.a.a(f3, f4, f5);
    }

    public final void b() {
        float f3 = this.f3197b;
        float f4 = this.f3199c.left;
        Rect rect = this.d;
        float h = h(f4, rect.left, f3, this.Q);
        RectF rectF = this.f3202e;
        rectF.left = h;
        rectF.top = h(this.f3215m, this.f3216n, f3, this.Q);
        rectF.right = h(r1.right, rect.right, f3, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f3, this.Q);
        this.f3219q = h(this.f3217o, this.f3218p, f3, this.Q);
        this.f3220r = h(this.f3215m, this.f3216n, f3, this.Q);
        d(f3, false);
        TextInputLayout textInputLayout = this.f3196a;
        textInputLayout.postInvalidateOnAnimation();
        v0.a aVar = j1.a.f2194b;
        this.f3198b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f3200c0 = h(1.0f, 0.0f, f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f3212k;
        ColorStateList colorStateList2 = this.f3210j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f3212k), f3));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f5 = this.W;
        float f6 = this.X;
        if (f5 != f6) {
            textPaint.setLetterSpacing(h(f6, f5, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.H = j1.a.a(0.0f, this.S, f3);
        this.I = j1.a.a(0.0f, this.T, f3);
        this.J = j1.a.a(0.0f, this.U, f3);
        int a3 = a(0, g(this.V), f3);
        this.K = a3;
        textPaint.setShadowLayer(this.H, this.I, this.J, a3);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        h0.f fVar;
        boolean z2 = true;
        if (this.f3196a.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (this.E) {
            if (z2) {
                fVar = h0.g.d;
            } else {
                fVar = h0.g.f1897c;
            }
            return fVar.b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void d(float f3, boolean z2) {
        float f4;
        Typeface typeface;
        float f5;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        float h;
        if (this.B != null) {
            float width = this.d.width();
            float width2 = this.f3199c.width();
            float f6 = 1.0f;
            if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f4 = this.f3208i;
                } else {
                    f4 = this.h;
                }
                if (o()) {
                    f5 = this.W;
                } else {
                    f5 = this.X;
                }
                if (o()) {
                    h = 1.0f;
                } else {
                    h = h(this.h, this.f3208i, f3, this.R) / this.h;
                }
                this.F = h;
                if (!o()) {
                    width = width2;
                }
                typeface = this.f3221s;
                width2 = width;
            } else {
                f4 = this.h;
                float f7 = this.X;
                typeface = this.f3224v;
                if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.h, this.f3208i, f3, this.R) / this.h;
                }
                float f8 = this.f3208i / this.h;
                float f9 = width2 * f8;
                if (!z2 && f9 > width && o()) {
                    width2 = Math.min(width / f8, width2);
                }
                f5 = f7;
            }
            if (f3 < 0.5f) {
                i3 = this.e0;
            } else {
                i3 = this.f3204f0;
            }
            TextPaint textPaint = this.O;
            boolean z9 = false;
            if (width2 > 0.0f) {
                if (this.G != f4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.Y != f5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f3227y != typeface) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.Z != null && width2 != r12.getWidth()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.L != i3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z3 && !z4 && !z6 && !z5 && !z7 && !this.N) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                this.G = f4;
                this.Y = f5;
                this.f3227y = typeface;
                this.N = false;
                this.L = i3;
                if (this.F != 1.0f) {
                    z9 = true;
                }
                textPaint.setLinearText(z9);
                z9 = z8;
            }
            if (this.C != null && !z9) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f3227y);
            textPaint.setLetterSpacing(this.Y);
            boolean c3 = c(this.B);
            this.D = c3;
            if ((this.e0 <= 1 && this.f3204f0 <= 1) || c3) {
                i4 = 1;
            } else {
                i4 = i3;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f6 = this.F;
            }
            StaticLayout e3 = e(i4, textPaint, charSequence, width2 * f6, this.D);
            this.Z = e3;
            this.C = e3.getText();
        }
    }

    public final StaticLayout e(int i3, TextPaint textPaint, CharSequence charSequence, float f3, boolean z2) {
        Layout.Alignment alignment;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f3203f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z3 = this.D;
                if (absoluteGravity != 5) {
                    if (z3) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        g gVar = new g(charSequence, textPaint, (int) f3);
        gVar.f3246l = this.A;
        gVar.f3245k = z2;
        gVar.f3240e = alignment;
        gVar.f3244j = false;
        gVar.f3241f = i3;
        gVar.f3242g = 0.0f;
        gVar.h = this.f3206g0;
        gVar.f3243i = this.f3207h0;
        gVar.f3247m = null;
        StaticLayout a3 = gVar.a();
        a3.getClass();
        return a3;
    }

    public final float f() {
        int i3 = this.f3209i0;
        if (i3 != -1) {
            return i3;
        }
        float f3 = this.f3208i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f3);
        textPaint.setTypeface(this.f3221s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3223u;
            if (typeface != null) {
                this.f3222t = k2.h.E(configuration, typeface);
            }
            Typeface typeface2 = this.f3226x;
            if (typeface2 != null) {
                this.f3225w = k2.h.E(configuration, typeface2);
            }
            Typeface typeface3 = this.f3222t;
            if (typeface3 == null) {
                typeface3 = this.f3223u;
            }
            this.f3221s = typeface3;
            Typeface typeface4 = this.f3225w;
            if (typeface4 == null) {
                typeface4 = this.f3226x;
            }
            this.f3224v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z2) {
        float f3;
        float f4;
        int i3;
        TextInputLayout textInputLayout = this.f3196a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z2) {
            d(1.0f, z2);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (charSequence != null && this.Z != null) {
                boolean o3 = o();
                CharSequence charSequence2 = this.C;
                if (o3) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.Z.getWidth(), this.A);
                }
                this.f3201d0 = charSequence2;
            }
            CharSequence charSequence3 = this.f3201d0;
            float f5 = 0.0f;
            if (charSequence3 != null) {
                this.a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f3205g, this.D ? 1 : 0);
            int i4 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i4 != 48) {
                if (i4 != 80) {
                    this.f3216n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f3216n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f3216n = rect.top;
            }
            int i5 = absoluteGravity & 8388615;
            if (i5 != 1) {
                if (i5 != 5) {
                    this.f3218p = rect.left;
                } else {
                    this.f3218p = rect.right - this.a0;
                }
            } else {
                this.f3218p = rect.centerX() - (this.a0 / 2.0f);
            }
            if (this.a0 <= rect.width()) {
                float f6 = this.f3218p;
                float max = Math.max(0.0f, rect.left - f6) + f6;
                this.f3218p = max;
                this.f3218p = Math.min(0.0f, rect.right - (this.a0 + max)) + max;
            }
            float f7 = this.f3208i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f7);
            textPaint2.setTypeface(this.f3221s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f8 = this.f3216n;
                float max2 = Math.max(0.0f, rect.top - f8) + f8;
                this.f3216n = max2;
                this.f3216n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
            }
            d(0.0f, z2);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f3 = staticLayout.getHeight();
            } else {
                f3 = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.e0 > 1) {
                f4 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f4 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f4 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i3 = staticLayout3.getLineCount();
            } else {
                i3 = 0;
            }
            this.f3214l = i3;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f3203f, this.D ? 1 : 0);
            int i6 = absoluteGravity2 & 112;
            Rect rect2 = this.f3199c;
            if (i6 != 48) {
                if (i6 != 80) {
                    this.f3215m = rect2.centerY() - (f3 / 2.0f);
                } else {
                    float f9 = rect2.bottom - f3;
                    if (this.f3213k0) {
                        f5 = textPaint.descent();
                    }
                    this.f3215m = f9 + f5;
                }
            } else {
                this.f3215m = rect2.top;
            }
            int i7 = absoluteGravity2 & 8388615;
            if (i7 != 1) {
                if (i7 != 5) {
                    this.f3217o = rect2.left;
                } else {
                    this.f3217o = rect2.right - f4;
                }
            } else {
                this.f3217o = rect2.centerX() - (f4 / 2.0f);
            }
            d(this.f3197b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f3212k == colorStateList && this.f3210j == colorStateList) {
            return;
        }
        this.f3212k = colorStateList;
        this.f3210j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        z1.a aVar = this.f3228z;
        if (aVar != null) {
            aVar.f3350c = true;
        }
        if (this.f3223u != typeface) {
            this.f3223u = typeface;
            Typeface E = k2.h.E(this.f3196a.getContext().getResources().getConfiguration(), typeface);
            this.f3222t = E;
            if (E == null) {
                E = this.f3223u;
            }
            this.f3221s = E;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f3197b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f3197b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.c.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z2;
        boolean l3 = l(typeface);
        if (this.f3226x != typeface) {
            this.f3226x = typeface;
            Typeface E = k2.h.E(this.f3196a.getContext().getResources().getConfiguration(), typeface);
            this.f3225w = E;
            if (E == null) {
                E = this.f3226x;
            }
            this.f3224v = E;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!l3 && !z2) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f3204f0 == 1) {
            return true;
        }
        return false;
    }
}
