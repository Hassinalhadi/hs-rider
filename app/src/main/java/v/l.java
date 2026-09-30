package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3146a;

    /* renamed from: b, reason: collision with root package name */
    public int f3147b;

    /* renamed from: c, reason: collision with root package name */
    public float f3148c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3172g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.f3148c = obtainStyledAttributes.getFloat(index, this.f3148c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f3146a);
                this.f3146a = i4;
                this.f3146a = n.d[i4];
            } else if (index == 4) {
                this.f3147b = obtainStyledAttributes.getInt(index, this.f3147b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
