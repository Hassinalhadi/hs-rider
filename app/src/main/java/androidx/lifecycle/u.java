package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f585a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f586b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            constructor.newInstance(qVar).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int indexOf = str.indexOf(".", 0);
        if (indexOf >= 0) {
            int length = str.length();
            if (length >= 0) {
                StringBuilder sb2 = new StringBuilder(length);
                do {
                    sb2.append((CharSequence) str, i3, indexOf);
                    sb2.append("_");
                    i3 = indexOf + 1;
                    if (indexOf >= str.length()) {
                        break;
                    }
                    indexOf = str.indexOf(".", i3);
                } while (indexOf > 0);
                sb2.append((CharSequence) str, i3, str.length());
                str = sb2.toString();
            } else {
                throw new OutOfMemoryError();
            }
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        HashMap hashMap = f585a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r3 != null) {
                    str = r3.getName();
                } else {
                    str = "";
                }
                str.getClass();
                if (str.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                canonicalName.getClass();
                String b3 = b(canonicalName);
                if (str.length() != 0) {
                    b3 = str + '.' + b3;
                }
                constructor = Class.forName(b3).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f586b;
            if (constructor != null) {
                List singletonList = Collections.singletonList(constructor);
                singletonList.getClass();
                hashMap2.put(cls, singletonList);
            } else {
                c cVar = c.f552c;
                HashMap hashMap3 = cVar.f554b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (((y) declaredMethods[i4].getAnnotation(y.class)) != null) {
                                    cVar.a(cls, declaredMethods);
                                    z2 = true;
                                    break;
                                }
                                i4++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && q.class.isAssignableFrom(superclass)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        superclass.getClass();
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> cls2 = interfaces[i5];
                            if (cls2 != null && q.class.isAssignableFrom(cls2)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                cls2.getClass();
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                obj2.getClass();
                                arrayList.addAll((Collection) obj2);
                            }
                            i5++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
