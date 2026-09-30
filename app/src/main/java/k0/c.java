package k0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import j0.t;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2466e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f2467f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2468g;
    public static final c h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f2469i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f2470j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f2471k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f2472l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2474b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2475c;
    public final m d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = null;
        new c((String) null, 1);
        new c((String) null, 2);
        new c((String) null, 4);
        new c((String) null, 8);
        f2466e = new c((String) null, 16);
        new c((String) null, 32);
        new c((String) null, 64);
        new c((String) null, 128);
        new c(256, f.class);
        new c(512, f.class);
        new c(1024, g.class);
        new c(2048, g.class);
        f2467f = new c((String) null, 4096);
        f2468g = new c((String) null, 8192);
        new c((String) null, 16384);
        new c((String) null, 32768);
        new c((String) null, 65536);
        new c(131072, k.class);
        h = new c((String) null, 262144);
        f2469i = new c((String) null, 524288);
        f2470j = new c((String) null, 1048576);
        new c(2097152, l.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, i.class);
        f2471k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2472l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, j.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, h.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 32) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction = null;
        }
        new c(accessibilityAction, R.id.ALT, null, null, null);
        if (i3 >= 32) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction2 = accessibilityAction6;
        } else {
            accessibilityAction2 = null;
        }
        new c(accessibilityAction2, R.id.CTRL, null, null, null);
        if (i3 >= 32) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction3 = accessibilityAction5;
        } else {
            accessibilityAction3 = null;
        }
        new c(accessibilityAction3, R.id.FUNCTION, null, null, null);
        if (i3 >= 33) {
            accessibilityAction4 = a.a.b();
        } else {
            accessibilityAction4 = null;
        }
        new c(accessibilityAction4, R.id.KEYCODE_0, null, null, null);
        if (i3 >= 34) {
            accessibilityAction7 = t.a();
        }
        new c(accessibilityAction7, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public c(Object obj, int i3, CharSequence charSequence, m mVar, Class cls) {
        this.f2474b = i3;
        this.d = mVar;
        if (obj == null) {
            this.f2473a = new AccessibilityNodeInfo.AccessibilityAction(i3, charSequence);
        } else {
            this.f2473a = obj;
        }
        this.f2475c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2473a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f2473a;
        Object obj3 = this.f2473a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f2473a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = d.d(this.f2474b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2473a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public c(int i3, Class cls) {
        this(null, i3, null, null, cls);
    }

    public c(String str, int i3) {
        this(null, i3, str, null, null);
    }
}
