package e2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public int f1410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditText f1411g;
    public final /* synthetic */ TextInputLayout h;

    public a0(TextInputLayout textInputLayout, EditText editText) {
        this.h = textInputLayout;
        this.f1411g = editText;
        this.f1410f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.f1347q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1363y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f1411g;
        int lineCount = editText.getLineCount();
        int i3 = this.f1410f;
        if (lineCount != i3) {
            if (lineCount < i3) {
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f1366z0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f1410f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
