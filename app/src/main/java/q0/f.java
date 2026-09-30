package q0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f2775a;

    /* renamed from: b, reason: collision with root package name */
    public double f2776b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2777c;
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f2778e;

    /* renamed from: f, reason: collision with root package name */
    public double f2779f;

    /* renamed from: g, reason: collision with root package name */
    public double f2780g;
    public double h;

    /* renamed from: i, reason: collision with root package name */
    public double f2781i;

    /* renamed from: j, reason: collision with root package name */
    public final p1.e f2782j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, p1.e] */
    public f() {
        this.f2775a = Math.sqrt(1500.0d);
        this.f2776b = 0.5d;
        this.f2777c = false;
        this.f2781i = Double.MAX_VALUE;
        this.f2782j = new Object();
    }

    public final p1.e a(double d, double d3, long j3) {
        double sin;
        double cos;
        if (!this.f2777c) {
            if (this.f2781i != Double.MAX_VALUE) {
                double d4 = this.f2776b;
                if (d4 > 1.0d) {
                    double d5 = this.f2775a;
                    this.f2779f = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                    double d6 = this.f2776b;
                    double d7 = this.f2775a;
                    this.f2780g = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
                } else if (d4 >= 0.0d && d4 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d4 * d4)) * this.f2775a;
                }
                this.f2777c = true;
            } else {
                a.b.i("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
        }
        double d8 = j3 / 1000.0d;
        double d9 = d - this.f2781i;
        double d10 = this.f2776b;
        if (d10 > 1.0d) {
            double d11 = this.f2780g;
            double d12 = ((d11 * d9) - d3) / (d11 - this.f2779f);
            double d13 = d9 - d12;
            sin = (Math.pow(2.718281828459045d, this.f2779f * d8) * d12) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d14 = this.f2780g;
            double pow = Math.pow(2.718281828459045d, d14 * d8) * d13 * d14;
            double d15 = this.f2779f;
            cos = (Math.pow(2.718281828459045d, d15 * d8) * d12 * d15) + pow;
        } else if (d10 == 1.0d) {
            double d16 = this.f2775a;
            double d17 = (d16 * d9) + d3;
            double d18 = (d17 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d16) * d8) * d18;
            double pow3 = Math.pow(2.718281828459045d, (-this.f2775a) * d8) * d18;
            double d19 = -this.f2775a;
            cos = (Math.pow(2.718281828459045d, d19 * d8) * d17) + (pow3 * d19);
            sin = pow2;
        } else {
            double d20 = 1.0d / this.h;
            double d21 = this.f2775a;
            double d22 = ((d10 * d21 * d9) + d3) * d20;
            sin = ((Math.sin(this.h * d8) * d22) + (Math.cos(this.h * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d21 * d8);
            double d23 = this.f2775a;
            double d24 = this.f2776b;
            double d25 = (-d23) * sin * d24;
            double pow4 = Math.pow(2.718281828459045d, (-d24) * d23 * d8);
            double d26 = this.h;
            double sin2 = Math.sin(d26 * d8) * (-d26) * d9;
            double d27 = this.h;
            cos = (((Math.cos(d27 * d8) * d22 * d27) + sin2) * pow4) + d25;
        }
        float f3 = (float) (sin + this.f2781i);
        p1.e eVar = this.f2782j;
        eVar.f2703a = f3;
        eVar.f2704b = (float) cos;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p1.e] */
    public f(float f3) {
        this.f2775a = Math.sqrt(1500.0d);
        this.f2776b = 0.5d;
        this.f2777c = false;
        this.f2782j = new Object();
        this.f2781i = f3;
    }
}
