package k;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2385f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2386g;
    public final /* synthetic */ View h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2387i;

    public s0(TextView textView, Typeface typeface, int i3) {
        this.h = textView;
        this.f2387i = typeface;
        this.f2386g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2385f) {
            case 0:
                ((TextView) this.h).setTypeface((Typeface) this.f2387i, this.f2386g);
                return;
            default:
                ((BottomSheetBehavior) this.f2387i).E(this.h, this.f2386g, false);
                return;
        }
    }

    public s0(BottomSheetBehavior bottomSheetBehavior, View view, int i3) {
        this.f2387i = bottomSheetBehavior;
        this.h = view;
        this.f2386g = i3;
    }
}
