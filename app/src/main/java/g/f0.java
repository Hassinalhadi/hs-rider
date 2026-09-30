package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1707b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1708c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final n.j f1709e = new n.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1710a = new Object[2];

    public k.o a(Context context, AttributeSet attributeSet) {
        return new k.o(context, attributeSet);
    }

    public k.q b(Context context, AttributeSet attributeSet) {
        return new k.q(context, attributeSet, com.logistics.rider.lsposed.R.attr.buttonStyle);
    }

    public k.r c(Context context, AttributeSet attributeSet) {
        return new k.r(context, attributeSet, com.logistics.rider.lsposed.R.attr.checkboxStyle);
    }

    public k.d0 d(Context context, AttributeSet attributeSet) {
        return new k.d0(context, attributeSet);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        n.j jVar = f1709e;
        Constructor constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1707b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1710a);
    }
}
