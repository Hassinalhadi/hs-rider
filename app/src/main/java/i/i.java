package i;

import a.y;
import j0.l0;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1960g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1961i;

    public i(j jVar) {
        this.f1959f = 0;
        this.f1961i = jVar;
        this.f1960g = false;
        this.h = 0;
    }

    @Override // j0.l0
    public final void a() {
        switch (this.f1959f) {
            case 0:
                int i3 = this.h + 1;
                this.h = i3;
                j jVar = (j) this.f1961i;
                if (i3 == jVar.f1962a.size()) {
                    l0 l0Var = jVar.d;
                    if (l0Var != null) {
                        l0Var.a();
                    }
                    this.h = 0;
                    this.f1960g = false;
                    jVar.f1965e = false;
                    return;
                }
                return;
            default:
                if (!this.f1960g) {
                    ((y2) this.f1961i).f2443a.setVisibility(this.h);
                    return;
                }
                return;
        }
    }

    @Override // a.y, j0.l0
    public void c() {
        switch (this.f1959f) {
            case 1:
                this.f1960g = true;
                return;
            default:
                return;
        }
    }

    @Override // a.y, j0.l0
    public final void g() {
        switch (this.f1959f) {
            case 0:
                if (!this.f1960g) {
                    this.f1960g = true;
                    l0 l0Var = ((j) this.f1961i).d;
                    if (l0Var != null) {
                        l0Var.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((y2) this.f1961i).f2443a.setVisibility(0);
                return;
        }
    }

    public i(y2 y2Var, int i3) {
        this.f1959f = 1;
        this.f1961i = y2Var;
        this.h = i3;
        this.f1960g = false;
    }
}
