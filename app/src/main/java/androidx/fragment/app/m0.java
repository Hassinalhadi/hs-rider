package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final b2.f f433i = new b2.f(4);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f436f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f434c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f435e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f437g = false;
    public boolean h = false;

    public m0(boolean z2) {
        this.f436f = z2;
    }

    @Override // androidx.lifecycle.l0
    public final void b() {
        if (k0.F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f437g = true;
    }

    public final void c(u uVar) {
        if (k0.F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + uVar);
        }
        d(uVar.f494j);
    }

    public final void d(String str) {
        HashMap hashMap = this.d;
        m0 m0Var = (m0) hashMap.get(str);
        if (m0Var != null) {
            m0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f435e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap2.get(str);
        if (o0Var != null) {
            o0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(u uVar) {
        if (this.h) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f434c.remove(uVar.f494j) != null && k0.F(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + uVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f434c.equals(m0Var.f434c) && this.d.equals(m0Var.d) && this.f435e.equals(m0Var.f435e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f435e.hashCode() + ((this.d.hashCode() + (this.f434c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f434c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f435e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
