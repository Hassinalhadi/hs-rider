package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f, reason: collision with root package name */
    public final Chip f1367f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f1368g;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1367f = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f1368g = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1367f.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1368g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        int i3;
        Chip chip = this.f1367f;
        chip.setChecked(z2);
        int i4 = 0;
        if (z2) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        EditText editText = this.f1368g;
        editText.setVisibility(i3);
        if (z2) {
            i4 = 8;
        }
        chip.setVisibility(i4);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new a.k(12, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1367f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i3, Object obj) {
        this.f1367f.setTag(i3, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f1367f.toggle();
    }
}
