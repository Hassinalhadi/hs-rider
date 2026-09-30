package z1;

import android.graphics.Typeface;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f3348a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.b f3349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3350c;

    public a(w1.b bVar, Typeface typeface) {
        this.f3348a = typeface;
        this.f3349b = bVar;
    }

    @Override // k2.h
    public final void G(int i3) {
        if (!this.f3350c) {
            w1.c cVar = (w1.c) this.f3349b.f3195f;
            if (cVar.l(this.f3348a)) {
                cVar.j(false);
            }
        }
    }

    @Override // k2.h
    public final void H(Typeface typeface, boolean z2) {
        if (!this.f3350c) {
            w1.c cVar = (w1.c) this.f3349b.f3195f;
            if (cVar.l(typeface)) {
                cVar.j(false);
            }
        }
    }
}
