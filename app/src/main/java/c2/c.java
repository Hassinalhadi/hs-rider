package c2;

import a.y;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.a f1105b;

    public /* synthetic */ c(x.a aVar, int i3) {
        this.f1104a = i3;
        this.f1105b = aVar;
    }

    @Override // k2.h
    public final void K(int i3) {
        switch (this.f1104a) {
            case 0:
                if (i3 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1105b;
                    if (sideSheetBehavior.f1304g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1105b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // k2.h
    public final void L(View view, int i3, int i4) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1104a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1105b;
                WeakReference weakReference = sideSheetBehavior.f1313q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1299a.f0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1317u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f1299a.k(i3);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        a.b.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1105b).u(i4);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r6 > r4.E) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (java.lang.Math.abs(r5.getTop() - r4.x()) < java.lang.Math.abs(r5.getTop() - r4.E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (java.lang.Math.abs(r6 - r4.E) < java.lang.Math.abs(r6 - r4.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (java.lang.Math.abs(r6 - r4.D) < java.lang.Math.abs(r6 - r4.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r6 < java.lang.Math.abs(r6 - r4.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r4.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        if (r4.f1299a.L(r5) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        if (java.lang.Math.abs(r6 - r4.f1299a.D()) < java.lang.Math.abs(r6 - r4.f1299a.E())) goto L71;
     */
    @Override // k2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.M(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5.canScrollVertically(-1) != false) goto L27;
     */
    @Override // k2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f1104a
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            x.a r3 = r3.f1105b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            int r0 = r3.N
            r1 = 1
            if (r0 != r1) goto Lf
            goto L3f
        Lf:
            boolean r2 = r3.f1146c0
            if (r2 == 0) goto L14
            goto L3f
        L14:
            r2 = 3
            if (r0 != r2) goto L31
            int r0 = r3.a0
            if (r0 != r5) goto L31
            java.lang.ref.WeakReference r5 = r3.X
            if (r5 == 0) goto L26
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L31
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r3 = r3.W
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        L41:
            x.a r3 = r3.f1105b
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r5 = r3.h
            r0 = 1
            if (r5 != r0) goto L4b
            goto L56
        L4b:
            java.lang.ref.WeakReference r3 = r3.f1312p
            if (r3 == 0) goto L56
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L56
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.Y(android.view.View, int):boolean");
    }

    @Override // k2.h
    public final int h(View view, int i3) {
        switch (this.f1104a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1105b;
                return y.q(i3, sideSheetBehavior.f1299a.G(), sideSheetBehavior.f1299a.F());
            default:
                return view.getLeft();
        }
    }

    @Override // k2.h
    public final int i(View view, int i3) {
        switch (this.f1104a) {
            case 0:
                return view.getTop();
            default:
                return y.q(i3, ((BottomSheetBehavior) this.f1105b).x(), x());
        }
    }

    @Override // k2.h
    public int v(View view) {
        switch (this.f1104a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1105b;
                return sideSheetBehavior.f1308l + sideSheetBehavior.f1311o;
            default:
                return super.v(view);
        }
    }

    @Override // k2.h
    public int x() {
        switch (this.f1104a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1105b;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.x();
        }
    }
}
