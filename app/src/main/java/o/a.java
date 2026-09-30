package o;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2609a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f2610b = new Object[0];

    public static final int a(int i3, int i4, int[] iArr) {
        iArr.getClass();
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else if (i8 > i4) {
                i5 = i7 - 1;
            } else {
                return i7;
            }
        }
        return ~i6;
    }

    public static final int b(long[] jArr, int i3, long j3) {
        jArr.getClass();
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = jArr[i6];
            if (j4 < j3) {
                i5 = i6 + 1;
            } else if (j4 > j3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }
}
