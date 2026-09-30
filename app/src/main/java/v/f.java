package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3075a;

    /* renamed from: b, reason: collision with root package name */
    public int f3076b;

    /* renamed from: c, reason: collision with root package name */
    public int f3077c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3078e;

    /* renamed from: f, reason: collision with root package name */
    public int f3079f;

    /* renamed from: g, reason: collision with root package name */
    public int f3080g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3075a = constraintLayout2;
    }

    public static boolean a(int i3, int i4, int i5) {
        if (i3 != i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i5 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(s.d dVar, t.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        int i5;
        boolean z8;
        int baseline;
        int i6;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        int i8;
        if (dVar != null) {
            s.c cVar = dVar.K;
            s.c cVar2 = dVar.I;
            if (dVar.f2871g0 == 8) {
                bVar.f2965e = 0;
                bVar.f2966f = 0;
                bVar.f2967g = 0;
                return;
            }
            if (dVar.T != null) {
                s sVar = ConstraintLayout.f197u;
                int i9 = bVar.f2962a;
                int i10 = bVar.f2963b;
                int i11 = bVar.f2964c;
                int i12 = bVar.d;
                int i13 = this.f3076b + this.f3077c;
                int i14 = this.d;
                View view = dVar.f2869f0;
                int a3 = q.e.a(i9);
                if (a3 != 0) {
                    if (a3 != 1) {
                        if (a3 != 2) {
                            if (a3 != 3) {
                                makeMeasureSpec = 0;
                            } else {
                                int i15 = this.f3079f;
                                if (cVar2 != null) {
                                    i8 = cVar2.f2859g;
                                } else {
                                    i8 = 0;
                                }
                                if (cVar != null) {
                                    i8 += cVar.f2859g;
                                }
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i15, i14 + i8, -1);
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3079f, i14, -2);
                            if (dVar.f2890r == 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            int i16 = bVar.f2969j;
                            if (i16 == 1 || i16 == 2) {
                                if (view.getMeasuredHeight() == dVar.k()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (bVar.f2969j == 2 || !z14 || ((z14 && z15) || dVar.A())) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3079f, i14, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
                int a4 = q.e.a(i10);
                if (a4 != 0) {
                    if (a4 != 1) {
                        if (a4 != 2) {
                            if (a4 != 3) {
                                makeMeasureSpec2 = 0;
                            } else {
                                int i17 = this.f3080g;
                                if (cVar2 != null) {
                                    i7 = dVar.J.f2859g;
                                } else {
                                    i7 = 0;
                                }
                                if (cVar != null) {
                                    i7 += dVar.L.f2859g;
                                }
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i13 + i7, -1);
                            }
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3080g, i13, -2);
                            if (dVar.f2891s == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i18 = bVar.f2969j;
                            if (i18 == 1 || i18 == 2) {
                                if (view.getMeasuredWidth() == dVar.q()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (bVar.f2969j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3080g, i13, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                }
                s.e eVar = (s.e) dVar.T;
                ConstraintLayout constraintLayout = this.h;
                if (eVar != null && s.j.c(constraintLayout.f205n, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
                    bVar.f2965e = dVar.q();
                    bVar.f2966f = dVar.k();
                    bVar.f2967g = dVar.a0;
                    return;
                }
                if (i9 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i10 == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 != 4 && i10 != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i9 != 4 && i9 != 1) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 && dVar.W > 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3 && dVar.W > 0.0f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (view == null) {
                    return;
                }
                e eVar2 = (e) view.getLayoutParams();
                int i19 = bVar.f2969j;
                if (i19 != 1 && i19 != 2 && z2 && dVar.f2890r == 0 && z3 && dVar.f2891s == 0) {
                    i6 = -1;
                    z8 = false;
                    baseline = 0;
                    i4 = 0;
                    i3 = 0;
                } else {
                    if ((view instanceof t) && (dVar instanceof s.g)) {
                        ((t) view).j((s.g) dVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    dVar.G = makeMeasureSpec;
                    dVar.H = makeMeasureSpec2;
                    dVar.f2870g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i20 = dVar.f2893u;
                    if (i20 > 0) {
                        i3 = Math.max(i20, measuredWidth);
                    } else {
                        i3 = measuredWidth;
                    }
                    int i21 = dVar.f2894v;
                    if (i21 > 0) {
                        i3 = Math.min(i21, i3);
                    }
                    int i22 = dVar.f2896x;
                    if (i22 > 0) {
                        i4 = Math.max(i22, measuredHeight);
                    } else {
                        i4 = measuredHeight;
                    }
                    int i23 = makeMeasureSpec2;
                    int i24 = dVar.f2897y;
                    if (i24 > 0) {
                        i4 = Math.min(i24, i4);
                    }
                    if (!s.j.c(constraintLayout.f205n, 1)) {
                        if (z6 && z4) {
                            i3 = (int) ((i4 * dVar.W) + 0.5f);
                        } else if (z7 && z5) {
                            i4 = (int) ((i3 / dVar.W) + 0.5f);
                        }
                    }
                    if (measuredWidth == i3 && measuredHeight == i4) {
                        baseline = baseline2;
                        i6 = -1;
                        z8 = false;
                    } else {
                        if (measuredWidth != i3) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        }
                        if (measuredHeight != i4) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        } else {
                            i5 = i23;
                        }
                        view.measure(makeMeasureSpec, i5);
                        dVar.G = makeMeasureSpec;
                        dVar.H = i5;
                        z8 = false;
                        dVar.f2870g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i3 = measuredWidth2;
                        i4 = measuredHeight2;
                        i6 = -1;
                    }
                }
                if (baseline != i6) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                if (i3 == bVar.f2964c && i4 == bVar.d) {
                    z10 = z8;
                } else {
                    z10 = true;
                }
                bVar.f2968i = z10;
                if (eVar2.f3041c0) {
                    z11 = true;
                } else {
                    z11 = z9;
                }
                if (z11 && baseline != -1 && dVar.a0 != baseline) {
                    bVar.f2968i = true;
                }
                bVar.f2965e = i3;
                bVar.f2966f = i4;
                bVar.h = z11;
                bVar.f2967g = baseline;
            }
        }
    }
}
