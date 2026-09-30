package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f748a;

    public /* synthetic */ d0(RecyclerView recyclerView) {
        this.f748a = recyclerView;
    }

    public void a(a aVar) {
        int i3 = aVar.f708a;
        RecyclerView recyclerView = this.f748a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return;
                    }
                    recyclerView.f633q.Z(aVar.f709b, aVar.f710c);
                    return;
                }
                recyclerView.f633q.b0(aVar.f709b, aVar.f710c);
                return;
            }
            recyclerView.f633q.a0(aVar.f709b, aVar.f710c);
            return;
        }
        recyclerView.f633q.X(aVar.f709b, aVar.f710c);
    }

    public c1 b(int i3) {
        RecyclerView recyclerView = this.f748a;
        int n2 = recyclerView.f619j.n();
        int i4 = 0;
        c1 c1Var = null;
        while (true) {
            if (i4 >= n2) {
                break;
            }
            c1 I = RecyclerView.I(recyclerView.f619j.m(i4));
            if (I != null && !I.h() && I.f731c == i3) {
                if (((ArrayList) recyclerView.f619j.d).contains(I.f729a)) {
                    c1Var = I;
                } else {
                    c1Var = I;
                    break;
                }
            }
            i4++;
        }
        if (c1Var != null) {
            if (!((ArrayList) recyclerView.f619j.d).contains(c1Var.f729a)) {
                return c1Var;
            }
        }
        return null;
    }

    public void c(int i3, int i4) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f748a;
        int n2 = recyclerView.f619j.n();
        int i7 = i4 + i3;
        for (int i8 = 0; i8 < n2; i8++) {
            View m3 = recyclerView.f619j.m(i8);
            c1 I = RecyclerView.I(m3);
            if (I != null && !I.o() && (i6 = I.f731c) >= i3 && i6 < i7) {
                I.a(2);
                I.a(1024);
                ((o0) m3.getLayoutParams()).f879c = true;
            }
        }
        t0 t0Var = recyclerView.f614g;
        ArrayList arrayList = t0Var.f908c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var != null && (i5 = c1Var.f731c) >= i3 && i5 < i7) {
                c1Var.a(2);
                t0Var.f(size);
            }
        }
        recyclerView.f626m0 = true;
    }

    public void d(int i3, int i4) {
        RecyclerView recyclerView = this.f748a;
        int n2 = recyclerView.f619j.n();
        for (int i5 = 0; i5 < n2; i5++) {
            c1 I = RecyclerView.I(recyclerView.f619j.m(i5));
            if (I != null && !I.o() && I.f731c >= i3) {
                I.l(i4, false);
                recyclerView.f618i0.f956f = true;
            }
        }
        ArrayList arrayList = recyclerView.f614g.f908c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            c1 c1Var = (c1) arrayList.get(i6);
            if (c1Var != null && c1Var.f731c >= i3) {
                c1Var.l(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f624l0 = true;
    }

    public void e(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f748a;
        int n2 = recyclerView.f619j.n();
        int i12 = -1;
        if (i3 < i4) {
            i6 = i3;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i3;
            i6 = i4;
            i7 = 1;
        }
        for (int i13 = 0; i13 < n2; i13++) {
            c1 I = RecyclerView.I(recyclerView.f619j.m(i13));
            if (I != null && (i11 = I.f731c) >= i6 && i11 <= i5) {
                if (i11 == i3) {
                    I.l(i4 - i3, false);
                } else {
                    I.l(i7, false);
                }
                recyclerView.f618i0.f956f = true;
            }
        }
        ArrayList arrayList = recyclerView.f614g.f908c;
        if (i3 < i4) {
            i9 = i3;
            i8 = i4;
        } else {
            i8 = i3;
            i9 = i4;
            i12 = 1;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            c1 c1Var = (c1) arrayList.get(i14);
            if (c1Var != null && (i10 = c1Var.f731c) >= i9 && i10 <= i8) {
                if (i10 == i3) {
                    c1Var.l(i4 - i3, false);
                } else {
                    c1Var.l(i12, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f624l0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(b1.c1 r8, b1.i0 r9, b1.i0 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.n(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.f748a
            b1.j0 r0 = r7.N
            r1 = r0
            b1.j r1 = (b1.j) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.f785a
            int r5 = r10.f785a
            if (r3 != r5) goto L1f
            int r0 = r9.f786b
            int r2 = r10.f786b
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.f786b
            int r6 = r10.f786b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.f729a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.f792i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.S()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.d0.f(b1.c1, b1.i0, b1.i0):void");
    }

    public void g(c1 c1Var, i0 i0Var, i0 i0Var2) {
        int i3;
        int i4;
        boolean z2;
        RecyclerView recyclerView = this.f748a;
        recyclerView.f614g.k(c1Var);
        recyclerView.f(c1Var);
        c1Var.n(false);
        j jVar = (j) recyclerView.N;
        jVar.getClass();
        int i5 = i0Var.f785a;
        int i6 = i0Var.f786b;
        View view = c1Var.f729a;
        if (i0Var2 == null) {
            i3 = view.getLeft();
        } else {
            i3 = i0Var2.f785a;
        }
        int i7 = i3;
        if (i0Var2 == null) {
            i4 = view.getTop();
        } else {
            i4 = i0Var2.f786b;
        }
        int i8 = i4;
        if (!c1Var.h() && (i5 != i7 || i6 != i8)) {
            view.layout(i7, i8, view.getWidth() + i7, view.getHeight() + i8);
            z2 = jVar.g(c1Var, i5, i6, i7, i8);
        } else {
            jVar.l(c1Var);
            jVar.h.add(c1Var);
            z2 = true;
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i3) {
        RecyclerView recyclerView = this.f748a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}
