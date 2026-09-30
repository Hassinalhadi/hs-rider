package e2;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;
import k.z0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f1520f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f1521g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f1522i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1523j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f1524k;

    /* renamed from: l, reason: collision with root package name */
    public int f1525l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f1526m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f1527n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1528o;

    public z(TextInputLayout textInputLayout, androidx.emoji2.text.s sVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1520f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1522i = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.f1521g = z0Var;
        if (k2.h.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1527n;
        checkableImageButton.setOnClickListener(null);
        a.y.b0(checkableImageButton, onLongClickListener);
        this.f1527n = null;
        checkableImageButton.setOnLongClickListener(null);
        a.y.b0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) sVar.f310c;
        if (typedArray.hasValue(70)) {
            this.f1523j = k2.h.m(getContext(), sVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f1524k = w1.j.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(sVar.i(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f1525l) {
                this.f1525l = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType u2 = a.y.u(typedArray.getInt(69, -1));
                this.f1526m = u2;
                checkableImageButton.setScaleType(u2);
            }
            z0Var.setVisibility(8);
            z0Var.setId(R.id.textinput_prefix_text);
            z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            z0Var.setAccessibilityLiveRegion(1);
            z0Var.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                z0Var.setTextColor(sVar.h(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.h = TextUtils.isEmpty(text2) ? null : text2;
            z0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(z0Var);
            return;
        }
        a.b.m("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i3;
        CheckableImageButton checkableImageButton = this.f1522i;
        if (checkableImageButton.getVisibility() == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        return this.f1521g.getPaddingStart() + getPaddingStart() + i3;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1522i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1523j;
            PorterDuff.Mode mode = this.f1524k;
            TextInputLayout textInputLayout = this.f1520f;
            a.y.h(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            a.y.Z(textInputLayout, checkableImageButton, this.f1523j);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f1527n;
        checkableImageButton.setOnClickListener(null);
        a.y.b0(checkableImageButton, onLongClickListener);
        this.f1527n = null;
        checkableImageButton.setOnLongClickListener(null);
        a.y.b0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        boolean z3;
        CheckableImageButton checkableImageButton = this.f1522i;
        int i3 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z2) {
            if (!z2) {
                i3 = 8;
            }
            checkableImageButton.setVisibility(i3);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f1520f.f1333j;
        if (editText == null) {
            return;
        }
        if (this.f1522i.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.f1521g.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i3;
        int i4 = 8;
        if (this.h != null && !this.f1528o) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        if (this.f1522i.getVisibility() == 0 || i3 == 0) {
            i4 = 0;
        }
        setVisibility(i4);
        this.f1521g.setVisibility(i3);
        this.f1520f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        d();
    }
}
