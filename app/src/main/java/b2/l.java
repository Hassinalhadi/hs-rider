package b2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l extends a.y {
    @Override // a.y
    public final void A(w wVar, float f3, float f4) {
        float f5 = f4 * f3;
        wVar.d(f5, 180.0f, 90.0f);
        float f6 = f5 * 2.0f;
        s sVar = new s(0.0f, 0.0f, f6, f6);
        sVar.f1056f = 180.0f;
        sVar.f1057g = 90.0f;
        wVar.f1065f.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.f1066g.add(qVar);
        wVar.d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d = 270.0f;
        wVar.f1062b = (((float) Math.cos(Math.toRadians(d))) * f8) + f7;
        wVar.f1063c = (f8 * ((float) Math.sin(Math.toRadians(d)))) + f7;
    }
}
