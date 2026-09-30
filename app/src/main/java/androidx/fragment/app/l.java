package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f421a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f422b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f423c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424e = false;

    public l(ViewGroup viewGroup) {
        this.f421a = viewGroup;
    }

    public static l f(ViewGroup viewGroup, b2.f fVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof l) {
            return (l) tag;
        }
        fVar.getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f0.c, java.lang.Object] */
    public final void a(int i3, int i4, q0 q0Var) {
        synchronized (this.f422b) {
            try {
                ?? obj = new Object();
                v0 d = d(q0Var.f467c);
                if (d != null) {
                    d.c(i3, i4);
                    return;
                }
                v0 v0Var = new v0(i3, i4, q0Var, obj);
                this.f422b.add(v0Var);
                v0Var.d.add(new u0(this, v0Var, 0));
                v0Var.d.add(new u0(this, v0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v18, types: [f0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [androidx.fragment.app.j, java.lang.Object, androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r15v8, types: [f0.c, java.lang.Object] */
    public final void b(ArrayList arrayList, boolean z2) {
        boolean z3;
        int i3;
        ViewGroup viewGroup;
        boolean z4;
        boolean z5;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        v0 v0Var = null;
        v0 v0Var2 = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            v0 v0Var3 = (v0) obj;
            int c3 = w0.c(v0Var3.f517c.J);
            int a3 = q.e.a(v0Var3.f515a);
            if (a3 != 0) {
                if (a3 != 1) {
                    if (a3 != 2 && a3 != 3) {
                    }
                } else if (c3 != 2) {
                    v0Var2 = v0Var3;
                }
            }
            if (c3 == 2 && v0Var == null) {
                v0Var = v0Var3;
            }
        }
        if (k0.F(2)) {
            Log.v("FragmentManager", "Executing operations from " + v0Var + " to " + v0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        u uVar = ((v0) arrayList2.get(arrayList2.size() - 1)).f517c;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            s sVar = ((v0) obj2).f517c.M;
            s sVar2 = uVar.M;
            sVar.f478b = sVar2.f478b;
            sVar.f479c = sVar2.f479c;
            sVar.d = sVar2.d;
            sVar.f480e = sVar2.f480e;
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            v0 v0Var4 = (v0) obj3;
            ?? obj4 = new Object();
            v0Var4.d();
            HashSet hashSet = v0Var4.f518e;
            hashSet.add(obj4);
            ?? jVar = new j(v0Var4, obj4);
            jVar.d = false;
            jVar.f391c = z2;
            arrayList3.add(jVar);
            ?? obj5 = new Object();
            v0Var4.d();
            hashSet.add(obj5);
            if (!z2 ? v0Var4 == v0Var2 : v0Var4 == v0Var) {
                z5 = true;
            } else {
                z5 = false;
            }
            j jVar2 = new j(v0Var4, obj5);
            int i7 = v0Var4.f515a;
            u uVar2 = v0Var4.f517c;
            if (i7 == 2) {
                if (z2) {
                    s sVar3 = uVar2.M;
                } else {
                    uVar2.getClass();
                }
                if (z2) {
                    s sVar4 = uVar2.M;
                } else {
                    s sVar5 = uVar2.M;
                }
            } else if (z2) {
                s sVar6 = uVar2.M;
            } else {
                uVar2.getClass();
            }
            if (z5) {
                if (z2) {
                    s sVar7 = uVar2.M;
                } else {
                    uVar2.getClass();
                }
            }
            arrayList4.add(jVar2);
            v0Var4.d.add(new e(this, arrayList5, v0Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj6 = arrayList4.get(i8);
            i8++;
            v0 v0Var5 = (v0) ((k) obj6).f393a;
            if (w0.c(v0Var5.f517c.J) != v0Var5.f515a) {
            }
        }
        int size5 = arrayList4.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj7 = arrayList4.get(i9);
            i9++;
            k kVar = (k) obj7;
            hashMap.put((v0) kVar.f393a, Boolean.FALSE);
            kVar.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f421a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z6 = false;
        int i10 = 0;
        while (i10 < size6) {
            Object obj8 = arrayList3.get(i10);
            int i11 = i10 + 1;
            i iVar = (i) obj8;
            boolean z7 = containsValue;
            v0 v0Var6 = (v0) iVar.f393a;
            ArrayList arrayList7 = arrayList3;
            int c4 = w0.c(v0Var6.f517c.J);
            int i12 = v0Var6.f515a;
            int i13 = size6;
            if (c4 == i12 || (c4 != 2 && i12 != 2)) {
                z3 = z6;
                i3 = i11;
                viewGroup = viewGroup2;
                iVar.d();
            } else {
                androidx.emoji2.text.p j3 = iVar.j(context);
                if (j3 == null) {
                    iVar.d();
                } else {
                    Animator animator = (Animator) j3.h;
                    if (animator == null) {
                        arrayList6.add(iVar);
                    } else {
                        v0 v0Var7 = (v0) iVar.f393a;
                        u uVar3 = v0Var7.f517c;
                        z3 = z6;
                        i3 = i11;
                        if (Boolean.TRUE.equals(hashMap.get(v0Var7))) {
                            if (k0.F(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + uVar3 + " as this Fragment was involved in a Transition.");
                            }
                            iVar.d();
                            viewGroup = viewGroup2;
                        } else {
                            if (v0Var7.f515a == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                arrayList5.remove(v0Var7);
                            }
                            View view = uVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new f(viewGroup3, view, z4, v0Var7, iVar));
                            animator.setTarget(view);
                            animator.start();
                            if (k0.F(2)) {
                                Log.v("FragmentManager", "Animator from operation " + v0Var7 + " has started.");
                            }
                            ((f0.c) iVar.f394b).a(new androidx.emoji2.text.p(animator, v0Var7, 1));
                            size6 = i13;
                            containsValue = z7;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i10 = i3;
                            z6 = true;
                        }
                    }
                }
                z3 = z6;
                i3 = i11;
                viewGroup = viewGroup2;
            }
            size6 = i13;
            containsValue = z7;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            i10 = i3;
            z6 = z3;
        }
        boolean z8 = containsValue;
        boolean z9 = z6;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i14 = 0;
        while (i14 < size7) {
            Object obj9 = arrayList6.get(i14);
            i14++;
            i iVar2 = (i) obj9;
            v0 v0Var8 = (v0) iVar2.f393a;
            u uVar4 = v0Var8.f517c;
            if (z8) {
                if (k0.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Transitions.");
                }
                iVar2.d();
            } else if (z9) {
                if (k0.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Animators.");
                }
                iVar2.d();
            } else {
                View view2 = uVar4.J;
                androidx.emoji2.text.p j4 = iVar2.j(context);
                j4.getClass();
                Animation animation = (Animation) j4.f301g;
                animation.getClass();
                int i15 = size7;
                if (v0Var8.f515a != 1) {
                    view2.startAnimation(animation);
                    iVar2.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    x xVar = new x(animation, viewGroup4, view2);
                    xVar.setAnimationListener(new h(view2, viewGroup4, iVar2, v0Var8));
                    view2.startAnimation(xVar);
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "Animation from operation " + v0Var8 + " has started.");
                    }
                }
                ((f0.c) iVar2.f394b).a(new androidx.emoji2.text.w(view2, viewGroup4, iVar2, v0Var8));
                size7 = i15;
            }
        }
        int size8 = arrayList5.size();
        int i16 = 0;
        while (i16 < size8) {
            Object obj10 = arrayList5.get(i16);
            i16++;
            v0 v0Var9 = (v0) obj10;
            w0.a(v0Var9.f517c.J, v0Var9.f515a);
        }
        arrayList5.clear();
        if (k0.F(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + v0Var + " to " + v0Var2);
        }
    }

    public final void c() {
        if (this.f424e) {
            return;
        }
        ViewGroup viewGroup = this.f421a;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f422b) {
            try {
                if (!this.f422b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f423c);
                    this.f423c.clear();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        v0 v0Var = (v0) obj;
                        if (k0.F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v0Var);
                        }
                        v0Var.a();
                        if (!v0Var.f520g) {
                            this.f423c.add(v0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f422b);
                    this.f422b.clear();
                    this.f423c.addAll(arrayList2);
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((v0) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0 d(u uVar) {
        ArrayList arrayList = this.f422b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            v0 v0Var = (v0) obj;
            if (v0Var.f517c.equals(uVar) && !v0Var.f519f) {
                return v0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (k0.F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f421a;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f422b) {
            try {
                g();
                ArrayList arrayList = this.f422b;
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((v0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f423c);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    v0 v0Var = (v0) obj2;
                    if (k0.F(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f421a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(v0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    v0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f422b);
                int size3 = arrayList3.size();
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    v0 v0Var2 = (v0) obj3;
                    if (k0.F(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f421a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(v0Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    v0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f422b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            v0 v0Var = (v0) obj;
            if (v0Var.f516b == 2) {
                v0Var.c(w0.b(v0Var.f517c.C().getVisibility()), 1);
            }
        }
    }
}
