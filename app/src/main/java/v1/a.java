package v1;

import android.content.Context;
import com.logistics.rider.lsposed.R;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3181f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3183b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3184c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3185e;

    public a(Context context) {
        boolean Q = h.Q(context, R.attr.elevationOverlayEnabled, false);
        int j3 = h.j(context, R.attr.elevationOverlayColor, 0);
        int j4 = h.j(context, R.attr.elevationOverlayAccentColor, 0);
        int j5 = h.j(context, R.attr.colorSurface, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f3182a = Q;
        this.f3183b = j3;
        this.f3184c = j4;
        this.d = j5;
        this.f3185e = f3;
    }
}
