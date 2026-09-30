package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends j0.b {
    public final /* synthetic */ int d;

    public /* synthetic */ g(int i3) {
        this.d = i3;
    }

    @Override // j0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z2;
        switch (this.d) {
            case 4:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        int scrollRange;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
                this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f2476a;
                this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = dVar.f2476a;
                this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = dVar.f2476a;
                this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setVisibleToUser(false);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = dVar.f2476a;
                this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                dVar.h(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo5.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        dVar.b(k0.c.f2468g);
                        dVar.b(k0.c.f2471k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        dVar.b(k0.c.f2467f);
                        dVar.b(k0.c.f2472l);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 != 16908346) goto L32;
     */
    @Override // j0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L75
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L75
            goto La0
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
            goto La1
        L75:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
            goto La1
        La0:
            r6 = r0
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
