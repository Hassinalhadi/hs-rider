package h0;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1889a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1891c;
    public final int d;

    public c(PrecomputedText.Params params) {
        this.f1889a = params.getTextPaint();
        this.f1890b = params.getTextDirection();
        this.f1891c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i3 = cVar.f1891c;
        TextPaint textPaint = cVar.f1889a;
        if (this.f1891c == i3 && this.d == cVar.d) {
            TextPaint textPaint2 = this.f1889a;
            if (textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales()) && (textPaint2.getTypeface() != null ? textPaint2.getTypeface().equals(textPaint.getTypeface()) : textPaint.getTypeface() == null) && this.f1890b == cVar.f1890b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1889a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1890b, Integer.valueOf(this.f1891c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1889a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f1890b);
        sb.append(", breakStrategy=" + this.f1891c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }
}
