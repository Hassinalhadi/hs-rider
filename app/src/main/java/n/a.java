package n;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2553f;

    public a(f fVar) {
        this.f2553f = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f2553f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2553f.h;
    }
}
