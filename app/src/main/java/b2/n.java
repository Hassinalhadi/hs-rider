package b2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public a.y f1029a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public a.y f1030b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public a.y f1031c = new Object();
    public a.y d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f1032e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f1033f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f1034g = new a(0.0f);
    public d h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f1035i;

    /* renamed from: j, reason: collision with root package name */
    public f f1036j;

    /* renamed from: k, reason: collision with root package name */
    public f f1037k;

    /* renamed from: l, reason: collision with root package name */
    public f f1038l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, a.y] */
    public n() {
        int i3 = 0;
        this.f1035i = new f(i3);
        this.f1036j = new f(i3);
        this.f1037k = new f(i3);
        this.f1038l = new f(i3);
    }

    public static m a(Context context, int i3, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        if (i4 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i4, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(i1.a.f1992y);
        try {
            int i5 = obtainStyledAttributes.getInt(0, 0);
            int i6 = obtainStyledAttributes.getInt(3, i5);
            int i7 = obtainStyledAttributes.getInt(4, i5);
            int i8 = obtainStyledAttributes.getInt(2, i5);
            int i9 = obtainStyledAttributes.getInt(1, i5);
            d c3 = c(obtainStyledAttributes, 5, aVar);
            d c4 = c(obtainStyledAttributes, 8, c3);
            d c5 = c(obtainStyledAttributes, 9, c3);
            d c6 = c(obtainStyledAttributes, 7, c3);
            d c7 = c(obtainStyledAttributes, 6, c3);
            m mVar = new m();
            mVar.f1019a = a.y.x(i6);
            mVar.f1022e = c4;
            mVar.f1020b = a.y.x(i7);
            mVar.f1023f = c5;
            mVar.f1021c = a.y.x(i8);
            mVar.f1024g = c6;
            mVar.d = a.y.x(i9);
            mVar.h = c7;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m b(Context context, AttributeSet attributeSet, int i3, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f1985r, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i3, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        if ((this.f1030b instanceof l) && (this.f1029a instanceof l) && (this.f1031c instanceof l) && (this.d instanceof l)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z2;
        boolean z3;
        if (this.f1038l.getClass().equals(f.class) && this.f1036j.getClass().equals(f.class) && this.f1035i.getClass().equals(f.class) && this.f1037k.getClass().equals(f.class)) {
            z2 = true;
        } else {
            z2 = false;
        }
        float a3 = this.f1032e.a(rectF);
        if (this.f1033f.a(rectF) == a3 && this.h.a(rectF) == a3 && this.f1034g.a(rectF) == a3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3 || !d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.m, java.lang.Object] */
    public final m f() {
        ?? obj = new Object();
        obj.f1019a = this.f1029a;
        obj.f1020b = this.f1030b;
        obj.f1021c = this.f1031c;
        obj.d = this.d;
        obj.f1022e = this.f1032e;
        obj.f1023f = this.f1033f;
        obj.f1024g = this.f1034g;
        obj.h = this.h;
        obj.f1025i = this.f1035i;
        obj.f1026j = this.f1036j;
        obj.f1027k = this.f1037k;
        obj.f1028l = this.f1038l;
        return obj;
    }

    public final String toString() {
        return "[" + this.f1032e + ", " + this.f1033f + ", " + this.f1034g + ", " + this.h + "]";
    }
}
