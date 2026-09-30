package k;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f2 extends a2 implements b2 {
    public androidx.emoji2.text.m F;

    @Override // k.b2
    public final void c(j.m mVar, j.o oVar) {
        androidx.emoji2.text.m mVar2 = this.F;
        if (mVar2 != null) {
            mVar2.c(mVar, oVar);
        }
    }

    @Override // k.b2
    public final void j(j.m mVar, MenuItem menuItem) {
        androidx.emoji2.text.m mVar2 = this.F;
        if (mVar2 != null) {
            mVar2.j(mVar, menuItem);
        }
    }

    @Override // k.a2
    public final n1 q(Context context, boolean z2) {
        e2 e2Var = new e2(context, z2);
        e2Var.setHoverListener(this);
        return e2Var;
    }
}
