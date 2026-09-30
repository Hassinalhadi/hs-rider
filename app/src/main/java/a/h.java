package a;

import android.os.Bundle;
import androidx.fragment.app.k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24b;

    public /* synthetic */ h(int i3, Object obj) {
        this.f23a = i3;
        this.f24b = obj;
    }

    @Override // c1.c
    public final Bundle a() {
        int i3 = this.f23a;
        Object obj = this.f24b;
        switch (i3) {
            case 0:
                Bundle bundle = new Bundle();
                m mVar = ((g.i) obj).f46m;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f34b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f38g));
                return bundle;
            case 1:
                g.i iVar = (g.i) obj;
                do {
                } while (g.i.l(((androidx.fragment.app.w) iVar.f1716y.f299g).f523i));
                iVar.f1717z.d(androidx.lifecycle.l.ON_STOP);
                return new Bundle();
            default:
                return ((k0) obj).S();
        }
    }
}
