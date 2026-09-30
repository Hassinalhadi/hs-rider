package q0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g.k;
import java.util.Random;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2749a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2750b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        int i3 = this.f2749a;
        Object obj = this.f2750b;
        switch (i3) {
            case 0:
                ((Runnable) obj).run();
                return;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new k((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
