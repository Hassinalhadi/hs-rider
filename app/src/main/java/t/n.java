package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f2995f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2996a;

    /* renamed from: b, reason: collision with root package name */
    public int f2997b;

    /* renamed from: c, reason: collision with root package name */
    public int f2998c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f2999e;

    public final void a(ArrayList arrayList) {
        int size = this.f2996a.size();
        if (this.f2999e != -1 && size > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                n nVar = (n) arrayList.get(i3);
                if (this.f2999e == nVar.f2997b) {
                    c(this.f2998c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(q.c cVar, int i3) {
        int n2;
        int n3;
        ArrayList arrayList = this.f2996a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((s.d) arrayList.get(i4)).b(cVar, false);
        }
        if (i3 == 0 && eVar.f2908z0 > 0) {
            s.j.a(eVar, cVar, arrayList, 0);
        }
        if (i3 == 1 && eVar.A0 > 0) {
            s.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e3) {
            System.err.println(e3.toString() + "\n" + Arrays.toString(e3.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            s.d dVar = (s.d) arrayList.get(i5);
            b2.f fVar = new b2.f(20);
            new WeakReference(dVar);
            q.c.n(dVar.I);
            q.c.n(dVar.J);
            q.c.n(dVar.K);
            q.c.n(dVar.L);
            q.c.n(dVar.M);
            this.d.add(fVar);
        }
        if (i3 == 0) {
            n2 = q.c.n(eVar.I);
            n3 = q.c.n(eVar.K);
            cVar.t();
        } else {
            n2 = q.c.n(eVar.J);
            n3 = q.c.n(eVar.L);
            cVar.t();
        }
        return n3 - n2;
    }

    public final void c(int i3, n nVar) {
        int i4 = nVar.f2997b;
        ArrayList arrayList = this.f2996a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            s.d dVar = (s.d) obj;
            ArrayList arrayList2 = nVar.f2996a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i3 == 0) {
                dVar.f2884n0 = i4;
            } else {
                dVar.f2886o0 = i4;
            }
        }
        this.f2999e = i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = this.f2998c;
        if (i3 == 0) {
            str = "Horizontal";
        } else if (i3 == 1) {
            str = "Vertical";
        } else if (i3 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f2997b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f2996a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2 = sb2 + " " + ((s.d) obj).f2872h0;
        }
        return sb2.concat(" >");
    }
}
