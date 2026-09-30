package z1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3355c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, h hVar) {
        this.d = dVar;
        this.f3353a = context;
        this.f3354b = textPaint;
        this.f3355c = hVar;
    }

    @Override // k2.h
    public final void G(int i3) {
        this.f3355c.G(i3);
    }

    @Override // k2.h
    public final void H(Typeface typeface, boolean z2) {
        this.d.f(this.f3353a, this.f3354b, typeface);
        this.f3355c.H(typeface, z2);
    }
}
