package k;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2 f2407f;

    public t1(a2 a2Var) {
        this.f2407f = a2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        n1 n1Var;
        if (i3 != -1 && (n1Var = this.f2407f.h) != null) {
            n1Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
