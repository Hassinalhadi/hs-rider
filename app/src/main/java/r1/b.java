package r1;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2806b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f2805a = i3;
        this.f2806b = obj;
    }

    @Override // k2.h
    public final void G(int i3) {
        switch (this.f2805a) {
            case 0:
                return;
            default:
                w1.h hVar = (w1.h) this.f2806b;
                hVar.d = true;
                e eVar = (e) hVar.f3251e.get();
                if (eVar != null) {
                    eVar.z();
                    eVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // k2.h
    public final void H(Typeface typeface, boolean z2) {
        CharSequence text;
        switch (this.f2805a) {
            case 0:
                Chip chip = (Chip) this.f2806b;
                e eVar = chip.f1198j;
                if (eVar.N0) {
                    text = eVar.P;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z2) {
                    w1.h hVar = (w1.h) this.f2806b;
                    hVar.d = true;
                    e eVar2 = (e) hVar.f3251e.get();
                    if (eVar2 != null) {
                        eVar2.z();
                        eVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void Z(int i3) {
    }
}
