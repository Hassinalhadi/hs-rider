package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2072y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2073a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2074b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2075c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public k f2076e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2077f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2078g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2079i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2080j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2081k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2083m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2084n;

    /* renamed from: o, reason: collision with root package name */
    public View f2085o;

    /* renamed from: v, reason: collision with root package name */
    public o f2092v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2094x;

    /* renamed from: l, reason: collision with root package name */
    public int f2082l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2086p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2087q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2088r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2089s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2090t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2091u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2093w = false;

    public m(Context context) {
        boolean z2 = false;
        this.f2073a = context;
        Resources resources = context.getResources();
        this.f2074b = resources;
        this.f2077f = new ArrayList();
        this.f2078g = new ArrayList();
        this.h = true;
        this.f2079i = new ArrayList();
        this.f2080j = new ArrayList();
        this.f2081k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z2 = true;
        }
        this.d = z2;
    }

    public final o a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 >= 0 && i7 < 6) {
            int i8 = (f2072y[i7] << 16) | (65535 & i5);
            o oVar = new o(this, i3, i4, i5, i8, charSequence, this.f2082l);
            ArrayList arrayList = this.f2077f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((o) arrayList.get(size)).d <= i8) {
                        i6 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i6 = 0;
                    break;
                }
            }
            arrayList.add(i6, oVar);
            p(true);
            return oVar;
        }
        a.b.m("order does not contain a valid category.");
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f2074b.getString(i3));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f2073a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f2102g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        o a3 = a(i3, i4, i5, charSequence);
        e0 e0Var = new e0(this.f2073a, this, a3);
        a3.f2109o = e0Var;
        e0Var.setHeaderTitle(a3.f2100e);
        return e0Var;
    }

    public final void b(y yVar, Context context) {
        this.f2091u.add(new WeakReference(yVar));
        yVar.c(context, this);
        this.f2081k = true;
    }

    public final void c(boolean z2) {
        if (this.f2089s) {
            return;
        }
        this.f2089s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z2);
            }
        }
        this.f2089s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f2092v;
        if (oVar != null) {
            d(oVar);
        }
        this.f2077f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2084n = null;
        this.f2083m = null;
        this.f2085o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2092v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = yVar.h(oVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2092v = null;
            }
        }
        return z2;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f2076e;
        if (kVar != null && kVar.h(mVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = yVar.e(oVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2092v = oVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2097a == i3) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f2109o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i3, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f2090t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (n2) {
                c3 = oVar.f2104j;
            } else {
                c3 = oVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n2 && c3 == '\b' && i3 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f2077f.get(i3);
    }

    public final void h(List list, int i3, KeyEvent keyEvent) {
        char c3;
        int i4;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList = this.f2077f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o oVar = (o) arrayList.get(i5);
                if (oVar.hasSubMenu()) {
                    oVar.f2109o.h(list, i3, keyEvent);
                }
                if (n2) {
                    c3 = oVar.f2104j;
                } else {
                    c3 = oVar.h;
                }
                if (n2) {
                    i4 = oVar.f2105k;
                } else {
                    i4 = oVar.f2103i;
                }
                if ((modifiers & 69647) == (i4 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (n2 && c3 == '\b' && i3 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.f2094x) {
            ArrayList arrayList = this.f2077f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((o) arrayList.get(i3)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l3 = l();
        if (!this.f2081k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 |= yVar.d();
            }
        }
        ArrayList arrayList = this.f2079i;
        ArrayList arrayList2 = this.f2080j;
        if (z2) {
            arrayList.clear();
            arrayList2.clear();
            int size = l3.size();
            for (int i3 = 0; i3 < size; i3++) {
                o oVar = (o) l3.get(i3);
                if ((oVar.f2118x & 32) == 32) {
                    arrayList.add(oVar);
                } else {
                    arrayList2.add(oVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f2081k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        if (g(i3, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2078g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2077f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) arrayList2.get(i3);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.h = false;
        this.f2081k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2093w;
    }

    public boolean n() {
        return this.f2075c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (!this.f2086p) {
            if (z2) {
                this.h = true;
                this.f2081k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    y yVar = (y) weakReference.get();
                    if (yVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        yVar.g();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f2087q = true;
        if (z2) {
            this.f2088r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return q(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        boolean z2;
        o g3 = g(i3, keyEvent);
        if (g3 != null) {
            z2 = q(g3, null, i4);
        } else {
            z2 = false;
        }
        if ((i4 & 2) != 0) {
            c(true);
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, j.y r8, int r9) {
        /*
            r6 = this;
            j.o r7 = (j.o) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            j.m r1 = r7.f2108n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f2110p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f2102g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f2073a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            j.p r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f2122b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            j.p r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f2122b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            j.e0 r9 = new j.e0
            android.content.Context r5 = r6.f2073a
            r9.<init>(r5, r6, r7)
            r7.f2109o = r9
            java.lang.CharSequence r5 = r7.f2100e
            r9.setHeaderTitle(r5)
        L90:
            j.e0 r7 = r7.f2109o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f2122b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f2091u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.j(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            j.y r4 = (j.y) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.j(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.m.q(android.view.MenuItem, j.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2091u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (((o) arrayList.get(i5)).f2098b == i3) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((o) arrayList.get(i5)).f2098b != i3) {
                    break;
                }
                if (i5 >= 0 && i5 < arrayList.size()) {
                    arrayList.remove(i5);
                }
                i4 = i6;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (((o) arrayList.get(i4)).f2097a == i3) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 >= 0 && i4 < arrayList.size()) {
            arrayList.remove(i4);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f2077f.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = getItem(i3);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((e0) item.getSubMenu()).s(bundle);
                }
            }
            int i4 = bundle.getInt("android:menu:expandedactionview");
            if (i4 > 0 && (findItem = findItem(i4)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z2, boolean z3) {
        int i4;
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2098b == i3) {
                int i6 = oVar.f2118x & (-5);
                if (z3) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                oVar.f2118x = i6 | i4;
                oVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2093w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z2) {
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2098b == i3) {
                oVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z2) {
        int i4;
        ArrayList arrayList = this.f2077f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2098b == i3) {
                int i6 = oVar.f2118x;
                int i7 = i6 & (-9);
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                int i8 = i7 | i4;
                oVar.f2118x = i8;
                if (i6 != i8) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2075c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2077f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2077f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f2085o = view;
            this.f2083m = null;
            this.f2084n = null;
        } else {
            if (i3 > 0) {
                this.f2083m = this.f2074b.getText(i3);
            } else if (charSequence != null) {
                this.f2083m = charSequence;
            }
            if (i4 > 0) {
                this.f2084n = this.f2073a.getDrawable(i4);
            } else if (drawable != null) {
                this.f2084n = drawable;
            }
            this.f2085o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2086p = false;
        if (this.f2087q) {
            this.f2087q = false;
            p(this.f2088r);
        }
    }

    public final void w() {
        if (!this.f2086p) {
            this.f2086p = true;
            this.f2087q = false;
            this.f2088r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f2074b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f2074b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f2074b.getString(i6));
    }

    public m k() {
        return this;
    }
}
