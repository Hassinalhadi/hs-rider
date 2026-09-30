package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, int i3, int i4) {
        super(i3);
        this.F = mVar;
        this.E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(z0 z0Var, int[] iArr) {
        m mVar = this.F;
        RecyclerView recyclerView = mVar.f1241f0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = mVar.f1241f0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = mVar.f1241f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void y0(RecyclerView recyclerView, int i3) {
        x xVar = new x(recyclerView.getContext());
        xVar.f938a = i3;
        z0(xVar);
    }
}
