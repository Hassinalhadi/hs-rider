package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: f, reason: collision with root package name */
    public static final n f1758f = new n(new Object());

    /* renamed from: g, reason: collision with root package name */
    public static final int f1759g = -100;
    public static f0.e h = null;

    /* renamed from: i, reason: collision with root package name */
    public static f0.e f1760i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f1761j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1762k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final n.g f1763l = new n.g();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1764m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1765n = new Object();

    public static boolean b(Context context) {
        if (f1761j == null) {
            try {
                int i3 = h0.f1715f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) h0.class), g0.a() | 128).metaData;
                if (bundle != null) {
                    f1761j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1761j = Boolean.FALSE;
            }
        }
        return f1761j.booleanValue();
    }

    public static void e(c0 c0Var) {
        synchronized (f1764m) {
            try {
                n.g gVar = f1763l;
                gVar.getClass();
                n.b bVar = new n.b(gVar);
                while (bVar.hasNext()) {
                    p pVar = (p) ((WeakReference) bVar.next()).get();
                    if (pVar == c0Var || pVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i3);

    public abstract void i(int i3);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
