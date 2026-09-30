package w1;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public float f3250c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3251e;

    /* renamed from: f, reason: collision with root package name */
    public z1.d f3252f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3248a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final r1.b f3249b = new r1.b(1, this);
    public boolean d = true;

    public h(r1.e eVar) {
        this.f3251e = new WeakReference(null);
        this.f3251e = new WeakReference(eVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.f3250c;
        }
        TextPaint textPaint = this.f3248a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f3250c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f3250c;
    }
}
