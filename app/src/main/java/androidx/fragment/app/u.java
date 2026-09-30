package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class u implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.p0, androidx.lifecycle.h, c1.f {
    public static final Object X = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public s M;
    public boolean N;
    public boolean O;
    public String P;
    public androidx.lifecycle.t R;
    public s0 S;
    public c1.e U;
    public final ArrayList V;
    public final q W;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f492g;
    public SparseArray h;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f493i;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f495k;

    /* renamed from: l, reason: collision with root package name */
    public u f496l;

    /* renamed from: n, reason: collision with root package name */
    public int f498n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f500p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f501q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f502r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f503s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f504t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f505u;

    /* renamed from: v, reason: collision with root package name */
    public int f506v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f507w;

    /* renamed from: x, reason: collision with root package name */
    public w f508x;

    /* renamed from: z, reason: collision with root package name */
    public u f510z;

    /* renamed from: f, reason: collision with root package name */
    public int f491f = -1;

    /* renamed from: j, reason: collision with root package name */
    public String f494j = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    public String f497m = null;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f499o = null;

    /* renamed from: y, reason: collision with root package name */
    public k0 f509y = new k0();
    public final boolean G = true;
    public boolean L = true;
    public androidx.lifecycle.m Q = androidx.lifecycle.m.f571j;
    public final androidx.lifecycle.x T = new androidx.lifecycle.x();

    public u() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new q(this);
        k();
    }

    public void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f509y.L();
        this.f505u = true;
        this.S = new s0(this, e());
        View s3 = s(layoutInflater, viewGroup);
        this.J = s3;
        s0 s0Var = this.S;
        if (s3 != null) {
            s0Var.d();
            View view = this.J;
            s0 s0Var2 = this.S;
            view.getClass();
            view.setTag(R.id.view_tree_lifecycle_owner, s0Var2);
            View view2 = this.J;
            s0 s0Var3 = this.S;
            view2.getClass();
            view2.setTag(R.id.view_tree_view_model_store_owner, s0Var3);
            View view3 = this.J;
            s0 s0Var4 = this.S;
            view3.getClass();
            view3.setTag(R.id.view_tree_saved_state_registry_owner, s0Var4);
            this.T.e(this.S);
            return;
        }
        if (s0Var.h == null) {
            this.S = null;
        } else {
            a.b.i("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context B() {
        Context h = h();
        if (h != null) {
            return h;
        }
        a.b.k("Fragment ", this, " not attached to a context.");
        return null;
    }

    public final View C() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        a.b.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    public final void D(int i3, int i4, int i5, int i6) {
        if (this.M == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        d().f478b = i3;
        d().f479c = i4;
        d().d = i5;
        d().f480e = i6;
    }

    public final void E(Bundle bundle) {
        k0 k0Var = this.f507w;
        if (k0Var != null && (k0Var.E || k0Var.F)) {
            a.b.i("Fragment already added and state has been saved");
        } else {
            this.f495k = bundle;
        }
    }

    @Override // androidx.lifecycle.h
    public final w0.c a() {
        Application application;
        Context applicationContext = B().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && k0.F(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + B().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        w0.c cVar = new w0.c(0);
        LinkedHashMap linkedHashMap = cVar.f3194a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f573a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f557a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f558b, this);
        Bundle bundle = this.f495k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f559c, bundle);
        }
        return cVar;
    }

    @Override // c1.f
    public final c1.d b() {
        return this.U.f1098b;
    }

    public a.y c() {
        return new r(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.s, java.lang.Object] */
    public final s d() {
        if (this.M == null) {
            ?? obj = new Object();
            Object obj2 = X;
            obj.f482g = obj2;
            obj.h = obj2;
            obj.f483i = obj2;
            obj.f484j = 1.0f;
            obj.f485k = null;
            this.M = obj;
        }
        return this.M;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        if (this.f507w != null) {
            if (i() != 1) {
                HashMap hashMap = this.f507w.L.f435e;
                androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap.get(this.f494j);
                if (o0Var == null) {
                    androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0();
                    hashMap.put(this.f494j, o0Var2);
                    return o0Var2;
                }
                return o0Var;
            }
            a.b.i("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        a.b.i("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.R;
    }

    public final k0 g() {
        if (this.f508x != null) {
            return this.f509y;
        }
        a.b.k("Fragment ", this, " has not been attached yet.");
        return null;
    }

    public final Context h() {
        w wVar = this.f508x;
        if (wVar == null) {
            return null;
        }
        return wVar.f522g;
    }

    public final int i() {
        androidx.lifecycle.m mVar = this.Q;
        if (mVar != androidx.lifecycle.m.f569g && this.f510z != null) {
            return Math.min(mVar.ordinal(), this.f510z.i());
        }
        return mVar.ordinal();
    }

    public final k0 j() {
        k0 k0Var = this.f507w;
        if (k0Var != null) {
            return k0Var;
        }
        a.b.k("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    public final void k() {
        this.R = new androidx.lifecycle.t(this);
        this.U = new c1.e(this);
        ArrayList arrayList = this.V;
        q qVar = this.W;
        if (!arrayList.contains(qVar)) {
            if (this.f491f >= 0) {
                u uVar = qVar.f464a;
                uVar.U.a();
                androidx.lifecycle.g0.a(uVar);
                return;
            }
            arrayList.add(qVar);
        }
    }

    public final void l() {
        k();
        this.P = this.f494j;
        this.f494j = UUID.randomUUID().toString();
        this.f500p = false;
        this.f501q = false;
        this.f502r = false;
        this.f503s = false;
        this.f504t = false;
        this.f506v = 0;
        this.f507w = null;
        this.f509y = new k0();
        this.f508x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean m() {
        boolean m3;
        if (!this.D) {
            k0 k0Var = this.f507w;
            if (k0Var != null) {
                u uVar = this.f510z;
                k0Var.getClass();
                if (uVar == null) {
                    m3 = false;
                } else {
                    m3 = uVar.m();
                }
                if (m3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n() {
        if (this.f506v > 0) {
            return true;
        }
        return false;
    }

    public void o() {
        this.H = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        g.i iVar;
        w wVar = this.f508x;
        if (wVar == null) {
            iVar = null;
        } else {
            iVar = wVar.f521f;
        }
        if (iVar != null) {
            iVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            a.b.k("Fragment ", this, " not attached to an activity.");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public final void p(int i3, int i4, Intent intent) {
        if (k0.F(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void q(Context context) {
        g.i iVar;
        this.H = true;
        w wVar = this.f508x;
        if (wVar == null) {
            iVar = null;
        } else {
            iVar = wVar.f521f;
        }
        if (iVar != null) {
            this.H = true;
        }
    }

    public void r(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f509y.R(parcelable);
            k0 k0Var = this.f509y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(1);
        }
        k0 k0Var2 = this.f509y;
        if (k0Var2.f413s >= 1) {
            return;
        }
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.t(1);
    }

    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void t() {
        this.H = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f494j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.H = true;
    }

    public LayoutInflater v(Bundle bundle) {
        w wVar = this.f508x;
        if (wVar != null) {
            g.i iVar = wVar.f524j;
            LayoutInflater cloneInContext = iVar.getLayoutInflater().cloneInContext(iVar);
            cloneInContext.setFactory2(this.f509y.f401f);
            return cloneInContext;
        }
        a.b.i("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public abstract void w(Bundle bundle);

    public void x() {
        this.H = true;
    }

    public void y() {
        this.H = true;
    }

    public void z(Bundle bundle) {
        this.H = true;
    }
}
