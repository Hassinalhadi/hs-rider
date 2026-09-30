package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y2 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2443a;

    /* renamed from: b, reason: collision with root package name */
    public int f2444b;

    /* renamed from: c, reason: collision with root package name */
    public View f2445c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2446e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2448g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2449i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2450j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2451k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2452l;

    /* renamed from: m, reason: collision with root package name */
    public k f2453m;

    /* renamed from: n, reason: collision with root package name */
    public int f2454n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2455o;

    public final void a(int i3) {
        View view;
        Toolbar toolbar = this.f2443a;
        int i4 = this.f2444b ^ i3;
        this.f2444b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                if ((this.f2444b & 4) != 0) {
                    Drawable drawable = this.f2447f;
                    if (drawable == null) {
                        drawable = this.f2455o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            if ((i4 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f2449i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) != 0 && (view = this.f2445c) != null) {
                if ((i3 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f2444b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2450j);
            Toolbar toolbar = this.f2443a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2454n);
            } else {
                toolbar.setNavigationContentDescription(this.f2450j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f2444b;
        if ((i3 & 2) != 0) {
            if ((i3 & 1) != 0) {
                drawable = this.f2446e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f2443a.setLogo(drawable);
    }
}
