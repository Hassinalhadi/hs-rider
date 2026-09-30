package k;

import android.content.Context;
import android.view.View;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends j.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2257l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f2258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, j.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f2258m = kVar;
        if ((e0Var.A.f2118x & 32) != 32) {
            View view2 = kVar.f2295n;
            this.f2134e = view2 == null ? (View) kVar.f2294m : view2;
        }
        androidx.emoji2.text.m mVar = kVar.B;
        this.h = mVar;
        j.u uVar = this.f2137i;
        if (uVar != null) {
            uVar.i(mVar);
        }
    }

    @Override // j.w
    public final void c() {
        switch (this.f2257l) {
            case 0:
                this.f2258m.f2306y = null;
                super.c();
                return;
            default:
                k kVar = this.f2258m;
                j.m mVar = kVar.h;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar.f2305x = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, j.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f2258m = kVar;
        this.f2135f = 8388613;
        androidx.emoji2.text.m mVar2 = kVar.B;
        this.h = mVar2;
        j.u uVar = this.f2137i;
        if (uVar != null) {
            uVar.i(mVar2);
        }
    }
}
