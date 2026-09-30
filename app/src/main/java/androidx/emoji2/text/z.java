package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f327a;

    /* renamed from: b, reason: collision with root package name */
    public final w f328b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f329c = 0;

    public z(w wVar, int i3) {
        this.f328b = wVar;
        this.f327a = i3;
    }

    public final int a(int i3) {
        r0.a b3 = b();
        int a3 = b3.a(16);
        if (a3 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b3.d;
            int i4 = a3 + b3.f2190a;
            return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [j0.z, java.lang.Object] */
    public final r0.a b() {
        ThreadLocal threadLocal = d;
        r0.a aVar = (r0.a) threadLocal.get();
        r0.a aVar2 = aVar;
        if (aVar == null) {
            ?? zVar = new j0.z();
            threadLocal.set(zVar);
            aVar2 = zVar;
        }
        r0.b bVar = (r0.b) this.f328b.f320f;
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i3 = a3 + bVar.f2190a;
            int i4 = (this.f327a * 4) + ((ByteBuffer) bVar.d).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) bVar.d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar2.d = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f2190a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                aVar2.f2191b = i6;
                aVar2.f2192c = ((ByteBuffer) aVar2.d).getShort(i6);
                return aVar2;
            }
            aVar2.f2190a = 0;
            aVar2.f2191b = 0;
            aVar2.f2192c = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i3;
        int i4;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        r0.a b3 = b();
        int a3 = b3.a(4);
        if (a3 != 0) {
            i3 = ((ByteBuffer) b3.d).getInt(a3 + b3.f2190a);
        } else {
            i3 = 0;
        }
        sb.append(Integer.toHexString(i3));
        sb.append(", codepoints:");
        r0.a b4 = b();
        int a4 = b4.a(16);
        if (a4 != 0) {
            int i5 = a4 + b4.f2190a;
            i4 = ((ByteBuffer) b4.d).getInt(((ByteBuffer) b4.d).getInt(i5) + i5);
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
