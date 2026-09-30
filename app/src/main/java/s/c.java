package s;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.n;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f2855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2856c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2857e;

    /* renamed from: f, reason: collision with root package name */
    public c f2858f;

    /* renamed from: i, reason: collision with root package name */
    public q.f f2860i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f2854a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f2859g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i3) {
        this.d = dVar;
        this.f2857e = i3;
    }

    public final void a(c cVar, int i3) {
        b(cVar, i3, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i3, int i4, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f2858f = cVar;
        if (cVar.f2854a == null) {
            cVar.f2854a = new HashSet();
        }
        HashSet hashSet = this.f2858f.f2854a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f2859g = i3;
        this.h = i4;
        return true;
    }

    public final void c(int i3, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f2854a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).d, i3, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (!this.f2856c) {
            return 0;
        }
        return this.f2855b;
    }

    public final int e() {
        c cVar;
        if (this.d.f2871g0 == 8) {
            return 0;
        }
        int i3 = this.h;
        if (i3 != Integer.MIN_VALUE && (cVar = this.f2858f) != null && cVar.d.f2871g0 == 8) {
            return i3;
        }
        return this.f2859g;
    }

    public final c f() {
        int i3 = this.f2857e;
        int a3 = q.e.a(i3);
        d dVar = this.d;
        switch (a3) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(w0.e(i3));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f2854a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f2858f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(s.c r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L65
        L5:
            s.d r1 = r10.d
            int r10 = r10.f2857e
            r2 = 6
            int r3 = r9.f2857e
            r4 = 1
            if (r10 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r10 = r1.E
            if (r10 == 0) goto L65
            s.d r9 = r9.d
            boolean r9 = r9.E
            if (r9 != 0) goto L63
            goto L65
        L1c:
            int r9 = q.e.a(r3)
            r5 = 4
            r6 = 2
            r7 = 9
            r8 = 8
            switch(r9) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = androidx.fragment.app.w0.e(r3)
            r9.<init>(r10)
            throw r9
        L33:
            if (r10 == r2) goto L65
            if (r10 == r8) goto L65
            if (r10 == r7) goto L65
            goto L63
        L3a:
            if (r10 == r6) goto L65
            if (r10 != r5) goto L63
            goto L65
        L3f:
            r9 = 3
            if (r10 == r9) goto L48
            r9 = 5
            if (r10 != r9) goto L46
            goto L48
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r4
        L49:
            boolean r1 = r1 instanceof s.h
            if (r1 == 0) goto L52
            if (r9 != 0) goto L63
            if (r10 != r7) goto L65
            goto L63
        L52:
            return r9
        L53:
            if (r10 == r6) goto L5a
            if (r10 != r5) goto L58
            goto L5a
        L58:
            r9 = r0
            goto L5b
        L5a:
            r9 = r4
        L5b:
            boolean r1 = r1 instanceof s.h
            if (r1 == 0) goto L64
            if (r9 != 0) goto L63
            if (r10 != r8) goto L65
        L63:
            return r4
        L64:
            return r9
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.i(s.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f2858f;
        if (cVar != null && (hashSet = cVar.f2854a) != null) {
            hashSet.remove(this);
            if (this.f2858f.f2854a.size() == 0) {
                this.f2858f.f2854a = null;
            }
        }
        this.f2854a = null;
        this.f2858f = null;
        this.f2859g = 0;
        this.h = Integer.MIN_VALUE;
        this.f2856c = false;
        this.f2855b = 0;
    }

    public final void k() {
        q.f fVar = this.f2860i;
        if (fVar == null) {
            this.f2860i = new q.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i3) {
        this.f2855b = i3;
        this.f2856c = true;
    }

    public final String toString() {
        return this.d.f2872h0 + ":" + w0.e(this.f2857e);
    }
}
