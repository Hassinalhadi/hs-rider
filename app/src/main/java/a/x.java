package a;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68f;

    @Override // o2.a
    public final Object a() {
        switch (this.f68f) {
            case 0:
                int i3 = ImmLeaksCleaner.f73f;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new Object();
                } catch (NoSuchFieldException unused) {
                    return z.f69f;
                }
            default:
                return Integer.valueOf(r2.e.f2833f.a(2147418112) + 65536);
        }
    }
}
