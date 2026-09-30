package e2;

import android.view.View;
import android.widget.AdapterView;
import k.a2;
import k.n0;
import k.q0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1505g;

    public /* synthetic */ v(int i3, Object obj) {
        this.f1504f = i3;
        this.f1505g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        switch (this.f1504f) {
            case 0:
                x xVar = (x) this.f1505g;
                a2 a2Var = xVar.f1509j;
                if (i3 < 0) {
                    if (!a2Var.E.isShowing()) {
                        item = null;
                    } else {
                        item = a2Var.h.getSelectedItem();
                    }
                } else {
                    item = xVar.getAdapter().getItem(i3);
                }
                convertSelectionToString = xVar.convertSelectionToString(item);
                xVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i3 < 0) {
                        if (!a2Var.E.isShowing()) {
                            view = null;
                        } else {
                            view = a2Var.h.getSelectedView();
                        }
                        if (!a2Var.E.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = a2Var.h.getSelectedItemPosition();
                        }
                        i3 = selectedItemPosition;
                        if (!a2Var.E.isShowing()) {
                            j3 = Long.MIN_VALUE;
                        } else {
                            j3 = a2Var.h.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(a2Var.h, view, i3, j3);
                }
                a2Var.dismiss();
                return;
            default:
                n0 n0Var = (n0) this.f1505g;
                q0 q0Var = n0Var.J;
                q0Var.setSelection(i3);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i3, n0Var.G.getItemId(i3));
                }
                n0Var.dismiss();
                return;
        }
    }
}
