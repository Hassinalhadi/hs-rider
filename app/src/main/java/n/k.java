package n;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int[] f2575f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object[] f2576g;
    public /* synthetic */ int h;

    public k() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f2575f = new int[i6];
        this.f2576g = new Object[i6];
    }

    public final void a(int i3, ColorStateList colorStateList) {
        int i4 = this.h;
        if (i4 != 0 && i3 <= this.f2575f[i4 - 1]) {
            b(i3, colorStateList);
            return;
        }
        if (i4 >= this.f2575f.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.f2575f = Arrays.copyOf(this.f2575f, i8);
            this.f2576g = Arrays.copyOf(this.f2576g, i8);
        }
        this.f2575f[i4] = i3;
        this.f2576g[i4] = colorStateList;
        this.h = i4 + 1;
    }

    public final void b(int i3, Object obj) {
        int a3 = o.a.a(this.h, i3, this.f2575f);
        if (a3 >= 0) {
            this.f2576g[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.h;
        if (i4 < i5) {
            Object[] objArr = this.f2576g;
            if (objArr[i4] == i.f2572b) {
                this.f2575f[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f2575f.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            this.f2575f = Arrays.copyOf(this.f2575f, i9);
            this.f2576g = Arrays.copyOf(this.f2576g, i9);
        }
        int i10 = this.h;
        if (i10 - i4 != 0) {
            int[] iArr = this.f2575f;
            int i11 = i4 + 1;
            k2.c.g0(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f2576g;
            k2.c.h0(objArr2, objArr2, i11, i4, this.h);
        }
        this.f2575f[i4] = i3;
        this.f2576g[i4] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        k kVar = (k) clone;
        kVar.f2575f = (int[]) this.f2575f.clone();
        kVar.f2576g = (Object[]) this.f2576g.clone();
        return kVar;
    }

    public final String toString() {
        int i3 = this.h;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i4 = this.h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2575f[i5]);
            sb.append('=');
            Object obj = this.f2576g[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
