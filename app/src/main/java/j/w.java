package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2131a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2133c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2134e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2136g;
    public x h;

    /* renamed from: i, reason: collision with root package name */
    public u f2137i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2138j;

    /* renamed from: f, reason: collision with root package name */
    public int f2135f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f2139k = new v(this);

    public w(Context context, m mVar, View view, boolean z2, int i3, int i4) {
        this.f2131a = context;
        this.f2132b = mVar;
        this.f2134e = view;
        this.f2133c = z2;
        this.d = i3;
    }

    public final u a() {
        u d0Var;
        if (this.f2137i == null) {
            Context context = this.f2131a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f2131a;
            if (min >= dimensionPixelSize) {
                d0Var = new g(context2, this.f2134e, this.d, this.f2133c);
            } else {
                d0Var = new d0(context2, this.f2132b, this.f2134e, this.d, this.f2133c);
            }
            d0Var.l(this.f2132b);
            d0Var.r(this.f2139k);
            d0Var.n(this.f2134e);
            d0Var.i(this.h);
            d0Var.o(this.f2136g);
            d0Var.p(this.f2135f);
            this.f2137i = d0Var;
        }
        return this.f2137i;
    }

    public final boolean b() {
        u uVar = this.f2137i;
        if (uVar != null && uVar.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f2137i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2138j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z2, boolean z3) {
        u a3 = a();
        a3.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2135f, this.f2134e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f2134e.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i5 = (int) ((this.f2131a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f2129f = new Rect(i3 - i5, i4 - i5, i3 + i5, i4 + i5);
        }
        a3.f();
    }
}
