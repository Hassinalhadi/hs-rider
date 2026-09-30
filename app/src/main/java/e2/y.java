package e2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f1517e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1518f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f1519g;

    public y(q qVar, int i3) {
        super(qVar);
        this.f1517e = R.drawable.design_password_eye;
        this.f1519g = new com.google.android.material.datepicker.n(3, this);
        if (i3 != 0) {
            this.f1517e = i3;
        }
    }

    @Override // e2.r
    public final void b() {
        p();
    }

    @Override // e2.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // e2.r
    public final int d() {
        return this.f1517e;
    }

    @Override // e2.r
    public final View.OnClickListener f() {
        return this.f1519g;
    }

    @Override // e2.r
    public final boolean j() {
        return true;
    }

    @Override // e2.r
    public final boolean k() {
        boolean z2;
        EditText editText = this.f1518f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return !z2;
    }

    @Override // e2.r
    public final void l(EditText editText) {
        this.f1518f = editText;
        p();
    }

    @Override // e2.r
    public final void q() {
        EditText editText = this.f1518f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1518f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // e2.r
    public final void r() {
        EditText editText = this.f1518f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
