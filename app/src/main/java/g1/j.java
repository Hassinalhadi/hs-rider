package g1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1834a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1835b;

    /* renamed from: c, reason: collision with root package name */
    public float f1836c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f1837e;

    /* renamed from: f, reason: collision with root package name */
    public float f1838f;

    /* renamed from: g, reason: collision with root package name */
    public float f1839g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1840i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f1841j;

    /* renamed from: k, reason: collision with root package name */
    public String f1842k;

    /* JADX WARN: Type inference failed for: r4v5, types: [g1.l, g1.i] */
    public j(j jVar, n.f fVar) {
        l lVar;
        this.f1834a = new Matrix();
        this.f1835b = new ArrayList();
        this.f1836c = 0.0f;
        this.d = 0.0f;
        this.f1837e = 0.0f;
        this.f1838f = 1.0f;
        this.f1839g = 1.0f;
        this.h = 0.0f;
        this.f1840i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1841j = matrix;
        this.f1842k = null;
        this.f1836c = jVar.f1836c;
        this.d = jVar.d;
        this.f1837e = jVar.f1837e;
        this.f1838f = jVar.f1838f;
        this.f1839g = jVar.f1839g;
        this.h = jVar.h;
        this.f1840i = jVar.f1840i;
        String str = jVar.f1842k;
        this.f1842k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f1841j);
        ArrayList arrayList = jVar.f1835b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof j) {
                this.f1835b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f1825e = 0.0f;
                    lVar2.f1827g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f1828i = 0.0f;
                    lVar2.f1829j = 1.0f;
                    lVar2.f1830k = 0.0f;
                    lVar2.f1831l = Paint.Cap.BUTT;
                    lVar2.f1832m = Paint.Join.MITER;
                    lVar2.f1833n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f1825e = iVar.f1825e;
                    lVar2.f1827g = iVar.f1827g;
                    lVar2.f1826f = iVar.f1826f;
                    lVar2.f1845c = iVar.f1845c;
                    lVar2.h = iVar.h;
                    lVar2.f1828i = iVar.f1828i;
                    lVar2.f1829j = iVar.f1829j;
                    lVar2.f1830k = iVar.f1830k;
                    lVar2.f1831l = iVar.f1831l;
                    lVar2.f1832m = iVar.f1832m;
                    lVar2.f1833n = iVar.f1833n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    a.b.i("Unknown object in the tree!");
                    throw null;
                }
                this.f1835b.add(lVar);
                Object obj2 = lVar.f1844b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }

    @Override // g1.k
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1835b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // g1.k
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f1835b;
            if (i3 < arrayList.size()) {
                z2 |= ((k) arrayList.get(i3)).b(iArr);
                i3++;
            } else {
                return z2;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f1841j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f1837e);
        matrix.postScale(this.f1838f, this.f1839g);
        matrix.postRotate(this.f1836c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f1840i + this.f1837e);
    }

    public String getGroupName() {
        return this.f1842k;
    }

    public Matrix getLocalMatrix() {
        return this.f1841j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f1837e;
    }

    public float getRotation() {
        return this.f1836c;
    }

    public float getScaleX() {
        return this.f1838f;
    }

    public float getScaleY() {
        return this.f1839g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f1840i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.d) {
            this.d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f1837e) {
            this.f1837e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f1836c) {
            this.f1836c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f1838f) {
            this.f1838f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f1839g) {
            this.f1839g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.h) {
            this.h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f1840i) {
            this.f1840i = f3;
            c();
        }
    }

    public j() {
        this.f1834a = new Matrix();
        this.f1835b = new ArrayList();
        this.f1836c = 0.0f;
        this.d = 0.0f;
        this.f1837e = 0.0f;
        this.f1838f = 1.0f;
        this.f1839g = 1.0f;
        this.h = 0.0f;
        this.f1840i = 0.0f;
        this.f1841j = new Matrix();
        this.f1842k = null;
    }
}
