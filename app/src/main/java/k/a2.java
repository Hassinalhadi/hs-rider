package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class a2 implements j.c0 {
    public final Handler A;
    public Rect C;
    public boolean D;
    public final b0 E;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2214f;

    /* renamed from: g, reason: collision with root package name */
    public ListAdapter f2215g;
    public n1 h;

    /* renamed from: k, reason: collision with root package name */
    public int f2218k;

    /* renamed from: l, reason: collision with root package name */
    public int f2219l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2221n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2222o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2223p;

    /* renamed from: s, reason: collision with root package name */
    public x1 f2226s;

    /* renamed from: t, reason: collision with root package name */
    public View f2227t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2228u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2229v;

    /* renamed from: i, reason: collision with root package name */
    public final int f2216i = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f2217j = -2;

    /* renamed from: m, reason: collision with root package name */
    public final int f2220m = 1002;

    /* renamed from: q, reason: collision with root package name */
    public int f2224q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f2225r = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final w1 f2230w = new w1(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final z1 f2231x = new z1(this);

    /* renamed from: y, reason: collision with root package name */
    public final y1 f2232y = new y1(this);

    /* renamed from: z, reason: collision with root package name */
    public final w1 f2233z = new w1(this, 0);
    public final Rect B = new Rect();

    /* JADX WARN: Type inference failed for: r0v9, types: [k.b0, android.widget.PopupWindow] */
    public a2(Context context, AttributeSet attributeSet, int i3, int i4) {
        Drawable drawable;
        int resourceId;
        this.f2214f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1541o, i3, 0);
        this.f2218k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2219l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2221n = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1545s, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = a.y.B(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.E = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void a(int i3) {
        this.f2218k = i3;
    }

    @Override // j.c0
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int d() {
        return this.f2218k;
    }

    @Override // j.c0
    public final void dismiss() {
        b0 b0Var = this.E;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.f2230w);
    }

    @Override // j.c0
    public final void f() {
        int i3;
        boolean z2;
        int makeMeasureSpec;
        int i4;
        int i5;
        boolean z3;
        n1 n1Var;
        int i6;
        int i7;
        n1 n1Var2 = this.h;
        Context context = this.f2214f;
        b0 b0Var = this.E;
        if (n1Var2 == null) {
            n1 q3 = q(context, !this.D);
            this.h = q3;
            q3.setAdapter(this.f2215g);
            this.h.setOnItemClickListener(this.f2228u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new t1(this));
            this.h.setOnScrollListener(this.f2232y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2229v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            b0Var.setContentView(this.h);
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.B;
        int i8 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i9 = rect.top;
            i3 = rect.bottom + i9;
            if (!this.f2221n) {
                this.f2219l = -i9;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        if (b0Var.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a3 = u1.a(b0Var, this.f2227t, this.f2219l, z2);
        int i10 = this.f2216i;
        if (i10 == -1) {
            i5 = a3 + i3;
        } else {
            int i11 = this.f2217j;
            if (i11 != -2) {
                if (i11 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a4 = this.h.a(makeMeasureSpec, a3);
            if (a4 > 0) {
                i4 = this.h.getPaddingBottom() + this.h.getPaddingTop() + i3;
            } else {
                i4 = 0;
            }
            i5 = a4 + i4;
        }
        if (b0Var.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        b0Var.setWindowLayoutType(this.f2220m);
        if (b0Var.isShowing()) {
            if (this.f2227t.isAttachedToWindow()) {
                int i12 = this.f2217j;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.f2227t.getWidth();
                }
                if (i10 == -1) {
                    if (z3) {
                        i10 = i5;
                    } else {
                        i10 = -1;
                    }
                    int i13 = this.f2217j;
                    if (z3) {
                        if (i13 == -1) {
                            i7 = -1;
                        } else {
                            i7 = 0;
                        }
                        b0Var.setWidth(i7);
                        b0Var.setHeight(0);
                    } else {
                        if (i13 == -1) {
                            i8 = -1;
                        }
                        b0Var.setWidth(i8);
                        b0Var.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = i5;
                }
                b0Var.setOutsideTouchable(true);
                int i14 = i12;
                View view = this.f2227t;
                int i15 = this.f2218k;
                int i16 = this.f2219l;
                if (i14 < 0) {
                    i6 = -1;
                } else {
                    i6 = i14;
                }
                if (i10 < 0) {
                    i10 = -1;
                }
                b0Var.update(view, i15, i16, i6, i10);
                return;
            }
            return;
        }
        int i17 = this.f2217j;
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = this.f2227t.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = i5;
        }
        b0Var.setWidth(i17);
        b0Var.setHeight(i10);
        v1.b(b0Var, true);
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f2231x);
        if (this.f2223p) {
            b0Var.setOverlapAnchor(this.f2222o);
        }
        v1.a(b0Var, this.C);
        b0Var.showAsDropDown(this.f2227t, this.f2218k, this.f2219l, this.f2224q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (n1Var = this.h) != null) {
            n1Var.setListSelectionHidden(true);
            n1Var.requestLayout();
        }
        if (!this.D) {
            this.A.post(this.f2233z);
        }
    }

    public final int g() {
        if (!this.f2221n) {
            return 0;
        }
        return this.f2219l;
    }

    public final Drawable h() {
        return this.E.getBackground();
    }

    @Override // j.c0
    public final n1 k() {
        return this.h;
    }

    public final void m(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void n(int i3) {
        this.f2219l = i3;
        this.f2221n = true;
    }

    public void o(ListAdapter listAdapter) {
        x1 x1Var = this.f2226s;
        if (x1Var == null) {
            this.f2226s = new x1(this);
        } else {
            ListAdapter listAdapter2 = this.f2215g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(x1Var);
            }
        }
        this.f2215g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2226s);
        }
        n1 n1Var = this.h;
        if (n1Var != null) {
            n1Var.setAdapter(this.f2215g);
        }
    }

    public n1 q(Context context, boolean z2) {
        return new n1(context, z2);
    }

    public final void r(int i3) {
        Drawable background = this.E.getBackground();
        if (background != null) {
            Rect rect = this.B;
            background.getPadding(rect);
            this.f2217j = rect.left + rect.right + i3;
            return;
        }
        this.f2217j = i3;
    }
}
