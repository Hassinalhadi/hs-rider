package e2;

import android.text.Editable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n extends w1.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f1447f;

    public n(q qVar) {
        this.f1447f = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1447f.b().a();
    }

    @Override // w1.i, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        this.f1447f.b().b();
    }
}
