package h0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1894b;

    public f(e eVar, boolean z2) {
        this.f1894b = eVar;
        this.f1893a = z2;
    }

    public boolean a() {
        return this.f1893a;
    }

    public boolean b(CharSequence charSequence, int i3) {
        if (charSequence != null && i3 >= 0 && charSequence.length() - i3 >= 0) {
            e eVar = (e) this.f1894b;
            if (eVar == null) {
                return a();
            }
            eVar.getClass();
            char c3 = 2;
            for (int i4 = 0; i4 < i3 && c3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                f fVar = g.f1895a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c3 = 2;
                                break;
                        }
                    }
                    c3 = 0;
                }
                c3 = 1;
            }
            if (c3 == 0) {
                return true;
            }
            if (c3 == 1) {
                return false;
            }
            return a();
        }
        throw new IllegalArgumentException();
    }

    public f(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f1894b = bottomSheetBehavior;
        this.f1893a = z2;
    }
}
