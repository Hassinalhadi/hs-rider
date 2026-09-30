package b1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f932a;

    /* renamed from: b, reason: collision with root package name */
    public int f933b;

    /* renamed from: c, reason: collision with root package name */
    public int f934c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f935e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f936f;

    /* renamed from: g, reason: collision with root package name */
    public int f937g;

    public final void a(RecyclerView recyclerView) {
        int i3 = this.d;
        if (i3 >= 0) {
            this.d = -1;
            recyclerView.M(i3);
            this.f936f = false;
            return;
        }
        if (this.f936f) {
            Interpolator interpolator = this.f935e;
            if (interpolator != null && this.f934c < 1) {
                a.b.i("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i4 = this.f934c;
            if (i4 >= 1) {
                recyclerView.f613f0.b(this.f932a, this.f933b, i4, interpolator);
                int i5 = this.f937g + 1;
                this.f937g = i5;
                if (i5 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f936f = false;
                return;
            }
            a.b.i("Scroll duration must be a positive number");
            return;
        }
        this.f937g = 0;
    }
}
