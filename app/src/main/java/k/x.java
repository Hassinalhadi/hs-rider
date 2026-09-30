package k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2434a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.m f2435b;

    public x(TextView textView) {
        this.f2434a = textView;
        this.f2435b = new androidx.emoji2.text.m(textView);
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f2434a.getContext().obtainStyledAttributes(attributeSet, f.a.f1535i, i3, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((k2.h) this.f2435b.f299g).U(z2);
    }

    public final void c(boolean z2) {
        ((k2.h) this.f2435b.f299g).V(z2);
    }
}
