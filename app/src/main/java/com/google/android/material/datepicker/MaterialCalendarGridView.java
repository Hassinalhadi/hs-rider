package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import j0.j0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1215f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z.c(null);
        if (p.I(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.logistics.rider.lsposed.R.id.cancel_button);
            setNextFocusRightId(com.logistics.rider.lsposed.R.id.confirm_button);
        }
        this.f1215f = p.I(getContext(), com.logistics.rider.lsposed.R.attr.nestedScrollable);
        j0.h(this, new g(2));
    }

    public final s a() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((s) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s sVar = (s) super.getAdapter();
        sVar.getClass();
        int max = Math.max(sVar.a(), getFirstVisiblePosition());
        int min = Math.min(sVar.c(), getLastVisiblePosition());
        sVar.getItem(max);
        sVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        if (z2) {
            if (i3 == 33) {
                setSelection(((s) super.getAdapter()).c());
                return;
            } else if (i3 == 130) {
                setSelection(((s) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i3, rect);
                return;
            }
        }
        super.onFocusChanged(false, i3, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((s) super.getAdapter()).a() && selectedItemPosition <= ((s) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i3) {
            return false;
        }
        setSelection(((s) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f1215f) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof s) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), s.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i3) {
        if (i3 < ((s) super.getAdapter()).a()) {
            super.setSelection(((s) super.getAdapter()).a());
        } else {
            super.setSelection(i3);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (s) super.getAdapter();
    }
}
