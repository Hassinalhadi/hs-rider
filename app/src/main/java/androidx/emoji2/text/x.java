package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x implements TextWatcher, SpanWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final Object f323f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f324g = new AtomicInteger(0);

    public x(Object obj) {
        this.f323f = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f323f).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f323f).beforeTextChanged(charSequence, i3, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f324g.get() > 0 && (obj instanceof a0)) {
            return;
        }
        ((SpanWatcher) this.f323f).onSpanAdded(spannable, obj, i3, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i4, int i5, int i6) {
        if (this.f324g.get() > 0 && (obj instanceof a0)) {
            return;
        }
        ((SpanWatcher) this.f323f).onSpanChanged(spannable, obj, i3, i4, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f324g.get() > 0 && (obj instanceof a0)) {
            return;
        }
        ((SpanWatcher) this.f323f).onSpanRemoved(spannable, obj, i3, i4);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f323f).onTextChanged(charSequence, i3, i4, i5);
    }
}
