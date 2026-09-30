package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g0 extends SeekBar {

    /* renamed from: f, reason: collision with root package name */
    public final h0 f2259f;

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        m2.a(this, getContext());
        h0 h0Var = new h0(this);
        this.f2259f = h0Var;
        h0Var.c(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h0 h0Var = this.f2259f;
        g0 g0Var = h0Var.f2261e;
        Drawable drawable = h0Var.f2262f;
        if (drawable != null && drawable.isStateful() && drawable.setState(g0Var.getDrawableState())) {
            g0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2259f.f2262f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2259f.h(canvas);
    }
}
