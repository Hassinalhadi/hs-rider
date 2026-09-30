package s;

import android.view.View;
import androidx.emoji2.text.s;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import t.k;
import t.m;
import t.o;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;

    /* renamed from: b, reason: collision with root package name */
    public t.c f2862b;

    /* renamed from: b0, reason: collision with root package name */
    public int f2863b0;

    /* renamed from: c, reason: collision with root package name */
    public t.c f2864c;

    /* renamed from: c0, reason: collision with root package name */
    public int f2865c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f2866d0;
    public float e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f2869f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f2871g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f2872h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2874i0;

    /* renamed from: j, reason: collision with root package name */
    public String f2875j;

    /* renamed from: j0, reason: collision with root package name */
    public int f2876j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2877k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f2878k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2879l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f2880l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2881m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f2882m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2883n;

    /* renamed from: n0, reason: collision with root package name */
    public int f2884n0;

    /* renamed from: o, reason: collision with root package name */
    public int f2885o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2886o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2887p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f2888p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2889q;

    /* renamed from: r, reason: collision with root package name */
    public int f2890r;

    /* renamed from: s, reason: collision with root package name */
    public int f2891s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2892t;

    /* renamed from: u, reason: collision with root package name */
    public int f2893u;

    /* renamed from: v, reason: collision with root package name */
    public int f2894v;

    /* renamed from: w, reason: collision with root package name */
    public float f2895w;

    /* renamed from: x, reason: collision with root package name */
    public int f2896x;

    /* renamed from: y, reason: collision with root package name */
    public int f2897y;

    /* renamed from: z, reason: collision with root package name */
    public float f2898z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2861a = false;
    public k d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f2867e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2868f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f2870g = true;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2873i = -1;

    public d() {
        new HashMap();
        this.f2877k = false;
        this.f2879l = false;
        this.f2881m = false;
        this.f2883n = false;
        this.f2885o = -1;
        this.f2887p = -1;
        this.f2889q = 0;
        this.f2890r = 0;
        this.f2891s = 0;
        this.f2892t = new int[2];
        this.f2893u = 0;
        this.f2894v = 0;
        this.f2895w = 1.0f;
        this.f2896x = 0;
        this.f2897y = 0;
        this.f2898z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f2888p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.f2866d0 = 0.5f;
        this.e0 = 0.5f;
        this.f2871g0 = 0;
        this.f2872h0 = null;
        this.f2874i0 = 0;
        this.f2876j0 = 0;
        this.f2878k0 = new float[]{-1.0f, -1.0f};
        this.f2880l0 = new d[]{null, null};
        this.f2882m0 = new d[]{null, null};
        this.f2884n0 = -1;
        this.f2886o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i3, int i4, String str, StringBuilder sb) {
        if (i3 == i4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i3);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f3, float f4) {
        if (f3 == f4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f3);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i3, int i4, int i5, int i6, int i7, float f3, int i8) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i8 == 1) {
            str2 = "FIXED";
        } else if (i8 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i8 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i8 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i3, 0, "      size", sb);
        G(i4, 0, "      min", sb);
        G(i5, Integer.MAX_VALUE, "      max", sb);
        G(i6, 0, "      matchMin", sb);
        G(i7, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f3, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f2858f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f2858f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.f2859g != 0) {
            sb.append(",");
            sb.append(cVar.f2859g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.f2877k) {
            if (!this.I.f2856c || !this.K.f2856c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean B() {
        if (!this.f2879l) {
            if (!this.J.f2856c || !this.L.f2856c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.f2863b0 = 0;
        this.f2865c0 = 0;
        this.f2866d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.f2888p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f2869f0 = null;
        this.f2871g0 = 0;
        this.f2874i0 = 0;
        this.f2876j0 = 0;
        float[] fArr = this.f2878k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2885o = -1;
        this.f2887p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f2890r = 0;
        this.f2891s = 0;
        this.f2895w = 1.0f;
        this.f2898z = 1.0f;
        this.f2894v = Integer.MAX_VALUE;
        this.f2897y = Integer.MAX_VALUE;
        this.f2893u = 0;
        this.f2896x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f2868f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2870g = true;
        int[] iArr3 = this.f2892t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.f2873i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((c) arrayList.get(i3)).j();
        }
    }

    public final void E() {
        this.f2877k = false;
        this.f2879l = false;
        this.f2881m = false;
        this.f2883n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = (c) arrayList.get(i3);
            cVar.f2856c = false;
            cVar.f2855b = 0;
        }
    }

    public void F(s sVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i3) {
        boolean z2;
        this.a0 = i3;
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E = z2;
    }

    public final void J(int i3, int i4) {
        if (this.f2877k) {
            return;
        }
        this.I.l(i3);
        this.K.l(i4);
        this.Y = i3;
        this.U = i4 - i3;
        this.f2877k = true;
    }

    public final void K(int i3, int i4) {
        if (this.f2879l) {
            return;
        }
        this.J.l(i3);
        this.L.l(i4);
        this.Z = i3;
        this.V = i4 - i3;
        if (this.E) {
            this.M.l(i3 + this.a0);
        }
        this.f2879l = true;
    }

    public final void L(int i3) {
        this.V = i3;
        int i4 = this.f2865c0;
        if (i3 < i4) {
            this.V = i4;
        }
    }

    public final void M(int i3) {
        this.f2888p0[0] = i3;
    }

    public final void N(int i3) {
        this.f2888p0[1] = i3;
    }

    public final void O(int i3) {
        this.U = i3;
        int i4 = this.f2863b0;
        if (i3 < i4) {
            this.U = i4;
        }
    }

    public void P(boolean z2, boolean z3) {
        int i3;
        int i4;
        k kVar = this.d;
        boolean z4 = z2 & kVar.f3005g;
        m mVar = this.f2867e;
        boolean z5 = z3 & mVar.f3005g;
        int i5 = kVar.h.f2983g;
        int i6 = mVar.h.f2983g;
        int i7 = kVar.f3006i.f2983g;
        int i8 = mVar.f3006i.f2983g;
        int i9 = i8 - i6;
        if (i7 - i5 < 0 || i9 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
            i7 = 0;
            i8 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i10 = i7 - i5;
        int i11 = i8 - i6;
        if (z4) {
            this.Y = i5;
        }
        if (z5) {
            this.Z = i6;
        }
        if (this.f2871g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f2888p0;
        if (z4) {
            if (iArr[0] == 1 && i10 < (i4 = this.U)) {
                i10 = i4;
            }
            this.U = i10;
            int i12 = this.f2863b0;
            if (i10 < i12) {
                this.U = i12;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i11 < (i3 = this.V)) {
                i11 = i3;
            }
            this.V = i11;
            int i13 = this.f2865c0;
            if (i11 < i13) {
                this.V = i13;
            }
        }
    }

    public void Q(q.c cVar, boolean z2) {
        int i3;
        int i4;
        m mVar;
        k kVar;
        cVar.getClass();
        int n2 = q.c.n(this.I);
        int n3 = q.c.n(this.J);
        int n4 = q.c.n(this.K);
        int n5 = q.c.n(this.L);
        if (z2 && (kVar = this.d) != null) {
            t.f fVar = kVar.h;
            if (fVar.f2985j) {
                t.f fVar2 = kVar.f3006i;
                if (fVar2.f2985j) {
                    n2 = fVar.f2983g;
                    n4 = fVar2.f2983g;
                }
            }
        }
        if (z2 && (mVar = this.f2867e) != null) {
            t.f fVar3 = mVar.h;
            if (fVar3.f2985j) {
                t.f fVar4 = mVar.f3006i;
                if (fVar4.f2985j) {
                    n3 = fVar3.f2983g;
                    n5 = fVar4.f2983g;
                }
            }
        }
        int i5 = n5 - n3;
        if (n4 - n2 < 0 || i5 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        int i6 = n4 - n2;
        int i7 = n5 - n3;
        this.Y = n2;
        this.Z = n3;
        if (this.f2871g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f2888p0;
        int i8 = iArr[0];
        if (i8 == 1 && i6 < (i4 = this.U)) {
            i6 = i4;
        }
        if (iArr[1] == 1 && i7 < (i3 = this.V)) {
            i7 = i3;
        }
        this.U = i6;
        this.V = i7;
        int i9 = this.f2865c0;
        if (i7 < i9) {
            this.V = i9;
        }
        int i10 = this.f2863b0;
        if (i6 < i10) {
            this.U = i10;
        }
        int i11 = this.f2894v;
        if (i11 > 0 && i8 == 3) {
            this.U = Math.min(this.U, i11);
        }
        int i12 = this.f2897y;
        if (i12 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i12);
        }
        int i13 = this.U;
        if (i6 != i13) {
            this.h = i13;
        }
        int i14 = this.V;
        if (i7 != i14) {
            this.f2873i = i14;
        }
    }

    public final void a(e eVar, q.c cVar, HashSet hashSet, int i3, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.b(eVar, cVar, this);
                hashSet.remove(this);
                b(cVar, eVar.W(64));
            } else {
                return;
            }
        }
        if (i3 == 0) {
            HashSet hashSet2 = this.I.f2854a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, cVar, hashSet, i3, true);
                }
            }
            HashSet hashSet3 = this.K.f2854a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, cVar, hashSet, i3, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f2854a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, cVar, hashSet, i3, true);
            }
        }
        HashSet hashSet5 = this.L.f2854a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, cVar, hashSet, i3, true);
            }
        }
        HashSet hashSet6 = this.M.f2854a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).d.a(eVar, cVar, hashSet, i3, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.f2871g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [s.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(q.c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.b(q.c, boolean):void");
    }

    public boolean c() {
        if (this.f2871g0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(q.c r30, boolean r31, boolean r32, boolean r33, boolean r34, q.f r35, q.f r36, int r37, boolean r38, s.c r39, s.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.d(q.c, boolean, boolean, boolean, boolean, q.f, q.f, int, boolean, s.c, s.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i3, d dVar, int i4, int i5) {
        boolean z2;
        if (i3 == 7) {
            if (i4 == 7) {
                c i6 = i(2);
                c i7 = i(4);
                c i8 = i(3);
                c i9 = i(5);
                boolean z3 = true;
                if ((i6 != null && i6.h()) || (i7 != null && i7.h())) {
                    z2 = false;
                } else {
                    e(2, dVar, 2, 0);
                    e(4, dVar, 4, 0);
                    z2 = true;
                }
                if ((i8 != null && i8.h()) || (i9 != null && i9.h())) {
                    z3 = false;
                } else {
                    e(3, dVar, 3, 0);
                    e(5, dVar, 5, 0);
                }
                if (z2 && z3) {
                    i(7).a(dVar.i(7), 0);
                    return;
                } else if (z2) {
                    i(8).a(dVar.i(8), 0);
                    return;
                } else {
                    if (z3) {
                        i(9).a(dVar.i(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i4 != 2 && i4 != 4) {
                if (i4 == 3 || i4 == 5) {
                    e(3, dVar, i4, 0);
                    e(5, dVar, i4, 0);
                    i(7).a(dVar.i(i4), 0);
                    return;
                }
                return;
            }
            e(2, dVar, i4, 0);
            e(4, dVar, i4, 0);
            i(7).a(dVar.i(i4), 0);
            return;
        }
        if (i3 == 8 && (i4 == 2 || i4 == 4)) {
            c i10 = i(2);
            c i11 = dVar.i(i4);
            c i12 = i(4);
            i10.a(i11, 0);
            i12.a(i11, 0);
            i(8).a(i11, 0);
            return;
        }
        if (i3 == 9 && (i4 == 3 || i4 == 5)) {
            c i13 = dVar.i(i4);
            i(3).a(i13, 0);
            i(5).a(i13, 0);
            i(9).a(i13, 0);
            return;
        }
        if (i3 == 8 && i4 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i4), 0);
            return;
        }
        if (i3 == 9 && i4 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i4), 0);
            return;
        }
        c i14 = i(i3);
        c i15 = dVar.i(i4);
        if (i14.i(i15)) {
            if (i3 == 6) {
                c i16 = i(3);
                c i17 = i(5);
                if (i16 != null) {
                    i16.j();
                }
                if (i17 != null) {
                    i17.j();
                }
            } else if (i3 != 3 && i3 != 5) {
                if (i3 == 2 || i3 == 4) {
                    c i18 = i(7);
                    if (i18.f2858f != i15) {
                        i18.j();
                    }
                    c f3 = i(i3).f();
                    c i19 = i(8);
                    if (i19.h()) {
                        f3.j();
                        i19.j();
                    }
                }
            } else {
                c i20 = i(6);
                if (i20 != null) {
                    i20.j();
                }
                c i21 = i(7);
                if (i21.f2858f != i15) {
                    i21.j();
                }
                c f4 = i(i3).f();
                c i22 = i(9);
                if (i22.h()) {
                    f4.j();
                    i22.j();
                }
            }
            i14.a(i15, i5);
        }
    }

    public final void f(c cVar, c cVar2, int i3) {
        if (cVar.d == this) {
            e(cVar.f2857e, cVar2.d, cVar2.f2857e, i3);
        }
    }

    public final void g(q.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.a0 > 0) {
            cVar.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [t.m, t.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t.k, t.o] */
    public final void h() {
        if (this.d == null) {
            ?? oVar = new o(this);
            oVar.h.f2981e = 4;
            oVar.f3006i.f2981e = 5;
            oVar.f3004f = 0;
            this.d = oVar;
        }
        if (this.f2867e == null) {
            ?? oVar2 = new o(this);
            t.f fVar = new t.f(oVar2);
            oVar2.f2993k = fVar;
            oVar2.f2994l = null;
            oVar2.h.f2981e = 6;
            oVar2.f3006i.f2981e = 7;
            fVar.f2981e = 8;
            oVar2.f3004f = 1;
            this.f2867e = oVar2;
        }
    }

    public c i(int i3) {
        switch (q.e.a(i3)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(w0.e(i3));
        }
    }

    public final int j(int i3) {
        int[] iArr = this.f2888p0;
        if (i3 == 0) {
            return iArr[0];
        }
        if (i3 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int k() {
        if (this.f2871g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i3) {
        c cVar;
        c cVar2;
        if (i3 == 0) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f2858f;
            if (cVar4 != null && cVar4.f2858f == cVar3) {
                return cVar4.d;
            }
            return null;
        }
        if (i3 == 1 && (cVar2 = (cVar = this.L).f2858f) != null && cVar2.f2858f == cVar) {
            return cVar2.d;
        }
        return null;
    }

    public final d m(int i3) {
        c cVar;
        c cVar2;
        if (i3 == 0) {
            c cVar3 = this.I;
            c cVar4 = cVar3.f2858f;
            if (cVar4 != null && cVar4.f2858f == cVar3) {
                return cVar4.d;
            }
            return null;
        }
        if (i3 == 1 && (cVar2 = (cVar = this.J).f2858f) != null && cVar2.f2858f == cVar) {
            return cVar2.d;
        }
        return null;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f2875j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i3 = this.U;
        int i4 = this.f2863b0;
        int[] iArr = this.C;
        int i5 = iArr[0];
        int i6 = this.f2893u;
        int i7 = this.f2890r;
        float f3 = this.f2895w;
        int[] iArr2 = this.f2888p0;
        int i8 = iArr2[0];
        float[] fArr = this.f2878k0;
        float f4 = fArr[0];
        o(sb, "    width", i3, i4, i5, i6, i7, f3, i8);
        int i9 = this.V;
        int i10 = this.f2865c0;
        int i11 = iArr[1];
        int i12 = this.f2896x;
        int i13 = this.f2891s;
        float f5 = this.f2898z;
        int i14 = iArr2[1];
        float f6 = fArr[1];
        o(sb, "    height", i9, i10, i11, i12, i13, f5, i14);
        float f7 = this.W;
        int i15 = this.X;
        if (f7 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f7);
            sb.append(",");
            sb.append(i15);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f2866d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.f2874i0, 0, "    horizontalChainStyle", sb);
        G(this.f2876j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f2871g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f2906x0 + this.Y;
        }
        return this.Y;
    }

    public final int s() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f2907y0 + this.Z;
        }
        return this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            s.c r5 = r4.I
            s.c r5 = r5.f2858f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            s.c r4 = r4.K
            s.c r4 = r4.f2858f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            s.c r5 = r4.J
            s.c r5 = r5.f2858f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            s.c r3 = r4.L
            s.c r3 = r3.f2858f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            s.c r4 = r4.M
            s.c r4 = r4.f2858f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.t(int):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f2872h0 != null) {
            str = "id: " + this.f2872h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i3, int i4) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i3 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f2858f;
            if (cVar6 != null && cVar6.f2856c && (cVar4 = (cVar3 = this.K).f2858f) != null && cVar4.f2856c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f2858f.d()) >= i4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f2858f;
        if (cVar8 != null && cVar8.f2856c && (cVar2 = (cVar = this.L).f2858f) != null && cVar2.f2856c) {
            if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f2858f.d()) >= i4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v(int i3, int i4, int i5, int i6, d dVar) {
        i(i3).b(dVar.i(i4), i5, i6, true);
    }

    public final boolean w(int i3) {
        c cVar;
        c cVar2;
        int i4 = i3 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i4];
        c cVar4 = cVar3.f2858f;
        if (cVar4 != null && cVar4.f2858f != cVar3 && (cVar2 = (cVar = cVarArr[i4 + 1]).f2858f) != null && cVar2.f2858f == cVar) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f2858f;
        if (cVar2 == null || cVar2.f2858f != cVar) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f2858f;
            if (cVar4 != null && cVar4.f2858f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f2858f;
        if (cVar2 == null || cVar2.f2858f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f2858f;
            if (cVar4 != null && cVar4.f2858f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (this.f2870g && this.f2871g0 != 8) {
            return true;
        }
        return false;
    }
}
