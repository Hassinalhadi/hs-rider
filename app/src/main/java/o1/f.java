package o1;

import a.c0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b2.a0;
import b2.h;
import b2.j;
import b2.n;
import b2.x;
import com.google.android.material.button.MaterialButton;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f2623a;

    /* renamed from: b, reason: collision with root package name */
    public n f2624b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f2625c;
    public q0.f d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f2626e;

    /* renamed from: f, reason: collision with root package name */
    public int f2627f;

    /* renamed from: g, reason: collision with root package name */
    public int f2628g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2629i;

    /* renamed from: j, reason: collision with root package name */
    public int f2630j;

    /* renamed from: k, reason: collision with root package name */
    public int f2631k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f2632l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f2633m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f2634n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f2635o;

    /* renamed from: p, reason: collision with root package name */
    public j f2636p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2640t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f2642v;

    /* renamed from: w, reason: collision with root package name */
    public int f2643w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2637q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2638r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2639s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2641u = true;

    public f(MaterialButton materialButton, n nVar) {
        this.f2623a = materialButton;
        this.f2624b = nVar;
    }

    public final j a(boolean z2) {
        RippleDrawable rippleDrawable = this.f2642v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (j) ((LayerDrawable) ((InsetDrawable) this.f2642v.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
        }
        return null;
    }

    public final void b(int i3, int i4) {
        MaterialButton materialButton = this.f2623a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.h;
        int i6 = this.f2629i;
        this.f2629i = i4;
        this.h = i3;
        if (!this.f2638r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i3) - i5, paddingEnd, (paddingBottom + i4) - i6);
    }

    public final void c() {
        int i3;
        j jVar = new j(this.f2624b);
        a0 a0Var = this.f2625c;
        if (a0Var != null) {
            jVar.n(a0Var);
        }
        q0.f fVar = this.d;
        if (fVar != null) {
            jVar.k(fVar);
        }
        c0 c0Var = this.f2626e;
        if (c0Var != null) {
            jVar.G = c0Var;
        }
        MaterialButton materialButton = this.f2623a;
        jVar.j(materialButton.getContext());
        jVar.setTintList(this.f2633m);
        PorterDuff.Mode mode = this.f2632l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f3 = this.f2631k;
        ColorStateList colorStateList = this.f2634n;
        jVar.f999g.f990k = f3;
        jVar.invalidateSelf();
        h hVar = jVar.f999g;
        if (hVar.f985e != colorStateList) {
            hVar.f985e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f2624b);
        a0 a0Var2 = this.f2625c;
        if (a0Var2 != null) {
            jVar2.n(a0Var2);
        }
        q0.f fVar2 = this.d;
        if (fVar2 != null) {
            jVar2.k(fVar2);
        }
        jVar2.setTint(0);
        float f4 = this.f2631k;
        if (this.f2637q) {
            i3 = k2.h.k(materialButton, R.attr.colorSurface);
        } else {
            i3 = 0;
        }
        jVar2.f999g.f990k = f4;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i3);
        h hVar2 = jVar2.f999g;
        if (hVar2.f985e != valueOf) {
            hVar2.f985e = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f2624b);
        this.f2636p = jVar3;
        a0 a0Var3 = this.f2625c;
        if (a0Var3 != null) {
            jVar3.n(a0Var3);
        }
        q0.f fVar3 = this.d;
        if (fVar3 != null) {
            this.f2636p.k(fVar3);
        }
        this.f2636p.setTint(-1);
        ColorStateList colorStateList2 = this.f2635o;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f2627f, this.h, this.f2628g, this.f2629i), this.f2636p);
        this.f2642v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j a3 = a(false);
        if (a3 != null) {
            a3.l(this.f2643w);
            a3.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        x xVar;
        j a3 = a(false);
        if (a3 != null) {
            a0 a0Var = this.f2625c;
            if (a0Var != null) {
                a3.n(a0Var);
            } else {
                a3.setShapeAppearanceModel(this.f2624b);
            }
            q0.f fVar = this.d;
            if (fVar != null) {
                a3.k(fVar);
            }
        }
        j a4 = a(true);
        if (a4 != null) {
            a0 a0Var2 = this.f2625c;
            if (a0Var2 != null) {
                a4.n(a0Var2);
            } else {
                a4.setShapeAppearanceModel(this.f2624b);
            }
            q0.f fVar2 = this.d;
            if (fVar2 != null) {
                a4.k(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f2642v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.f2642v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.f2642v;
            if (numberOfLayers > 2) {
                xVar = (x) rippleDrawable2.getDrawable(2);
            } else {
                xVar = (x) rippleDrawable2.getDrawable(1);
            }
        } else {
            xVar = null;
        }
        if (xVar != null) {
            xVar.setShapeAppearanceModel(this.f2624b);
            if (xVar instanceof j) {
                j jVar = (j) xVar;
                a0 a0Var3 = this.f2625c;
                if (a0Var3 != null) {
                    jVar.n(a0Var3);
                }
                q0.f fVar3 = this.d;
                if (fVar3 != null) {
                    jVar.k(fVar3);
                }
            }
        }
    }

    public final void e() {
        int i3 = 0;
        j a3 = a(false);
        j a4 = a(true);
        if (a3 != null) {
            float f3 = this.f2631k;
            ColorStateList colorStateList = this.f2634n;
            a3.f999g.f990k = f3;
            a3.invalidateSelf();
            h hVar = a3.f999g;
            if (hVar.f985e != colorStateList) {
                hVar.f985e = colorStateList;
                a3.onStateChange(a3.getState());
            }
            if (a4 != null) {
                float f4 = this.f2631k;
                if (this.f2637q) {
                    i3 = k2.h.k(this.f2623a, R.attr.colorSurface);
                }
                a4.f999g.f990k = f4;
                a4.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i3);
                h hVar2 = a4.f999g;
                if (hVar2.f985e != valueOf) {
                    hVar2.f985e = valueOf;
                    a4.onStateChange(a4.getState());
                }
            }
        }
    }
}
