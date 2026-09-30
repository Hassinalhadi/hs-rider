package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g0 extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f385f;

    public /* synthetic */ g0(int i3) {
        this.f385f = i3;
    }

    @Override // a.y
    public final Object X(Intent intent, int i3) {
        boolean z2;
        switch (this.f385f) {
            case 0:
                return new c.a(intent, i3);
            case 1:
                if (i3 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i4 : intArrayExtra) {
                            if (i4 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList.add(Boolean.valueOf(z2));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new j2.a(it.next(), it2.next()));
                        }
                        return k2.i.Z(arrayList3);
                    }
                }
                return k2.f.f2488f;
            default:
                return new c.a(intent, i3);
        }
    }
}
