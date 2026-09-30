package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.a;
import java.lang.ref.WeakReference;
import k.b3;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: f, reason: collision with root package name */
    public int f193f;

    /* renamed from: g, reason: collision with root package name */
    public int f194g;
    public WeakReference h;

    /* renamed from: i, reason: collision with root package name */
    public LayoutInflater f195i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f193f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1552z, 0, 0);
        this.f194g = obtainStyledAttributes.getResourceId(2, -1);
        this.f193f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f193f != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f195i;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f193f, viewGroup, false);
                int i3 = this.f194g;
                if (i3 != -1) {
                    inflate.setId(i3);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.h = new WeakReference(inflate);
                return inflate;
            }
            b.m("ViewStub must have a valid layoutResource");
            return null;
        }
        b.i("ViewStub must have a non-null ViewGroup viewParent");
        return null;
    }

    public int getInflatedId() {
        return this.f194g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f195i;
    }

    public int getLayoutResource() {
        return this.f193f;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f194g = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f195i = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f193f = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i3);
                return;
            } else {
                b.i("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i3);
        if (i3 != 0 && i3 != 4) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(b3 b3Var) {
    }
}
