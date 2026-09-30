package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.logistics.rider.lsposed.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class n1 extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2329f;

    /* renamed from: g, reason: collision with root package name */
    public int f2330g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2331i;

    /* renamed from: j, reason: collision with root package name */
    public int f2332j;

    /* renamed from: k, reason: collision with root package name */
    public int f2333k;

    /* renamed from: l, reason: collision with root package name */
    public l1 f2334l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2335m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2336n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2337o;

    /* renamed from: p, reason: collision with root package name */
    public n0.d f2338p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.g f2339q;

    public n1(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2329f = new Rect();
        this.f2330g = 0;
        this.h = 0;
        this.f2331i = 0;
        this.f2332j = 0;
        this.f2336n = z2;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i4) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            if (i8 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i3, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.n1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2329f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2339q == null) {
            super.drawableStateChanged();
            l1 l1Var = this.f2334l;
            if (l1Var != null) {
                l1Var.f2314g = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2337o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f2336n && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f2336n && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f2336n && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f2336n && this.f2335m) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2339q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2339q == null) {
            androidx.fragment.app.g gVar = new androidx.fragment.app.g(7, this);
            this.f2339q = gVar;
            post(gVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (j1.d) {
                    try {
                        j1.f2279a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        j1.f2280b.invoke(this, Integer.valueOf(pointToPosition));
                        j1.f2281c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2337o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2333k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.g gVar = this.f2339q;
        if (gVar != null) {
            n1 n1Var = (n1) gVar.f384g;
            n1Var.f2339q = null;
            n1Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2335m = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, k.l1, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        l1 l1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f2313f;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f2313f = drawable;
            drawable.setCallback(drawable2);
            drawable2.f2314g = true;
            l1Var = drawable2;
        }
        this.f2334l = l1Var;
        super.setSelector(l1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f2330g = rect.left;
        this.h = rect.top;
        this.f2331i = rect.right;
        this.f2332j = rect.bottom;
    }
}
