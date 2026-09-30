package com.google.android.material.behavior;

import a.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.p0;
import com.logistics.rider.lsposed.R;
import e2.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k2.h;
import x.a;
import x.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public h f1127a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f1128b;

    /* renamed from: c, reason: collision with root package name */
    public l1.a f1129c;

    /* renamed from: e, reason: collision with root package name */
    public int f1130e;

    /* renamed from: f, reason: collision with root package name */
    public int f1131f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f1132g;
    public TimeInterpolator h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1135k;
    public final LinkedHashSet d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f1133i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1134j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        int i4;
        if (this.f1128b == null) {
            this.f1128b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1128b;
        if (accessibilityManager != null && this.f1129c == null) {
            l1.a aVar = new l1.a(this, view, 1);
            this.f1129c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new p0(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = ((d) view.getLayoutParams()).f3264c;
        if (i5 != 80 && i5 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i5, i3);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            } else {
                i4 = 2;
            }
            r(i4);
        } else {
            r(1);
        }
        this.f1133i = this.f1127a.s(view, marginLayoutParams);
        this.f1130e = h.R(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1131f = h.R(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1132g = h.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, j1.a.d);
        this.h = h.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, j1.a.f2195c);
        return false;
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        if (i3 > 0) {
            if (this.f1134j != 1) {
                AccessibilityManager accessibilityManager = this.f1128b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f1135k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f1134j = 1;
                    Iterator it = this.d.iterator();
                    if (!it.hasNext()) {
                        this.f1135k = this.f1127a.w(view, this.f1133i).setInterpolator(this.h).setDuration(this.f1131f).setListener(new l(6, this));
                        return;
                    }
                    it.next().getClass();
                    b.c();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 < 0) {
            s(view);
        }
    }

    @Override // x.a
    public final boolean o(View view, int i3, int i4) {
        if (i3 == 2) {
            return true;
        }
        return false;
    }

    public final void r(int i3) {
        h hVar = this.f1127a;
        if (hVar != null && hVar.u() == i3) {
            return;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f1127a = new l1.b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i3 + ". Must be 0, 1 or 2.");
            }
            this.f1127a = new l1.b(0);
            return;
        }
        this.f1127a = new l1.b(2);
    }

    public final void s(View view) {
        if (this.f1134j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1135k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1134j = 2;
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            this.f1127a.getClass();
            this.f1135k = this.f1127a.w(view, 0).setInterpolator(this.f1132g).setDuration(this.f1130e).setListener(new l(6, this));
            return;
        }
        it.next().getClass();
        b.c();
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
