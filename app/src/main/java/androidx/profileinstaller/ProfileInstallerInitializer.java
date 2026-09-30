package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import b2.f;
import d1.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // d1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // d1.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new q0.b(this, context.getApplicationContext()));
        return new f(25);
    }
}
