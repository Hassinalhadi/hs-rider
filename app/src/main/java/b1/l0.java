package b1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f826b;

    public /* synthetic */ l0(n0 n0Var, int i3) {
        this.f825a = i3;
        this.f826b = n0Var;
    }

    public final int a(View view) {
        int right;
        int i3;
        switch (this.f825a) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                right = view.getRight() + ((o0) view.getLayoutParams()).f878b.right;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                right = view.getBottom() + ((o0) view.getLayoutParams()).f878b.bottom;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return right + i3;
    }

    public final int b(View view) {
        int left;
        int i3;
        switch (this.f825a) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                left = view.getLeft() - ((o0) view.getLayoutParams()).f878b.left;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                left = view.getTop() - ((o0) view.getLayoutParams()).f878b.top;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                break;
        }
        return left - i3;
    }

    public final int c() {
        int i3;
        int F;
        switch (this.f825a) {
            case 0:
                n0 n0Var = this.f826b;
                i3 = n0Var.f874n;
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = this.f826b;
                i3 = n0Var2.f875o;
                F = n0Var2.D();
                break;
        }
        return i3 - F;
    }

    public final int d() {
        switch (this.f825a) {
            case 0:
                return this.f826b.E();
            default:
                return this.f826b.G();
        }
    }
}
