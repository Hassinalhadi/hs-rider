package b0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f689a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f691c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f689a = colorStateList;
        this.f690b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f691c = hashCode;
    }
}
