package k;

import android.widget.AbsListView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f2442a;

    public y1(a2 a2Var) {
        this.f2442a = a2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        a2 a2Var = this.f2442a;
        w1 w1Var = a2Var.f2230w;
        b0 b0Var = a2Var.E;
        if (i3 == 1 && b0Var.getInputMethodMode() != 2 && b0Var.getContentView() != null) {
            a2Var.A.removeCallbacks(w1Var);
            w1Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
