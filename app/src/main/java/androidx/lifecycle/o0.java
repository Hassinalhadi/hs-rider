package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f576a = new LinkedHashMap();

    public final void a() {
        for (l0 l0Var : this.f576a.values()) {
            l0Var.getClass();
            HashMap hashMap = l0Var.f566a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = l0Var.f566a.values().iterator();
                        while (it.hasNext()) {
                            l0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = l0Var.f567b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l0Var.f567b.iterator();
                        while (it2.hasNext()) {
                            l0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            l0Var.b();
        }
        this.f576a.clear();
    }
}
