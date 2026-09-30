package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import b1.n0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f280a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f281b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f282c;

    public f(n0 n0Var) {
        this.f280a = Integer.MIN_VALUE;
        this.f282c = new Rect();
        this.f281b = n0Var;
    }

    public static f a(n0 n0Var, int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                return new b1.z(n0Var, 1);
            }
            a.b.m("invalid orientation");
            return null;
        }
        return new b1.z(n0Var, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i3);

    public f(i iVar) {
        this.f280a = 0;
        this.f282c = new c();
        this.f281b = iVar;
    }
}
