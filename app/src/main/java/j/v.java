package j;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f2130f;

    public v(w wVar) {
        this.f2130f = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2130f.c();
    }
}
