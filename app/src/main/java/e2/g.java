package e2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends b2.j {
    public static final /* synthetic */ int J = 0;
    public f I;

    @Override // b2.j
    public final void e(Canvas canvas) {
        if (this.I.f1426r.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.I.f1426r);
        super.e(canvas);
        canvas.restore();
    }

    @Override // b2.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I = new f(this.I);
        return this;
    }

    public final void s(float f3, float f4, float f5, float f6) {
        RectF rectF = this.I.f1426r;
        if (f3 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f4, f5, f6);
        invalidateSelf();
    }
}
