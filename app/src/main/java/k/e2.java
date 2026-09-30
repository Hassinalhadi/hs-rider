package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e2 extends n1 {

    /* renamed from: r, reason: collision with root package name */
    public final int f2253r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2254s;

    /* renamed from: t, reason: collision with root package name */
    public b2 f2255t;

    /* renamed from: u, reason: collision with root package name */
    public j.o f2256u;

    public e2(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2253r = 21;
            this.f2254s = 22;
        } else {
            this.f2253r = 22;
            this.f2254s = 21;
        }
    }

    @Override // k.n1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.j jVar;
        int i3;
        j.o oVar;
        int pointToPosition;
        int i4;
        if (this.f2255t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                jVar = (j.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (j.j) adapter;
                i3 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i4 = pointToPosition - i3) >= 0 && i4 < jVar.getCount()) {
                oVar = jVar.getItem(i4);
            } else {
                oVar = null;
            }
            j.o oVar2 = this.f2256u;
            if (oVar2 != oVar) {
                j.m mVar = jVar.f2067a;
                if (oVar2 != null) {
                    this.f2255t.j(mVar, oVar2);
                }
                this.f2256u = oVar;
                if (oVar != null) {
                    this.f2255t.c(mVar, oVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        j.j jVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f2253r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i3 == this.f2254s) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                jVar = (j.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                jVar = (j.j) adapter;
            }
            jVar.f2067a.c(false);
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    public void setHoverListener(b2 b2Var) {
        this.f2255t = b2Var;
    }

    @Override // k.n1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
