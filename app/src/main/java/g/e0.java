package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final View f1702f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1703g;
    public Method h;

    /* renamed from: i, reason: collision with root package name */
    public Context f1704i;

    public e0(View view, String str) {
        this.f1702f = view;
        this.f1703g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.h == null) {
            View view2 = this.f1702f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f1703g;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.h = method;
                            this.f1704i = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.h.invoke(this.f1704i, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
