package androidx.lifecycle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h0 implements o2.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f560f;

    public h0(p0 p0Var) {
        this.f560f = p0Var;
    }

    @Override // o2.a
    public final Object a() {
        w0.b bVar;
        ArrayList arrayList = new ArrayList();
        p2.b.f2705a.getClass();
        arrayList.add(new Object());
        w0.d[] dVarArr = (w0.d[]) arrayList.toArray(new w0.d[0]);
        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m(29, (w0.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        p0 p0Var = this.f560f;
        o0 e3 = p0Var.e();
        if (p0Var instanceof h) {
            bVar = ((h) p0Var).a();
        } else {
            bVar = w0.a.f3193b;
        }
        return (j0) new androidx.emoji2.text.s(e3, mVar, bVar).e("androidx.lifecycle.internal.SavedStateHandlesVM", j0.class);
    }

    public final String toString() {
        p2.b.f2705a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
