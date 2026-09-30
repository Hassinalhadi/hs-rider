package f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.logistics.rider.lsposed.R;
import k.z0;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends z0 {
    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length && i3 < 0; i4++) {
            int i5 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i5, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i3 = dimensionPixelSize;
            } else {
                i3 = typedArray.getDimensionPixelSize(i5, -1);
            }
        }
        return i3;
    }

    @Override // k.z0, android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        if (h.Q(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i3, i1.a.f1987t);
            int e3 = e(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (e3 >= 0) {
                setLineHeight(e3);
            }
        }
    }
}
