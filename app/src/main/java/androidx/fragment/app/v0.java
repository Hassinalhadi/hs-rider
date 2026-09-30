package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f515a;

    /* renamed from: b, reason: collision with root package name */
    public int f516b;

    /* renamed from: c, reason: collision with root package name */
    public final u f517c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f518e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f520g;
    public final q0 h;

    public v0(int i3, int i4, q0 q0Var, f0.c cVar) {
        u uVar = q0Var.f467c;
        this.d = new ArrayList();
        this.f518e = new HashSet();
        this.f519f = false;
        this.f520g = false;
        this.f515a = i3;
        this.f516b = i4;
        this.f517c = uVar;
        cVar.a(new androidx.emoji2.text.m(4, this));
        this.h = q0Var;
    }

    public final void a() {
        if (!this.f519f) {
            this.f519f = true;
            if (this.f518e.isEmpty()) {
                b();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f518e);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f0.c cVar = (f0.c) obj;
                synchronized (cVar) {
                    try {
                        if (!cVar.f1553a) {
                            cVar.f1553a = true;
                            cVar.f1555c = true;
                            f0.b bVar = cVar.f1554b;
                            if (bVar != null) {
                                try {
                                    bVar.onCancel();
                                } catch (Throwable th) {
                                    synchronized (cVar) {
                                        cVar.f1555c = false;
                                        cVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (cVar) {
                                cVar.f1555c = false;
                                cVar.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f520g) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f520g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i3, int i4) {
        int a3 = q.e.a(i4);
        u uVar = this.f517c;
        if (a3 != 0) {
            if (a3 != 1) {
                if (a3 == 2) {
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.g(this.f515a) + " -> REMOVED. mLifecycleImpact  = " + w0.f(this.f516b) + " to REMOVING.");
                    }
                    this.f515a = 1;
                    this.f516b = 3;
                    return;
                }
                return;
            }
            if (this.f515a == 1) {
                if (k0.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + w0.f(this.f516b) + " to ADDING.");
                }
                this.f515a = 2;
                this.f516b = 2;
                return;
            }
            return;
        }
        if (this.f515a != 1) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.g(this.f515a) + " -> " + w0.g(i3) + ". ");
            }
            this.f515a = i3;
        }
    }

    public final void d() {
        float f3;
        int i3 = this.f516b;
        q0 q0Var = this.h;
        if (i3 == 2) {
            u uVar = q0Var.f467c;
            View findFocus = uVar.J.findFocus();
            if (findFocus != null) {
                uVar.d().f485k = findFocus;
                if (k0.F(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar);
                }
            }
            View C = this.f517c.C();
            if (C.getParent() == null) {
                q0Var.b();
                C.setAlpha(0.0f);
            }
            if (C.getAlpha() == 0.0f && C.getVisibility() == 0) {
                C.setVisibility(4);
            }
            s sVar = uVar.M;
            if (sVar == null) {
                f3 = 1.0f;
            } else {
                f3 = sVar.f484j;
            }
            C.setAlpha(f3);
            return;
        }
        if (i3 == 3) {
            u uVar2 = q0Var.f467c;
            View C2 = uVar2.C();
            if (k0.F(2)) {
                Log.v("FragmentManager", "Clearing focus " + C2.findFocus() + " on view " + C2 + " for Fragment " + uVar2);
            }
            C2.clearFocus();
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + w0.g(this.f515a) + "} {mLifecycleImpact = " + w0.f(this.f516b) + "} {mFragment = " + this.f517c + "}";
    }
}
