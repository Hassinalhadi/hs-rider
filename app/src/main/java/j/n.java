package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: f, reason: collision with root package name */
    public e0 f2095f;

    /* renamed from: g, reason: collision with root package name */
    public g.g f2096g;
    public i h;

    @Override // j.x
    public final void a(m mVar, boolean z2) {
        g.g gVar;
        if ((z2 || mVar == this.f2095f) && (gVar = this.f2096g) != null) {
            gVar.dismiss();
        }
    }

    @Override // j.x
    public final boolean b(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        e0 e0Var = this.f2095f;
        i iVar = this.h;
        if (iVar.f2066k == null) {
            iVar.f2066k = new h(iVar);
        }
        e0Var.q(iVar.f2066k.getItem(i3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.h.a(this.f2095f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f2095f;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2096g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2096g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i3, keyEvent, 0);
    }
}
