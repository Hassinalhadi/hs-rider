package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k implements j.y {
    public h A;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2288f;

    /* renamed from: g, reason: collision with root package name */
    public Context f2289g;
    public j.m h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2290i;

    /* renamed from: j, reason: collision with root package name */
    public j.x f2291j;

    /* renamed from: m, reason: collision with root package name */
    public j.a0 f2294m;

    /* renamed from: n, reason: collision with root package name */
    public j f2295n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2296o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2297p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2298q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2299r;

    /* renamed from: s, reason: collision with root package name */
    public int f2300s;

    /* renamed from: t, reason: collision with root package name */
    public int f2301t;

    /* renamed from: u, reason: collision with root package name */
    public int f2302u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2303v;

    /* renamed from: x, reason: collision with root package name */
    public g f2305x;

    /* renamed from: y, reason: collision with root package name */
    public g f2306y;

    /* renamed from: z, reason: collision with root package name */
    public i f2307z;

    /* renamed from: k, reason: collision with root package name */
    public final int f2292k = R.layout.abc_action_menu_layout;

    /* renamed from: l, reason: collision with root package name */
    public final int f2293l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w, reason: collision with root package name */
    public final SparseBooleanArray f2304w = new SparseBooleanArray();
    public final androidx.emoji2.text.m B = new androidx.emoji2.text.m(17, this);

    public k(Context context) {
        this.f2288f = context;
        this.f2290i = LayoutInflater.from(context);
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z2) {
        f();
        g gVar = this.f2306y;
        if (gVar != null && gVar.b()) {
            gVar.f2137i.dismiss();
        }
        j.x xVar = this.f2291j;
        if (xVar != null) {
            xVar.a(mVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.z] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(j.o oVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = oVar.getActionView();
        int i3 = 0;
        if (actionView == null || oVar.e()) {
            if (view instanceof j.z) {
                actionMenuItemView = (j.z) view;
            } else {
                actionMenuItemView = (j.z) this.f2290i.inflate(this.f2293l, viewGroup, false);
            }
            actionMenuItemView.c(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2294m);
            if (this.A == null) {
                this.A = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        if (oVar.C) {
            i3 = 8;
        }
        actionView.setVisibility(i3);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // j.y
    public final void c(Context context, j.m mVar) {
        this.f2289g = context;
        LayoutInflater.from(context);
        this.h = mVar;
        Resources resources = context.getResources();
        if (!this.f2299r) {
            this.f2298q = true;
        }
        int i3 = 2;
        this.f2300s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i4 <= 600 && ((i4 <= 960 || i5 <= 720) && (i4 <= 720 || i5 <= 960))) {
            if (i4 < 500 && ((i4 <= 640 || i5 <= 480) && (i4 <= 480 || i5 <= 640))) {
                if (i4 >= 360) {
                    i3 = 3;
                }
            } else {
                i3 = 4;
            }
        } else {
            i3 = 5;
        }
        this.f2302u = i3;
        int i6 = this.f2300s;
        if (this.f2298q) {
            if (this.f2295n == null) {
                j jVar = new j(this, this.f2288f);
                this.f2295n = jVar;
                if (this.f2297p) {
                    jVar.setImageDrawable(this.f2296o);
                    this.f2296o = null;
                    this.f2297p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2295n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f2295n.getMeasuredWidth();
        } else {
            this.f2295n = null;
        }
        this.f2301t = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // j.y
    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        k kVar = this;
        j.m mVar = kVar.h;
        if (mVar != null) {
            arrayList = mVar.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = kVar.f2302u;
        int i6 = kVar.f2301t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kVar.f2294m;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z2 = true;
            if (i7 >= i3) {
                break;
            }
            j.o oVar = (j.o) arrayList.get(i7);
            int i10 = oVar.f2119y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z6 = true;
            }
            if (kVar.f2303v && oVar.C) {
                i5 = 0;
            }
            i7++;
        }
        if (kVar.f2298q && (z6 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = kVar.f2304w;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            j.o oVar2 = (j.o) arrayList.get(i12);
            int i14 = oVar2.f2119y;
            if ((i14 & 2) == i4) {
                z3 = z2;
            } else {
                z3 = false;
            }
            int i15 = oVar2.f2098b;
            if (z3) {
                View b3 = kVar.b(oVar2, null, viewGroup);
                b3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z2);
                }
                oVar2.f(z2);
            } else if ((i14 & 1) == z2) {
                boolean z7 = sparseBooleanArray.get(i15);
                if ((i11 > 0 || z7) && i6 > 0) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4) {
                    View b4 = kVar.b(oVar2, null, viewGroup);
                    b4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (i6 + i13 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 &= z5;
                }
                if (z4 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z7) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        j.o oVar3 = (j.o) arrayList.get(i16);
                        if (oVar3.f2098b == i15) {
                            if ((oVar3.f2118x & 32) == 32) {
                                i11++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z4) {
                    i11--;
                }
                oVar2.f(z4);
            } else {
                oVar2.f(false);
                i12++;
                i4 = 2;
                kVar = this;
                z2 = true;
            }
            i12++;
            i4 = 2;
            kVar = this;
            z2 = true;
        }
        return z2;
    }

    @Override // j.y
    public final boolean e(j.o oVar) {
        return false;
    }

    public final boolean f() {
        Object obj;
        i iVar = this.f2307z;
        if (iVar != null && (obj = this.f2294m) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.f2307z = null;
            return true;
        }
        g gVar = this.f2305x;
        if (gVar != null) {
            if (gVar.b()) {
                gVar.f2137i.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final void g() {
        int i3;
        j.o oVar;
        ViewGroup viewGroup = (ViewGroup) this.f2294m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            j.m mVar = this.h;
            if (mVar != null) {
                mVar.i();
                ArrayList l3 = this.h.l();
                int size = l3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    j.o oVar2 = (j.o) l3.get(i4);
                    if ((oVar2.f2118x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt instanceof j.z) {
                            oVar = ((j.z) childAt).getItemData();
                        } else {
                            oVar = null;
                        }
                        View b3 = b(oVar2, childAt, viewGroup);
                        if (oVar2 != oVar) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b3);
                            }
                            ((ViewGroup) this.f2294m).addView(b3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f2295n) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f2294m).requestLayout();
        j.m mVar2 = this.h;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f2079i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                j.p pVar = ((j.o) arrayList2.get(i5)).A;
            }
        }
        j.m mVar3 = this.h;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2080j;
        }
        if (this.f2298q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((j.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        j jVar = this.f2295n;
        if (z2) {
            if (jVar == null) {
                this.f2295n = new j(this, this.f2288f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2295n.getParent();
            if (viewGroup3 != this.f2294m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2295n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2294m;
                j jVar2 = this.f2295n;
                actionMenuView.getClass();
                m j3 = ActionMenuView.j();
                j3.f2315a = true;
                actionMenuView.addView(jVar2, j3);
            }
        } else if (jVar != null) {
            Object parent = jVar.getParent();
            Object obj = this.f2294m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f2295n);
            }
        }
        ((ActionMenuView) this.f2294m).setOverflowReserved(this.f2298q);
    }

    @Override // j.y
    public final boolean h(j.o oVar) {
        return false;
    }

    @Override // j.y
    public final void i(j.x xVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final boolean j(j.e0 e0Var) {
        boolean z2;
        if (e0Var.hasVisibleItems()) {
            j.e0 e0Var2 = e0Var;
            while (true) {
                j.m mVar = e0Var2.f2037z;
                if (mVar == this.h) {
                    break;
                }
                e0Var2 = (j.e0) mVar;
            }
            j.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f2294m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof j.z) && ((j.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f2077f.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        MenuItem item = e0Var.getItem(i4);
                        if (item.isVisible() && item.getIcon() != null) {
                            z2 = true;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                g gVar = new g(this, this.f2289g, e0Var, view);
                this.f2306y = gVar;
                gVar.f2136g = z2;
                j.u uVar = gVar.f2137i;
                if (uVar != null) {
                    uVar.o(z2);
                }
                g gVar2 = this.f2306y;
                if (!gVar2.b()) {
                    if (gVar2.f2134e != null) {
                        gVar2.d(0, 0, false, false);
                    } else {
                        a.b.i("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                j.x xVar = this.f2291j;
                if (xVar != null) {
                    xVar.b(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        g gVar = this.f2305x;
        if (gVar != null && gVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        j.m mVar;
        if (this.f2298q && !k() && (mVar = this.h) != null && this.f2294m != null && this.f2307z == null) {
            mVar.i();
            if (!mVar.f2080j.isEmpty()) {
                i iVar = new i(this, new g(this, this.f2289g, this.h, this.f2295n));
                this.f2307z = iVar;
                ((View) this.f2294m).post(iVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
