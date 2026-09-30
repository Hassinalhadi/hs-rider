package l1;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public int f2498a;

    /* renamed from: b, reason: collision with root package name */
    public int f2499b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2500c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2500c = swipeDismissBehavior;
    }

    @Override // k2.h
    public final void J(View view, int i3) {
        this.f2499b = i3;
        this.f2498a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f2500c;
            swipeDismissBehavior.f1138c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1138c = false;
        }
    }

    @Override // k2.h
    public final void L(View view, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f2500c;
        float f3 = width * swipeDismissBehavior.f1139e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1140f;
        float abs = Math.abs(i3 - this.f2498a);
        if (abs <= f3) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f2498a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // k2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f2499b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f2500c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f2498a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f2498a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.f2498a
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f2498a
        L67:
            p0.d r8 = r3.f1136a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L7b
            androidx.fragment.app.e r8 = new androidx.fragment.app.e
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.M(android.view.View, float, float):void");
    }

    @Override // k2.h
    public final boolean Y(View view, int i3) {
        int i4 = this.f2499b;
        if ((i4 == -1 || i4 == i3) && this.f2500c.r(view)) {
            return true;
        }
        return false;
    }

    @Override // k2.h
    public final int h(View view, int i3) {
        boolean z2;
        int width;
        int width2;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.f2500c.d;
        if (i4 == 0) {
            width = this.f2498a;
            if (z2) {
                width -= view.getWidth();
                width2 = this.f2498a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i5 = this.f2498a;
            if (i4 == 1) {
                if (z2) {
                    width2 = view.getWidth() + i5;
                    width = i5;
                } else {
                    width = i5 - view.getWidth();
                    width2 = this.f2498a;
                }
            } else {
                width = i5 - view.getWidth();
                width2 = this.f2498a + view.getWidth();
            }
        }
        return Math.min(Math.max(width, i3), width2);
    }

    @Override // k2.h
    public final int i(View view, int i3) {
        return view.getTop();
    }

    @Override // k2.h
    public final int v(View view) {
        return view.getWidth();
    }

    @Override // k2.h
    public final void K(int i3) {
    }
}
