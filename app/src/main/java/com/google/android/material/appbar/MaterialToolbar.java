package com.google.android.material.appbar;

import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b1.o;
import com.logistics.rider.lsposed.R;
import g2.a;
import java.util.ArrayList;
import java.util.Collections;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;
    public boolean a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1115b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView.ScaleType f1116c0;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f1117d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray e3 = j.e(context2, attributeSet, i1.a.f1989v, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (e3.hasValue(2)) {
            setNavigationIconTint(e3.getColor(2, -1));
        }
        this.a0 = e3.getBoolean(4, false);
        this.f1115b0 = e3.getBoolean(3, false);
        int i3 = e3.getInt(1, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = e0;
            if (i3 < scaleTypeArr.length) {
                this.f1116c0 = scaleTypeArr[i3];
            }
        }
        if (e3.hasValue(0)) {
            this.f1117d0 = Boolean.valueOf(e3.getBoolean(0, false));
        }
        e3.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else if (background instanceof ColorDrawable) {
            colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
        } else if (background instanceof ColorStateListDrawable) {
            colorStateList = ((ColorStateListDrawable) background).getColorStateList();
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            b2.j jVar = new b2.j();
            jVar.m(colorStateList);
            jVar.j(context2);
            jVar.l(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1116c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof b2.j) {
            y.c0(this, (b2.j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i3, i4, i5, i6);
        o oVar = j.f3255c;
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.a0 || this.f1115b0) {
            ArrayList d = j.d(this, getTitle());
            if (d.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d, oVar);
            }
            ArrayList d3 = j.d(this, getSubtitle());
            if (d3.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d3, oVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.a0 && textView != null) {
                    u(textView, pair);
                }
                if (this.f1115b0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i7++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1117d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1116c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof b2.j) {
            ((b2.j) background).l(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f1117d0;
        if (bool != null && bool.booleanValue() == z2) {
            return;
        }
        this.f1117d0 = Boolean.valueOf(z2);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1116c0 != scaleType) {
            this.f1116c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i3) {
        this.W = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f1115b0 != z2) {
            this.f1115b0 = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.a0 != z2) {
            this.a0 = z2;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i3;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i3 += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i3, textView.getTop(), i4, textView.getBottom());
    }
}
