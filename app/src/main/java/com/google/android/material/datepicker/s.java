package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.logistics.rider.lsposed.R;
import java.util.Calendar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends BaseAdapter {
    public static final int d = z.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f1275e = (z.c(null).getMaximum(7) + z.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final r f1276a;

    /* renamed from: b, reason: collision with root package name */
    public c f1277b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1278c;

    public s(r rVar, b bVar) {
        this.f1276a = rVar;
        this.f1278c = bVar;
        throw null;
    }

    public final int a() {
        int i3 = this.f1278c.f1222j;
        r rVar = this.f1276a;
        Calendar calendar = rVar.f1269f;
        int i4 = calendar.get(7);
        if (i3 <= 0) {
            i3 = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - i3;
        if (i5 < 0) {
            return i5 + rVar.f1271i;
        }
        return i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i3) {
        if (i3 >= a() && i3 <= c()) {
            int a3 = (i3 - a()) + 1;
            Calendar a4 = z.a(this.f1276a.f1269f);
            a4.set(5, a3);
            return Long.valueOf(a4.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f1276a.f1272j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1275e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3 / this.f1276a.f1271i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1277b == null) {
            this.f1277b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a3 = i3 - a();
        if (a3 >= 0) {
            r rVar = this.f1276a;
            if (a3 < rVar.f1272j) {
                textView.setTag(rVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a3 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i3) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                z.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i3) == null) {
            textView.getContext();
            z.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
