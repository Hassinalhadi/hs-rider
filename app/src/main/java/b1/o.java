package b1;

import java.util.Comparator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f876a;

    public /* synthetic */ o(int i3) {
        this.f876a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r5 != false) goto L29;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r5 = r5.f876a
            r0 = 0
            r1 = 1
            r2 = -1
            switch(r5) {
                case 0: goto L39;
                case 1: goto L30;
                case 2: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r6 = (android.view.View) r6
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r5 = j0.j0.f2160a
            float r5 = j0.c0.e(r6)
            float r6 = j0.c0.e(r7)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            android.view.View r6 = (android.view.View) r6
            android.view.View r7 = (android.view.View) r7
            int r5 = r6.getTop()
            int r6 = r7.getTop()
        L2e:
            int r5 = r5 - r6
            return r5
        L30:
            q.f r6 = (q.f) r6
            q.f r7 = (q.f) r7
            int r5 = r6.f2738g
            int r6 = r7.f2738g
            goto L2e
        L39:
            b1.q r6 = (b1.q) r6
            b1.q r7 = (b1.q) r7
            androidx.recyclerview.widget.RecyclerView r5 = r6.d
            if (r5 != 0) goto L43
            r3 = r1
            goto L44
        L43:
            r3 = r0
        L44:
            androidx.recyclerview.widget.RecyclerView r4 = r7.d
            if (r4 != 0) goto L4a
            r4 = r1
            goto L4b
        L4a:
            r4 = r0
        L4b:
            if (r3 == r4) goto L50
            if (r5 != 0) goto L58
            goto L5a
        L50:
            boolean r5 = r6.f883a
            boolean r3 = r7.f883a
            if (r5 == r3) goto L5c
            if (r5 == 0) goto L5a
        L58:
            r0 = r2
            goto L6d
        L5a:
            r0 = r1
            goto L6d
        L5c:
            int r5 = r7.f884b
            int r1 = r6.f884b
            int r5 = r5 - r1
            if (r5 == 0) goto L65
        L63:
            r0 = r5
            goto L6d
        L65:
            int r5 = r6.f885c
            int r6 = r7.f885c
            int r5 = r5 - r6
            if (r5 == 0) goto L6d
            goto L63
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.o.compare(java.lang.Object, java.lang.Object):int");
    }
}
