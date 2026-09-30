package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import b1.n0;
import java.util.Calendar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f1232g;
    public final /* synthetic */ m h;

    public /* synthetic */ f(m mVar, v vVar, int i3) {
        this.f1231f = i3;
        this.h = mVar;
        this.f1232g = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int H;
        switch (this.f1231f) {
            case 0:
                m mVar = this.h;
                int L0 = ((LinearLayoutManager) mVar.f1241f0.getLayoutManager()).L0() - 1;
                Calendar a3 = z.a(this.f1232g.d.f1219f.f1269f);
                a3.add(2, L0);
                mVar.F(new r(a3));
                return;
            default:
                m mVar2 = this.h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.f1241f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                if (N0 == null) {
                    H = -1;
                } else {
                    H = n0.H(N0);
                }
                Calendar a4 = z.a(this.f1232g.d.f1219f.f1269f);
                a4.add(2, H + 1);
                mVar2.F(new r(a4));
                return;
        }
    }
}
