package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t0 extends Writer {

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f490g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f489f = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f490g;
        if (sb.length() > 0) {
            Log.d(this.f489f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                a();
            } else {
                this.f490g.append(c3);
            }
        }
    }
}
