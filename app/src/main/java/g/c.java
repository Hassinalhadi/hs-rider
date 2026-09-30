package g;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1654a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != -3 && i3 != -2 && i3 != -1) {
            if (i3 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
            return;
        }
        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1654a.get(), message.what);
    }
}
