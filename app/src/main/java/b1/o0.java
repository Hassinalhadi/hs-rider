package b1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class o0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c1 f877a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f878b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f879c;
    public boolean d;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f878b = new Rect();
        this.f879c = true;
        this.d = false;
    }

    public o0(int i3, int i4) {
        super(i3, i4);
        this.f878b = new Rect();
        this.f879c = true;
        this.d = false;
    }

    public o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f878b = new Rect();
        this.f879c = true;
        this.d = false;
    }

    public o0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f878b = new Rect();
        this.f879c = true;
        this.d = false;
    }

    public o0(o0 o0Var) {
        super((ViewGroup.LayoutParams) o0Var);
        this.f878b = new Rect();
        this.f879c = true;
        this.d = false;
    }
}
