package z1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b0.l;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3358c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3359e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3360f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3361g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3362i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3363j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f3364k;

    /* renamed from: l, reason: collision with root package name */
    public float f3365l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3366m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3367n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3368o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f3369p;

    public d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, f.a.f1548v);
        this.f3365l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3364k = h.l(context, obtainStyledAttributes, 3);
        h.l(context, obtainStyledAttributes, 4);
        h.l(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f3359e = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f3366m = obtainStyledAttributes.getResourceId(i4, 0);
        this.f3357b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3356a = h.l(context, obtainStyledAttributes, 6);
        this.f3360f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3361g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, i1.a.f1987t);
        this.f3362i = obtainStyledAttributes2.hasValue(0);
        this.f3363j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.f3358c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f3369p;
        int i3 = this.d;
        if (typeface == null && (str = this.f3357b) != null) {
            this.f3369p = Typeface.create(str, i3);
        }
        if (this.f3369p == null) {
            int i4 = this.f3359e;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        this.f3369p = Typeface.DEFAULT;
                    } else {
                        this.f3369p = Typeface.MONOSPACE;
                    }
                } else {
                    this.f3369p = Typeface.SERIF;
                }
            } else {
                this.f3369p = Typeface.SANS_SERIF;
            }
            this.f3369p = Typeface.create(this.f3369p, i3);
        }
    }

    public final void b(Context context, h hVar) {
        if (!c(context)) {
            a();
        }
        int i3 = this.f3366m;
        if (i3 == 0) {
            this.f3367n = true;
        }
        if (this.f3367n) {
            hVar.H(this.f3369p, true);
            return;
        }
        try {
            b bVar = new b(this, hVar);
            ThreadLocal threadLocal = l.f696a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                l.a(context, i3, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f3367n = true;
            hVar.G(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f3357b, e3);
            this.f3367n = true;
            hVar.G(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a3;
        String str;
        Typeface create;
        if (this.f3367n) {
            return true;
        }
        int i3 = this.f3366m;
        if (i3 != 0) {
            ThreadLocal threadLocal = l.f696a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a3 = null;
            } else {
                context2 = context;
                a3 = l.a(context2, i3, new TypedValue(), 0, null, false, true);
            }
            if (a3 != null) {
                this.f3369p = a3;
                this.f3367n = true;
                return true;
            }
            if (!this.f3368o) {
                this.f3368o = true;
                Resources resources = context2.getResources();
                int i4 = this.f3366m;
                if (i4 != 0 && resources.getResourceTypeName(i4).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i4);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), y.a.f3281b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.f3369p = typeface;
                this.f3367n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, h hVar) {
        int i3;
        int i4;
        e(context, textPaint, hVar);
        ColorStateList colorStateList = this.f3364k;
        if (colorStateList != null) {
            i3 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i3 = -16777216;
        }
        textPaint.setColor(i3);
        ColorStateList colorStateList2 = this.f3356a;
        if (colorStateList2 != null) {
            i4 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i4 = 0;
        }
        textPaint.setShadowLayer(this.h, this.f3360f, this.f3361g, i4);
    }

    public final void e(Context context, TextPaint textPaint, h hVar) {
        Typeface typeface;
        if (c(context) && this.f3367n && (typeface = this.f3369p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f3369p);
        b(context, new c(this, context, textPaint, hVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f3;
        Typeface E = h.E(context.getResources().getConfiguration(), typeface);
        if (E != null) {
            typeface = E;
        }
        textPaint.setTypeface(typeface);
        int i3 = (~typeface.getStyle()) & this.d;
        if ((i3 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i3 & 2) != 0) {
            f3 = -0.25f;
        } else {
            f3 = 0.0f;
        }
        textPaint.setTextSkewX(f3);
        textPaint.setTextSize(this.f3365l);
        textPaint.setFontVariationSettings(this.f3358c);
        if (this.f3362i) {
            textPaint.setLetterSpacing(this.f3363j);
        }
    }
}
