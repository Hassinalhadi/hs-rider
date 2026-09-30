package s0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2950b;

    public c(TextView textView, d dVar) {
        this.f2949a = new WeakReference(textView);
        this.f2950b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2949a.get();
        InputFilter inputFilter = (InputFilter) this.f2950b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a3.getClass();
                            length = text.length();
                        }
                        CharSequence e3 = a3.e(text, 0, length);
                        if (text != e3) {
                            int selectionStart = Selection.getSelectionStart(e3);
                            int selectionEnd = Selection.getSelectionEnd(e3);
                            textView.setText(e3);
                            if (e3 instanceof Spannable) {
                                Spannable spannable = (Spannable) e3;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
