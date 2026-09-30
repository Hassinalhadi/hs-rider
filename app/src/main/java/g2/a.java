package g2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.c;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1879a = {R.attr.theme, com.logistics.rider.lsposed.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1880b = {com.logistics.rider.lsposed.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i3, int i4) {
        return b(context, attributeSet, i3, i4, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i3, int i4, int[] iArr) {
        boolean z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1880b, i3, i4);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i5 = iArr2[0];
        if ((context instanceof c) && ((c) context).f1916a == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i5 != 0 && !z2) {
            c cVar = new c(context, i5);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr3[i6] = obtainStyledAttributes2.getResourceId(i6, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr3[i7];
                if (i8 != 0) {
                    cVar.getTheme().applyStyle(i8, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1879a);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                cVar.getTheme().applyStyle(resourceId, true);
            }
            return cVar;
        }
        return context;
    }
}
