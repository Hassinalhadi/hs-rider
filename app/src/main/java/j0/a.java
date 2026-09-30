package j0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.logistics.rider.lsposed.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final b f2140a;

    public a(b bVar) {
        this.f2140a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2140a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        androidx.emoji2.text.m b3 = this.f2140a.b(view);
        if (b3 != null) {
            return (AccessibilityNodeProvider) b3.f299g;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2140a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        k0.d dVar = new k0.d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = j0.f2160a;
        accessibilityNodeInfo.setScreenReaderFocusable(f0.c(view));
        accessibilityNodeInfo.setHeading(Boolean.valueOf(f0.b(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(f0.a(view));
        accessibilityNodeInfo.setStateDescription(h0.b(view));
        this.f2140a.d(view, dVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            dVar.b((k0.c) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2140a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2140a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        return this.f2140a.g(view, i3, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i3) {
        this.f2140a.h(view, i3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2140a.i(view, accessibilityEvent);
    }
}
