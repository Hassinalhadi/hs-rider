package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f557a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f558b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f559c = new Object();

    public static final void a(c1.f fVar) {
        c1.c cVar;
        m mVar = fVar.f().f581c;
        if (mVar != m.f569g && mVar != m.h) {
            a.b.m("Failed requirement.");
            return;
        }
        Iterator it = ((m.f) fVar.b().d).iterator();
        while (true) {
            m.b bVar = (m.b) it;
            if (bVar.hasNext()) {
                Map.Entry entry = (Map.Entry) bVar.next();
                entry.getClass();
                String str = (String) entry.getKey();
                cVar = (c1.c) entry.getValue();
                if (p2.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            } else {
                cVar = null;
                break;
            }
        }
        if (cVar == null) {
            i0 i0Var = new i0(fVar.b(), (p0) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            fVar.f().a(new SavedStateHandleAttacher(i0Var));
        }
    }
}
