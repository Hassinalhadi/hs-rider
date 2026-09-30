package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f3138j;

    /* renamed from: a, reason: collision with root package name */
    public int f3139a;

    /* renamed from: b, reason: collision with root package name */
    public int f3140b;

    /* renamed from: c, reason: collision with root package name */
    public int f3141c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3142e;

    /* renamed from: f, reason: collision with root package name */
    public float f3143f;

    /* renamed from: g, reason: collision with root package name */
    public int f3144g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f3145i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3138j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3171f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f3138j.get(index)) {
                case 1:
                    this.f3142e = obtainStyledAttributes.getFloat(index, this.f3142e);
                    break;
                case 2:
                    this.f3141c = obtainStyledAttributes.getInt(index, this.f3141c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = r.a.f2803a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3139a = n.f(obtainStyledAttributes, index, this.f3139a);
                    break;
                case 6:
                    this.f3140b = obtainStyledAttributes.getInteger(index, this.f3140b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f3144g = obtainStyledAttributes.getInteger(index, this.f3144g);
                    break;
                case 9:
                    this.f3143f = obtainStyledAttributes.getFloat(index, this.f3143f);
                    break;
                case 10:
                    int i4 = obtainStyledAttributes.peekValue(index).type;
                    if (i4 == 1) {
                        this.f3145i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i4 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.f3145i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f3145i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
