package k2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i extends h {
    public static Map Z(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                int size2 = arrayList.size();
                if (size2 >= 0) {
                    if (size2 < 3) {
                        size2++;
                    } else if (size2 < 1073741824) {
                        size2 = (int) ((size2 / 0.75f) + 1.0f);
                    } else {
                        size2 = Integer.MAX_VALUE;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(size2);
                int size3 = arrayList.size();
                while (i3 < size3) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    j2.a aVar = (j2.a) obj;
                    linkedHashMap.put(aVar.f2202f, aVar.f2203g);
                }
                return linkedHashMap;
            }
            j2.a aVar2 = (j2.a) arrayList.get(0);
            aVar2.getClass();
            Map singletonMap = Collections.singletonMap(aVar2.f2202f, aVar2.f2203g);
            singletonMap.getClass();
            return singletonMap;
        }
        return f.f2488f;
    }
}
