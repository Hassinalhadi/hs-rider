package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.f1;
import com.google.android.material.button.MaterialButton;
import j0.j0;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m<S> extends w {
    public int Z;
    public b a0;

    /* renamed from: b0, reason: collision with root package name */
    public r f1238b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1239c0;

    /* renamed from: d0, reason: collision with root package name */
    public c f1240d0;
    public RecyclerView e0;

    /* renamed from: f0, reason: collision with root package name */
    public RecyclerView f1241f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f1242g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f1243h0;

    /* renamed from: i0, reason: collision with root package name */
    public View f1244i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f1245j0;

    /* renamed from: k0, reason: collision with root package name */
    public MaterialButton f1246k0;

    /* renamed from: l0, reason: collision with root package name */
    public AccessibilityManager f1247l0;

    public final void F(r rVar) {
        boolean z2;
        v vVar = (v) this.f1241f0.getAdapter();
        int d = vVar.d.f1219f.d(rVar);
        AccessibilityManager accessibilityManager = this.f1247l0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.f1238b0 = rVar;
            this.f1241f0.Y(d);
        } else {
            int d3 = d - vVar.d.f1219f.d(this.f1238b0);
            boolean z3 = false;
            if (Math.abs(d3) > 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (d3 > 0) {
                z3 = true;
            }
            this.f1238b0 = rVar;
            if (z2 && z3) {
                this.f1241f0.Y(d - 3);
                this.f1241f0.post(new androidx.emoji2.text.h(this, d, 1));
            } else {
                RecyclerView recyclerView = this.f1241f0;
                if (z2) {
                    recyclerView.Y(d + 3);
                    this.f1241f0.post(new androidx.emoji2.text.h(this, d, 1));
                } else {
                    recyclerView.post(new androidx.emoji2.text.h(this, d, 1));
                }
            }
        }
        H(d);
    }

    public final void G(int i3) {
        this.f1239c0 = i3;
        if (i3 == 2) {
            this.e0.getLayoutManager().o0(this.f1238b0.h - ((b0) this.e0.getAdapter()).d.a0.f1219f.h);
            this.f1244i0.setVisibility(0);
            this.f1245j0.setVisibility(8);
            this.f1242g0.setVisibility(8);
            this.f1243h0.setVisibility(8);
            return;
        }
        if (i3 == 1) {
            this.f1244i0.setVisibility(8);
            this.f1245j0.setVisibility(0);
            this.f1242g0.setVisibility(0);
            this.f1243h0.setVisibility(0);
            F(this.f1238b0);
        }
    }

    public final void H(int i3) {
        boolean z2;
        View view = this.f1243h0;
        boolean z3 = false;
        if (i3 + 1 < this.f1241f0.getAdapter().a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        view.setEnabled(z2);
        View view2 = this.f1242g0;
        if (i3 - 1 >= 0) {
            z3 = true;
        }
        view2.setEnabled(z3);
    }

    @Override // androidx.fragment.app.u
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f495k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.a0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f1238b0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                a.b.c();
                return;
            }
        }
        a.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, b1.k0] */
    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i3;
        int i4;
        e eVar;
        b1.b0 b0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        this.f1240d0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1247l0 = (AccessibilityManager) B().getSystemService("accessibility");
        r rVar = this.a0.f1219f;
        if (p.I(contextThemeWrapper, R.attr.windowFullscreen)) {
            i3 = com.logistics.rider.lsposed.R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i3 = com.logistics.rider.lsposed.R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        Resources resources = B().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = s.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.logistics.rider.lsposed.R.id.mtrl_calendar_days_of_week);
        j0.h(gridView, new g(0));
        int i6 = this.a0.f1222j;
        if (i6 > 0) {
            eVar = new e(i6);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(rVar.f1271i);
        gridView.setEnabled(false);
        this.f1241f0 = (RecyclerView) inflate.findViewById(com.logistics.rider.lsposed.R.id.mtrl_calendar_months);
        this.f1241f0.setLayoutManager(new h(this, i4, i4));
        this.f1241f0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.a0, new androidx.emoji2.text.m(8, this));
        this.f1241f0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.logistics.rider.lsposed.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.logistics.rider.lsposed.R.id.mtrl_calendar_year_selector_frame);
        this.e0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager(integer));
            this.e0.setAdapter(new b0(this));
            RecyclerView recyclerView4 = this.e0;
            ?? obj = new Object();
            z.c(null);
            z.c(null);
            recyclerView4.g(obj);
        }
        View findViewById = inflate.findViewById(com.logistics.rider.lsposed.R.id.month_navigation_fragment_toggle);
        b bVar = vVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.logistics.rider.lsposed.R.id.month_navigation_fragment_toggle);
            this.f1246k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            j0.h(this.f1246k0, new j(0, this));
            View findViewById2 = inflate.findViewById(com.logistics.rider.lsposed.R.id.month_navigation_previous);
            this.f1242g0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(com.logistics.rider.lsposed.R.id.month_navigation_next);
            this.f1243h0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f1244i0 = inflate.findViewById(com.logistics.rider.lsposed.R.id.mtrl_calendar_year_selector_frame);
            this.f1245j0 = inflate.findViewById(com.logistics.rider.lsposed.R.id.mtrl_calendar_day_selector_frame);
            G(1);
            this.f1246k0.setText(this.f1238b0.c());
            this.f1241f0.h(new k(this, vVar));
            this.f1246k0.setOnClickListener(new l(0, this));
            this.f1243h0.setOnClickListener(new f(this, vVar, 1));
            this.f1242g0.setOnClickListener(new f(this, vVar, 0));
            H(bVar.f1219f.d(this.f1238b0));
        }
        if (!p.I(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (b0Var = new b1.b0()).f716a) != (recyclerView = this.f1241f0)) {
            f1 f1Var = b0Var.f717b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f622k0;
                if (arrayList != null) {
                    arrayList.remove(f1Var);
                }
                b0Var.f716a.setOnFlingListener(null);
            }
            b0Var.f716a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    b0Var.f716a.h(f1Var);
                    b0Var.f716a.setOnFlingListener(b0Var);
                    new Scroller(b0Var.f716a.getContext(), new DecelerateInterpolator());
                    b0Var.f();
                } else {
                    a.b.i("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.f1241f0.Y(bVar.f1219f.d(this.f1238b0));
        j0.h(this.f1241f0, new g(1));
        return inflate;
    }

    @Override // androidx.fragment.app.u
    public final void w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1238b0);
    }
}
