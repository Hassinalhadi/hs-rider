package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3161e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f3162f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3163a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3164b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3165c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3161e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3162f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int i3;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            Object obj = null;
            try {
                i3 = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i3 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f209r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f209r.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = i3;
            i4++;
            i5++;
        }
        if (i5 != split.length) {
            return Arrays.copyOf(iArr, i5);
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r6v189, types: [v.h, java.lang.Object] */
    public static i d(Context context, AttributeSet attributeSet, boolean z2) {
        int[] iArr;
        int i3;
        int i4;
        i iVar = new i();
        if (z2) {
            iArr = r.f3169c;
        } else {
            iArr = r.f3167a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        l lVar = iVar.f3096b;
        m mVar = iVar.f3098e;
        k kVar = iVar.f3097c;
        j jVar = iVar.d;
        int[] iArr2 = d;
        String[] strArr = r.a.f2803a;
        SparseIntArray sparseIntArray = f3161e;
        if (z2) {
            ?? obj = new Object();
            obj.f3085a = new int[10];
            obj.f3086b = new int[10];
            obj.f3087c = 0;
            obj.d = new int[10];
            obj.f3088e = new float[10];
            obj.f3089f = 0;
            obj.f3090g = new int[5];
            obj.h = new String[5];
            obj.f3091i = 0;
            obj.f3092j = new int[4];
            obj.f3093k = new boolean[4];
            obj.f3094l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i5 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i5 < indexCount; indexCount = i4) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = i5;
                switch (f3162f.get(index)) {
                    case 2:
                        i4 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i4 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i4 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        i4 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        i4 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i4 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        i4 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        i4 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        i4 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        i4 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        i4 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        i4 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.d));
                        break;
                    case 18:
                        i4 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3107e));
                        break;
                    case 19:
                        i4 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, jVar.f3108f));
                        break;
                    case 20:
                        i4 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, jVar.f3134w));
                        break;
                    case 21:
                        i4 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f3104c));
                        break;
                    case 22:
                        i4 = indexCount;
                        obj.b(22, iArr2[obtainStyledAttributes.getInt(index, lVar.f3146a)]);
                        break;
                    case 23:
                        i4 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f3102b));
                        break;
                    case 24:
                        i4 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        i4 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        i4 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        i4 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        i4 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        i4 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, jVar.f3135x));
                        break;
                    case 38:
                        i4 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f3095a);
                        iVar.f3095a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i4 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case 40:
                        i4 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 41:
                        i4 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        i4 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 43:
                        i4 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, lVar.f3148c));
                        break;
                    case 44:
                        i4 = indexCount;
                        obj.c(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, mVar.f3160m));
                        break;
                    case 45:
                        i4 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, mVar.f3151b));
                        break;
                    case 46:
                        i4 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, mVar.f3152c));
                        break;
                    case 47:
                        i4 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        break;
                    case 48:
                        i4 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, mVar.f3153e));
                        break;
                    case 49:
                        i4 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, mVar.f3154f));
                        break;
                    case 50:
                        i4 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, mVar.f3155g));
                        break;
                    case 51:
                        i4 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, mVar.f3156i));
                        break;
                    case 52:
                        i4 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, mVar.f3157j));
                        break;
                    case 53:
                        i4 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, mVar.f3158k));
                        break;
                    case 54:
                        i4 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        i4 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        i4 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        i4 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.a0));
                        break;
                    case 58:
                        i4 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3103b0));
                        break;
                    case 59:
                        i4 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3105c0));
                        break;
                    case 60:
                        i4 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, mVar.f3150a));
                        break;
                    case 62:
                        i4 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        i4 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case 64:
                        i4 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, kVar.f3139a));
                        break;
                    case 65:
                        i4 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            obj.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i4 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i4 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, kVar.f3142e));
                        break;
                    case 68:
                        i4 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        break;
                    case 69:
                        i4 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i4 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i4 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, jVar.f3109f0));
                        break;
                    case 73:
                        i4 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3111g0));
                        break;
                    case 74:
                        i4 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i4 = indexCount;
                        obj.c(75, obtainStyledAttributes.getBoolean(index, jVar.f3124n0));
                        break;
                    case 76:
                        i4 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, kVar.f3141c));
                        break;
                    case 77:
                        i4 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i4 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, lVar.f3147b));
                        break;
                    case 79:
                        i4 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        break;
                    case 80:
                        i4 = indexCount;
                        obj.c(80, obtainStyledAttributes.getBoolean(index, jVar.f3120l0));
                        break;
                    case 81:
                        i4 = indexCount;
                        obj.c(81, obtainStyledAttributes.getBoolean(index, jVar.f3122m0));
                        break;
                    case 82:
                        i4 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, kVar.f3140b));
                        break;
                    case 83:
                        i4 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, mVar.h));
                        break;
                    case 84:
                        i4 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, kVar.f3144g));
                        break;
                    case 85:
                        i4 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, kVar.f3143f));
                        break;
                    case 86:
                        i4 = indexCount;
                        int i7 = obtainStyledAttributes.peekValue(index).type;
                        if (i7 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.f3145i = resourceId2;
                            obj.b(89, resourceId2);
                            if (kVar.f3145i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        } else if (i7 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            obj.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.f3145i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                                break;
                            } else {
                                obj.b(88, -1);
                                break;
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, kVar.f3145i));
                            break;
                        }
                        break;
                    case 87:
                        i4 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i4 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        i4 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        i4 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i4 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i4 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, jVar.f3126o0));
                        break;
                    case 98:
                        i4 = indexCount;
                        int i8 = u.a.f3017v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.f3095a = obtainStyledAttributes.getResourceId(index, iVar.f3095a);
                            break;
                        }
                    case 99:
                        i4 = indexCount;
                        obj.c(99, obtainStyledAttributes.getBoolean(index, jVar.f3110g));
                        break;
                }
                i5 = i6 + 1;
            }
        } else {
            int i9 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i9 < indexCount2; indexCount2 = i3) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i3 = indexCount2;
                        jVar.f3127p = f(obtainStyledAttributes, index2, jVar.f3127p);
                        continue;
                    case 2:
                        i3 = indexCount2;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                    case 3:
                        i3 = indexCount2;
                        jVar.f3125o = f(obtainStyledAttributes, index2, jVar.f3125o);
                        continue;
                    case 4:
                        i3 = indexCount2;
                        jVar.f3123n = f(obtainStyledAttributes, index2, jVar.f3123n);
                        continue;
                    case 5:
                        i3 = indexCount2;
                        jVar.f3136y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i3 = indexCount2;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                    case 7:
                        i3 = indexCount2;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        continue;
                    case 8:
                        i3 = indexCount2;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                    case 9:
                        i3 = indexCount2;
                        jVar.f3133v = f(obtainStyledAttributes, index2, jVar.f3133v);
                        continue;
                    case 10:
                        i3 = indexCount2;
                        jVar.f3132u = f(obtainStyledAttributes, index2, jVar.f3132u);
                        continue;
                    case 11:
                        i3 = indexCount2;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                    case 12:
                        i3 = indexCount2;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                    case 13:
                        i3 = indexCount2;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                    case 14:
                        i3 = indexCount2;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                    case 15:
                        i3 = indexCount2;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        continue;
                    case 16:
                        i3 = indexCount2;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                    case 17:
                        i3 = indexCount2;
                        jVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.d);
                        continue;
                    case 18:
                        i3 = indexCount2;
                        jVar.f3107e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f3107e);
                        continue;
                    case 19:
                        i3 = indexCount2;
                        jVar.f3108f = obtainStyledAttributes.getFloat(index2, jVar.f3108f);
                        continue;
                    case 20:
                        i3 = indexCount2;
                        jVar.f3134w = obtainStyledAttributes.getFloat(index2, jVar.f3134w);
                        continue;
                    case 21:
                        i3 = indexCount2;
                        jVar.f3104c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f3104c);
                        continue;
                    case 22:
                        i3 = indexCount2;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f3146a);
                        lVar.f3146a = i10;
                        lVar.f3146a = iArr2[i10];
                        continue;
                    case 23:
                        i3 = indexCount2;
                        jVar.f3102b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f3102b);
                        continue;
                    case 24:
                        i3 = indexCount2;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                    case 25:
                        i3 = indexCount2;
                        jVar.h = f(obtainStyledAttributes, index2, jVar.h);
                        continue;
                    case 26:
                        i3 = indexCount2;
                        jVar.f3113i = f(obtainStyledAttributes, index2, jVar.f3113i);
                        continue;
                    case 27:
                        i3 = indexCount2;
                        jVar.E = obtainStyledAttributes.getInt(index2, jVar.E);
                        continue;
                    case 28:
                        i3 = indexCount2;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                    case 29:
                        i3 = indexCount2;
                        jVar.f3115j = f(obtainStyledAttributes, index2, jVar.f3115j);
                        continue;
                    case 30:
                        i3 = indexCount2;
                        jVar.f3117k = f(obtainStyledAttributes, index2, jVar.f3117k);
                        continue;
                    case 31:
                        i3 = indexCount2;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        continue;
                    case 32:
                        i3 = indexCount2;
                        jVar.f3130s = f(obtainStyledAttributes, index2, jVar.f3130s);
                        continue;
                    case 33:
                        i3 = indexCount2;
                        jVar.f3131t = f(obtainStyledAttributes, index2, jVar.f3131t);
                        continue;
                    case 34:
                        i3 = indexCount2;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                    case 35:
                        i3 = indexCount2;
                        jVar.f3121m = f(obtainStyledAttributes, index2, jVar.f3121m);
                        continue;
                    case 36:
                        i3 = indexCount2;
                        jVar.f3119l = f(obtainStyledAttributes, index2, jVar.f3119l);
                        continue;
                    case 37:
                        i3 = indexCount2;
                        jVar.f3135x = obtainStyledAttributes.getFloat(index2, jVar.f3135x);
                        continue;
                    case 38:
                        i3 = indexCount2;
                        iVar.f3095a = obtainStyledAttributes.getResourceId(index2, iVar.f3095a);
                        continue;
                    case 39:
                        i3 = indexCount2;
                        jVar.U = obtainStyledAttributes.getFloat(index2, jVar.U);
                        continue;
                    case 40:
                        i3 = indexCount2;
                        jVar.T = obtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                    case 41:
                        i3 = indexCount2;
                        jVar.V = obtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                    case 42:
                        i3 = indexCount2;
                        jVar.W = obtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                    case 43:
                        i3 = indexCount2;
                        lVar.f3148c = obtainStyledAttributes.getFloat(index2, lVar.f3148c);
                        continue;
                    case 44:
                        i3 = indexCount2;
                        mVar.f3159l = true;
                        mVar.f3160m = obtainStyledAttributes.getDimension(index2, mVar.f3160m);
                        continue;
                    case 45:
                        i3 = indexCount2;
                        mVar.f3151b = obtainStyledAttributes.getFloat(index2, mVar.f3151b);
                        continue;
                    case 46:
                        i3 = indexCount2;
                        mVar.f3152c = obtainStyledAttributes.getFloat(index2, mVar.f3152c);
                        continue;
                    case 47:
                        i3 = indexCount2;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        continue;
                    case 48:
                        i3 = indexCount2;
                        mVar.f3153e = obtainStyledAttributes.getFloat(index2, mVar.f3153e);
                        continue;
                    case 49:
                        i3 = indexCount2;
                        mVar.f3154f = obtainStyledAttributes.getDimension(index2, mVar.f3154f);
                        continue;
                    case 50:
                        i3 = indexCount2;
                        mVar.f3155g = obtainStyledAttributes.getDimension(index2, mVar.f3155g);
                        continue;
                    case 51:
                        i3 = indexCount2;
                        mVar.f3156i = obtainStyledAttributes.getDimension(index2, mVar.f3156i);
                        continue;
                    case 52:
                        i3 = indexCount2;
                        mVar.f3157j = obtainStyledAttributes.getDimension(index2, mVar.f3157j);
                        continue;
                    case 53:
                        i3 = indexCount2;
                        mVar.f3158k = obtainStyledAttributes.getDimension(index2, mVar.f3158k);
                        continue;
                    case 54:
                        i3 = indexCount2;
                        jVar.X = obtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                    case 55:
                        i3 = indexCount2;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        continue;
                    case 56:
                        i3 = indexCount2;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                    case 57:
                        i3 = indexCount2;
                        jVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.a0);
                        continue;
                    case 58:
                        i3 = indexCount2;
                        jVar.f3103b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3103b0);
                        continue;
                    case 59:
                        i3 = indexCount2;
                        jVar.f3105c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3105c0);
                        continue;
                    case 60:
                        i3 = indexCount2;
                        mVar.f3150a = obtainStyledAttributes.getFloat(index2, mVar.f3150a);
                        continue;
                    case 61:
                        i3 = indexCount2;
                        jVar.f3137z = f(obtainStyledAttributes, index2, jVar.f3137z);
                        continue;
                    case 62:
                        i3 = indexCount2;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        continue;
                    case 63:
                        i3 = indexCount2;
                        jVar.B = obtainStyledAttributes.getFloat(index2, jVar.B);
                        continue;
                    case 64:
                        i3 = indexCount2;
                        kVar.f3139a = f(obtainStyledAttributes, index2, kVar.f3139a);
                        continue;
                    case 65:
                        i3 = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            break;
                        }
                    case 66:
                        i3 = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                    case 67:
                        i3 = indexCount2;
                        kVar.f3142e = obtainStyledAttributes.getFloat(index2, kVar.f3142e);
                        break;
                    case 68:
                        i3 = indexCount2;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        break;
                    case 69:
                        i3 = indexCount2;
                        jVar.f3106d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i3 = indexCount2;
                        jVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i3 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i3 = indexCount2;
                        jVar.f3109f0 = obtainStyledAttributes.getInt(index2, jVar.f3109f0);
                        break;
                    case 73:
                        i3 = indexCount2;
                        jVar.f3111g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3111g0);
                        break;
                    case 74:
                        i3 = indexCount2;
                        jVar.f3116j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i3 = indexCount2;
                        jVar.f3124n0 = obtainStyledAttributes.getBoolean(index2, jVar.f3124n0);
                        break;
                    case 76:
                        i3 = indexCount2;
                        kVar.f3141c = obtainStyledAttributes.getInt(index2, kVar.f3141c);
                        break;
                    case 77:
                        i3 = indexCount2;
                        jVar.f3118k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i3 = indexCount2;
                        lVar.f3147b = obtainStyledAttributes.getInt(index2, lVar.f3147b);
                        break;
                    case 79:
                        i3 = indexCount2;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        break;
                    case 80:
                        i3 = indexCount2;
                        jVar.f3120l0 = obtainStyledAttributes.getBoolean(index2, jVar.f3120l0);
                        break;
                    case 81:
                        i3 = indexCount2;
                        jVar.f3122m0 = obtainStyledAttributes.getBoolean(index2, jVar.f3122m0);
                        break;
                    case 82:
                        i3 = indexCount2;
                        kVar.f3140b = obtainStyledAttributes.getInteger(index2, kVar.f3140b);
                        break;
                    case 83:
                        i3 = indexCount2;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        break;
                    case 84:
                        i3 = indexCount2;
                        kVar.f3144g = obtainStyledAttributes.getInteger(index2, kVar.f3144g);
                        break;
                    case 85:
                        i3 = indexCount2;
                        kVar.f3143f = obtainStyledAttributes.getFloat(index2, kVar.f3143f);
                        break;
                    case 86:
                        i3 = indexCount2;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.f3145i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f3145i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.f3145i);
                            break;
                        }
                        break;
                    case 87:
                        i3 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i3 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i3 = indexCount2;
                        jVar.f3128q = f(obtainStyledAttributes, index2, jVar.f3128q);
                        break;
                    case 92:
                        i3 = indexCount2;
                        jVar.f3129r = f(obtainStyledAttributes, index2, jVar.f3129r);
                        break;
                    case 93:
                        i3 = indexCount2;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        break;
                    case 94:
                        i3 = indexCount2;
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        break;
                    case 95:
                        i3 = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i3 = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i3 = indexCount2;
                        jVar.f3126o0 = obtainStyledAttributes.getInt(index2, jVar.f3126o0);
                        break;
                }
                i9++;
            }
            if (jVar.f3116j0 != null) {
                jVar.f3114i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i3, int i4) {
        int resourceId = typedArray.getResourceId(i3, i4);
        if (resourceId == -1) {
            return typedArray.getInt(i3, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            int i4 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                }
                i4 = i3;
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i3, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i4 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i3);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0114. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [v.a, android.view.View, v.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [s.a, s.i] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i3;
        int i4;
        String str;
        HashMap hashMap;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f3165c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f3164b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.f3096b;
                            j jVar = iVar.d;
                            m mVar = iVar.f3098e;
                            if (childAt instanceof a) {
                                jVar.f3112h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f3109f0);
                                aVar.setMargin(jVar.f3111g0);
                                aVar.setAllowsGoneWidget(jVar.f3124n0);
                                int[] iArr = jVar.f3114i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f3116j0;
                                    if (str3 != null) {
                                        int[] c3 = c(aVar, str3);
                                        jVar.f3114i0 = c3;
                                        aVar.setReferencedIds(c3);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f3099f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (!bVar.f3024a) {
                                    i4 = i5;
                                    str = "set" + str4;
                                } else {
                                    i4 = i5;
                                    str = str4;
                                }
                                try {
                                    int a3 = q.e.a(bVar.f3025b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (a3) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3026c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3029g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f3029g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f3027e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f3028f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3026c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e6) {
                                    e = e6;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e8) {
                                    e = e8;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i5 = i4;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i3 = i5;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f3147b == 0) {
                                childAt.setVisibility(lVar.f3146a);
                            }
                            childAt.setAlpha(lVar.f3148c);
                            childAt.setRotation(mVar.f3150a);
                            childAt.setRotationX(mVar.f3151b);
                            childAt.setRotationY(mVar.f3152c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f3153e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f3154f)) {
                                    childAt.setPivotX(mVar.f3154f);
                                }
                                if (!Float.isNaN(mVar.f3155g)) {
                                    childAt.setPivotY(mVar.f3155g);
                                }
                            }
                            childAt.setTranslationX(mVar.f3156i);
                            childAt.setTranslationY(mVar.f3157j);
                            childAt.setTranslationZ(mVar.f3158k);
                            if (mVar.f3159l) {
                                childAt.setElevation(mVar.f3160m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i3 = i5;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i5 = i3 + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i3 = i5;
            i5 = i3 + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.d;
                if (jVar2.f3112h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f3030f = new int[32];
                    view.f3035l = new HashMap();
                    view.h = context;
                    ?? iVar3 = new s.i();
                    iVar3.f2835s0 = 0;
                    iVar3.f2836t0 = true;
                    iVar3.f2837u0 = 0;
                    iVar3.f2838v0 = false;
                    view.f3023o = iVar3;
                    view.f3032i = iVar3;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = jVar2.f3114i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f3116j0;
                        if (str5 != null) {
                            int[] c4 = c(view, str5);
                            jVar2.f3114i0 = c4;
                            view.setReferencedIds(c4);
                        }
                    }
                    view.setType(jVar2.f3109f0);
                    view.setMargin(jVar2.f3111g0);
                    e g3 = ConstraintLayout.g();
                    view.i();
                    iVar2.a(g3);
                    constraintLayout.addView((View) view, g3);
                }
                if (jVar2.f3101a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g4 = ConstraintLayout.g();
                    iVar2.a(g4);
                    constraintLayout.addView(pVar, g4);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i3;
        HashMap hashMap;
        int i4;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f3165c;
        hashMap2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f3164b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap2.get(Integer.valueOf(id));
            if (iVar == null) {
                i3 = childCount;
                hashMap = hashMap2;
                i4 = i5;
            } else {
                l lVar = iVar.f3096b;
                j jVar = iVar.d;
                m mVar = iVar.f3098e;
                i3 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i4 = i5;
                HashMap hashMap4 = nVar.f3163a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e3) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
                    } catch (NoSuchMethodException e4) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e4);
                    } catch (InvocationTargetException e5) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e5);
                    }
                    hashMap4 = hashMap5;
                }
                iVar.f3099f = hashMap3;
                iVar.f3095a = id;
                jVar.h = eVar.f3043e;
                jVar.f3113i = eVar.f3044f;
                jVar.f3115j = eVar.f3046g;
                jVar.f3117k = eVar.h;
                jVar.f3119l = eVar.f3049i;
                jVar.f3121m = eVar.f3051j;
                jVar.f3123n = eVar.f3053k;
                jVar.f3125o = eVar.f3055l;
                jVar.f3127p = eVar.f3057m;
                jVar.f3128q = eVar.f3059n;
                jVar.f3129r = eVar.f3061o;
                jVar.f3130s = eVar.f3067s;
                jVar.f3131t = eVar.f3068t;
                jVar.f3132u = eVar.f3069u;
                jVar.f3133v = eVar.f3070v;
                jVar.f3134w = eVar.E;
                jVar.f3135x = eVar.F;
                jVar.f3136y = eVar.G;
                jVar.f3137z = eVar.f3063p;
                jVar.A = eVar.f3065q;
                jVar.B = eVar.f3066r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f3108f = eVar.f3040c;
                jVar.d = eVar.f3037a;
                jVar.f3107e = eVar.f3038b;
                jVar.f3102b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f3104c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.f3120l0 = eVar.W;
                jVar.f3122m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.a0 = eVar.Q;
                jVar.f3103b0 = eVar.N;
                jVar.f3105c0 = eVar.O;
                jVar.f3106d0 = eVar.R;
                jVar.e0 = eVar.S;
                jVar.f3118k0 = eVar.Y;
                jVar.N = eVar.f3072x;
                jVar.P = eVar.f3074z;
                jVar.M = eVar.f3071w;
                jVar.O = eVar.f3073y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f3126o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                lVar.f3146a = childAt.getVisibility();
                lVar.f3148c = childAt.getAlpha();
                mVar.f3150a = childAt.getRotation();
                mVar.f3151b = childAt.getRotationX();
                mVar.f3152c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f3153e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f3154f = pivotX;
                    mVar.f3155g = pivotY;
                }
                mVar.f3156i = childAt.getTranslationX();
                mVar.f3157j = childAt.getTranslationY();
                mVar.f3158k = childAt.getTranslationZ();
                if (mVar.f3159l) {
                    mVar.f3160m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f3124n0 = aVar.getAllowsGoneWidget();
                    jVar.f3114i0 = aVar.getReferencedIds();
                    jVar.f3109f0 = aVar.getType();
                    jVar.f3111g0 = aVar.getMargin();
                }
            }
            i5 = i4 + 1;
            nVar = this;
            childCount = i3;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i d3 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d3.d.f3101a = true;
                    }
                    this.f3165c.put(Integer.valueOf(d3.f3095a), d3);
                }
            }
        } catch (IOException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i3, e3);
        } catch (XmlPullParserException e4) {
            Log.e("ConstraintSet", "Error parsing resource: " + i3, e4);
        }
    }
}
