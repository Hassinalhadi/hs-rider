package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f552c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f553a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f554b = new HashMap();

    public static void b(HashMap hashMap, b bVar, l lVar, Class cls) {
        l lVar2 = (l) hashMap.get(bVar);
        if (lVar2 != null && lVar != lVar2) {
            throw new IllegalArgumentException("Method " + bVar.f544b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
        }
        if (lVar2 == null) {
            hashMap.put(bVar, lVar);
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f553a;
        if (superclass != null) {
            a aVar = (a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, null);
            }
            hashMap.putAll(aVar.f542b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVar2 = (a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, null);
            }
            for (Map.Entry entry : aVar2.f542b.entrySet()) {
                b(hashMap, (b) entry.getKey(), (l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (r.class.isAssignableFrom(parameterTypes[0])) {
                        i3 = 1;
                    } else {
                        a.b.m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i3 = 0;
                }
                l value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (l.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == l.ON_ANY) {
                            i3 = 2;
                        } else {
                            a.b.m("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        a.b.m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new b(i3, method), value, cls);
                    z2 = true;
                } else {
                    a.b.m("cannot have more than 2 params");
                    return null;
                }
            }
        }
        a aVar3 = new a(hashMap);
        hashMap2.put(cls, aVar3);
        this.f554b.put(cls, Boolean.valueOf(z2));
        return aVar3;
    }
}
