package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b1.c1;
import b1.e0;
import com.logistics.rider.lsposed.R;
import java.util.Locale;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 extends e0 {
    public final m d;

    public b0(m mVar) {
        this.d = mVar;
    }

    @Override // b1.e0
    public final int a() {
        return this.d.a0.f1223k;
    }

    @Override // b1.e0
    public final void c(c1 c1Var, int i3) {
        String format;
        m mVar = this.d;
        int i4 = mVar.a0.f1219f.h + i3;
        TextView textView = ((a0) c1Var).f1218u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i4)));
        Context context = textView.getContext();
        if (z.b().get(1) == i4) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4));
        }
        textView.setContentDescription(format);
        c cVar = mVar.f1240d0;
        if (z.b().get(1) == i4) {
            b2.f fVar = cVar.f1226b;
        } else {
            b2.f fVar2 = cVar.f1225a;
        }
        throw null;
    }

    @Override // b1.e0
    public final c1 d(ViewGroup viewGroup) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
