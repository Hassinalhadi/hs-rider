package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.m;
import j0.j0;
import l1.c;
import p0.d;
import x.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public d f1136a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1137b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1138c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1139e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1140f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1141g = new c(this);

    @Override // x.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1137b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f1137b = false;
            }
        } else {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1137b = z2;
        }
        if (z2) {
            if (this.f1136a == null) {
                this.f1136a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f1141g);
            }
            if (!this.f1138c && this.f1136a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            j0.f(view, 1048576);
            j0.d(view, 0);
            if (r(view)) {
                j0.g(view, k0.c.f2470j, new m(22, this));
            }
        }
        return false;
    }

    @Override // x.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1136a != null) {
            if (!this.f1138c || motionEvent.getActionMasked() != 3) {
                this.f1136a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean r(View view) {
        return true;
    }
}
