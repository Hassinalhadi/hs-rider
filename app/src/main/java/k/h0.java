package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.logistics.rider.lsposed.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final g0 f2261e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2262f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2263g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2264i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2265j;

    public h0(g0 g0Var) {
        super(g0Var);
        this.f2263g = null;
        this.h = null;
        this.f2264i = false;
        this.f2265j = false;
        this.f2261e = g0Var;
    }

    @Override // k.c0
    public final void c(AttributeSet attributeSet, int i3) {
        super.c(attributeSet, R.attr.seekBarStyle);
        g0 g0Var = this.f2261e;
        Context context = g0Var.getContext();
        int[] iArr = f.a.f1534g;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) r3.f310c;
        Context context2 = g0Var.getContext();
        TypedArray typedArray2 = (TypedArray) r3.f310c;
        WeakHashMap weakHashMap = j0.j0.f2160a;
        j0.g0.b(g0Var, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable j3 = r3.j(0);
        if (j3 != null) {
            g0Var.setThumb(j3);
        }
        Drawable i4 = r3.i(1);
        Drawable drawable = this.f2262f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2262f = i4;
        if (i4 != null) {
            i4.setCallback(g0Var);
            i4.setLayoutDirection(g0Var.getLayoutDirection());
            if (i4.isStateful()) {
                i4.setState(g0Var.getDrawableState());
            }
            g();
        }
        g0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = h1.b(typedArray.getInt(3, -1), this.h);
            this.f2265j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2263g = r3.h(2);
            this.f2264i = true;
        }
        r3.t();
        g();
    }

    public final void g() {
        Drawable drawable = this.f2262f;
        if (drawable != null) {
            if (this.f2264i || this.f2265j) {
                Drawable mutate = drawable.mutate();
                this.f2262f = mutate;
                if (this.f2264i) {
                    mutate.setTintList(this.f2263g);
                }
                if (this.f2265j) {
                    this.f2262f.setTintMode(this.h);
                }
                if (this.f2262f.isStateful()) {
                    this.f2262f.setState(this.f2261e.getDrawableState());
                }
            }
        }
    }

    public final void h(Canvas canvas) {
        int i3;
        if (this.f2262f != null) {
            int max = this.f2261e.getMax();
            int i4 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2262f.getIntrinsicWidth();
                int intrinsicHeight = this.f2262f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i3 = intrinsicWidth / 2;
                } else {
                    i3 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i4 = intrinsicHeight / 2;
                }
                this.f2262f.setBounds(-i3, -i4, i3, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f2262f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
