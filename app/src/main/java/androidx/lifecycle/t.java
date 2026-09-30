package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f579a;

    /* renamed from: b, reason: collision with root package name */
    public m.a f580b;

    /* renamed from: c, reason: collision with root package name */
    public m f581c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f582e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f583f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f584g;
    public final ArrayList h;

    public t(r rVar) {
        new AtomicReference();
        this.f579a = true;
        this.f580b = new m.a();
        this.f581c = m.f569g;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.s, java.lang.Object] */
    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        l lVar;
        c("addObserver");
        m mVar = this.f581c;
        m mVar2 = m.f568f;
        if (mVar != mVar2) {
            mVar2 = m.f569g;
        }
        ?? obj2 = new Object();
        HashMap hashMap = u.f585a;
        boolean z2 = qVar instanceof p;
        boolean z3 = qVar instanceof d;
        boolean z4 = false;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj3 = u.f586b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    g[] gVarArr = new g[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        obj2.f578b = reflectiveGenericLifecycleObserver;
        obj2.f577a = mVar2;
        m.a aVar = this.f580b;
        m.c a3 = aVar.a(qVar);
        if (a3 != null) {
            obj = a3.f2516g;
        } else {
            HashMap hashMap2 = aVar.f2512j;
            m.c cVar = new m.c(qVar, obj2);
            aVar.f2522i++;
            m.c cVar2 = aVar.f2521g;
            if (cVar2 == null) {
                aVar.f2520f = cVar;
                aVar.f2521g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.f2517i = cVar2;
                aVar.f2521g = cVar;
            }
            hashMap2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) != null || (rVar = (r) this.d.get()) == null) {
            return;
        }
        if (this.f582e != 0 || this.f583f) {
            z4 = true;
        }
        m b3 = b(qVar);
        this.f582e++;
        while (obj2.f577a.compareTo(b3) < 0 && this.f580b.f2512j.containsKey(qVar)) {
            m mVar3 = obj2.f577a;
            ArrayList arrayList = this.h;
            arrayList.add(mVar3);
            j jVar = l.Companion;
            m mVar4 = obj2.f577a;
            jVar.getClass();
            mVar4.getClass();
            int ordinal = mVar4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        lVar = null;
                    } else {
                        lVar = l.ON_RESUME;
                    }
                } else {
                    lVar = l.ON_START;
                }
            } else {
                lVar = l.ON_CREATE;
            }
            if (lVar != null) {
                obj2.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(qVar);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f577a);
            }
        }
        if (!z4) {
            g();
        }
        this.f582e--;
    }

    public final m b(q qVar) {
        m.c cVar;
        m mVar;
        s sVar;
        HashMap hashMap = this.f580b.f2512j;
        m mVar2 = null;
        if (hashMap.containsKey(qVar)) {
            cVar = ((m.c) hashMap.get(qVar)).f2517i;
        } else {
            cVar = null;
        }
        if (cVar != null && (sVar = (s) cVar.f2516g) != null) {
            mVar = sVar.f577a;
        } else {
            mVar = null;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            mVar2 = (m) arrayList.get(arrayList.size() - 1);
        }
        m mVar3 = this.f581c;
        mVar3.getClass();
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        if (mVar2 != null && mVar2.compareTo(mVar) < 0) {
            return mVar2;
        }
        return mVar;
    }

    public final void c(String str) {
        if (this.f579a) {
            ((l.a) l.a.Z().f2491a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        lVar.getClass();
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f581c;
        if (mVar2 != mVar) {
            m mVar3 = m.f569g;
            m mVar4 = m.f568f;
            if (mVar2 == mVar3 && mVar == mVar4) {
                StringBuilder sb = new StringBuilder("no event down from ");
                sb.append(this.f581c);
                Object obj = this.d.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.f581c = mVar;
            if (!this.f583f && this.f582e == 0) {
                this.f583f = true;
                g();
                this.f583f = false;
                if (this.f581c == mVar4) {
                    this.f580b = new m.a();
                    return;
                }
                return;
            }
            this.f584g = true;
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f580b.b(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.f584g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.g():void");
    }
}
