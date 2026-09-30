package a;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f0a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.emoji2.text.w f2c;
    public final androidx.fragment.app.c0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3e;

    public a0(androidx.fragment.app.c0 c0Var, b0 b0Var) {
        c0Var.getClass();
        boolean z2 = c0Var.f369b;
        this.f0a = b0Var;
        this.f1b = z2;
        this.d = c0Var;
        this.f3e = true;
    }

    public final void a() {
        androidx.emoji2.text.w wVar = this.f2c;
        if (wVar != null && ((LinkedHashSet) wVar.h).remove(this)) {
            y0.e eVar = (y0.e) wVar.f321g;
            eVar.getClass();
            if (equals(eVar.f3296f)) {
                if (eVar.f3297g == -1) {
                    this.d.getClass();
                }
                eVar.f3296f = null;
                eVar.f3297g = 0;
                eVar.h = null;
            }
            eVar.d.remove(this);
            eVar.f3295e.remove(this);
            this.f2c = null;
            eVar.b();
        }
    }

    public final void b(boolean z2) {
        boolean z3;
        y0.e eVar;
        this.f3e = z2;
        if (z2 && this.d.f369b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f1b != z3) {
            this.f1b = z3;
            androidx.emoji2.text.w wVar = this.f2c;
            if (wVar != null && (eVar = (y0.e) wVar.f321g) != null) {
                eVar.b();
            }
        }
    }
}
