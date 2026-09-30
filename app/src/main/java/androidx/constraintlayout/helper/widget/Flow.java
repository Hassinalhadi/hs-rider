package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import s.d;
import s.g;
import s.i;
import v.r;
import v.t;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: o, reason: collision with root package name */
    public final g f196o;

    /* JADX WARN: Type inference failed for: r1v0, types: [t.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [s.g, s.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3030f = new int[32];
        this.f3035l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        ?? iVar = new i();
        iVar.f2927s0 = 0;
        iVar.f2928t0 = 0;
        iVar.f2929u0 = 0;
        iVar.f2930v0 = 0;
        iVar.f2931w0 = 0;
        iVar.f2932x0 = 0;
        iVar.f2933y0 = false;
        iVar.f2934z0 = 0;
        iVar.A0 = 0;
        iVar.B0 = new Object();
        iVar.C0 = null;
        iVar.D0 = -1;
        iVar.E0 = -1;
        iVar.F0 = -1;
        iVar.G0 = -1;
        iVar.H0 = -1;
        iVar.I0 = -1;
        iVar.J0 = 0.5f;
        iVar.K0 = 0.5f;
        iVar.L0 = 0.5f;
        iVar.M0 = 0.5f;
        iVar.N0 = 0.5f;
        iVar.O0 = 0.5f;
        iVar.P0 = 0;
        iVar.Q0 = 0;
        iVar.R0 = 2;
        iVar.S0 = 2;
        iVar.T0 = 0;
        iVar.U0 = -1;
        iVar.V0 = 0;
        iVar.W0 = new ArrayList();
        iVar.X0 = null;
        iVar.Y0 = null;
        iVar.Z0 = null;
        iVar.f2926b1 = 0;
        this.f196o = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3168b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 0) {
                    this.f196o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f196o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f2927s0 = dimensionPixelSize;
                    gVar.f2928t0 = dimensionPixelSize;
                    gVar.f2929u0 = dimensionPixelSize;
                    gVar.f2930v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f196o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f2929u0 = dimensionPixelSize2;
                    gVar2.f2931w0 = dimensionPixelSize2;
                    gVar2.f2932x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f196o.f2930v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f196o.f2931w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f196o.f2927s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f196o.f2932x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f196o.f2928t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f196o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f196o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f196o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f196o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f196o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f196o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f196o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f196o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f196o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f196o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f196o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f196o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f196o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f196o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f196o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f196o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f196o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f196o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3032i = this.f196o;
        i();
    }

    @Override // v.c
    public final void h(d dVar, boolean z2) {
        g gVar = this.f196o;
        int i3 = gVar.f2929u0;
        if (i3 <= 0 && gVar.f2930v0 <= 0) {
            return;
        }
        if (z2) {
            gVar.f2931w0 = gVar.f2930v0;
            gVar.f2932x0 = i3;
        } else {
            gVar.f2931w0 = i3;
            gVar.f2932x0 = gVar.f2930v0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0732  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // v.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(s.g r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(s.g, int, int):void");
    }

    @Override // v.c, android.view.View
    public final void onMeasure(int i3, int i4) {
        j(this.f196o, i3, i4);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f196o.L0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f196o.F0 = i3;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f196o.M0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f196o.G0 = i3;
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f196o.R0 = i3;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f196o.J0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f196o.P0 = i3;
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f196o.D0 = i3;
        requestLayout();
    }

    public void setLastHorizontalBias(float f3) {
        this.f196o.N0 = f3;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i3) {
        this.f196o.H0 = i3;
        requestLayout();
    }

    public void setLastVerticalBias(float f3) {
        this.f196o.O0 = f3;
        requestLayout();
    }

    public void setLastVerticalStyle(int i3) {
        this.f196o.I0 = i3;
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f196o.U0 = i3;
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f196o.V0 = i3;
        requestLayout();
    }

    public void setPadding(int i3) {
        g gVar = this.f196o;
        gVar.f2927s0 = i3;
        gVar.f2928t0 = i3;
        gVar.f2929u0 = i3;
        gVar.f2930v0 = i3;
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f196o.f2928t0 = i3;
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f196o.f2931w0 = i3;
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f196o.f2932x0 = i3;
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f196o.f2927s0 = i3;
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f196o.S0 = i3;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f196o.K0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f196o.Q0 = i3;
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f196o.E0 = i3;
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f196o.T0 = i3;
        requestLayout();
    }
}
