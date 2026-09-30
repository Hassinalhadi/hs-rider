package s0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: f, reason: collision with root package name */
    public final TransformationMethod f2961f;

    public j(TransformationMethod transformationMethod) {
        this.f2961f = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2961f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.j.a().b() == 1) {
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            a3.getClass();
            return a3.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f2961f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i3, rect);
        }
    }
}
