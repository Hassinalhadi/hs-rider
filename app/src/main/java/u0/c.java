package u0;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3020a = b.f3019a;

    public static b a(u uVar) {
        while (uVar != null) {
            if (uVar.f508x != null && uVar.f500p) {
                uVar.j();
            }
            uVar = uVar.f510z;
        }
        return f3020a;
    }

    public static void b(a aVar) {
        if (k0.F(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f3018f.getClass().getName()), aVar);
        }
    }

    public static final void c(u uVar, String str) {
        str.getClass();
        b(new a(uVar, "Attempting to reuse fragment " + uVar + " with previous ID " + str));
        a(uVar).getClass();
    }
}
