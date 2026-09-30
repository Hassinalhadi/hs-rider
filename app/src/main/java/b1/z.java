package b1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z extends androidx.emoji2.text.f {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(n0 n0Var, int i3) {
        super(n0Var);
        this.d = i3;
    }

    @Override // androidx.emoji2.text.f
    public final int b(View view) {
        int right;
        int i3;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                right = view.getRight() + ((o0) view.getLayoutParams()).f878b.right;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                right = view.getBottom() + ((o0) view.getLayoutParams()).f878b.bottom;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return right + i3;
    }

    @Override // androidx.emoji2.text.f
    public final int c(View view) {
        int A;
        int i3;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                A = n0.A(view) + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                A = n0.z(view) + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return A + i3;
    }

    @Override // androidx.emoji2.text.f
    public final int d(View view) {
        int z2;
        int i3;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                z2 = n0.z(view) + ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                z2 = n0.A(view) + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin;
                break;
        }
        return z2 + i3;
    }

    @Override // androidx.emoji2.text.f
    public final int e(View view) {
        int left;
        int i3;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                left = view.getLeft() - ((o0) view.getLayoutParams()).f878b.left;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f281b).getClass();
                left = view.getTop() - ((o0) view.getLayoutParams()).f878b.top;
                i3 = ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                break;
        }
        return left - i3;
    }

    @Override // androidx.emoji2.text.f
    public final int f() {
        switch (this.d) {
            case 0:
                return ((n0) this.f281b).f874n;
            default:
                return ((n0) this.f281b).f875o;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int g() {
        int i3;
        int F;
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) this.f281b;
                i3 = n0Var.f874n;
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = (n0) this.f281b;
                i3 = n0Var2.f875o;
                F = n0Var2.D();
                break;
        }
        return i3 - F;
    }

    @Override // androidx.emoji2.text.f
    public final int h() {
        switch (this.d) {
            case 0:
                return ((n0) this.f281b).F();
            default:
                return ((n0) this.f281b).D();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int i() {
        switch (this.d) {
            case 0:
                return ((n0) this.f281b).f872l;
            default:
                return ((n0) this.f281b).f873m;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int j() {
        switch (this.d) {
            case 0:
                return ((n0) this.f281b).f873m;
            default:
                return ((n0) this.f281b).f872l;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int k() {
        switch (this.d) {
            case 0:
                return ((n0) this.f281b).E();
            default:
                return ((n0) this.f281b).G();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int l() {
        int E;
        int F;
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) this.f281b;
                E = n0Var.f874n - n0Var.E();
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = (n0) this.f281b;
                E = n0Var2.f875o - n0Var2.G();
                F = n0Var2.D();
                break;
        }
        return E - F;
    }

    @Override // androidx.emoji2.text.f
    public final int m(View view) {
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) this.f281b;
                Rect rect = (Rect) this.f282c;
                n0Var.K(view, rect);
                return rect.right;
            default:
                n0 n0Var2 = (n0) this.f281b;
                Rect rect2 = (Rect) this.f282c;
                n0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int n(View view) {
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) this.f281b;
                Rect rect = (Rect) this.f282c;
                n0Var.K(view, rect);
                return rect.left;
            default:
                n0 n0Var2 = (n0) this.f281b;
                Rect rect2 = (Rect) this.f282c;
                n0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.f
    public final void o(int i3) {
        switch (this.d) {
            case 0:
                ((n0) this.f281b).O(i3);
                return;
            default:
                ((n0) this.f281b).P(i3);
                return;
        }
    }
}
