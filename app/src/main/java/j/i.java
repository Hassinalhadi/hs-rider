package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public Context f2062f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f2063g;
    public m h;

    /* renamed from: i, reason: collision with root package name */
    public ExpandedMenuView f2064i;

    /* renamed from: j, reason: collision with root package name */
    public x f2065j;

    /* renamed from: k, reason: collision with root package name */
    public h f2066k;

    public i(ContextWrapper contextWrapper) {
        this.f2062f = contextWrapper;
        this.f2063g = LayoutInflater.from(contextWrapper);
    }

    @Override // j.y
    public final void a(m mVar, boolean z2) {
        x xVar = this.f2065j;
        if (xVar != null) {
            xVar.a(mVar, z2);
        }
    }

    @Override // j.y
    public final void c(Context context, m mVar) {
        if (this.f2062f != null) {
            this.f2062f = context;
            if (this.f2063g == null) {
                this.f2063g = LayoutInflater.from(context);
            }
        }
        this.h = mVar;
        h hVar = this.f2066k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final boolean d() {
        return false;
    }

    @Override // j.y
    public final boolean e(o oVar) {
        return false;
    }

    @Override // j.y
    public final void g() {
        h hVar = this.f2066k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final boolean h(o oVar) {
        return false;
    }

    @Override // j.y
    public final void i(x xVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, j.x, java.lang.Object, j.n, android.content.DialogInterface$OnDismissListener] */
    @Override // j.y
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f2073a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f2095f = e0Var;
        g.f fVar = new g.f(context);
        g.b bVar = (g.b) fVar.f1706g;
        i iVar = new i(bVar.f1632a);
        obj.h = iVar;
        iVar.f2065j = obj;
        e0Var.b(iVar, context);
        i iVar2 = obj.h;
        if (iVar2.f2066k == null) {
            iVar2.f2066k = new h(iVar2);
        }
        bVar.f1637g = iVar2.f2066k;
        bVar.h = obj;
        View view = e0Var.f2085o;
        if (view != null) {
            bVar.f1635e = view;
        } else {
            bVar.f1634c = e0Var.f2084n;
            bVar.d = e0Var.f2083m;
        }
        bVar.f1636f = obj;
        g.g a3 = fVar.a();
        obj.f2096g = a3;
        a3.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f2096g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f2096g.show();
        x xVar = this.f2065j;
        if (xVar != null) {
            xVar.b(e0Var);
            return true;
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.h.q(this.f2066k.getItem(i3), this, 0);
    }
}
