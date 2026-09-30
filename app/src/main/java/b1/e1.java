package b1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e1 extends j0.b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f757e;

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
        d1 d1Var = this.f757e;
        if (d1Var != null) {
            this.f757e = d1Var;
        } else {
            this.f757e = new d1(this);
        }
    }

    @Override // j0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(accessibilityEvent);
            }
        }
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f864b;
            t0 t0Var = recyclerView2.f614g;
            z0 z0Var = recyclerView2.f618i0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f864b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f864b.canScrollVertically(1) || layoutManager.f864b.canScrollHorizontally(1)) {
                dVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(t0Var, z0Var), layoutManager.x(t0Var, z0Var), false, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // j0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r3 = super.g(r3, r4, r5)
            r5 = 1
            if (r3 == 0) goto L8
            return r5
        L8:
            androidx.recyclerview.widget.RecyclerView r2 = r2.d
            boolean r3 = r2.K()
            r0 = 0
            if (r3 != 0) goto L8b
            b1.n0 r3 = r2.getLayoutManager()
            if (r3 == 0) goto L8b
            b1.n0 r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f864b
            b1.t0 r1 = r3.f614g
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 == r1) goto L58
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r1) goto L2a
            r3 = r0
            r4 = r3
            goto L80
        L2a:
            r4 = -1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L3f
            int r3 = r2.f875o
            int r1 = r2.G()
            int r3 = r3 - r1
            int r1 = r2.D()
            int r3 = r3 - r1
            int r3 = -r3
            goto L40
        L3f:
            r3 = r0
        L40:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f864b
            boolean r4 = r1.canScrollHorizontally(r4)
            if (r4 == 0) goto L56
            int r4 = r2.f874n
            int r1 = r2.E()
            int r4 = r4 - r1
            int r1 = r2.F()
            int r4 = r4 - r1
            int r4 = -r4
            goto L80
        L56:
            r4 = r0
            goto L80
        L58:
            boolean r3 = r3.canScrollVertically(r5)
            if (r3 == 0) goto L6b
            int r3 = r2.f875o
            int r4 = r2.G()
            int r3 = r3 - r4
            int r4 = r2.D()
            int r3 = r3 - r4
            goto L6c
        L6b:
            r3 = r0
        L6c:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f864b
            boolean r4 = r4.canScrollHorizontally(r5)
            if (r4 == 0) goto L56
            int r4 = r2.f874n
            int r1 = r2.E()
            int r4 = r4 - r1
            int r1 = r2.F()
            int r4 = r4 - r1
        L80:
            if (r3 != 0) goto L85
            if (r4 != 0) goto L85
            goto L8b
        L85:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f864b
            r2.Z(r4, r3, r5)
            return r5
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
