package y0;

import a.a0;
import a.b0;
import androidx.emoji2.text.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w2.a f3292a = new w2.a(f.f3304a);

    /* renamed from: b, reason: collision with root package name */
    public final w2.a f3293b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.b f3294c;
    public final k2.b d;

    /* renamed from: e, reason: collision with root package name */
    public final k2.b f3295e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f3296f;

    /* renamed from: g, reason: collision with root package name */
    public int f3297g;
    public d h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f3298i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f3299j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f3300k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3301l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3302m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3303n;

    public e() {
        w2.a aVar = new w2.a(new c());
        this.f3293b = aVar;
        this.f3294c = new w1.b(aVar);
        this.d = new k2.b();
        this.f3295e = new k2.b();
        this.f3298i = new LinkedHashSet();
        this.f3299j = new LinkedHashSet();
        this.f3300k = new LinkedHashSet();
    }

    public final void a(w wVar, d dVar, int i3) {
        LinkedHashSet linkedHashSet;
        boolean z2;
        wVar.getClass();
        if (dVar.f3290a == null) {
            if (i3 != 0) {
                if (i3 != 1) {
                    linkedHashSet = this.f3298i;
                } else {
                    linkedHashSet = this.f3299j;
                }
            } else {
                linkedHashSet = this.f3300k;
            }
            linkedHashSet.add(dVar);
            dVar.f3290a = wVar;
            ((c) ((w2.a) this.f3294c.f3195f).a()).getClass();
            if (i3 != 0) {
                if (i3 != 1) {
                    z2 = this.f3303n;
                } else {
                    z2 = this.f3301l;
                }
            } else {
                z2 = this.f3302m;
            }
            dVar.b(z2);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(dVar);
        w wVar2 = dVar.f3290a;
        sb.append("' is already added to dispatcher ");
        sb.append(wVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        c cVar;
        k2.b bVar = this.d;
        if (bVar == null || !bVar.isEmpty()) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                if (((a0) it.next()).f1b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        k2.b bVar2 = this.f3295e;
        if (bVar2 == null || !bVar2.isEmpty()) {
            Iterator it2 = bVar2.iterator();
            while (it2.hasNext()) {
                if (((a0) it2.next()).f1b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f3302m != z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f3301l != z3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f3303n != z4) {
            z7 = true;
        } else {
            z7 = false;
        }
        LinkedHashSet linkedHashSet = this.f3300k;
        if (z5) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f3299j;
        if (z6) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f3298i;
        if (z7) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z4);
            }
        }
        this.f3302m = z2;
        this.f3301l = z3;
        this.f3303n = z4;
        a0 a0Var = this.f3296f;
        if (a0Var == null) {
            a0Var = c(0);
        }
        a0 a0Var2 = this.f3296f;
        if (a0Var2 == null) {
            a0Var2 = c(0);
        }
        if (p2.d.a(a0Var2, a0Var)) {
            if (a0Var2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = bVar.iterator();
                while (it6.hasNext()) {
                    ((a0) it6.next()).getClass();
                }
                Iterator<E> it7 = bVar2.iterator();
                while (it7.hasNext()) {
                    ((a0) it7.next()).getClass();
                }
                b0 b0Var = a0Var2.f0a;
                l2.c cVar2 = new l2.c(10);
                cVar2.addAll(arrayList);
                cVar2.add(b0Var);
                cVar2.addAll(k2.e.f2487f);
                cVar2.f();
                cVar2.h = true;
                if (cVar2.f2511g <= 0) {
                    cVar2 = l2.c.f2509i;
                }
                cVar = new c(cVar2, arrayList.size());
            }
            w2.a aVar = this.f3293b;
            if (!p2.d.a((c) aVar.a(), cVar)) {
                aVar.b(cVar);
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    ((d) it8.next()).getClass();
                }
                Iterator it9 = linkedHashSet2.iterator();
                while (it9.hasNext()) {
                    ((d) it9.next()).getClass();
                }
                Iterator it10 = linkedHashSet3.iterator();
                while (it10.hasNext()) {
                    ((d) it10.next()).getClass();
                }
            }
        }
    }

    public final a0 c(int i3) {
        Object obj;
        Object obj2;
        k2.b bVar = this.f3295e;
        k2.b bVar2 = this.d;
        Object obj3 = null;
        if (i3 != -1) {
            if (i3 != 0) {
                if (i3 == 1) {
                    Iterator it = bVar2.iterator();
                    while (it.hasNext()) {
                        ((a0) it.next()).getClass();
                    }
                    Iterator it2 = bVar.iterator();
                    while (it2.hasNext()) {
                        ((a0) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i3 + "'.").toString());
            }
            Iterator it3 = bVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((a0) obj2).f1b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            a0 a0Var = (a0) obj2;
            if (a0Var == null) {
                Iterator it4 = bVar.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((a0) next).f1b) {
                        obj3 = next;
                        break;
                    }
                }
                return (a0) obj3;
            }
            return a0Var;
        }
        Iterator it5 = bVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((a0) obj).f1b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a0 a0Var2 = (a0) obj;
        if (a0Var2 == null) {
            Iterator it6 = bVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((a0) next2).f1b) {
                    obj3 = next2;
                    break;
                }
            }
            return (a0) obj3;
        }
        return a0Var2;
    }
}
