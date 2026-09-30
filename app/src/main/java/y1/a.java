package y1;

import android.R;
import android.content.res.ColorStateList;
import k.d0;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f3310l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3311j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3312k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3311j == null) {
            int k3 = h.k(this, com.logistics.rider.lsposed.R.attr.colorControlActivated);
            int k4 = h.k(this, com.logistics.rider.lsposed.R.attr.colorOnSurface);
            int k5 = h.k(this, com.logistics.rider.lsposed.R.attr.colorSurface);
            this.f3311j = new ColorStateList(f3310l, new int[]{h.C(k5, k3, 1.0f), h.C(k5, k4, 0.54f), h.C(k5, k4, 0.38f), h.C(k5, k4, 0.38f)});
        }
        return this.f3311j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3312k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f3312k = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
