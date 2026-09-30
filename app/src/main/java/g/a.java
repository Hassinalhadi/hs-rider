package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1630g;

    public a(b bVar, e eVar) {
        this.f1630g = bVar;
        this.f1629f = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        b bVar = this.f1630g;
        DialogInterface.OnClickListener onClickListener = bVar.h;
        e eVar = this.f1629f;
        onClickListener.onClick(eVar.f1682b, i3);
        if (!bVar.f1638i) {
            eVar.f1682b.dismiss();
        }
    }
}
