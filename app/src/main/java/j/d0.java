package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.p0;
import com.logistics.rider.lsposed.R;
import k.a2;
import k.f2;
import k.n1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final Context f2016g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public final j f2017i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2018j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2019k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2020l;

    /* renamed from: m, reason: collision with root package name */
    public final f2 f2021m;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2024p;

    /* renamed from: q, reason: collision with root package name */
    public View f2025q;

    /* renamed from: r, reason: collision with root package name */
    public View f2026r;

    /* renamed from: s, reason: collision with root package name */
    public x f2027s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f2028t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2029u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2030v;

    /* renamed from: w, reason: collision with root package name */
    public int f2031w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2033y;

    /* renamed from: n, reason: collision with root package name */
    public final d f2022n = new d(1, this);

    /* renamed from: o, reason: collision with root package name */
    public final p0 f2023o = new p0(3, this);

    /* renamed from: x, reason: collision with root package name */
    public int f2032x = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [k.a2, k.f2] */
    public d0(Context context, m mVar, View view, int i3, boolean z2) {
        this.f2016g = context;
        this.h = mVar;
        this.f2018j = z2;
        this.f2017i = new j(mVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2020l = i3;
        Resources resources = context.getResources();
        this.f2019k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2025q = view;
        this.f2021m = new a2(context, null, i3, 0);
        mVar.b(this, context);
    }

    @Override // j.y
    public final void a(m mVar, boolean z2) {
        if (mVar == this.h) {
            dismiss();
            x xVar = this.f2027s;
            if (xVar != null) {
                xVar.a(mVar, z2);
            }
        }
    }

    @Override // j.c0
    public final boolean b() {
        if (!this.f2029u && this.f2021m.E.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // j.y
    public final boolean d() {
        return false;
    }

    @Override // j.c0
    public final void dismiss() {
        if (b()) {
            this.f2021m.dismiss();
        }
    }

    @Override // j.c0
    public final void f() {
        View view;
        boolean z2;
        Rect rect;
        if (b()) {
            return;
        }
        if (!this.f2029u && (view = this.f2025q) != null) {
            this.f2026r = view;
            f2 f2Var = this.f2021m;
            k.b0 b0Var = f2Var.E;
            k.b0 b0Var2 = f2Var.E;
            b0Var.setOnDismissListener(this);
            f2Var.f2228u = this;
            f2Var.D = true;
            b0Var2.setFocusable(true);
            View view2 = this.f2026r;
            if (this.f2028t == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f2028t = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2022n);
            }
            view2.addOnAttachStateChangeListener(this.f2023o);
            f2Var.f2227t = view2;
            f2Var.f2224q = this.f2032x;
            boolean z3 = this.f2030v;
            Context context = this.f2016g;
            j jVar = this.f2017i;
            if (!z3) {
                this.f2031w = u.m(jVar, context, this.f2019k);
                this.f2030v = true;
            }
            f2Var.r(this.f2031w);
            b0Var2.setInputMethodMode(2);
            Rect rect2 = this.f2129f;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            f2Var.C = rect;
            f2Var.f();
            n1 n1Var = f2Var.h;
            n1Var.setOnKeyListener(this);
            if (this.f2033y) {
                m mVar = this.h;
                if (mVar.f2083m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(mVar.f2083m);
                    }
                    frameLayout.setEnabled(false);
                    n1Var.addHeaderView(frameLayout, null, false);
                }
            }
            f2Var.o(jVar);
            f2Var.f();
            return;
        }
        a.b.i("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // j.y
    public final void g() {
        this.f2030v = false;
        j jVar = this.f2017i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final void i(x xVar) {
        this.f2027s = xVar;
    }

    @Override // j.y
    public final boolean j(e0 e0Var) {
        boolean z2;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f2016g, e0Var, this.f2026r, this.f2018j, this.f2020l, 0);
            x xVar = this.f2027s;
            wVar.h = xVar;
            u uVar = wVar.f2137i;
            if (uVar != null) {
                uVar.i(xVar);
            }
            int size = e0Var.f2077f.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    MenuItem item = e0Var.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                } else {
                    z2 = false;
                    break;
                }
            }
            wVar.f2136g = z2;
            u uVar2 = wVar.f2137i;
            if (uVar2 != null) {
                uVar2.o(z2);
            }
            wVar.f2138j = this.f2024p;
            this.f2024p = null;
            this.h.c(false);
            f2 f2Var = this.f2021m;
            int i4 = f2Var.f2218k;
            int g3 = f2Var.g();
            if ((Gravity.getAbsoluteGravity(this.f2032x, this.f2025q.getLayoutDirection()) & 7) == 5) {
                i4 += this.f2025q.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2134e != null) {
                    wVar.d(i4, g3, true, true);
                }
            }
            x xVar2 = this.f2027s;
            if (xVar2 != null) {
                xVar2.b(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // j.c0
    public final n1 k() {
        return this.f2021m.h;
    }

    @Override // j.u
    public final void n(View view) {
        this.f2025q = view;
    }

    @Override // j.u
    public final void o(boolean z2) {
        this.f2017i.f2069c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2029u = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2028t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2028t = this.f2026r.getViewTreeObserver();
            }
            this.f2028t.removeGlobalOnLayoutListener(this.f2022n);
            this.f2028t = null;
        }
        this.f2026r.removeOnAttachStateChangeListener(this.f2023o);
        PopupWindow.OnDismissListener onDismissListener = this.f2024p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i3 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.u
    public final void p(int i3) {
        this.f2032x = i3;
    }

    @Override // j.u
    public final void q(int i3) {
        this.f2021m.f2218k = i3;
    }

    @Override // j.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2024p = onDismissListener;
    }

    @Override // j.u
    public final void s(boolean z2) {
        this.f2033y = z2;
    }

    @Override // j.u
    public final void t(int i3) {
        this.f2021m.n(i3);
    }

    @Override // j.u
    public final void l(m mVar) {
    }
}
