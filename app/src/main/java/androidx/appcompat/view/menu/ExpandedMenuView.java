package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.emoji2.text.s;
import j.a0;
import j.l;
import j.m;
import j.o;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f89g = {R.attr.background, R.attr.divider};

    /* renamed from: f, reason: collision with root package name */
    public m f90f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        s r3 = s.r(context, attributeSet, f89g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r3.f310c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r3.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r3.i(1));
        }
        r3.t();
    }

    @Override // j.a0
    public final void a(m mVar) {
        this.f90f = mVar;
    }

    @Override // j.l
    public final boolean b(o oVar) {
        return this.f90f.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        b((o) getAdapter().getItem(i3));
    }
}
