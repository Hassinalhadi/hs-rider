package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.d;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3259b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public int f3260a;

    public a(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        Object obj = f3259b.get(this);
        if (obj == x2.a.f3279a) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i3;
        if (obj == null) {
            obj = x2.a.f3279a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3259b;
            if (d.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f3260a;
            if ((i4 & 1) == 0) {
                int i5 = i4 + 1;
                this.f3260a = i5;
                while (true) {
                    synchronized (this) {
                        i3 = this.f3260a;
                        if (i3 == i5) {
                            this.f3260a = i5 + 1;
                            return;
                        }
                    }
                    i5 = i3;
                }
            } else {
                this.f3260a = i4 + 2;
            }
        }
    }
}
