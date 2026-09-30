package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.logistics.rider.lsposed.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1230c;

    public e() {
        Calendar c3 = z.c(null);
        this.f1228a = c3;
        this.f1229b = c3.getMaximum(7);
        this.f1230c = c3.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1229b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        int i4 = this.f1229b;
        if (i3 >= i4) {
            return null;
        }
        int i5 = i3 + this.f1230c;
        if (i5 > i4) {
            i5 -= i4;
        }
        return Integer.valueOf(i5);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i3 + this.f1230c;
        int i5 = this.f1229b;
        if (i4 > i5) {
            i4 -= i5;
        }
        Calendar calendar = this.f1228a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i3) {
        Calendar c3 = z.c(null);
        this.f1228a = c3;
        this.f1229b = c3.getMaximum(7);
        this.f1230c = i3;
    }
}
