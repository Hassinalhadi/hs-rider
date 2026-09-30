package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.o;
import j.p;
import j.t;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1930a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f1936i;

    /* renamed from: j, reason: collision with root package name */
    public int f1937j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1938k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1939l;

    /* renamed from: m, reason: collision with root package name */
    public int f1940m;

    /* renamed from: n, reason: collision with root package name */
    public char f1941n;

    /* renamed from: o, reason: collision with root package name */
    public int f1942o;

    /* renamed from: p, reason: collision with root package name */
    public char f1943p;

    /* renamed from: q, reason: collision with root package name */
    public int f1944q;

    /* renamed from: r, reason: collision with root package name */
    public int f1945r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1946s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1948u;

    /* renamed from: v, reason: collision with root package name */
    public int f1949v;

    /* renamed from: w, reason: collision with root package name */
    public int f1950w;

    /* renamed from: x, reason: collision with root package name */
    public String f1951x;

    /* renamed from: y, reason: collision with root package name */
    public String f1952y;

    /* renamed from: z, reason: collision with root package name */
    public p f1953z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1931b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1932c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1933e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1934f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1935g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f1930a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f1958c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [i.f, android.view.MenuItem$OnMenuItemClickListener, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z2;
        h hVar = this.E;
        Context context = hVar.f1958c;
        MenuItem enabled = menuItem.setChecked(this.f1946s).setVisible(this.f1947t).setEnabled(this.f1948u);
        boolean z3 = false;
        if (this.f1945r >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.f1939l).setIcon(this.f1940m);
        int i3 = this.f1949v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        if (this.f1952y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f1952y;
                ?? obj2 = new Object();
                obj2.f1928a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f1929b = cls.getMethod(str, f.f1927c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } else {
                a.b.i("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.f1945r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f2118x = (oVar.f2118x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                d0.a aVar = tVar.f2128c;
                try {
                    if (tVar.d == null) {
                        tVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str2 = this.f1951x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f1954e, hVar.f1956a));
            z3 = true;
        }
        int i4 = this.f1950w;
        if (i4 > 0) {
            if (!z3) {
                menuItem.setActionView(i4);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        p pVar = this.f1953z;
        if (pVar != null) {
            if (menuItem instanceof d0.a) {
                ((d0.a) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z4 = menuItem instanceof d0.a;
        if (z4) {
            ((d0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z4) {
            ((d0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c3 = this.f1941n;
        int i5 = this.f1942o;
        if (z4) {
            ((d0.a) menuItem).setAlphabeticShortcut(c3, i5);
        } else {
            menuItem.setAlphabeticShortcut(c3, i5);
        }
        char c4 = this.f1943p;
        int i6 = this.f1944q;
        if (z4) {
            ((d0.a) menuItem).setNumericShortcut(c4, i6);
        } else {
            menuItem.setNumericShortcut(c4, i6);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((d0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z4) {
                ((d0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
