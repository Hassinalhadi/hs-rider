package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v extends u {
    @Override // a.t, a.r
    public void a(f0 f0Var, f0 f0Var2, Window window, View view, boolean z2, boolean z3) {
        f0Var.getClass();
        f0Var2.getClass();
        window.getClass();
        view.getClass();
        y.a0(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            Context context = viewGroup.getContext();
            List asList = Arrays.asList(new m0.a(2, 0), new m0.a(1, 0), new m0.a(4, 0), new m0.a(8, 0));
            asList.getClass();
            viewGroup.addView(new m0.d(context, asList));
        }
        window.setNavigationBarContrastEnforced(true);
        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m(window, view);
        mVar.x(!z2);
        mVar.w(!z3);
    }
}
