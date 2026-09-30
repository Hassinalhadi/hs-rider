package c2;

import a.k;
import android.view.View;
import androidx.fragment.app.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1106a;

    /* renamed from: b, reason: collision with root package name */
    public int f1107b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1108c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.a f1109e;

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f1106a = 1;
        this.f1109e = bottomSheetBehavior;
        this.d = new g(11, this);
    }

    public final void a(int i3) {
        switch (this.f1106a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1109e;
                WeakReference weakReference = sideSheetBehavior.f1312p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1107b = i3;
                    if (!this.f1108c) {
                        ((View) sideSheetBehavior.f1312p.get()).postOnAnimation((k) this.d);
                        this.f1108c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1109e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1107b = i3;
                    if (!this.f1108c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((g) this.d);
                        this.f1108c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f1106a = 0;
        this.f1109e = sideSheetBehavior;
        this.d = new k(4, this);
    }
}
