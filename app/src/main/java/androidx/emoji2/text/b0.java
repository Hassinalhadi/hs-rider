package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f272f = false;

    /* renamed from: g, reason: collision with root package name */
    public Spannable f273g;

    public b0(Spannable spannable) {
        this.f273g = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f273g.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f273g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f273g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f273g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f273g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f273g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.f273g.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f273g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f273g.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f273g;
        if (!this.f272f && (spannable instanceof PrecomputedText)) {
            this.f273g = new SpannableString(spannable);
        }
        this.f272f = true;
        this.f273g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        Spannable spannable = this.f273g;
        if (!this.f272f && (spannable instanceof PrecomputedText)) {
            this.f273g = new SpannableString(spannable);
        }
        this.f272f = true;
        this.f273g.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.f273g.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f273g.toString();
    }
}
