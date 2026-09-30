package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3096b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3097c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3098e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3099f;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [v.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [v.m, java.lang.Object] */
    public i() {
        ?? obj = new Object();
        obj.f3146a = 0;
        obj.f3147b = 0;
        obj.f3148c = 1.0f;
        obj.d = Float.NaN;
        this.f3096b = obj;
        ?? obj2 = new Object();
        obj2.f3139a = -1;
        obj2.f3140b = 0;
        obj2.f3141c = -1;
        obj2.d = Float.NaN;
        obj2.f3142e = Float.NaN;
        obj2.f3143f = Float.NaN;
        obj2.f3144g = -1;
        obj2.h = null;
        obj2.f3145i = -1;
        this.f3097c = obj2;
        ?? obj3 = new Object();
        obj3.f3101a = false;
        obj3.d = -1;
        obj3.f3107e = -1;
        obj3.f3108f = -1.0f;
        obj3.f3110g = true;
        obj3.h = -1;
        obj3.f3113i = -1;
        obj3.f3115j = -1;
        obj3.f3117k = -1;
        obj3.f3119l = -1;
        obj3.f3121m = -1;
        obj3.f3123n = -1;
        obj3.f3125o = -1;
        obj3.f3127p = -1;
        obj3.f3128q = -1;
        obj3.f3129r = -1;
        obj3.f3130s = -1;
        obj3.f3131t = -1;
        obj3.f3132u = -1;
        obj3.f3133v = -1;
        obj3.f3134w = 0.5f;
        obj3.f3135x = 0.5f;
        obj3.f3136y = null;
        obj3.f3137z = -1;
        obj3.A = 0;
        obj3.B = 0.0f;
        obj3.C = -1;
        obj3.D = -1;
        obj3.E = -1;
        obj3.F = 0;
        obj3.G = 0;
        obj3.H = 0;
        obj3.I = 0;
        obj3.J = 0;
        obj3.K = 0;
        obj3.L = 0;
        obj3.M = Integer.MIN_VALUE;
        obj3.N = Integer.MIN_VALUE;
        obj3.O = Integer.MIN_VALUE;
        obj3.P = Integer.MIN_VALUE;
        obj3.Q = Integer.MIN_VALUE;
        obj3.R = Integer.MIN_VALUE;
        obj3.S = Integer.MIN_VALUE;
        obj3.T = -1.0f;
        obj3.U = -1.0f;
        obj3.V = 0;
        obj3.W = 0;
        obj3.X = 0;
        obj3.Y = 0;
        obj3.Z = 0;
        obj3.a0 = 0;
        obj3.f3103b0 = 0;
        obj3.f3105c0 = 0;
        obj3.f3106d0 = 1.0f;
        obj3.e0 = 1.0f;
        obj3.f3109f0 = -1;
        obj3.f3111g0 = 0;
        obj3.f3112h0 = -1;
        obj3.f3120l0 = false;
        obj3.f3122m0 = false;
        obj3.f3124n0 = true;
        obj3.f3126o0 = 0;
        this.d = obj3;
        ?? obj4 = new Object();
        obj4.f3150a = 0.0f;
        obj4.f3151b = 0.0f;
        obj4.f3152c = 0.0f;
        obj4.d = 1.0f;
        obj4.f3153e = 1.0f;
        obj4.f3154f = Float.NaN;
        obj4.f3155g = Float.NaN;
        obj4.h = -1;
        obj4.f3156i = 0.0f;
        obj4.f3157j = 0.0f;
        obj4.f3158k = 0.0f;
        obj4.f3159l = false;
        obj4.f3160m = 0.0f;
        this.f3098e = obj4;
        this.f3099f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.d;
        eVar.f3043e = jVar.h;
        eVar.f3044f = jVar.f3113i;
        eVar.f3046g = jVar.f3115j;
        eVar.h = jVar.f3117k;
        eVar.f3049i = jVar.f3119l;
        eVar.f3051j = jVar.f3121m;
        eVar.f3053k = jVar.f3123n;
        eVar.f3055l = jVar.f3125o;
        eVar.f3057m = jVar.f3127p;
        eVar.f3059n = jVar.f3128q;
        eVar.f3061o = jVar.f3129r;
        eVar.f3067s = jVar.f3130s;
        eVar.f3068t = jVar.f3131t;
        eVar.f3069u = jVar.f3132u;
        eVar.f3070v = jVar.f3133v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f3072x = jVar.N;
        eVar.f3074z = jVar.P;
        eVar.E = jVar.f3134w;
        eVar.F = jVar.f3135x;
        eVar.f3063p = jVar.f3137z;
        eVar.f3065q = jVar.A;
        eVar.f3066r = jVar.B;
        eVar.G = jVar.f3136y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f3120l0;
        eVar.X = jVar.f3122m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.a0;
        eVar.N = jVar.f3103b0;
        eVar.O = jVar.f3105c0;
        eVar.R = jVar.f3106d0;
        eVar.S = jVar.e0;
        eVar.V = jVar.E;
        eVar.f3040c = jVar.f3108f;
        eVar.f3037a = jVar.d;
        eVar.f3038b = jVar.f3107e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f3102b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f3104c;
        String str = jVar.f3118k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f3126o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.d;
        jVar.getClass();
        j jVar2 = this.d;
        jVar.f3101a = jVar2.f3101a;
        jVar.f3102b = jVar2.f3102b;
        jVar.f3104c = jVar2.f3104c;
        jVar.d = jVar2.d;
        jVar.f3107e = jVar2.f3107e;
        jVar.f3108f = jVar2.f3108f;
        jVar.f3110g = jVar2.f3110g;
        jVar.h = jVar2.h;
        jVar.f3113i = jVar2.f3113i;
        jVar.f3115j = jVar2.f3115j;
        jVar.f3117k = jVar2.f3117k;
        jVar.f3119l = jVar2.f3119l;
        jVar.f3121m = jVar2.f3121m;
        jVar.f3123n = jVar2.f3123n;
        jVar.f3125o = jVar2.f3125o;
        jVar.f3127p = jVar2.f3127p;
        jVar.f3128q = jVar2.f3128q;
        jVar.f3129r = jVar2.f3129r;
        jVar.f3130s = jVar2.f3130s;
        jVar.f3131t = jVar2.f3131t;
        jVar.f3132u = jVar2.f3132u;
        jVar.f3133v = jVar2.f3133v;
        jVar.f3134w = jVar2.f3134w;
        jVar.f3135x = jVar2.f3135x;
        jVar.f3136y = jVar2.f3136y;
        jVar.f3137z = jVar2.f3137z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.a0 = jVar2.a0;
        jVar.f3103b0 = jVar2.f3103b0;
        jVar.f3105c0 = jVar2.f3105c0;
        jVar.f3106d0 = jVar2.f3106d0;
        jVar.e0 = jVar2.e0;
        jVar.f3109f0 = jVar2.f3109f0;
        jVar.f3111g0 = jVar2.f3111g0;
        jVar.f3112h0 = jVar2.f3112h0;
        jVar.f3118k0 = jVar2.f3118k0;
        int[] iArr = jVar2.f3114i0;
        if (iArr != null && jVar2.f3116j0 == null) {
            jVar.f3114i0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f3114i0 = null;
        }
        jVar.f3116j0 = jVar2.f3116j0;
        jVar.f3120l0 = jVar2.f3120l0;
        jVar.f3122m0 = jVar2.f3122m0;
        jVar.f3124n0 = jVar2.f3124n0;
        jVar.f3126o0 = jVar2.f3126o0;
        k kVar = iVar.f3097c;
        kVar.getClass();
        k kVar2 = this.f3097c;
        kVar2.getClass();
        kVar.f3139a = kVar2.f3139a;
        kVar.f3141c = kVar2.f3141c;
        kVar.f3142e = kVar2.f3142e;
        kVar.d = kVar2.d;
        l lVar = this.f3096b;
        int i3 = lVar.f3146a;
        l lVar2 = iVar.f3096b;
        lVar2.f3146a = i3;
        lVar2.f3148c = lVar.f3148c;
        lVar2.d = lVar.d;
        lVar2.f3147b = lVar.f3147b;
        m mVar = iVar.f3098e;
        mVar.getClass();
        m mVar2 = this.f3098e;
        mVar2.getClass();
        mVar.f3150a = mVar2.f3150a;
        mVar.f3151b = mVar2.f3151b;
        mVar.f3152c = mVar2.f3152c;
        mVar.d = mVar2.d;
        mVar.f3153e = mVar2.f3153e;
        mVar.f3154f = mVar2.f3154f;
        mVar.f3155g = mVar2.f3155g;
        mVar.h = mVar2.h;
        mVar.f3156i = mVar2.f3156i;
        mVar.f3157j = mVar2.f3157j;
        mVar.f3158k = mVar2.f3158k;
        mVar.f3159l = mVar2.f3159l;
        mVar.f3160m = mVar2.f3160m;
        iVar.f3095a = this.f3095a;
        return iVar;
    }
}
