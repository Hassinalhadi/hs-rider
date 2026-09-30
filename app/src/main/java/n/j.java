package n;

import androidx.fragment.app.w0;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public int[] f2573f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2574g;
    public int h;

    public j(int i3) {
        int[] iArr;
        Object[] objArr;
        if (i3 == 0) {
            iArr = o.a.f2609a;
        } else {
            iArr = new int[i3];
        }
        this.f2573f = iArr;
        if (i3 == 0) {
            objArr = o.a.f2610b;
        } else {
            objArr = new Object[i3 << 1];
        }
        this.f2574g = objArr;
    }

    public final int a(Object obj) {
        int i3 = this.h * 2;
        Object[] objArr = this.f2574g;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i3) {
        int i4 = this.h;
        int[] iArr = this.f2573f;
        if (iArr.length < i3) {
            this.f2573f = Arrays.copyOf(iArr, i3);
            this.f2574g = Arrays.copyOf(this.f2574g, i3 * 2);
        }
        if (this.h == i4) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i3, Object obj) {
        int i4 = this.h;
        if (i4 == 0) {
            return -1;
        }
        int a3 = o.a.a(i4, i3, this.f2573f);
        if (a3 < 0 || p2.d.a(obj, this.f2574g[a3 << 1])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f2573f[i5] == i3) {
            if (p2.d.a(obj, this.f2574g[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f2573f[i6] == i3; i6--) {
            if (p2.d.a(obj, this.f2574g[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void clear() {
        if (this.h > 0) {
            this.f2573f = o.a.f2609a;
            this.f2574g = o.a.f2610b;
            this.h = 0;
        }
        if (this.h <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int a3 = o.a.a(i3, 0, this.f2573f);
        if (a3 < 0 || this.f2574g[a3 << 1] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f2573f[i4] == 0) {
            if (this.f2574g[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f2573f[i5] == 0; i5--) {
            if (this.f2574g[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i3 = this.h;
                if (i3 != ((j) obj).h) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object f3 = f(i4);
                    Object i5 = i(i4);
                    Object obj2 = jVar.get(f3);
                    if (i5 == null) {
                        if (obj2 != null || !jVar.containsKey(f3)) {
                            return false;
                        }
                    } else if (!i5.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.h;
            for (int i7 = 0; i7 < i6; i7++) {
                Object f4 = f(i7);
                Object i8 = i(i7);
                Object obj3 = ((Map) obj).get(f4);
                if (i8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f4)) {
                        return false;
                    }
                } else if (!i8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 >= 0 && i3 < this.h) {
            return this.f2574g[i3 << 1];
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public final Object g(int i3) {
        int i4;
        if (i3 >= 0 && i3 < (i4 = this.h)) {
            Object[] objArr = this.f2574g;
            int i5 = i3 << 1;
            Object obj = objArr[i5 + 1];
            if (i4 <= 1) {
                clear();
                return obj;
            }
            int i6 = i4 - 1;
            int[] iArr = this.f2573f;
            int i7 = 8;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                this.f2573f = Arrays.copyOf(iArr, i7);
                this.f2574g = Arrays.copyOf(this.f2574g, i7 << 1);
                if (i4 == this.h) {
                    if (i3 > 0) {
                        k2.c.g0(0, 0, i3, iArr, this.f2573f);
                        k2.c.h0(objArr, this.f2574g, 0, 0, i5);
                    }
                    if (i3 < i6) {
                        int i8 = i3 + 1;
                        k2.c.g0(i3, i8, i4, iArr, this.f2573f);
                        k2.c.h0(objArr, this.f2574g, i5, i8 << 1, i4 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i3 < i6) {
                    int i9 = i3 + 1;
                    k2.c.g0(i3, i9, i4, iArr, iArr);
                    Object[] objArr2 = this.f2574g;
                    k2.c.h0(objArr2, objArr2, i5, i9 << 1, i4 << 1);
                }
                Object[] objArr3 = this.f2574g;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i4 == this.h) {
                this.h = i6;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f2574g[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.f2574g[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i3, Object obj) {
        if (i3 >= 0 && i3 < this.h) {
            int i4 = (i3 << 1) + 1;
            Object[] objArr = this.f2574g;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public final int hashCode() {
        int i3;
        int[] iArr = this.f2573f;
        Object[] objArr = this.f2574g;
        int i4 = this.h;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            int i8 = iArr[i6];
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i7 += i3 ^ i8;
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final Object i(int i3) {
        if (i3 >= 0 && i3 < this.h) {
            return this.f2574g[(i3 << 1) + 1];
        }
        throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i3).toString());
    }

    public final boolean isEmpty() {
        if (this.h <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int e3;
        int i4 = this.h;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = 0;
        }
        if (obj != null) {
            e3 = c(i3, obj);
        } else {
            e3 = e();
        }
        if (e3 >= 0) {
            int i5 = (e3 << 1) + 1;
            Object[] objArr = this.f2574g;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~e3;
        int[] iArr = this.f2573f;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            this.f2573f = Arrays.copyOf(iArr, i7);
            this.f2574g = Arrays.copyOf(this.f2574g, i7 << 1);
            if (i4 != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.f2573f;
            int i8 = i6 + 1;
            k2.c.g0(i8, i6, i4, iArr2, iArr2);
            Object[] objArr2 = this.f2574g;
            k2.c.h0(objArr2, objArr2, i8 << 1, i6 << 1, this.h << 1);
        }
        int i9 = this.h;
        if (i4 == i9) {
            int[] iArr3 = this.f2573f;
            if (i6 < iArr3.length) {
                iArr3[i6] = i3;
                Object[] objArr3 = this.f2574g;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.h = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0 && p2.d.a(obj2, i(d))) {
            g(d);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d >= 0 && p2.d.a(obj2, i(d))) {
            h(d, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object f3 = f(i4);
            if (f3 != sb) {
                sb.append(f3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i5 = i(i4);
            if (i5 != sb) {
                sb.append(i5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }
}
