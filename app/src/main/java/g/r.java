package g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.logistics.rider.lsposed.R;
import j0.c1;
import j0.p0;
import j0.q0;
import j0.r0;
import java.util.WeakHashMap;
import k.c3;
import k.f1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r implements j0.n, f1, j.x {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1769g;

    public /* synthetic */ r(c0 c0Var, int i3) {
        this.f1768f = i3;
        this.f1769g = c0Var;
    }

    @Override // j.x
    public void a(j.m mVar, boolean z2) {
        boolean z3;
        int i3;
        b0 b0Var;
        switch (this.f1768f) {
            case 2:
                this.f1769g.q(mVar);
                return;
            default:
                j.m k3 = mVar.k();
                int i4 = 0;
                if (k3 != mVar) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    mVar = k3;
                }
                c0 c0Var = this.f1769g;
                b0[] b0VarArr = c0Var.Q;
                if (b0VarArr != null) {
                    i3 = b0VarArr.length;
                } else {
                    i3 = 0;
                }
                while (true) {
                    if (i4 < i3) {
                        b0Var = b0VarArr[i4];
                        if (b0Var == null || b0Var.h != mVar) {
                            i4++;
                        }
                    } else {
                        b0Var = null;
                    }
                }
                if (b0Var != null) {
                    if (z3) {
                        c0Var.p(b0Var.f1640a, b0Var, k3);
                        c0Var.r(b0Var, true);
                        return;
                    } else {
                        c0Var.r(b0Var, z2);
                        return;
                    }
                }
                return;
        }
    }

    @Override // j.x
    public boolean b(j.m mVar) {
        Window.Callback callback;
        switch (this.f1768f) {
            case 2:
                Window.Callback callback2 = this.f1769g.f1670q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    return true;
                }
                return true;
            default:
                if (mVar == mVar.k()) {
                    c0 c0Var = this.f1769g;
                    if (c0Var.K && (callback = c0Var.f1670q.getCallback()) != null && !c0Var.V) {
                        callback.onMenuOpened(108, mVar);
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    @Override // j0.n
    public c1 d(View view, c1 c1Var) {
        boolean z2;
        r0 p0Var;
        int i3;
        int b3;
        int c3;
        boolean z3;
        int color;
        c1 c1Var2 = c1Var;
        int d = c1Var2.d();
        c0 c0Var = this.f1769g;
        Context context = c0Var.f1669p;
        int d3 = c1Var2.d();
        ActionBarContextView actionBarContextView = c0Var.A;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.A.getLayoutParams();
            boolean z4 = true;
            if (c0Var.A.isShown()) {
                if (c0Var.f1663h0 == null) {
                    c0Var.f1663h0 = new Rect();
                    c0Var.f1664i0 = new Rect();
                }
                Rect rect = c0Var.f1663h0;
                Rect rect2 = c0Var.f1664i0;
                rect.set(c1Var2.b(), c1Var2.d(), c1Var2.c(), c1Var2.a());
                c3.a(c0Var.F, rect, rect2);
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup = c0Var.F;
                WeakHashMap weakHashMap = j0.j0.f2160a;
                c1 a3 = j0.d0.a(viewGroup);
                if (a3 == null) {
                    b3 = 0;
                } else {
                    b3 = a3.b();
                }
                if (a3 == null) {
                    c3 = 0;
                } else {
                    c3 = a3.c();
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z3 = true;
                }
                if (i4 > 0 && c0Var.H == null) {
                    View view2 = new View(context);
                    c0Var.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b3;
                    layoutParams.rightMargin = c3;
                    c0Var.F.addView(c0Var.H, -1, layoutParams);
                } else {
                    View view3 = c0Var.H;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != b3 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = b3;
                            marginLayoutParams2.rightMargin = c3;
                            c0Var.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = c0Var.H;
                if (view4 == null) {
                    z4 = false;
                }
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = c0Var.H;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!c0Var.M && z4) {
                    d3 = 0;
                }
                z2 = z4;
                z4 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                c0Var.A.setLayoutParams(marginLayoutParams);
            }
        } else {
            z2 = false;
        }
        View view6 = c0Var.H;
        if (view6 != null) {
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view6.setVisibility(i3);
        }
        if (d != d3) {
            int b4 = c1Var2.b();
            int c4 = c1Var2.c();
            int a4 = c1Var2.a();
            if (Build.VERSION.SDK_INT >= 34) {
                p0Var = new q0(c1Var2);
            } else {
                p0Var = new p0(c1Var2);
            }
            p0Var.c(c0.b.b(b4, d3, c4, a4));
            c1Var2 = p0Var.b();
        }
        WeakHashMap weakHashMap2 = j0.j0.f2160a;
        WindowInsets e3 = c1Var2.e();
        if (e3 != null) {
            WindowInsets a5 = j0.a0.a(view, e3);
            if (!a5.equals(e3)) {
                return c1.f(view, a5);
            }
        }
        return c1Var2;
    }
}
