package g1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.a f1814a;

    public b(q1.a aVar) {
        this.f1814a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1814a.f2784b.f2796t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        q1.c cVar = this.f1814a.f2784b;
        ColorStateList colorStateList = cVar.f2796t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f2800x, colorStateList.getDefaultColor()));
        }
    }
}
