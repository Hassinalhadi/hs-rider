package b1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f790s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f791g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f792i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f793j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f794k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f795l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f796m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f797n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f798o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f799p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f800q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f801r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c1) arrayList.get(size)).f729a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [b1.h, java.lang.Object] */
    @Override // b1.j0
    public final boolean a(c1 c1Var, c1 c1Var2, i0 i0Var, i0 i0Var2) {
        int i3;
        int i4;
        int i5 = i0Var.f785a;
        int i6 = i0Var.f786b;
        if (c1Var2.o()) {
            int i7 = i0Var.f785a;
            i4 = i0Var.f786b;
            i3 = i7;
        } else {
            i3 = i0Var2.f785a;
            i4 = i0Var2.f786b;
        }
        if (c1Var == c1Var2) {
            return g(c1Var, i5, i6, i3, i4);
        }
        View view = c1Var.f729a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f729a;
        l(c1Var2);
        view2.setTranslationX(-((int) ((i3 - i5) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i6) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f794k;
        ?? obj = new Object();
        obj.f775a = c1Var;
        obj.f776b = c1Var2;
        obj.f777c = i5;
        obj.d = i6;
        obj.f778e = i3;
        obj.f779f = i4;
        arrayList.add(obj);
        return true;
    }

    @Override // b1.j0
    public final void d(c1 c1Var) {
        ArrayList arrayList = this.f795l;
        ArrayList arrayList2 = this.f796m;
        ArrayList arrayList3 = this.f797n;
        View view = c1Var.f729a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f793j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i) arrayList4.get(size)).f781a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f794k, c1Var);
        if (this.h.remove(c1Var)) {
            view.setAlpha(1.0f);
            c(c1Var);
        }
        if (this.f792i.remove(c1Var)) {
            view.setAlpha(1.0f);
            c(c1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, c1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((i) arrayList6.get(size4)).f781a == c1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c1Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(c1Var)) {
                view.setAlpha(1.0f);
                c(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f800q.remove(c1Var);
        this.f798o.remove(c1Var);
        this.f801r.remove(c1Var);
        this.f799p.remove(c1Var);
        i();
    }

    @Override // b1.j0
    public final void e() {
        ArrayList arrayList = this.f794k;
        ArrayList arrayList2 = this.f797n;
        ArrayList arrayList3 = this.f795l;
        ArrayList arrayList4 = this.f796m;
        ArrayList arrayList5 = this.f792i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.f793j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList7.get(size);
            View view = iVar.f781a.f729a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f781a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((c1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c1 c1Var = (c1) arrayList5.get(size3);
            c1Var.f729a.setAlpha(1.0f);
            c(c1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            h hVar = (h) arrayList.get(size4);
            c1 c1Var2 = hVar.f775a;
            if (c1Var2 != null) {
                k(hVar, c1Var2);
            }
            c1 c1Var3 = hVar.f776b;
            if (c1Var3 != null) {
                k(hVar, c1Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                i iVar2 = (i) arrayList8.get(size6);
                View view2 = iVar2.f781a.f729a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(iVar2.f781a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                c1 c1Var4 = (c1) arrayList9.get(size8);
                c1Var4.f729a.setAlpha(1.0f);
                c(c1Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                h hVar2 = (h) arrayList10.get(size10);
                c1 c1Var5 = hVar2.f775a;
                if (c1Var5 != null) {
                    k(hVar2, c1Var5);
                }
                c1 c1Var6 = hVar2.f776b;
                if (c1Var6 != null) {
                    k(hVar2, c1Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList2.remove(arrayList10);
                }
            }
        }
        h(this.f800q);
        h(this.f799p);
        h(this.f798o);
        h(this.f801r);
        ArrayList arrayList11 = this.f803b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            arrayList11.get(0).getClass();
            a.b.c();
        }
    }

    @Override // b1.j0
    public final boolean f() {
        if (this.f792i.isEmpty() && this.f794k.isEmpty() && this.f793j.isEmpty() && this.h.isEmpty() && this.f799p.isEmpty() && this.f800q.isEmpty() && this.f798o.isEmpty() && this.f801r.isEmpty() && this.f796m.isEmpty() && this.f795l.isEmpty() && this.f797n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b1.i, java.lang.Object] */
    public final boolean g(c1 c1Var, int i3, int i4, int i5, int i6) {
        View view = c1Var.f729a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i4 + ((int) c1Var.f729a.getTranslationY());
        l(c1Var);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            c(c1Var);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f793j;
        ?? obj = new Object();
        obj.f781a = c1Var;
        obj.f782b = translationX;
        obj.f783c = translationY;
        obj.d = i5;
        obj.f784e = i6;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f803b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                a.b.c();
            }
        }
    }

    public final void j(ArrayList arrayList, c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (k(hVar, c1Var) && hVar.f775a == null && hVar.f776b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final boolean k(h hVar, c1 c1Var) {
        if (hVar.f776b == c1Var) {
            hVar.f776b = null;
        } else if (hVar.f775a == c1Var) {
            hVar.f775a = null;
        } else {
            return false;
        }
        View view = c1Var.f729a;
        View view2 = c1Var.f729a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(c1Var);
        return true;
    }

    public final void l(c1 c1Var) {
        if (f790s == null) {
            f790s = new ValueAnimator().getInterpolator();
        }
        c1Var.f729a.animate().setInterpolator(f790s);
        d(c1Var);
    }
}
