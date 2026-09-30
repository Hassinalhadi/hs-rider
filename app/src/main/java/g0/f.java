package g0;

import androidx.emoji2.text.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f implements i0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1795b;

    public /* synthetic */ f(int i3, Object obj) {
        this.f1794a = i3;
        this.f1795b = obj;
    }

    @Override // i0.a
    public final void accept(Object obj) {
        switch (this.f1794a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((p) this.f1795b).C(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f1800c) {
                    try {
                        n.j jVar = h.d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f1795b);
                        if (arrayList != null) {
                            jVar.remove((String) this.f1795b);
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                ((i0.a) arrayList.get(i3)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
