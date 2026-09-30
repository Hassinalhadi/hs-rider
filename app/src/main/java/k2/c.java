package k2;

import a.y;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c extends y {
    public static void g0(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
    }

    public static void h0(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static /* synthetic */ void i0(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        h0(objArr, objArr2, 0, i3, i4);
    }

    public static Object[] j0(Object[] objArr, int i3, int i4) {
        objArr.getClass();
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }
}
