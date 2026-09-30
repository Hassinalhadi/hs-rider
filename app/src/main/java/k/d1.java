package k;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2244a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f2245b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f2246c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2247e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f2248f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f2249g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public d1(TextView textView) {
        this.f2249g = textView;
        this.h = textView.getContext();
        new b1();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f2249g instanceof w);
    }
}
