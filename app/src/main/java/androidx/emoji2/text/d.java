package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f276f;

    public d(e eVar) {
        this.f276f = eVar;
    }

    @Override // a.y
    public final void Q(Throwable th) {
        this.f276f.f277a.d(th);
    }

    @Override // a.y
    public final void T(w wVar) {
        Set<int[]> C;
        e eVar = this.f276f;
        eVar.f279c = wVar;
        w wVar2 = eVar.f279c;
        j jVar = eVar.f277a;
        b2.f fVar = jVar.f292g;
        c cVar = jVar.f293i;
        if (Build.VERSION.SDK_INT >= 34) {
            C = o.a();
        } else {
            C = a.y.C();
        }
        eVar.f278b = new s(wVar2, fVar, cVar, C);
        j jVar2 = eVar.f277a;
        ArrayList arrayList = new ArrayList();
        jVar2.f287a.writeLock().lock();
        try {
            jVar2.f289c = 1;
            arrayList.addAll(jVar2.f288b);
            jVar2.f288b.clear();
            jVar2.f287a.writeLock().unlock();
            jVar2.d.post(new h(arrayList, jVar2.f289c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f287a.writeLock().unlock();
            throw th;
        }
    }
}
