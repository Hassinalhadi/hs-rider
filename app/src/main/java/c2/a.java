package c2;

import a.y;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1100f;

    /* renamed from: g, reason: collision with root package name */
    public final SideSheetBehavior f1101g;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i3) {
        this.f1100f = i3;
        this.f1101g = sideSheetBehavior;
    }

    @Override // a.y
    public final int D() {
        switch (this.f1100f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1101g;
                return Math.max(0, sideSheetBehavior.f1310n + sideSheetBehavior.f1311o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1101g;
                return Math.max(0, (sideSheetBehavior2.f1309m - sideSheetBehavior2.f1308l) - sideSheetBehavior2.f1311o);
        }
    }

    @Override // a.y
    public final int E() {
        switch (this.f1100f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1101g;
                return (-sideSheetBehavior.f1308l) - sideSheetBehavior.f1311o;
            default:
                return this.f1101g.f1309m;
        }
    }

    @Override // a.y
    public final int F() {
        switch (this.f1100f) {
            case 0:
                return this.f1101g.f1311o;
            default:
                return this.f1101g.f1309m;
        }
    }

    @Override // a.y
    public final int G() {
        switch (this.f1100f) {
            case 0:
                return -this.f1101g.f1308l;
            default:
                return D();
        }
    }

    @Override // a.y
    public final int H(View view) {
        switch (this.f1100f) {
            case 0:
                return view.getRight() + this.f1101g.f1311o;
            default:
                return view.getLeft() - this.f1101g.f1311o;
        }
    }

    @Override // a.y
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.f1100f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // a.y
    public final int J() {
        switch (this.f1100f) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // a.y
    public final boolean K(float f3) {
        switch (this.f1100f) {
            case 0:
                if (f3 > 0.0f) {
                    return true;
                }
                return false;
            default:
                if (f3 < 0.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.y
    public final boolean L(View view) {
        switch (this.f1100f) {
            case 0:
                if (view.getRight() < (D() - E()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (D() + this.f1101g.f1309m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.y
    public final boolean M(float f3, float f4) {
        switch (this.f1100f) {
            case 0:
                if (Math.abs(f3) > Math.abs(f4) && Math.abs(f3) > 500) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f3) > Math.abs(f4) && Math.abs(f3) > 500) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.y
    public final boolean d0(View view, float f3) {
        switch (this.f1100f) {
            case 0:
                if (Math.abs((f3 * this.f1101g.f1307k) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f3 * this.f1101g.f1307k) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.y
    public final void f0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        switch (this.f1100f) {
            case 0:
                if (i3 <= this.f1101g.f1309m) {
                    marginLayoutParams.leftMargin = i4;
                    return;
                }
                return;
            default:
                int i5 = this.f1101g.f1309m;
                if (i3 <= i5) {
                    marginLayoutParams.rightMargin = i5 - i3;
                    return;
                }
                return;
        }
    }

    @Override // a.y
    public final int j(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1100f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.y
    public final float k(int i3) {
        switch (this.f1100f) {
            case 0:
                float E = E();
                return (i3 - E) / (D() - E);
            default:
                float f3 = this.f1101g.f1309m;
                return (f3 - i3) / (f3 - D());
        }
    }
}
