package b1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f1 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f763a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f764b;

    public f1(b0 b0Var) {
        this.f764b = b0Var;
    }

    @Override // b1.q0
    public final void a(int i3) {
        if (i3 == 0 && this.f763a) {
            this.f763a = false;
            this.f764b.f();
        }
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f763a = true;
    }
}
