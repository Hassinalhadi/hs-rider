package b2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f1067a;

    /* renamed from: b, reason: collision with root package name */
    public d f1068b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f1069c = new int[10];
    public d[] d = new d[10];

    public static y b(d dVar) {
        y yVar = new y();
        yVar.a(StateSet.WILD_CARD, dVar);
        return yVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i3 = this.f1067a;
        if (i3 == 0 || iArr.length == 0) {
            this.f1068b = dVar;
        }
        int[][] iArr2 = this.f1069c;
        if (i3 >= iArr2.length) {
            int i4 = i3 + 10;
            int[][] iArr3 = new int[i4];
            System.arraycopy(iArr2, 0, iArr3, 0, i3);
            this.f1069c = iArr3;
            d[] dVarArr = new d[i4];
            System.arraycopy(this.d, 0, dVarArr, 0, i3);
            this.d = dVarArr;
        }
        int[][] iArr4 = this.f1069c;
        int i5 = this.f1067a;
        iArr4[i5] = iArr;
        this.d[i5] = dVar;
        this.f1067a = i5 + 1;
    }

    public final d c(int[] iArr) {
        int i3;
        int[][] iArr2 = this.f1069c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = -1;
            if (i5 < this.f1067a) {
                if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f1069c;
            while (true) {
                if (i4 >= this.f1067a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i4], iArr3)) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            i5 = i3;
        }
        if (i5 < 0) {
            return this.f1068b;
        }
        return this.d[i5];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = i1.a.f1992y;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        d c3 = n.c(obtainStyledAttributes, 5, new a(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i3 = 0;
                        for (int i4 = 0; i4 < attributeCount; i4++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i5 = i3 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i3] = attributeNameResource;
                                i3 = i5;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i3), c3);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
