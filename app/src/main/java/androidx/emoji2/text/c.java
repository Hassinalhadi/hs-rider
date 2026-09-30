package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f274b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f275a;

    public c() {
        TextPaint textPaint = new TextPaint();
        this.f275a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
