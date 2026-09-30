package c0;

import android.graphics.Color;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1080a = new ThreadLocal();

    public static int a(double d, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        int min;
        int min2;
        double d8 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d))) / 100.0d;
        double d9 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d))) / 100.0d;
        double d10 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d))) / 100.0d;
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        int round = (int) Math.round(d5 * 255.0d);
        int i3 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d6 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d7 * 255.0d);
        if (round3 >= 0) {
            i3 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i3);
    }

    public static int b(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i5, c(Color.red(i3), alpha2, Color.red(i4), alpha, i5), c(Color.green(i3), alpha2, Color.green(i4), alpha, i5), c(Color.blue(i3), alpha2, Color.blue(i4), alpha, i5));
    }

    public static int c(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }

    public static int d(int i3, int i4) {
        if (i4 >= 0 && i4 <= 255) {
            return (i3 & 16777215) | (i4 << 24);
        }
        a.b.m("alpha must be between 0 and 255.");
        return 0;
    }
}
