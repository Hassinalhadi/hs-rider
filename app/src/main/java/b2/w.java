package b2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f1061a;

    /* renamed from: b, reason: collision with root package name */
    public float f1062b;

    /* renamed from: c, reason: collision with root package name */
    public float f1063c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f1064e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1065f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1066g = new ArrayList();

    public w() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3) {
        float f4 = this.d;
        if (f4 != f3) {
            float f5 = ((f3 - f4) + 360.0f) % 360.0f;
            if (f5 > 180.0f) {
                return;
            }
            float f6 = this.f1062b;
            float f7 = this.f1063c;
            s sVar = new s(f6, f7, f6, f7);
            sVar.f1056f = this.d;
            sVar.f1057g = f5;
            this.f1066g.add(new q(sVar));
            this.d = f3;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1065f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((u) arrayList.get(i3)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.u, java.lang.Object, b2.t] */
    public final void c(float f3, float f4) {
        ?? uVar = new u();
        uVar.f1058b = f3;
        uVar.f1059c = f4;
        this.f1065f.add(uVar);
        r rVar = new r(uVar, this.f1062b, this.f1063c);
        float a3 = rVar.a() + 270.0f;
        float a4 = rVar.a() + 270.0f;
        a(a3);
        this.f1066g.add(rVar);
        this.d = a4;
        this.f1062b = f3;
        this.f1063c = f4;
    }

    public final void d(float f3, float f4, float f5) {
        this.f1061a = f3;
        this.f1062b = 0.0f;
        this.f1063c = f3;
        this.d = f4;
        this.f1064e = (f4 + f5) % 360.0f;
        this.f1065f.clear();
        this.f1066g.clear();
    }
}
