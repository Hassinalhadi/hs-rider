package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
