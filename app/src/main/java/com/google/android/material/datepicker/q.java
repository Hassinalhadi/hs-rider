package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q<S> extends w {
    public int Z;
    public b a0;

    @Override // androidx.fragment.app.u
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f495k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.a0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            a.b.c();
        }
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.Z));
        throw null;
    }

    @Override // androidx.fragment.app.u
    public final void w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
    }
}
