package g1;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f1815f;

    public c(f fVar) {
        this.f1815f = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f1815f.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        this.f1815f.scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f1815f.unscheduleSelf(runnable);
    }
}
