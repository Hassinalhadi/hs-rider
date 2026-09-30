package e2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1448a;

    public o(q qVar) {
        this.f1448a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f1448a;
        n nVar = qVar.A;
        if (qVar.f1469x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f1469x;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (qVar.f1469x.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f1469x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f1469x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        qVar.b().l(qVar.f1469x);
        qVar.j(qVar.b());
    }
}
