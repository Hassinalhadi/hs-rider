package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f354b;

    public /* synthetic */ b0(k0 k0Var, int i3) {
        this.f353a = i3;
        this.f354b = k0Var;
    }

    public final void a(Object obj) {
        int i3;
        switch (this.f353a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (((Boolean) arrayList.get(i4)).booleanValue()) {
                        i3 = 0;
                    } else {
                        i3 = -1;
                    }
                    iArr[i4] = i3;
                }
                k0 k0Var = this.f354b;
                h0 h0Var = (h0) k0Var.C.pollFirst();
                if (h0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = h0Var.f389f;
                if (k0Var.f399c.g(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                c.a aVar = (c.a) obj;
                k0 k0Var2 = this.f354b;
                h0 h0Var2 = (h0) k0Var2.C.pollFirst();
                if (h0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = h0Var2.f389f;
                int i5 = h0Var2.f390g;
                u g3 = k0Var2.f399c.g(str2);
                if (g3 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                g3.p(i5, aVar.f1076f, aVar.f1077g);
                return;
            default:
                c.a aVar2 = (c.a) obj;
                k0 k0Var3 = this.f354b;
                h0 h0Var3 = (h0) k0Var3.C.pollFirst();
                if (h0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = h0Var3.f389f;
                int i6 = h0Var3.f390g;
                u g4 = k0Var3.f399c.g(str3);
                if (g4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                g4.p(i6, aVar2.f1076f, aVar2.f1077g);
                return;
        }
    }
}
