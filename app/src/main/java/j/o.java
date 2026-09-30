package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o implements d0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2098b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2099c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2100e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2101f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2102g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2104j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2106l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2108n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f2109o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2110p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2111q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2112r;

    /* renamed from: y, reason: collision with root package name */
    public int f2119y;

    /* renamed from: z, reason: collision with root package name */
    public View f2120z;

    /* renamed from: i, reason: collision with root package name */
    public int f2103i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2105k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2107m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2113s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2114t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2115u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2116v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2117w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2118x = 16;
    public boolean C = false;

    public o(m mVar, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f2108n = mVar;
        this.f2097a = i4;
        this.f2098b = i3;
        this.f2099c = i5;
        this.d = i6;
        this.f2100e = charSequence;
        this.f2119y = i7;
    }

    public static void c(int i3, int i4, String str, StringBuilder sb) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // d0.a
    public final d0.a a(p pVar) {
        this.f2120z = null;
        this.A = pVar;
        this.f2108n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f2121a = new androidx.emoji2.text.m(12, this);
            pVar2.f2122b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // d0.a
    public final p b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2119y & 8) != 0) {
            if (this.f2120z == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
                return false;
            }
            return this.f2108n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2117w && (this.f2115u || this.f2116v)) {
            drawable = drawable.mutate();
            if (this.f2115u) {
                drawable.setTintList(this.f2113s);
            }
            if (this.f2116v) {
                drawable.setTintMode(this.f2114t);
            }
            this.f2117w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2119y & 8) != 0) {
            if (this.f2120z == null && (pVar = this.A) != null) {
                this.f2120z = pVar.f2122b.onCreateActionView(this);
            }
            if (this.f2120z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f2108n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        int i3 = this.f2118x;
        if (z2) {
            this.f2118x = i3 | 32;
        } else {
            this.f2118x = i3 & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2120z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar != null) {
            View onCreateActionView = pVar.f2122b.onCreateActionView(this);
            this.f2120z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // d0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2105k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2104j;
    }

    @Override // d0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2111q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2098b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2106l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f2107m;
        if (i3 != 0) {
            Drawable B = a.y.B(this.f2108n.f2073a, i3);
            this.f2107m = 0;
            this.f2106l = B;
            return d(B);
        }
        return null;
    }

    @Override // d0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2113s;
    }

    @Override // d0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2114t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2102g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2097a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2103i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2099c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2109o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2100e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2101f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f2100e;
    }

    @Override // d0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2112r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f2109o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f2118x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f2118x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f2118x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        if (pVar != null && pVar.f2122b.overridesItemVisibility()) {
            if ((this.f2118x & 8) != 0 || !this.A.f2122b.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f2118x & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        m mVar = this.f2108n;
        Context context = mVar.f2073a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f2120z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f2097a) > 0) {
            inflate.setId(i4);
        }
        mVar.f2081k = true;
        mVar.p(true);
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f2104j == c3 && this.f2105k == i3) {
            return this;
        }
        this.f2104j = Character.toLowerCase(c3);
        this.f2105k = KeyEvent.normalizeMetaState(i3);
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i3 = this.f2118x;
        int i4 = (z2 ? 1 : 0) | (i3 & (-2));
        this.f2118x = i4;
        if (i3 != i4) {
            this.f2108n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        boolean z3;
        int i3;
        int i4 = this.f2118x;
        int i5 = i4 & 4;
        int i6 = 2;
        m mVar = this.f2108n;
        if (i5 != 0) {
            ArrayList arrayList = mVar.f2077f;
            int size = arrayList.size();
            mVar.w();
            for (int i7 = 0; i7 < size; i7++) {
                o oVar = (o) arrayList.get(i7);
                if (oVar.f2098b == this.f2098b && (oVar.f2118x & 4) != 0 && oVar.isCheckable()) {
                    if (oVar == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i8 = oVar.f2118x;
                    int i9 = i8 & (-3);
                    if (z3) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i10 = i3 | i9;
                    oVar.f2118x = i10;
                    if (i8 != i10) {
                        oVar.f2108n.p(false);
                    }
                }
            }
            mVar.v();
            return this;
        }
        int i11 = i4 & (-3);
        if (!z2) {
            i6 = 0;
        }
        int i12 = i11 | i6;
        this.f2118x = i12;
        if (i4 != i12) {
            mVar.p(false);
        }
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final d0.a setContentDescription(CharSequence charSequence) {
        this.f2111q = charSequence;
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        int i3 = this.f2118x;
        if (z2) {
            this.f2118x = i3 | 16;
        } else {
            this.f2118x = i3 & (-17);
        }
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f2106l = null;
        this.f2107m = i3;
        this.f2117w = true;
        this.f2108n.p(false);
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2113s = colorStateList;
        this.f2115u = true;
        this.f2117w = true;
        this.f2108n.p(false);
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2114t = mode;
        this.f2116v = true;
        this.f2117w = true;
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2102g = intent;
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.h == c3 && this.f2103i == i3) {
            return this;
        }
        this.h = c3;
        this.f2103i = KeyEvent.normalizeMetaState(i3);
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2110p = onMenuItemClickListener;
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.h = c3;
        this.f2103i = KeyEvent.normalizeMetaState(i3);
        this.f2104j = Character.toLowerCase(c4);
        this.f2105k = KeyEvent.normalizeMetaState(i4);
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            a.b.m("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f2119y = i3;
        m mVar = this.f2108n;
        mVar.f2081k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2100e = charSequence;
        this.f2108n.p(false);
        e0 e0Var = this.f2109o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2101f = charSequence;
        this.f2108n.p(false);
        return this;
    }

    @Override // d0.a, android.view.MenuItem
    public final d0.a setTooltipText(CharSequence charSequence) {
        this.f2112r = charSequence;
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i3;
        int i4 = this.f2118x;
        int i5 = i4 & (-9);
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        int i6 = i3 | i5;
        this.f2118x = i6;
        if (i4 != i6) {
            m mVar = this.f2108n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2100e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2107m = 0;
        this.f2106l = drawable;
        this.f2117w = true;
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f2108n.f2073a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.h = c3;
        this.f2104j = Character.toLowerCase(c4);
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f2104j == c3) {
            return this;
        }
        this.f2104j = Character.toLowerCase(c3);
        this.f2108n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f2120z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f2097a) > 0) {
            view.setId(i3);
        }
        m mVar = this.f2108n;
        mVar.f2081k = true;
        mVar.p(true);
        return this;
    }
}
