package b1;

import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.f f912a;

    /* renamed from: b, reason: collision with root package name */
    public int f913b;

    /* renamed from: c, reason: collision with root package name */
    public int f914c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f915e;

    public u() {
        c();
    }

    public final void a() {
        int k3;
        boolean z2 = this.d;
        androidx.emoji2.text.f fVar = this.f912a;
        if (z2) {
            k3 = fVar.g();
        } else {
            k3 = fVar.k();
        }
        this.f914c = k3;
    }

    public final void b(View view, int i3) {
        int l3;
        androidx.emoji2.text.f fVar = this.f912a;
        int i4 = 0;
        if (Integer.MIN_VALUE == fVar.f280a) {
            l3 = 0;
        } else {
            l3 = fVar.l() - fVar.f280a;
        }
        if (l3 >= 0) {
            boolean z2 = this.d;
            androidx.emoji2.text.f fVar2 = this.f912a;
            if (z2) {
                int b3 = fVar2.b(view);
                androidx.emoji2.text.f fVar3 = this.f912a;
                if (Integer.MIN_VALUE != fVar3.f280a) {
                    i4 = fVar3.l() - fVar3.f280a;
                }
                this.f914c = i4 + b3;
            } else {
                this.f914c = fVar2.e(view);
            }
            this.f913b = i3;
            return;
        }
        this.f913b = i3;
        boolean z3 = this.d;
        androidx.emoji2.text.f fVar4 = this.f912a;
        if (z3) {
            int g3 = (fVar4.g() - l3) - this.f912a.b(view);
            this.f914c = this.f912a.g() - g3;
            if (g3 > 0) {
                int c3 = this.f914c - this.f912a.c(view);
                int k3 = this.f912a.k();
                int min = c3 - (Math.min(this.f912a.e(view) - k3, 0) + k3);
                if (min < 0) {
                    this.f914c = Math.min(g3, -min) + this.f914c;
                    return;
                }
                return;
            }
            return;
        }
        int e3 = fVar4.e(view);
        int k4 = e3 - this.f912a.k();
        this.f914c = e3;
        if (k4 > 0) {
            int g4 = (this.f912a.g() - Math.min(0, (this.f912a.g() - l3) - this.f912a.b(view))) - (this.f912a.c(view) + e3);
            if (g4 < 0) {
                this.f914c -= Math.min(k4, -g4);
            }
        }
    }

    public final void c() {
        this.f913b = -1;
        this.f914c = Integer.MIN_VALUE;
        this.d = false;
        this.f915e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f913b + ", mCoordinate=" + this.f914c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f915e + '}';
    }
}
