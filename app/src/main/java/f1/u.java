package f1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f1617b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1616a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1618c = new ArrayList();

    public u(View view) {
        this.f1617b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f1617b == uVar.f1617b && this.f1616a.equals(uVar.f1616a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1616a.hashCode() + (this.f1617b.hashCode() * 31);
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1617b + "\n").concat("    values:");
        HashMap hashMap = this.f1616a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
