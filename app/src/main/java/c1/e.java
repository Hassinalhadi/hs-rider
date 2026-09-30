package c1;

import a.g;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f1097a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1098b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1099c;

    public e(f fVar) {
        this.f1097a = fVar;
    }

    public final void a() {
        f fVar = this.f1097a;
        t f3 = fVar.f();
        if (f3.f581c == m.f569g) {
            f3.a(new Recreator(fVar));
            d dVar = this.f1098b;
            dVar.getClass();
            if (!dVar.f1092a) {
                f3.a(new g(2, dVar));
                dVar.f1092a = true;
                this.f1099c = true;
                return;
            }
            a.b.i("SavedStateRegistry was already attached.");
            return;
        }
        a.b.i("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f1099c) {
            a();
        }
        t f3 = this.f1097a.f();
        if (f3.f581c.compareTo(m.f570i) < 0) {
            d dVar = this.f1098b;
            if (dVar.f1092a) {
                if (!dVar.f1093b) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    dVar.f1095e = bundle2;
                    dVar.f1093b = true;
                    return;
                }
                a.b.i("SavedStateRegistry was already restored.");
                return;
            }
            a.b.i("You must call performAttach() before calling performRestore(Bundle).");
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + f3.f581c).toString());
    }

    public final void c(Bundle bundle) {
        d dVar = this.f1098b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f1095e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = (m.f) dVar.d;
        fVar.getClass();
        m.d dVar2 = new m.d(fVar);
        fVar.h.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
