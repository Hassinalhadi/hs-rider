package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2279a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f2280b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2281c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f2279a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2280b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2281c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
