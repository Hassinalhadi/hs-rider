package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f438f;

    public n(p pVar) {
        this.f438f = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f438f;
        Dialog dialog = pVar.f458h0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
