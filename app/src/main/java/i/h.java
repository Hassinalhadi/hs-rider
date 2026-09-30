package i;

import a.y;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j.p;
import java.io.IOException;
import k.h1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1954e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1955f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1957b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1958c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f1954e = clsArr;
        f1955f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f1958c = context;
        Object[] objArr = {context};
        this.f1956a = objArr;
        this.f1957b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i3;
        XmlPullParser xmlPullParser2;
        char charAt;
        char charAt2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i3 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType != 1) {
                if (eventType != i3) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z4 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z4 = false;
                            str = null;
                            eventType = xmlPullParser2.next();
                            i3 = 2;
                            z3 = z3;
                            z4 = z4;
                        } else if (name2.equals("group")) {
                            gVar.f1931b = 0;
                            gVar.f1932c = 0;
                            gVar.d = 0;
                            gVar.f1933e = 0;
                            gVar.f1934f = true;
                            gVar.f1935g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                p pVar = gVar.f1953z;
                                if (pVar != null && pVar.f2122b.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(gVar.f1930a.addSubMenu(gVar.f1931b, gVar.f1936i, gVar.f1937j, gVar.f1938k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(gVar.f1930a.add(gVar.f1931b, gVar.f1936i, gVar.f1937j, gVar.f1938k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z3 = true;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z3 = z3;
                } else {
                    if (!z4) {
                        String name3 = xmlPullParser.getName();
                        boolean equals = name3.equals("group");
                        Context context = this.f1958c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1542p);
                            gVar.f1931b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f1932c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.f1933e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f1934f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f1935g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1543q);
                                gVar.f1936i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f1937j = (obtainStyledAttributes2.getInt(5, gVar.f1932c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f1938k = obtainStyledAttributes2.getText(7);
                                gVar.f1939l = obtainStyledAttributes2.getText(8);
                                gVar.f1940m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f1941n = charAt;
                                gVar.f1942o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f1943p = charAt2;
                                gVar.f1944q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f1945r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f1945r = gVar.f1933e;
                                }
                                gVar.f1946s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f1947t = obtainStyledAttributes2.getBoolean(4, gVar.f1934f);
                                gVar.f1948u = obtainStyledAttributes2.getBoolean(1, gVar.f1935g);
                                gVar.f1949v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f1952y = obtainStyledAttributes2.getString(12);
                                gVar.f1950w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f1951x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2 && gVar.f1950w == 0 && gVar.f1951x == null) {
                                    gVar.f1953z = (p) gVar.a(string3, f1955f, this.f1957b);
                                } else {
                                    if (z2) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f1953z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = h1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = y.z(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    gVar.C = colorStateList;
                                } else {
                                    gVar.C = null;
                                }
                                obtainStyledAttributes2.recycle();
                                gVar.h = false;
                                xmlPullParser2 = xmlPullParser;
                            } else if (name3.equals("menu")) {
                                gVar.h = true;
                                SubMenu addSubMenu = gVar.f1930a.addSubMenu(gVar.f1931b, gVar.f1936i, gVar.f1937j, gVar.f1938k);
                                gVar.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z4 = true;
                            }
                            eventType = xmlPullParser2.next();
                            i3 = 2;
                            z3 = z3;
                            z4 = z4;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z3 = z3;
                }
                eventType = xmlPullParser2.next();
                i3 = 2;
                z3 = z3;
                z4 = z4;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof j.m)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f1958c.getResources().getLayout(i3);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof j.m) {
                    j.m mVar = (j.m) menu;
                    if (!mVar.f2086p) {
                        mVar.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((j.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z2) {
                ((j.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
