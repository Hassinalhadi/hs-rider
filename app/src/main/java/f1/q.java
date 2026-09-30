package f1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public n f1609f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f1610g;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0 A[EDGE_INSN: B:114:0x01e0->B:115:0x01e0 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.q.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1610g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        r.f1613c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) r.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((n) obj).y(viewGroup);
            }
        }
        this.f1609f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
