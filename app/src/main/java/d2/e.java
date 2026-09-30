package d2;

import android.os.Handler;
import android.os.Message;
import androidx.emoji2.text.m;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1407a;

    public e(m mVar) {
        this.f1407a = mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        m mVar = this.f1407a;
        if (message.obj != null) {
            a.b.c();
            return false;
        }
        synchronized (mVar.f299g) {
            throw null;
        }
    }
}
