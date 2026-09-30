package p0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.g;
import b1.c0;
import j0.j0;
import java.util.Arrays;
import java.util.WeakHashMap;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f2677v = new c0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2679b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2681e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f2682f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f2683g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2684i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2685j;

    /* renamed from: k, reason: collision with root package name */
    public int f2686k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2687l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2688m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2689n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2690o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f2691p;

    /* renamed from: q, reason: collision with root package name */
    public final h f2692q;

    /* renamed from: r, reason: collision with root package name */
    public View f2693r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2694s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f2695t;

    /* renamed from: c, reason: collision with root package name */
    public int f2680c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final g f2696u = new g(12, this);

    public d(Context context, CoordinatorLayout coordinatorLayout, h hVar) {
        if (hVar != null) {
            this.f2695t = coordinatorLayout;
            this.f2692q = hVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2690o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2679b = viewConfiguration.getScaledTouchSlop();
            this.f2688m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2689n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2691p = new OverScroller(context, f2677v);
            return;
        }
        a.b.m("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.f2680c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2681e, 0.0f);
            Arrays.fill(this.f2682f, 0.0f);
            Arrays.fill(this.f2683g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f2684i, 0);
            Arrays.fill(this.f2685j, 0);
            this.f2686k = 0;
        }
        VelocityTracker velocityTracker = this.f2687l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2687l = null;
        }
    }

    public final void b(View view, int i3) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f2695t;
        if (parent == coordinatorLayout) {
            this.f2693r = view;
            this.f2680c = i3;
            this.f2692q.J(view, i3);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            k2.h r1 = r3.f2692q
            int r4 = r1.v(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.x()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3.f2679b
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r3 = r3.f2679b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r3 = r3.f2679b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.d.c(android.view.View, float, float):boolean");
    }

    public final void d(int i3) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i4 = this.f2686k;
            int i5 = 1 << i3;
            if ((i4 & i5) != 0) {
                fArr[i3] = 0.0f;
                this.f2681e[i3] = 0.0f;
                this.f2682f[i3] = 0.0f;
                this.f2683g[i3] = 0.0f;
                this.h[i3] = 0;
                this.f2684i[i3] = 0;
                this.f2685j[i3] = 0;
                this.f2686k = (~i5) & i4;
            }
        }
    }

    public final int e(int i3, int i4, int i5) {
        int abs;
        if (i3 == 0) {
            return 0;
        }
        float width = this.f2695t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f2678a == 2) {
            OverScroller overScroller = this.f2691p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2693r.getLeft();
            int top = currY - this.f2693r.getTop();
            if (left != 0) {
                View view = this.f2693r;
                WeakHashMap weakHashMap = j0.f2160a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2693r;
                WeakHashMap weakHashMap2 = j0.f2160a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2692q.L(this.f2693r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2695t.post(this.f2696u);
            }
        }
        if (this.f2678a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i3, int i4) {
        CoordinatorLayout coordinatorLayout = this.f2695t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2692q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float f5;
        float f6;
        int left = this.f2693r.getLeft();
        int top = this.f2693r.getTop();
        int i7 = i3 - left;
        int i8 = i4 - top;
        OverScroller overScroller = this.f2691p;
        if (i7 == 0 && i8 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f2693r;
        int i9 = (int) this.f2689n;
        int i10 = (int) this.f2688m;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            if (i5 > 0) {
                i5 = i10;
            } else {
                i5 = -i10;
            }
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i9) {
            i6 = 0;
        } else if (abs2 > i10) {
            if (i6 > 0) {
                i6 = i10;
            } else {
                i6 = -i10;
            }
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i5 != 0) {
            f3 = abs5;
            f4 = i11;
        } else {
            f3 = abs3;
            f4 = i12;
        }
        float f7 = f3 / f4;
        if (i6 != 0) {
            f5 = abs6;
            f6 = i11;
        } else {
            f5 = abs4;
            f6 = i12;
        }
        float f8 = f5 / f6;
        h hVar = this.f2692q;
        overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, hVar.x()) * f8) + (e(i7, i5, hVar.v(view)) * f7)));
        n(2);
        return true;
    }

    public final boolean i(int i3) {
        if ((this.f2686k & (1 << i3)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2687l == null) {
            this.f2687l = VelocityTracker.obtain();
        }
        this.f2687l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                h hVar = this.f2692q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f2678a == 1 && pointerId == this.f2680c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i4 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i4);
                                            if (pointerId2 != this.f2680c) {
                                                View g3 = g((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                                                View view = this.f2693r;
                                                if (g3 == view && q(view, pointerId2)) {
                                                    i3 = this.f2680c;
                                                    break;
                                                }
                                            }
                                            i4++;
                                        } else {
                                            i3 = -1;
                                            break;
                                        }
                                    }
                                    if (i3 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        l(x3, y2, pointerId3);
                        if (this.f2678a == 0) {
                            q(g((int) x3, (int) y2), pointerId3);
                            int i5 = this.h[pointerId3];
                            return;
                        }
                        int i6 = (int) x3;
                        int i7 = (int) y2;
                        View view2 = this.f2693r;
                        if (view2 != null && i6 >= view2.getLeft() && i6 < view2.getRight() && i7 >= view2.getTop() && i7 < view2.getBottom()) {
                            i4 = 1;
                        }
                        if (i4 != 0) {
                            q(this.f2693r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f2678a == 1) {
                        this.f2694s = true;
                        hVar.M(this.f2693r, 0.0f, 0.0f);
                        this.f2694s = false;
                        if (this.f2678a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f2678a == 1) {
                    if (!i(this.f2680c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2680c);
                    float x4 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2682f;
                    int i8 = this.f2680c;
                    int i9 = (int) (x4 - fArr[i8]);
                    int i10 = (int) (y3 - this.f2683g[i8]);
                    int left = this.f2693r.getLeft() + i9;
                    int top = this.f2693r.getTop() + i10;
                    int left2 = this.f2693r.getLeft();
                    int top2 = this.f2693r.getTop();
                    if (i9 != 0) {
                        left = hVar.h(this.f2693r, left);
                        WeakHashMap weakHashMap = j0.f2160a;
                        this.f2693r.offsetLeftAndRight(left - left2);
                    }
                    if (i10 != 0) {
                        top = hVar.i(this.f2693r, top);
                        WeakHashMap weakHashMap2 = j0.f2160a;
                        this.f2693r.offsetTopAndBottom(top - top2);
                    }
                    if (i9 != 0 || i10 != 0) {
                        hVar.L(this.f2693r, left, top);
                    }
                    m(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i4 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i4);
                    if (i(pointerId4)) {
                        float x5 = motionEvent.getX(i4);
                        float y4 = motionEvent.getY(i4);
                        float f3 = x5 - this.d[pointerId4];
                        float f4 = y4 - this.f2681e[pointerId4];
                        Math.abs(f3);
                        Math.abs(f4);
                        int i11 = this.h[pointerId4];
                        Math.abs(f4);
                        Math.abs(f3);
                        int i12 = this.h[pointerId4];
                        Math.abs(f3);
                        Math.abs(f4);
                        int i13 = this.h[pointerId4];
                        Math.abs(f4);
                        Math.abs(f3);
                        int i14 = this.h[pointerId4];
                        if (this.f2678a != 1) {
                            View g4 = g((int) x5, (int) y4);
                            if (c(g4, f3, f4) && q(g4, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i4++;
                }
                m(motionEvent);
                return;
            }
            if (this.f2678a == 1) {
                k();
            }
            a();
            return;
        }
        float x6 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g5 = g((int) x6, (int) y5);
        l(x6, y5, pointerId5);
        q(g5, pointerId5);
        int i15 = this.h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f2687l;
        float f3 = this.f2688m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f2687l.getXVelocity(this.f2680c);
        float abs = Math.abs(xVelocity);
        float f4 = this.f2689n;
        if (abs < f4) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            if (xVelocity > 0.0f) {
                xVelocity = f3;
            } else {
                xVelocity = -f3;
            }
        }
        float yVelocity = this.f2687l.getYVelocity(this.f2680c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            f3 = 0.0f;
        } else if (abs2 > f3) {
            if (yVelocity <= 0.0f) {
                f3 = -f3;
            }
        } else {
            f3 = yVelocity;
        }
        this.f2694s = true;
        this.f2692q.M(this.f2693r, xVelocity, f3);
        this.f2694s = false;
        if (this.f2678a == 1) {
            n(0);
        }
    }

    public final void l(float f3, float f4, int i3) {
        float[] fArr = this.d;
        int i4 = 0;
        if (fArr == null || fArr.length <= i3) {
            int i5 = i3 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2681e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2682f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2683g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2684i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2685j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f2681e = fArr3;
            this.f2682f = fArr4;
            this.f2683g = fArr5;
            this.h = iArr;
            this.f2684i = iArr2;
            this.f2685j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f2682f[i3] = f3;
        fArr9[i3] = f3;
        float[] fArr10 = this.f2681e;
        this.f2683g[i3] = f4;
        fArr10[i3] = f4;
        int[] iArr7 = this.h;
        int i6 = (int) f3;
        int i7 = (int) f4;
        CoordinatorLayout coordinatorLayout = this.f2695t;
        int left = coordinatorLayout.getLeft();
        int i8 = this.f2690o;
        if (i6 < left + i8) {
            i4 = 1;
        }
        if (i7 < coordinatorLayout.getTop() + i8) {
            i4 |= 4;
        }
        if (i6 > coordinatorLayout.getRight() - i8) {
            i4 |= 2;
        }
        if (i7 > coordinatorLayout.getBottom() - i8) {
            i4 |= 8;
        }
        iArr7[i3] = i4;
        this.f2686k |= 1 << i3;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (i(pointerId)) {
                float x3 = motionEvent.getX(i3);
                float y2 = motionEvent.getY(i3);
                this.f2682f[pointerId] = x3;
                this.f2683g[pointerId] = y2;
            }
        }
    }

    public final void n(int i3) {
        this.f2695t.removeCallbacks(this.f2696u);
        if (this.f2678a != i3) {
            this.f2678a = i3;
            this.f2692q.K(i3);
            if (this.f2678a == 0) {
                this.f2693r = null;
            }
        }
    }

    public final boolean o(int i3, int i4) {
        if (this.f2694s) {
            return h(i3, i4, (int) this.f2687l.getXVelocity(this.f2680c), (int) this.f2687l.getYVelocity(this.f2680c));
        }
        a.b.i("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i3) {
        if (view == this.f2693r && this.f2680c == i3) {
            return true;
        }
        if (view != null && this.f2692q.Y(view, i3)) {
            this.f2680c = i3;
            b(view, i3);
            return true;
        }
        return false;
    }
}
