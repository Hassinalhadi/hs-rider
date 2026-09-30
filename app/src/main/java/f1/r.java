package f1;

import android.widget.FrameLayout;
import com.logistics.rider.lsposed.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1611a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1612b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1613c;

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.a, f1.n] */
    static {
        ?? nVar = new n();
        nVar.F = new ArrayList();
        nVar.I = false;
        nVar.J = 0;
        nVar.G = false;
        nVar.I(new h(2));
        nVar.I(new n());
        nVar.I(new h(1));
        f1611a = nVar;
        f1612b = new ThreadLocal();
        f1613c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [f1.q, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(FrameLayout frameLayout, n nVar) {
        ArrayList arrayList = f1613c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (nVar == null) {
                nVar = f1611a;
            }
            n clone = nVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    ((n) obj).w(frameLayout);
                }
            }
            clone.h(frameLayout, true);
            if (frameLayout.getTag(R.id.transition_current_scene) == null) {
                frameLayout.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.f1609f = clone;
                obj2.f1610g = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj2);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj2);
                return;
            }
            a.b.c();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.f, java.lang.Object, n.j] */
    public static n.f b() {
        n.f fVar;
        ThreadLocal threadLocal = f1612b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (n.f) weakReference.get()) != null) {
            return fVar;
        }
        ?? jVar = new n.j(0);
        threadLocal.set(new WeakReference(jVar));
        return jVar;
    }
}
