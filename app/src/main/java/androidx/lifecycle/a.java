package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f541a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f542b;

    public a(HashMap hashMap) {
        this.f542b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getValue();
            List list = (List) this.f541a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f541a.put(lVar, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                Method method = bVar.f544b;
                try {
                    int i3 = bVar.f543a;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                method.invoke(qVar, rVar, lVar);
                            }
                        } else {
                            method.invoke(qVar, rVar);
                        }
                    } else {
                        method.invoke(qVar, null);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
