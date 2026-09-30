package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n.j f376b = new n.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f377a;

    public e0(k0 k0Var) {
        this.f377a = k0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        n.j jVar = f376b;
        n.j jVar2 = (n.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new n.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            jVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e3) {
            a.b.g(str, ": make sure class is a valid subclass of Fragment", e3);
            return null;
        } catch (ClassNotFoundException e4) {
            a.b.g(str, ": make sure class name exists", e4);
            return null;
        }
    }

    public final u a(String str) {
        try {
            return (u) c(this.f377a.f414t.f522g.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            a.b.g(str, ": make sure class name exists, is public, and has an empty constructor that is public", e3);
            return null;
        } catch (InstantiationException e4) {
            a.b.g(str, ": make sure class name exists, is public, and has an empty constructor that is public", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            a.b.g(str, ": could not find Fragment constructor", e5);
            return null;
        } catch (InvocationTargetException e6) {
            a.b.g(str, ": calling Fragment constructor caused an exception", e6);
            return null;
        }
    }
}
