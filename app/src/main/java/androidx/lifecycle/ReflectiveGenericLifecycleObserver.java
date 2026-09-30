package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: f, reason: collision with root package name */
    public final q f537f;

    /* renamed from: g, reason: collision with root package name */
    public final a f538g;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f537f = qVar;
        c cVar = c.f552c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f553a.get(cls);
        this.f538g = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        HashMap hashMap = this.f538g.f541a;
        List list = (List) hashMap.get(lVar);
        q qVar = this.f537f;
        a.a(list, rVar, lVar, qVar);
        a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, qVar);
    }
}
