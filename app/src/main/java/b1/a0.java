package b1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 extends y {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b0 f711q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context) {
        super(context);
        this.f711q = b0Var;
    }

    @Override // b1.y
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // b1.y
    public final int e(int i3) {
        return Math.min(100, super.e(i3));
    }

    @Override // b1.y
    public final void h(View view, x0 x0Var) {
        b0 b0Var = this.f711q;
        int[] a3 = b0Var.a(b0Var.f716a.getLayoutManager(), view);
        int i3 = a3[0];
        int i4 = a3[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i3), Math.abs(i4))) / 0.3356d);
        if (ceil > 0) {
            x0Var.f932a = i3;
            x0Var.f933b = i4;
            x0Var.f934c = ceil;
            x0Var.f935e = this.f945j;
            x0Var.f936f = true;
        }
    }
}
