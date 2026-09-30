package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class u implements c0, y, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public Rect f2129f;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    @Override // j.y
    public final boolean e(o oVar) {
        return false;
    }

    @Override // j.y
    public final boolean h(o oVar) {
        return false;
    }

    public abstract void l(m mVar);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        j jVar;
        int i4;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            jVar = (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            jVar = (j) listAdapter;
        }
        m mVar = jVar.f2067a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i3);
        if (!(this instanceof g)) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        mVar.q(menuItem, this, i4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i3);

    @Override // j.y
    public final void c(Context context, m mVar) {
    }
}
