package j0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.logistics.rider.lsposed.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2141c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2142a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2143b;

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2142a = accessibilityDelegate;
        this.f2143b = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2142a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.emoji2.text.m b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2142a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.emoji2.text.m(19, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2142a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, k0.d dVar) {
        this.f2142a.onInitializeAccessibilityNodeInfo(view, dVar.f2476a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2142a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2142a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i3, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i4 >= list.size()) {
                break;
            }
            k0.c cVar = (k0.c) list.get(i4);
            if (cVar.a() == i3) {
                Class cls = cVar.f2475c;
                k0.m mVar = cVar.d;
                if (mVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e3) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e3);
                        }
                    }
                    z2 = mVar.i(view);
                }
            } else {
                i4++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f2142a.performAccessibilityAction(view, i3, bundle);
        }
        if (!z2 && i3 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i6 = 0;
                while (true) {
                    if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i6])) {
                        clickableSpan.onClick(view);
                        z3 = true;
                        break;
                    }
                    i6++;
                }
            }
            return z3;
        }
        return z2;
    }

    public void h(View view, int i3) {
        this.f2142a.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2142a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b() {
        this(f2141c);
    }
}
