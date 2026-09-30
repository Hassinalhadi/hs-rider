package b1;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f920a;

    /* renamed from: b, reason: collision with root package name */
    public int f921b;

    /* renamed from: c, reason: collision with root package name */
    public int f922c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f923e;

    /* renamed from: f, reason: collision with root package name */
    public int f924f;

    /* renamed from: g, reason: collision with root package name */
    public int f925g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f926i;

    /* renamed from: j, reason: collision with root package name */
    public int f927j;

    /* renamed from: k, reason: collision with root package name */
    public List f928k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f929l;

    public final void a(View view) {
        int b3;
        int size = this.f928k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((c1) this.f928k.get(i4)).f729a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f877a.h() && (b3 = (o0Var.f877a.b() - this.d) * this.f923e) >= 0 && b3 < i3) {
                view2 = view3;
                if (b3 == 0) {
                    break;
                } else {
                    i3 = b3;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((o0) view2.getLayoutParams()).f877a.b();
        }
    }

    public final View b(t0 t0Var) {
        List list = this.f928k;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = ((c1) this.f928k.get(i3)).f729a;
                o0 o0Var = (o0) view.getLayoutParams();
                if (!o0Var.f877a.h() && this.d == o0Var.f877a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d = t0Var.d(this.d);
        this.d += this.f923e;
        return d;
    }
}
