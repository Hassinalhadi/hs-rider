package j0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c0 {
    public static c1 a(View view, c1 c1Var, Rect rect) {
        WindowInsets e3 = c1Var.e();
        if (e3 != null) {
            return c1.f(view, view.computeSystemWindowInsets(e3, rect));
        }
        rect.setEmpty();
        return c1Var;
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static String d(View view) {
        return view.getTransitionName();
    }

    public static float e(View view) {
        return view.getZ();
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f3) {
        view.setElevation(f3);
    }

    public static void i(View view, n nVar) {
        b0 b0Var;
        if (nVar != null) {
            b0Var = new b0(view, nVar);
        } else {
            b0Var = null;
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (b0Var != null) {
            view.setOnApplyWindowInsetsListener(b0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
