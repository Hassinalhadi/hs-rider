package k0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.m f2478a;

    public e(androidx.emoji2.text.m mVar) {
        this.f2478a = mVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f2478a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        d s3 = this.f2478a.s(i3);
        if (s3 == null) {
            return null;
        }
        return s3.f2476a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f2478a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        d t3 = this.f2478a.t(i3);
        if (t3 == null) {
            return null;
        }
        return t3.f2476a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        return this.f2478a.v(i3, i4, bundle);
    }
}
