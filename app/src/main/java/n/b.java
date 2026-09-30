package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements Iterator, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public int f2554f;

    /* renamed from: g, reason: collision with root package name */
    public int f2555g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2557j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i3) {
        this(fVar.h);
        this.f2556i = i3;
        switch (i3) {
            case 1:
                this.f2557j = fVar;
                this(fVar.h);
                return;
            default:
                this.f2557j = fVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2555g < this.f2554f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f3;
        if (hasNext()) {
            int i3 = this.f2555g;
            switch (this.f2556i) {
                case 0:
                    f3 = ((f) this.f2557j).f(i3);
                    break;
                case 1:
                    f3 = ((f) this.f2557j).i(i3);
                    break;
                default:
                    f3 = ((g) this.f2557j).f2567g[i3];
                    break;
            }
            this.f2555g++;
            this.h = true;
            return f3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.h) {
            int i3 = this.f2555g - 1;
            this.f2555g = i3;
            switch (this.f2556i) {
                case 0:
                    ((f) this.f2557j).g(i3);
                    break;
                case 1:
                    ((f) this.f2557j).g(i3);
                    break;
                default:
                    ((g) this.f2557j).a(i3);
                    break;
            }
            this.f2554f--;
            this.h = false;
            return;
        }
        a.b.i("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.h);
        this.f2556i = 2;
        this.f2557j = gVar;
    }

    public b(int i3) {
        this.f2554f = i3;
    }
}
