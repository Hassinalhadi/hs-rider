package androidx.recyclerview.widget;

import a1.a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.s;
import androidx.fragment.app.g;
import b1.a1;
import b1.b;
import b1.b1;
import b1.c;
import b1.c0;
import b1.c1;
import b1.d0;
import b1.e0;
import b1.e1;
import b1.h0;
import b1.i0;
import b1.j0;
import b1.k0;
import b1.m1;
import b1.n;
import b1.n0;
import b1.o0;
import b1.p;
import b1.p0;
import b1.q0;
import b1.r;
import b1.r0;
import b1.s0;
import b1.t0;
import b1.u0;
import b1.w0;
import b1.y;
import b1.z0;
import b2.f;
import j0.g0;
import j0.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.h;
import n.j;
import q.e;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] B0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] C0;
    public static final c0 D0;
    public boolean A;
    public final d0 A0;
    public boolean B;
    public int C;
    public final AccessibilityManager D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public h0 I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public j0 N;
    public int O;
    public int P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public p0 W;
    public final int a0;

    /* renamed from: b0 */
    public final int f609b0;

    /* renamed from: c0 */
    public final float f610c0;

    /* renamed from: d0 */
    public final float f611d0;
    public boolean e0;

    /* renamed from: f */
    public final f f612f;

    /* renamed from: f0 */
    public final b1 f613f0;

    /* renamed from: g */
    public final t0 f614g;

    /* renamed from: g0 */
    public r f615g0;
    public w0 h;

    /* renamed from: h0 */
    public final p f616h0;

    /* renamed from: i */
    public final b f617i;

    /* renamed from: i0 */
    public final z0 f618i0;

    /* renamed from: j */
    public final s f619j;

    /* renamed from: j0 */
    public q0 f620j0;

    /* renamed from: k */
    public final androidx.emoji2.text.p f621k;

    /* renamed from: k0 */
    public ArrayList f622k0;

    /* renamed from: l */
    public boolean f623l;

    /* renamed from: l0 */
    public boolean f624l0;

    /* renamed from: m */
    public final Rect f625m;

    /* renamed from: m0 */
    public boolean f626m0;

    /* renamed from: n */
    public final Rect f627n;

    /* renamed from: n0 */
    public final d0 f628n0;

    /* renamed from: o */
    public final RectF f629o;

    /* renamed from: o0 */
    public boolean f630o0;

    /* renamed from: p */
    public e0 f631p;

    /* renamed from: p0 */
    public e1 f632p0;

    /* renamed from: q */
    public n0 f633q;

    /* renamed from: q0 */
    public final int[] f634q0;

    /* renamed from: r */
    public final ArrayList f635r;

    /* renamed from: r0 */
    public k f636r0;

    /* renamed from: s */
    public final ArrayList f637s;

    /* renamed from: s0 */
    public final int[] f638s0;

    /* renamed from: t */
    public final ArrayList f639t;

    /* renamed from: t0 */
    public final int[] f640t0;

    /* renamed from: u */
    public n f641u;

    /* renamed from: u0 */
    public final int[] f642u0;

    /* renamed from: v */
    public boolean f643v;

    /* renamed from: v0 */
    public final ArrayList f644v0;

    /* renamed from: w */
    public boolean f645w;

    /* renamed from: w0 */
    public final g f646w0;

    /* renamed from: x */
    public boolean f647x;

    /* renamed from: x0 */
    public boolean f648x0;

    /* renamed from: y */
    public int f649y;

    /* renamed from: y0 */
    public int f650y0;

    /* renamed from: z */
    public boolean f651z;

    /* renamed from: z0 */
    public int f652z0;

    static {
        Class cls = Integer.TYPE;
        C0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        D0 = new c0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [b1.j, java.lang.Object, b1.j0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, b1.h0] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, b1.p] */
    /* JADX WARN: Type inference failed for: r3v15, types: [b1.z0, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        boolean z2;
        char c3;
        TypedArray typedArray;
        boolean z3;
        char c4;
        AttributeSet attributeSet2;
        int i4;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f612f = new f(this, 5);
        this.f614g = new t0(this);
        this.f621k = new androidx.emoji2.text.p(8);
        this.f625m = new Rect();
        this.f627n = new Rect();
        this.f629o = new RectF();
        this.f635r = new ArrayList();
        this.f637s = new ArrayList();
        this.f639t = new ArrayList();
        this.f649y = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new Object();
        ?? obj = new Object();
        obj.f802a = null;
        obj.f803b = new ArrayList();
        obj.f804c = 120L;
        obj.d = 120L;
        obj.f805e = 250L;
        obj.f806f = 250L;
        obj.f791g = true;
        obj.h = new ArrayList();
        obj.f792i = new ArrayList();
        obj.f793j = new ArrayList();
        obj.f794k = new ArrayList();
        obj.f795l = new ArrayList();
        obj.f796m = new ArrayList();
        obj.f797n = new ArrayList();
        obj.f798o = new ArrayList();
        obj.f799p = new ArrayList();
        obj.f800q = new ArrayList();
        obj.f801r = new ArrayList();
        this.N = obj;
        this.O = 0;
        this.P = -1;
        this.f610c0 = Float.MIN_VALUE;
        this.f611d0 = Float.MIN_VALUE;
        this.e0 = true;
        this.f613f0 = new b1(this);
        this.f616h0 = new Object();
        ?? obj2 = new Object();
        obj2.f952a = -1;
        obj2.f953b = 0;
        obj2.f954c = 0;
        obj2.d = 1;
        obj2.f955e = 0;
        obj2.f956f = false;
        obj2.f957g = false;
        obj2.h = false;
        obj2.f958i = false;
        obj2.f959j = false;
        obj2.f960k = false;
        this.f618i0 = obj2;
        this.f624l0 = false;
        this.f626m0 = false;
        d0 d0Var = new d0(this);
        this.f628n0 = d0Var;
        this.f630o0 = false;
        this.f634q0 = new int[2];
        this.f638s0 = new int[2];
        this.f640t0 = new int[2];
        this.f642u0 = new int[2];
        this.f644v0 = new ArrayList();
        this.f646w0 = new g(4, this);
        this.f650y0 = 0;
        this.f652z0 = 0;
        this.A0 = new d0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.f610c0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f611d0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f609b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.N.f802a = d0Var;
        this.f617i = new b(new d0(this));
        this.f619j = new s(new d0(this));
        WeakHashMap weakHashMap = j0.j0.f2160a;
        if (j0.e0.a(this) == 0) {
            j0.e0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e1(this));
        int[] iArr = a.f70a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        g0.b(this, context, iArr, attributeSet, obtainStyledAttributes, i3, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f623l = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c4 = 2;
                z3 = 1;
                attributeSet2 = attributeSet;
                typedArray = obtainStyledAttributes;
                c3 = 3;
                i4 = i3;
                new n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.logistics.rider.lsposed.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.logistics.rider.lsposed.R.dimen.fastscroll_margin));
            } else {
                a.b.m("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
        } else {
            c3 = 3;
            typedArray = obtainStyledAttributes;
            z3 = 1;
            c4 = 2;
            attributeSet2 = attributeSet;
            i4 = i3;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(n0.class);
                    try {
                        constructor = asSubclass.getConstructor(C0);
                        objArr = new Object[4];
                        objArr[0] = context;
                        objArr[z3] = attributeSet2;
                        objArr[c4] = Integer.valueOf(i4);
                        objArr[c3] = 0;
                    } catch (NoSuchMethodException e3) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e3);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((n0) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    a.b.f(attributeSet2.getPositionDescription(), ": Class is not a LayoutManager ", str, e5);
                    throw null;
                } catch (ClassNotFoundException e6) {
                    a.b.f(attributeSet2.getPositionDescription(), ": Unable to find LayoutManager ", str, e6);
                    throw null;
                } catch (IllegalAccessException e7) {
                    a.b.f(attributeSet2.getPositionDescription(), ": Cannot access non-public constructor ", str, e7);
                    throw null;
                } catch (InstantiationException e8) {
                    a.b.f(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e8);
                    throw null;
                } catch (InvocationTargetException e9) {
                    a.b.f(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e9);
                    throw null;
                }
            }
        }
        int[] iArr2 = B0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        g0.b(this, context, iArr2, attributeSet2, obtainStyledAttributes2, i4, 0);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView D = D(viewGroup.getChildAt(i3));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static c1 I(View view) {
        if (view == null) {
            return null;
        }
        return ((o0) view.getLayoutParams()).f877a;
    }

    private k getScrollingChildHelper() {
        if (this.f636r0 == null) {
            this.f636r0 = new k(this);
        }
        return this.f636r0;
    }

    public static void j(c1 c1Var) {
        WeakReference weakReference = c1Var.f730b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c1Var.f729a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            c1Var.f730b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f639t
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            b1.n r5 = (b1.n) r5
            int r6 = r5.f858v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f859w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f852p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f859w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f849m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f641u = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        int g3 = this.f619j.g();
        if (g3 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < g3; i5++) {
            c1 I = I(this.f619j.f(i5));
            if (!I.o()) {
                int b3 = I.b();
                if (b3 < i3) {
                    i3 = b3;
                }
                if (b3 > i4) {
                    i4 = b3;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public final c1 E(int i3) {
        c1 c1Var = null;
        if (this.E) {
            return null;
        }
        int n2 = this.f619j.n();
        for (int i4 = 0; i4 < n2; i4++) {
            c1 I = I(this.f619j.m(i4));
            if (I != null && !I.h() && F(I) == i3) {
                if (((ArrayList) this.f619j.d).contains(I.f729a)) {
                    c1Var = I;
                } else {
                    return I;
                }
            }
        }
        return c1Var;
    }

    public final int F(c1 c1Var) {
        if ((c1Var.f736j & 524) == 0 && c1Var.e()) {
            int i3 = c1Var.f731c;
            ArrayList arrayList = this.f617i.f713b;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                b1.a aVar = (b1.a) arrayList.get(i4);
                int i5 = aVar.f708a;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 8) {
                            int i6 = aVar.f709b;
                            if (i6 == i3) {
                                i3 = aVar.f710c;
                            } else {
                                if (i6 < i3) {
                                    i3--;
                                }
                                if (aVar.f710c <= i3) {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        int i7 = aVar.f709b;
                        if (i7 <= i3) {
                            int i8 = aVar.f710c;
                            if (i7 + i8 <= i3) {
                                i3 -= i8;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (aVar.f709b <= i3) {
                    i3 += aVar.f710c;
                }
            }
            return i3;
        }
        return -1;
    }

    public final long G(c1 c1Var) {
        if (this.f631p.f755b) {
            return c1Var.f732e;
        }
        return c1Var.f731c;
    }

    public final c1 H(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            a.b.l("View ", view, " is not a direct child of ", this);
            return null;
        }
        return I(view);
    }

    public final Rect J(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        boolean z2 = o0Var.f879c;
        Rect rect = o0Var.f878b;
        if (!z2 || (this.f618i0.f957g && (o0Var.f877a.k() || o0Var.f877a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f637s;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Rect rect2 = this.f625m;
            rect2.set(0, 0, 0, 0);
            ((k0) arrayList.get(i3)).getClass();
            ((o0) view.getLayoutParams()).f877a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        o0Var.f879c = false;
        return rect;
    }

    public final boolean K() {
        if (this.f647x && !this.E && !this.f617i.f()) {
            return false;
        }
        return true;
    }

    public final boolean L() {
        if (this.G > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i3) {
        if (this.f633q == null) {
            return;
        }
        setScrollState(2);
        this.f633q.o0(i3);
        awakenScrollBars();
    }

    public final void N() {
        int n2 = this.f619j.n();
        for (int i3 = 0; i3 < n2; i3++) {
            ((o0) this.f619j.m(i3).getLayoutParams()).f879c = true;
        }
        ArrayList arrayList = this.f614g.f908c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o0 o0Var = (o0) ((c1) arrayList.get(i4)).f729a.getLayoutParams();
            if (o0Var != null) {
                o0Var.f879c = true;
            }
        }
    }

    public final void O(int i3, int i4, boolean z2) {
        int i5 = i3 + i4;
        int n2 = this.f619j.n();
        for (int i6 = 0; i6 < n2; i6++) {
            c1 I = I(this.f619j.m(i6));
            if (I != null && !I.o()) {
                int i7 = I.f731c;
                z0 z0Var = this.f618i0;
                if (i7 >= i5) {
                    I.l(-i4, z2);
                    z0Var.f956f = true;
                } else if (i7 >= i3) {
                    I.a(8);
                    I.l(-i4, z2);
                    I.f731c = i3 - 1;
                    z0Var.f956f = true;
                }
            }
        }
        t0 t0Var = this.f614g;
        ArrayList arrayList = t0Var.f908c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var != null) {
                int i8 = c1Var.f731c;
                if (i8 >= i5) {
                    c1Var.l(-i4, z2);
                } else if (i8 >= i3) {
                    c1Var.a(8);
                    t0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.G++;
    }

    public final void Q(boolean z2) {
        int i3;
        AccessibilityManager accessibilityManager;
        int i4 = this.G - 1;
        this.G = i4;
        if (i4 < 1) {
            this.G = 0;
            if (z2) {
                int i5 = this.C;
                this.C = 0;
                if (i5 != 0 && (accessibilityManager = this.D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f644v0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) arrayList.get(size);
                    if (c1Var.f729a.getParent() == this && !c1Var.o() && (i3 = c1Var.f743q) != -1) {
                        View view = c1Var.f729a;
                        WeakHashMap weakHashMap = j0.j0.f2160a;
                        view.setImportantForAccessibility(i3);
                        c1Var.f743q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.P = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.T = x3;
            this.R = x3;
            int y2 = (int) (motionEvent.getY(i3) + 0.5f);
            this.U = y2;
            this.S = y2;
        }
    }

    public final void S() {
        if (!this.f630o0 && this.f643v) {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            postOnAnimation(this.f646w0);
            this.f630o0 = true;
        }
    }

    public final void T(c1 c1Var, i0 i0Var) {
        c1Var.f736j &= -8193;
        boolean z2 = this.f618i0.h;
        androidx.emoji2.text.p pVar = this.f621k;
        if (z2 && c1Var.k() && !c1Var.h() && !c1Var.o()) {
            ((h) pVar.h).d(G(c1Var), c1Var);
        }
        j jVar = (j) pVar.f301g;
        m1 m1Var = (m1) jVar.get(c1Var);
        if (m1Var == null) {
            m1Var = m1.a();
            jVar.put(c1Var, m1Var);
        }
        m1Var.f837b = i0Var;
        m1Var.f836a |= 4;
    }

    public final void U(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f625m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o0) {
            o0 o0Var = (o0) layoutParams;
            if (!o0Var.f879c) {
                Rect rect2 = o0Var.f878b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        n0 n0Var = this.f633q;
        boolean z3 = !this.f647x;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        n0Var.l0(this, view, this.f625m, z3, z2);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void X(int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        c1 c1Var;
        a0();
        P();
        Trace.beginSection("RV Scroll");
        z0 z0Var = this.f618i0;
        z(z0Var);
        t0 t0Var = this.f614g;
        if (i3 != 0) {
            i5 = this.f633q.n0(i3, t0Var, z0Var);
        } else {
            i5 = 0;
        }
        if (i4 != 0) {
            i6 = this.f633q.p0(i4, t0Var, z0Var);
        } else {
            i6 = 0;
        }
        Trace.endSection();
        int g3 = this.f619j.g();
        for (int i7 = 0; i7 < g3; i7++) {
            View f3 = this.f619j.f(i7);
            c1 H = H(f3);
            if (H != null && (c1Var = H.f735i) != null) {
                View view = c1Var.f729a;
                int left = f3.getLeft();
                int top = f3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = i5;
            iArr[1] = i6;
        }
    }

    public final void Y(int i3) {
        y yVar;
        if (this.A) {
            return;
        }
        setScrollState(0);
        b1 b1Var = this.f613f0;
        b1Var.f724l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var = this.f633q;
        if (n0Var != null && (yVar = n0Var.f866e) != null) {
            yVar.i();
        }
        n0 n0Var2 = this.f633q;
        if (n0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var2.o0(i3);
            awakenScrollBars();
        }
    }

    public final void Z(int i3, int i4, boolean z2) {
        n0 n0Var = this.f633q;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.A) {
            int i5 = 0;
            if (!n0Var.d()) {
                i3 = 0;
            }
            if (!this.f633q.e()) {
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return;
            }
            if (z2) {
                if (i3 != 0) {
                    i5 = 1;
                }
                if (i4 != 0) {
                    i5 |= 2;
                }
                getScrollingChildHelper().g(i5, 1);
            }
            this.f613f0.b(i3, i4, Integer.MIN_VALUE, null);
        }
    }

    public final void a0() {
        int i3 = this.f649y + 1;
        this.f649y = i3;
        if (i3 == 1 && !this.A) {
            this.f651z = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            n0Var.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b0(boolean z2) {
        if (this.f649y < 1) {
            this.f649y = 1;
        }
        if (!z2 && !this.A) {
            this.f651z = false;
        }
        if (this.f649y == 1) {
            if (z2 && this.f651z && !this.A && this.f633q != null && this.f631p != null) {
                o();
            }
            if (!this.A) {
                this.f651z = false;
            }
        }
        this.f649y--;
    }

    public final void c0(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof o0) && this.f633q.f((o0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.d()) {
            return this.f633q.j(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.d()) {
            return this.f633q.k(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.d()) {
            return this.f633q.l(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.e()) {
            return this.f633q.m(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.e()) {
            return this.f633q.n(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        n0 n0Var = this.f633q;
        if (n0Var != null && n0Var.e()) {
            return this.f633q.o(this.f618i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return getScrollingChildHelper().a(f3, f4, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        super.draw(canvas);
        ArrayList arrayList = this.f637s;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ((k0) arrayList.get(i5)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.J;
        boolean z6 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f623l) {
                i4 = getPaddingBottom();
            } else {
                i4 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i4, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f623l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f623l) {
                i3 = getPaddingTop();
            } else {
                i3 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i3, -width);
            EdgeEffect edgeEffect6 = this.L;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f623l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.N == null || arrayList.size() <= 0 || !this.N.f()) {
            z6 = z2;
        }
        if (z6) {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void f(c1 c1Var) {
        boolean z2;
        View view = c1Var.f729a;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f614g.k(H(view));
        boolean j3 = c1Var.j();
        s sVar = this.f619j;
        if (j3) {
            sVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            sVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((d0) sVar.f309b).f748a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((c) sVar.f310c).h(indexOfChild);
            sVar.p(view);
        } else {
            a.b.h(view, "view is not a child, cannot hide ");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        if (r5 < 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
    
        if (r5 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if (r7 < 0) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(k0 k0Var) {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            n0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f637s;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(k0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            return n0Var.r();
        }
        a.b.i("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            return n0Var.s(getContext(), attributeSet);
        }
        a.b.i("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e0 getAdapter() {
        return this.f631p;
    }

    @Override // android.view.View
    public int getBaseline() {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            n0Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f623l;
    }

    public e1 getCompatAccessibilityDelegate() {
        return this.f632p0;
    }

    public h0 getEdgeEffectFactory() {
        return this.I;
    }

    public j0 getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.f637s.size();
    }

    public n0 getLayoutManager() {
        return this.f633q;
    }

    public int getMaxFlingVelocity() {
        return this.f609b0;
    }

    public int getMinFlingVelocity() {
        return this.a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public p0 getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.e0;
    }

    public s0 getRecycledViewPool() {
        return this.f614g.c();
    }

    public int getScrollState() {
        return this.O;
    }

    public final void h(q0 q0Var) {
        if (this.f622k0 == null) {
            this.f622k0 = new ArrayList();
        }
        this.f622k0.add(q0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                a.b.i("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
                return;
            } else {
                a.b.i(str);
                return;
            }
        }
        if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f643v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int n2 = this.f619j.n();
        for (int i3 = 0; i3 < n2; i3++) {
            c1 I = I(this.f619j.m(i3));
            if (!I.o()) {
                I.d = -1;
                I.f734g = -1;
            }
        }
        t0 t0Var = this.f614g;
        ArrayList arrayList = t0Var.f906a;
        ArrayList arrayList2 = t0Var.f908c;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            c1 c1Var = (c1) arrayList2.get(i4);
            c1Var.d = -1;
            c1Var.f734g = -1;
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            c1 c1Var2 = (c1) arrayList.get(i5);
            c1Var2.d = -1;
            c1Var2.f734g = -1;
        }
        ArrayList arrayList3 = t0Var.f907b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                c1 c1Var3 = (c1) t0Var.f907b.get(i6);
                c1Var3.d = -1;
                c1Var3.f734g = -1;
            }
        }
    }

    public final void l(int i3, int i4) {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null && !edgeEffect.isFinished() && i3 > 0) {
            this.J.onRelease();
            z2 = this.J.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (this.f647x && !this.E) {
            if (this.f617i.f()) {
                this.f617i.getClass();
                if (this.f617i.f()) {
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        o();
        Trace.endSection();
    }

    public final void n(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j0.j0.f2160a;
        setMeasuredDimension(n0.g(i3, paddingRight, getMinimumWidth()), n0.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x034d, code lost:
    
        if (((java.util.ArrayList) r21.f619j.d).contains(getFocusedChild()) == false) goto L478;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f9  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, b1.i0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.emoji2.text.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L43;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, b1.r] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.G = r0
            r1 = 1
            r5.f643v = r1
            boolean r2 = r5.f647x
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f647x = r2
            b1.n0 r2 = r5.f633q
            if (r2 == 0) goto L21
            r2.f868g = r1
            r2.R(r5)
        L21:
            r5.f630o0 = r0
            java.lang.ThreadLocal r0 = b1.r.f887j
            java.lang.Object r1 = r0.get()
            b1.r r1 = (b1.r) r1
            r5.f615g0 = r1
            if (r1 != 0) goto L6b
            b1.r r1 = new b1.r
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f889f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f891i = r2
            r5.f615g0 = r1
            java.util.WeakHashMap r1 = j0.j0.f2160a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            b1.r r2 = r5.f615g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.h = r3
            r0.set(r2)
        L6b:
            b1.r r0 = r5.f615g0
            java.util.ArrayList r0 = r0.f889f
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        y yVar;
        super.onDetachedFromWindow();
        j0 j0Var = this.N;
        if (j0Var != null) {
            j0Var.e();
        }
        setScrollState(0);
        b1 b1Var = this.f613f0;
        b1Var.f724l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var = this.f633q;
        if (n0Var != null && (yVar = n0Var.f866e) != null) {
            yVar.i();
        }
        this.f643v = false;
        n0 n0Var2 = this.f633q;
        if (n0Var2 != null) {
            n0Var2.f868g = false;
            n0Var2.S(this);
        }
        this.f644v0.clear();
        removeCallbacks(this.f646w0);
        this.f621k.getClass();
        do {
        } while (m1.d.a() != null);
        r rVar = this.f615g0;
        if (rVar != null) {
            rVar.f889f.remove(this);
            this.f615g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f637s;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((k0) arrayList.get(i3)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.A) {
            this.f641u = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.f633q;
            if (n0Var != null) {
                boolean d = n0Var.d();
                boolean e3 = this.f633q.e();
                if (this.Q == null) {
                    this.Q = VelocityTracker.obtain();
                }
                this.Q.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        R(motionEvent);
                                    }
                                } else {
                                    this.P = motionEvent.getPointerId(actionIndex);
                                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.T = x3;
                                    this.R = x3;
                                    int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.U = y2;
                                    this.S = y2;
                                }
                            } else {
                                V();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.P);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.O != 1) {
                                int i3 = x4 - this.R;
                                int i4 = y3 - this.S;
                                if (d != 0 && Math.abs(i3) > this.V) {
                                    this.T = x4;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (e3 && Math.abs(i4) > this.V) {
                                    this.U = y3;
                                    z2 = true;
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.Q.clear();
                        c0(0);
                    }
                } else {
                    if (this.B) {
                        this.B = false;
                    }
                    this.P = motionEvent.getPointerId(0);
                    int x5 = (int) (motionEvent.getX() + 0.5f);
                    this.T = x5;
                    this.R = x5;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.U = y4;
                    this.S = y4;
                    if (this.O == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.f640t0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i5 = d;
                    if (e3) {
                        i5 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i5, 0);
                }
                if (this.O == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f647x = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        n0 n0Var = this.f633q;
        if (n0Var == null) {
            n(i3, i4);
            return;
        }
        boolean L = n0Var.L();
        boolean z2 = false;
        z0 z0Var = this.f618i0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f633q.f864b.n(i3, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.f648x0 = z2;
            if (!z2 && this.f631p != null) {
                if (z0Var.d == 1) {
                    p();
                }
                this.f633q.r0(i3, i4);
                z0Var.f958i = true;
                q();
                this.f633q.t0(i3, i4);
                if (this.f633q.w0()) {
                    this.f633q.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    z0Var.f958i = true;
                    q();
                    this.f633q.t0(i3, i4);
                }
                this.f650y0 = getMeasuredWidth();
                this.f652z0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f645w) {
            this.f633q.f864b.n(i3, i4);
            return;
        }
        if (z0Var.f960k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e0 e0Var = this.f631p;
        if (e0Var != null) {
            z0Var.f955e = e0Var.a();
        } else {
            z0Var.f955e = 0;
        }
        a0();
        this.f633q.f864b.n(i3, i4);
        b0(false);
        z0Var.f957g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w0 w0Var = (w0) parcelable;
        this.h = w0Var;
        super.onRestoreInstanceState(w0Var.f2612f);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, b1.w0, o0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new o0.b(super.onSaveInstanceState());
        w0 w0Var = this.h;
        if (w0Var != null) {
            bVar.h = w0Var.h;
            return bVar;
        }
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            bVar.h = n0Var.f0();
            return bVar;
        }
        bVar.h = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0402, code lost:
    
        if (r2 < r5) goto L477;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:355:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, b1.i0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, b1.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        boolean z2;
        a0();
        P();
        z0 z0Var = this.f618i0;
        z0Var.a(6);
        this.f617i.b();
        z0Var.f955e = this.f631p.a();
        z0Var.f954c = 0;
        if (this.h != null) {
            e0 e0Var = this.f631p;
            int a3 = e.a(e0Var.f756c);
            if (a3 == 1 ? e0Var.a() > 0 : a3 != 2) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.f633q.e0(parcelable);
                }
                this.h = null;
            }
        }
        z0Var.f957g = false;
        this.f633q.c0(this.f614g, z0Var);
        z0Var.f956f = false;
        if (z0Var.f959j && this.N != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        z0Var.f959j = z2;
        z0Var.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        c1 I = I(view);
        if (I != null) {
            if (I.j()) {
                I.f736j &= -257;
            } else if (!I.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        y yVar = this.f633q.f866e;
        if ((yVar == null || !yVar.f941e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f633q.l0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f639t;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f649y == 0 && !this.A) {
            super.requestLayout();
        } else {
            this.f651z = true;
        }
    }

    public final void s(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().d(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        n0 n0Var = this.f633q;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.A) {
            boolean d = n0Var.d();
            boolean e3 = this.f633q.e();
            if (!d && !e3) {
                return;
            }
            if (!d) {
                i3 = 0;
            }
            if (!e3) {
                i4 = 0;
            }
            W(i3, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i3;
        if (L()) {
            int i4 = 0;
            if (accessibilityEvent != null) {
                i3 = accessibilityEvent.getContentChangeTypes();
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                i4 = i3;
            }
            this.C |= i4;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(e1 e1Var) {
        this.f632p0 = e1Var;
        j0.j0.h(this, e1Var);
    }

    public void setAdapter(e0 e0Var) {
        setLayoutFrozen(false);
        e0 e0Var2 = this.f631p;
        f fVar = this.f612f;
        if (e0Var2 != null) {
            e0Var2.f754a.unregisterObserver(fVar);
            this.f631p.getClass();
        }
        j0 j0Var = this.N;
        if (j0Var != null) {
            j0Var.e();
        }
        n0 n0Var = this.f633q;
        t0 t0Var = this.f614g;
        if (n0Var != null) {
            n0Var.h0(t0Var);
            this.f633q.i0(t0Var);
        }
        t0Var.f906a.clear();
        t0Var.e();
        b bVar = this.f617i;
        bVar.i(bVar.f713b);
        bVar.i(bVar.f714c);
        e0 e0Var3 = this.f631p;
        this.f631p = e0Var;
        if (e0Var != null) {
            e0Var.f754a.registerObserver(fVar);
        }
        n0 n0Var2 = this.f633q;
        if (n0Var2 != null) {
            n0Var2.Q();
        }
        e0 e0Var4 = this.f631p;
        t0Var.f906a.clear();
        t0Var.e();
        s0 c3 = t0Var.c();
        if (e0Var3 != null) {
            c3.f898b--;
        }
        if (c3.f898b == 0) {
            SparseArray sparseArray = c3.f897a;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                ((r0) sparseArray.valueAt(i3)).f892a.clear();
            }
        }
        if (e0Var4 != null) {
            c3.f898b++;
        }
        this.f618i0.f956f = true;
        this.F |= false;
        this.E = true;
        int n2 = this.f619j.n();
        for (int i4 = 0; i4 < n2; i4++) {
            c1 I = I(this.f619j.m(i4));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        t0 t0Var2 = this.f614g;
        ArrayList arrayList = t0Var2.f908c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c1 c1Var = (c1) arrayList.get(i5);
            if (c1Var != null) {
                c1Var.a(6);
                c1Var.a(1024);
            }
        }
        e0 e0Var5 = t0Var2.h.f631p;
        if (e0Var5 == null || !e0Var5.f755b) {
            t0Var2.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(b1.g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f623l) {
            this.M = null;
            this.K = null;
            this.L = null;
            this.J = null;
        }
        this.f623l = z2;
        super.setClipToPadding(z2);
        if (this.f647x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h0 h0Var) {
        h0Var.getClass();
        this.I = h0Var;
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f645w = z2;
    }

    public void setItemAnimator(j0 j0Var) {
        j0 j0Var2 = this.N;
        if (j0Var2 != null) {
            j0Var2.e();
            this.N.f802a = null;
        }
        this.N = j0Var;
        if (j0Var != null) {
            j0Var.f802a = this.f628n0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        t0 t0Var = this.f614g;
        t0Var.f909e = i3;
        t0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(n0 n0Var) {
        RecyclerView recyclerView;
        y yVar;
        if (n0Var == this.f633q) {
            return;
        }
        setScrollState(0);
        b1 b1Var = this.f613f0;
        b1Var.f724l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var2 = this.f633q;
        if (n0Var2 != null && (yVar = n0Var2.f866e) != null) {
            yVar.i();
        }
        n0 n0Var3 = this.f633q;
        t0 t0Var = this.f614g;
        if (n0Var3 != null) {
            j0 j0Var = this.N;
            if (j0Var != null) {
                j0Var.e();
            }
            this.f633q.h0(t0Var);
            this.f633q.i0(t0Var);
            t0Var.f906a.clear();
            t0Var.e();
            if (this.f643v) {
                n0 n0Var4 = this.f633q;
                n0Var4.f868g = false;
                n0Var4.S(this);
            }
            this.f633q.u0(null);
            this.f633q = null;
        } else {
            t0Var.f906a.clear();
            t0Var.e();
        }
        s sVar = this.f619j;
        ((c) sVar.f310c).g();
        ArrayList arrayList = (ArrayList) sVar.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((d0) sVar.f309b).f748a;
            if (size < 0) {
                break;
            }
            c1 I = I((View) arrayList.get(size));
            if (I != null) {
                int i3 = I.f742p;
                if (recyclerView.L()) {
                    I.f743q = i3;
                    recyclerView.f644v0.add(I);
                } else {
                    View view = I.f729a;
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    view.setImportantForAccessibility(i3);
                }
                I.f742p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f633q = n0Var;
        if (n0Var != null) {
            if (n0Var.f864b == null) {
                n0Var.u0(this);
                if (this.f643v) {
                    n0 n0Var5 = this.f633q;
                    n0Var5.f868g = true;
                    n0Var5.R(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(n0Var);
                String y2 = n0Var.f864b.y();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(y2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        t0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            a.b.m("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.f2165c;
            WeakHashMap weakHashMap = j0.j0.f2160a;
            j0.c0.j(viewGroup);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(p0 p0Var) {
        this.W = p0Var;
    }

    @Deprecated
    public void setOnScrollListener(q0 q0Var) {
        this.f620j0 = q0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.e0 = z2;
    }

    public void setRecycledViewPool(s0 s0Var) {
        t0 t0Var = this.f614g;
        if (t0Var.f911g != null) {
            r0.f898b--;
        }
        t0Var.f911g = s0Var;
        if (s0Var != null && t0Var.h.getAdapter() != null) {
            t0Var.f911g.f898b++;
        }
    }

    public void setScrollState(int i3) {
        y yVar;
        if (i3 != this.O) {
            this.O = i3;
            if (i3 != 2) {
                b1 b1Var = this.f613f0;
                b1Var.f724l.removeCallbacks(b1Var);
                b1Var.h.abortAnimation();
                n0 n0Var = this.f633q;
                if (n0Var != null && (yVar = n0Var.f866e) != null) {
                    yVar.i();
                }
            }
            n0 n0Var2 = this.f633q;
            if (n0Var2 != null) {
                n0Var2.g0(i3);
            }
            q0 q0Var = this.f620j0;
            if (q0Var != null) {
                q0Var.a(i3);
            }
            ArrayList arrayList = this.f622k0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((q0) this.f622k0.get(size)).a(i3);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
            } else {
                this.V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a1 a1Var) {
        this.f614g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        y yVar;
        if (z2 != this.A) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.A = false;
                if (this.f651z && this.f633q != null && this.f631p != null) {
                    requestLayout();
                }
                this.f651z = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A = true;
            this.B = true;
            setScrollState(0);
            b1 b1Var = this.f613f0;
            b1Var.f724l.removeCallbacks(b1Var);
            b1Var.h.abortAnimation();
            n0 n0Var = this.f633q;
            if (n0Var != null && (yVar = n0Var.f866e) != null) {
                yVar.i();
            }
        }
    }

    public final void t(int i3, int i4) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i4);
        q0 q0Var = this.f620j0;
        if (q0Var != null) {
            q0Var.b(this, i3, i4);
        }
        ArrayList arrayList = this.f622k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q0) this.f622k0.get(size)).b(this, i3, i4);
            }
        }
        this.H--;
    }

    public final void u() {
        if (this.M != null) {
            return;
        }
        this.I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f623l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.J != null) {
            return;
        }
        this.I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.f623l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.L != null) {
            return;
        }
        this.I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f623l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.K != null) {
            return;
        }
        this.I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.f623l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f631p + ", layout:" + this.f633q + ", context:" + getContext();
    }

    public final void z(z0 z0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f613f0.h;
            overScroller.getFinalX();
            overScroller.getCurrX();
            z0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        z0Var.getClass();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n0 n0Var = this.f633q;
        if (n0Var != null) {
            return n0Var.t(layoutParams);
        }
        a.b.i("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(u0 u0Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.logistics.rider.lsposed.R.attr.recyclerViewStyle);
    }
}
