package b1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f816a;

    public k(n nVar) {
        this.f816a = nVar;
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        boolean z2;
        boolean z3;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        n nVar = this.f816a;
        int i5 = nVar.f839a;
        int computeVerticalScrollRange = nVar.f855s.computeVerticalScrollRange();
        int i6 = nVar.f854r;
        if (computeVerticalScrollRange - i6 > 0 && i6 >= i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        nVar.f856t = z2;
        int computeHorizontalScrollRange = nVar.f855s.computeHorizontalScrollRange();
        int i7 = nVar.f853q;
        if (computeHorizontalScrollRange - i7 > 0 && i7 >= i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        nVar.f857u = z3;
        boolean z4 = nVar.f856t;
        if (!z4 && !z3) {
            if (nVar.f858v != 0) {
                nVar.f(0);
                return;
            }
            return;
        }
        if (z4) {
            float f3 = i6;
            nVar.f848l = (int) ((((f3 / 2.0f) + computeVerticalScrollOffset) * f3) / computeVerticalScrollRange);
            nVar.f847k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (nVar.f857u) {
            float f4 = computeHorizontalScrollOffset;
            float f5 = i7;
            nVar.f851o = (int) ((((f5 / 2.0f) + f4) * f5) / computeHorizontalScrollRange);
            nVar.f850n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = nVar.f858v;
        if (i8 != 0 && i8 != 1) {
            return;
        }
        nVar.f(1);
    }
}
