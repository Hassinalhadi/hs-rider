package j;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.fragment.app.p0;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import k.c2;
import k.f2;
import k.n1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public x B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2041g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2042i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2043j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f2044k;

    /* renamed from: s, reason: collision with root package name */
    public View f2052s;

    /* renamed from: t, reason: collision with root package name */
    public View f2053t;

    /* renamed from: u, reason: collision with root package name */
    public int f2054u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2055v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2056w;

    /* renamed from: x, reason: collision with root package name */
    public int f2057x;

    /* renamed from: y, reason: collision with root package name */
    public int f2058y;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2045l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2046m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final d f2047n = new d(0, this);

    /* renamed from: o, reason: collision with root package name */
    public final p0 f2048o = new p0(2, this);

    /* renamed from: p, reason: collision with root package name */
    public final androidx.emoji2.text.m f2049p = new androidx.emoji2.text.m(11, this);

    /* renamed from: q, reason: collision with root package name */
    public int f2050q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2051r = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2059z = false;

    public g(Context context, View view, int i3, boolean z2) {
        this.f2041g = context;
        this.f2052s = view;
        this.f2042i = i3;
        this.f2043j = z2;
        this.f2054u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2044k = new Handler();
    }

    @Override // j.y
    public final void a(m mVar, boolean z2) {
        int i3;
        ArrayList arrayList = this.f2046m;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (mVar == ((f) arrayList.get(i4)).f2039b) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 >= 0) {
            int i5 = i4 + 1;
            if (i5 < arrayList.size()) {
                ((f) arrayList.get(i5)).f2039b.c(false);
            }
            f fVar = (f) arrayList.remove(i4);
            m mVar2 = fVar.f2039b;
            f2 f2Var = fVar.f2038a;
            k.b0 b0Var = f2Var.E;
            mVar2.r(this);
            if (this.E) {
                c2.b(b0Var, null);
                b0Var.setAnimationStyle(0);
            }
            f2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f2054u = ((f) arrayList.get(size2 - 1)).f2040c;
            } else {
                if (this.f2052s.getLayoutDirection() == 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                this.f2054u = i3;
            }
            if (size2 == 0) {
                dismiss();
                x xVar = this.B;
                if (xVar != null) {
                    xVar.a(mVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.f2047n);
                    }
                    this.C = null;
                }
                this.f2053t.removeOnAttachStateChangeListener(this.f2048o);
                this.D.onDismiss();
                return;
            }
            if (z2) {
                ((f) arrayList.get(0)).f2039b.c(false);
            }
        }
    }

    @Override // j.c0
    public final boolean b() {
        ArrayList arrayList = this.f2046m;
        if (arrayList.size() <= 0 || !((f) arrayList.get(0)).f2038a.E.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // j.y
    public final boolean d() {
        return false;
    }

    @Override // j.c0
    public final void dismiss() {
        ArrayList arrayList = this.f2046m;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                f fVar = fVarArr[i3];
                if (fVar.f2038a.E.isShowing()) {
                    fVar.f2038a.dismiss();
                }
            }
        }
    }

    @Override // j.c0
    public final void f() {
        if (!b()) {
            ArrayList arrayList = this.f2045l;
            int size = arrayList.size();
            boolean z2 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                u((m) obj);
            }
            arrayList.clear();
            View view = this.f2052s;
            this.f2053t = view;
            if (view != null) {
                if (this.C == null) {
                    z2 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f2047n);
                }
                this.f2053t.addOnAttachStateChangeListener(this.f2048o);
            }
        }
    }

    @Override // j.y
    public final void g() {
        ArrayList arrayList = this.f2046m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((f) obj).f2038a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final void i(x xVar) {
        this.B = xVar;
    }

    @Override // j.y
    public final boolean j(e0 e0Var) {
        ArrayList arrayList = this.f2046m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            f fVar = (f) obj;
            if (e0Var == fVar.f2039b) {
                fVar.f2038a.h.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.B;
        if (xVar != null) {
            xVar.b(e0Var);
        }
        return true;
    }

    @Override // j.c0
    public final n1 k() {
        ArrayList arrayList = this.f2046m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2038a.h;
    }

    @Override // j.u
    public final void l(m mVar) {
        mVar.b(this, this.f2041g);
        if (b()) {
            u(mVar);
        } else {
            this.f2045l.add(mVar);
        }
    }

    @Override // j.u
    public final void n(View view) {
        if (this.f2052s != view) {
            this.f2052s = view;
            this.f2051r = Gravity.getAbsoluteGravity(this.f2050q, view.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void o(boolean z2) {
        this.f2059z = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f2046m;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                fVar = (f) arrayList.get(i3);
                if (!fVar.f2038a.E.isShowing()) {
                    break;
                } else {
                    i3++;
                }
            } else {
                fVar = null;
                break;
            }
        }
        if (fVar != null) {
            fVar.f2039b.c(false);
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
        if (this.f2050q != i3) {
            this.f2050q = i3;
            this.f2051r = Gravity.getAbsoluteGravity(i3, this.f2052s.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void q(int i3) {
        this.f2055v = true;
        this.f2057x = i3;
    }

    @Override // j.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // j.u
    public final void s(boolean z2) {
        this.A = z2;
    }

    @Override // j.u
    public final void t(int i3) {
        this.f2056w = true;
        this.f2058y = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0145, code lost:
    
        if (((r9.getWidth() + r10[0]) + r5) > r11.right) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0147, code lost:
    
        r13 = 0;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        r9 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        if ((r10[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Type inference failed for: r8v3, types: [k.a2, k.f2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(j.m r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.u(j.m):void");
    }
}
