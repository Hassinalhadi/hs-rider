package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.logistics.rider.lsposed.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: g, reason: collision with root package name */
    public static h2 f2269g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2271b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2272c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public t f2273e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2268f = PorterDuff.Mode.SRC_IN;
    public static final g2 h = new b1.k1(6);

    public static synchronized h2 b() {
        h2 h2Var;
        synchronized (h2.class) {
            try {
                if (f2269g == null) {
                    f2269g = new h2();
                }
                h2Var = f2269g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (h2.class) {
            g2 g2Var = h;
            g2Var.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) g2Var.f(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        if (this.f2272c == null) {
            this.f2272c = new TypedValue();
        }
        TypedValue typedValue = this.f2272c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            n.h hVar = (n.h) this.f2271b.get(context);
            layerDrawable = null;
            if (hVar != null) {
                WeakReference weakReference = (WeakReference) hVar.b(j3);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b3 = o.a.b(hVar.f2569g, hVar.f2570i, j3);
                        if (b3 >= 0) {
                            Object[] objArr = hVar.h;
                            Object obj = objArr[b3];
                            Object obj2 = n.i.f2571a;
                            if (obj != obj2) {
                                objArr[b3] = obj2;
                                hVar.f2568f = true;
                            }
                        }
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.f2273e != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        n.h hVar2 = (n.h) this.f2271b.get(context);
                        if (hVar2 == null) {
                            hVar2 = new n.h();
                            this.f2271b.put(context, hVar2);
                        }
                        hVar2.d(j3, new WeakReference(constantState2));
                        return layerDrawable;
                    }
                    return layerDrawable;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3, false);
    }

    public final synchronized Drawable d(Context context, int i3, boolean z2) {
        Drawable a3;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof g1.p) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i3);
            if (a3 == null) {
                a3 = context.getDrawable(i3);
            }
            if (a3 != null) {
                a3 = g(context, i3, z2, a3);
            }
            if (a3 != null) {
                h1.a(a3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        n.k kVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2270a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (kVar = (n.k) weakHashMap.get(context)) != null) {
            int a3 = o.a.a(kVar.h, i3, kVar.f2575f);
            if (a3 < 0 || (obj = kVar.f2576g[a3]) == n.i.f2572b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            t tVar = this.f2273e;
            if (tVar != null) {
                colorStateList2 = tVar.d(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f2270a == null) {
                    this.f2270a = new WeakHashMap();
                }
                n.k kVar2 = (n.k) this.f2270a.get(context);
                if (kVar2 == null) {
                    kVar2 = new n.k();
                    this.f2270a.put(context, kVar2);
                }
                kVar2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h2.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
