package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f302a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f303b;

    /* renamed from: c, reason: collision with root package name */
    public v f304c;
    public v d;

    /* renamed from: e, reason: collision with root package name */
    public int f305e;

    /* renamed from: f, reason: collision with root package name */
    public int f306f;

    public r(v vVar) {
        this.f303b = vVar;
        this.f304c = vVar;
    }

    public final void a() {
        this.f302a = 1;
        this.f304c = this.f303b;
        this.f306f = 0;
    }

    public final boolean b() {
        r0.a b3 = this.f304c.f319b.b();
        int a3 = b3.a(6);
        if ((a3 != 0 && ((ByteBuffer) b3.d).get(a3 + b3.f2190a) != 0) || this.f305e == 65039) {
            return true;
        }
        return false;
    }
}
