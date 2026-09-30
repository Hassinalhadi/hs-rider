package d2;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 0) {
            if (i3 != 1) {
                return false;
            }
            message.obj.getClass();
            a.b.c();
            return false;
        }
        message.obj.getClass();
        a.b.c();
        return false;
    }
}
