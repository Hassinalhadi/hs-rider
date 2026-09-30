package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2420a;

    /* renamed from: b, reason: collision with root package name */
    public o2 f2421b;

    /* renamed from: c, reason: collision with root package name */
    public o2 f2422c;
    public o2 d;

    /* renamed from: e, reason: collision with root package name */
    public o2 f2423e;

    /* renamed from: f, reason: collision with root package name */
    public o2 f2424f;

    /* renamed from: g, reason: collision with root package name */
    public o2 f2425g;
    public o2 h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f2426i;

    /* renamed from: j, reason: collision with root package name */
    public int f2427j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2428k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2429l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2430m;

    public w0(TextView textView) {
        this.f2420a = textView;
        this.f2426i = new d1(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [k.o2, java.lang.Object] */
    public static o2 c(Context context, u uVar, int i3) {
        ColorStateList f3;
        synchronized (uVar) {
            f3 = uVar.f2412a.f(context, i3);
        }
        if (f3 != null) {
            ?? obj = new Object();
            obj.d = true;
            obj.f2345a = f3;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, o2 o2Var) {
        if (drawable != null && o2Var != null) {
            u.e(drawable, o2Var, this.f2420a.getDrawableState());
        }
    }

    public final void b() {
        o2 o2Var = this.f2421b;
        TextView textView = this.f2420a;
        if (o2Var != null || this.f2422c != null || this.d != null || this.f2423e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2421b);
            a(compoundDrawables[1], this.f2422c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f2423e);
        }
        if (this.f2424f == null && this.f2425g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2424f);
        a(compoundDrawablesRelative[2], this.f2425g);
    }

    public final ColorStateList d() {
        o2 o2Var = this.h;
        if (o2Var != null) {
            return o2Var.f2345a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        o2 o2Var = this.h;
        if (o2Var != null) {
            return o2Var.f2346b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, f.a.f1548v);
        androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2420a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, sVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        sVar.t();
        Typeface typeface = this.f2429l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2427j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.o2, java.lang.Object] */
    public final void h(ColorStateList colorStateList) {
        boolean z2;
        if (this.h == null) {
            this.h = new Object();
        }
        o2 o2Var = this.h;
        o2Var.f2345a = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        o2Var.d = z2;
        this.f2421b = o2Var;
        this.f2422c = o2Var;
        this.d = o2Var;
        this.f2423e = o2Var;
        this.f2424f = o2Var;
        this.f2425g = o2Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.o2, java.lang.Object] */
    public final void i(PorterDuff.Mode mode) {
        boolean z2;
        if (this.h == null) {
            this.h = new Object();
        }
        o2 o2Var = this.h;
        o2Var.f2346b = mode;
        if (mode != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        o2Var.f2347c = z2;
        this.f2421b = o2Var;
        this.f2422c = o2Var;
        this.d = o2Var;
        this.f2423e = o2Var;
        this.f2424f = o2Var;
        this.f2425g = o2Var;
    }

    public final void j(Context context, androidx.emoji2.text.s sVar) {
        String string;
        boolean z2;
        boolean z3;
        int i3 = this.f2427j;
        TypedArray typedArray = (TypedArray) sVar.f310c;
        this.f2427j = typedArray.getInt(2, i3);
        int i4 = typedArray.getInt(11, -1);
        this.f2428k = i4;
        if (i4 != -1) {
            this.f2427j &= 2;
        }
        int i5 = 10;
        boolean z4 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2430m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            this.f2429l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f2429l = Typeface.SERIF;
                    return;
                }
                this.f2429l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f2429l = null;
        if (typedArray.hasValue(12)) {
            i5 = 12;
        }
        int i7 = this.f2428k;
        int i8 = this.f2427j;
        if (!context.isRestricted()) {
            try {
                Typeface k3 = sVar.k(i5, this.f2427j, new r0(this, i7, i8, new WeakReference(this.f2420a)));
                if (k3 != null) {
                    if (this.f2428k != -1) {
                        Typeface create = Typeface.create(k3, 0);
                        int i9 = this.f2428k;
                        if ((this.f2427j & 2) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f2429l = v0.a(create, i9, z3);
                    } else {
                        this.f2429l = k3;
                    }
                }
                if (this.f2429l == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f2430m = z2;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2429l == null && (string = typedArray.getString(i5)) != null) {
            if (this.f2428k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i10 = this.f2428k;
                if ((this.f2427j & 2) != 0) {
                    z4 = true;
                }
                this.f2429l = v0.a(create2, i10, z4);
                return;
            }
            this.f2429l = Typeface.create(string, this.f2427j);
        }
    }
}
