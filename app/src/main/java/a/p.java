package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class p extends Dialog implements androidx.lifecycle.r, c1.f {

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.t f59f;

    /* renamed from: g, reason: collision with root package name */
    public final c1.e f60g;
    public final j2.b h;

    /* renamed from: i, reason: collision with root package name */
    public final j2.b f61i;

    public p(Context context, int i3) {
        super(context, i3);
        this.f60g = new c1.e(this);
        this.h = new j2.b(new o(0, this));
        this.f61i = new j2.b(new o(1, this));
    }

    public static void a(p pVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // c1.f
    public final c1.d b() {
        return this.f60g.f1098b;
    }

    public final e0 c() {
        return (e0) this.f61i.a();
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        androidx.lifecycle.t tVar = this.f59f;
        if (tVar == null) {
            androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
            this.f59f = tVar2;
            return tVar2;
        }
        return tVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((y0.a) this.h.a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            e0 c3 = c();
            OnBackInvokedDispatcher e3 = a.e(this);
            e3.getClass();
            c3.b(e3);
        }
        this.f60g.b(bundle);
        androidx.lifecycle.t tVar = this.f59f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f59f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.f60g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.t tVar = this.f59f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f59f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.t tVar = this.f59f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f59f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_DESTROY);
        this.f59f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i3) {
        d();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
