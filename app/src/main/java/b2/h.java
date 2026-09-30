package b2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public n f982a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f983b;

    /* renamed from: c, reason: collision with root package name */
    public v1.a f984c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f985e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f986f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f987g;
    public Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final float f988i;

    /* renamed from: j, reason: collision with root package name */
    public float f989j;

    /* renamed from: k, reason: collision with root package name */
    public float f990k;

    /* renamed from: l, reason: collision with root package name */
    public int f991l;

    /* renamed from: m, reason: collision with root package name */
    public float f992m;

    /* renamed from: n, reason: collision with root package name */
    public float f993n;

    /* renamed from: o, reason: collision with root package name */
    public int f994o;

    /* renamed from: p, reason: collision with root package name */
    public int f995p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f996q;

    public h(h hVar) {
        this.d = null;
        this.f985e = null;
        this.f986f = null;
        this.f987g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.f988i = 1.0f;
        this.f989j = 1.0f;
        this.f991l = 255;
        this.f992m = 0.0f;
        this.f993n = 0.0f;
        this.f994o = 0;
        this.f995p = 0;
        this.f996q = Paint.Style.FILL_AND_STROKE;
        this.f982a = hVar.f982a;
        this.f983b = hVar.f983b;
        this.f984c = hVar.f984c;
        this.f990k = hVar.f990k;
        this.d = hVar.d;
        this.f985e = hVar.f985e;
        this.f987g = hVar.f987g;
        this.f986f = hVar.f986f;
        this.f991l = hVar.f991l;
        this.f988i = hVar.f988i;
        this.f995p = hVar.f995p;
        this.f989j = hVar.f989j;
        this.f992m = hVar.f992m;
        this.f993n = hVar.f993n;
        this.f994o = hVar.f994o;
        this.f996q = hVar.f996q;
        if (hVar.h != null) {
            this.h = new Rect(hVar.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f1002k = true;
        jVar.f1003l = true;
        return jVar;
    }

    public h(n nVar) {
        this.d = null;
        this.f985e = null;
        this.f986f = null;
        this.f987g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.f988i = 1.0f;
        this.f989j = 1.0f;
        this.f991l = 255;
        this.f992m = 0.0f;
        this.f993n = 0.0f;
        this.f994o = 0;
        this.f995p = 0;
        this.f996q = Paint.Style.FILL_AND_STROKE;
        this.f982a = nVar;
        this.f984c = null;
    }
}
