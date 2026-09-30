package v;

import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3037a;
    public boolean a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3038b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3039b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3040c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3041c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3042d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3043e;
    public boolean e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3044f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3045f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3046g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3047g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3048h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3049i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3050i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3051j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3052j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3053k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3054k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3055l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3056l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3057m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3058m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3059n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3060n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3061o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3062o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3063p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f3064p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3065q;

    /* renamed from: r, reason: collision with root package name */
    public float f3066r;

    /* renamed from: s, reason: collision with root package name */
    public int f3067s;

    /* renamed from: t, reason: collision with root package name */
    public int f3068t;

    /* renamed from: u, reason: collision with root package name */
    public int f3069u;

    /* renamed from: v, reason: collision with root package name */
    public int f3070v;

    /* renamed from: w, reason: collision with root package name */
    public int f3071w;

    /* renamed from: x, reason: collision with root package name */
    public int f3072x;

    /* renamed from: y, reason: collision with root package name */
    public int f3073y;

    /* renamed from: z, reason: collision with root package name */
    public int f3074z;

    public final void a() {
        this.f3042d0 = false;
        this.a0 = true;
        this.f3039b0 = true;
        int i3 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i3 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.X) {
            this.f3039b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.a0 = false;
            if (i3 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f3039b0 = false;
            if (i4 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f3040c == -1.0f && this.f3037a == -1 && this.f3038b == -1) {
            return;
        }
        this.f3042d0 = true;
        this.a0 = true;
        this.f3039b0 = true;
        if (!(this.f3064p0 instanceof s.h)) {
            this.f3064p0 = new s.h();
        }
        ((s.h) this.f3064p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.resolveLayoutDirection(int):void");
    }
}
