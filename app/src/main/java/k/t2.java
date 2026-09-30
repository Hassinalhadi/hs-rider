package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t2 implements j.y {

    /* renamed from: f, reason: collision with root package name */
    public j.m f2408f;

    /* renamed from: g, reason: collision with root package name */
    public j.o f2409g;
    public final /* synthetic */ Toolbar h;

    public t2(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // j.y
    public final void c(Context context, j.m mVar) {
        j.o oVar;
        j.m mVar2 = this.f2408f;
        if (mVar2 != null && (oVar = this.f2409g) != null) {
            mVar2.d(oVar);
        }
        this.f2408f = mVar;
    }

    @Override // j.y
    public final boolean d() {
        return false;
    }

    @Override // j.y
    public final boolean e(j.o oVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.f179m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f179m);
            }
            toolbar.addView(toolbar.f179m);
        }
        View actionView = oVar.getActionView();
        toolbar.f180n = actionView;
        this.f2409g = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f180n);
            }
            u2 h = Toolbar.h();
            h.f2413a = (toolbar.f185s & 112) | 8388611;
            h.f2414b = 2;
            toolbar.f180n.setLayoutParams(h);
            toolbar.addView(toolbar.f180n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((u2) childAt.getLayoutParams()).f2414b != 2 && childAt != toolbar.f173f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f2108n.p(false);
        KeyEvent.Callback callback = toolbar.f180n;
        if (callback instanceof i.b) {
            ((j.q) ((i.b) callback)).f2123f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // j.y
    public final void g() {
        if (this.f2409g != null) {
            j.m mVar = this.f2408f;
            if (mVar != null) {
                int size = mVar.f2077f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f2408f.getItem(i3) == this.f2409g) {
                        return;
                    }
                }
            }
            h(this.f2409g);
        }
    }

    @Override // j.y
    public final boolean h(j.o oVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.f180n;
        if (callback instanceof i.b) {
            ((j.q) ((i.b) callback)).f2123f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f180n);
        toolbar.removeView(toolbar.f179m);
        toolbar.f180n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2409g = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f2108n.p(false);
        toolbar.t();
        return true;
    }

    @Override // j.y
    public final boolean j(j.e0 e0Var) {
        return false;
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z2) {
    }
}
