package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i0 implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final c1.d f561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f562b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f563c;
    public final j2.b d;

    public i0(c1.d dVar, p0 p0Var) {
        dVar.getClass();
        this.f561a = dVar;
        this.d = new j2.b(new h0(p0Var));
    }

    @Override // c1.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f563c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j0) this.d.a()).f564c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f562b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((f0) entry.getValue()).getClass();
        throw null;
    }
}
