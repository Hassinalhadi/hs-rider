package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k0 implements p0, DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public g.g f2308f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f2309g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0 f2310i;

    public k0(q0 q0Var) {
        this.f2310i = q0Var;
    }

    @Override // k.p0
    public final void a(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // k.p0
    public final boolean b() {
        g.g gVar = this.f2308f;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // k.p0
    public final int d() {
        return 0;
    }

    @Override // k.p0
    public final void dismiss() {
        g.g gVar = this.f2308f;
        if (gVar != null) {
            gVar.dismiss();
            this.f2308f = null;
        }
    }

    @Override // k.p0
    public final void e(int i3, int i4) {
        if (this.f2309g == null) {
            return;
        }
        q0 q0Var = this.f2310i;
        g.f fVar = new g.f(q0Var.getPopupContext());
        g.b bVar = (g.b) fVar.f1706g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        l0 l0Var = this.f2309g;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.f1637g = l0Var;
        bVar.h = this;
        bVar.f1639j = selectedItemPosition;
        bVar.f1638i = true;
        g.g a3 = fVar.a();
        this.f2308f = a3;
        AlertController$RecycleListView alertController$RecycleListView = a3.f1713l.f1684e;
        alertController$RecycleListView.setTextDirection(i3);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f2308f.show();
    }

    @Override // k.p0
    public final int g() {
        return 0;
    }

    @Override // k.p0
    public final Drawable h() {
        return null;
    }

    @Override // k.p0
    public final CharSequence i() {
        return this.h;
    }

    @Override // k.p0
    public final void l(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // k.p0
    public final void m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // k.p0
    public final void n(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // k.p0
    public final void o(ListAdapter listAdapter) {
        this.f2309g = (l0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        q0 q0Var = this.f2310i;
        q0Var.setSelection(i3);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i3, this.f2309g.getItemId(i3));
        }
        dismiss();
    }

    @Override // k.p0
    public final void p(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
