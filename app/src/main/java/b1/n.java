package b1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n extends k0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final androidx.fragment.app.g B;

    /* renamed from: a, reason: collision with root package name */
    public final int f839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f840b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f841c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f843f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f844g;
    public final Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public final int f845i;

    /* renamed from: j, reason: collision with root package name */
    public final int f846j;

    /* renamed from: k, reason: collision with root package name */
    public int f847k;

    /* renamed from: l, reason: collision with root package name */
    public int f848l;

    /* renamed from: m, reason: collision with root package name */
    public float f849m;

    /* renamed from: n, reason: collision with root package name */
    public int f850n;

    /* renamed from: o, reason: collision with root package name */
    public int f851o;

    /* renamed from: p, reason: collision with root package name */
    public float f852p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f855s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f862z;

    /* renamed from: q, reason: collision with root package name */
    public int f853q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f854r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f856t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f857u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f858v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f859w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f860x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f861y = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    public n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f862z = ofFloat;
        this.A = 0;
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(3, this);
        this.B = gVar;
        k kVar = new k(this);
        this.f841c = stateListDrawable;
        this.d = drawable;
        this.f844g = stateListDrawable2;
        this.h = drawable2;
        this.f842e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f843f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f845i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f846j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f839a = i4;
        this.f840b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new l(this));
        ofFloat.addUpdateListener(new m(0 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f855s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f637s;
            n0 n0Var = recyclerView2.f633q;
            if (n0Var != null) {
                n0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f855s;
            recyclerView3.f639t.remove(this);
            if (recyclerView3.f641u == this) {
                recyclerView3.f641u = null;
            }
            ArrayList arrayList2 = this.f855s.f622k0;
            if (arrayList2 != null) {
                arrayList2.remove(kVar);
            }
            this.f855s.removeCallbacks(gVar);
        }
        this.f855s = recyclerView;
        recyclerView.g(this);
        this.f855s.f639t.add(this);
        this.f855s.h(kVar);
    }

    public static int e(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i3 - i5;
            int i8 = (int) (((f4 - f3) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    @Override // b1.k0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i3 = this.f853q;
        RecyclerView recyclerView2 = this.f855s;
        if (i3 == recyclerView2.getWidth() && this.f854r == recyclerView2.getHeight()) {
            if (this.A != 0) {
                if (this.f856t) {
                    int i4 = this.f853q;
                    int i5 = this.f842e;
                    int i6 = i4 - i5;
                    int i7 = this.f848l;
                    int i8 = this.f847k;
                    int i9 = i7 - (i8 / 2);
                    StateListDrawable stateListDrawable = this.f841c;
                    stateListDrawable.setBounds(0, 0, i5, i8);
                    int i10 = this.f843f;
                    int i11 = this.f854r;
                    Drawable drawable = this.d;
                    drawable.setBounds(0, 0, i10, i11);
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i5, i9);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i5, -i9);
                    } else {
                        canvas.translate(i6, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i9);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i6, -i9);
                    }
                }
                if (this.f857u) {
                    int i12 = this.f854r;
                    int i13 = this.f845i;
                    int i14 = i12 - i13;
                    int i15 = this.f851o;
                    int i16 = this.f850n;
                    int i17 = i15 - (i16 / 2);
                    StateListDrawable stateListDrawable2 = this.f844g;
                    stateListDrawable2.setBounds(0, 0, i16, i13);
                    int i18 = this.f853q;
                    int i19 = this.f846j;
                    Drawable drawable2 = this.h;
                    drawable2.setBounds(0, 0, i18, i19);
                    canvas.translate(0.0f, i14);
                    drawable2.draw(canvas);
                    canvas.translate(i17, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i17, -i14);
                    return;
                }
                return;
            }
            return;
        }
        this.f853q = recyclerView2.getWidth();
        this.f854r = recyclerView2.getHeight();
        f(0);
    }

    public final boolean c(float f3, float f4) {
        if (f4 >= this.f854r - this.f845i) {
            int i3 = this.f851o;
            int i4 = this.f850n;
            if (f3 >= i3 - (i4 / 2) && f3 <= (i4 / 2) + i3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(float f3, float f4) {
        WeakHashMap weakHashMap = j0.j0.f2160a;
        int layoutDirection = this.f855s.getLayoutDirection();
        int i3 = this.f842e;
        if (layoutDirection == 1) {
            if (f3 > i3) {
                return false;
            }
        } else if (f3 < this.f853q - i3) {
            return false;
        }
        int i4 = this.f848l;
        int i5 = this.f847k / 2;
        if (f4 >= i4 - i5 && f4 <= i5 + i4) {
            return true;
        }
        return false;
    }

    public final void f(int i3) {
        androidx.fragment.app.g gVar = this.B;
        StateListDrawable stateListDrawable = this.f841c;
        if (i3 == 2 && this.f858v != 2) {
            stateListDrawable.setState(C);
            this.f855s.removeCallbacks(gVar);
        }
        if (i3 == 0) {
            this.f855s.invalidate();
        } else {
            g();
        }
        if (this.f858v == 2 && i3 != 2) {
            stateListDrawable.setState(D);
            this.f855s.removeCallbacks(gVar);
            this.f855s.postDelayed(gVar, 1200);
        } else if (i3 == 1) {
            this.f855s.removeCallbacks(gVar);
            this.f855s.postDelayed(gVar, 1500);
        }
        this.f858v = i3;
    }

    public final void g() {
        int i3 = this.A;
        ValueAnimator valueAnimator = this.f862z;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
