package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.p f465a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.w f466b;

    /* renamed from: c, reason: collision with root package name */
    public final u f467c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f468e = -1;

    public q0(androidx.emoji2.text.p pVar, androidx.emoji2.text.w wVar, ClassLoader classLoader, e0 e0Var, o0 o0Var) {
        this.f465a = pVar;
        this.f466b = wVar;
        u a3 = e0Var.a(o0Var.f441f);
        Bundle bundle = o0Var.f449o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a3.E(bundle);
        a3.f494j = o0Var.f442g;
        a3.f502r = o0Var.h;
        a3.f504t = true;
        a3.A = o0Var.f443i;
        a3.B = o0Var.f444j;
        a3.C = o0Var.f445k;
        a3.F = o0Var.f446l;
        a3.f501q = o0Var.f447m;
        a3.E = o0Var.f448n;
        a3.D = o0Var.f450p;
        a3.Q = androidx.lifecycle.m.values()[o0Var.f451q];
        Bundle bundle2 = o0Var.f452r;
        if (bundle2 != null) {
            a3.f492g = bundle2;
        } else {
            a3.f492g = new Bundle();
        }
        this.f467c = a3;
        if (k0.F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a3);
        }
    }

    public final void a() {
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + uVar);
        }
        Bundle bundle = uVar.f492g;
        uVar.f509y.L();
        uVar.f491f = 3;
        uVar.H = false;
        uVar.o();
        if (uVar.H) {
            if (k0.F(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + uVar);
            }
            View view = uVar.J;
            if (view != null) {
                Bundle bundle2 = uVar.f492g;
                SparseArray<Parcelable> sparseArray = uVar.h;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    uVar.h = null;
                }
                if (uVar.J != null) {
                    uVar.S.f488i.b(uVar.f493i);
                    uVar.f493i = null;
                }
                uVar.H = false;
                uVar.z(bundle2);
                if (uVar.H) {
                    if (uVar.J != null) {
                        uVar.S.c(androidx.lifecycle.l.ON_CREATE);
                    }
                } else {
                    a.b.e(uVar, " did not call through to super.onViewStateRestored()");
                    return;
                }
            }
            uVar.f492g = null;
            k0 k0Var = uVar.f509y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(4);
            this.f465a.c(false);
            return;
        }
        a.b.e(uVar, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f466b.f320f;
        u uVar = this.f467c;
        ViewGroup viewGroup = uVar.I;
        int i3 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(uVar);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        u uVar2 = (u) arrayList.get(indexOf);
                        if (uVar2.I == viewGroup && (view = uVar2.J) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    u uVar3 = (u) arrayList.get(i4);
                    if (uVar3.I == viewGroup && (view2 = uVar3.J) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        uVar.I.addView(uVar.J, i3);
    }

    public final void c() {
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "moveto ATTACHED: " + uVar);
        }
        u uVar2 = uVar.f496l;
        q0 q0Var = null;
        androidx.emoji2.text.w wVar = this.f466b;
        if (uVar2 != null) {
            q0 q0Var2 = (q0) ((HashMap) wVar.f321g).get(uVar2.f494j);
            if (q0Var2 != null) {
                uVar.f497m = uVar.f496l.f494j;
                uVar.f496l = null;
                q0Var = q0Var2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(uVar);
                u uVar3 = uVar.f496l;
                sb.append(" declared target fragment ");
                sb.append(uVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = uVar.f497m;
            if (str != null && (q0Var = (q0) ((HashMap) wVar.f321g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(uVar);
                String str2 = uVar.f497m;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (q0Var != null) {
            q0Var.k();
        }
        k0 k0Var = uVar.f507w;
        uVar.f508x = k0Var.f414t;
        uVar.f510z = k0Var.f416v;
        androidx.emoji2.text.p pVar = this.f465a;
        pVar.k(false);
        ArrayList arrayList = uVar.V;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            u uVar4 = ((q) obj).f464a;
            uVar4.U.a();
            androidx.lifecycle.g0.a(uVar4);
        }
        arrayList.clear();
        uVar.f509y.b(uVar.f508x, uVar.c(), uVar);
        uVar.f491f = 0;
        uVar.H = false;
        uVar.q(uVar.f508x.f522g);
        if (uVar.H) {
            Iterator it = uVar.f507w.f407m.iterator();
            while (it.hasNext()) {
                ((n0) it.next()).d();
            }
            k0 k0Var2 = uVar.f509y;
            k0Var2.E = false;
            k0Var2.F = false;
            k0Var2.L.h = false;
            k0Var2.t(0);
            pVar.f(false);
            return;
        }
        a.b.e(uVar, " did not call through to super.onAttach()");
    }

    public final int d() {
        int i3;
        v0 v0Var;
        u uVar = this.f467c;
        if (uVar.f507w == null) {
            return uVar.f491f;
        }
        int i4 = this.f468e;
        int ordinal = uVar.Q.ordinal();
        int i5 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i4 = Math.min(i4, -1);
                    }
                } else {
                    i4 = Math.min(i4, 5);
                }
            } else {
                i4 = Math.min(i4, 1);
            }
        } else {
            i4 = Math.min(i4, 0);
        }
        if (uVar.f502r) {
            boolean z2 = uVar.f503s;
            int i6 = this.f468e;
            if (z2) {
                i4 = Math.max(i6, 2);
                View view = uVar.J;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = i6 < 4 ? Math.min(i4, uVar.f491f) : Math.min(i4, 1);
            }
        }
        if (!uVar.f500p) {
            i4 = Math.min(i4, 1);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            l f3 = l.f(viewGroup, uVar.j().D());
            v0 d = f3.d(uVar);
            if (d != null) {
                i3 = d.f516b;
            } else {
                i3 = 0;
            }
            ArrayList arrayList = f3.f423c;
            int size = arrayList.size();
            while (true) {
                if (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    v0Var = (v0) obj;
                    if (v0Var.f517c.equals(uVar) && !v0Var.f519f) {
                        break;
                    }
                } else {
                    v0Var = null;
                    break;
                }
            }
            if (v0Var != null && (i3 == 0 || i3 == 1)) {
                i5 = v0Var.f516b;
            } else {
                i5 = i3;
            }
        }
        if (i5 == 2) {
            i4 = Math.min(i4, 6);
        } else if (i5 == 3) {
            i4 = Math.max(i4, 3);
        } else if (uVar.f501q) {
            if (uVar.n()) {
                i4 = Math.min(i4, 1);
            } else {
                i4 = Math.min(i4, -1);
            }
        }
        if (uVar.K && uVar.f491f < 5) {
            i4 = Math.min(i4, 4);
        }
        if (k0.F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + uVar);
        }
        return i4;
    }

    public final void e() {
        Parcelable parcelable;
        boolean F = k0.F(3);
        final u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "moveto CREATED: " + uVar);
        }
        boolean z2 = uVar.O;
        Bundle bundle = uVar.f492g;
        if (!z2) {
            androidx.emoji2.text.p pVar = this.f465a;
            pVar.l(false);
            Bundle bundle2 = uVar.f492g;
            uVar.f509y.L();
            uVar.f491f = 1;
            uVar.H = false;
            uVar.R.a(new androidx.lifecycle.p() { // from class: androidx.fragment.app.Fragment$6
                @Override // androidx.lifecycle.p
                public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                    View view;
                    if (lVar == androidx.lifecycle.l.ON_STOP && (view = u.this.J) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            uVar.U.b(bundle2);
            uVar.r(bundle2);
            uVar.O = true;
            if (uVar.H) {
                uVar.R.d(androidx.lifecycle.l.ON_CREATE);
                pVar.g(false);
                return;
            } else {
                a.b.e(uVar, " did not call through to super.onCreate()");
                return;
            }
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            uVar.f509y.R(parcelable);
            k0 k0Var = uVar.f509y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(1);
        }
        uVar.f491f = 1;
    }

    public final void f() {
        String str;
        u uVar = this.f467c;
        if (uVar.f502r) {
            return;
        }
        if (k0.F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
        }
        LayoutInflater v3 = uVar.v(uVar.f492g);
        ViewGroup viewGroup = uVar.I;
        if (viewGroup == null) {
            int i3 = uVar.B;
            if (i3 != 0) {
                if (i3 != -1) {
                    viewGroup = (ViewGroup) uVar.f507w.f415u.R(i3);
                    if (viewGroup == null) {
                        if (!uVar.f504t) {
                            try {
                                str = uVar.B().getResources().getResourceName(uVar.B);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(uVar.B) + " (" + str + ") for fragment " + uVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        u0.b bVar = u0.c.f3020a;
                        u0.c.b(new u0.a(uVar, "Attempting to add fragment " + uVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        u0.c.a(uVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + uVar + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        uVar.I = viewGroup;
        uVar.A(v3, viewGroup, uVar.f492g);
        View view = uVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
            if (viewGroup != null) {
                b();
            }
            if (uVar.D) {
                uVar.J.setVisibility(8);
            }
            View view2 = uVar.J;
            WeakHashMap weakHashMap = j0.j0.f2160a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = uVar.J;
            if (isAttachedToWindow) {
                j0.a0.b(view3);
            } else {
                view3.addOnAttachStateChangeListener(new p0(0, view3));
            }
            uVar.f509y.t(2);
            this.f465a.r(false);
            int visibility = uVar.J.getVisibility();
            uVar.d().f484j = uVar.J.getAlpha();
            if (uVar.I != null && visibility == 0) {
                View findFocus = uVar.J.findFocus();
                if (findFocus != null) {
                    uVar.d().f485k = findFocus;
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar);
                    }
                }
                uVar.J.setAlpha(0.0f);
            }
        }
        uVar.f491f = 2;
    }

    public final void g() {
        boolean z2;
        boolean z3;
        boolean z4;
        u f3;
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "movefrom CREATED: " + uVar);
        }
        int i3 = 0;
        if (uVar.f501q && !uVar.n()) {
            z2 = true;
        } else {
            z2 = false;
        }
        androidx.emoji2.text.w wVar = this.f466b;
        if (z2) {
        }
        if (!z2) {
            m0 m0Var = (m0) wVar.f322i;
            if (m0Var.f434c.containsKey(uVar.f494j) && m0Var.f436f) {
                z4 = m0Var.f437g;
            } else {
                z4 = true;
            }
            if (!z4) {
                String str = uVar.f497m;
                if (str != null && (f3 = wVar.f(str)) != null && f3.F) {
                    uVar.f496l = f3;
                }
                uVar.f491f = 0;
                return;
            }
        }
        w wVar2 = uVar.f508x;
        if (wVar2 != null) {
            z3 = ((m0) wVar.f322i).f437g;
        } else {
            g.i iVar = wVar2.f522g;
            if (iVar != null) {
                z3 = !iVar.isChangingConfigurations();
            } else {
                z3 = true;
            }
        }
        if (z2 || z3) {
            ((m0) wVar.f322i).c(uVar);
        }
        uVar.f509y.k();
        uVar.R.d(androidx.lifecycle.l.ON_DESTROY);
        uVar.f491f = 0;
        uVar.O = false;
        uVar.H = true;
        this.f465a.h(false);
        ArrayList i4 = wVar.i();
        int size = i4.size();
        while (i3 < size) {
            Object obj = i4.get(i3);
            i3++;
            q0 q0Var = (q0) obj;
            if (q0Var != null) {
                u uVar2 = q0Var.f467c;
                if (uVar.f494j.equals(uVar2.f497m)) {
                    uVar2.f496l = uVar;
                    uVar2.f497m = null;
                }
            }
        }
        String str2 = uVar.f497m;
        if (str2 != null) {
            uVar.f496l = wVar.f(str2);
        }
        wVar.m(this);
    }

    public final void h() {
        View view;
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + uVar);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null && (view = uVar.J) != null) {
            viewGroup.removeView(view);
        }
        uVar.f509y.t(1);
        if (uVar.J != null) {
            s0 s0Var = uVar.S;
            s0Var.d();
            if (s0Var.h.f581c.compareTo(androidx.lifecycle.m.h) >= 0) {
                uVar.S.c(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        uVar.f491f = 1;
        uVar.H = false;
        uVar.t();
        if (uVar.H) {
            androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(uVar.e(), x0.a.d);
            String canonicalName = x0.a.class.getCanonicalName();
            if (canonicalName != null) {
                n.k kVar = ((x0.a) sVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), x0.a.class)).f3278c;
                if (kVar.h <= 0) {
                    uVar.f505u = false;
                    this.f465a.s(false);
                    uVar.I = null;
                    uVar.J = null;
                    uVar.S = null;
                    uVar.T.e(null);
                    uVar.f503s = false;
                    return;
                }
                kVar.f2576g[0].getClass();
                a.b.c();
                return;
            }
            a.b.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        a.b.e(uVar, " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean z2;
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + uVar);
        }
        uVar.f491f = -1;
        uVar.H = false;
        uVar.u();
        if (uVar.H) {
            k0 k0Var = uVar.f509y;
            if (!k0Var.G) {
                k0Var.k();
                uVar.f509y = new k0();
            }
            this.f465a.i(false);
            uVar.f491f = -1;
            uVar.f508x = null;
            uVar.f510z = null;
            uVar.f507w = null;
            if (!uVar.f501q || uVar.n()) {
                m0 m0Var = (m0) this.f466b.f322i;
                if (m0Var.f434c.containsKey(uVar.f494j) && m0Var.f436f) {
                    z2 = m0Var.f437g;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
            }
            if (k0.F(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + uVar);
            }
            uVar.l();
            return;
        }
        a.b.e(uVar, " did not call through to super.onDetach()");
    }

    public final void j() {
        u uVar = this.f467c;
        if (uVar.f502r && uVar.f503s && !uVar.f505u) {
            if (k0.F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
            }
            uVar.A(uVar.v(uVar.f492g), null, uVar.f492g);
            View view = uVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
                if (uVar.D) {
                    uVar.J.setVisibility(8);
                }
                uVar.f509y.t(2);
                this.f465a.r(false);
                uVar.f491f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        androidx.emoji2.text.w wVar = this.f466b;
        boolean z2 = this.d;
        u uVar = this.f467c;
        if (z2) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + uVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i3 = uVar.f491f;
                if (d != i3) {
                    if (d > i3) {
                        switch (i3 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (uVar.J != null && (viewGroup3 = uVar.I) != null) {
                                    l f3 = l.f(viewGroup3, uVar.j().D());
                                    int b3 = w0.b(uVar.J.getVisibility());
                                    if (k0.F(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar);
                                    }
                                    f3.a(b3, 2, this);
                                }
                                uVar.f491f = 4;
                                break;
                            case 5:
                                p();
                                break;
                            case 6:
                                uVar.f491f = 6;
                                break;
                            case 7:
                                n();
                                break;
                        }
                    } else {
                        switch (i3 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                g();
                                break;
                            case 1:
                                h();
                                uVar.f491f = 1;
                                break;
                            case 2:
                                uVar.f503s = false;
                                uVar.f491f = 2;
                                break;
                            case 3:
                                if (k0.F(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + uVar);
                                }
                                if (uVar.J != null && uVar.h == null) {
                                    o();
                                }
                                if (uVar.J != null && (viewGroup2 = uVar.I) != null) {
                                    l f4 = l.f(viewGroup2, uVar.j().D());
                                    if (k0.F(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar);
                                    }
                                    f4.a(1, 3, this);
                                }
                                uVar.f491f = 3;
                                break;
                            case 4:
                                q();
                                break;
                            case 5:
                                uVar.f491f = 5;
                                break;
                            case 6:
                                l();
                                break;
                        }
                    }
                    z3 = true;
                } else {
                    if (!z3 && i3 == -1 && uVar.f501q && !uVar.n()) {
                        if (k0.F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + uVar);
                        }
                        ((m0) wVar.f322i).c(uVar);
                        wVar.m(this);
                        if (k0.F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + uVar);
                        }
                        uVar.l();
                    }
                    if (uVar.N) {
                        if (uVar.J != null && (viewGroup = uVar.I) != null) {
                            l f5 = l.f(viewGroup, uVar.j().D());
                            if (uVar.D) {
                                if (k0.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar);
                                }
                                f5.a(3, 1, this);
                            } else {
                                if (k0.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar);
                                }
                                f5.a(2, 1, this);
                            }
                        }
                        k0 k0Var = uVar.f507w;
                        if (k0Var != null && uVar.f500p && k0.G(uVar)) {
                            k0Var.D = true;
                        }
                        uVar.N = false;
                        uVar.f509y.n();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "movefrom RESUMED: " + uVar);
        }
        uVar.f509y.t(5);
        if (uVar.J != null) {
            uVar.S.c(androidx.lifecycle.l.ON_PAUSE);
        }
        uVar.R.d(androidx.lifecycle.l.ON_PAUSE);
        uVar.f491f = 6;
        uVar.H = true;
        this.f465a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        u uVar = this.f467c;
        Bundle bundle = uVar.f492g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            uVar.h = uVar.f492g.getSparseParcelableArray("android:view_state");
            uVar.f493i = uVar.f492g.getBundle("android:view_registry_state");
            String string = uVar.f492g.getString("android:target_state");
            uVar.f497m = string;
            if (string != null) {
                uVar.f498n = uVar.f492g.getInt("android:target_req_state", 0);
            }
            boolean z2 = uVar.f492g.getBoolean("android:user_visible_hint", true);
            uVar.L = z2;
            if (!z2) {
                uVar.K = true;
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "moveto RESUMED: " + uVar);
        }
        s sVar = uVar.M;
        if (sVar == null) {
            view = null;
        } else {
            view = sVar.f485k;
        }
        if (view != null) {
            if (view != uVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != uVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (k0.F(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(uVar);
                sb.append(" resulting in focused view ");
                sb.append(uVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        uVar.d().f485k = null;
        uVar.f509y.L();
        uVar.f509y.y(true);
        uVar.f491f = 7;
        uVar.H = true;
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.h.d(lVar);
        }
        k0 k0Var = uVar.f509y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(7);
        this.f465a.n(false);
        uVar.f492g = null;
        uVar.h = null;
        uVar.f493i = null;
    }

    public final void o() {
        u uVar = this.f467c;
        if (uVar.J != null) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + uVar + " with view " + uVar.J);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            uVar.J.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                uVar.h = sparseArray;
            }
            Bundle bundle = new Bundle();
            uVar.S.f488i.c(bundle);
            if (!bundle.isEmpty()) {
                uVar.f493i = bundle;
            }
        }
    }

    public final void p() {
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "moveto STARTED: " + uVar);
        }
        uVar.f509y.L();
        uVar.f509y.y(true);
        uVar.f491f = 5;
        uVar.H = false;
        uVar.x();
        if (uVar.H) {
            androidx.lifecycle.t tVar = uVar.R;
            androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
            tVar.d(lVar);
            if (uVar.J != null) {
                uVar.S.h.d(lVar);
            }
            k0 k0Var = uVar.f509y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(5);
            this.f465a.p(false);
            return;
        }
        a.b.e(uVar, " did not call through to super.onStart()");
    }

    public final void q() {
        boolean F = k0.F(3);
        u uVar = this.f467c;
        if (F) {
            Log.d("FragmentManager", "movefrom STARTED: " + uVar);
        }
        k0 k0Var = uVar.f509y;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.t(4);
        if (uVar.J != null) {
            uVar.S.c(androidx.lifecycle.l.ON_STOP);
        }
        uVar.R.d(androidx.lifecycle.l.ON_STOP);
        uVar.f491f = 4;
        uVar.H = false;
        uVar.y();
        if (uVar.H) {
            this.f465a.q(false);
        } else {
            a.b.e(uVar, " did not call through to super.onStop()");
        }
    }

    public q0(androidx.emoji2.text.p pVar, androidx.emoji2.text.w wVar, u uVar) {
        this.f465a = pVar;
        this.f466b = wVar;
        this.f467c = uVar;
    }

    public q0(androidx.emoji2.text.p pVar, androidx.emoji2.text.w wVar, u uVar, o0 o0Var) {
        this.f465a = pVar;
        this.f466b = wVar;
        this.f467c = uVar;
        uVar.h = null;
        uVar.f493i = null;
        uVar.f506v = 0;
        uVar.f503s = false;
        uVar.f500p = false;
        u uVar2 = uVar.f496l;
        uVar.f497m = uVar2 != null ? uVar2.f494j : null;
        uVar.f496l = null;
        Bundle bundle = o0Var.f452r;
        if (bundle != null) {
            uVar.f492g = bundle;
        } else {
            uVar.f492g = new Bundle();
        }
    }
}
