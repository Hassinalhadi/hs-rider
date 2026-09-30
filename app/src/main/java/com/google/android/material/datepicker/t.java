package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f1280g;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1280g = vVar;
        this.f1279f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        MaterialCalendarGridView materialCalendarGridView = this.f1279f;
        s a3 = materialCalendarGridView.a();
        if (i3 >= a3.a() && i3 <= a3.c()) {
            if (materialCalendarGridView.a().getItem(i3).longValue() < ((m) this.f1280g.f1283e.f299g).a0.h.f1227f) {
            } else {
                throw null;
            }
        }
    }
}
