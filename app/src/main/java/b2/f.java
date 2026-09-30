package b2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.m0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class f implements n0, j0.r, j.x, z0.e {

    /* renamed from: g, reason: collision with root package name */
    public static f f979g;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f980f;

    public f(View view) {
        this.f980f = 12;
        new f(view, 11);
    }

    public static f f(Context context, int i3) {
        boolean z2;
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.y.l(z2, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, i1.a.f1981n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        k2.h.l(context, obtainStyledAttributes, 4);
        k2.h.l(context, obtainStyledAttributes, 9);
        k2.h.l(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        n.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        f fVar = new f(7);
        a.y.m(rect.left);
        a.y.m(rect.top);
        a.y.m(rect.right);
        a.y.m(rect.bottom);
        return fVar;
    }

    public static Typeface g(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i4 = i((g0.i[]) list.get(0), contentResolver);
            if (i4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily i6 = i((g0.i[]) list.get(i5), contentResolver);
                if (i6 != null) {
                    customFallbackBuilder.addCustomFallback(i6);
                }
            }
            return customFallbackBuilder.setStyle(h(i4, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    public static Font h(FontFamily fontFamily, int i3) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 700;
        } else {
            i4 = 400;
        }
        if ((i3 & 2) != 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        FontStyle fontStyle = new FontStyle(i4, i5);
        Font font = fontFamily.getFont(0);
        int j3 = j(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int j4 = j(fontStyle, font2.getStyle());
            if (j4 < j3) {
                font = font2;
                j3 = j4;
            }
        }
        return font;
    }

    public static FontFamily i(g0.i[] iVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (g0.i iVar : iVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f1801a, "r", null);
            } catch (IOException e3) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f1803c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f1802b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        int i3;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        return abs + i3;
    }

    public static Path k(float f3, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f3, f4);
        path.lineTo(f5, f6);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(s0.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.f.l(s0.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // j.x
    public boolean b(j.m mVar) {
        return false;
    }

    @Override // z0.e
    public void c() {
        switch (this.f980f) {
            case 23:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // androidx.lifecycle.n0
    public l0 d(Class cls) {
        switch (this.f980f) {
            case 4:
                return new m0(true);
            default:
                return new x0.a();
        }
    }

    @Override // z0.e
    public void e(int i3, Object obj) {
        String str;
        switch (this.f980f) {
            case 23:
                return;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f980f) {
            case 22:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(View view, int i3) {
        this.f980f = i3;
    }

    public /* synthetic */ f(int i3) {
        this.f980f = i3;
    }

    private final void m() {
    }

    private final void n(int i3, Object obj) {
    }

    @Override // j.x
    public void a(j.m mVar, boolean z2) {
    }

    @Override // j0.r
    public void onScrollLimit(int i3, int i4, int i5, boolean z2) {
    }

    @Override // j0.r
    public void onScrollProgress(int i3, int i4, int i5, int i6) {
    }
}
