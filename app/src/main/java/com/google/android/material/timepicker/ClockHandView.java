package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1371s = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ValueAnimator f1372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1373g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1374i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1375j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1376k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1377l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1378m;

    /* renamed from: n, reason: collision with root package name */
    public float f1379n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1380o;

    /* renamed from: p, reason: collision with root package name */
    public double f1381p;

    /* renamed from: q, reason: collision with root package name */
    public int f1382q;

    /* renamed from: r, reason: collision with root package name */
    public int f1383r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1372f = valueAnimator;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f1376k = paint;
        this.f1377l = new RectF();
        this.f1383r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1973e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        k2.h.R(context, R.attr.motionDurationLong2, 200);
        k2.h.S(context, R.attr.motionEasingEmphasizedInterpolator, j1.a.f2194b);
        this.f1382q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1374i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1378m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1375j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i3 = ClockHandView.f1371s;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final void a(float f3) {
        this.f1372f.cancel();
        b(f3);
    }

    public final void b(float f3) {
        float f4 = f3 % 360.0f;
        this.f1379n = f4;
        this.f1381p = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i3 = this.f1383r;
        int i4 = this.f1382q;
        if (i3 == 2) {
            i4 = Math.round(i4 * 0.66f);
        }
        float f5 = width;
        float f6 = i4;
        float cos = (((float) Math.cos(this.f1381p)) * f6) + f5;
        float sin = (f6 * ((float) Math.sin(this.f1381p))) + height;
        float f7 = this.f1374i;
        this.f1377l.set(cos - f7, sin - f7, cos + f7, sin + f7);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.L - f4) > 0.001f) {
                clockFaceView.L = f4;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i3 = this.f1383r;
        int i4 = this.f1382q;
        if (i3 == 2) {
            i4 = Math.round(i4 * 0.66f);
        }
        float f3 = width;
        float f4 = i4;
        float cos = (((float) Math.cos(this.f1381p)) * f4) + f3;
        float f5 = height;
        float sin = (f4 * ((float) Math.sin(this.f1381p))) + f5;
        Paint paint = this.f1376k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f1374i, paint);
        double sin2 = Math.sin(this.f1381p);
        paint.setStrokeWidth(this.f1378m);
        canvas.drawLine(f3, f5, width + ((int) (Math.cos(this.f1381p) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f3, f5, this.f1375j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (!this.f1372f.isRunning()) {
            a(this.f1379n);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z3 = false;
                z2 = false;
            } else {
                z3 = this.f1380o;
                if (this.f1373g) {
                    if (((float) Math.hypot(x3 - (getWidth() / 2), y2 - (getHeight() / 2))) <= Math.round(this.f1382q * 0.66f) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    this.f1383r = i3;
                }
                z2 = false;
            }
        } else {
            this.f1380o = false;
            z2 = true;
            z3 = false;
        }
        boolean z6 = this.f1380o;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            i4 = degrees + 450;
        }
        float f3 = i4;
        if (this.f1379n != f3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z4) {
            if (z4 || z3) {
                a(f3);
            }
            this.f1380o = z6 | z5;
            return true;
        }
        z5 = true;
        this.f1380o = z6 | z5;
        return true;
    }
}
