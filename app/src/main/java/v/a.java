package v;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public int f3021m;

    /* renamed from: n, reason: collision with root package name */
    public int f3022n;

    /* renamed from: o, reason: collision with root package name */
    public s.a f3023o;

    public boolean getAllowsGoneWidget() {
        return this.f3023o.f2836t0;
    }

    public int getMargin() {
        return this.f3023o.f2837u0;
    }

    public int getType() {
        return this.f3021m;
    }

    @Override // v.c
    public final void h(s.d dVar, boolean z2) {
        int i3 = this.f3021m;
        this.f3022n = i3;
        if (z2) {
            if (i3 == 5) {
                this.f3022n = 1;
            } else if (i3 == 6) {
                this.f3022n = 0;
            }
        } else if (i3 == 5) {
            this.f3022n = 0;
        } else if (i3 == 6) {
            this.f3022n = 1;
        }
        if (dVar instanceof s.a) {
            ((s.a) dVar).f2835s0 = this.f3022n;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3023o.f2836t0 = z2;
    }

    public void setDpMargin(int i3) {
        this.f3023o.f2837u0 = (int) ((i3 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i3) {
        this.f3023o.f2837u0 = i3;
    }

    public void setType(int i3) {
        this.f3021m = i3;
    }
}
