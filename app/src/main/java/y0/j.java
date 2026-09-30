package y0;

import a.a0;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.emoji2.text.w;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3309a;

    public j(i iVar) {
        this.f3309a = iVar;
    }

    public final void onBackCancelled() {
        i iVar = this.f3309a;
        w wVar = iVar.f3290a;
        if (wVar != null) {
            if (!iVar.f3291b) {
                wVar.e(iVar, null);
            }
            e eVar = (e) wVar.f321g;
            eVar.getClass();
            if (iVar.equals(eVar.h) && -1 == eVar.f3297g) {
                a0 a0Var = eVar.f3296f;
                if (a0Var == null) {
                    a0Var = eVar.c(-1);
                }
                eVar.f3296f = null;
                eVar.f3297g = 0;
                eVar.h = null;
                if (a0Var != null) {
                    a0Var.d.getClass();
                }
                eVar.f3292a.b(f.f3304a);
            }
            iVar.f3291b = false;
            return;
        }
        a.b.i("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.f3309a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b a3 = k2.h.a(backEvent);
        i iVar = this.f3309a;
        w wVar = iVar.f3290a;
        if (wVar != null) {
            if (iVar.f3291b) {
                e eVar = (e) wVar.f321g;
                eVar.getClass();
                if (iVar.equals(eVar.h) && -1 == eVar.f3297g) {
                    a0 a0Var = eVar.f3296f;
                    if (a0Var == null) {
                        a0Var = eVar.c(-1);
                    }
                    if (a0Var != null) {
                        a0Var.d.getClass();
                    }
                    eVar.f3292a.b(new g(a3));
                    return;
                }
                return;
            }
            return;
        }
        a.b.i("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b a3 = k2.h.a(backEvent);
        i iVar = this.f3309a;
        w wVar = iVar.f3290a;
        if (wVar != null) {
            if (!iVar.f3291b) {
                wVar.e(iVar, a3);
                iVar.f3291b = true;
                return;
            }
            return;
        }
        a.b.i("This input is not added to any dispatcher.");
    }
}
