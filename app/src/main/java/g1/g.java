package g1;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1824f;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        return super.onLevelChange(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setChangingConfigurations(i3);
        } else {
            super.setChangingConfigurations(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i3, PorterDuff.Mode mode) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setColorFilter(i3, mode);
        } else {
            super.setColorFilter(i3, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setHotspotBounds(i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
