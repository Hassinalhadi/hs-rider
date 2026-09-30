package z1;

import android.graphics.Typeface;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends b0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3352f;

    public b(d dVar, h hVar) {
        this.f3352f = dVar;
        this.f3351e = hVar;
    }

    @Override // b0.b
    public final void g(int i3) {
        this.f3352f.f3367n = true;
        this.f3351e.G(i3);
    }

    @Override // b0.b
    public final void h(Typeface typeface) {
        d dVar = this.f3352f;
        Typeface create = Typeface.create(typeface, dVar.d);
        dVar.f3369p = create;
        dVar.f3367n = true;
        this.f3351e.H(create, false);
    }
}
