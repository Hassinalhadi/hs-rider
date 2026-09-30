package b0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f695g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(Object obj, int i3, int i4) {
        this.f694f = i4;
        this.h = obj;
        this.f695g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f694f) {
            case 0:
                ((b) this.h).g(this.f695g);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                View view = (View) sideSheetBehavior.f1312p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f695g, false);
                    return;
                }
                return;
        }
    }
}
