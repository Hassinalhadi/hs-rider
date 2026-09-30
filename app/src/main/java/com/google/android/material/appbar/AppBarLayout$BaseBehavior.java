package com.google.android.material.appbar;

import a.b;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import k1.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1110b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f1113f;

    /* renamed from: c, reason: collision with root package name */
    public int f1111c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1112e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1112e < 0) {
            this.f1112e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1110b) {
            int i3 = this.f1111c;
            if (i3 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i3)) != -1) {
                int y2 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y2 - this.d) > this.f1112e) {
                    this.d = y2;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f1113f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f1111c = -1;
        motionEvent.getX();
        motionEvent.getY();
        b.c();
        return false;
    }

    @Override // k1.a, x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean o(View view, int i3, int i4) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void p(View view, View view2, int i3) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L45
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L49
            r6 = 6
            if (r0 == r6) goto L13
            goto L57
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r3
            goto L1c
        L1b:
            r6 = r2
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.f1111c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.d = r6
            goto L57
        L2d:
            int r0 = r5.f1111c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L62
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.d = r7
            r6.getClass()
            a.b.c()
        L43:
            r5 = 0
            return r5
        L45:
            android.view.VelocityTracker r0 = r5.f1113f
            if (r0 != 0) goto L64
        L49:
            r5.f1110b = r2
            r5.f1111c = r1
            android.view.VelocityTracker r6 = r5.f1113f
            if (r6 == 0) goto L57
            r6.recycle()
            r6 = 0
            r5.f1113f = r6
        L57:
            android.view.VelocityTracker r6 = r5.f1113f
            if (r6 == 0) goto L5e
            r6.addMovement(r7)
        L5e:
            boolean r5 = r5.f1110b
            if (r5 != 0) goto L63
        L62:
            return r2
        L63:
            return r3
        L64:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f1113f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f1113f
            int r5 = r5.f1111c
            r7.getYVelocity(r5)
            r6.getClass()
            a.b.c()
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
