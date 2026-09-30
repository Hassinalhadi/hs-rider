package s0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2944a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f2945b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2946c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2946c;
        if (cls != null) {
            return new y(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
