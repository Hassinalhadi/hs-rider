package g1;

import a.y;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f1871o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g, reason: collision with root package name */
    public n f1872g;
    public PorterDuffColorFilter h;

    /* renamed from: i, reason: collision with root package name */
    public ColorFilter f1873i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1874j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1875k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f1876l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f1877m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1878n;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, g1.n] */
    public p() {
        this.f1875k = true;
        this.f1876l = new float[9];
        this.f1877m = new Matrix();
        this.f1878n = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f1862c = null;
        constantState.d = f1871o;
        constantState.f1861b = new m();
        this.f1872g = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1878n;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f1873i;
            if (colorFilter == null) {
                colorFilter = this.h;
            }
            Matrix matrix = this.f1877m;
            canvas.getMatrix(matrix);
            float[] fArr = this.f1876l;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f1872g;
                Bitmap bitmap = nVar.f1864f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f1864f.getHeight()) {
                    nVar.f1864f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f1868k = true;
                }
                boolean z2 = this.f1875k;
                n nVar2 = this.f1872g;
                if (!z2) {
                    nVar2.f1864f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f1864f);
                    m mVar = nVar2.f1861b;
                    mVar.a(mVar.f1852g, m.f1846p, canvas2, min, min2);
                } else if (nVar2.f1868k || nVar2.f1865g != nVar2.f1862c || nVar2.h != nVar2.d || nVar2.f1867j != nVar2.f1863e || nVar2.f1866i != nVar2.f1861b.getRootAlpha()) {
                    n nVar3 = this.f1872g;
                    nVar3.f1864f.eraseColor(0);
                    Canvas canvas3 = new Canvas(nVar3.f1864f);
                    m mVar2 = nVar3.f1861b;
                    mVar2.a(mVar2.f1852g, m.f1846p, canvas3, min, min2);
                    n nVar4 = this.f1872g;
                    nVar4.f1865g = nVar4.f1862c;
                    nVar4.h = nVar4.d;
                    nVar4.f1866i = nVar4.f1861b.getRootAlpha();
                    nVar4.f1867j = nVar4.f1863e;
                    nVar4.f1868k = false;
                }
                n nVar5 = this.f1872g;
                if (nVar5.f1861b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar5.f1869l == null) {
                        Paint paint2 = new Paint();
                        nVar5.f1869l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar5.f1869l.setAlpha(nVar5.f1861b.getRootAlpha());
                    nVar5.f1869l.setColorFilter(colorFilter);
                    paint = nVar5.f1869l;
                }
                canvas.drawBitmap(nVar5.f1864f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f1872g.f1861b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f1872g.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f1873i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1824f != null) {
            return new o(this.f1824f.getConstantState());
        }
        this.f1872g.f1860a = getChangingConfigurations();
        return this.f1872g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f1872g.f1861b.f1853i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f1872g.f1861b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [g1.l, g1.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i3;
        char c3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f1872g;
        nVar.f1861b = new m();
        TypedArray f3 = b0.b.f(resources, theme, attributeSet, a.f1809a);
        n nVar2 = this.f1872g;
        m mVar = nVar2.f1861b;
        int i5 = !b0.b.c(xmlPullParser, "tintMode") ? -1 : f3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.d = mode;
        ColorStateList colorStateList = null;
        int i6 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f3.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f3.getResources();
                int resourceId = f3.getResourceId(1, 0);
                ThreadLocal threadLocal = b0.c.f676a;
                try {
                    colorStateList = b0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e3) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f1862c = colorStateList2;
        }
        boolean z2 = nVar2.f1863e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = f3.getBoolean(5, z2);
        }
        nVar2.f1863e = z2;
        float f4 = mVar.f1854j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f4 = f3.getFloat(7, f4);
        }
        mVar.f1854j = f4;
        float f5 = mVar.f1855k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f5 = f3.getFloat(8, f5);
        }
        mVar.f1855k = f5;
        if (mVar.f1854j <= 0.0f) {
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > 0.0f) {
            mVar.h = f3.getDimension(3, mVar.h);
            float dimension = f3.getDimension(2, mVar.f1853i);
            mVar.f1853i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f3.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f3.getString(0);
                if (string != null) {
                    mVar.f1857m = string;
                    mVar.f1859o.put(string, mVar);
                }
                f3.recycle();
                nVar.f1860a = getChangingConfigurations();
                nVar.f1868k = true;
                n nVar3 = this.f1872g;
                m mVar2 = nVar3.f1861b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f1852g;
                n.f fVar = mVar2.f1859o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i3 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.f1825e = 0.0f;
                            lVar.f1827g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f1828i = 0.0f;
                            lVar.f1829j = 1.0f;
                            lVar.f1830k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f1831l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f1832m = join2;
                            lVar.f1833n = 4.0f;
                            TypedArray f6 = b0.b.f(resources, theme, attributeSet, a.f1811c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f6.getString(0);
                                if (string2 != null) {
                                    lVar.f1844b = string2;
                                }
                                String string3 = f6.getString(2);
                                if (string3 != null) {
                                    lVar.f1843a = y.y(string3);
                                }
                                lVar.f1826f = b0.b.b(f6, xmlPullParser, theme, "fillColor", 1);
                                float f7 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f7 = f6.getFloat(12, f7);
                                }
                                lVar.h = f7;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f6.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f1831l;
                                if (i8 == 0) {
                                    cap = cap2;
                                } else if (i8 != 1) {
                                    cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f1831l = cap;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f6.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f1832m;
                                if (i9 == 0) {
                                    join = join2;
                                } else if (i9 != 1) {
                                    join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f1832m = join;
                                float f8 = lVar.f1833n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f8 = f6.getFloat(10, f8);
                                }
                                lVar.f1833n = f8;
                                lVar.d = b0.b.b(f6, xmlPullParser, theme, "strokeColor", 3);
                                float f9 = lVar.f1827g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f9 = f6.getFloat(11, f9);
                                }
                                lVar.f1827g = f9;
                                float f10 = lVar.f1825e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f10 = f6.getFloat(4, f10);
                                }
                                lVar.f1825e = f10;
                                float f11 = lVar.f1829j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f11 = f6.getFloat(6, f11);
                                }
                                lVar.f1829j = f11;
                                float f12 = lVar.f1830k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f12 = f6.getFloat(7, f12);
                                }
                                lVar.f1830k = f12;
                                float f13 = lVar.f1828i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f13 = f6.getFloat(5, f13);
                                }
                                lVar.f1828i = f13;
                                int i10 = lVar.f1845c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i10 = f6.getInt(13, i10);
                                }
                                lVar.f1845c = i10;
                            }
                            f6.recycle();
                            jVar2.f1835b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f1860a = nVar3.f1860a;
                            z3 = false;
                            c3 = '\b';
                        } else {
                            c3 = '\b';
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f14 = b0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f14.getString(0);
                                    if (string4 != null) {
                                        lVar2.f1844b = string4;
                                    }
                                    String string5 = f14.getString(1);
                                    if (string5 != null) {
                                        lVar2.f1843a = y.y(string5);
                                    }
                                    lVar2.f1845c = !b0.b.c(xmlPullParser, "fillType") ? 0 : f14.getInt(2, 0);
                                    f14.recycle();
                                }
                                jVar2.f1835b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    fVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f1860a = nVar3.f1860a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray f15 = b0.b.f(resources, theme, attributeSet, a.f1810b);
                                float f16 = jVar3.f1836c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                    f16 = f15.getFloat(5, f16);
                                }
                                jVar3.f1836c = f16;
                                jVar3.d = f15.getFloat(1, jVar3.d);
                                jVar3.f1837e = f15.getFloat(2, jVar3.f1837e);
                                float f17 = jVar3.f1838f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f17 = f15.getFloat(3, f17);
                                }
                                jVar3.f1838f = f17;
                                float f18 = jVar3.f1839g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f18 = f15.getFloat(4, f18);
                                }
                                jVar3.f1839g = f18;
                                float f19 = jVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f19 = f15.getFloat(6, f19);
                                }
                                jVar3.h = f19;
                                float f20 = jVar3.f1840i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f20 = f15.getFloat(7, f20);
                                }
                                jVar3.f1840i = f20;
                                String string6 = f15.getString(0);
                                if (string6 != null) {
                                    jVar3.f1842k = string6;
                                }
                                jVar3.c();
                                f15.recycle();
                                jVar2.f1835b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    fVar.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f1860a = nVar3.f1860a;
                            }
                        }
                        i4 = 1;
                    } else {
                        i3 = depth;
                        c3 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i4;
                    depth = i3;
                }
                if (!z3) {
                    this.h = a(nVar.f1862c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f1872g.f1863e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f1872g;
            if (nVar != null) {
                m mVar = nVar.f1861b;
                if (mVar.f1858n == null) {
                    mVar.f1858n = Boolean.valueOf(mVar.f1852g.a());
                }
                if (!mVar.f1858n.booleanValue()) {
                    ColorStateList colorStateList = this.f1872g.f1862c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, g1.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1874j && super.mutate() == this) {
            n nVar = this.f1872g;
            ?? constantState = new Drawable.ConstantState();
            constantState.f1862c = null;
            constantState.d = f1871o;
            if (nVar != null) {
                constantState.f1860a = nVar.f1860a;
                m mVar = new m(nVar.f1861b);
                constantState.f1861b = mVar;
                if (nVar.f1861b.f1850e != null) {
                    mVar.f1850e = new Paint(nVar.f1861b.f1850e);
                }
                if (nVar.f1861b.d != null) {
                    constantState.f1861b.d = new Paint(nVar.f1861b.d);
                }
                constantState.f1862c = nVar.f1862c;
                constantState.d = nVar.d;
                constantState.f1863e = nVar.f1863e;
            }
            this.f1872g = constantState;
            this.f1874j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f1872g;
        ColorStateList colorStateList = nVar.f1862c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        } else {
            z2 = false;
        }
        m mVar = nVar.f1861b;
        if (mVar.f1858n == null) {
            mVar.f1858n = Boolean.valueOf(mVar.f1852g.a());
        }
        if (mVar.f1858n.booleanValue()) {
            boolean b3 = nVar.f1861b.f1852g.b(iArr);
            nVar.f1868k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f1872g.f1861b.getRootAlpha() != i3) {
            this.f1872g.f1861b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f1872g.f1863e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1873i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTint(i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f1872g;
        if (nVar.f1862c != colorStateList) {
            nVar.f1862c = colorStateList;
            this.h = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f1872g;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.h = a(nVar.f1862c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f1875k = true;
        this.f1876l = new float[9];
        this.f1877m = new Matrix();
        this.f1878n = new Rect();
        this.f1872g = nVar;
        this.h = a(nVar.f1862c, nVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
