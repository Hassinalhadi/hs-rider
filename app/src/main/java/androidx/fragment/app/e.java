package androidx.fragment.app;

import android.graphics.Typeface;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f375g;
    public final /* synthetic */ Object h;

    public e(l lVar, ArrayList arrayList, v0 v0Var) {
        this.f374f = 0;
        this.f375g = arrayList;
        this.h = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f374f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f375g;
                v0 v0Var = (v0) this.h;
                if (arrayList.contains(v0Var)) {
                    arrayList.remove(v0Var);
                    w0.a(v0Var.f517c.J, v0Var.f515a);
                    return;
                }
                return;
            case 1:
                androidx.emoji2.text.m mVar = (androidx.emoji2.text.m) this.f375g;
                Typeface typeface = (Typeface) this.h;
                b0.b bVar = (b0.b) mVar.f299g;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case 2:
                ((g0.f) this.f375g).accept(this.h);
                return;
            default:
                p0.d dVar = ((SwipeDismissBehavior) this.h).f1136a;
                if (dVar != null && dVar.f()) {
                    ((View) this.f375g).postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i3) {
        this.f374f = i3;
        this.f375g = obj;
        this.h = obj2;
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f374f = 3;
        this.h = swipeDismissBehavior;
        this.f375g = view;
    }
}
