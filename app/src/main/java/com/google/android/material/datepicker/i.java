package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.k0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends k0 {
    @Override // b1.k0
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof b0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
