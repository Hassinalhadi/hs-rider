package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import b1.c1;
import com.logistics.rider.lsposed.R;
import j0.j0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u extends c1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1281u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1282v;

    public u(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1281u = textView;
        WeakHashMap weakHashMap = j0.f2160a;
        new j0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 1).d(textView, Boolean.TRUE);
        this.f1282v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z2) {
            textView.setVisibility(8);
        }
    }
}
