package i;

import android.view.View;
import android.view.animation.Interpolator;
import j0.k0;
import j0.l0;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f1964c;
    public l0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1965e;

    /* renamed from: b, reason: collision with root package name */
    public long f1963b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f1966f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1962a = new ArrayList();

    public final void a() {
        if (!this.f1965e) {
            return;
        }
        ArrayList arrayList = this.f1962a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((k0) obj).b();
        }
        this.f1965e = false;
    }

    public final void b() {
        View view;
        if (this.f1965e) {
            return;
        }
        ArrayList arrayList = this.f1962a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            k0 k0Var = (k0) obj;
            long j3 = this.f1963b;
            if (j3 >= 0) {
                k0Var.c(j3);
            }
            Interpolator interpolator = this.f1964c;
            if (interpolator != null && (view = (View) k0Var.f2167a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                k0Var.d(this.f1966f);
            }
            View view2 = (View) k0Var.f2167a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1965e = true;
    }
}
