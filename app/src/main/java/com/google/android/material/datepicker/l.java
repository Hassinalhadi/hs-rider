package com.google.android.material.datepicker;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.logistics.rider.lsposed.R;
import k.t2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1237g;

    public /* synthetic */ l(int i3, Object obj) {
        this.f1236f = i3;
        this.f1237g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.o oVar;
        switch (this.f1236f) {
            case 0:
                m mVar = (m) this.f1237g;
                int i3 = mVar.f1239c0;
                if (i3 == 2) {
                    mVar.G(1);
                    mVar.f1241f0.announceForAccessibility(mVar.B().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i3 == 1) {
                        mVar.G(2);
                        mVar.e0.announceForAccessibility(mVar.B().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 1:
                g.e eVar = (g.e) this.f1237g;
                eVar.f1700v.obtainMessage(1, eVar.f1682b).sendToTarget();
                return;
            case 2:
                ((i.a) this.f1237g).a();
                return;
            default:
                t2 t2Var = ((Toolbar) this.f1237g).Q;
                if (t2Var == null) {
                    oVar = null;
                } else {
                    oVar = t2Var.f2409g;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
