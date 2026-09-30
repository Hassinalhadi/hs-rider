package androidx.core.widget;

import a.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b1.i0;
import com.google.android.material.datepicker.g;
import j0.c0;
import j0.h;
import j0.j0;
import j0.k;
import j0.m;
import j0.s;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c;
import n0.e;
import n0.f;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final g I = new g(4);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public n0.g C;
    public final i0 D;
    public final k E;
    public float F;
    public final h G;

    /* renamed from: f, reason: collision with root package name */
    public final float f246f;

    /* renamed from: g, reason: collision with root package name */
    public long f247g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final OverScroller f248i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f249j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f250k;

    /* renamed from: l, reason: collision with root package name */
    public s f251l;

    /* renamed from: m, reason: collision with root package name */
    public int f252m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f253n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f254o;

    /* renamed from: p, reason: collision with root package name */
    public View f255p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f256q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f257r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f258s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f259t;

    /* renamed from: u, reason: collision with root package name */
    public final int f260u;

    /* renamed from: v, reason: collision with root package name */
    public final int f261v;

    /* renamed from: w, reason: collision with root package name */
    public final int f262w;

    /* renamed from: x, reason: collision with root package name */
    public int f263x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f264y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f265z;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, b1.i0] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.lsposed.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.h = new Rect();
        this.f253n = true;
        this.f254o = false;
        this.f255p = null;
        this.f256q = false;
        this.f259t = true;
        this.f263x = -1;
        this.f264y = new int[2];
        this.f265z = new int[2];
        this.G = new h(getContext(), new androidx.emoji2.text.m(23, this));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            edgeEffect = c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f249j = edgeEffect;
        if (i3 >= 31) {
            edgeEffect2 = c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f250k = edgeEffect2;
        this.f246f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f248i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f260u = viewConfiguration.getScaledTouchSlop();
        this.f261v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f262w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.logistics.rider.lsposed.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new Object();
        this.E = new k(this);
        setNestedScrollingEnabled(true);
        j0.h(this, I);
    }

    private s getScrollFeedbackProvider() {
        if (this.f251l == null) {
            this.f251l = new s(this);
        }
        return this.f251l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && l((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // j0.l
    public final void a(View view, View view2, int i3, int i4) {
        i0 i0Var = this.D;
        if (i4 == 1) {
            i0Var.f786b = i3;
        } else {
            i0Var.f785a = i3;
        }
        this.E.g(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            b.i("ScrollView can host only one direct child");
        }
    }

    @Override // j0.l
    public final void b(View view, int i3) {
        i0 i0Var = this.D;
        if (i3 == 1) {
            i0Var.f786b = 0;
        } else {
            i0Var.f785a = 0;
        }
        w(i3);
    }

    @Override // j0.l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
        this.E.c(i3, i4, i5, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    @Override // j0.m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        n(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.E.a(f3, f4, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.E.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.E.c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.E.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f249j;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f250k;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i4 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // j0.l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        n(i6, i7, null);
    }

    @Override // j0.l
    public final boolean f(View view, View view2, int i3, int i4) {
        if ((i3 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i3);
        } else {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.D;
        return i0Var.f786b | i0Var.f785a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.F = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                b.i("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
        }
        return this.F;
    }

    public final int h(Rect rect) {
        int i3;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i3 = i6 - verticalFadingEdgeLength;
        } else {
            i3 = i6;
        }
        int i7 = rect.bottom;
        if (i7 > i3 && rect.top > scrollY) {
            if (rect.height() > height) {
                i5 = rect.top - scrollY;
            } else {
                i5 = rect.bottom - i3;
            }
            return Math.min(i5, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i7 >= i3) {
            return 0;
        }
        if (rect.height() > height) {
            i4 = 0 - (i3 - rect.bottom);
        } else {
            i4 = 0 - (scrollY - rect.top);
        }
        return Math.max(i4, -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.E.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.h.setEmpty();
        int i3 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                q(130);
                                                return false;
                                            }
                                        } else {
                                            q(33);
                                            return false;
                                        }
                                    } else {
                                        return k(130);
                                    }
                                } else {
                                    return k(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i3 = 33;
                                }
                                q(i3);
                                return false;
                            }
                        } else {
                            if (keyEvent.isAltPressed()) {
                                return k(130);
                            }
                            return g(130);
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            return k(33);
                        }
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.d;
    }

    public final void j(int i3) {
        if (getChildCount() > 0) {
            this.f248i.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E.g(2, 1);
            this.B = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f248i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i3) {
        boolean z2;
        int childCount;
        if (i3 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i3, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i3, int i4) {
        Rect rect = this.h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f263x) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f252m = (int) motionEvent.getY(i3);
            this.f263x = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f257r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f254o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0120, code lost:
    
        if (r7 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00d5, code lost:
    
        if (r8 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f256q) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i4 = this.f263x;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f252m) > this.f260u && (2 & getNestedScrollAxes()) == 0) {
                                this.f256q = true;
                                this.f252m = y2;
                                if (this.f257r == null) {
                                    this.f257r = VelocityTracker.obtain();
                                }
                                this.f257r.addMovement(motionEvent);
                                this.A = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f256q = false;
            this.f263x = -1;
            VelocityTracker velocityTracker = this.f257r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f257r = null;
            }
            if (this.f248i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f252m = y3;
                    this.f263x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f257r;
                    if (velocityTracker2 == null) {
                        this.f257r = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f257r.addMovement(motionEvent);
                    this.f248i.computeScrollOffset();
                    if (!v(motionEvent) && this.f248i.isFinished()) {
                        z2 = false;
                    }
                    this.f256q = z2;
                    this.E.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f248i.isFinished()) {
                z2 = false;
            }
            this.f256q = z2;
            VelocityTracker velocityTracker3 = this.f257r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f257r = null;
            }
        }
        return this.f256q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z2, i3, i4, i5, i6);
        int i8 = 0;
        this.f253n = false;
        View view = this.f255p;
        if (view != null && l(view, this)) {
            View view2 = this.f255p;
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f255p = null;
        if (!this.f254o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f2601f);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f254o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f258s && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (!z2) {
            dispatchNestedFling(0.0f, f4, true);
            j((int) f4);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.E.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.E.c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        n(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z2, boolean z3) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        View findNextFocusFromRect;
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i3);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        }
        if (findNextFocusFromRect == null || !m(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n0.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0.g gVar = (n0.g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.C = gVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, n0.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2601f = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i6)) {
            Rect rect = this.h;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h = h(rect);
            if (h != 0) {
                if (this.f259t) {
                    u(0, h, false);
                } else {
                    scrollBy(0, h);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i3, int i4, int i5, int i6) {
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i3;
        if (i4 > 0 || i4 < 0) {
            i7 = 0;
            z2 = true;
        } else {
            i7 = i4;
            z2 = false;
        }
        if (i9 > i6) {
            i8 = i6;
        } else if (i9 < 0) {
            i8 = 0;
        } else {
            i8 = i9;
            z3 = false;
            if (z3 && !this.E.f(1)) {
                this.f248i.springBack(i7, i8, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i7, i8);
            if (!z2 || z3) {
                return true;
            }
            return false;
        }
        z3 = true;
        if (z3) {
            this.f248i.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (!z2) {
        }
        return true;
    }

    public final void q(int i3) {
        boolean z2;
        if (i3 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.h;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        r(i3, i4, i5);
    }

    public final boolean r(int i3, int i4, int i5) {
        boolean z2;
        View view;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        if (i3 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = focusables.get(i8);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i4 < bottom && top < i5) {
                if (i4 < top && bottom < i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z6 = z4;
                } else {
                    if ((z2 && top < view2.getTop()) || (!z2 && bottom > view2.getBottom())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                            view2 = view3;
                        }
                    } else if (z4) {
                        view2 = view3;
                        z6 = true;
                    } else {
                        if (!z5) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i4 >= scrollY && i5 <= i7) {
            z3 = false;
        } else {
            if (z2) {
                i6 = i4 - scrollY;
            } else {
                i6 = i5 - i7;
            }
            s(i6, -1, null, 0, 1, true);
            z3 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f253n) {
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        } else {
            this.f255p = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z3;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        if (h != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                scrollBy(0, h);
                return z3;
            }
            u(0, h, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f257r) != null) {
            velocityTracker.recycle();
            this.f257r = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f253n = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i3 >= 0) {
                if (width + i3 > width2) {
                    i3 = width2 - width;
                }
            } else {
                i3 = 0;
            }
            if (height < height2 && i4 >= 0) {
                if (height + i4 > height2) {
                    i4 = height2 - height;
                }
            } else {
                i4 = 0;
            }
            if (i3 != getScrollX() || i4 != getScrollY()) {
                super.scrollTo(i3, i4);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f258s) {
            this.f258s = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        k kVar = this.E;
        if (kVar.d) {
            ViewGroup viewGroup = kVar.f2165c;
            WeakHashMap weakHashMap = j0.f2160a;
            c0.j(viewGroup);
        }
        kVar.d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f259t = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.E.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float n2 = k2.h.n(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f3 = this.f246f * 0.015f;
        double log = Math.log(abs / f3);
        double d = H;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f3)) < n2) {
            return true;
        }
        return false;
    }

    public final void u(int i3, int i4, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f247g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f248i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z2) {
                this.E.g(2, 1);
            } else {
                w(1);
            }
            this.B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f248i.isFinished()) {
                this.f248i.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.f247g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f249j;
        if (k2.h.n(edgeEffect) != 0.0f) {
            k2.h.I(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f250k;
        if (k2.h.n(edgeEffect2) != 0.0f) {
            k2.h.I(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z2;
    }

    public final void w(int i3) {
        this.E.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
        } else {
            b.i("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            b.i("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
        } else {
            b.i("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(f fVar) {
    }
}
