package f1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import j0.c0;
import j0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class n implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final b2.f D = new b2.f(9);
    public static final ThreadLocal E = new ThreadLocal();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1596p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1597q;

    /* renamed from: r, reason: collision with root package name */
    public l[] f1598r;

    /* renamed from: f, reason: collision with root package name */
    public final String f1587f = getClass().getName();

    /* renamed from: g, reason: collision with root package name */
    public long f1588g = -1;
    public long h = -1;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f1589i = null;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1590j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1591k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public androidx.emoji2.text.w f1592l = new androidx.emoji2.text.w(3);

    /* renamed from: m, reason: collision with root package name */
    public androidx.emoji2.text.w f1593m = new androidx.emoji2.text.w(3);

    /* renamed from: n, reason: collision with root package name */
    public a f1594n = null;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f1595o = C;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1599s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public Animator[] f1600t = B;

    /* renamed from: u, reason: collision with root package name */
    public int f1601u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1602v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1603w = false;

    /* renamed from: x, reason: collision with root package name */
    public n f1604x = null;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f1605y = null;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f1606z = new ArrayList();
    public b2.f A = D;

    public static void b(androidx.emoji2.text.w wVar, View view, u uVar) {
        n.f fVar = (n.f) wVar.f320f;
        n.f fVar2 = (n.f) wVar.f322i;
        SparseArray sparseArray = (SparseArray) wVar.f321g;
        n.h hVar = (n.h) wVar.h;
        fVar.put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = j0.f2160a;
        String d = c0.d(view);
        if (d != null) {
            if (fVar2.containsKey(d)) {
                fVar2.put(d, null);
            } else {
                fVar2.put(d, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.f2568f) {
                    int i3 = hVar.f2570i;
                    long[] jArr = hVar.f2569g;
                    Object[] objArr = hVar.h;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        Object obj = objArr[i5];
                        if (obj != n.i.f2571a) {
                            if (i5 != i4) {
                                jArr[i4] = jArr[i5];
                                objArr[i4] = obj;
                                objArr[i5] = null;
                            }
                            i4++;
                        }
                    }
                    hVar.f2568f = false;
                    hVar.f2570i = i4;
                }
                if (o.a.b(hVar.f2569g, hVar.f2570i, itemIdAtPosition) >= 0) {
                    View view2 = (View) hVar.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        hVar.d(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                hVar.d(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.f, java.lang.Object, n.j] */
    public static n.f p() {
        ThreadLocal threadLocal = E;
        n.f fVar = (n.f) threadLocal.get();
        if (fVar == null) {
            ?? jVar = new n.j(0);
            threadLocal.set(jVar);
            return jVar;
        }
        return fVar;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f1616a.get(str);
        Object obj2 = uVar2.f1616a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j3) {
        this.h = j3;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f1589i = timeInterpolator;
    }

    public void D(b2.f fVar) {
        if (fVar == null) {
            this.A = D;
        } else {
            this.A = fVar;
        }
    }

    public void F(long j3) {
        this.f1588g = j3;
    }

    public final void G() {
        if (this.f1601u == 0) {
            v(this, m.f1583a);
            this.f1603w = false;
        }
        this.f1601u++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.h != -1) {
            sb.append("dur(");
            sb.append(this.h);
            sb.append(") ");
        }
        if (this.f1588g != -1) {
            sb.append("dly(");
            sb.append(this.f1588g);
            sb.append(") ");
        }
        if (this.f1589i != null) {
            sb.append("interp(");
            sb.append(this.f1589i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1590j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1591k;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i3));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(l lVar) {
        if (this.f1605y == null) {
            this.f1605y = new ArrayList();
        }
        this.f1605y.add(lVar);
    }

    public void c() {
        ArrayList arrayList = this.f1599s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1600t);
        this.f1600t = B;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            animator.cancel();
        }
        this.f1600t = animatorArr;
        v(this, m.f1585c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                u uVar = new u(view);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f1618c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f1592l, view, uVar);
                } else {
                    b(this.f1593m, view, uVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    e(viewGroup.getChildAt(i3), z2);
                }
            }
        }
    }

    public abstract void g(u uVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f1590j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1591k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i3)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f1618c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f1592l, findViewById, uVar);
                } else {
                    b(this.f1593m, findViewById, uVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.f1618c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f1592l, view, uVar2);
            } else {
                b(this.f1593m, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((n.f) this.f1592l.f320f).clear();
            ((SparseArray) this.f1592l.f321g).clear();
            ((n.h) this.f1592l.h).a();
        } else {
            ((n.f) this.f1593m.f320f).clear();
            ((SparseArray) this.f1593m.f321g).clear();
            ((n.h) this.f1593m.h).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f1606z = new ArrayList();
            nVar.f1592l = new androidx.emoji2.text.w(3);
            nVar.f1593m = new androidx.emoji2.text.w(3);
            nVar.f1596p = null;
            nVar.f1597q = null;
            nVar.f1604x = this;
            nVar.f1605y = null;
            return nVar;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [f1.k, java.lang.Object] */
    public void l(ViewGroup viewGroup, androidx.emoji2.text.w wVar, androidx.emoji2.text.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int i4;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        n.f p3 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i5 = 0;
        while (i5 < size) {
            u uVar3 = (u) arrayList.get(i5);
            u uVar4 = (u) arrayList2.get(i5);
            if (uVar3 != null && !uVar3.f1618c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f1618c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k3 = k(viewGroup, uVar3, uVar4);
                if (k3 != null) {
                    String str = this.f1587f;
                    if (uVar4 != null) {
                        view = uVar4.f1617b;
                        String[] q3 = q();
                        if (q3 != null && q3.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((n.f) wVar2.f320f).get(view);
                            i3 = size;
                            if (uVar5 != null) {
                                int i6 = 0;
                                while (i6 < q3.length) {
                                    String str2 = q3[i6];
                                    uVar2.f1616a.put(str2, uVar5.f1616a.get(str2));
                                    i6++;
                                    i5 = i5;
                                    uVar5 = uVar5;
                                }
                            }
                            i4 = i5;
                            int i7 = p3.h;
                            int i8 = 0;
                            while (true) {
                                if (i8 < i7) {
                                    k kVar = (k) p3.get((Animator) p3.f(i8));
                                    if (kVar.f1580c != null && kVar.f1578a == view && kVar.f1579b.equals(str) && kVar.f1580c.equals(uVar2)) {
                                        animator = null;
                                        break;
                                    }
                                    i8++;
                                } else {
                                    animator = k3;
                                    break;
                                }
                            }
                        } else {
                            i3 = size;
                            i4 = i5;
                            animator = k3;
                            uVar2 = null;
                        }
                        k3 = animator;
                        uVar = uVar2;
                    } else {
                        i3 = size;
                        i4 = i5;
                        view = uVar3.f1617b;
                        uVar = null;
                    }
                    if (k3 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f1578a = view;
                        obj.f1579b = str;
                        obj.f1580c = uVar;
                        obj.d = windowId;
                        obj.f1581e = this;
                        obj.f1582f = k3;
                        p3.put(k3, obj);
                        this.f1606z.add(k3);
                    }
                    i5 = i4 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i4 = i5;
            i5 = i4 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                k kVar2 = (k) p3.get((Animator) this.f1606z.get(sparseIntArray.keyAt(i9)));
                kVar2.f1582f.setStartDelay(kVar2.f1582f.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i3 = this.f1601u - 1;
        this.f1601u = i3;
        if (i3 == 0) {
            v(this, m.f1584b);
            for (int i4 = 0; i4 < ((n.h) this.f1592l.h).e(); i4++) {
                View view = (View) ((n.h) this.f1592l.h).f(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < ((n.h) this.f1593m.h).e(); i5++) {
                View view2 = (View) ((n.h) this.f1593m.h).f(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1603w = true;
        }
    }

    public final u n(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        a aVar = this.f1594n;
        if (aVar != null) {
            return aVar.n(view, z2);
        }
        if (z2) {
            arrayList = this.f1596p;
        } else {
            arrayList = this.f1597q;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    u uVar = (u) arrayList.get(i3);
                    if (uVar != null) {
                        if (uVar.f1617b == view) {
                            break;
                        }
                        i3++;
                    } else {
                        return null;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                if (z2) {
                    arrayList2 = this.f1597q;
                } else {
                    arrayList2 = this.f1596p;
                }
                return (u) arrayList2.get(i3);
            }
            return null;
        }
        return null;
    }

    public final n o() {
        a aVar = this.f1594n;
        if (aVar != null) {
            return aVar.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        androidx.emoji2.text.w wVar;
        a aVar = this.f1594n;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        if (z2) {
            wVar = this.f1592l;
        } else {
            wVar = this.f1593m;
        }
        return (u) ((n.f) wVar.f320f).get(view);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar != null && uVar2 != null) {
            String[] q3 = q();
            if (q3 != null) {
                for (String str : q3) {
                    if (u(uVar, uVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = uVar.f1616a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(uVar, uVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1590j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1591k;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return H("");
    }

    public final void v(n nVar, m mVar) {
        n nVar2 = this.f1604x;
        if (nVar2 != null) {
            nVar2.v(nVar, mVar);
        }
        ArrayList arrayList = this.f1605y;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f1605y.size();
            l[] lVarArr = this.f1598r;
            if (lVarArr == null) {
                lVarArr = new l[size];
            }
            this.f1598r = null;
            l[] lVarArr2 = (l[]) this.f1605y.toArray(lVarArr);
            for (int i3 = 0; i3 < size; i3++) {
                mVar.a(lVarArr2[i3], nVar);
                lVarArr2[i3] = null;
            }
            this.f1598r = lVarArr2;
        }
    }

    public void w(View view) {
        if (!this.f1603w) {
            ArrayList arrayList = this.f1599s;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1600t);
            this.f1600t = B;
            for (int i3 = size - 1; i3 >= 0; i3--) {
                Animator animator = animatorArr[i3];
                animatorArr[i3] = null;
                animator.pause();
            }
            this.f1600t = animatorArr;
            v(this, m.d);
            this.f1602v = true;
        }
    }

    public n x(l lVar) {
        n nVar;
        ArrayList arrayList = this.f1605y;
        if (arrayList != null) {
            if (!arrayList.remove(lVar) && (nVar = this.f1604x) != null) {
                nVar.x(lVar);
            }
            if (this.f1605y.size() == 0) {
                this.f1605y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f1602v) {
            if (!this.f1603w) {
                ArrayList arrayList = this.f1599s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1600t);
                this.f1600t = B;
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    Animator animator = animatorArr[i3];
                    animatorArr[i3] = null;
                    animator.resume();
                }
                this.f1600t = animatorArr;
                v(this, m.f1586e);
            }
            this.f1602v = false;
        }
    }

    public void z() {
        G();
        n.f p3 = p();
        ArrayList arrayList = this.f1606z;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Animator animator = (Animator) obj;
            if (p3.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new j(this, p3));
                    long j3 = this.h;
                    if (j3 >= 0) {
                        animator.setDuration(j3);
                    }
                    long j4 = this.f1588g;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.f1589i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new e2.l(1, this));
                    animator.start();
                }
            }
        }
        this.f1606z.clear();
        m();
    }

    public void B(a.y yVar) {
    }

    public void f(u uVar) {
    }

    public void E() {
    }
}
