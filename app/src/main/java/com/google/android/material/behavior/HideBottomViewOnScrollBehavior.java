package com.google.android.material.behavior;

import a.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
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

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f1119b;

    /* renamed from: c, reason: collision with root package name */
    public int f1120c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1121e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f1123g;
    public l1.a h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1126k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1118a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1122f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1124i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f1125j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f1122f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1119b = h.R(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1120c = h.R(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = h.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, j1.a.d);
        this.f1121e = h.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, j1.a.f2195c);
        if (this.f1123g == null) {
            this.f1123g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1123g;
        if (accessibilityManager != null && this.h == null) {
            l1.a aVar = new l1.a(this, view, 0);
            this.h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new p0(4, this));
            return false;
        }
        return false;
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i3 > 0) {
            if (this.f1125j != 1) {
                if (!this.f1124i || (accessibilityManager = this.f1123g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f1126k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f1125j = 1;
                    Iterator it = this.f1118a.iterator();
                    if (!it.hasNext()) {
                        this.f1126k = view.animate().translationY(this.f1122f).setInterpolator(this.f1121e).setDuration(this.f1120c).setListener(new l(5, this));
                        return;
                    } else {
                        it.next().getClass();
                        b.c();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i3 < 0) {
            r(view);
        }
    }

    @Override // x.a
    public boolean o(View view, int i3, int i4) {
        if (i3 == 2) {
            return true;
        }
        return false;
    }

    public final void r(View view) {
        if (this.f1125j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1126k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1125j = 2;
        Iterator it = this.f1118a.iterator();
        if (!it.hasNext()) {
            this.f1126k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1119b).setListener(new l(5, this));
        } else {
            it.next().getClass();
            b.c();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
