package v2;

import a.c0;
import a.x;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final x f3189a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f3190b;

    public c(x xVar, c0 c0Var) {
        this.f3189a = xVar;
        this.f3190b = c0Var;
    }

    @Override // v2.d
    public final Iterator iterator() {
        return new b(this);
    }
}
