package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3149n;

    /* renamed from: a, reason: collision with root package name */
    public float f3150a;

    /* renamed from: b, reason: collision with root package name */
    public float f3151b;

    /* renamed from: c, reason: collision with root package name */
    public float f3152c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3153e;

    /* renamed from: f, reason: collision with root package name */
    public float f3154f;

    /* renamed from: g, reason: collision with root package name */
    public float f3155g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public float f3156i;

    /* renamed from: j, reason: collision with root package name */
    public float f3157j;

    /* renamed from: k, reason: collision with root package name */
    public float f3158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3159l;

    /* renamed from: m, reason: collision with root package name */
    public float f3160m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3149n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3173i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f3149n.get(index)) {
                case 1:
                    this.f3150a = obtainStyledAttributes.getFloat(index, this.f3150a);
                    break;
                case 2:
                    this.f3151b = obtainStyledAttributes.getFloat(index, this.f3151b);
                    break;
                case 3:
                    this.f3152c = obtainStyledAttributes.getFloat(index, this.f3152c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3153e = obtainStyledAttributes.getFloat(index, this.f3153e);
                    break;
                case 6:
                    this.f3154f = obtainStyledAttributes.getDimension(index, this.f3154f);
                    break;
                case 7:
                    this.f3155g = obtainStyledAttributes.getDimension(index, this.f3155g);
                    break;
                case 8:
                    this.f3156i = obtainStyledAttributes.getDimension(index, this.f3156i);
                    break;
                case 9:
                    this.f3157j = obtainStyledAttributes.getDimension(index, this.f3157j);
                    break;
                case 10:
                    this.f3158k = obtainStyledAttributes.getDimension(index, this.f3158k);
                    break;
                case 11:
                    this.f3159l = true;
                    this.f3160m = obtainStyledAttributes.getDimension(index, this.f3160m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
