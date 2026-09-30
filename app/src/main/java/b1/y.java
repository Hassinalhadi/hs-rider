package b1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public int f938a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f939b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f940c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f941e;

    /* renamed from: f, reason: collision with root package name */
    public View f942f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f943g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f944i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f945j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f946k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f947l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f948m;

    /* renamed from: n, reason: collision with root package name */
    public float f949n;

    /* renamed from: o, reason: collision with root package name */
    public int f950o;

    /* renamed from: p, reason: collision with root package name */
    public int f951p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b1.x0] */
    public y(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f936f = false;
        obj.f937g = 0;
        obj.f932a = 0;
        obj.f933b = 0;
        obj.f934c = Integer.MIN_VALUE;
        obj.f935e = null;
        this.f943g = obj;
        this.f944i = new LinearInterpolator();
        this.f945j = new DecelerateInterpolator();
        this.f948m = false;
        this.f950o = 0;
        this.f951p = 0;
        this.f947l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i3, int i4, int i5, int i6, int i7) {
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 == 1) {
                    return i6 - i4;
                }
                a.b.m("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i8 = i5 - i3;
            if (i8 > 0) {
                return i8;
            }
            int i9 = i6 - i4;
            if (i9 < 0) {
                return i9;
            }
            return 0;
        }
        return i5 - i3;
    }

    public int b(View view, int i3) {
        n0 n0Var = this.f940c;
        if (n0Var != null && n0Var.d()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return a((view.getLeft() - ((o0) view.getLayoutParams()).f878b.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, view.getRight() + ((o0) view.getLayoutParams()).f878b.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, n0Var.E(), n0Var.f874n - n0Var.F(), i3);
        }
        return 0;
    }

    public int c(View view, int i3) {
        n0 n0Var = this.f940c;
        if (n0Var != null && n0Var.e()) {
            o0 o0Var = (o0) view.getLayoutParams();
            return a((view.getTop() - ((o0) view.getLayoutParams()).f878b.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getBottom() + ((o0) view.getLayoutParams()).f878b.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, n0Var.G(), n0Var.f875o - n0Var.D(), i3);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i3) {
        float abs = Math.abs(i3);
        if (!this.f948m) {
            this.f949n = d(this.f947l);
            this.f948m = true;
        }
        return (int) Math.ceil(abs * this.f949n);
    }

    public PointF f(int i3) {
        Object obj = this.f940c;
        if (obj instanceof y0) {
            return ((y0) obj).a(i3);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + y0.class.getCanonicalName());
        return null;
    }

    public final void g(int i3, int i4) {
        PointF f3;
        RecyclerView recyclerView = this.f939b;
        int i5 = -1;
        if (this.f938a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f942f == null && this.f940c != null && (f3 = f(this.f938a)) != null) {
            float f4 = f3.x;
            if (f4 != 0.0f || f3.y != 0.0f) {
                recyclerView.X((int) Math.signum(f4), (int) Math.signum(f3.y), null);
            }
        }
        boolean z2 = false;
        this.d = false;
        View view = this.f942f;
        x0 x0Var = this.f943g;
        if (view != null) {
            this.f939b.getClass();
            c1 I = RecyclerView.I(view);
            if (I != null) {
                i5 = I.b();
            }
            if (i5 == this.f938a) {
                View view2 = this.f942f;
                z0 z0Var = recyclerView.f618i0;
                h(view2, x0Var);
                x0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f942f = null;
            }
        }
        if (this.f941e) {
            z0 z0Var2 = recyclerView.f618i0;
            if (this.f939b.f633q.v() == 0) {
                i();
            } else {
                int i6 = this.f950o;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f950o = i7;
                int i8 = this.f951p;
                int i9 = i8 - i4;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f951p = i9;
                if (i7 == 0 && i9 == 0) {
                    PointF f5 = f(this.f938a);
                    if (f5 != null) {
                        if (f5.x != 0.0f || f5.y != 0.0f) {
                            float f6 = f5.y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (r10 * r10));
                            float f7 = f5.x / sqrt;
                            f5.x = f7;
                            float f8 = f5.y / sqrt;
                            f5.y = f8;
                            this.f946k = f5;
                            this.f950o = (int) (f7 * 10000.0f);
                            this.f951p = (int) (f8 * 10000.0f);
                            int e3 = e(10000);
                            x0Var.f932a = (int) (this.f950o * 1.2f);
                            x0Var.f933b = (int) (this.f951p * 1.2f);
                            x0Var.f934c = (int) (e3 * 1.2f);
                            x0Var.f935e = this.f944i;
                            x0Var.f936f = true;
                        }
                    }
                    x0Var.d = this.f938a;
                    i();
                }
            }
            if (x0Var.d >= 0) {
                z2 = true;
            }
            x0Var.a(recyclerView);
            if (z2 && this.f941e) {
                this.d = true;
                recyclerView.f613f0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, b1.x0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f946k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f946k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f932a = r0
            r8.f933b = r7
            r8.f934c = r1
            android.view.animation.DecelerateInterpolator r6 = r6.f945j
            r8.f935e = r6
            r8.f936f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.y.h(android.view.View, b1.x0):void");
    }

    public final void i() {
        if (!this.f941e) {
            return;
        }
        this.f941e = false;
        this.f951p = 0;
        this.f950o = 0;
        this.f946k = null;
        this.f939b.f618i0.f952a = -1;
        this.f942f = null;
        this.f938a = -1;
        this.d = false;
        n0 n0Var = this.f940c;
        if (n0Var.f866e == this) {
            n0Var.f866e = null;
        }
        this.f940c = null;
        this.f939b = null;
    }
}
