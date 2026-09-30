package androidx.fragment.app;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import b1.c1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.n1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f384g;

    public /* synthetic */ g(int i3, Object obj) {
        this.f383f = i3;
        this.f384g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        boolean z2;
        long j3;
        long j4;
        k.k kVar;
        int i4 = this.f383f;
        Object obj = this.f384g;
        switch (i4) {
            case 0:
                h hVar = (h) obj;
                hVar.f387b.endViewTransition(hVar.f388c);
                hVar.d.d();
                return;
            case 1:
                p pVar = (p) obj;
                pVar.Z.onDismiss(pVar.f458h0);
                return;
            case 2:
                ((k0) obj).y(true);
                return;
            case 3:
                b1.n nVar = (b1.n) obj;
                ValueAnimator valueAnimator = nVar.f862z;
                int i5 = nVar.A;
                if (i5 != 1) {
                    i3 = 2;
                    if (i5 != 2) {
                        return;
                    }
                } else {
                    i3 = 2;
                    valueAnimator.cancel();
                }
                nVar.A = 3;
                float[] fArr = new float[i3];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj;
                b1.j0 j0Var = recyclerView.N;
                if (j0Var != null) {
                    b1.j jVar = (b1.j) j0Var;
                    long j5 = jVar.d;
                    ArrayList arrayList = jVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f793j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f794k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.f792i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int i6 = 0;
                        for (int size = arrayList.size(); i6 < size; size = size) {
                            Object obj2 = arrayList.get(i6);
                            i6++;
                            c1 c1Var = (c1) obj2;
                            View view = c1Var.f729a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            jVar.f800q.add(c1Var);
                            animate.setDuration(j5).alpha(0.0f).setListener(new b1.e(jVar, c1Var, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty4 = isEmpty4;
                        }
                        boolean z3 = isEmpty4;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            jVar.f796m.add(arrayList6);
                            arrayList2.clear();
                            b1.d dVar = new b1.d(jVar, arrayList6, 0);
                            if (!isEmpty) {
                                View view2 = ((b1.i) arrayList6.get(0)).f781a.f729a;
                                WeakHashMap weakHashMap = j0.j0.f2160a;
                                view2.postOnAnimationDelayed(dVar, j5);
                            } else {
                                dVar.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            jVar.f797n.add(arrayList7);
                            arrayList3.clear();
                            b1.d dVar2 = new b1.d(jVar, arrayList7, 1);
                            if (!isEmpty) {
                                View view3 = ((b1.h) arrayList7.get(0)).f775a.f729a;
                                WeakHashMap weakHashMap2 = j0.j0.f2160a;
                                view3.postOnAnimationDelayed(dVar2, j5);
                            } else {
                                dVar2.run();
                            }
                        }
                        if (!z3) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            jVar.f795l.add(arrayList8);
                            arrayList4.clear();
                            b1.d dVar3 = new b1.d(jVar, arrayList8, 2);
                            if (isEmpty && isEmpty2 && isEmpty3) {
                                dVar3.run();
                            } else {
                                if (isEmpty) {
                                    j5 = 0;
                                }
                                if (!isEmpty2) {
                                    j3 = jVar.f805e;
                                } else {
                                    j3 = 0;
                                }
                                if (!isEmpty3) {
                                    j4 = jVar.f806f;
                                } else {
                                    j4 = 0;
                                }
                                long max = Math.max(j3, j4) + j5;
                                z2 = false;
                                View view4 = ((c1) arrayList8.get(0)).f729a;
                                WeakHashMap weakHashMap3 = j0.j0.f2160a;
                                view4.postOnAnimationDelayed(dVar3, max);
                                recyclerView.f630o0 = z2;
                                return;
                            }
                        }
                        z2 = false;
                        recyclerView.f630o0 = z2;
                        return;
                    }
                }
                z2 = false;
                recyclerView.f630o0 = z2;
                return;
            case 5:
                ((StaggeredGridLayoutManager) obj).B0();
                return;
            case 6:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).h.f1457l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 7:
                n1 n1Var = (n1) obj;
                n1Var.f2339q = null;
                n1Var.drawableStateChanged();
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f171k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f171k = false;
                    return;
                }
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) obj).f173f;
                if (actionMenuView != null && (kVar = actionMenuView.f158y) != null) {
                    kVar.l();
                    return;
                }
                return;
            case 10:
                n0.d dVar4 = (n0.d) obj;
                n1 n1Var2 = dVar4.h;
                n0.a aVar = dVar4.f2585f;
                if (dVar4.f2598t) {
                    if (dVar4.f2596r) {
                        dVar4.f2596r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f2580e = currentAnimationTimeMillis;
                        aVar.f2582g = -1L;
                        aVar.f2581f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f2582g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f2582g + aVar.f2583i) || !dVar4.e()) {
                        dVar4.f2598t = false;
                        return;
                    }
                    if (dVar4.f2597s) {
                        dVar4.f2597s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        n1Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f2581f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a3 = aVar.a(currentAnimationTimeMillis2);
                        long j6 = currentAnimationTimeMillis2 - aVar.f2581f;
                        aVar.f2581f = currentAnimationTimeMillis2;
                        dVar4.f2600v.scrollListBy((int) (((float) j6) * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.d));
                        WeakHashMap weakHashMap4 = j0.j0.f2160a;
                        n1Var2.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 11:
                c2.e eVar = (c2.e) obj;
                eVar.f1108c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f1109e;
                p0.d dVar5 = bottomSheetBehavior.O;
                if (dVar5 != null && dVar5.f()) {
                    eVar.a(eVar.f1107b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(eVar.f1107b);
                        return;
                    }
                    return;
                }
            default:
                ((p0.d) obj).n(0);
                return;
        }
    }
}
