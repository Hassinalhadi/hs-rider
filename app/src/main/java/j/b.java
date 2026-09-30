package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.q1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends q1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2011o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f2012p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2012p = actionMenuItemView;
    }

    @Override // k.q1
    public final c0 b() {
        k.g gVar;
        switch (this.f2011o) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f2012p).f83q;
                if (cVar != null && (gVar = ((k.h) cVar).f2260a.f2306y) != null) {
                    return gVar.a();
                }
                return null;
            default:
                k.g gVar2 = ((k.j) this.f2012p).f2278i.f2305x;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // k.q1
    public final boolean c() {
        c0 b3;
        switch (this.f2011o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2012p;
                l lVar = actionMenuItemView.f81o;
                if (lVar != null && lVar.b(actionMenuItemView.f78l) && (b3 = b()) != null && b3.b()) {
                    return true;
                }
                return false;
            default:
                ((k.j) this.f2012p).f2278i.l();
                return true;
        }
    }

    @Override // k.q1
    public boolean d() {
        switch (this.f2011o) {
            case 1:
                k.k kVar = ((k.j) this.f2012p).f2278i;
                if (kVar.f2307z != null) {
                    return false;
                }
                kVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k.j jVar, k.j jVar2) {
        super(jVar2);
        this.f2012p = jVar;
    }
}
