package c0;

import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Trace;
import android.util.Log;
import b1.k1;
import b2.f;
import g0.i;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1088a;

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f1089b;

    static {
        y.i("TypefaceCompat static init");
        f fVar = new f(6);
        new ConcurrentHashMap();
        f1088a = fVar;
        f1089b = new k1(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, i[] iVarArr, int i3) {
        y.i("TypefaceCompat.createFromFontInfo");
        try {
            f1088a.getClass();
            Typeface typeface = null;
            try {
                FontFamily i4 = f.i(iVarArr, context.getContentResolver());
                if (i4 != null) {
                    typeface = new Typeface.CustomFallbackBuilder(i4).setStyle(f.h(i4, i3).getStyle()).build();
                }
            } catch (Exception e3) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0.equals(r3) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [g0.m, java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, b0.e r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, b0.b r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.e.b(android.content.Context, b0.e, android.content.res.Resources, int, java.lang.String, int, int, b0.b, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i3, String str, int i4, int i5) {
        Typeface typeface;
        f1088a.getClass();
        try {
            Font build = new Font.Builder(resources, i3).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            typeface = null;
        }
        if (typeface != null) {
            f1089b.j(d(resources, i3, str, i4, i5), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
