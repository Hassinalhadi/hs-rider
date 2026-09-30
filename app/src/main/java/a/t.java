package a;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class t extends s {
    @Override // a.r
    public void a(f0 f0Var, f0 f0Var2, Window window, View view, boolean z2, boolean z3) {
        f0Var.getClass();
        f0Var2.getClass();
        window.getClass();
        view.getClass();
        y.a0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m(window, view);
        mVar.x(!z2);
        mVar.w(true ^ z3);
    }
}
