package s0;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends k2.h {

    /* renamed from: a, reason: collision with root package name */
    public final f f2957a;

    public g(TextView textView) {
        this.f2957a = new f(textView);
    }

    @Override // k2.h
    public final void U(boolean z2) {
        boolean z3;
        if (androidx.emoji2.text.j.f286k != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return;
        }
        this.f2957a.U(z2);
    }

    @Override // k2.h
    public final void V(boolean z2) {
        boolean z3;
        if (androidx.emoji2.text.j.f286k != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f fVar = this.f2957a;
        if (!z3) {
            fVar.f2956c = z2;
        } else {
            fVar.V(z2);
        }
    }

    @Override // k2.h
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        boolean z2;
        if (androidx.emoji2.text.j.f286k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return inputFilterArr;
        }
        return this.f2957a.p(inputFilterArr);
    }
}
