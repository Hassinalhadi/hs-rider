package b1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f817a;

    /* renamed from: b, reason: collision with root package name */
    public int f818b;

    /* renamed from: c, reason: collision with root package name */
    public int f819c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f820e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f821f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f822g;

    public k1(int i3) {
        this.f817a = 1;
        this.f818b = i3;
        if (i3 > 0) {
            this.f821f = new androidx.emoji2.text.m(24);
            this.f822g = new b2.f(14);
        } else {
            a.b.m("maxSize <= 0");
            throw null;
        }
    }

    public void a() {
        View view = (View) ((ArrayList) this.f821f).get(r0.size() - 1);
        h1 h1Var = (h1) view.getLayoutParams();
        this.f819c = ((StaggeredGridLayoutManager) this.f822g).f655r.b(view);
        h1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f821f).clear();
        this.f818b = Integer.MIN_VALUE;
        this.f819c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        boolean z2 = ((StaggeredGridLayoutManager) this.f822g).f660w;
        ArrayList arrayList = (ArrayList) this.f821f;
        if (z2) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public int d() {
        boolean z2 = ((StaggeredGridLayoutManager) this.f822g).f660w;
        ArrayList arrayList = (ArrayList) this.f821f;
        if (z2) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public int e(int i3, int i4) {
        int i5;
        boolean z2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f822g;
        int k3 = staggeredGridLayoutManager.f655r.k();
        int g3 = staggeredGridLayoutManager.f655r.g();
        if (i4 > i3) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        while (i3 != i4) {
            View view = (View) ((ArrayList) this.f821f).get(i3);
            int e3 = staggeredGridLayoutManager.f655r.e(view);
            int b3 = staggeredGridLayoutManager.f655r.b(view);
            boolean z3 = false;
            if (e3 <= g3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b3 >= k3) {
                z3 = true;
            }
            if (z2 && z3 && (e3 < k3 || b3 > g3)) {
                return n0.H(view);
            }
            i3 += i5;
        }
        return -1;
    }

    public Object f(Object obj) {
        synchronized (((b2.f) this.f822g)) {
            androidx.emoji2.text.m mVar = (androidx.emoji2.text.m) this.f821f;
            mVar.getClass();
            Object obj2 = ((LinkedHashMap) mVar.f299g).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.f820e++;
            return null;
        }
    }

    public int g(int i3) {
        int i4 = this.f819c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (((ArrayList) this.f821f).size() == 0) {
            return i3;
        }
        a();
        return this.f819c;
    }

    public View h(int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f822g;
        ArrayList arrayList = (ArrayList) this.f821f;
        View view = null;
        if (i4 == -1) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                View view2 = (View) arrayList.get(i5);
                if ((staggeredGridLayoutManager.f660w && n0.H(view2) <= i3) || ((!staggeredGridLayoutManager.f660w && n0.H(view2) >= i3) || !view2.hasFocusable())) {
                    break;
                }
                i5++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f660w && n0.H(view3) >= i3) || ((!staggeredGridLayoutManager.f660w && n0.H(view3) <= i3) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int i(int i3) {
        ArrayList arrayList = (ArrayList) this.f821f;
        int i4 = this.f818b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (arrayList.size() == 0) {
            return i3;
        }
        View view = (View) arrayList.get(0);
        h1 h1Var = (h1) view.getLayoutParams();
        this.f818b = ((StaggeredGridLayoutManager) this.f822g).f655r.e(view);
        h1Var.getClass();
        return this.f818b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f822g
            b2.f r0 = (b2.f) r0
            monitor-enter(r0)
            int r1 = r4.f819c     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + 1
            r4.f819c = r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r4.f821f     // Catch: java.lang.Throwable -> L20
            androidx.emoji2.text.m r1 = (androidx.emoji2.text.m) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.f299g     // Catch: java.lang.Throwable -> L20
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L23
            int r6 = r4.f819c     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r4.f819c = r6     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r4 = move-exception
            goto Lc1
        L23:
            monitor-exit(r0)
            int r6 = r4.f818b
        L26:
            java.lang.Object r0 = r4.f822g
            b2.f r0 = (b2.f) r0
            monitor-enter(r0)
            int r1 = r4.f819c     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb7
            java.lang.Object r1 = r4.f821f     // Catch: java.lang.Throwable -> L42
            androidx.emoji2.text.m r1 = (androidx.emoji2.text.m) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f299g     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r4.f819c     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb7
            goto L45
        L42:
            r4 = move-exception
            goto Lbf
        L45:
            int r1 = r4.f819c     // Catch: java.lang.Throwable -> L42
            if (r1 <= r6) goto Lb5
            java.lang.Object r1 = r4.f821f     // Catch: java.lang.Throwable -> L42
            androidx.emoji2.text.m r1 = (androidx.emoji2.text.m) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f299g     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L58
            goto Lb5
        L58:
            java.lang.Object r1 = r4.f821f     // Catch: java.lang.Throwable -> L42
            androidx.emoji2.text.m r1 = (androidx.emoji2.text.m) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f299g     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L7b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L75
            goto L8a
        L75:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L8a
        L7b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L8a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L90
            monitor-exit(r0)
            return r5
        L90:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r4.f821f     // Catch: java.lang.Throwable -> L42
            androidx.emoji2.text.m r3 = (androidx.emoji2.text.m) r3     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.f299g     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r4.f819c     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r4.f819c = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L26
        Lb5:
            monitor-exit(r0)
            return r5
        Lb7:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        Lbf:
            monitor-exit(r0)
            throw r4
        Lc1:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.k1.j(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        int i3;
        String str;
        switch (this.f817a) {
            case 1:
                synchronized (((b2.f) this.f822g)) {
                    try {
                        int i4 = this.d;
                        int i5 = this.f820e + i4;
                        if (i5 != 0) {
                            i3 = (i4 * 100) / i5;
                        } else {
                            i3 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f818b + ",hits=" + this.d + ",misses=" + this.f820e + ",hitRate=" + i3 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public k1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f817a = 0;
        this.f822g = staggeredGridLayoutManager;
        this.f821f = new ArrayList();
        this.f818b = Integer.MIN_VALUE;
        this.f819c = Integer.MIN_VALUE;
        this.d = 0;
        this.f820e = i3;
    }
}
