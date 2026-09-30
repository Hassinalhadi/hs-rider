package a;

import a.j;
import a.n;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.g0;
import androidx.lifecycle.l;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import com.logistics.rider.lsposed.R;
import g.i;
import j0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class n extends Activity implements p0, androidx.lifecycle.h, c1.f, androidx.lifecycle.r, j0.j {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f39x = 0;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.t f40f = new androidx.lifecycle.t(this);

    /* renamed from: g, reason: collision with root package name */
    public final b.a f41g = new b.a();
    public final androidx.emoji2.text.s h;

    /* renamed from: i, reason: collision with root package name */
    public final c1.e f42i;

    /* renamed from: j, reason: collision with root package name */
    public o0 f43j;

    /* renamed from: k, reason: collision with root package name */
    public final l f44k;

    /* renamed from: l, reason: collision with root package name */
    public final j2.b f45l;

    /* renamed from: m, reason: collision with root package name */
    public final m f46m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f47n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f48o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f49p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f50q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f51r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f52s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f53t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f54u;

    /* renamed from: v, reason: collision with root package name */
    public final j2.b f55v;

    /* renamed from: w, reason: collision with root package name */
    public final j2.b f56w;

    public n() {
        final g.i iVar = (g.i) this;
        int i3 = 1;
        this.h = new androidx.emoji2.text.s(new c(iVar, i3));
        c1.e eVar = new c1.e(this);
        this.f42i = eVar;
        this.f44k = new l(iVar);
        this.f45l = new j2.b(new e(iVar, i3));
        new AtomicInteger();
        this.f46m = new m();
        this.f47n = new CopyOnWriteArrayList();
        this.f48o = new CopyOnWriteArrayList();
        this.f49p = new CopyOnWriteArrayList();
        this.f50q = new CopyOnWriteArrayList();
        this.f51r = new CopyOnWriteArrayList();
        this.f52s = new CopyOnWriteArrayList();
        this.f55v = new j2.b(new e(iVar, 2));
        androidx.lifecycle.t tVar = this.f40f;
        if (tVar != null) {
            tVar.a(new g(0, iVar));
            this.f40f.a(new g(1, iVar));
            this.f40f.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
                @Override // androidx.lifecycle.p
                public final void b(r rVar, l lVar) {
                    int i4 = n.f39x;
                    i iVar2 = i.this;
                    if (iVar2.f43j == null) {
                        j jVar = (j) iVar2.getLastNonConfigurationInstance();
                        if (jVar != null) {
                            iVar2.f43j = jVar.f27a;
                        }
                        if (iVar2.f43j == null) {
                            iVar2.f43j = new o0();
                        }
                    }
                    iVar2.f40f.f(this);
                }
            });
            eVar.a();
            g0.a(this);
            eVar.f1098b.e("android:support:activity-result", new h(0, iVar));
            d(new i(iVar, 0));
            this.f56w = new j2.b(new e(iVar, 3));
            return;
        }
        b.i("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void c(g.i iVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e3) {
            if (p2.d.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e3;
            }
        } catch (NullPointerException e4) {
            if (!p2.d.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e4;
            }
        }
    }

    @Override // androidx.lifecycle.h
    public final w0.c a() {
        Bundle bundle;
        w0.c cVar = new w0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f3194a;
        if (application != null) {
            linkedHashMap.put(m0.f573a, getApplication());
        }
        linkedHashMap.put(g0.f557a, this);
        linkedHashMap.put(g0.f558b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(g0.f559c, bundle);
        }
        return cVar;
    }

    @Override // c1.f
    public final c1.d b() {
        return this.f42i.f1098b;
    }

    public final void d(b.b bVar) {
        b.a aVar = this.f41g;
        aVar.getClass();
        n nVar = aVar.f667b;
        if (nVar != null) {
            bVar.a(nVar);
        }
        aVar.f666a.add(bVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = j0.f2160a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = j0.f2160a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.p0
    public final o0 e() {
        if (getApplication() != null) {
            if (this.f43j == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f43j = jVar.f27a;
                }
                if (this.f43j == null) {
                    this.f43j = new o0();
                }
            }
            o0 o0Var = this.f43j;
            o0Var.getClass();
            return o0Var;
        }
        b.i("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f40f;
    }

    public final e0 g() {
        return (e0) this.f56w.a();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = androidx.lifecycle.e0.f556f;
        androidx.lifecycle.c0.b(this);
    }

    public final void j(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.t tVar = this.f40f;
        tVar.c("setCurrentState");
        tVar.e(androidx.lifecycle.m.h);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (!this.f46m.a(i3, i4, intent)) {
            super.onActivityResult(i3, i4, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((y0.a) this.f55v.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f47n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i0.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f42i.b(bundle);
        b.a aVar = this.f41g;
        aVar.getClass();
        aVar.f667b = this;
        Iterator it = aVar.f666a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a(this);
        }
        i(bundle);
        int i3 = androidx.lifecycle.e0.f556f;
        androidx.lifecycle.c0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        menu.getClass();
        if (i3 == 0) {
            super.onCreatePanelMenu(i3, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.h.f310c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.d0) it.next()).f373a.j();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.f310c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.d0) it.next()).f373a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        configuration.getClass();
        this.f53t = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f53t = false;
            Iterator it = this.f50q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((i0.a) it.next()).accept(new z.b(z2));
            }
        } catch (Throwable th) {
            this.f53t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f49p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.f310c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f373a.p();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        configuration.getClass();
        this.f54u = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f54u = false;
            Iterator it = this.f51r.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((i0.a) it.next()).accept(new z.c(z2));
            }
        } catch (Throwable th) {
            this.f54u = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        menu.getClass();
        if (i3 == 0) {
            super.onPreparePanel(i3, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.h.f310c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.d0) it.next()).f373a.s();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.f46m.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.j] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        o0 o0Var = this.f43j;
        if (o0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            o0Var = jVar.f27a;
        }
        if (o0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f27a = o0Var;
        return obj;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.t tVar = this.f40f;
        if (tVar != null) {
            tVar.c("setCurrentState");
            tVar.e(androidx.lifecycle.m.h);
        }
        j(bundle);
        this.f42i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f48o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i0.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f52s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (e1.a.a()) {
                y.i("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            w wVar = (w) this.f45l.a();
            synchronized (wVar.f65a) {
                try {
                    wVar.f66b = true;
                    ArrayList arrayList = wVar.f67c;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((o2.a) obj).a();
                    }
                    wVar.f67c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        l lVar = this.f44k;
        lVar.getClass();
        if (!lVar.h) {
            lVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(lVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        intent.getClass();
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f53t) {
            return;
        }
        Iterator it = this.f50q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i0.a) it.next()).accept(new z.b(z2));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f54u) {
            return;
        }
        Iterator it = this.f51r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i0.a) it.next()).accept(new z.c(z2));
        }
    }
}
