package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends k2.h {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2649a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2650b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2651c;
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2652e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2649a = atomicReferenceFieldUpdater;
        this.f2650b = atomicReferenceFieldUpdater2;
        this.f2651c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f2652e = atomicReferenceFieldUpdater5;
    }

    @Override // k2.h
    public final void N(f fVar, f fVar2) {
        this.f2650b.lazySet(fVar, fVar2);
    }

    @Override // k2.h
    public final void O(f fVar, Thread thread) {
        this.f2649a.lazySet(fVar, thread);
    }

    @Override // k2.h
    public final boolean e(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f2647b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // k2.h
    public final boolean f(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2652e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // k2.h
    public final boolean g(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2651c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
