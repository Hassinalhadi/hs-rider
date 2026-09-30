package g1;

import android.graphics.Paint;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends l {
    public b0.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f1825e;

    /* renamed from: f, reason: collision with root package name */
    public b0.d f1826f;

    /* renamed from: g, reason: collision with root package name */
    public float f1827g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1828i;

    /* renamed from: j, reason: collision with root package name */
    public float f1829j;

    /* renamed from: k, reason: collision with root package name */
    public float f1830k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f1831l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f1832m;

    /* renamed from: n, reason: collision with root package name */
    public float f1833n;

    @Override // g1.k
    public final boolean a() {
        if (!this.f1826f.c() && !this.d.c()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // g1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            b0.d r0 = r5.f1826f
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f679c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.f677a
            if (r1 == r4) goto L1e
            r0.f677a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            b0.d r5 = r5.d
            boolean r1 = r5.c()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.f679c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.f677a
            if (r6 == r1) goto L3a
            r5.f677a = r6
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f1826f.f677a;
    }

    public float getStrokeAlpha() {
        return this.f1827g;
    }

    public int getStrokeColor() {
        return this.d.f677a;
    }

    public float getStrokeWidth() {
        return this.f1825e;
    }

    public float getTrimPathEnd() {
        return this.f1829j;
    }

    public float getTrimPathOffset() {
        return this.f1830k;
    }

    public float getTrimPathStart() {
        return this.f1828i;
    }

    public void setFillAlpha(float f3) {
        this.h = f3;
    }

    public void setFillColor(int i3) {
        this.f1826f.f677a = i3;
    }

    public void setStrokeAlpha(float f3) {
        this.f1827g = f3;
    }

    public void setStrokeColor(int i3) {
        this.d.f677a = i3;
    }

    public void setStrokeWidth(float f3) {
        this.f1825e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f1829j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f1830k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f1828i = f3;
    }
}
