package g1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1819a;

    public e(Drawable.ConstantState constantState) {
        this.f1819a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1819a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1819a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f1819a.newDrawable();
        fVar.f1824f = newDrawable;
        newDrawable.setCallback(fVar.f1823k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f1819a.newDrawable(resources);
        fVar.f1824f = newDrawable;
        newDrawable.setCallback(fVar.f1823k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f1819a.newDrawable(resources, theme);
        fVar.f1824f = newDrawable;
        newDrawable.setCallback(fVar.f1823k);
        return fVar;
    }
}
