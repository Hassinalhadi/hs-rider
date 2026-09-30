package e2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends b2.h {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f1426r;

    public f(f fVar) {
        super(fVar);
        this.f1426r = fVar.f1426r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.j, e2.g, android.graphics.drawable.Drawable] */
    @Override // b2.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? jVar = new b2.j(this);
        jVar.I = this;
        jVar.invalidateSelf();
        return jVar;
    }

    public f(b2.n nVar, RectF rectF) {
        super(nVar);
        this.f1426r = rectF;
    }
}
