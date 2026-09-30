package n;

import androidx.fragment.app.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f2568f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long[] f2569g;
    public /* synthetic */ Object[] h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f2570i;

    public h() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f2569g = new long[i6];
        this.h = new Object[i6];
    }

    public final void a() {
        int i3 = this.f2570i;
        Object[] objArr = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f2570i = 0;
        this.f2568f = false;
    }

    public final Object b(long j3) {
        Object obj;
        int b3 = o.a.b(this.f2569g, this.f2570i, j3);
        if (b3 >= 0 && (obj = this.h[b3]) != i.f2571a) {
            return obj;
        }
        return null;
    }

    public final long c(int i3) {
        int i4;
        if (i3 >= 0 && i3 < (i4 = this.f2570i)) {
            if (this.f2568f) {
                long[] jArr = this.f2569g;
                Object[] objArr = this.h;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj = objArr[i6];
                    if (obj != i.f2571a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f2568f = false;
                this.f2570i = i5;
            }
            return this.f2569g[i3];
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        h hVar = (h) clone;
        hVar.f2569g = (long[]) this.f2569g.clone();
        hVar.h = (Object[]) this.h.clone();
        return hVar;
    }

    public final void d(long j3, Object obj) {
        Object obj2 = i.f2571a;
        int b3 = o.a.b(this.f2569g, this.f2570i, j3);
        if (b3 >= 0) {
            this.h[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f2570i;
        if (i3 < i4) {
            Object[] objArr = this.h;
            if (objArr[i3] == obj2) {
                this.f2569g[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f2568f) {
            long[] jArr = this.f2569g;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f2568f = false;
                this.f2570i = i5;
                i3 = ~o.a.b(this.f2569g, i5, j3);
            }
        }
        int i7 = this.f2570i;
        if (i7 >= this.f2569g.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            this.f2569g = Arrays.copyOf(this.f2569g, i11);
            this.h = Arrays.copyOf(this.h, i11);
        }
        int i12 = this.f2570i - i3;
        if (i12 != 0) {
            long[] jArr2 = this.f2569g;
            int i13 = i3 + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i3, jArr2, i13, i12);
            Object[] objArr3 = this.h;
            k2.c.h0(objArr3, objArr3, i13, i3, this.f2570i);
        }
        this.f2569g[i3] = j3;
        this.h[i3] = obj;
        this.f2570i++;
    }

    public final int e() {
        if (this.f2568f) {
            int i3 = this.f2570i;
            long[] jArr = this.f2569g;
            Object[] objArr = this.h;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != i.f2571a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f2568f = false;
            this.f2570i = i4;
        }
        return this.f2570i;
    }

    public final Object f(int i3) {
        int i4;
        if (i3 >= 0 && i3 < (i4 = this.f2570i)) {
            if (this.f2568f) {
                long[] jArr = this.f2569g;
                Object[] objArr = this.h;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj = objArr[i6];
                    if (obj != i.f2571a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f2568f = false;
                this.f2570i = i5;
            }
            return this.h[i3];
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2570i * 28);
        sb.append('{');
        int i3 = this.f2570i;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(c(i4));
            sb.append('=');
            Object f3 = f(i4);
            if (f3 != sb) {
                sb.append(f3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
