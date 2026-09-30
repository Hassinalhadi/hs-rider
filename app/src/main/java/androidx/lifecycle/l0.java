package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f567b = new LinkedHashSet();

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public void b() {
    }
}
