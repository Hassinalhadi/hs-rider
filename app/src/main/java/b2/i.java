package b2;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i extends k2.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f997a;

    public i(int i3) {
        this.f997a = i3;
    }

    @Override // k2.h
    public final void X(x xVar, float f3) {
        j jVar = (j) xVar;
        float[] fArr = jVar.E;
        if (fArr != null) {
            int i3 = this.f997a;
            if (fArr[i3] != f3) {
                fArr[i3] = f3;
                a.c0 c0Var = jVar.G;
                if (c0Var != null) {
                    float g3 = jVar.g();
                    MaterialButton materialButton = (MaterialButton) c0Var.f9f;
                    int i4 = (int) (g3 * 0.11f);
                    if (materialButton.C != i4) {
                        materialButton.C = i4;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // k2.h
    public final float t(x xVar) {
        float[] fArr = ((j) xVar).E;
        if (fArr != null) {
            return fArr[this.f997a];
        }
        return 0.0f;
    }
}
