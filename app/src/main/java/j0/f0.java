package j0;

import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class f0 {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
