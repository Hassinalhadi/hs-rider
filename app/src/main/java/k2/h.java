package k2;

import a.y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.emoji2.text.s;
import androidx.lifecycle.j0;
import b2.x;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class h {
    public static boolean A(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean B(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int C(int i3, int i4, float f3) {
        return c0.a.b(c0.a.d(i4, Math.round(Color.alpha(i4) * f3)), i3);
    }

    public static int D(int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 == 130) {
                        i4 = rect2.top;
                        i5 = rect.bottom;
                    } else {
                        a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                } else {
                    i4 = rect2.left;
                    i5 = rect.right;
                }
            } else {
                i4 = rect.top;
                i5 = rect2.bottom;
            }
        } else {
            i4 = rect.left;
            i5 = rect2.right;
        }
        return Math.max(0, i4 - i5);
    }

    public static Typeface E(Configuration configuration, Typeface typeface) {
        int i3;
        int i4;
        int i5;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = configuration.fontWeightAdjustment;
            if (i3 != Integer.MAX_VALUE) {
                i4 = configuration.fontWeightAdjustment;
                if (i4 != 0 && typeface != null) {
                    int weight = typeface.getWeight();
                    i5 = configuration.fontWeightAdjustment;
                    return Typeface.create(typeface, y.q(i5 + weight, 1, 1000), typeface.isItalic());
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int F(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static float I(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n0.c.c(edgeEffect, f3, f4);
        }
        n0.b.a(edgeEffect, f3, f4);
        return f3;
    }

    public static TypedValue P(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean Q(Context context, int i3, boolean z2) {
        TypedValue P = P(context, i3);
        if (P != null && P.type == 18) {
            if (P.data != 0) {
                return true;
            }
            return false;
        }
        return z2;
    }

    public static int R(Context context, int i3, int i4) {
        TypedValue P = P(context, i3);
        if (P != null && P.type == 16) {
            return P.data;
        }
        return i4;
    }

    public static TimeInterpolator S(Context context, int i3, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!B(valueOf, "cubic-bezier") && !B(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (B(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(r(split, 0), r(split, 1), r(split, 2), r(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (B(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    c0.d.b(y.y(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e3) {
                    throw new RuntimeException("Error in parsing ".concat(substring), e3);
                }
            }
            a.b.m("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        a.b.m("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static TypedValue T(Context context, int i3, String str) {
        TypedValue P = P(context, i3);
        if (P != null) {
            return P;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    public static void W(TextView textView, int i3) {
        y.m(i3);
        if (i3 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public static final y0.b a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j3;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j3 = y0.h.a(backEvent);
        } else {
            j3 = 0;
        }
        return new y0.b(swipeEdge, progress, touchX, touchY, j3);
    }

    public static final String b(Object[] objArr, int i3, int i4, a aVar) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r8 != 66) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r10 = D(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r8 != 130) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        if (r9.right <= r11.left) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if (r9.top >= r11.bottom) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r9.left >= r11.right) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = d(r8, r9, r10)
            boolean r1 = d(r8, r9, r11)
            if (r1 != 0) goto L72
            if (r0 != 0) goto Le
            goto L72
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3b
            if (r8 == r2) goto L34
            if (r8 == r3) goto L2d
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L71
            goto L41
        L28:
            a.b.m(r0)
        L2b:
            r8 = 0
            return r8
        L2d:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L71
            goto L41
        L34:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L71
            goto L41
        L3b:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L71
        L41:
            if (r8 == r4) goto L71
            if (r8 != r3) goto L46
            goto L71
        L46:
            int r10 = D(r8, r9, r10)
            if (r8 == r4) goto L66
            if (r8 == r2) goto L61
            if (r8 == r3) goto L5c
            if (r8 != r1) goto L58
            int r8 = r11.bottom
            int r9 = r9.bottom
        L56:
            int r8 = r8 - r9
            goto L6b
        L58:
            a.b.m(r0)
            goto L2b
        L5c:
            int r8 = r11.right
            int r9 = r9.right
            goto L56
        L61:
            int r8 = r9.top
            int r9 = r11.top
            goto L56
        L66:
            int r8 = r9.left
            int r9 = r11.left
            goto L56
        L6b:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L72
        L71:
            return r5
        L72:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.h.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean d(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static int j(Context context, int i3, int i4) {
        Integer num;
        int i5;
        TypedValue P = P(context, i3);
        if (P != null) {
            int i6 = P.resourceId;
            if (i6 != 0) {
                i5 = context.getColor(i6);
            } else {
                i5 = P.data;
            }
            num = Integer.valueOf(i5);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i4;
    }

    public static int k(View view, int i3) {
        Context context = view.getContext();
        TypedValue T = T(view.getContext(), i3, view.getClass().getCanonicalName());
        int i4 = T.resourceId;
        if (i4 != 0) {
            return context.getColor(i4);
        }
        return T.data;
    }

    public static ColorStateList l(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList z2;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (z2 = y.z(context, resourceId)) != null) {
            return z2;
        }
        return typedArray.getColorStateList(i3);
    }

    public static ColorStateList m(Context context, s sVar, int i3) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) sVar.f310c;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (z2 = y.z(context, resourceId)) != null) {
            return z2;
        }
        return sVar.h(i3);
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable o(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable B;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (B = y.B(context, resourceId)) != null) {
            return B;
        }
        return typedArray.getDrawable(i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    public static final Class q(p2.a aVar) {
        aVar.getClass();
        if (j0.class.isPrimitive()) {
            String name = j0.class.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return j0.class;
    }

    public static float r(String[] strArr, int i3) {
        float parseFloat = Float.parseFloat(strArr[i3]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean y(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 == 130) {
                        int i4 = rect.top;
                        int i5 = rect2.top;
                        if ((i4 < i5 || rect.bottom <= i5) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    a.b.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                int i6 = rect.left;
                int i7 = rect2.left;
                if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if ((i8 > i9 || rect.top >= i9) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if ((i10 > i11 || rect.left >= i11) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static boolean z(int i3) {
        double pow;
        double pow2;
        double pow3;
        if (i3 != 0) {
            ThreadLocal threadLocal = c0.a.f1080a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i3);
            int green = Color.green(i3);
            int blue = Color.blue(i3);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d4 = blue / 255.0d;
                if (d4 < 0.04045d) {
                    pow3 = d4 / 12.92d;
                } else {
                    pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d5;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d5 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            a.b.m("outXyz must have a length of 3.");
            return false;
        }
        return false;
    }

    public abstract void G(int i3);

    public abstract void H(Typeface typeface, boolean z2);

    public abstract void K(int i3);

    public abstract void L(View view, int i3, int i4);

    public abstract void M(View view, float f3, float f4);

    public abstract void N(p.f fVar, p.f fVar2);

    public abstract void O(p.f fVar, Thread thread);

    public abstract void U(boolean z2);

    public abstract void V(boolean z2);

    public abstract void X(x xVar, float f3);

    public abstract boolean Y(View view, int i3);

    public abstract boolean e(p.g gVar, p.c cVar);

    public abstract boolean f(p.g gVar, Object obj, Object obj2);

    public abstract boolean g(p.g gVar, p.f fVar, p.f fVar2);

    public abstract int h(View view, int i3);

    public abstract int i(View view, int i3);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public abstract int s(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float t(x xVar);

    public abstract int u();

    public int v(View view) {
        return 0;
    }

    public abstract ViewPropertyAnimator w(View view, int i3);

    public int x() {
        return 0;
    }

    public void J(View view, int i3) {
    }
}
