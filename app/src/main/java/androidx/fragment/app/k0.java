package androidx.fragment.app;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$addCallback$lifecycleObserver$1;
import com.logistics.rider.lsposed.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k0 {
    public androidx.emoji2.text.p A;
    public androidx.emoji2.text.p B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public m0 L;
    public final g M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f398b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f400e;

    /* renamed from: g, reason: collision with root package name */
    public a.e0 f402g;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.emoji2.text.p f406l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f407m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f408n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f409o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f410p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f411q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f412r;

    /* renamed from: s, reason: collision with root package name */
    public int f413s;

    /* renamed from: t, reason: collision with root package name */
    public w f414t;

    /* renamed from: u, reason: collision with root package name */
    public a.y f415u;

    /* renamed from: v, reason: collision with root package name */
    public u f416v;

    /* renamed from: w, reason: collision with root package name */
    public u f417w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f418x;

    /* renamed from: y, reason: collision with root package name */
    public final b2.f f419y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.emoji2.text.p f420z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f397a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.w f399c = new androidx.emoji2.text.w(2);

    /* renamed from: f, reason: collision with root package name */
    public final z f401f = new z(this);
    public final c0 h = new c0(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f403i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f404j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f405k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.a0] */
    public k0() {
        Collections.synchronizedMap(new HashMap());
        this.f406l = new androidx.emoji2.text.p(this);
        this.f407m = new CopyOnWriteArrayList();
        final int i3 = 0;
        this.f408n = new i0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f351b;

            {
                this.f351b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        k0 k0Var = this.f351b;
                        if (k0Var.H()) {
                            k0Var.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f351b;
                        if (k0Var2.H() && num.intValue() == 80) {
                            k0Var2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        z.b bVar = (z.b) obj;
                        k0 k0Var3 = this.f351b;
                        if (k0Var3.H()) {
                            boolean z2 = bVar.f3314a;
                            k0Var3.m(false);
                            return;
                        }
                        return;
                    default:
                        z.c cVar = (z.c) obj;
                        k0 k0Var4 = this.f351b;
                        if (k0Var4.H()) {
                            boolean z3 = cVar.f3315a;
                            k0Var4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 1;
        this.f409o = new i0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f351b;

            {
                this.f351b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k0 k0Var = this.f351b;
                        if (k0Var.H()) {
                            k0Var.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f351b;
                        if (k0Var2.H() && num.intValue() == 80) {
                            k0Var2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        z.b bVar = (z.b) obj;
                        k0 k0Var3 = this.f351b;
                        if (k0Var3.H()) {
                            boolean z2 = bVar.f3314a;
                            k0Var3.m(false);
                            return;
                        }
                        return;
                    default:
                        z.c cVar = (z.c) obj;
                        k0 k0Var4 = this.f351b;
                        if (k0Var4.H()) {
                            boolean z3 = cVar.f3315a;
                            k0Var4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 2;
        this.f410p = new i0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f351b;

            {
                this.f351b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k0 k0Var = this.f351b;
                        if (k0Var.H()) {
                            k0Var.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f351b;
                        if (k0Var2.H() && num.intValue() == 80) {
                            k0Var2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        z.b bVar = (z.b) obj;
                        k0 k0Var3 = this.f351b;
                        if (k0Var3.H()) {
                            boolean z2 = bVar.f3314a;
                            k0Var3.m(false);
                            return;
                        }
                        return;
                    default:
                        z.c cVar = (z.c) obj;
                        k0 k0Var4 = this.f351b;
                        if (k0Var4.H()) {
                            boolean z3 = cVar.f3315a;
                            k0Var4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i6 = 3;
        this.f411q = new i0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f351b;

            {
                this.f351b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k0 k0Var = this.f351b;
                        if (k0Var.H()) {
                            k0Var.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f351b;
                        if (k0Var2.H() && num.intValue() == 80) {
                            k0Var2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        z.b bVar = (z.b) obj;
                        k0 k0Var3 = this.f351b;
                        if (k0Var3.H()) {
                            boolean z2 = bVar.f3314a;
                            k0Var3.m(false);
                            return;
                        }
                        return;
                    default:
                        z.c cVar = (z.c) obj;
                        k0 k0Var4 = this.f351b;
                        if (k0Var4.H()) {
                            boolean z3 = cVar.f3315a;
                            k0Var4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f412r = new d0(this);
        this.f413s = -1;
        this.f418x = new e0(this);
        this.f419y = new b2.f(i6);
        this.C = new ArrayDeque();
        this.M = new g(2, this);
    }

    public static boolean F(int i3) {
        if (Log.isLoggable("FragmentManager", i3)) {
            return true;
        }
        return false;
    }

    public static boolean G(u uVar) {
        uVar.getClass();
        ArrayList j3 = uVar.f509y.f399c.j();
        int size = j3.size();
        boolean z2 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = j3.get(i3);
            i3++;
            u uVar2 = (u) obj;
            if (uVar2 != null) {
                z2 = G(uVar2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(u uVar) {
        if (uVar != null) {
            if (uVar.G) {
                if (uVar.f507w == null || I(uVar.f510z)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean J(u uVar) {
        if (uVar != null) {
            k0 k0Var = uVar.f507w;
            if (uVar.equals(k0Var.f417w) && J(k0Var.f416v)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void Y(u uVar) {
        if (F(2)) {
            Log.v("FragmentManager", "show: " + uVar);
        }
        if (uVar.D) {
            uVar.D = false;
            uVar.N = !uVar.N;
        }
    }

    public final u A(int i3) {
        androidx.emoji2.text.w wVar = this.f399c;
        ArrayList arrayList = (ArrayList) wVar.f320f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && uVar.A == i3) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) wVar.f321g).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.f467c;
                if (uVar2.A == i3) {
                    return uVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(u uVar) {
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (uVar.B > 0 && this.f415u.S()) {
            View R = this.f415u.R(uVar.B);
            if (R instanceof ViewGroup) {
                return (ViewGroup) R;
            }
            return null;
        }
        return null;
    }

    public final e0 C() {
        u uVar = this.f416v;
        if (uVar != null) {
            return uVar.f507w.C();
        }
        return this.f418x;
    }

    public final b2.f D() {
        u uVar = this.f416v;
        if (uVar != null) {
            return uVar.f507w.D();
        }
        return this.f419y;
    }

    public final void E(u uVar) {
        if (F(2)) {
            Log.v("FragmentManager", "hide: " + uVar);
        }
        if (!uVar.D) {
            uVar.D = true;
            uVar.N = true ^ uVar.N;
            X(uVar);
        }
    }

    public final boolean H() {
        u uVar = this.f416v;
        if (uVar != null) {
            if (uVar.f508x != null && uVar.f500p && uVar.j().H()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void K(int i3, boolean z2) {
        w wVar;
        if (this.f414t == null && i3 != -1) {
            a.b.i("No activity");
            return;
        }
        if (z2 || i3 != this.f413s) {
            this.f413s = i3;
            androidx.emoji2.text.w wVar2 = this.f399c;
            HashMap hashMap = (HashMap) wVar2.f321g;
            ArrayList arrayList = (ArrayList) wVar2.f320f;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                q0 q0Var = (q0) hashMap.get(((u) obj).f494j);
                if (q0Var != null) {
                    q0Var.k();
                }
            }
            for (q0 q0Var2 : hashMap.values()) {
                if (q0Var2 != null) {
                    q0Var2.k();
                    u uVar = q0Var2.f467c;
                    if (uVar.f501q && !uVar.n()) {
                        wVar2.m(q0Var2);
                    }
                }
            }
            Z();
            if (this.D && (wVar = this.f414t) != null && this.f413s == 7) {
                wVar.f524j.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.f414t != null) {
            this.E = false;
            this.F = false;
            this.L.h = false;
            for (u uVar : this.f399c.k()) {
                if (uVar != null) {
                    uVar.f509y.L();
                }
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i3, int i4) {
        y(false);
        x(true);
        u uVar = this.f417w;
        if (uVar != null && i3 < 0 && uVar.g().M()) {
            return true;
        }
        boolean O = O(this.I, this.J, i3, i4);
        if (O) {
            this.f398b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        u();
        ((HashMap) this.f399c.f321g).values().removeAll(Collections.singleton(null));
        return O;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z2;
        if ((i4 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList3 = this.d;
        int i5 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i3 < 0) {
                i5 = z2 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i3 >= 0 && i3 == aVar.f349r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i5 = size;
                } else if (z2) {
                    i5 = size;
                    while (i5 > 0) {
                        a aVar2 = (a) this.d.get(i5 - 1);
                        if (i3 < 0 || i3 != aVar2.f349r) {
                            break;
                        }
                        i5--;
                    }
                } else if (size != this.d.size() - 1) {
                    i5 = size + 1;
                }
            }
        }
        if (i5 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i5; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(u uVar) {
        if (F(2)) {
            Log.v("FragmentManager", "remove: " + uVar + " nesting=" + uVar.f506v);
        }
        boolean n2 = uVar.n();
        if (uVar.E && n2) {
            return;
        }
        androidx.emoji2.text.w wVar = this.f399c;
        synchronized (((ArrayList) wVar.f320f)) {
            ((ArrayList) wVar.f320f).remove(uVar);
        }
        uVar.f500p = false;
        if (G(uVar)) {
            this.D = true;
        }
        uVar.f501q = true;
        X(uVar);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i3 < size) {
                    if (!((a) arrayList.get(i3)).f346o) {
                        if (i4 != i3) {
                            z(arrayList, arrayList2, i4, i3);
                        }
                        i4 = i3 + 1;
                        if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                            while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((a) arrayList.get(i4)).f346o) {
                                i4++;
                            }
                        }
                        z(arrayList, arrayList2, i3, i4);
                        i3 = i4 - 1;
                    }
                    i3++;
                }
                if (i4 != size) {
                    z(arrayList, arrayList2, i4, size);
                    return;
                }
                return;
            }
            a.b.i("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.fragment.app.r0, java.lang.Object] */
    public final void R(Parcelable parcelable) {
        androidx.emoji2.text.p pVar;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f414t.f522g.getClassLoader());
                this.f405k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f414t.f522g.getClassLoader());
                arrayList.add((o0) bundle.getParcelable("state"));
            }
        }
        androidx.emoji2.text.w wVar = this.f399c;
        HashMap hashMap = (HashMap) wVar.h;
        HashMap hashMap2 = (HashMap) wVar.f321g;
        hashMap.clear();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            o0 o0Var = (o0) obj;
            hashMap.put(o0Var.f442g, o0Var);
        }
        l0 l0Var = (l0) bundle3.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = l0Var.f425f;
        int size2 = arrayList2.size();
        int i6 = 0;
        while (true) {
            pVar = this.f406l;
            i3 = 2;
            if (i6 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i6);
            i6++;
            o0 o0Var2 = (o0) ((HashMap) wVar.h).remove((String) obj2);
            if (o0Var2 != null) {
                u uVar = (u) this.L.f434c.get(o0Var2.f442g);
                if (uVar != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + uVar);
                    }
                    q0Var = new q0(pVar, wVar, uVar, o0Var2);
                } else {
                    q0Var = new q0(this.f406l, this.f399c, this.f414t.f522g.getClassLoader(), C(), o0Var2);
                }
                u uVar2 = q0Var.f467c;
                uVar2.f507w = this;
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + uVar2.f494j + "): " + uVar2);
                }
                q0Var.m(this.f414t.f522g.getClassLoader());
                wVar.l(q0Var);
                q0Var.f468e = this.f413s;
            }
        }
        m0 m0Var = this.L;
        m0Var.getClass();
        ArrayList arrayList3 = new ArrayList(m0Var.f434c.values());
        int size3 = arrayList3.size();
        int i7 = 0;
        while (true) {
            z2 = true;
            if (i7 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i7);
            i7++;
            u uVar3 = (u) obj3;
            if (hashMap2.get(uVar3.f494j) == null) {
                if (F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + uVar3 + " that was not found in the set of active Fragments " + l0Var.f425f);
                }
                this.L.e(uVar3);
                uVar3.f507w = this;
                q0 q0Var2 = new q0(pVar, wVar, uVar3);
                q0Var2.f468e = 1;
                q0Var2.k();
                uVar3.f501q = true;
                q0Var2.k();
            }
        }
        ArrayList arrayList4 = l0Var.f426g;
        ((ArrayList) wVar.f320f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj4;
                u f3 = wVar.f(str3);
                if (f3 != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + f3);
                    }
                    wVar.a(f3);
                } else {
                    a.b.k("No instantiated fragment for (", str3, ")");
                    return;
                }
            }
        }
        if (l0Var.h != null) {
            this.d = new ArrayList(l0Var.h.length);
            int i9 = 0;
            while (true) {
                c[] cVarArr = l0Var.h;
                if (i9 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i9];
                ArrayList arrayList5 = cVar.f356g;
                a aVar = new a(this);
                int[] iArr = cVar.f355f;
                int i10 = 0;
                int i11 = 0;
                while (i10 < iArr.length) {
                    ?? obj5 = new Object();
                    int i12 = i10 + 1;
                    int i13 = i3;
                    obj5.f470a = iArr[i10];
                    if (F(i13)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    obj5.h = androidx.lifecycle.m.values()[cVar.h[i11]];
                    obj5.f476i = androidx.lifecycle.m.values()[cVar.f357i[i11]];
                    int i14 = i10 + 2;
                    if (iArr[i12] != 0) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    obj5.f472c = z3;
                    int i15 = iArr[i14];
                    obj5.d = i15;
                    int i16 = iArr[i10 + 3];
                    obj5.f473e = i16;
                    int i17 = i10 + 5;
                    int i18 = iArr[i10 + 4];
                    obj5.f474f = i18;
                    i10 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    obj5.f475g = i19;
                    aVar.f335b = i15;
                    aVar.f336c = i16;
                    aVar.d = i18;
                    aVar.f337e = i19;
                    aVar.b(obj5);
                    i11++;
                    i3 = i13;
                    iArr = iArr2;
                    z2 = true;
                }
                int i20 = i3;
                aVar.f338f = cVar.f358j;
                aVar.h = cVar.f359k;
                aVar.f339g = true;
                aVar.f340i = cVar.f361m;
                aVar.f341j = cVar.f362n;
                aVar.f342k = cVar.f363o;
                aVar.f343l = cVar.f364p;
                aVar.f344m = cVar.f365q;
                aVar.f345n = cVar.f366r;
                aVar.f346o = cVar.f367s;
                aVar.f349r = cVar.f360l;
                for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                    String str4 = (String) arrayList5.get(i21);
                    if (str4 != null) {
                        ((r0) aVar.f334a.get(i21)).f471b = wVar.f(str4);
                    }
                }
                aVar.c(1);
                if (F(i20)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i9 + " (index " + aVar.f349r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new t0());
                    aVar.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i9++;
                i3 = i20;
                z2 = true;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.d = null;
        }
        this.f403i.set(l0Var.f427i);
        String str5 = l0Var.f428j;
        if (str5 != null) {
            u f4 = wVar.f(str5);
            this.f417w = f4;
            q(f4);
        }
        ArrayList arrayList6 = l0Var.f429k;
        if (arrayList6 != null) {
            while (i4 < arrayList6.size()) {
                this.f404j.put((String) arrayList6.get(i4), (d) l0Var.f430l.get(i4));
                i4++;
            }
        }
        this.C = new ArrayDeque(l0Var.f431m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.os.Parcelable, androidx.fragment.app.l0, java.lang.Object] */
    public final Bundle S() {
        int i3;
        ArrayList arrayList;
        c[] cVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            if (lVar.f424e) {
                if (F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f424e = false;
                lVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.h = true;
        androidx.emoji2.text.w wVar = this.f399c;
        wVar.getClass();
        HashMap hashMap = (HashMap) wVar.f321g;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it3.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it3.next();
            if (q0Var != null) {
                u uVar = q0Var.f467c;
                o0 o0Var = new o0(uVar);
                if (uVar.f491f > -1 && o0Var.f452r == null) {
                    Bundle bundle3 = new Bundle();
                    uVar.w(bundle3);
                    uVar.U.c(bundle3);
                    bundle3.putParcelable("android:support:fragments", uVar.f509y.S());
                    q0Var.f465a.o(false);
                    if (!bundle3.isEmpty()) {
                        bundle2 = bundle3;
                    }
                    if (uVar.J != null) {
                        q0Var.o();
                    }
                    if (uVar.h != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", uVar.h);
                    }
                    if (uVar.f493i != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", uVar.f493i);
                    }
                    if (!uVar.L) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", uVar.L);
                    }
                    o0Var.f452r = bundle2;
                    if (uVar.f497m != null) {
                        if (bundle2 == null) {
                            o0Var.f452r = new Bundle();
                        }
                        o0Var.f452r.putString("android:target_state", uVar.f497m);
                        int i4 = uVar.f498n;
                        if (i4 != 0) {
                            o0Var.f452r.putInt("android:target_req_state", i4);
                        }
                    }
                } else {
                    o0Var.f452r = uVar.f492g;
                }
                arrayList2.add(uVar.f494j);
                if (F(2)) {
                    Log.v("FragmentManager", "Saved state of " + uVar + ": " + uVar.f492g);
                }
            }
        }
        androidx.emoji2.text.w wVar2 = this.f399c;
        wVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) wVar2.h).values());
        if (arrayList3.isEmpty()) {
            if (F(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            androidx.emoji2.text.w wVar3 = this.f399c;
            synchronized (((ArrayList) wVar3.f320f)) {
                try {
                    if (((ArrayList) wVar3.f320f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) wVar3.f320f).size());
                        ArrayList arrayList4 = (ArrayList) wVar3.f320f;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayList4.get(i5);
                            i5++;
                            u uVar2 = (u) obj;
                            arrayList.add(uVar2.f494j);
                            if (F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + uVar2.f494j + "): " + uVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 != null && (size = arrayList5.size()) > 0) {
                cVarArr = new c[size];
                for (int i6 = 0; i6 < size; i6++) {
                    cVarArr[i6] = new c((a) this.d.get(i6));
                    if (F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.d.get(i6));
                    }
                }
            } else {
                cVarArr = null;
            }
            ?? obj2 = new Object();
            obj2.f428j = null;
            ArrayList arrayList6 = new ArrayList();
            obj2.f429k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            obj2.f430l = arrayList7;
            obj2.f425f = arrayList2;
            obj2.f426g = arrayList;
            obj2.h = cVarArr;
            obj2.f427i = this.f403i.get();
            u uVar3 = this.f417w;
            if (uVar3 != null) {
                obj2.f428j = uVar3.f494j;
            }
            arrayList6.addAll(this.f404j.keySet());
            arrayList7.addAll(this.f404j.values());
            obj2.f431m = new ArrayList(this.C);
            bundle.putParcelable("state", obj2);
            for (String str : this.f405k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f405k.get(str));
            }
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                o0 o0Var2 = (o0) obj3;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", o0Var2);
                bundle.putBundle("fragment_" + o0Var2.f442g, bundle4);
            }
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.f397a) {
            try {
                if (this.f397a.size() == 1) {
                    this.f414t.h.removeCallbacks(this.M);
                    this.f414t.h.post(this.M);
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(u uVar, boolean z2) {
        ViewGroup B = B(uVar);
        if (B != null && (B instanceof FragmentContainerView)) {
            ((FragmentContainerView) B).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void V(u uVar, androidx.lifecycle.m mVar) {
        if (uVar.equals(this.f399c.f(uVar.f494j)) && (uVar.f508x == null || uVar.f507w == this)) {
            uVar.Q = mVar;
        } else {
            a.b.l("Fragment ", uVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void W(u uVar) {
        if (uVar != null) {
            if (!uVar.equals(this.f399c.f(uVar.f494j)) || (uVar.f508x != null && uVar.f507w != this)) {
                a.b.l("Fragment ", uVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        u uVar2 = this.f417w;
        this.f417w = uVar;
        q(uVar2);
        q(this.f417w);
    }

    public final void X(u uVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        ViewGroup B = B(uVar);
        if (B != null) {
            s sVar = uVar.M;
            boolean z2 = false;
            if (sVar == null) {
                i3 = 0;
            } else {
                i3 = sVar.f478b;
            }
            if (sVar == null) {
                i4 = 0;
            } else {
                i4 = sVar.f479c;
            }
            int i7 = i4 + i3;
            if (sVar == null) {
                i5 = 0;
            } else {
                i5 = sVar.d;
            }
            int i8 = i5 + i7;
            if (sVar == null) {
                i6 = 0;
            } else {
                i6 = sVar.f480e;
            }
            if (i6 + i8 > 0) {
                if (B.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B.setTag(R.id.visible_removing_fragment_view_tag, uVar);
                }
                u uVar2 = (u) B.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = uVar.M;
                if (sVar2 != null) {
                    z2 = sVar2.f477a;
                }
                if (uVar2.M != null) {
                    uVar2.d().f477a = z2;
                }
            }
        }
    }

    public final void Z() {
        ArrayList i3 = this.f399c.i();
        int size = i3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = i3.get(i4);
            i4++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f467c;
            if (uVar.K) {
                if (this.f398b) {
                    this.H = true;
                } else {
                    uVar.K = false;
                    q0Var.k();
                }
            }
        }
    }

    public final q0 a(u uVar) {
        String str = uVar.P;
        if (str != null) {
            u0.c.c(uVar, str);
        }
        if (F(2)) {
            Log.v("FragmentManager", "add: " + uVar);
        }
        q0 f3 = f(uVar);
        uVar.f507w = this;
        androidx.emoji2.text.w wVar = this.f399c;
        wVar.l(f3);
        if (!uVar.E) {
            wVar.a(uVar);
            uVar.f501q = false;
            if (uVar.J == null) {
                uVar.N = false;
            }
            if (G(uVar)) {
                this.D = true;
            }
        }
        return f3;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t0());
        w wVar = this.f414t;
        if (wVar != null) {
            try {
                wVar.f524j.dump("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(w wVar, a.y yVar, u uVar) {
        String str;
        w wVar2;
        if (this.f414t == null) {
            this.f414t = wVar;
            this.f415u = yVar;
            this.f416v = uVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f407m;
            if (uVar != 0) {
                copyOnWriteArrayList.add(new f0(uVar));
            } else if (wVar != null) {
                copyOnWriteArrayList.add(wVar);
            }
            if (this.f416v != null) {
                b0();
            }
            boolean z2 = false;
            if (wVar != null) {
                a.e0 g3 = wVar.f524j.g();
                this.f402g = g3;
                if (uVar != 0) {
                    wVar2 = uVar;
                } else {
                    wVar2 = wVar;
                }
                g3.getClass();
                c0 c0Var = this.h;
                c0Var.getClass();
                androidx.lifecycle.t f3 = wVar2.f();
                if (f3.f581c != androidx.lifecycle.m.f568f) {
                    a.a0 a0Var = new a.a0(c0Var, new a.b0(c0Var, wVar2));
                    c0Var.f368a.add(a0Var);
                    a0Var.b(false);
                    androidx.emoji2.text.w wVar3 = ((a.d0) g3.f16b.a()).f12c;
                    wVar3.getClass();
                    if (((LinkedHashSet) wVar3.h).add(a0Var)) {
                        y0.e eVar = (y0.e) wVar3.f321g;
                        eVar.getClass();
                        if (a0Var.f2c == null) {
                            eVar.f3295e.addFirst(a0Var);
                            a0Var.f2c = wVar3;
                            eVar.b();
                        } else {
                            throw new IllegalArgumentException(("Handler '" + a0Var + "' is already registered with a dispatcher").toString());
                        }
                    }
                    OnBackPressedDispatcher$addCallback$lifecycleObserver$1 onBackPressedDispatcher$addCallback$lifecycleObserver$1 = new OnBackPressedDispatcher$addCallback$lifecycleObserver$1(a0Var, g3, f3);
                    f3.a(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
                    c0Var.f370c.add(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
                }
            }
            if (uVar != 0) {
                m0 m0Var = uVar.f507w.L;
                HashMap hashMap = m0Var.d;
                m0 m0Var2 = (m0) hashMap.get(uVar.f494j);
                if (m0Var2 == null) {
                    m0Var2 = new m0(m0Var.f436f);
                    hashMap.put(uVar.f494j, m0Var2);
                }
                this.L = m0Var2;
            } else if (wVar != null) {
                androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(wVar.f524j.e(), m0.f433i, w0.a.f3193b);
                String canonicalName = m0.class.getCanonicalName();
                if (canonicalName != null) {
                    this.L = (m0) sVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), m0.class);
                } else {
                    a.b.m("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.L = new m0(false);
            }
            m0 m0Var3 = this.L;
            if (this.E || this.F) {
                z2 = true;
            }
            m0Var3.h = z2;
            this.f399c.f322i = m0Var3;
            w wVar4 = this.f414t;
            if (wVar4 != null && uVar == 0) {
                c1.d b3 = wVar4.b();
                b3.e("android:support:fragments", new a.h(2, this));
                Bundle c3 = b3.c("android:support:fragments");
                if (c3 != null) {
                    R(c3);
                }
            }
            w wVar5 = this.f414t;
            if (wVar5 != null) {
                a.m mVar = wVar5.f524j.f46m;
                if (uVar != 0) {
                    str = uVar.f494j + ":";
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.f420z = mVar.b(concat.concat("StartActivityForResult"), new g0(2), new b0(this, 1));
                this.A = mVar.b(concat.concat("StartIntentSenderForResult"), new g0(0), new b0(this, 2));
                this.B = mVar.b(concat.concat("RequestPermissions"), new g0(1), new b0(this, 0));
            }
            w wVar6 = this.f414t;
            if (wVar6 != null) {
                g.i iVar = wVar6.f524j;
                iVar.getClass();
                a0 a0Var2 = this.f408n;
                a0Var2.getClass();
                iVar.f47n.add(a0Var2);
            }
            w wVar7 = this.f414t;
            if (wVar7 != null) {
                g.i iVar2 = wVar7.f524j;
                iVar2.getClass();
                a0 a0Var3 = this.f409o;
                a0Var3.getClass();
                iVar2.f48o.add(a0Var3);
            }
            w wVar8 = this.f414t;
            if (wVar8 != null) {
                g.i iVar3 = wVar8.f524j;
                iVar3.getClass();
                a0 a0Var4 = this.f410p;
                a0Var4.getClass();
                iVar3.f50q.add(a0Var4);
            }
            w wVar9 = this.f414t;
            if (wVar9 != null) {
                g.i iVar4 = wVar9.f524j;
                iVar4.getClass();
                a0 a0Var5 = this.f411q;
                a0Var5.getClass();
                iVar4.f51r.add(a0Var5);
            }
            w wVar10 = this.f414t;
            if (wVar10 != null && uVar == 0) {
                g.i iVar5 = wVar10.f524j;
                iVar5.getClass();
                d0 d0Var = this.f412r;
                d0Var.getClass();
                androidx.emoji2.text.s sVar2 = iVar5.h;
                ((CopyOnWriteArrayList) sVar2.f310c).add(d0Var);
                ((Runnable) sVar2.f309b).run();
                return;
            }
            return;
        }
        a.b.i("Already attached");
    }

    public final void b0() {
        int i3;
        synchronized (this.f397a) {
            try {
                boolean z2 = true;
                if (!this.f397a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                c0 c0Var = this.h;
                ArrayList arrayList = this.d;
                if (arrayList != null) {
                    i3 = arrayList.size();
                } else {
                    i3 = 0;
                }
                if (i3 <= 0 || !J(this.f416v)) {
                    z2 = false;
                }
                c0Var.a(z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(u uVar) {
        if (F(2)) {
            Log.v("FragmentManager", "attach: " + uVar);
        }
        if (uVar.E) {
            uVar.E = false;
            if (!uVar.f500p) {
                this.f399c.a(uVar);
                if (F(2)) {
                    Log.v("FragmentManager", "add from attach: " + uVar);
                }
                if (G(uVar)) {
                    this.D = true;
                }
            }
        }
    }

    public final void d() {
        this.f398b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList i3 = this.f399c.i();
        int size = i3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = i3.get(i4);
            i4++;
            ViewGroup viewGroup = ((q0) obj).f467c.I;
            if (viewGroup != null) {
                hashSet.add(l.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final q0 f(u uVar) {
        String str = uVar.f494j;
        androidx.emoji2.text.w wVar = this.f399c;
        q0 q0Var = (q0) ((HashMap) wVar.f321g).get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f406l, wVar, uVar);
        q0Var2.m(this.f414t.f522g.getClassLoader());
        q0Var2.f468e = this.f413s;
        return q0Var2;
    }

    public final void g(u uVar) {
        if (F(2)) {
            Log.v("FragmentManager", "detach: " + uVar);
        }
        if (!uVar.E) {
            uVar.E = true;
            if (uVar.f500p) {
                if (F(2)) {
                    Log.v("FragmentManager", "remove from detach: " + uVar);
                }
                androidx.emoji2.text.w wVar = this.f399c;
                synchronized (((ArrayList) wVar.f320f)) {
                    ((ArrayList) wVar.f320f).remove(uVar);
                }
                uVar.f500p = false;
                if (G(uVar)) {
                    this.D = true;
                }
                X(uVar);
            }
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f414t != null) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (u uVar : this.f399c.k()) {
            if (uVar != null) {
                uVar.H = true;
                if (z2) {
                    uVar.f509y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        boolean z2;
        if (this.f413s >= 1) {
            for (u uVar : this.f399c.k()) {
                if (uVar != null) {
                    if (!uVar.D) {
                        z2 = uVar.f509y.i();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z2;
        if (this.f413s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (u uVar : this.f399c.k()) {
            if (uVar != null && I(uVar)) {
                if (!uVar.D) {
                    z2 = uVar.f509y.j();
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uVar);
                    z3 = true;
                }
            }
        }
        if (this.f400e != null) {
            for (int i3 = 0; i3 < this.f400e.size(); i3++) {
                u uVar2 = (u) this.f400e.get(i3);
                if (arrayList == null || !arrayList.contains(uVar2)) {
                    uVar2.getClass();
                }
            }
        }
        this.f400e = arrayList;
        return z3;
    }

    public final void k() {
        boolean z2;
        boolean isTerminated;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        w wVar = this.f414t;
        androidx.emoji2.text.w wVar2 = this.f399c;
        if (wVar != null) {
            z2 = ((m0) wVar2.f322i).f437g;
        } else {
            g.i iVar = wVar.f522g;
            if (iVar != null) {
                z2 = !iVar.isChangingConfigurations();
            } else {
                z2 = true;
            }
        }
        int i3 = 0;
        if (z2) {
            Iterator it2 = this.f404j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((d) it2.next()).f371f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str = (String) obj;
                    m0 m0Var = (m0) wVar2.f322i;
                    m0Var.getClass();
                    if (F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m0Var.d(str);
                }
            }
        }
        t(-1);
        w wVar3 = this.f414t;
        if (wVar3 != null) {
            g.i iVar2 = wVar3.f524j;
            iVar2.getClass();
            a0 a0Var = this.f409o;
            a0Var.getClass();
            iVar2.f48o.remove(a0Var);
        }
        w wVar4 = this.f414t;
        if (wVar4 != null) {
            g.i iVar3 = wVar4.f524j;
            iVar3.getClass();
            a0 a0Var2 = this.f408n;
            a0Var2.getClass();
            iVar3.f47n.remove(a0Var2);
        }
        w wVar5 = this.f414t;
        if (wVar5 != null) {
            g.i iVar4 = wVar5.f524j;
            iVar4.getClass();
            a0 a0Var3 = this.f410p;
            a0Var3.getClass();
            iVar4.f50q.remove(a0Var3);
        }
        w wVar6 = this.f414t;
        if (wVar6 != null) {
            g.i iVar5 = wVar6.f524j;
            iVar5.getClass();
            a0 a0Var4 = this.f411q;
            a0Var4.getClass();
            iVar5.f51r.remove(a0Var4);
        }
        w wVar7 = this.f414t;
        if (wVar7 != null) {
            g.i iVar6 = wVar7.f524j;
            iVar6.getClass();
            d0 d0Var = this.f412r;
            d0Var.getClass();
            androidx.emoji2.text.s sVar = iVar6.h;
            ((CopyOnWriteArrayList) sVar.f310c).remove(d0Var);
            if (((HashMap) sVar.d).remove(d0Var) == null) {
                ((Runnable) sVar.f309b).run();
            } else {
                a.b.c();
            }
        }
        this.f414t = null;
        this.f415u = null;
        this.f416v = null;
        if (this.f402g != null) {
            c0 c0Var = this.h;
            ArrayList arrayList2 = c0Var.f368a;
            CopyOnWriteArrayList copyOnWriteArrayList = c0Var.f370c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z3 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z3) {
                                    executorService.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else {
                    throw new IllegalArgumentException();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((a.a0) obj2).a();
            }
            arrayList2.clear();
            this.f402g = null;
        }
        androidx.emoji2.text.p pVar = this.f420z;
        if (pVar != null) {
            pVar.H();
            this.A.H();
            this.B.H();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f414t != null) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (u uVar : this.f399c.k()) {
            if (uVar != null) {
                uVar.H = true;
                if (z2) {
                    uVar.f509y.l(true);
                }
            }
        }
    }

    public final void m(boolean z2) {
        if (z2 && this.f414t != null) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f399c.k()) {
            if (uVar != null && z2) {
                uVar.f509y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList j3 = this.f399c.j();
        int size = j3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = j3.get(i3);
            i3++;
            u uVar = (u) obj;
            if (uVar != null) {
                uVar.m();
                uVar.f509y.n();
            }
        }
    }

    public final boolean o() {
        boolean z2;
        if (this.f413s >= 1) {
            for (u uVar : this.f399c.k()) {
                if (uVar != null) {
                    if (!uVar.D) {
                        z2 = uVar.f509y.o();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f413s >= 1) {
            for (u uVar : this.f399c.k()) {
                if (uVar != null && !uVar.D) {
                    uVar.f509y.p();
                }
            }
        }
    }

    public final void q(u uVar) {
        if (uVar != null) {
            if (uVar.equals(this.f399c.f(uVar.f494j))) {
                uVar.f507w.getClass();
                boolean J = J(uVar);
                Boolean bool = uVar.f499o;
                if (bool == null || bool.booleanValue() != J) {
                    uVar.f499o = Boolean.valueOf(J);
                    k0 k0Var = uVar.f509y;
                    k0Var.b0();
                    k0Var.q(k0Var.f417w);
                }
            }
        }
    }

    public final void r(boolean z2) {
        if (z2 && this.f414t != null) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f399c.k()) {
            if (uVar != null && z2) {
                uVar.f509y.r(true);
            }
        }
    }

    public final boolean s() {
        boolean z2;
        if (this.f413s < 1) {
            return false;
        }
        boolean z3 = false;
        for (u uVar : this.f399c.k()) {
            if (uVar != null && I(uVar)) {
                if (!uVar.D) {
                    z2 = uVar.f509y.s();
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void t(int i3) {
        try {
            this.f398b = true;
            for (q0 q0Var : ((HashMap) this.f399c.f321g).values()) {
                if (q0Var != null) {
                    q0Var.f468e = i3;
                }
            }
            K(i3, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).e();
            }
            this.f398b = false;
            y(true);
        } catch (Throwable th) {
            this.f398b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u uVar = this.f416v;
        if (uVar != null) {
            sb.append(uVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f416v)));
            sb.append("}");
        } else {
            w wVar = this.f414t;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f414t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            Z();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        androidx.emoji2.text.w wVar = this.f399c;
        ArrayList arrayList = (ArrayList) wVar.f320f;
        String str4 = str + "    ";
        HashMap hashMap = (HashMap) wVar.f321g;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : hashMap.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    u uVar = q0Var.f467c;
                    printWriter.println(uVar);
                    uVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(uVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(uVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(uVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(uVar.f491f);
                    printWriter.print(" mWho=");
                    printWriter.print(uVar.f494j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(uVar.f506v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(uVar.f500p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(uVar.f501q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(uVar.f502r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(uVar.f503s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(uVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(uVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(uVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(uVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(uVar.L);
                    if (uVar.f507w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(uVar.f507w);
                    }
                    if (uVar.f508x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(uVar.f508x);
                    }
                    if (uVar.f510z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(uVar.f510z);
                    }
                    if (uVar.f495k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(uVar.f495k);
                    }
                    if (uVar.f492g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(uVar.f492g);
                    }
                    if (uVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(uVar.h);
                    }
                    if (uVar.f493i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(uVar.f493i);
                    }
                    Object obj = uVar.f496l;
                    if (obj == null) {
                        k0 k0Var = uVar.f507w;
                        obj = (k0Var == null || (str2 = uVar.f497m) == null) ? null : k0Var.f399c.f(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(uVar.f498n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    s sVar = uVar.M;
                    printWriter.println(sVar == null ? false : sVar.f477a);
                    s sVar2 = uVar.M;
                    if ((sVar2 == null ? 0 : sVar2.f478b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        s sVar3 = uVar.M;
                        printWriter.println(sVar3 == null ? 0 : sVar3.f478b);
                    }
                    s sVar4 = uVar.M;
                    if ((sVar4 == null ? 0 : sVar4.f479c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        s sVar5 = uVar.M;
                        printWriter.println(sVar5 == null ? 0 : sVar5.f479c);
                    }
                    s sVar6 = uVar.M;
                    if ((sVar6 == null ? 0 : sVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        s sVar7 = uVar.M;
                        printWriter.println(sVar7 == null ? 0 : sVar7.d);
                    }
                    s sVar8 = uVar.M;
                    if ((sVar8 == null ? 0 : sVar8.f480e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        s sVar9 = uVar.M;
                        printWriter.println(sVar9 == null ? 0 : sVar9.f480e);
                    }
                    if (uVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(uVar.I);
                    }
                    if (uVar.J != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(uVar.J);
                    }
                    if (uVar.h() != null) {
                        androidx.emoji2.text.s sVar10 = new androidx.emoji2.text.s(uVar.e(), x0.a.d);
                        String canonicalName = x0.a.class.getCanonicalName();
                        if (canonicalName != null) {
                            n.k kVar = ((x0.a) sVar10.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), x0.a.class)).f3278c;
                            if (kVar.h > 0) {
                                printWriter.print(str4);
                                printWriter.println("Loaders:");
                                if (kVar.h > 0) {
                                    if (kVar.f2576g[0] != null) {
                                        a.b.c();
                                        return;
                                    }
                                    printWriter.print(str4);
                                    printWriter.print("  #");
                                    printWriter.print(kVar.f2575f[0]);
                                    printWriter.print(": ");
                                    throw null;
                                }
                            }
                        } else {
                            a.b.m("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + uVar.f509y + ":");
                    uVar.f509y.v(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size3; i3++) {
                u uVar2 = (u) arrayList.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(uVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f400e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                u uVar3 = (u) this.f400e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(uVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = (a) this.d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f403i.get());
        synchronized (this.f397a) {
            try {
                int size4 = this.f397a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj2 = (i0) this.f397a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f414t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f415u);
        if (this.f416v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f416v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f413s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(i0 i0Var, boolean z2) {
        if (!z2) {
            if (this.f414t == null) {
                if (this.G) {
                    a.b.i("FragmentManager has been destroyed");
                    return;
                } else {
                    a.b.i("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                a.b.i("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f397a) {
            try {
                if (this.f414t == null) {
                    if (z2) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f397a.add(i0Var);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (!this.f398b) {
            if (this.f414t == null) {
                if (this.G) {
                    a.b.i("FragmentManager has been destroyed");
                    return;
                } else {
                    a.b.i("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (Looper.myLooper() == this.f414t.h.getLooper()) {
                if (!z2 && (this.E || this.F)) {
                    a.b.i("Can not perform this action after onSaveInstanceState");
                    return;
                } else {
                    if (this.I == null) {
                        this.I = new ArrayList();
                        this.J = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            a.b.i("Must be called from main thread of fragment host");
            return;
        }
        a.b.i("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z2) {
        boolean z3;
        ArrayList arrayList;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.f397a) {
                if (this.f397a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f397a.size();
                        int i3 = 0;
                        z3 = false;
                        while (true) {
                            arrayList = this.f397a;
                            if (i3 >= size) {
                                break;
                            }
                            z3 |= ((i0) arrayList.get(i3)).a(arrayList2, arrayList3);
                            i3++;
                        }
                        arrayList.clear();
                        this.f414t.h.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (z3) {
                z4 = true;
                this.f398b = true;
                try {
                    Q(this.I, this.J);
                } finally {
                    d();
                }
            } else {
                b0();
                u();
                ((HashMap) this.f399c.f321g).values().removeAll(Collections.singleton(null));
                return z4;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x0244. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x031a. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        ViewGroup viewGroup;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        androidx.emoji2.text.w wVar = this.f399c;
        boolean z7 = ((a) arrayList.get(i3)).f346o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(wVar.k());
        u uVar = this.f417w;
        int i9 = i3;
        boolean z8 = false;
        while (true) {
            int i10 = 1;
            if (i9 < i4) {
                a aVar = (a) arrayList.get(i9);
                boolean booleanValue = ((Boolean) arrayList2.get(i9)).booleanValue();
                ArrayList arrayList4 = this.K;
                if (!booleanValue) {
                    ArrayList arrayList5 = aVar.f334a;
                    int i11 = 0;
                    while (i11 < arrayList5.size()) {
                        r0 r0Var = (r0) arrayList5.get(i11);
                        int i12 = r0Var.f470a;
                        if (i12 != i10) {
                            z4 = z7;
                            if (i12 != 2) {
                                if (i12 == 3 || i12 == 6) {
                                    arrayList4.remove(r0Var.f471b);
                                    u uVar2 = r0Var.f471b;
                                    if (uVar2 == uVar) {
                                        arrayList5.add(i11, new r0(9, uVar2));
                                        i11++;
                                        i7 = i9;
                                        z5 = z8;
                                        i6 = 1;
                                        uVar = null;
                                    }
                                } else if (i12 == 7) {
                                    i6 = 1;
                                } else if (i12 == 8) {
                                    arrayList5.add(i11, new r0(9, uVar, 0));
                                    r0Var.f472c = true;
                                    i11++;
                                    uVar = r0Var.f471b;
                                }
                                i7 = i9;
                                z5 = z8;
                                i6 = 1;
                            } else {
                                u uVar3 = r0Var.f471b;
                                int i13 = uVar3.B;
                                int size = arrayList4.size() - 1;
                                boolean z9 = false;
                                while (size >= 0) {
                                    int i14 = size;
                                    u uVar4 = (u) arrayList4.get(size);
                                    int i15 = i9;
                                    if (uVar4.B != i13) {
                                        z6 = z8;
                                    } else if (uVar4 == uVar3) {
                                        z6 = z8;
                                        z9 = true;
                                    } else {
                                        if (uVar4 == uVar) {
                                            z6 = z8;
                                            i8 = 0;
                                            arrayList5.add(i11, new r0(9, uVar4, 0));
                                            i11++;
                                            uVar = null;
                                        } else {
                                            z6 = z8;
                                            i8 = 0;
                                        }
                                        r0 r0Var2 = new r0(3, uVar4, i8);
                                        r0Var2.d = r0Var.d;
                                        r0Var2.f474f = r0Var.f474f;
                                        r0Var2.f473e = r0Var.f473e;
                                        r0Var2.f475g = r0Var.f475g;
                                        arrayList5.add(i11, r0Var2);
                                        arrayList4.remove(uVar4);
                                        i11++;
                                        uVar = uVar;
                                    }
                                    size = i14 - 1;
                                    z8 = z6;
                                    i9 = i15;
                                }
                                i7 = i9;
                                z5 = z8;
                                i6 = 1;
                                if (z9) {
                                    arrayList5.remove(i11);
                                    i11--;
                                } else {
                                    r0Var.f470a = 1;
                                    r0Var.f472c = true;
                                    arrayList4.add(uVar3);
                                }
                            }
                            i11 += i6;
                            i10 = i6;
                            z7 = z4;
                            z8 = z5;
                            i9 = i7;
                        } else {
                            z4 = z7;
                            i6 = i10;
                        }
                        i7 = i9;
                        z5 = z8;
                        arrayList4.add(r0Var.f471b);
                        i11 += i6;
                        i10 = i6;
                        z7 = z4;
                        z8 = z5;
                        i9 = i7;
                    }
                    z2 = z7;
                    i5 = i9;
                    z3 = z8;
                } else {
                    z2 = z7;
                    i5 = i9;
                    z3 = z8;
                    int i16 = 1;
                    ArrayList arrayList6 = aVar.f334a;
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        r0 r0Var3 = (r0) arrayList6.get(size2);
                        int i17 = r0Var3.f470a;
                        if (i17 != i16) {
                            if (i17 != 3) {
                                switch (i17) {
                                    case 8:
                                        uVar = null;
                                        break;
                                    case 9:
                                        uVar = r0Var3.f471b;
                                        break;
                                    case 10:
                                        r0Var3.f476i = r0Var3.h;
                                        break;
                                }
                                size2--;
                                i16 = 1;
                            }
                            arrayList4.add(r0Var3.f471b);
                            size2--;
                            i16 = 1;
                        }
                        arrayList4.remove(r0Var3.f471b);
                        size2--;
                        i16 = 1;
                    }
                }
                z8 = z3 || aVar.f339g;
                i9 = i5 + 1;
                z7 = z2;
            } else {
                boolean z10 = z7;
                this.K.clear();
                if (!z10 && this.f413s >= 1) {
                    for (int i18 = i3; i18 < i4; i18++) {
                        ArrayList arrayList7 = ((a) arrayList.get(i18)).f334a;
                        int size3 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj = arrayList7.get(i19);
                            i19++;
                            u uVar5 = ((r0) obj).f471b;
                            if (uVar5 != null && uVar5.f507w != null) {
                                wVar.l(f(uVar5));
                            }
                        }
                    }
                }
                for (int i20 = i3; i20 < i4; i20++) {
                    a aVar2 = (a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        aVar2.c(-1);
                        k0 k0Var = aVar2.f347p;
                        ArrayList arrayList8 = aVar2.f334a;
                        boolean z11 = true;
                        for (int size4 = arrayList8.size() - 1; size4 >= 0; size4--) {
                            r0 r0Var4 = (r0) arrayList8.get(size4);
                            u uVar6 = r0Var4.f471b;
                            if (uVar6 != null) {
                                if (uVar6.M != null) {
                                    uVar6.d().f477a = z11;
                                }
                                int i21 = aVar2.f338f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        i23 = 8197;
                                        if (i21 != 8197) {
                                            if (i21 == 4099) {
                                                i22 = 4099;
                                            } else if (i21 != 4100) {
                                                i22 = 0;
                                            }
                                        }
                                    }
                                    i22 = i23;
                                }
                                if (uVar6.M != null || i22 != 0) {
                                    uVar6.d();
                                    uVar6.M.f481f = i22;
                                }
                                uVar6.d();
                                uVar6.M.getClass();
                            }
                            switch (r0Var4.f470a) {
                                case 1:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    z11 = true;
                                    k0Var.U(uVar6, true);
                                    k0Var.P(uVar6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var4.f470a);
                                case 3:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    k0Var.a(uVar6);
                                    z11 = true;
                                case 4:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    k0Var.getClass();
                                    Y(uVar6);
                                    z11 = true;
                                case 5:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    k0Var.U(uVar6, true);
                                    k0Var.E(uVar6);
                                    z11 = true;
                                case 6:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    k0Var.c(uVar6);
                                    z11 = true;
                                case 7:
                                    uVar6.D(r0Var4.d, r0Var4.f473e, r0Var4.f474f, r0Var4.f475g);
                                    k0Var.U(uVar6, true);
                                    k0Var.g(uVar6);
                                    z11 = true;
                                case 8:
                                    k0Var.W(null);
                                    z11 = true;
                                case 9:
                                    k0Var.W(uVar6);
                                    z11 = true;
                                case 10:
                                    k0Var.V(uVar6, r0Var4.h);
                                    z11 = true;
                            }
                        }
                    } else {
                        aVar2.c(1);
                        k0 k0Var2 = aVar2.f347p;
                        ArrayList arrayList9 = aVar2.f334a;
                        int size5 = arrayList9.size();
                        for (int i24 = 0; i24 < size5; i24++) {
                            r0 r0Var5 = (r0) arrayList9.get(i24);
                            u uVar7 = r0Var5.f471b;
                            if (uVar7 != null) {
                                if (uVar7.M != null) {
                                    uVar7.d().f477a = false;
                                }
                                int i25 = aVar2.f338f;
                                if (uVar7.M != null || i25 != 0) {
                                    uVar7.d();
                                    uVar7.M.f481f = i25;
                                }
                                uVar7.d();
                                uVar7.M.getClass();
                            }
                            switch (r0Var5.f470a) {
                                case 1:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.U(uVar7, false);
                                    k0Var2.a(uVar7);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var5.f470a);
                                case 3:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.P(uVar7);
                                case 4:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.E(uVar7);
                                case 5:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.U(uVar7, false);
                                    Y(uVar7);
                                case 6:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.g(uVar7);
                                case 7:
                                    uVar7.D(r0Var5.d, r0Var5.f473e, r0Var5.f474f, r0Var5.f475g);
                                    k0Var2.U(uVar7, false);
                                    k0Var2.c(uVar7);
                                case 8:
                                    k0Var2.W(uVar7);
                                case 9:
                                    k0Var2.W(null);
                                case 10:
                                    k0Var2.V(uVar7, r0Var5.f476i);
                            }
                        }
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i26 = i3; i26 < i4; i26++) {
                    a aVar3 = (a) arrayList.get(i26);
                    if (booleanValue2) {
                        for (int size6 = aVar3.f334a.size() - 1; size6 >= 0; size6--) {
                            u uVar8 = ((r0) aVar3.f334a.get(size6)).f471b;
                            if (uVar8 != null) {
                                f(uVar8).k();
                            }
                        }
                    } else {
                        ArrayList arrayList10 = aVar3.f334a;
                        int size7 = arrayList10.size();
                        int i27 = 0;
                        while (i27 < size7) {
                            Object obj2 = arrayList10.get(i27);
                            i27++;
                            u uVar9 = ((r0) obj2).f471b;
                            if (uVar9 != null) {
                                f(uVar9).k();
                            }
                        }
                    }
                }
                K(this.f413s, true);
                HashSet hashSet = new HashSet();
                for (int i28 = i3; i28 < i4; i28++) {
                    ArrayList arrayList11 = ((a) arrayList.get(i28)).f334a;
                    int size8 = arrayList11.size();
                    int i29 = 0;
                    while (i29 < size8) {
                        Object obj3 = arrayList11.get(i29);
                        i29++;
                        u uVar10 = ((r0) obj3).f471b;
                        if (uVar10 != null && (viewGroup = uVar10.I) != null) {
                            hashSet.add(l.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    lVar.d = booleanValue2;
                    synchronized (lVar.f422b) {
                        try {
                            lVar.g();
                            lVar.f424e = false;
                            int size9 = lVar.f422b.size() - 1;
                            while (true) {
                                if (size9 >= 0) {
                                    v0 v0Var = (v0) lVar.f422b.get(size9);
                                    int c3 = w0.c(v0Var.f517c.J);
                                    if (v0Var.f515a != 2 || c3 == 2) {
                                        size9--;
                                    } else {
                                        s sVar = v0Var.f517c.M;
                                        lVar.f424e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lVar.c();
                }
                for (int i30 = i3; i30 < i4; i30++) {
                    a aVar4 = (a) arrayList.get(i30);
                    if (((Boolean) arrayList2.get(i30)).booleanValue() && aVar4.f349r >= 0) {
                        aVar4.f349r = -1;
                    }
                    aVar4.getClass();
                }
                return;
            }
        }
    }
}
