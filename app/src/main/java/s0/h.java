package s0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2958a;

    public h(EditText editText) {
        this.f2958a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        i.a((EditText) this.f2958a.get(), 1);
    }
}
