package b1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d1 extends j0.b {
    public final e1 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f749e = new WeakHashMap();

    public d1(e1 e1Var) {
        this.d = e1Var;
    }

    @Override // j0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f2142a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // j0.b
    public final androidx.emoji2.text.m b(View view) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    @Override // j0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        e1 e1Var = this.d;
        RecyclerView recyclerView = e1Var.d;
        RecyclerView recyclerView2 = e1Var.d;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f2142a;
        if (!K && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().V(view, dVar);
            j0.b bVar = (j0.b) this.f749e.get(view);
            if (bVar != null) {
                bVar.d(view, dVar);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // j0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // j0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        j0.b bVar = (j0.b) this.f749e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f2142a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // j0.b
    public final boolean g(View view, int i3, Bundle bundle) {
        e1 e1Var = this.d;
        RecyclerView recyclerView = e1Var.d;
        RecyclerView recyclerView2 = e1Var.d;
        if (!recyclerView.K() && recyclerView2.getLayoutManager() != null) {
            j0.b bVar = (j0.b) this.f749e.get(view);
            if (bVar != null) {
                if (bVar.g(view, i3, bundle)) {
                    return true;
                }
            } else if (super.g(view, i3, bundle)) {
                return true;
            }
            t0 t0Var = recyclerView2.getLayoutManager().f864b.f614g;
            return false;
        }
        return super.g(view, i3, bundle);
    }

    @Override // j0.b
    public final void h(View view, int i3) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            bVar.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    @Override // j0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        j0.b bVar = (j0.b) this.f749e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
