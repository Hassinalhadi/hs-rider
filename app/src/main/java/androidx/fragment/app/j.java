package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f393a;

    /* renamed from: b, reason: collision with root package name */
    public Object f394b;

    public j(v0 v0Var, f0.c cVar) {
        this.f393a = v0Var;
        this.f394b = cVar;
    }

    public void c() {
        g.z zVar = (g.z) this.f393a;
        if (zVar != null) {
            try {
                ((g.c0) this.f394b).f1669p.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f393a = null;
        }
    }

    public void d() {
        v0 v0Var = (v0) this.f393a;
        f0.c cVar = (f0.c) this.f394b;
        HashSet hashSet = v0Var.f518e;
        if (hashSet.remove(cVar) && hashSet.isEmpty()) {
            v0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (menuItem instanceof d0.a) {
            d0.a aVar = (d0.a) menuItem;
            if (((n.j) this.f394b) == null) {
                this.f394b = new n.j(0);
            }
            MenuItem menuItem2 = (MenuItem) ((n.j) this.f394b).get(aVar);
            if (menuItem2 == null) {
                j.t tVar = new j.t((Context) this.f393a, aVar);
                ((n.j) this.f394b).put(aVar, tVar);
                return tVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e3 = e();
        if (e3.countActions() == 0) {
            return;
        }
        if (((g.z) this.f393a) == null) {
            this.f393a = new g.z(this);
        }
        ((g.c0) this.f394b).f1669p.registerReceiver((g.z) this.f393a, e3);
    }

    public j(Context context) {
        this.f393a = context;
    }

    public j(g.c0 c0Var) {
        this.f394b = c0Var;
    }
}
