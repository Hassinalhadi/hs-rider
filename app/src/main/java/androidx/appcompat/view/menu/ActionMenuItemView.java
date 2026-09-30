package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.a;
import j.b;
import j.c;
import j.m;
import j.o;
import j.z;
import k.l;
import k.z0;
import k.z2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ActionMenuItemView extends z0 implements z, View.OnClickListener, l {

    /* renamed from: l, reason: collision with root package name */
    public o f78l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f79m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f80n;

    /* renamed from: o, reason: collision with root package name */
    public j.l f81o;

    /* renamed from: p, reason: collision with root package name */
    public b f82p;

    /* renamed from: q, reason: collision with root package name */
    public c f83q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f85s;

    /* renamed from: t, reason: collision with root package name */
    public final int f86t;

    /* renamed from: u, reason: collision with root package name */
    public int f87u;

    /* renamed from: v, reason: collision with root package name */
    public final int f88v;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f84r = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1531c, 0, 0);
        this.f86t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f88v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f87u = -1;
        setSaveEnabled(false);
    }

    @Override // k.l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.l
    public final boolean b() {
        if (!TextUtils.isEmpty(getText()) && this.f78l.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // j.z
    public final void c(o oVar) {
        int i3;
        this.f78l = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2097a);
        if (oVar.isVisible()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        setVisibility(i3);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f82p == null) {
            this.f82p = new b(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            if ((i3 < 640 || i4 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f79m);
        if (this.f80n != null && ((this.f78l.f2119y & 4) != 4 || (!this.f84r && !this.f85s))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.f79m;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f78l.f2111q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f78l.f2100e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f78l.f2112r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.f78l.f2100e;
            }
            z2.a(this, charSequence3);
            return;
        }
        z2.a(this, charSequence5);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.z
    public o getItemData() {
        return this.f78l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.l lVar = this.f81o;
        if (lVar != null) {
            lVar.b(this.f78l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f84r = e();
        f();
    }

    @Override // k.z0, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f87u) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f86t;
        if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(size, i7);
        } else {
            i5 = i7;
        }
        if (mode != 1073741824 && i7 > 0 && measuredWidth < i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
        }
        if (isEmpty && this.f80n != null) {
            super.setPadding((getMeasuredWidth() - this.f80n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f78l.hasSubMenu() && (bVar = this.f82p) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f85s != z2) {
            this.f85s = z2;
            o oVar = this.f78l;
            if (oVar != null) {
                m mVar = oVar.f2108n;
                mVar.f2081k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f80n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f88v;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(j.l lVar) {
        this.f81o = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f87u = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(c cVar) {
        this.f83q = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f79m = charSequence;
        f();
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }
}
