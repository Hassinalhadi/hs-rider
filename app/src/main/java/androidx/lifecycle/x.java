package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f590j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f591a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m.f f592b = new m.f();

    /* renamed from: c, reason: collision with root package name */
    public int f593c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f594e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f595f;

    /* renamed from: g, reason: collision with root package name */
    public int f596g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f597i;

    public x() {
        Object obj = f590j;
        this.f595f = obj;
        this.f594e = obj;
        this.f596g = -1;
    }

    public static void a(String str) {
        ((l.a) l.a.Z().f2491a).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        a.b.k("Cannot invoke ", str, " on a background thread");
    }

    public final void b(w wVar) {
        if (wVar.f588g) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i3 = wVar.h;
            int i4 = this.f596g;
            if (i3 < i4) {
                wVar.h = i4;
                androidx.emoji2.text.m mVar = wVar.f587f;
                Object obj = this.f594e;
                mVar.getClass();
                r rVar = (r) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) mVar.f299g;
                if (rVar != null && pVar.f455d0) {
                    View C = pVar.C();
                    if (C.getParent() == null) {
                        if (pVar.f458h0 != null) {
                            if (androidx.fragment.app.k0.F(3)) {
                                Log.d("FragmentManager", "DialogFragment " + mVar + " setting the content view on " + pVar.f458h0);
                            }
                            pVar.f458h0.setContentView(C);
                            return;
                        }
                        return;
                    }
                    a.b.i("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.h) {
            this.f597i = true;
            return;
        }
        this.h = true;
        do {
            this.f597i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                m.f fVar = this.f592b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f597i) {
                        break;
                    }
                }
            }
        } while (this.f597i);
        this.h = false;
    }

    public final void d(androidx.emoji2.text.m mVar) {
        Object obj;
        a("observeForever");
        w wVar = new w(this, mVar);
        m.f fVar = this.f592b;
        m.c a3 = fVar.a(mVar);
        if (a3 != null) {
            obj = a3.f2516g;
        } else {
            m.c cVar = new m.c(mVar, wVar);
            fVar.f2522i++;
            m.c cVar2 = fVar.f2521g;
            if (cVar2 == null) {
                fVar.f2520f = cVar;
                fVar.f2521g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.f2517i = cVar2;
                fVar.f2521g = cVar;
            }
            obj = null;
        }
        w wVar2 = (w) obj;
        if (!(wVar2 instanceof LiveData$LifecycleBoundObserver)) {
            if (wVar2 != null) {
                return;
            }
            wVar.c(true);
            return;
        }
        a.b.m("Cannot add the same observer with different lifecycles");
    }

    public final void e(Object obj) {
        a("setValue");
        this.f596g++;
        this.f594e = obj;
        c(null);
    }
}
