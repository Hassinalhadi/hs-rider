package e2;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b0 extends j0.b {
    public final TextInputLayout d;

    public b0(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        Editable editable;
        boolean z2;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        this.f2142a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        z zVar = textInputLayout.f1328g;
        z0 z0Var = zVar.f1521g;
        if (z0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z0Var);
            accessibilityNodeInfo.setTraversalAfter(z0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.f1522i);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(editable);
        } else if (!TextUtils.isEmpty(str)) {
            accessibilityNodeInfo.setText(str);
            if (!z3 && placeholderText != null) {
                accessibilityNodeInfo.setText(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            accessibilityNodeInfo.setHintText(str);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        z0 z0Var2 = textInputLayout.f1345p.f1502y;
        if (z0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(z0Var2);
        }
        textInputLayout.h.b().m(dVar);
    }

    @Override // j0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().n(accessibilityEvent);
    }
}
