package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e0 extends RatingBar {

    /* renamed from: f, reason: collision with root package name */
    public final c0 f2250f;

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        m2.a(this, getContext());
        c0 c0Var = new c0(this);
        this.f2250f = c0Var;
        c0Var.c(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        Bitmap bitmap = (Bitmap) this.f2250f.f2240c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
