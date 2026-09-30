package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import k1.b;
import org.xmlpull.v1.XmlPullParserException;
import s.d;
import s.e;
import s.h;
import v.c;
import v.f;
import v.g;
import v.n;
import v.o;
import v.r;
import v.s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static s f197u;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f198f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f199g;
    public final e h;

    /* renamed from: i, reason: collision with root package name */
    public int f200i;

    /* renamed from: j, reason: collision with root package name */
    public int f201j;

    /* renamed from: k, reason: collision with root package name */
    public int f202k;

    /* renamed from: l, reason: collision with root package name */
    public int f203l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f204m;

    /* renamed from: n, reason: collision with root package name */
    public int f205n;

    /* renamed from: o, reason: collision with root package name */
    public n f206o;

    /* renamed from: p, reason: collision with root package name */
    public p f207p;

    /* renamed from: q, reason: collision with root package name */
    public int f208q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f209r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f210s;

    /* renamed from: t, reason: collision with root package name */
    public final f f211t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198f = new SparseArray();
        this.f199g = new ArrayList(4);
        this.h = new e();
        this.f200i = 0;
        this.f201j = 0;
        this.f202k = Integer.MAX_VALUE;
        this.f203l = Integer.MAX_VALUE;
        this.f204m = true;
        this.f205n = 257;
        this.f206o = null;
        this.f207p = null;
        this.f208q = -1;
        this.f209r = new HashMap();
        this.f210s = new SparseArray();
        this.f211t = new f(this, this);
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, v.e] */
    public static v.e g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3037a = -1;
        marginLayoutParams.f3038b = -1;
        marginLayoutParams.f3040c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3043e = -1;
        marginLayoutParams.f3044f = -1;
        marginLayoutParams.f3046g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f3049i = -1;
        marginLayoutParams.f3051j = -1;
        marginLayoutParams.f3053k = -1;
        marginLayoutParams.f3055l = -1;
        marginLayoutParams.f3057m = -1;
        marginLayoutParams.f3059n = -1;
        marginLayoutParams.f3061o = -1;
        marginLayoutParams.f3063p = -1;
        marginLayoutParams.f3065q = 0;
        marginLayoutParams.f3066r = 0.0f;
        marginLayoutParams.f3067s = -1;
        marginLayoutParams.f3068t = -1;
        marginLayoutParams.f3069u = -1;
        marginLayoutParams.f3070v = -1;
        marginLayoutParams.f3071w = Integer.MIN_VALUE;
        marginLayoutParams.f3072x = Integer.MIN_VALUE;
        marginLayoutParams.f3073y = Integer.MIN_VALUE;
        marginLayoutParams.f3074z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.f3039b0 = true;
        marginLayoutParams.f3041c0 = false;
        marginLayoutParams.f3042d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f3045f0 = -1;
        marginLayoutParams.f3047g0 = -1;
        marginLayoutParams.f3048h0 = -1;
        marginLayoutParams.f3050i0 = -1;
        marginLayoutParams.f3052j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3054k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3056l0 = 0.5f;
        marginLayoutParams.f3064p0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, v.s] */
    public static s getSharedValues() {
        if (f197u == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f197u = obj;
        }
        return f197u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f199g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((c) arrayList.get(i3)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f204m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, v.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3037a = -1;
        marginLayoutParams.f3038b = -1;
        marginLayoutParams.f3040c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3043e = -1;
        marginLayoutParams.f3044f = -1;
        marginLayoutParams.f3046g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f3049i = -1;
        marginLayoutParams.f3051j = -1;
        marginLayoutParams.f3053k = -1;
        marginLayoutParams.f3055l = -1;
        marginLayoutParams.f3057m = -1;
        marginLayoutParams.f3059n = -1;
        marginLayoutParams.f3061o = -1;
        marginLayoutParams.f3063p = -1;
        marginLayoutParams.f3065q = 0;
        marginLayoutParams.f3066r = 0.0f;
        marginLayoutParams.f3067s = -1;
        marginLayoutParams.f3068t = -1;
        marginLayoutParams.f3069u = -1;
        marginLayoutParams.f3070v = -1;
        marginLayoutParams.f3071w = Integer.MIN_VALUE;
        marginLayoutParams.f3072x = Integer.MIN_VALUE;
        marginLayoutParams.f3073y = Integer.MIN_VALUE;
        marginLayoutParams.f3074z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.f3039b0 = true;
        marginLayoutParams.f3041c0 = false;
        marginLayoutParams.f3042d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f3045f0 = -1;
        marginLayoutParams.f3047g0 = -1;
        marginLayoutParams.f3048h0 = -1;
        marginLayoutParams.f3050i0 = -1;
        marginLayoutParams.f3052j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3054k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3056l0 = 0.5f;
        marginLayoutParams.f3064p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3168b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = v.d.f3036a.get(index);
            switch (i4) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3063p);
                    marginLayoutParams.f3063p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f3063p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f3065q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3065q);
                    break;
                case 4:
                    float f3 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3066r) % 360.0f;
                    marginLayoutParams.f3066r = f3;
                    if (f3 < 0.0f) {
                        marginLayoutParams.f3066r = (360.0f - f3) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f3037a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3037a);
                    break;
                case 6:
                    marginLayoutParams.f3038b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3038b);
                    break;
                case 7:
                    marginLayoutParams.f3040c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3040c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3043e);
                    marginLayoutParams.f3043e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f3043e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3044f);
                    marginLayoutParams.f3044f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f3044f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3046g);
                    marginLayoutParams.f3046g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f3046g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3049i);
                    marginLayoutParams.f3049i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f3049i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3051j);
                    marginLayoutParams.f3051j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f3051j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3053k);
                    marginLayoutParams.f3053k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f3053k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3055l);
                    marginLayoutParams.f3055l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f3055l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3057m);
                    marginLayoutParams.f3057m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f3057m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3067s);
                    marginLayoutParams.f3067s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f3067s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3068t);
                    marginLayoutParams.f3068t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f3068t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3069u);
                    marginLayoutParams.f3069u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f3069u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3070v);
                    marginLayoutParams.f3070v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f3070v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f3071w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3071w);
                    break;
                case 22:
                    marginLayoutParams.f3072x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3072x);
                    break;
                case 23:
                    marginLayoutParams.f3073y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3073y);
                    break;
                case 24:
                    marginLayoutParams.f3074z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3074z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            n.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            break;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3059n);
                            marginLayoutParams.f3059n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f3059n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3061o);
                            marginLayoutParams.f3061o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f3061o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            break;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f203l;
    }

    public int getMaxWidth() {
        return this.f202k;
    }

    public int getMinHeight() {
        return this.f201j;
    }

    public int getMinWidth() {
        return this.f200i;
    }

    public int getOptimizationLevel() {
        return this.h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.h;
        if (eVar.f2875j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f2875j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f2875j = "parent";
            }
        }
        if (eVar.f2872h0 == null) {
            eVar.f2872h0 = eVar.f2875j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f2872h0);
        }
        ArrayList arrayList = eVar.f2899q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            View view = dVar.f2869f0;
            if (view != null) {
                if (dVar.f2875j == null && (id = view.getId()) != -1) {
                    dVar.f2875j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f2872h0 == null) {
                    dVar.f2872h0 = dVar.f2875j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f2872h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof v.e) {
                return ((v.e) view.getLayoutParams()).f3064p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof v.e) {
                return ((v.e) view.getLayoutParams()).f3064p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i3) {
        e eVar = this.h;
        eVar.f2869f0 = this;
        f fVar = this.f211t;
        eVar.f2903u0 = fVar;
        eVar.f2901s0.f2976f = fVar;
        this.f198f.put(getId(), this);
        this.f206o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3168b, i3, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f200i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f200i);
                } else if (index == 17) {
                    this.f201j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f201j);
                } else if (index == 14) {
                    this.f202k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f202k);
                } else if (index == 15) {
                    this.f203l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f203l);
                } else if (index == 113) {
                    this.f205n = obtainStyledAttributes.getInt(index, this.f205n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f207p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f206o = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f206o = null;
                    }
                    this.f208q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f205n;
        q.c.f2719q = eVar.W(512);
    }

    public final void j(int i3) {
        String str;
        Context context = getContext();
        p pVar = new p(19, false);
        pVar.f301g = new SparseArray();
        pVar.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                pVar.D(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                b bVar2 = new b(context, xml);
                                ((SparseArray) pVar.f301g).put(bVar2.f2480a, bVar2);
                                bVar = bVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    ((ArrayList) bVar.f2482c).add(gVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                    name.equals(str);
                }
            }
        } catch (IOException e3) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i3, e3);
        } catch (XmlPullParserException e4) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i3, e4);
        }
        this.f207p = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(s.e r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(s.e, int, int, int):void");
    }

    public final void l(d dVar, v.e eVar, SparseArray sparseArray, int i3, int i4) {
        View view = (View) this.f198f.get(i3);
        d dVar2 = (d) sparseArray.get(i3);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof v.e)) {
            eVar.f3041c0 = true;
            if (i4 == 6) {
                v.e eVar2 = (v.e) view.getLayoutParams();
                eVar2.f3041c0 = true;
                eVar2.f3064p0.E = true;
            }
            dVar.i(6).b(dVar2.i(i4), eVar.D, eVar.C, true);
            dVar.E = true;
            dVar.i(3).j();
            dVar.i(5).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            v.e eVar = (v.e) childAt.getLayoutParams();
            d dVar = eVar.f3064p0;
            if (childAt.getVisibility() != 8 || eVar.f3042d0 || eVar.e0 || isInEditMode) {
                int r3 = dVar.r();
                int s3 = dVar.s();
                childAt.layout(r3, s3, dVar.q() + r3, dVar.k() + s3);
            }
        }
        ArrayList arrayList = this.f199g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((c) arrayList.get(i8)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x034c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h = h(view);
        if ((view instanceof v.p) && !(h instanceof h)) {
            v.e eVar = (v.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f3064p0 = hVar;
            eVar.f3042d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((v.e) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.f199g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f198f.put(view.getId(), view);
        this.f204m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f198f.remove(view.getId());
        d h = h(view);
        this.h.f2899q0.remove(h);
        h.C();
        this.f199g.remove(view);
        this.f204m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f204m = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f206o = nVar;
    }

    @Override // android.view.View
    public void setId(int i3) {
        int id = getId();
        SparseArray sparseArray = this.f198f;
        sparseArray.remove(id);
        super.setId(i3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.f203l) {
            return;
        }
        this.f203l = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.f202k) {
            return;
        }
        this.f202k = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.f201j) {
            return;
        }
        this.f201j = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f200i) {
            return;
        }
        this.f200i = i3;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        p pVar = this.f207p;
        if (pVar != null) {
            pVar.getClass();
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f205n = i3;
        e eVar = this.h;
        eVar.D0 = i3;
        q.c.f2719q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f198f = new SparseArray();
        this.f199g = new ArrayList(4);
        this.h = new e();
        this.f200i = 0;
        this.f201j = 0;
        this.f202k = Integer.MAX_VALUE;
        this.f203l = Integer.MAX_VALUE;
        this.f204m = true;
        this.f205n = 257;
        this.f206o = null;
        this.f207p = null;
        this.f208q = -1;
        this.f209r = new HashMap();
        this.f210s = new SparseArray();
        this.f211t = new f(this, this);
        i(attributeSet, i3);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, v.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f3037a = -1;
        marginLayoutParams.f3038b = -1;
        marginLayoutParams.f3040c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3043e = -1;
        marginLayoutParams.f3044f = -1;
        marginLayoutParams.f3046g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f3049i = -1;
        marginLayoutParams.f3051j = -1;
        marginLayoutParams.f3053k = -1;
        marginLayoutParams.f3055l = -1;
        marginLayoutParams.f3057m = -1;
        marginLayoutParams.f3059n = -1;
        marginLayoutParams.f3061o = -1;
        marginLayoutParams.f3063p = -1;
        marginLayoutParams.f3065q = 0;
        marginLayoutParams.f3066r = 0.0f;
        marginLayoutParams.f3067s = -1;
        marginLayoutParams.f3068t = -1;
        marginLayoutParams.f3069u = -1;
        marginLayoutParams.f3070v = -1;
        marginLayoutParams.f3071w = Integer.MIN_VALUE;
        marginLayoutParams.f3072x = Integer.MIN_VALUE;
        marginLayoutParams.f3073y = Integer.MIN_VALUE;
        marginLayoutParams.f3074z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.f3039b0 = true;
        marginLayoutParams.f3041c0 = false;
        marginLayoutParams.f3042d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f3045f0 = -1;
        marginLayoutParams.f3047g0 = -1;
        marginLayoutParams.f3048h0 = -1;
        marginLayoutParams.f3050i0 = -1;
        marginLayoutParams.f3052j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3054k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3056l0 = 0.5f;
        marginLayoutParams.f3064p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (!(layoutParams instanceof v.e)) {
            return marginLayoutParams;
        }
        v.e eVar = (v.e) layoutParams;
        marginLayoutParams.f3037a = eVar.f3037a;
        marginLayoutParams.f3038b = eVar.f3038b;
        marginLayoutParams.f3040c = eVar.f3040c;
        marginLayoutParams.d = eVar.d;
        marginLayoutParams.f3043e = eVar.f3043e;
        marginLayoutParams.f3044f = eVar.f3044f;
        marginLayoutParams.f3046g = eVar.f3046g;
        marginLayoutParams.h = eVar.h;
        marginLayoutParams.f3049i = eVar.f3049i;
        marginLayoutParams.f3051j = eVar.f3051j;
        marginLayoutParams.f3053k = eVar.f3053k;
        marginLayoutParams.f3055l = eVar.f3055l;
        marginLayoutParams.f3057m = eVar.f3057m;
        marginLayoutParams.f3059n = eVar.f3059n;
        marginLayoutParams.f3061o = eVar.f3061o;
        marginLayoutParams.f3063p = eVar.f3063p;
        marginLayoutParams.f3065q = eVar.f3065q;
        marginLayoutParams.f3066r = eVar.f3066r;
        marginLayoutParams.f3067s = eVar.f3067s;
        marginLayoutParams.f3068t = eVar.f3068t;
        marginLayoutParams.f3069u = eVar.f3069u;
        marginLayoutParams.f3070v = eVar.f3070v;
        marginLayoutParams.f3071w = eVar.f3071w;
        marginLayoutParams.f3072x = eVar.f3072x;
        marginLayoutParams.f3073y = eVar.f3073y;
        marginLayoutParams.f3074z = eVar.f3074z;
        marginLayoutParams.A = eVar.A;
        marginLayoutParams.B = eVar.B;
        marginLayoutParams.C = eVar.C;
        marginLayoutParams.D = eVar.D;
        marginLayoutParams.E = eVar.E;
        marginLayoutParams.F = eVar.F;
        marginLayoutParams.G = eVar.G;
        marginLayoutParams.H = eVar.H;
        marginLayoutParams.I = eVar.I;
        marginLayoutParams.J = eVar.J;
        marginLayoutParams.K = eVar.K;
        marginLayoutParams.W = eVar.W;
        marginLayoutParams.X = eVar.X;
        marginLayoutParams.L = eVar.L;
        marginLayoutParams.M = eVar.M;
        marginLayoutParams.N = eVar.N;
        marginLayoutParams.P = eVar.P;
        marginLayoutParams.O = eVar.O;
        marginLayoutParams.Q = eVar.Q;
        marginLayoutParams.R = eVar.R;
        marginLayoutParams.S = eVar.S;
        marginLayoutParams.T = eVar.T;
        marginLayoutParams.U = eVar.U;
        marginLayoutParams.V = eVar.V;
        marginLayoutParams.a0 = eVar.a0;
        marginLayoutParams.f3039b0 = eVar.f3039b0;
        marginLayoutParams.f3041c0 = eVar.f3041c0;
        marginLayoutParams.f3042d0 = eVar.f3042d0;
        marginLayoutParams.f3045f0 = eVar.f3045f0;
        marginLayoutParams.f3047g0 = eVar.f3047g0;
        marginLayoutParams.f3048h0 = eVar.f3048h0;
        marginLayoutParams.f3050i0 = eVar.f3050i0;
        marginLayoutParams.f3052j0 = eVar.f3052j0;
        marginLayoutParams.f3054k0 = eVar.f3054k0;
        marginLayoutParams.f3056l0 = eVar.f3056l0;
        marginLayoutParams.Y = eVar.Y;
        marginLayoutParams.Z = eVar.Z;
        marginLayoutParams.f3064p0 = eVar.f3064p0;
        return marginLayoutParams;
    }
}
