package g1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1860a;

    /* renamed from: b, reason: collision with root package name */
    public m f1861b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1862c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1863e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f1864f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1865g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public int f1866i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1868k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f1869l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1860a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
