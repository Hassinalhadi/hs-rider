package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class b0 extends androidx.fragment.app.j implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f2013c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar != null) {
            this.f2013c = mVar;
        } else {
            a.b.m("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f2013c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f2013c.addIntentOptions(i3, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = g(menuItemArr2[i7]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f2013c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        n.j jVar = (n.j) this.f394b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f2013c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2013c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return g(this.f2013c.findItem(i3));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return g(this.f2013c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2013c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f2013c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return this.f2013c.performIdentifierAction(i3, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        return this.f2013c.performShortcut(i3, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((n.j) this.f394b) != null) {
            int i4 = 0;
            while (true) {
                n.j jVar = (n.j) this.f394b;
                if (i4 >= jVar.h) {
                    break;
                }
                if (((d0.a) jVar.f(i4)).getGroupId() == i3) {
                    ((n.j) this.f394b).g(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f2013c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((n.j) this.f394b) != null) {
            int i4 = 0;
            while (true) {
                n.j jVar = (n.j) this.f394b;
                if (i4 >= jVar.h) {
                    break;
                }
                if (((d0.a) jVar.f(i4)).getItemId() == i3) {
                    ((n.j) this.f394b).g(i4);
                    break;
                }
                i4++;
            }
        }
        this.f2013c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z2, boolean z3) {
        this.f2013c.setGroupCheckable(i3, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z2) {
        this.f2013c.setGroupEnabled(i3, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z2) {
        this.f2013c.setGroupVisible(i3, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2013c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2013c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return this.f2013c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        return this.f2013c.addSubMenu(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return this.f2013c.addSubMenu(i3, i4, i5, i6);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return g(this.f2013c.add(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return g(this.f2013c.a(i3, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return g(this.f2013c.add(i3, i4, i5, i6));
    }
}
