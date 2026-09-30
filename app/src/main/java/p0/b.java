package p0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.m;
import b2.f;
import com.google.android.material.chip.Chip;
import j0.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k2.h;
import n.i;
import n.k;
import r1.e;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class b extends j0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f2663n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final f f2664o = new f(15);

    /* renamed from: p, reason: collision with root package name */
    public static final f f2665p = new f(16);
    public final AccessibilityManager h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f2669i;

    /* renamed from: j, reason: collision with root package name */
    public a f2670j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2666e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2667f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2668g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f2671k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f2672l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f2673m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f2669i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = j0.f2160a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // j0.b
    public final m b(View view) {
        if (this.f2670j == null) {
            this.f2670j = new a(this);
        }
        return this.f2670j;
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        boolean z2;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((r1.d) this).f2808q;
        e eVar = chip.f1198j;
        if (eVar != null && eVar.f2809b0) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        dVar.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i3) {
        if (this.f2672l != i3) {
            return false;
        }
        this.f2672l = Integer.MIN_VALUE;
        p(i3, false);
        r(i3, 8);
        return true;
    }

    public final k0.d k(int i3) {
        boolean z2;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k0.d dVar = new k0.d(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        dVar.h("android.view.View");
        Rect rect = f2663n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f2669i;
        obtain.setParent(chip);
        o(i3, dVar);
        if (dVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2666e;
        dVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    dVar.f2477b = i3;
                    obtain.setSource(chip, i3);
                    if (this.f2671k == i3) {
                        obtain.setAccessibilityFocused(true);
                        dVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        dVar.a(64);
                    }
                    if (this.f2672l == i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        dVar.a(2);
                    } else if (obtain.isFocusable()) {
                        dVar.a(1);
                    }
                    obtain.setFocused(z2);
                    int[] iArr = this.f2668g;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        dVar.f(rect3);
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.f2667f;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                Object parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        dVar.f2476a.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return dVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    public final boolean m(int i3, Rect rect) {
        Object obj;
        k0.d dVar;
        boolean z2;
        int i4;
        Object obj2;
        k0.d dVar2;
        int lastIndexOf;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        k kVar = new k();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            kVar.b(((Integer) arrayList.get(i5)).intValue(), k(((Integer) arrayList.get(i5)).intValue()));
        }
        int i6 = this.f2672l;
        int i7 = Integer.MIN_VALUE;
        if (i6 == Integer.MIN_VALUE) {
            dVar = null;
        } else {
            int a3 = o.a.a(kVar.h, i6, kVar.f2575f);
            if (a3 < 0 || (obj = kVar.f2576g[a3]) == i.f2572b) {
                obj = null;
            }
            dVar = (k0.d) obj;
        }
        f fVar = f2664o;
        f fVar2 = f2665p;
        Chip chip = this.f2669i;
        int i8 = -1;
        if (i3 != 1 && i3 != 2) {
            if (i3 != 17 && i3 != 33 && i3 != 66 && i3 != 130) {
                a.b.m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.f2672l;
            if (i9 != Integer.MIN_VALUE) {
                n(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i3 != 17) {
                    if (i3 != 33) {
                        if (i3 != 66) {
                            if (i3 == 130) {
                                rect2.set(0, -1, width, -1);
                            } else {
                                a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                        }
                    } else {
                        rect2.set(0, height, width, height);
                    }
                } else {
                    rect2.set(width, 0, width, height);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i3 != 17) {
                if (i3 != 33) {
                    if (i3 != 66) {
                        if (i3 == 130) {
                            rect3.offset(0, -(rect2.height() + 1));
                        } else {
                            a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    } else {
                        rect3.offset(-(rect2.width() + 1), 0);
                    }
                } else {
                    rect3.offset(0, rect2.height() + 1);
                }
            } else {
                rect3.offset(rect2.width() + 1, 0);
            }
            fVar2.getClass();
            int i10 = kVar.h;
            Rect rect4 = new Rect();
            dVar2 = null;
            for (int i11 = 0; i11 < i10; i11++) {
                k0.d dVar3 = (k0.d) kVar.f2576g[i11];
                if (dVar3 != dVar) {
                    fVar.getClass();
                    dVar3.f(rect4);
                    if (h.y(i3, rect2, rect4)) {
                        if (h.y(i3, rect2, rect3) && !h.c(i3, rect2, rect4, rect3)) {
                            if (!h.c(i3, rect2, rect3, rect4)) {
                                int D = h.D(i3, rect2, rect4);
                                int F = h.F(i3, rect2, rect4);
                                int i12 = (F * F) + (D * 13 * D);
                                int D2 = h.D(i3, rect2, rect3);
                                int F2 = h.F(i3, rect2, rect3);
                                if (i12 >= (F2 * F2) + (D2 * 13 * D2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        dVar2 = dVar3;
                    }
                }
            }
            i4 = 0;
        } else {
            WeakHashMap weakHashMap = j0.f2160a;
            if (chip.getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            fVar2.getClass();
            int i13 = kVar.h;
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList2.add((k0.d) kVar.f2576g[i14]);
            }
            Collections.sort(arrayList2, new c(z2, fVar));
            if (i3 != 1) {
                if (i3 == 2) {
                    int size = arrayList2.size();
                    if (dVar == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(dVar);
                    }
                    int i15 = lastIndexOf + 1;
                    if (i15 < size) {
                        obj3 = arrayList2.get(i15);
                    } else {
                        obj3 = null;
                    }
                    i4 = 0;
                    obj2 = obj3;
                } else {
                    a.b.m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
            } else {
                i4 = 0;
                int size2 = arrayList2.size();
                if (dVar != null) {
                    size2 = arrayList2.indexOf(dVar);
                }
                int i16 = size2 - 1;
                if (i16 >= 0) {
                    obj2 = arrayList2.get(i16);
                } else {
                    obj2 = null;
                }
            }
            dVar2 = (k0.d) obj2;
        }
        k0.d dVar4 = dVar2;
        if (dVar4 != null) {
            int i17 = kVar.h;
            int i18 = i4;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                if (kVar.f2576g[i18] == dVar4) {
                    i8 = i18;
                    break;
                }
                i18++;
            }
            i7 = kVar.f2575f[i8];
        }
        return q(i7);
    }

    public final k0.d n(int i3) {
        if (i3 == -1) {
            Chip chip = this.f2669i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            k0.d dVar = new k0.d(obtain);
            WeakHashMap weakHashMap = j0.f2160a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                dVar.f2476a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
            }
            return dVar;
        }
        return k(i3);
    }

    public abstract void o(int i3, k0.d dVar);

    public abstract void p(int i3, boolean z2);

    public final boolean q(int i3) {
        int i4;
        Chip chip = this.f2669i;
        if ((chip.isFocused() || chip.requestFocus()) && (i4 = this.f2672l) != i3) {
            if (i4 != Integer.MIN_VALUE) {
                j(i4);
            }
            if (i3 == Integer.MIN_VALUE) {
                return false;
            }
            this.f2672l = i3;
            p(i3, true);
            r(i3, 8);
            return true;
        }
        return false;
    }

    public final void r(int i3, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i3 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.f2669i).getParent()) != null) {
            if (i3 != -1) {
                obtain = AccessibilityEvent.obtain(i4);
                k0.d n2 = n(i3);
                obtain.getText().add(n2.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n2.f2476a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i3);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i4);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
