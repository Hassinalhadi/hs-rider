package androidx.emoji2.text;

import android.os.Trace;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f286k != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                j.a().c();
            }
        } finally {
            Trace.endSection();
        }
    }
}
