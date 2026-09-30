package j;

import android.view.MenuItem;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2127b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2127b = tVar;
        this.f2126a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2126a.onMenuItemClick(this.f2127b.g(menuItem));
    }
}
