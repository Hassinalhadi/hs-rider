package f1;

import android.animation.ObjectAnimator;
import android.view.View;
import com.logistics.rider.lsposed.R;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends n {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public final int F;

    public h() {
        this.F = 3;
    }

    public static void I(u uVar) {
        View view = uVar.f1617b;
        int visibility = view.getVisibility();
        HashMap hashMap = uVar.f1616a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(u uVar, float f3) {
        Float f4;
        if (uVar != null && (f4 = (Float) uVar.f1616a.get("android:fade:transitionAlpha")) != null) {
            return f4.floatValue();
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [f1.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f1.a0 L(f1.u r8, f1.u r9) {
        /*
            f1.a0 r0 = new f1.a0
            r0.<init>()
            r1 = 0
            r0.f1560a = r1
            r0.f1561b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1616a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f1562c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1563e = r6
            goto L33
        L2f:
            r0.f1562c = r3
            r0.f1563e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1616a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1564f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f1564f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f1562c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f1563e
            android.view.ViewGroup r4 = r0.f1564f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f1561b = r1
            r0.f1560a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f1561b = r2
            r0.f1560a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f1564f
            if (r8 != 0) goto L81
            r0.f1561b = r1
            r0.f1560a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f1563e
            if (r8 != 0) goto L9f
            r0.f1561b = r2
            r0.f1560a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.f1561b = r2
            r0.f1560a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f1562c
            if (r8 != 0) goto L9f
            r0.f1561b = r1
            r0.f1560a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.h.L(f1.u, f1.u):f1.a0");
    }

    public final ObjectAnimator J(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        b bVar = w.f1619a;
        view.setTransitionAlpha(f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f1619a, f4);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    @Override // f1.n
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // f1.n
    public final void g(u uVar) {
        I(uVar);
        View view = uVar.f1617b;
        Float f3 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f3 == null) {
            if (view.getVisibility() == 0) {
                b bVar = w.f1619a;
                f3 = Float.valueOf(view.getTransitionAlpha());
            } else {
                f3 = Float.valueOf(0.0f);
            }
        }
        uVar.f1616a.put("android:fade:transitionAlpha", f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f1560a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    @Override // f1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, f1.u r25, f1.u r26) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.h.k(android.view.ViewGroup, f1.u, f1.u):android.animation.Animator");
    }

    @Override // f1.n
    public final String[] q() {
        return G;
    }

    @Override // f1.n
    public final boolean s(u uVar, u uVar2) {
        if (uVar != null || uVar2 != null) {
            if (uVar == null || uVar2 == null || uVar2.f1616a.containsKey("android:visibility:visibility") == uVar.f1616a.containsKey("android:visibility:visibility")) {
                a0 L = L(uVar, uVar2);
                if (L.f1560a) {
                    if (L.f1562c == 0 || L.d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public h(int i3) {
        this();
        this.F = i3;
    }
}
