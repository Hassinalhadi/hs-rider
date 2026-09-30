package j;

import android.view.MenuItem;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2125b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2125b = tVar;
        this.f2124a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2124a.onMenuItemActionCollapse(this.f2125b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2124a.onMenuItemActionExpand(this.f2125b.g(menuItem));
    }
}
