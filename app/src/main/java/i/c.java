package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f1915f;

    /* renamed from: a, reason: collision with root package name */
    public int f1916a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f1917b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f1918c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f1919e;

    public c(Context context, int i3) {
        super(context);
        this.f1916a = i3;
    }

    public final void a(Configuration configuration) {
        if (this.f1919e == null) {
            if (this.d == null) {
                this.d = new Configuration(configuration);
                return;
            } else {
                a.b.i("Override configuration has already been set");
                return;
            }
        }
        a.b.i("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1917b == null) {
            this.f1917b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1917b.setTo(theme);
            }
        }
        this.f1917b.applyStyle(this.f1916a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f1919e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f1915f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f1915f = configuration2;
                }
                if (!configuration.equals(f1915f)) {
                    this.f1919e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f1919e = super.getResources();
        }
        return this.f1919e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1918c == null) {
                this.f1918c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1918c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1917b;
        if (theme != null) {
            return theme;
        }
        if (this.f1916a == 0) {
            this.f1916a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1917b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f1916a != i3) {
            this.f1916a = i3;
            b();
        }
    }
}
