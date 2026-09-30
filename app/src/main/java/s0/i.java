package s0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final EditText f2959f;

    /* renamed from: g, reason: collision with root package name */
    public h f2960g;
    public boolean h = true;

    public i(EditText editText) {
        this.f2959f = editText;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a3.getClass();
                length = editableText.length();
            }
            a3.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        EditText editText = this.f2959f;
        if (!editText.isInEditMode() && this.h && androidx.emoji2.text.j.f286k != null && i4 <= i5 && (charSequence instanceof Spannable)) {
            int b3 = androidx.emoji2.text.j.a().b();
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 != 3) {
                        return;
                    }
                } else {
                    androidx.emoji2.text.j.a().e((Spannable) charSequence, i3, i5 + i3);
                    return;
                }
            }
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (this.f2960g == null) {
                this.f2960g = new h(editText);
            }
            a3.f(this.f2960g);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
