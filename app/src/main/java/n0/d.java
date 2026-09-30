package n0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import k.n1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: w, reason: collision with root package name */
    public static final int f2584w = ViewConfiguration.getTapTimeout();

    /* renamed from: f, reason: collision with root package name */
    public final a f2585f;

    /* renamed from: g, reason: collision with root package name */
    public final AccelerateInterpolator f2586g;
    public final n1 h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.fragment.app.g f2587i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f2588j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f2589k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2590l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2591m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f2592n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f2593o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f2594p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2595q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2596r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2597s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2598t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2599u;

    /* renamed from: v, reason: collision with root package name */
    public final n1 f2600v;

    /* JADX WARN: Type inference failed for: r0v0, types: [n0.a, java.lang.Object] */
    public d(n1 n1Var) {
        ?? obj = new Object();
        obj.f2580e = Long.MIN_VALUE;
        obj.f2582g = -1L;
        obj.f2581f = 0L;
        this.f2585f = obj;
        this.f2586g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2588j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2589k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2592n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2593o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2594p = fArr5;
        this.h = n1Var;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f2590l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2591m = f2584w;
        obj.f2577a = 500;
        obj.f2578b = 500;
        this.f2600v = n1Var;
    }

    public static float b(float f3, float f4, float f5) {
        if (f3 > f5) {
            return f5;
        }
        if (f3 < f4) {
            return f4;
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2588j
            r0 = r0[r4]
            float[] r1 = r3.f2589k
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f2586g
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f2592n
            r0 = r0[r4]
            float[] r1 = r3.f2593o
            r1 = r1[r4]
            float[] r3 = r3.f2594p
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 != 0.0f) {
            int i3 = this.f2590l;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2 && f3 < 0.0f) {
                    return f3 / (-f4);
                }
            } else if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f2598t && i3 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f2596r) {
            this.f2598t = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f2585f;
        int i4 = (int) (currentAnimationTimeMillis - aVar.f2580e);
        int i5 = aVar.f2578b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f2583i = i3;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f2582g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        n1 n1Var;
        int count;
        a aVar = this.f2585f;
        float f3 = aVar.d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f2579c);
        if (abs != 0 && (count = (n1Var = this.f2600v).getCount()) != 0) {
            int childCount = n1Var.getChildCount();
            int firstVisiblePosition = n1Var.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && n1Var.getChildAt(0).getTop() >= 0)) : !(i3 >= count && n1Var.getChildAt(childCount - 1).getBottom() <= n1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f2599u
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f2597s = r2
            r7.f2595q = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            k.n1 r4 = r7.h
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            n0.a r9 = r7.f2585f
            r9.f2579c = r0
            r9.d = r8
            boolean r8 = r7.f2598t
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            androidx.fragment.app.g r8 = r7.f2587i
            if (r8 != 0) goto L62
            androidx.fragment.app.g r8 = new androidx.fragment.app.g
            r9 = 10
            r8.<init>(r9, r7)
            r7.f2587i = r8
        L62:
            r7.f2598t = r2
            r7.f2596r = r2
            boolean r8 = r7.f2595q
            if (r8 != 0) goto L77
            int r8 = r7.f2591m
            if (r8 <= 0) goto L77
            androidx.fragment.app.g r9 = r7.f2587i
            long r5 = (long) r8
            java.util.WeakHashMap r8 = j0.j0.f2160a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            androidx.fragment.app.g r8 = r7.f2587i
            r8.run()
        L7c:
            r7.f2595q = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
