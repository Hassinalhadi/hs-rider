package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final int f76f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1546t);
        this.f77g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f76f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
