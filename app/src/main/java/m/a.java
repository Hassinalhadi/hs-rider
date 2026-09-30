package m;

import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2512j = new HashMap();

    @Override // m.f
    public final c a(Object obj) {
        return (c) this.f2512j.get(obj);
    }

    @Override // m.f
    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.f2512j.remove(obj);
        return b3;
    }
}
