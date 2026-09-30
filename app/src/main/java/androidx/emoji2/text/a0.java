package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {

    /* renamed from: g, reason: collision with root package name */
    public final z f269g;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f271j;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f268f = new Paint.FontMetricsInt();
    public short h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f270i = 1.0f;

    public a0(z zVar) {
        a.y.n(zVar, "rasterizer cannot be null");
        this.f269g = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f271j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f271j = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i5, f3 + this.h, i7, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f4 = i6;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z zVar = this.f269g;
        w wVar = zVar.f328b;
        Typeface typeface = (Typeface) wVar.f322i;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wVar.f321g, zVar.f327a * 2, 2, f3, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        short s3;
        Paint.FontMetricsInt fontMetricsInt2 = this.f268f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.f269g;
        r0.a b3 = zVar.b();
        int a3 = b3.a(14);
        short s4 = 0;
        if (a3 != 0) {
            s3 = ((ByteBuffer) b3.d).getShort(a3 + b3.f2190a);
        } else {
            s3 = 0;
        }
        this.f270i = abs / s3;
        r0.a b4 = zVar.b();
        int a4 = b4.a(14);
        if (a4 != 0) {
            ((ByteBuffer) b4.d).getShort(a4 + b4.f2190a);
        }
        r0.a b5 = zVar.b();
        int a5 = b5.a(12);
        if (a5 != 0) {
            s4 = ((ByteBuffer) b5.d).getShort(a5 + b5.f2190a);
        }
        short s5 = (short) (s4 * this.f270i);
        this.h = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
