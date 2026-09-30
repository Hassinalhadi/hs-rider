package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2348a;
    public o2 d;

    /* renamed from: e, reason: collision with root package name */
    public o2 f2351e;

    /* renamed from: f, reason: collision with root package name */
    public o2 f2352f;

    /* renamed from: c, reason: collision with root package name */
    public int f2350c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final u f2349b = u.a();

    public p(View view) {
        this.f2348a = view;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [k.o2, java.lang.Object] */
    public final void a() {
        View view = this.f2348a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f2352f == null) {
                    this.f2352f = new Object();
                }
                o2 o2Var = this.f2352f;
                o2Var.f2345a = null;
                o2Var.d = false;
                o2Var.f2346b = null;
                o2Var.f2347c = false;
                WeakHashMap weakHashMap = j0.j0.f2160a;
                ColorStateList b3 = j0.c0.b(view);
                if (b3 != null) {
                    o2Var.d = true;
                    o2Var.f2345a = b3;
                }
                PorterDuff.Mode c3 = j0.c0.c(view);
                if (c3 != null) {
                    o2Var.f2347c = true;
                    o2Var.f2346b = c3;
                }
                if (o2Var.d || o2Var.f2347c) {
                    u.e(background, o2Var, view.getDrawableState());
                    return;
                }
            }
            o2 o2Var2 = this.f2351e;
            if (o2Var2 != null) {
                u.e(background, o2Var2, view.getDrawableState());
                return;
            }
            o2 o2Var3 = this.d;
            if (o2Var3 != null) {
                u.e(background, o2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        o2 o2Var = this.f2351e;
        if (o2Var != null) {
            return o2Var.f2345a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        o2 o2Var = this.f2351e;
        if (o2Var != null) {
            return o2Var.f2346b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i3) {
        ColorStateList f3;
        View view = this.f2348a;
        Context context = view.getContext();
        int[] iArr = f.a.f1551y;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) r3.f310c;
        View view2 = this.f2348a;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) r3.f310c;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        j0.g0.b(view2, context2, iArr, attributeSet, typedArray2, i3, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f2350c = typedArray.getResourceId(0, -1);
                u uVar = this.f2349b;
                Context context3 = view.getContext();
                int i4 = this.f2350c;
                synchronized (uVar) {
                    f3 = uVar.f2412a.f(context3, i4);
                }
                if (f3 != null) {
                    g(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                j0.c0.f(view, r3.h(1));
            }
            if (typedArray.hasValue(2)) {
                j0.c0.g(view, h1.b(typedArray.getInt(2, -1), null));
            }
            r3.t();
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    public final void e() {
        this.f2350c = -1;
        g(null);
        a();
    }

    public final void f(int i3) {
        ColorStateList colorStateList;
        this.f2350c = i3;
        u uVar = this.f2349b;
        if (uVar != null) {
            Context context = this.f2348a.getContext();
            synchronized (uVar) {
                colorStateList = uVar.f2412a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.o2, java.lang.Object] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new Object();
            }
            o2 o2Var = this.d;
            o2Var.f2345a = colorStateList;
            o2Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.o2, java.lang.Object] */
    public final void h(ColorStateList colorStateList) {
        if (this.f2351e == null) {
            this.f2351e = new Object();
        }
        o2 o2Var = this.f2351e;
        o2Var.f2345a = colorStateList;
        o2Var.d = true;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.o2, java.lang.Object] */
    public final void i(PorterDuff.Mode mode) {
        if (this.f2351e == null) {
            this.f2351e = new Object();
        }
        o2 o2Var = this.f2351e;
        o2Var.f2346b = mode;
        o2Var.f2347c = true;
        a();
    }
}
