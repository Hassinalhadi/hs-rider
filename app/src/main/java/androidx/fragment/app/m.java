package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f432f;

    public m(p pVar) {
        this.f432f = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVar = this.f432f;
        Dialog dialog = pVar.f458h0;
        if (dialog != null) {
            pVar.onCancel(dialog);
        }
    }
}
