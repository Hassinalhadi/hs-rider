package b1;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f906a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f907b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f908c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f909e;

    /* renamed from: f, reason: collision with root package name */
    public int f910f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f911g;
    public final /* synthetic */ RecyclerView h;

    public t0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f906a = arrayList;
        this.f907b = null;
        this.f908c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f909e = 2;
        this.f910f = 2;
    }

    public final void a(c1 c1Var, boolean z2) {
        j0.b bVar;
        RecyclerView.j(c1Var);
        View view = c1Var.f729a;
        RecyclerView recyclerView = this.h;
        e1 e1Var = recyclerView.f632p0;
        if (e1Var != null) {
            d1 d1Var = e1Var.f757e;
            if (d1Var != null) {
                bVar = (j0.b) d1Var.f749e.remove(view);
            } else {
                bVar = null;
            }
            j0.j0.h(view, bVar);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f635r;
            if (arrayList.size() <= 0) {
                if (recyclerView.f618i0 != null) {
                    recyclerView.f621k.G(c1Var);
                }
            } else {
                arrayList.get(0).getClass();
                a.b.c();
                return;
            }
        }
        c1Var.f745s = null;
        c1Var.f744r = null;
        s0 c3 = c();
        c3.getClass();
        int i3 = c1Var.f733f;
        ArrayList arrayList2 = c3.a(i3).f892a;
        if (((r0) c3.f897a.get(i3)).f893b <= arrayList2.size()) {
            return;
        }
        c1Var.m();
        arrayList2.add(c1Var);
    }

    public final int b(int i3) {
        RecyclerView recyclerView = this.h;
        z0 z0Var = recyclerView.f618i0;
        if (i3 >= 0 && i3 < z0Var.b()) {
            if (!z0Var.f957g) {
                return i3;
            }
            return recyclerView.f617i.e(i3, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + z0Var.b() + recyclerView.y());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b1.s0, java.lang.Object] */
    public final s0 c() {
        if (this.f911g == null) {
            ?? obj = new Object();
            obj.f897a = new SparseArray();
            obj.f898b = 0;
            this.f911g = obj;
        }
        return this.f911g;
    }

    public final View d(int i3) {
        return j(i3, Long.MAX_VALUE).f729a;
    }

    public final void e() {
        ArrayList arrayList = this.f908c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.B0;
        p pVar = this.h.f616h0;
        int[] iArr2 = pVar.f882c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        pVar.d = 0;
    }

    public final void f(int i3) {
        ArrayList arrayList = this.f908c;
        a((c1) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public final void g(View view) {
        c1 I = RecyclerView.I(view);
        boolean j3 = I.j();
        RecyclerView recyclerView = this.h;
        if (j3) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.f740n.k(I);
        } else if (I.p()) {
            I.f736j &= -33;
        }
        h(I);
        if (recyclerView.N != null && !I.g()) {
            recyclerView.N.d(I);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(b1.c1 r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.t0.h(b1.c1):void");
    }

    public final void i(View view) {
        j0 j0Var;
        c1 I = RecyclerView.I(view);
        int i3 = I.f736j & 12;
        RecyclerView recyclerView = this.h;
        if (i3 == 0 && I.k() && (j0Var = recyclerView.N) != null) {
            j jVar = (j) j0Var;
            if (I.c().isEmpty() && jVar.f791g && !I.f()) {
                if (this.f907b == null) {
                    this.f907b = new ArrayList();
                }
                I.f740n = this;
                I.f741o = true;
                this.f907b.add(I);
                return;
            }
        }
        if (I.f() && !I.h() && !recyclerView.f631p.f755b) {
            a.b.m("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
            return;
        }
        I.f740n = this;
        I.f741o = false;
        this.f906a.add(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0422, code lost:
    
        if (r10.f() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x044e, code lost:
    
        if ((r13 + r11) >= r28) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
    
        if (r10.f733f != 0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, b1.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b1.c1 j(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.t0.j(int, long):b1.c1");
    }

    public final void k(c1 c1Var) {
        if (c1Var.f741o) {
            this.f907b.remove(c1Var);
        } else {
            this.f906a.remove(c1Var);
        }
        c1Var.f740n = null;
        c1Var.f741o = false;
        c1Var.f736j &= -33;
    }

    public final void l() {
        int i3;
        n0 n0Var = this.h.f633q;
        if (n0Var != null) {
            i3 = n0Var.f870j;
        } else {
            i3 = 0;
        }
        this.f910f = this.f909e + i3;
        ArrayList arrayList = this.f908c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f910f; size--) {
            f(size);
        }
    }
}
