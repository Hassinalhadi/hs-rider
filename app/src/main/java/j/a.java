package j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements d0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1997a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1998b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f1999c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f2000e;

    /* renamed from: f, reason: collision with root package name */
    public char f2001f;

    /* renamed from: g, reason: collision with root package name */
    public int f2002g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Context f2003i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2004j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2005k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2006l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2008n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2009o;

    /* renamed from: p, reason: collision with root package name */
    public int f2010p;

    @Override // d0.a
    public final d0.a a(p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // d0.a
    public final p b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f2008n || this.f2009o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f2008n) {
                    mutate.setTintList(this.f2006l);
                }
                if (this.f2009o) {
                    this.h.setTintMode(this.f2007m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // d0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2002g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2001f;
    }

    @Override // d0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2004j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // d0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2006l;
    }

    @Override // d0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2007m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1999c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2000e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1997a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1998b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f1997a;
    }

    @Override // d0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2005k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f2010p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f2010p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f2010p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f2010p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        this.f2001f = Character.toLowerCase(c3);
        this.f2002g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2010p = (z2 ? 1 : 0) | (this.f2010p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i3;
        int i4 = this.f2010p & (-3);
        if (z2) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        this.f2010p = i3 | i4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2004j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        int i3;
        int i4 = this.f2010p & (-17);
        if (z2) {
            i3 = 16;
        } else {
            i3 = 0;
        }
        this.f2010p = i3 | i4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.h = this.f2003i.getDrawable(i3);
        c();
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2006l = colorStateList;
        this.f2008n = true;
        c();
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2007m = mode;
        this.f2009o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1999c = intent;
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        this.d = c3;
        this.f2000e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.d = c3;
        this.f2000e = KeyEvent.normalizeMetaState(i3);
        this.f2001f = Character.toLowerCase(c4);
        this.f2002g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        this.f1997a = this.f2003i.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1998b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2005k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i3 = 8;
        int i4 = this.f2010p & 8;
        if (z2) {
            i3 = 0;
        }
        this.f2010p = i4 | i3;
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final d0.a setContentDescription(CharSequence charSequence) {
        this.f2004j = charSequence;
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final d0.a setTooltipText(CharSequence charSequence) {
        this.f2005k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f2001f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1997a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.d = c3;
        this.f2001f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }
}
