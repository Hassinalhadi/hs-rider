package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import j0.j0;
import k.y;
import o0.b;
import w1.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class CheckableImageButton extends y implements Checkable {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f1293l = {R.attr.state_checked};

    /* renamed from: i, reason: collision with root package name */
    public boolean f1294i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1295j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1296k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.lsposed.R.attr.imageButtonStyle);
        this.f1295j = true;
        this.f1296k = true;
        j0.h(this, new j(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1294i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        if (this.f1294i) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i3 + 1), f1293l);
        }
        return super.onCreateDrawableState(i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f2612f);
        setChecked(aVar.h);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, o0.b, w1.a] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.h = this.f1294i;
        return bVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1295j != z2) {
            this.f1295j = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f1295j && this.f1294i != z2) {
            this.f1294i = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.f1296k = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1296k) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1294i);
    }
}
