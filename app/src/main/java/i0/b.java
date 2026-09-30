package i0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1967a;

    /* renamed from: b, reason: collision with root package name */
    public int f1968b;

    public b(int i3) {
        if (i3 > 0) {
            this.f1967a = new Object[i3];
        } else {
            a.b.m("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i3 = this.f1968b;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object[] objArr = this.f1967a;
        Object obj = objArr[i4];
        obj.getClass();
        objArr[i4] = null;
        this.f1968b--;
        return obj;
    }

    public void b(q.b bVar) {
        int i3 = this.f1968b;
        Object[] objArr = this.f1967a;
        if (i3 < objArr.length) {
            objArr[i3] = bVar;
            this.f1968b = i3 + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i3 = this.f1968b;
        int i4 = 0;
        while (true) {
            Object[] objArr = this.f1967a;
            if (i4 < i3) {
                if (objArr[i4] != obj) {
                    i4++;
                } else {
                    a.b.i("Already in the pool!");
                    return false;
                }
            } else {
                int i5 = this.f1968b;
                if (i5 >= objArr.length) {
                    return false;
                }
                objArr[i5] = obj;
                this.f1968b = i5 + 1;
                return true;
            }
        }
    }

    public b() {
        this.f1967a = new Object[256];
    }
}
