package b1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f887j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final o f888k = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f889f;

    /* renamed from: g, reason: collision with root package name */
    public long f890g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f891i;

    public static c1 c(RecyclerView recyclerView, int i3, long j3) {
        int n2 = recyclerView.f619j.n();
        for (int i4 = 0; i4 < n2; i4++) {
            c1 I = RecyclerView.I(recyclerView.f619j.m(i4));
            if (I.f731c == i3 && !I.f()) {
                return null;
            }
        }
        t0 t0Var = recyclerView.f614g;
        try {
            recyclerView.P();
            c1 j4 = t0Var.j(i3, j3);
            if (j4 != null) {
                if (j4.e() && !j4.f()) {
                    t0Var.g(j4.f729a);
                } else {
                    t0Var.a(j4, false);
                }
            }
            recyclerView.Q(false);
            return j4;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f643v && this.f890g == 0) {
            this.f890g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        p pVar = recyclerView.f616h0;
        pVar.f880a = i3;
        pVar.f881b = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j3) {
        q qVar;
        RecyclerView recyclerView;
        long j4;
        RecyclerView recyclerView2;
        q qVar2;
        boolean z2;
        ArrayList arrayList = this.f891i;
        ArrayList arrayList2 = this.f889f;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i4);
            int windowVisibility = recyclerView3.getWindowVisibility();
            p pVar = recyclerView3.f616h0;
            if (windowVisibility == 0) {
                pVar.b(recyclerView3, false);
                i3 += pVar.d;
            }
        }
        arrayList.ensureCapacity(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                p pVar2 = recyclerView4.f616h0;
                int abs = Math.abs(pVar2.f881b) + Math.abs(pVar2.f880a);
                for (int i7 = 0; i7 < pVar2.d * 2; i7 += 2) {
                    if (i5 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        qVar2 = obj;
                    } else {
                        qVar2 = (q) arrayList.get(i5);
                    }
                    int[] iArr = pVar2.f882c;
                    int i8 = iArr[i7 + 1];
                    if (i8 <= abs) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    qVar2.f883a = z2;
                    qVar2.f884b = abs;
                    qVar2.f885c = i8;
                    qVar2.d = recyclerView4;
                    qVar2.f886e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(arrayList, f888k);
        for (int i9 = 0; i9 < arrayList.size() && (recyclerView = (qVar = (q) arrayList.get(i9)).d) != null; i9++) {
            if (qVar.f883a) {
                j4 = Long.MAX_VALUE;
            } else {
                j4 = j3;
            }
            c1 c3 = c(recyclerView, qVar.f886e, j4);
            if (c3 != null && c3.f730b != null && c3.e() && !c3.f() && (recyclerView2 = (RecyclerView) c3.f730b.get()) != null) {
                if (recyclerView2.E && recyclerView2.f619j.n() != 0) {
                    t0 t0Var = recyclerView2.f614g;
                    j0 j0Var = recyclerView2.N;
                    if (j0Var != null) {
                        j0Var.e();
                    }
                    n0 n0Var = recyclerView2.f633q;
                    if (n0Var != null) {
                        n0Var.h0(t0Var);
                        recyclerView2.f633q.i0(t0Var);
                    }
                    t0Var.f906a.clear();
                    t0Var.e();
                }
                p pVar3 = recyclerView2.f616h0;
                pVar3.b(recyclerView2, true);
                if (pVar3.d != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.f618i0;
                        e0 e0Var = recyclerView2.f631p;
                        z0Var.d = 1;
                        z0Var.f955e = e0Var.a();
                        z0Var.f957g = false;
                        z0Var.h = false;
                        z0Var.f958i = false;
                        for (int i10 = 0; i10 < pVar3.d * 2; i10 += 2) {
                            c(recyclerView2, pVar3.f882c[i10], j3);
                        }
                        qVar.f883a = false;
                        qVar.f884b = 0;
                        qVar.f885c = 0;
                        qVar.d = null;
                        qVar.f886e = 0;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            qVar.f883a = false;
            qVar.f884b = 0;
            qVar.f885c = 0;
            qVar.d = null;
            qVar.f886e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f889f;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j3 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.h);
                }
            }
        } finally {
            this.f890g = 0L;
            Trace.endSection();
        }
    }
}
