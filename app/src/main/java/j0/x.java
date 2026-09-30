package j0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2186e;

    public x(int i3, Class cls, int i4, int i5, int i6) {
        this.f2186e = i6;
        this.f2190a = i3;
        this.d = cls;
        this.f2192c = i4;
        this.f2191b = i5;
    }

    @Override // j0.z
    public final Object b(View view) {
        switch (this.f2186e) {
            case 0:
                return f0.a(view);
            default:
                return Boolean.valueOf(f0.b(view));
        }
    }

    @Override // j0.z
    public final void c(View view, Object obj) {
        switch (this.f2186e) {
            case 0:
                f0.e(view, (CharSequence) obj);
                return;
            default:
                f0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // j0.z
    public final boolean e(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        switch (this.f2186e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z4 = false;
                if (bool != null && bool.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 == z3) {
                    z4 = true;
                }
                return !z4;
        }
    }
}
