package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f716a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f717b = new f1(this);

    /* renamed from: c, reason: collision with root package name */
    public z f718c;
    public z d;

    public static int b(View view, androidx.emoji2.text.f fVar) {
        return ((fVar.c(view) / 2) + fVar.e(view)) - ((fVar.l() / 2) + fVar.k());
    }

    public static View c(n0 n0Var, androidx.emoji2.text.f fVar) {
        int v3 = n0Var.v();
        View view = null;
        if (v3 == 0) {
            return null;
        }
        int l3 = (fVar.l() / 2) + fVar.k();
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v3; i4++) {
            View u2 = n0Var.u(i4);
            int abs = Math.abs(((fVar.c(u2) / 2) + fVar.e(u2)) - l3);
            if (abs < i3) {
                view = u2;
                i3 = abs;
            }
        }
        return view;
    }

    public final int[] a(n0 n0Var, View view) {
        int[] iArr = new int[2];
        if (n0Var.d()) {
            iArr[0] = b(view, d(n0Var));
        } else {
            iArr[0] = 0;
        }
        if (n0Var.e()) {
            iArr[1] = b(view, e(n0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.f d(n0 n0Var) {
        z zVar = this.d;
        if (zVar == null || ((n0) zVar.f281b) != n0Var) {
            this.d = new z(n0Var, 0);
        }
        return this.d;
    }

    public final androidx.emoji2.text.f e(n0 n0Var) {
        z zVar = this.f718c;
        if (zVar == null || ((n0) zVar.f281b) != n0Var) {
            this.f718c = new z(n0Var, 1);
        }
        return this.f718c;
    }

    public final void f() {
        n0 layoutManager;
        View view;
        RecyclerView recyclerView = this.f716a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a3 = a(layoutManager, view);
                int i3 = a3[0];
                if (i3 == 0 && a3[1] == 0) {
                    return;
                }
                this.f716a.Z(i3, a3[1], false);
            }
        }
    }
}
