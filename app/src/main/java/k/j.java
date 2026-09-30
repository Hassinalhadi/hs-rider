package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends z implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f2278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2278i = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        z2.a(this, getContentDescription());
        setOnTouchListener(new j.b(this, this));
    }

    @Override // k.l
    public final boolean a() {
        return false;
    }

    @Override // k.l
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2278i.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
