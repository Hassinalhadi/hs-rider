package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.n0;
import b1.q0;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f1234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1235b;

    public k(m mVar, v vVar) {
        this.f1235b = mVar;
        this.f1234a = vVar;
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        int L0;
        b bVar = this.f1234a.d;
        m mVar = this.f1235b;
        RecyclerView recyclerView2 = mVar.f1241f0;
        if (i3 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            if (N0 == null) {
                L0 = -1;
            } else {
                L0 = n0.H(N0);
            }
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        Calendar a3 = z.a(bVar.f1219f.f1269f);
        a3.add(2, L0);
        r rVar = new r(a3);
        mVar.f1238b0 = rVar;
        MaterialButton materialButton = mVar.f1246k0;
        Calendar a4 = z.a(bVar.f1219f.f1269f);
        a4.add(2, L0);
        a4.set(5, 1);
        Calendar a5 = z.a(a4);
        a5.get(2);
        a5.get(1);
        a5.getMaximum(7);
        a5.getActualMaximum(5);
        a5.getTimeInMillis();
        long timeInMillis = a5.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z.f1286a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.H(bVar.f1219f.d(rVar));
    }
}
