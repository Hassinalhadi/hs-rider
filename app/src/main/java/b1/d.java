package b1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f747g;
    public final /* synthetic */ j h;

    public /* synthetic */ d(j jVar, ArrayList arrayList, int i3) {
        this.f746f = i3;
        this.h = jVar;
        this.f747g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.f746f) {
            case 0:
                ArrayList arrayList = this.f747g;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    j jVar = this.h;
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        i iVar = (i) obj;
                        c1 c1Var = iVar.f781a;
                        int i4 = iVar.f782b;
                        int i5 = iVar.f783c;
                        int i6 = iVar.d;
                        int i7 = iVar.f784e;
                        jVar.getClass();
                        View view2 = c1Var.f729a;
                        int i8 = i6 - i4;
                        int i9 = i7 - i5;
                        if (i8 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i9 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        jVar.f799p.add(c1Var);
                        animate.setDuration(jVar.f805e).setListener(new f(jVar, c1Var, i8, view2, i9, animate)).start();
                    } else {
                        arrayList.clear();
                        jVar.f796m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f747g;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    j jVar2 = this.h;
                    if (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        h hVar = (h) obj2;
                        ArrayList arrayList3 = jVar2.f801r;
                        long j3 = jVar2.f806f;
                        c1 c1Var2 = hVar.f775a;
                        View view3 = null;
                        if (c1Var2 == null) {
                            view = null;
                        } else {
                            view = c1Var2.f729a;
                        }
                        c1 c1Var3 = hVar.f776b;
                        if (c1Var3 != null) {
                            view3 = c1Var3.f729a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j3);
                            arrayList3.add(hVar.f775a);
                            duration.translationX(hVar.f778e - hVar.f777c);
                            duration.translationY(hVar.f779f - hVar.d);
                            duration.alpha(0.0f).setListener(new g(jVar2, hVar, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(hVar.f776b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j3).alpha(1.0f).setListener(new g(jVar2, hVar, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        jVar2.f797n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f747g;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    j jVar3 = this.h;
                    if (i11 < size3) {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        c1 c1Var4 = (c1) obj3;
                        jVar3.getClass();
                        View view5 = c1Var4.f729a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        jVar3.f798o.add(c1Var4);
                        animate3.alpha(1.0f).setDuration(jVar3.f804c).setListener(new e(jVar3, c1Var4, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        jVar3.f795l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
