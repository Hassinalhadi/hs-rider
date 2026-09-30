package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3024a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3025b;

    /* renamed from: c, reason: collision with root package name */
    public int f3026c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public String f3027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3028f;

    /* renamed from: g, reason: collision with root package name */
    public int f3029g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f3025b = bVar.f3025b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, v.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i3 = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i3 = 6;
            } else {
                int i6 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i6 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i6 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i3 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i5 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i3 = i5;
                            }
                        }
                        i3 = 7;
                    }
                }
                i3 = i6;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f3025b = i3;
            obj2.f3024a = z2;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (q.e.a(this.f3025b)) {
            case 0:
            case 7:
                this.f3026c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3029g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3027e = (String) obj;
                return;
            case 5:
                this.f3028f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
