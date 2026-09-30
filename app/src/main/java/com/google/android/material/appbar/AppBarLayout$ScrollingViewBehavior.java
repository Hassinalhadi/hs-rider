package com.google.android.material.appbar;

import a.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.j0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.a;
import x.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1114b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1991x);
        this.f1114b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
    }

    @Override // x.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int q3;
        if (((d) view2.getLayoutParams()).f3262a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i3 = this.f1114b;
            if (i3 == 0) {
                q3 = 0;
            } else {
                q3 = y.q((int) (0.0f * i3), 0, i3);
            }
            int i4 = bottom - q3;
            WeakHashMap weakHashMap = j0.f2160a;
            view.offsetTopAndBottom(i4);
        }
        return false;
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // x.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // k1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i3);
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    @Override // x.a
    public final void b(View view) {
    }
}
