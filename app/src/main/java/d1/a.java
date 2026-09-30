package d1;

import a.y;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.logistics.rider.lsposed.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {
    public static volatile a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1394e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1397c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1396b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1395a = new HashMap();

    public a(Context context) {
        this.f1397c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (f1394e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1397c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1396b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f1395a;
        if (e1.a.a()) {
            try {
                y.i(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a3 = bVar.a();
                    if (!a3.isEmpty()) {
                        for (Class cls2 : a3) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.b(this.f1397c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
