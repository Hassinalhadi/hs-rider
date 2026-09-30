package k;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x2 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final j.a f2437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2 f2438g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j.a] */
    public x2(y2 y2Var) {
        this.f2438g = y2Var;
        Context context = y2Var.f2443a.getContext();
        CharSequence charSequence = y2Var.h;
        ?? obj = new Object();
        obj.f2000e = 4096;
        obj.f2002g = 4096;
        obj.f2006l = null;
        obj.f2007m = null;
        obj.f2008n = false;
        obj.f2009o = false;
        obj.f2010p = 16;
        obj.f2003i = context;
        obj.f1997a = charSequence;
        this.f2437f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y2 y2Var = this.f2438g;
        Window.Callback callback = y2Var.f2451k;
        if (callback != null && y2Var.f2452l) {
            callback.onMenuItemSelected(0, this.f2437f);
        }
    }
}
