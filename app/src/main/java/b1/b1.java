package b1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f719f;

    /* renamed from: g, reason: collision with root package name */
    public int f720g;
    public OverScroller h;

    /* renamed from: i, reason: collision with root package name */
    public Interpolator f721i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f722j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f723k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f724l;

    public b1(RecyclerView recyclerView) {
        this.f724l = recyclerView;
        c0 c0Var = RecyclerView.D0;
        this.f721i = c0Var;
        this.f722j = false;
        this.f723k = false;
        this.h = new OverScroller(recyclerView.getContext(), c0Var);
    }

    public final void a() {
        if (this.f722j) {
            this.f723k = true;
            return;
        }
        RecyclerView recyclerView = this.f724l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = j0.j0.f2160a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i3, int i4, int i5, Interpolator interpolator) {
        boolean z2;
        int height;
        RecyclerView recyclerView = this.f724l;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z2) {
                abs = abs2;
            }
            i5 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i6 = i5;
        if (interpolator == null) {
            interpolator = RecyclerView.D0;
        }
        if (this.f721i != interpolator) {
            this.f721i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f720g = 0;
        this.f719f = 0;
        recyclerView.setScrollState(2);
        this.h.startScroll(0, 0, i3, i4, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean awakenScrollBars;
        boolean z2;
        boolean z3;
        boolean z4;
        int i7;
        RecyclerView recyclerView = this.f724l;
        int[] iArr = recyclerView.f642u0;
        if (recyclerView.f633q == null) {
            recyclerView.removeCallbacks(this);
            this.h.abortAnimation();
            return;
        }
        this.f723k = false;
        this.f722j = true;
        recyclerView.m();
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f719f;
            int i9 = currY - this.f720g;
            this.f719f = currX;
            this.f720g = currY;
            int[] iArr2 = recyclerView.f642u0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i8, i9, 1, iArr2, null)) {
                i3 = i8 - iArr[0];
                i4 = i9 - iArr[1];
            } else {
                i3 = i8;
                i4 = i9;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i3, i4);
            }
            if (recyclerView.f631p != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.X(i3, i4, iArr);
                i5 = iArr[0];
                i6 = iArr[1];
                i3 -= i5;
                i4 -= i6;
                y yVar = recyclerView.f633q.f866e;
                if (yVar != null && !yVar.d && yVar.f941e) {
                    int b3 = recyclerView.f618i0.b();
                    if (b3 == 0) {
                        yVar.i();
                    } else if (yVar.f938a >= b3) {
                        yVar.f938a = b3 - 1;
                        yVar.g(i5, i6);
                    } else {
                        yVar.g(i5, i6);
                    }
                }
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (!recyclerView.f637s.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f642u0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i5, i6, i3, i4, null, 1, iArr3);
            int i10 = i3 - iArr[0];
            int i11 = i4 - iArr[1];
            if (i5 != 0 || i6 != 0) {
                recyclerView.t(i5, i6);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!overScroller.isFinished() && ((!z2 && i10 == 0) || (!z3 && i11 == 0))) {
                z4 = false;
            } else {
                z4 = true;
            }
            y yVar2 = recyclerView.f633q.f866e;
            if ((yVar2 == null || !yVar2.d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i10 < 0) {
                        i7 = -currVelocity;
                    } else if (i10 > 0) {
                        i7 = currVelocity;
                    } else {
                        i7 = 0;
                    }
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i7 < 0) {
                        recyclerView.v();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-i7);
                        }
                    } else if (i7 > 0) {
                        recyclerView.w();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(i7);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(currVelocity);
                        }
                    }
                    if (i7 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = j0.j0.f2160a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                p pVar = recyclerView.f616h0;
                int[] iArr4 = pVar.f882c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                pVar.d = 0;
            } else {
                a();
                r rVar = recyclerView.f615g0;
                if (rVar != null) {
                    rVar.a(recyclerView, i5, i6);
                }
            }
        }
        y yVar3 = recyclerView.f633q.f866e;
        if (yVar3 != null && yVar3.d) {
            yVar3.g(0, 0);
        }
        this.f722j = false;
        if (this.f723k) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = j0.j0.f2160a;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        }
    }
}
