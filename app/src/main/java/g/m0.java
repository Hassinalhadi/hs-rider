package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.g1;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m0 implements k.d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f1731y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f1732z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f1733a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1734b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f1735c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public g1 f1736e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f1737f;

    /* renamed from: g, reason: collision with root package name */
    public final View f1738g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f1739i;

    /* renamed from: j, reason: collision with root package name */
    public l0 f1740j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.emoji2.text.p f1741k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1742l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1743m;

    /* renamed from: n, reason: collision with root package name */
    public int f1744n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1745o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1746p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1747q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1748r;

    /* renamed from: s, reason: collision with root package name */
    public i.j f1749s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1750t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1751u;

    /* renamed from: v, reason: collision with root package name */
    public final k0 f1752v;

    /* renamed from: w, reason: collision with root package name */
    public final k0 f1753w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.emoji2.text.m f1754x;

    public m0(Activity activity, boolean z2) {
        new ArrayList();
        this.f1743m = new ArrayList();
        this.f1744n = 0;
        this.f1745o = true;
        this.f1748r = true;
        this.f1752v = new k0(this, 0);
        this.f1753w = new k0(this, 1);
        this.f1754x = new androidx.emoji2.text.m(10, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (!z2) {
            this.f1738g = decorView.findViewById(R.id.content);
        }
    }

    public final void a(boolean z2) {
        j0.k0 i3;
        j0.k0 k0Var;
        long j3;
        boolean z3 = this.f1747q;
        if (z2) {
            if (!z3) {
                this.f1747q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1735c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.f1747q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1735c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        g1 g1Var = this.f1736e;
        if (isLaidOut) {
            if (z2) {
                y2 y2Var = (y2) g1Var;
                i3 = j0.j0.a(y2Var.f2443a);
                i3.a(0.0f);
                i3.c(100L);
                i3.d(new i.i(y2Var, 4));
                k0Var = this.f1737f.i(0, 200L);
            } else {
                y2 y2Var2 = (y2) g1Var;
                j0.k0 a3 = j0.j0.a(y2Var2.f2443a);
                a3.a(1.0f);
                a3.c(200L);
                a3.d(new i.i(y2Var2, 0));
                i3 = this.f1737f.i(8, 100L);
                k0Var = a3;
            }
            i.j jVar = new i.j();
            ArrayList arrayList = jVar.f1962a;
            arrayList.add(i3);
            View view = (View) i3.f2167a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) k0Var.f2167a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(k0Var);
            jVar.b();
            return;
        }
        if (z2) {
            ((y2) g1Var).f2443a.setVisibility(4);
            this.f1737f.setVisibility(0);
        } else {
            ((y2) g1Var).f2443a.setVisibility(0);
            this.f1737f.setVisibility(8);
        }
    }

    public final Context b() {
        if (this.f1734b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1733a.getTheme().resolveAttribute(com.logistics.rider.lsposed.R.attr.actionBarWidgetTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f1734b = new ContextThemeWrapper(this.f1733a, i3);
            } else {
                this.f1734b = this.f1733a;
            }
        }
        return this.f1734b;
    }

    public final void c(View view) {
        String str;
        g1 wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.logistics.rider.lsposed.R.id.decor_content_parent);
        this.f1735c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.logistics.rider.lsposed.R.id.action_bar);
        if (findViewById instanceof g1) {
            wrapper = (g1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f1736e = wrapper;
        this.f1737f = (ActionBarContextView) view.findViewById(com.logistics.rider.lsposed.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.logistics.rider.lsposed.R.id.action_bar_container);
        this.d = actionBarContainer;
        g1 g1Var = this.f1736e;
        if (g1Var != null && this.f1737f != null && actionBarContainer != null) {
            Context context = ((y2) g1Var).f2443a.getContext();
            this.f1733a = context;
            if ((((y2) this.f1736e).f2444b & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.h = true;
            }
            int i3 = context.getApplicationInfo().targetSdkVersion;
            this.f1736e.getClass();
            e(context.getResources().getBoolean(com.logistics.rider.lsposed.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f1733a.obtainStyledAttributes(null, f.a.f1529a, com.logistics.rider.lsposed.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1735c;
                if (actionBarOverlayLayout2.f139l) {
                    this.f1751u = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    a.b.i("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = j0.j0.f2160a;
                j0.c0.h(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        a.b.i(m0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void d(boolean z2) {
        int i3;
        if (!this.h) {
            if (z2) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            y2 y2Var = (y2) this.f1736e;
            int i4 = y2Var.f2444b;
            this.h = true;
            y2Var.a((i3 & 4) | (i4 & (-5)));
        }
    }

    public final void e(boolean z2) {
        if (!z2) {
            ((y2) this.f1736e).getClass();
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            ((y2) this.f1736e).getClass();
        }
        this.f1736e.getClass();
        ((y2) this.f1736e).f2443a.setCollapsible(false);
        this.f1735c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean z4 = this.f1746p;
        if (!this.f1747q && z4) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = this.f1748r;
        e2.h hVar = null;
        androidx.emoji2.text.m mVar = this.f1754x;
        View view = this.f1738g;
        if (z3) {
            if (!z5) {
                this.f1748r = true;
                i.j jVar = this.f1749s;
                if (jVar != null) {
                    jVar.a();
                }
                this.d.setVisibility(0);
                int i3 = this.f1744n;
                k0 k0Var = this.f1753w;
                if (i3 == 0 && (this.f1750t || z2)) {
                    this.d.setTranslationY(0.0f);
                    float f3 = -this.d.getHeight();
                    if (z2) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f3 -= r12[1];
                    }
                    this.d.setTranslationY(f3);
                    i.j jVar2 = new i.j();
                    j0.k0 a3 = j0.j0.a(this.d);
                    a3.e(0.0f);
                    View view2 = (View) a3.f2167a.get();
                    if (view2 != null) {
                        if (mVar != null) {
                            hVar = new e2.h(mVar, view2);
                        }
                        view2.animate().setUpdateListener(hVar);
                    }
                    boolean z6 = jVar2.f1965e;
                    ArrayList arrayList = jVar2.f1962a;
                    if (!z6) {
                        arrayList.add(a3);
                    }
                    if (this.f1745o && view != null) {
                        view.setTranslationY(f3);
                        j0.k0 a4 = j0.j0.a(view);
                        a4.e(0.0f);
                        if (!jVar2.f1965e) {
                            arrayList.add(a4);
                        }
                    }
                    boolean z7 = jVar2.f1965e;
                    if (!z7) {
                        jVar2.f1964c = f1732z;
                    }
                    if (!z7) {
                        jVar2.f1963b = 250L;
                    }
                    if (!z7) {
                        jVar2.d = k0Var;
                    }
                    this.f1749s = jVar2;
                    jVar2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.f1745o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    k0Var.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1735c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.j0.f2160a;
                    j0.a0.b(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (z5) {
            this.f1748r = false;
            i.j jVar3 = this.f1749s;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i4 = this.f1744n;
            k0 k0Var2 = this.f1752v;
            if (i4 == 0 && (this.f1750t || z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                i.j jVar4 = new i.j();
                float f4 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f4 -= r12[1];
                }
                j0.k0 a5 = j0.j0.a(this.d);
                a5.e(f4);
                View view3 = (View) a5.f2167a.get();
                if (view3 != null) {
                    if (mVar != null) {
                        hVar = new e2.h(mVar, view3);
                    }
                    view3.animate().setUpdateListener(hVar);
                }
                boolean z8 = jVar4.f1965e;
                ArrayList arrayList2 = jVar4.f1962a;
                if (!z8) {
                    arrayList2.add(a5);
                }
                if (this.f1745o && view != null) {
                    j0.k0 a6 = j0.j0.a(view);
                    a6.e(f4);
                    if (!jVar4.f1965e) {
                        arrayList2.add(a6);
                    }
                }
                boolean z9 = jVar4.f1965e;
                if (!z9) {
                    jVar4.f1964c = f1731y;
                }
                if (!z9) {
                    jVar4.f1963b = 250L;
                }
                if (!z9) {
                    jVar4.d = k0Var2;
                }
                this.f1749s = jVar4;
                jVar4.b();
                return;
            }
            k0Var2.a();
        }
    }

    public m0(Dialog dialog) {
        new ArrayList();
        this.f1743m = new ArrayList();
        this.f1744n = 0;
        this.f1745o = true;
        this.f1748r = true;
        this.f1752v = new k0(this, 0);
        this.f1753w = new k0(this, 1);
        this.f1754x = new androidx.emoji2.text.m(10, this);
        c(dialog.getWindow().getDecorView());
    }
}
