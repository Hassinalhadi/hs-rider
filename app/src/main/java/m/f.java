package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public c f2520f;

    /* renamed from: g, reason: collision with root package name */
    public c f2521g;
    public final WeakHashMap h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f2522i = 0;

    public c a(Object obj) {
        c cVar = this.f2520f;
        while (cVar != null && !cVar.f2515f.equals(obj)) {
            cVar = cVar.h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f2522i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a3);
            }
        }
        c cVar = a3.f2517i;
        c cVar2 = a3.h;
        if (cVar != null) {
            cVar.h = cVar2;
        } else {
            this.f2520f = cVar2;
        }
        c cVar3 = a3.h;
        if (cVar3 != null) {
            cVar3.f2517i = cVar;
        } else {
            this.f2521g = cVar;
        }
        a3.h = null;
        a3.f2517i = null;
        return a3.f2516g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.b) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof m.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.f r6 = (m.f) r6
            int r1 = r5.f2522i
            int r3 = r6.f2522i
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            m.b r1 = (m.b) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            m.b r3 = (m.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            m.b r6 = (m.b) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i3 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i3;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f2520f, this.f2521g, 0);
        this.h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
