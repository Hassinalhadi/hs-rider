package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b1.c1;
import b1.e0;
import b1.o0;
import com.logistics.rider.lsposed.R;
import java.util.Calendar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v extends e0 {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.emoji2.text.m f1283e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1284f;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, androidx.emoji2.text.m mVar) {
        int i3;
        r rVar = bVar.f1219f;
        r rVar2 = bVar.f1220g;
        r rVar3 = bVar.f1221i;
        if (rVar.f1269f.compareTo(rVar3.f1269f) <= 0) {
            if (rVar3.f1269f.compareTo(rVar2.f1269f) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.d;
                if (p.I(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i3 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i3 = 0;
                }
                this.f1284f = dimensionPixelSize + i3;
                this.d = bVar;
                this.f1283e = mVar;
                if (!this.f754a.a()) {
                    this.f755b = true;
                    return;
                } else {
                    a.b.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                    throw null;
                }
            }
            a.b.m("currentPage cannot be after lastPage");
            throw null;
        }
        a.b.m("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // b1.e0
    public final int a() {
        return this.d.f1224l;
    }

    @Override // b1.e0
    public final long b(int i3) {
        Calendar a3 = z.a(this.d.f1219f.f1269f);
        a3.add(2, i3);
        a3.set(5, 1);
        Calendar a4 = z.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        return a4.getTimeInMillis();
    }

    @Override // b1.e0
    public final void c(c1 c1Var, int i3) {
        u uVar = (u) c1Var;
        b bVar = this.d;
        Calendar a3 = z.a(bVar.f1219f.f1269f);
        a3.add(2, i3);
        r rVar = new r(a3);
        uVar.f1281u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f1282v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && rVar.equals(materialCalendarGridView.a().f1276a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new s(rVar, bVar);
        throw null;
    }

    @Override // b1.e0
    public final c1 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.I(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new o0(-1, this.f1284f));
            return new u(linearLayout, true);
        }
        return new u(linearLayout, false);
    }
}
