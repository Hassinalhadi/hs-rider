package k;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2 f2432g;

    public /* synthetic */ w1(a2 a2Var, int i3) {
        this.f2431f = i3;
        this.f2432g = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2431f) {
            case 0:
                n1 n1Var = this.f2432g.h;
                if (n1Var != null) {
                    n1Var.setListSelectionHidden(true);
                    n1Var.requestLayout();
                    return;
                }
                return;
            default:
                a2 a2Var = this.f2432g;
                n1 n1Var2 = a2Var.h;
                if (n1Var2 != null && n1Var2.isAttachedToWindow() && a2Var.h.getCount() > a2Var.h.getChildCount() && a2Var.h.getChildCount() <= a2Var.f2225r) {
                    a2Var.E.setInputMethodMode(2);
                    a2Var.f();
                    return;
                }
                return;
        }
    }
}
