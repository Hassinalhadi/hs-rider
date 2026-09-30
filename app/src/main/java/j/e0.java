package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.w0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f2037z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f2037z = mVar;
        this.A = oVar;
    }

    @Override // j.m
    public final boolean d(o oVar) {
        return this.f2037z.d(oVar);
    }

    @Override // j.m
    public final boolean e(m mVar, MenuItem menuItem) {
        if (!super.e(mVar, menuItem) && !this.f2037z.e(mVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // j.m
    public final boolean f(o oVar) {
        return this.f2037z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // j.m
    public final String j() {
        int i3;
        o oVar = this.A;
        if (oVar != null) {
            i3 = oVar.f2097a;
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            return null;
        }
        return w0.d("android:menu:actionviewstates:", i3);
    }

    @Override // j.m
    public final m k() {
        return this.f2037z.k();
    }

    @Override // j.m
    public final boolean m() {
        return this.f2037z.m();
    }

    @Override // j.m
    public final boolean n() {
        return this.f2037z.n();
    }

    @Override // j.m
    public final boolean o() {
        return this.f2037z.o();
    }

    @Override // j.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2037z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // j.m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2037z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.A.setIcon(i3);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }
}
