package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r2 implements n, j.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2381f;

    public /* synthetic */ r2(Toolbar toolbar) {
        this.f2381f = toolbar;
    }

    @Override // j.k
    public void g(j.m mVar) {
        Toolbar toolbar = this.f2381f;
        k kVar = toolbar.f173f.f158y;
        if (kVar != null && kVar.k()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.L.f310c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f373a.s();
        }
    }

    @Override // j.k
    public boolean h(j.m mVar, MenuItem menuItem) {
        return false;
    }
}
