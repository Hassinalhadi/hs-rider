package a;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f35c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f36e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f38g = new Bundle();

    public final boolean a(int i3, int i4, Intent intent) {
        androidx.fragment.app.b0 b0Var;
        String str = (String) this.f33a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        c.b bVar = (c.b) this.f36e.get(str);
        if (bVar != null) {
            b0Var = bVar.f1078a;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                bVar.f1078a.a(bVar.f1079b.X(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f37f.remove(str);
        this.f38g.putParcelable(str, new c.a(intent, i4));
        return true;
    }

    public final androidx.emoji2.text.p b(String str, y yVar, androidx.fragment.app.b0 b0Var) {
        Object parcelable;
        LinkedHashMap linkedHashMap = this.f34b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            x xVar = new x(1);
            for (Number number : new v2.a(new v2.c(xVar, new c0(xVar)))) {
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.f33a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f36e.put(str, new c.b(b0Var, yVar));
        LinkedHashMap linkedHashMap3 = this.f37f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            b0Var.a(obj);
        }
        int i3 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f38g;
        if (i3 >= 34) {
            parcelable = f0.a.a(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!c.a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        c.a aVar = (c.a) parcelable;
        if (aVar != null) {
            bundle.remove(str);
            b0Var.a(yVar.X(aVar.f1077g, aVar.f1076f));
        }
        return new androidx.emoji2.text.p(this, str, 9);
    }
}
