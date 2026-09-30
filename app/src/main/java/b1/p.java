package b1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f880a;

    /* renamed from: b, reason: collision with root package name */
    public int f881b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f882c;
    public int d;

    public final void a(int i3, int i4) {
        if (i3 >= 0) {
            if (i4 >= 0) {
                int i5 = this.d;
                int i6 = i5 * 2;
                int[] iArr = this.f882c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f882c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i6 >= iArr.length) {
                    int[] iArr3 = new int[i5 * 4];
                    this.f882c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f882c;
                iArr4[i6] = i3;
                iArr4[i6 + 1] = i4;
                this.d++;
                return;
            }
            a.b.m("Pixel distance must be non-negative");
            return;
        }
        a.b.m("Layout positions must be non-negative");
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f882c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        n0 n0Var = recyclerView.f633q;
        if (recyclerView.f631p != null && n0Var != null && n0Var.f869i) {
            if (z2) {
                if (!recyclerView.f617i.f()) {
                    n0Var.i(recyclerView.f631p.a(), this);
                }
            } else if (!recyclerView.K()) {
                n0Var.h(this.f880a, this.f881b, recyclerView.f618i0, this);
            }
            int i3 = this.d;
            if (i3 > n0Var.f870j) {
                n0Var.f870j = i3;
                n0Var.f871k = z2;
                recyclerView.f614g.l();
            }
        }
    }
}
