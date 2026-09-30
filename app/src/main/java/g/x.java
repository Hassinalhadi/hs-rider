package g;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final Window.Callback f1774f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1775g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1776i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f1777j;

    public x(c0 c0Var, Window.Callback callback) {
        this.f1777j = c0Var;
        if (callback != null) {
            this.f1774f = callback;
        } else {
            a.b.m("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1775g = true;
            callback.onContentChanged();
        } finally {
            this.f1775g = false;
        }
    }

    public final boolean b(int i3, Menu menu) {
        return this.f1774f.onMenuOpened(i3, menu);
    }

    public final void c(int i3, Menu menu) {
        this.f1774f.onPanelClosed(i3, menu);
    }

    public final void d(List list, Menu menu, int i3) {
        i.l.a(this.f1774f, list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1774f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.h;
        Window.Callback callback = this.f1774f;
        if (z2) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f1777j.t(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.view.Window$Callback r0 = r5.f1774f
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r6.getKeyCode()
            g.c0 r5 = r5.f1777j
            r5.z()
            g.m0 r2 = r5.f1673t
            r3 = 0
            if (r2 == 0) goto L3d
            g.l0 r2 = r2.f1739i
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            j.m r2 = r2.f1727i
            if (r2 == 0) goto L1b
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r5 = r1
            goto L6b
        L3d:
            g.b0 r0 = r5.R
            if (r0 == 0) goto L52
            int r2 = r6.getKeyCode()
            boolean r0 = r5.E(r0, r2, r6)
            if (r0 == 0) goto L52
            g.b0 r5 = r5.R
            if (r5 == 0) goto L3b
            r5.f1649l = r1
            goto L3b
        L52:
            g.b0 r0 = r5.R
            if (r0 != 0) goto L6a
            g.b0 r0 = r5.y(r3)
            r5.F(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.E(r0, r2, r6)
            r0.f1648k = r3
            if (r5 == 0) goto L6a
            goto L3b
        L6a:
            r5 = r3
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            return r3
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.x.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1774f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1774f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1774f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1774f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1774f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1774f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1775g) {
            this.f1774f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 == 0 && !(menu instanceof j.m)) {
            return false;
        }
        return this.f1774f.onCreatePanelMenu(i3, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i3) {
        return this.f1774f.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1774f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f1774f.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i3, Menu menu) {
        b(i3, menu);
        if (i3 == 108) {
            c0 c0Var = this.f1777j;
            c0Var.z();
            m0 m0Var = c0Var.f1673t;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.f1743m;
                if (true != m0Var.f1742l) {
                    m0Var.f1742l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        a.b.c();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        if (this.f1776i) {
            this.f1774f.onPanelClosed(i3, menu);
            return;
        }
        c(i3, menu);
        c0 c0Var = this.f1777j;
        if (i3 == 108) {
            c0Var.z();
            m0 m0Var = c0Var.f1673t;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.f1743m;
                if (m0Var.f1742l) {
                    m0Var.f1742l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        a.b.c();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 0) {
            b0 y2 = c0Var.y(i3);
            if (y2.f1650m) {
                c0Var.r(y2, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        i.m.a(this.f1774f, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        j.m mVar;
        if (menu instanceof j.m) {
            mVar = (j.m) menu;
        } else {
            mVar = null;
        }
        if (i3 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2094x = true;
        }
        boolean onPreparePanel = this.f1774f.onPreparePanel(i3, view, menu);
        if (mVar != null) {
            mVar.f2094x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        j.m mVar = this.f1777j.y(0).h;
        if (mVar != null) {
            d(list, mVar, i3);
        } else {
            d(list, menu, i3);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.k.a(this.f1774f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1774f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f1774f.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [j.k, java.lang.Object, i.a, i.d] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        boolean z2;
        ViewGroup viewGroup;
        Context context;
        c0 c0Var = this.f1777j;
        Context context2 = c0Var.f1669p;
        if (i3 != 0) {
            return i.k.b(this.f1774f, callback, i3);
        }
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(context2, callback);
        i.a aVar = c0Var.f1679z;
        if (aVar != null) {
            aVar.a();
        }
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(c0Var, wVar);
        c0Var.z();
        m0 m0Var = c0Var.f1673t;
        int i4 = 1;
        if (m0Var != null) {
            l0 l0Var = m0Var.f1739i;
            if (l0Var != null) {
                l0Var.a();
            }
            m0Var.f1735c.setHideOnContentScrollEnabled(false);
            m0Var.f1737f.e();
            l0 l0Var2 = new l0(m0Var, m0Var.f1737f.getContext(), pVar);
            j.m mVar = l0Var2.f1727i;
            mVar.w();
            try {
                if (((androidx.emoji2.text.w) l0Var2.f1728j.f301g).o(l0Var2, mVar)) {
                    m0Var.f1739i = l0Var2;
                    l0Var2.i();
                    m0Var.f1737f.c(l0Var2);
                    m0Var.a(true);
                } else {
                    l0Var2 = null;
                }
                c0Var.f1679z = l0Var2;
            } finally {
                mVar.v();
            }
        }
        if (c0Var.f1679z == null) {
            j0.k0 k0Var = c0Var.D;
            if (k0Var != null) {
                k0Var.b();
            }
            i.a aVar2 = c0Var.f1679z;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (c0Var.A == null) {
                if (c0Var.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        i.c cVar = new i.c(context2, 0);
                        cVar.getTheme().setTo(newTheme);
                        context2 = cVar;
                    }
                    c0Var.A = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    c0Var.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    c0Var.B.setContentView(c0Var.A);
                    c0Var.B.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    c0Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    c0Var.B.setHeight(-2);
                    c0Var.C = new q(c0Var, i4);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) c0Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        c0Var.z();
                        m0 m0Var2 = c0Var.f1673t;
                        if (m0Var2 != null) {
                            context = m0Var2.b();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        c0Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (c0Var.A != null) {
                j0.k0 k0Var2 = c0Var.D;
                if (k0Var2 != null) {
                    k0Var2.b();
                }
                c0Var.A.e();
                Context context3 = c0Var.A.getContext();
                ActionBarContextView actionBarContextView = c0Var.A;
                ?? obj = new Object();
                obj.h = context3;
                obj.f1920i = actionBarContextView;
                obj.f1921j = pVar;
                j.m mVar2 = new j.m(actionBarContextView.getContext());
                mVar2.f2082l = 1;
                obj.f1924m = mVar2;
                mVar2.f2076e = obj;
                if (((androidx.emoji2.text.w) pVar.f301g).o(obj, mVar2)) {
                    obj.i();
                    c0Var.A.c(obj);
                    c0Var.f1679z = obj;
                    if (c0Var.E && (viewGroup = c0Var.F) != null && viewGroup.isLaidOut()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ActionBarContextView actionBarContextView2 = c0Var.A;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        j0.k0 a3 = j0.j0.a(c0Var.A);
                        a3.a(1.0f);
                        c0Var.D = a3;
                        a3.d(new s(i4, c0Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        c0Var.A.setVisibility(0);
                        if (c0Var.A.getParent() instanceof View) {
                            View view = (View) c0Var.A.getParent();
                            WeakHashMap weakHashMap = j0.j0.f2160a;
                            j0.a0.b(view);
                        }
                    }
                    if (c0Var.B != null) {
                        c0Var.f1670q.getDecorView().post(c0Var.C);
                    }
                } else {
                    c0Var.f1679z = null;
                }
            }
            c0Var.H();
            c0Var.f1679z = c0Var.f1679z;
        }
        c0Var.H();
        i.a aVar3 = c0Var.f1679z;
        if (aVar3 == null) {
            return null;
        }
        return wVar.h(aVar3);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1774f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
