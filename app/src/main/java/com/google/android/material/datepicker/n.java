package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1249g;

    public /* synthetic */ n(int i3, Object obj) {
        this.f1248f = i3;
        this.f1249g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        int i3 = this.f1248f;
        Object obj = this.f1249g;
        switch (i3) {
            case 0:
                ((p) obj).G();
                throw null;
            case 1:
                e2.d dVar = (e2.d) obj;
                EditText editText = dVar.f1419i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.p();
                    return;
                }
                return;
            case 2:
                ((e2.m) obj).t();
                return;
            default:
                e2.y yVar = (e2.y) obj;
                EditText editText2 = yVar.f1518f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = yVar.f1518f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    EditText editText4 = yVar.f1518f;
                    if (z2) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        yVar.f1518f.setSelection(selectionEnd);
                    }
                    yVar.p();
                    return;
                }
                return;
        }
    }
}
