package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f1927c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f1928a;

    /* renamed from: b, reason: collision with root package name */
    public Method f1929b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f1928a;
        Method method = this.f1929b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
