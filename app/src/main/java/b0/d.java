package b0;

import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.emoji2.text.s;
import j0.g0;
import j0.j0;
import java.util.WeakHashMap;
import k.h1;
import k.o2;
import k.u;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f677a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f678b;

    /* renamed from: c, reason: collision with root package name */
    public Object f679c;

    public d(Shader shader, ColorStateList colorStateList, int i3) {
        this.f678b = shader;
        this.f679c = colorStateList;
        this.f677a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new androidx.emoji2.text.p(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f301g;
        r17 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new b0.d(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f301g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f301g;
        r21 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new androidx.emoji2.text.p(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new androidx.emoji2.text.p(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b0.d b(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.b(android.content.res.Resources, int, android.content.res.Resources$Theme):b0.d");
    }

    public void a() {
        o2 o2Var;
        ImageView imageView = (ImageView) this.f678b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            h1.a(drawable);
        }
        if (drawable != null && (o2Var = (o2) this.f679c) != null) {
            u.e(drawable, o2Var, imageView.getDrawableState());
        }
    }

    public boolean c() {
        ColorStateList colorStateList;
        if (((Shader) this.f678b) == null && (colorStateList = (ColorStateList) this.f679c) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void d(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f678b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f1533f;
        s r3 = s.r(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) r3.f310c;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) r3.f310c;
        WeakHashMap weakHashMap = j0.f2160a;
        g0.b(imageView, context2, iArr, attributeSet, typedArray2, i3, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = y.B(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(r3.h(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(h1.b(typedArray.getInt(3, -1), null));
            }
            r3.t();
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    public d(ImageView imageView) {
        this.f677a = 0;
        this.f678b = imageView;
    }
}
