package v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class t extends c {

    /* renamed from: m, reason: collision with root package name */
    public boolean f3175m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3176n;

    @Override // v.c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // v.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3168b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 6) {
                    this.f3175m = true;
                } else if (index == 22) {
                    this.f3176n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(s.g gVar, int i3, int i4);

    @Override // v.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3175m || this.f3176n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i3 = 0; i3 < this.f3031g; i3++) {
                    View view = (View) constraintLayout.f198f.get(this.f3030f[i3]);
                    if (view != null) {
                        if (this.f3175m) {
                            view.setVisibility(visibility);
                        }
                        if (this.f3176n && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
