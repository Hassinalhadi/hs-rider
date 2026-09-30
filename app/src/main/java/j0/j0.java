package j0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2160a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2161b = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: c, reason: collision with root package name */
    public static final w f2162c = new Object();
    public static final y d = new y();

    public static k0 a(View view) {
        if (f2160a == null) {
            f2160a = new WeakHashMap();
        }
        k0 k0Var = (k0) f2160a.get(view);
        if (k0Var == null) {
            k0 k0Var2 = new k0(view);
            f2160a.put(view, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] c(k.w wVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return i0.a(wVar);
        }
        return (String[]) wVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void d(View view, int i3) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (f0.a(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i4 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z2) {
                if (i3 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i3);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(f0.a(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z2) {
                i4 = 2048;
            }
            obtain2.setEventType(i4);
            obtain2.setContentChangeTypes(i3);
            if (z2) {
                obtain2.getText().add(f0.a(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g e(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return i0.b(view, gVar);
        }
        n0.h hVar = (n0.h) view.getTag(R.id.tag_on_receive_content_listener);
        o oVar = f2162c;
        if (hVar != null) {
            g a3 = n0.h.a(view, gVar);
            if (a3 == null) {
                return null;
            }
            if (view instanceof o) {
                oVar = (o) view;
            }
            return oVar.a(a3);
        }
        if (view instanceof o) {
            oVar = (o) view;
        }
        return oVar.a(gVar);
    }

    public static void f(View view, int i3) {
        ArrayList b3 = b(view);
        for (int i4 = 0; i4 < b3.size(); i4++) {
            if (((k0.c) b3.get(i4)).a() == i3) {
                b3.remove(i4);
                return;
            }
        }
    }

    public static void g(View view, k0.c cVar, k0.m mVar) {
        b bVar;
        k0.c cVar2 = new k0.c(null, cVar.f2474b, null, mVar, cVar.f2475c);
        View.AccessibilityDelegate a3 = g0.a(view);
        if (a3 == null) {
            bVar = null;
        } else if (a3 instanceof a) {
            bVar = ((a) a3).f2140a;
        } else {
            bVar = new b(a3);
        }
        if (bVar == null) {
            bVar = new b();
        }
        h(view, bVar);
        f(view, cVar2.a());
        b(view).add(cVar2);
        d(view, 0);
    }

    public static void h(View view, b bVar) {
        a aVar;
        if (bVar == null && (g0.a(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f2143b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void i(View view, CharSequence charSequence) {
        boolean z2;
        new x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).d(view, charSequence);
        y yVar = d;
        if (charSequence != null) {
            WeakHashMap weakHashMap = yVar.f2187f;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z2));
            view.addOnAttachStateChangeListener(yVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yVar);
                return;
            }
            return;
        }
        yVar.f2187f.remove(view);
        view.removeOnAttachStateChangeListener(yVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(yVar);
    }
}
