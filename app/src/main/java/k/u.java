package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2410b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static u f2411c;

    /* renamed from: a, reason: collision with root package name */
    public h2 f2412a;

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f2411c == null) {
                    d();
                }
                uVar = f2411c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public static synchronized PorterDuffColorFilter c(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e3;
        synchronized (u.class) {
            e3 = h2.e(i3, mode);
        }
        return e3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k.u, java.lang.Object] */
    public static synchronized void d() {
        synchronized (u.class) {
            if (f2411c == null) {
                ?? obj = new Object();
                f2411c = obj;
                obj.f2412a = h2.b();
                h2 h2Var = f2411c.f2412a;
                t tVar = new t();
                synchronized (h2Var) {
                    h2Var.f2273e = tVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, o2 o2Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = h2.f2268f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = o2Var.d;
            if (!z2 && !o2Var.f2347c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z2) {
                colorStateList = o2Var.f2345a;
            } else {
                colorStateList = null;
            }
            if (o2Var.f2347c) {
                mode = o2Var.f2346b;
            } else {
                mode = h2.f2268f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = h2.e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i3) {
        return this.f2412a.c(context, i3);
    }
}
