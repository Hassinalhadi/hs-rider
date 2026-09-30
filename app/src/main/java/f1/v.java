package f1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class v {
    public static int a(ViewGroup viewGroup, int i3) {
        return viewGroup.getChildDrawingOrder(i3);
    }

    public static void b(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
