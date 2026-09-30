package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.g1;
import k.t2;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c0 extends p implements j.k, LayoutInflater.Factory2 {

    /* renamed from: m0, reason: collision with root package name */
    public static final n.j f1655m0 = new n.j(0);

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f1656n0 = {R.attr.windowBackground};

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f1657o0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public q C;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public b0[] Q;
    public b0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;

    /* renamed from: b0, reason: collision with root package name */
    public y f1658b0;

    /* renamed from: c0, reason: collision with root package name */
    public y f1659c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1660d0;
    public int e0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1662g0;

    /* renamed from: h0, reason: collision with root package name */
    public Rect f1663h0;

    /* renamed from: i0, reason: collision with root package name */
    public Rect f1664i0;

    /* renamed from: j0, reason: collision with root package name */
    public f0 f1665j0;

    /* renamed from: k0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1666k0;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedCallback f1667l0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1668o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1669p;

    /* renamed from: q, reason: collision with root package name */
    public Window f1670q;

    /* renamed from: r, reason: collision with root package name */
    public x f1671r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1672s;

    /* renamed from: t, reason: collision with root package name */
    public m0 f1673t;

    /* renamed from: u, reason: collision with root package name */
    public i.h f1674u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1675v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarOverlayLayout f1676w;

    /* renamed from: x, reason: collision with root package name */
    public r f1677x;

    /* renamed from: y, reason: collision with root package name */
    public r f1678y;

    /* renamed from: z, reason: collision with root package name */
    public i.a f1679z;
    public j0.k0 D = null;

    /* renamed from: f0, reason: collision with root package name */
    public final q f1661f0 = new q(this, 0);

    public c0(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.X = -100;
        this.f1669p = context;
        this.f1672s = jVar;
        this.f1668o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof i) {
                        iVar = (i) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                this.X = ((c0) iVar.k()).X;
            }
        }
        if (this.X == -100) {
            String name = this.f1668o.getClass().getName();
            n.j jVar2 = f1655m0;
            Integer num = (Integer) jVar2.get(name);
            if (num != null) {
                this.X = num.intValue();
                jVar2.remove(this.f1668o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        k.u.d();
    }

    public static f0.e o(Context context) {
        f0.e eVar;
        f0.e eVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = p.h) == null) {
            return null;
        }
        f0.f fVar = eVar.f1558a;
        f0.e b3 = u.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f1559a.isEmpty()) {
            eVar2 = f0.e.f1557b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < b3.f1558a.f1559a.size() + fVar.f1559a.size(); i3++) {
                if (i3 < fVar.f1559a.size()) {
                    locale = fVar.f1559a.get(i3);
                } else {
                    locale = b3.f1558a.f1559a.get(i3 - fVar.f1559a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            eVar2 = new f0.e(new f0.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (eVar2.f1558a.f1559a.isEmpty()) {
            return b3;
        }
        return eVar2;
    }

    public static Configuration s(Context context, int i3, f0.e eVar, Configuration configuration, boolean z2) {
        int i4;
        if (i3 != 1) {
            if (i3 != 2) {
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i4 = 32;
            }
        } else {
            i4 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            u.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final void A(int i3) {
        this.e0 = (1 << i3) | this.e0;
        if (!this.f1660d0) {
            View decorView = this.f1670q.getDecorView();
            WeakHashMap weakHashMap = j0.j0.f2160a;
            decorView.postOnAnimation(this.f1661f0);
            this.f1660d0 = true;
        }
    }

    public final int B(Context context, int i3) {
        if (i3 != -100) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3) {
                            if (this.f1659c0 == null) {
                                this.f1659c0 = new y(this, context);
                            }
                            return this.f1659c0.f();
                        }
                        a.b.i("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).f();
                }
            }
            return i3;
        }
        return -1;
    }

    public final boolean C() {
        g1 g1Var;
        t2 t2Var;
        j.o oVar;
        boolean z2 = this.S;
        this.S = false;
        b0 y2 = y(0);
        if (y2.f1650m) {
            if (!z2) {
                r(y2, true);
                return true;
            }
        } else {
            i.a aVar = this.f1679z;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            z();
            m0 m0Var = this.f1673t;
            if (m0Var == null || (g1Var = m0Var.f1736e) == null || (t2Var = ((y2) g1Var).f2443a.Q) == null || t2Var.f2409g == null) {
                return false;
            }
            t2 t2Var2 = ((y2) g1Var).f2443a.Q;
            if (t2Var2 == null) {
                oVar = null;
            } else {
                oVar = t2Var2.f2409g;
            }
            if (oVar != null) {
                oVar.collapseActionView();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.f2066k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(g.b0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.D(g.b0, android.view.KeyEvent):void");
    }

    public final boolean E(b0 b0Var, int i3, KeyEvent keyEvent) {
        j.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!b0Var.f1648k && !F(b0Var, keyEvent)) || (mVar = b0Var.h) == null) {
            return false;
        }
        return mVar.performShortcut(i3, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(g.b0 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.F(g.b0, android.view.KeyEvent):boolean");
    }

    public final void G() {
        if (!this.E) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f1666k0 != null && (y(0).f1650m || this.f1679z != null)) {
                z2 = true;
            }
            if (z2 && this.f1667l0 == null) {
                this.f1667l0 = w.b(this.f1666k0, this);
            } else if (!z2 && (onBackInvokedCallback = this.f1667l0) != null) {
                w.c(this.f1666k0, onBackInvokedCallback);
                this.f1667l0 = null;
            }
        }
    }

    @Override // g.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f1669p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof c0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.p
    public final void c() {
        String str;
        this.T = true;
        m(false, true);
        w();
        Object obj = this.f1668o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z.a.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                m0 m0Var = this.f1673t;
                if (m0Var == null) {
                    this.f1662g0 = true;
                } else {
                    m0Var.d(true);
                }
            }
            synchronized (p.f1764m) {
                p.e(this);
                p.f1763l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.f1669p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1668o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = g.p.f1764m
            monitor-enter(r0)
            g.p.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f1660d0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f1670q
            android.view.View r0 = r0.getDecorView()
            g.q r1 = r3.f1661f0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f1668o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            n.j r0 = g.c0.f1655m0
            java.lang.Object r1 = r3.f1668o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            n.j r0 = g.c0.f1655m0
            java.lang.Object r1 = r3.f1668o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            g.y r0 = r3.f1658b0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            g.y r3 = r3.f1659c0
            if (r3 == 0) goto L6a
            r3.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.d():void");
    }

    @Override // g.p
    public final boolean f(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.O && i3 == 108) {
            return false;
        }
        if (this.K && i3 == 1) {
            this.K = false;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 5) {
                    if (i3 != 10) {
                        if (i3 != 108) {
                            if (i3 != 109) {
                                return this.f1670q.requestFeature(i3);
                            }
                            G();
                            this.L = true;
                            return true;
                        }
                        G();
                        this.K = true;
                        return true;
                    }
                    G();
                    this.M = true;
                    return true;
                }
                G();
                this.J = true;
                return true;
            }
            G();
            this.I = true;
            return true;
        }
        G();
        this.O = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // j.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(j.m r6) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.g(j.m):void");
    }

    @Override // j.k
    public final boolean h(j.m mVar, MenuItem menuItem) {
        int i3;
        b0 b0Var;
        Window.Callback callback = this.f1670q.getCallback();
        if (callback != null && !this.V) {
            j.m k3 = mVar.k();
            b0[] b0VarArr = this.Q;
            if (b0VarArr != null) {
                i3 = b0VarArr.length;
            } else {
                i3 = 0;
            }
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    b0Var = b0VarArr[i4];
                    if (b0Var != null && b0Var.h == k3) {
                        break;
                    }
                    i4++;
                } else {
                    b0Var = null;
                    break;
                }
            }
            if (b0Var != null) {
                return callback.onMenuItemSelected(b0Var.f1640a, menuItem);
            }
        }
        return false;
    }

    @Override // g.p
    public final void i(int i3) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1669p).inflate(i3, viewGroup);
        this.f1671r.a(this.f1670q.getCallback());
    }

    @Override // g.p
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1671r.a(this.f1670q.getCallback());
    }

    @Override // g.p
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1671r.a(this.f1670q.getCallback());
    }

    @Override // g.p
    public final void l(CharSequence charSequence) {
        this.f1675v = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1676w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        m0 m0Var = this.f1673t;
        if (m0Var != null) {
            y2 y2Var = (y2) m0Var.f1736e;
            if (!y2Var.f2448g) {
                Toolbar toolbar = y2Var.f2443a;
                y2Var.h = charSequence;
                if ((y2Var.f2444b & 8) != 0) {
                    toolbar.setTitle(charSequence);
                    if (y2Var.f2448g) {
                        j0.j0.i(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1670q == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof x)) {
                x xVar = new x(this, callback);
                this.f1671r = xVar;
                window.setCallback(xVar);
                Context context = this.f1669p;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1656n0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    k.u a3 = k.u.a();
                    synchronized (a3) {
                        drawable = a3.f2412a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f1670q = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f1666k0) == null) {
                    Object obj = this.f1668o;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1667l0) != null) {
                        w.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f1667l0 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f1666k0 = w.a(activity);
                            H();
                            return;
                        }
                    }
                    this.f1666k0 = null;
                    H();
                    return;
                }
                return;
            }
            a.b.i("AppCompat has already installed itself into the Window");
            return;
        }
        a.b.i("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r9.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i3, b0 b0Var, j.m mVar) {
        if (mVar == null) {
            if (b0Var == null && i3 >= 0) {
                b0[] b0VarArr = this.Q;
                if (i3 < b0VarArr.length) {
                    b0Var = b0VarArr[i3];
                }
            }
            if (b0Var != null) {
                mVar = b0Var.h;
            }
        }
        if ((b0Var == null || b0Var.f1650m) && !this.V) {
            x xVar = this.f1671r;
            Window.Callback callback = this.f1670q.getCallback();
            xVar.getClass();
            try {
                xVar.f1776i = true;
                callback.onPanelClosed(i3, mVar);
            } finally {
                xVar.f1776i = false;
            }
        }
    }

    public final void q(j.m mVar) {
        k.k kVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1676w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((y2) actionBarOverlayLayout.f137j).f2443a.f173f;
        if (actionMenuView != null && (kVar = actionMenuView.f158y) != null) {
            kVar.f();
            k.g gVar = kVar.f2306y;
            if (gVar != null && gVar.b()) {
                gVar.f2137i.dismiss();
            }
        }
        Window.Callback callback = this.f1670q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, mVar);
        }
        this.P = false;
    }

    public final void r(b0 b0Var, boolean z2) {
        a0 a0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        k.k kVar;
        if (z2 && b0Var.f1640a == 0 && (actionBarOverlayLayout = this.f1676w) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((y2) actionBarOverlayLayout.f137j).f2443a.f173f;
            if (actionMenuView != null && (kVar = actionMenuView.f158y) != null && kVar.k()) {
                q(b0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1669p.getSystemService("window");
        if (windowManager != null && b0Var.f1650m && (a0Var = b0Var.f1643e) != null) {
            windowManager.removeView(a0Var);
            if (z2) {
                p(b0Var.f1640a, b0Var, null);
            }
        }
        b0Var.f1648k = false;
        b0Var.f1649l = false;
        b0Var.f1650m = false;
        b0Var.f1644f = null;
        b0Var.f1651n = true;
        if (this.R == b0Var) {
            this.R = null;
        }
        if (b0Var.f1640a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        if (r6.f() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        if (r6.l() != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i3) {
        b0 y2 = y(i3);
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f1653p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f1652o = true;
        y2.f1651n = true;
        if ((i3 == 108 || i3 == 0) && this.f1676w != null) {
            b0 y3 = y(0);
            y3.f1648k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.E) {
            Context context2 = this.f1669p;
            int[] iArr = f.a.f1536j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i3 = 0;
                int i4 = 1;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    f(10);
                }
                this.N = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.f1670q.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.O) {
                    if (this.N) {
                        viewGroup = (ViewGroup) from.inflate(com.logistics.rider.lsposed.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.L = false;
                        this.K = false;
                    } else if (this.K) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.logistics.rider.lsposed.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new i.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.logistics.rider.lsposed.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.logistics.rider.lsposed.R.id.decor_content_parent);
                        this.f1676w = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.f1670q.getCallback());
                        if (this.L) {
                            this.f1676w.j(109);
                        }
                        if (this.I) {
                            this.f1676w.j(2);
                        }
                        if (this.J) {
                            this.f1676w.j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.M ? (ViewGroup) from.inflate(com.logistics.rider.lsposed.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.logistics.rider.lsposed.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    r rVar = new r(this, i3);
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    j0.c0.i(viewGroup, rVar);
                    if (this.f1676w == null) {
                        this.G = (TextView) viewGroup.findViewById(com.logistics.rider.lsposed.R.id.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e3) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e4) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.logistics.rider.lsposed.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f1670q.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f1670q.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new r(this, i4));
                    this.F = viewGroup;
                    Object obj = this.f1668o;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f1675v;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1676w;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            m0 m0Var = this.f1673t;
                            if (m0Var != null) {
                                y2 y2Var = (y2) m0Var.f1736e;
                                if (!y2Var.f2448g) {
                                    Toolbar toolbar = y2Var.f2443a;
                                    y2Var.h = charSequence;
                                    if ((y2Var.f2444b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (y2Var.f2448g) {
                                            j0.j0.i(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.G;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
                    View decorView = this.f1670q.getDecorView();
                    contentFrameLayout2.f168l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.E = true;
                    b0 y2 = y(0);
                    if (!this.V && y2.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
            }
            obtainStyledAttributes.recycle();
            a.b.i("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.f1670q == null) {
            Object obj = this.f1668o;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f1670q != null) {
            return;
        }
        a.b.i("We have not been given a Window");
    }

    public final androidx.fragment.app.j x(Context context) {
        if (this.f1658b0 == null) {
            if (androidx.emoji2.text.s.f307e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.emoji2.text.s.f307e = new androidx.emoji2.text.s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1658b0 = new y(this, androidx.emoji2.text.s.f307e);
        }
        return this.f1658b0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, g.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g.b0 y(int r5) {
        /*
            r4 = this;
            g.b0[] r0 = r4.Q
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            g.b0[] r2 = new g.b0[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.Q = r2
            r0 = r2
        L15:
            r4 = r0[r5]
            if (r4 != 0) goto L24
            g.b0 r4 = new g.b0
            r4.<init>()
            r4.f1640a = r5
            r4.f1651n = r1
            r0[r5] = r4
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c0.y(int):g.b0");
    }

    public final void z() {
        v();
        if (this.K && this.f1673t == null) {
            Object obj = this.f1668o;
            if (obj instanceof Activity) {
                this.f1673t = new m0((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.f1673t = new m0((Dialog) obj);
            }
            m0 m0Var = this.f1673t;
            if (m0Var != null) {
                m0Var.d(this.f1662g0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
