package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f3262a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3264c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3265e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3266f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3267g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3268i;

    /* renamed from: j, reason: collision with root package name */
    public int f3269j;

    /* renamed from: k, reason: collision with root package name */
    public View f3270k;

    /* renamed from: l, reason: collision with root package name */
    public View f3271l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3272m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3273n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3274o;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f3263b = false;
        this.f3264c = 0;
        this.d = 0;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3267g = 0;
        this.h = 0;
        this.f3274o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.a.f3192b);
        this.f3264c = obtainStyledAttributes.getInteger(0, 0);
        this.f3266f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f3265e = obtainStyledAttributes.getInteger(6, -1);
        this.f3267g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3263b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f212y;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f212y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f213z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not inflate Behavior subclass ".concat(string), e3);
                }
            }
            this.f3262a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f3262a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public final boolean a(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return false;
            }
            return this.f3273n;
        }
        return this.f3272m;
    }

    public d() {
        super(-2, -2);
        this.f3263b = false;
        this.f3264c = 0;
        this.d = 0;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3267g = 0;
        this.h = 0;
        this.f3274o = new Rect();
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f3263b = false;
        this.f3264c = 0;
        this.d = 0;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3267g = 0;
        this.h = 0;
        this.f3274o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3263b = false;
        this.f3264c = 0;
        this.d = 0;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3267g = 0;
        this.h = 0;
        this.f3274o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3263b = false;
        this.f3264c = 0;
        this.d = 0;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3267g = 0;
        this.h = 0;
        this.f3274o = new Rect();
    }
}
