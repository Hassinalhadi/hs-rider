package g;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i0 {
    public static i0 d;

    /* renamed from: a, reason: collision with root package name */
    public long f1718a;

    /* renamed from: b, reason: collision with root package name */
    public long f1719b;

    /* renamed from: c, reason: collision with root package name */
    public int f1720c;

    public final void a(double d3, double d4, long j3) {
        double d5 = (0.01720197f * (((float) (j3 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d5) * 0.03341960161924362d) + d5 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d5) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d4) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d3;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.f1720c = 1;
            this.f1718a = -1L;
            this.f1719b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f1720c = 0;
                this.f1718a = -1L;
                this.f1719b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1718a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1719b = round;
            if (round < j3 && this.f1718a > j3) {
                this.f1720c = 0;
            } else {
                this.f1720c = 1;
            }
        }
    }
}
