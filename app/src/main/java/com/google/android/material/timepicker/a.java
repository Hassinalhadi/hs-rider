package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends w1.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1386f;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f1386f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1386f;
        Chip chip = chipTextInputComboView.f1367f;
        if (isEmpty) {
            chip.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a3 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a3)) {
            a3 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a3);
    }
}
