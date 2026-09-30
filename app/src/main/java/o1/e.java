package o1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.emoji2.text.m;
import b2.a0;
import b2.b0;
import b2.c0;
import b2.n;
import b2.y;
import b2.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.logistics.rider.lsposed.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class e extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2614f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2615g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public final d f2616i;

    /* renamed from: j, reason: collision with root package name */
    public Integer[] f2617j;

    /* renamed from: k, reason: collision with root package name */
    public y f2618k;

    /* renamed from: l, reason: collision with root package name */
    public a0 f2619l;

    /* renamed from: m, reason: collision with root package name */
    public int f2620m;

    /* renamed from: n, reason: collision with root package name */
    public c0 f2621n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2622o;

    /* JADX WARN: Type inference failed for: r0v25, types: [b2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [o1.d] */
    public e(Context context, AttributeSet attributeSet) {
        super(g2.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        y b3;
        int next;
        XmlResourceParser xml;
        int next2;
        c0 c0Var;
        this.f2614f = new ArrayList();
        this.f2615g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.h = new m(25, materialButtonToggleGroup);
        this.f2616i = new Comparator() { // from class: o1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f1181t).compareTo(Boolean.valueOf(materialButton2.f1181t));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = MaterialButtonToggleGroup.this;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.f2622o = true;
        Context context2 = getContext();
        TypedArray e3 = j.e(context2, attributeSet, i1.a.f1978k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (e3.hasValue(2)) {
            int resourceId = e3.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                try {
                    ?? obj = new Object();
                    obj.f978c = new int[10];
                    obj.d = new m[10];
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next2 = xml.next();
                        if (next2 == 2) {
                            break;
                        }
                    } while (next2 != 1);
                    if (next2 == 2) {
                        if (xml.getName().equals("selector")) {
                            obj.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c0Var = obj;
                        this.f2621n = c0Var;
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } finally {
                }
            }
            c0Var = null;
            this.f2621n = c0Var;
        }
        if (e3.hasValue(4)) {
            a0 b4 = a0.b(context2, e3, 4);
            this.f2619l = b4;
            if (b4 == null) {
                z zVar = new z(n.a(context2, e3.getResourceId(4, 0), e3.getResourceId(5, 0), new b2.a(0)).a());
                this.f2619l = zVar.f1070a != 0 ? new a0(zVar) : null;
            }
        }
        if (e3.hasValue(3)) {
            b2.a aVar = new b2.a(0.0f);
            int resourceId2 = e3.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b3 = y.b(n.c(e3, 3, aVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b3 = y.b(n.c(e3, 3, aVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        b3 = new y();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                b3.d(context2, xml2, asAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b3 = y.b(aVar);
                }
            }
            this.f2618k = b3;
        }
        this.f2620m = e3.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(e3.getBoolean(0, true));
        e3.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (c(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i3;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i4 - 1);
                if (this.f2620m <= 0) {
                    i3 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i3 = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.f2620m - i3);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.f2620m - i3;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f2622o = true;
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.h);
        this.f2614f.add(materialButton.getShapeAppearanceModel());
        this.f2615g.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i3;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.f2621n != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i4 = Integer.MAX_VALUE;
            for (int i5 = firstVisibleChildIndex; i5 <= lastVisibleChildIndex; i5++) {
                if (c(i5)) {
                    int i6 = 0;
                    if (c(i5) && this.f2621n != null) {
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i5);
                        c0 c0Var = this.f2621n;
                        int width = materialButton3.getWidth();
                        int i7 = -width;
                        for (int i8 = 0; i8 < c0Var.f976a; i8++) {
                            b0 b0Var = (b0) c0Var.d[i8].f299g;
                            int i9 = b0Var.f973a;
                            float f3 = b0Var.f974b;
                            if (i9 == 2) {
                                max = Math.max(i7, f3);
                            } else if (i9 == 1) {
                                max = Math.max(i7, width * f3);
                            }
                            i7 = (int) max;
                        }
                        int max2 = Math.max(0, i7);
                        int i10 = i5 - 1;
                        while (true) {
                            materialButton = null;
                            if (i10 >= 0) {
                                if (c(i10)) {
                                    materialButton2 = (MaterialButton) getChildAt(i10);
                                    break;
                                }
                                i10--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i11 = i5 + 1;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            if (c(i11)) {
                                materialButton = (MaterialButton) getChildAt(i11);
                                break;
                            }
                            i11++;
                        }
                        if (materialButton != null) {
                            i6 = materialButton.getAllowedWidthDecrease();
                        }
                        i6 = Math.min(max2, allowedWidthDecrease + i6);
                    }
                    if (i5 != firstVisibleChildIndex && i5 != lastVisibleChildIndex) {
                        i6 /= 2;
                    }
                    i4 = Math.min(i4, i6);
                }
            }
            for (int i12 = firstVisibleChildIndex; i12 <= lastVisibleChildIndex; i12++) {
                if (c(i12)) {
                    ((MaterialButton) getChildAt(i12)).setSizeChange(this.f2621n);
                    MaterialButton materialButton4 = (MaterialButton) getChildAt(i12);
                    if (i12 != firstVisibleChildIndex && i12 != lastVisibleChildIndex) {
                        i3 = i4 * 2;
                    } else {
                        i3 = i4;
                    }
                    materialButton4.setWidthChangeMax(i3);
                }
            }
        }
    }

    public final boolean c(int i3) {
        if (getChildAt(i3).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = materialButton.A;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.A = null;
                materialButton.f1185x = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2616i);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put((MaterialButton) getChildAt(i3), Integer.valueOf(i3));
        }
        this.f2617j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [b2.z, java.lang.Object] */
    public final void e() {
        boolean z2;
        boolean z3;
        z zVar;
        boolean z4;
        boolean z5;
        int i3;
        a0 a0Var;
        if ((this.f2618k != null || this.f2619l != null) && this.f2622o) {
            this.f2622o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i4 = 0; i4 < childCount; i4++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                if (materialButton.getVisibility() != 8) {
                    if (i4 == firstVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i4 == lastVisibleChildIndex) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a0 a0Var2 = this.f2619l;
                    if (a0Var2 == null || (!z2 && !z3)) {
                        a0Var2 = (a0) this.f2615g.get(i4);
                    }
                    if (a0Var2 == null) {
                        zVar = new z((n) this.f2614f.get(i4));
                    } else {
                        ?? obj = new Object();
                        int i5 = a0Var2.f965a;
                        obj.f1070a = i5;
                        obj.f1071b = a0Var2.f966b;
                        int[][] iArr = a0Var2.f967c;
                        int[][] iArr2 = new int[iArr.length];
                        obj.f1072c = iArr2;
                        n[] nVarArr = a0Var2.d;
                        obj.d = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i5);
                        System.arraycopy(nVarArr, 0, obj.d, 0, obj.f1070a);
                        obj.f1073e = a0Var2.f968e;
                        obj.f1074f = a0Var2.f969f;
                        obj.f1075g = a0Var2.f970g;
                        obj.h = a0Var2.h;
                        zVar = obj;
                    }
                    if (getOrientation() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        if (z2) {
                            i3 = 5;
                        } else {
                            i3 = 0;
                        }
                        if (z3) {
                            i3 |= 10;
                        }
                        if (z5) {
                            i3 = ((i3 & 10) >> 1) | ((i3 & 5) << 1);
                        }
                    } else {
                        if (z2) {
                            i3 = 3;
                        } else {
                            i3 = 0;
                        }
                        if (z3) {
                            i3 |= 12;
                        }
                    }
                    int i6 = ~i3;
                    y yVar = this.f2618k;
                    if ((i6 | 1) == i6) {
                        zVar.f1073e = yVar;
                    }
                    if ((i6 | 2) == i6) {
                        zVar.f1074f = yVar;
                    }
                    if ((i6 | 4) == i6) {
                        zVar.f1075g = yVar;
                    }
                    if ((i6 | 8) == i6) {
                        zVar.h = yVar;
                    }
                    if (zVar.f1070a == 0) {
                        a0Var = null;
                    } else {
                        a0Var = new a0(zVar);
                    }
                    if (a0Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(a0Var);
                    } else {
                        materialButton.setShapeAppearanceModel(a0Var.c());
                    }
                }
            }
        }
    }

    public c0 getButtonSizeChange() {
        return this.f2621n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        Integer[] numArr = this.f2617j;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i4;
    }

    public b2.d getInnerCornerSize() {
        return this.f2618k.f1068b;
    }

    public y getInnerCornerSizeStateList() {
        return this.f2618k;
    }

    public n getShapeAppearance() {
        a0 a0Var = this.f2619l;
        if (a0Var == null) {
            return null;
        }
        return a0Var.c();
    }

    public int getSpacing() {
        return this.f2620m;
    }

    public a0 getStateListShapeAppearance() {
        return this.f2619l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (z2) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        e();
        a();
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2614f.remove(indexOfChild);
            this.f2615g.remove(indexOfChild);
        }
        this.f2622o = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(c0 c0Var) {
        if (this.f2621n != c0Var) {
            this.f2621n = c0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(b2.d dVar) {
        this.f2618k = y.b(dVar);
        this.f2622o = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(y yVar) {
        this.f2618k = yVar;
        this.f2622o = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i3) {
        if (getOrientation() != i3) {
            this.f2622o = true;
        }
        super.setOrientation(i3);
    }

    public void setShapeAppearance(n nVar) {
        a0 a0Var;
        z zVar = new z(nVar);
        if (zVar.f1070a == 0) {
            a0Var = null;
        } else {
            a0Var = new a0(zVar);
        }
        this.f2619l = a0Var;
        this.f2622o = true;
        e();
        invalidate();
    }

    public void setSpacing(int i3) {
        this.f2620m = i3;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(a0 a0Var) {
        this.f2619l = a0Var;
        this.f2622o = true;
        e();
        invalidate();
    }
}
