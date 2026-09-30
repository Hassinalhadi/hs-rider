package g;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.s0;
import java.util.ArrayList;
import k.a3;
import k.h2;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i extends a.n implements j {
    public boolean A;
    public boolean B;
    public c0 D;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.emoji2.text.m f1716y = new androidx.emoji2.text.m(3, new androidx.fragment.app.w(this));

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.t f1717z = new androidx.lifecycle.t(this);
    public boolean C = true;

    public i() {
        this.f42i.f1098b.e("android:support:lifecycle", new a.h(1, this));
        final int i3 = 0;
        this.f47n.add(new i0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.i f514b;

            {
                this.f514b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f514b.f1716y.u();
                        return;
                    default:
                        this.f514b.f1716y.u();
                        return;
                }
            }
        });
        final int i4 = 1;
        this.f49p.add(new i0.a(this) { // from class: androidx.fragment.app.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g.i f514b;

            {
                this.f514b = this;
            }

            @Override // i0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f514b.f1716y.u();
                        return;
                    default:
                        this.f514b.f1716y.u();
                        return;
                }
            }
        });
        d(new a.i(this, 1));
    }

    public static boolean l(androidx.fragment.app.k0 k0Var) {
        i iVar;
        boolean z2 = false;
        for (androidx.fragment.app.u uVar : k0Var.f399c.k()) {
            if (uVar != null) {
                androidx.fragment.app.w wVar = uVar.f508x;
                if (wVar == null) {
                    iVar = null;
                } else {
                    iVar = wVar.f524j;
                }
                if (iVar != null) {
                    z2 |= l(uVar.g());
                }
                s0 s0Var = uVar.S;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.h;
                androidx.lifecycle.m mVar2 = androidx.lifecycle.m.f570i;
                if (s0Var != null) {
                    s0Var.d();
                    if (s0Var.h.f581c.compareTo(mVar2) >= 0) {
                        androidx.lifecycle.t tVar = uVar.S.h;
                        tVar.c("setCurrentState");
                        tVar.e(mVar);
                        z2 = true;
                    }
                }
                if (uVar.R.f581c.compareTo(mVar2) >= 0) {
                    androidx.lifecycle.t tVar2 = uVar.R;
                    tVar2.c("setCurrentState");
                    tVar2.e(mVar);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        c0 c0Var = (c0) k();
        c0Var.v();
        ((ViewGroup) c0Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        c0Var.f1671r.a(c0Var.f1670q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        c0 c0Var = (c0) k();
        c0Var.T = true;
        int i3 = c0Var.X;
        if (i3 == -100) {
            i3 = p.f1759g;
        }
        int B = c0Var.B(context, i3);
        if (p.b(context) && p.b(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!p.f1762k) {
                    p.f1758f.execute(new k(context, 0));
                }
            } else {
                synchronized (p.f1765n) {
                    try {
                        f0.e eVar = p.h;
                        if (eVar == null) {
                            if (p.f1760i == null) {
                                p.f1760i = f0.e.a(z.a.e(context));
                            }
                            if (!p.f1760i.f1558a.f1559a.isEmpty()) {
                                p.h = p.f1760i;
                            }
                        } else if (!eVar.equals(p.f1760i)) {
                            f0.e eVar2 = p.h;
                            p.f1760i = eVar2;
                            z.a.d(context, eVar2.f1558a.f1559a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        f0.e o3 = c0.o(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(c0.s(context, B, o3, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof i.c) {
            try {
                ((i.c) context).a(c0.s(context, B, o3, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (c0.f1657o0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f3 = configuration3.fontScale;
                    float f4 = configuration4.fontScale;
                    if (f3 != f4) {
                        configuration.fontScale = f4;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    u.a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 15;
                    int i33 = configuration4.uiMode & 15;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 48;
                    int i35 = configuration4.uiMode & 48;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.screenWidthDp;
                    int i37 = configuration4.screenWidthDp;
                    if (i36 != i37) {
                        configuration.screenWidthDp = i37;
                    }
                    int i38 = configuration3.screenHeightDp;
                    int i39 = configuration4.screenHeightDp;
                    if (i38 != i39) {
                        configuration.screenHeightDp = i39;
                    }
                    int i40 = configuration3.smallestScreenWidthDp;
                    int i41 = configuration4.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration.smallestScreenWidthDp = i41;
                    }
                    int i42 = configuration3.densityDpi;
                    int i43 = configuration4.densityDpi;
                    if (i42 != i43) {
                        configuration.densityDpi = i43;
                    }
                }
            }
            Configuration s3 = c0.s(context, B, o3, configuration, true);
            i.c cVar = new i.c(context, com.logistics.rider.lsposed.R.style.Theme_AppCompat_Empty);
            cVar.a(s3);
            try {
                if (context.getTheme() != null) {
                    cVar.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((c0) k()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.n, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((c0) k()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i3) {
        c0 c0Var = (c0) k();
        c0Var.v();
        return c0Var.f1670q.findViewById(i3);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        c0 c0Var = (c0) k();
        if (c0Var.f1674u == null) {
            c0Var.z();
            m0 m0Var = c0Var.f1673t;
            if (m0Var != null) {
                context = m0Var.b();
            } else {
                context = c0Var.f1669p;
            }
            c0Var.f1674u = new i.h(context);
        }
        return c0Var.f1674u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i3 = a3.f2234a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        c0 c0Var = (c0) k();
        if (c0Var.f1673t != null) {
            c0Var.z();
            c0Var.f1673t.getClass();
            c0Var.A(0);
        }
    }

    public final p k() {
        if (this.D == null) {
            n nVar = p.f1758f;
            this.D = new c0(this, null, this, this);
        }
        return this.D;
    }

    public final void m() {
        super.onDestroy();
        ((androidx.fragment.app.w) this.f1716y.f299g).f523i.k();
        this.f1717z.d(androidx.lifecycle.l.ON_DESTROY);
    }

    public final boolean n(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return ((androidx.fragment.app.w) this.f1716y.f299g).f523i.i();
        }
        return false;
    }

    public final void o() {
        super.onPostResume();
        this.f1717z.d(androidx.lifecycle.l.ON_RESUME);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1716y.f299g).f523i;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(7);
    }

    @Override // a.n, android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        this.f1716y.u();
        super.onActivityResult(i3, i4, intent);
    }

    @Override // a.n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c0 c0Var = (c0) k();
        if (c0Var.K && c0Var.E) {
            c0Var.z();
            m0 m0Var = c0Var.f1673t;
            if (m0Var != null) {
                m0Var.e(m0Var.f1733a.getResources().getBoolean(com.logistics.rider.lsposed.R.bool.abc_action_bar_embed_tabs));
            }
        }
        k.u a3 = k.u.a();
        Context context = c0Var.f1669p;
        synchronized (a3) {
            h2 h2Var = a3.f2412a;
            synchronized (h2Var) {
                n.h hVar = (n.h) h2Var.f2271b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        c0Var.W = new Configuration(c0Var.f1669p.getResources().getConfiguration());
        c0Var.m(false, false);
    }

    @Override // a.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1717z.d(androidx.lifecycle.l.ON_CREATE);
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) this.f1716y.f299g).f523i;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1716y.f299g).f523i.f401f.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m();
        k().d();
    }

    @Override // a.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Intent a3;
        if (!n(i3, menuItem)) {
            c0 c0Var = (c0) k();
            c0Var.z();
            m0 m0Var = c0Var.f1673t;
            if (menuItem.getItemId() != 16908332 || m0Var == null || (((y2) m0Var.f1736e).f2444b & 4) == 0 || (a3 = z.a.a(this)) == null) {
                return false;
            }
            if (shouldUpRecreateTask(a3)) {
                ArrayList arrayList = new ArrayList();
                Intent a4 = z.a.a(this);
                if (a4 == null) {
                    a4 = z.a.a(this);
                }
                if (a4 != null) {
                    ComponentName component = a4.getComponent();
                    if (component == null) {
                        component = a4.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent b3 = z.a.b(this, component);
                        while (b3 != null) {
                            arrayList.add(size, b3);
                            b3 = z.a.b(this, b3.getComponent());
                        }
                        arrayList.add(a4);
                    } catch (PackageManager.NameNotFoundException e3) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    startActivities(intentArr, null);
                    try {
                        finishAffinity();
                    } catch (IllegalStateException unused) {
                        finish();
                    }
                } else {
                    a.b.i("No intents added to TaskStackBuilder; cannot startActivities");
                    return false;
                }
            } else {
                navigateUpTo(a3);
                return true;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.B = false;
        ((androidx.fragment.app.w) this.f1716y.f299g).f523i.t(5);
        this.f1717z.d(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((c0) k()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        o();
        c0 c0Var = (c0) k();
        c0Var.z();
        m0 m0Var = c0Var.f1673t;
        if (m0Var != null) {
            m0Var.f1750t = true;
        }
    }

    @Override // a.n, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f1716y.u();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        androidx.emoji2.text.m mVar = this.f1716y;
        mVar.u();
        super.onResume();
        this.B = true;
        ((androidx.fragment.app.w) mVar.f299g).f523i.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        p();
        ((c0) k()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1716y.u();
    }

    @Override // android.app.Activity
    public final void onStop() {
        q();
        c0 c0Var = (c0) k();
        c0Var.z();
        m0 m0Var = c0Var.f1673t;
        if (m0Var != null) {
            m0Var.f1750t = false;
            i.j jVar = m0Var.f1749s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((c0) k()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        androidx.emoji2.text.m mVar = this.f1716y;
        mVar.u();
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) mVar.f299g;
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            androidx.fragment.app.k0 k0Var = wVar.f523i;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(4);
        }
        wVar.f523i.y(true);
        this.f1717z.d(androidx.lifecycle.l.ON_START);
        androidx.fragment.app.k0 k0Var2 = wVar.f523i;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.t(5);
    }

    public final void q() {
        androidx.emoji2.text.m mVar;
        super.onStop();
        this.C = true;
        do {
            mVar = this.f1716y;
        } while (l(((androidx.fragment.app.w) mVar.f299g).f523i));
        androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) mVar.f299g).f523i;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.t(4);
        this.f1717z.d(androidx.lifecycle.l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        h();
        k().i(i3);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        super.setTheme(i3);
        ((c0) k()).Y = i3;
    }

    @Override // a.n, android.app.Activity
    public void setContentView(View view) {
        h();
        k().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        k().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((androidx.fragment.app.w) this.f1716y.f299g).f523i.f401f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
