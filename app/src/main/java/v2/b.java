package v2;

import a.c0;
import a.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Iterator, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public Object f3187f;

    /* renamed from: g, reason: collision with root package name */
    public int f3188g = -2;
    public final /* synthetic */ c h;

    public b(c cVar) {
        this.h = cVar;
    }

    public final void a() {
        Object a3;
        int i3 = this.f3188g;
        c cVar = this.h;
        if (i3 == -2) {
            a3 = cVar.f3189a.a();
        } else {
            c0 c0Var = cVar.f3190b;
            this.f3187f.getClass();
            a3 = ((x) c0Var.f9f).a();
        }
        this.f3187f = a3;
        this.f3188g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3188g < 0) {
            a();
        }
        if (this.f3188g == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3188g < 0) {
            a();
        }
        if (this.f3188g != 0) {
            Object obj = this.f3187f;
            obj.getClass();
            this.f3188g = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
