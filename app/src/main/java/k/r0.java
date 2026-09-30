package k;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class r0 extends b0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2380g;
    public final /* synthetic */ w0 h;

    public r0(w0 w0Var, int i3, int i4, WeakReference weakReference) {
        this.h = w0Var;
        this.f2378e = i3;
        this.f2379f = i4;
        this.f2380g = weakReference;
    }

    @Override // b0.b
    public final void h(Typeface typeface) {
        boolean z2;
        int i3 = this.f2378e;
        if (i3 != -1) {
            if ((this.f2379f & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            typeface = v0.a(typeface, i3, z2);
        }
        w0 w0Var = this.h;
        if (w0Var.f2430m) {
            w0Var.f2429l = typeface;
            TextView textView = (TextView) this.f2380g.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i4 = w0Var.f2427j;
                if (isAttachedToWindow) {
                    textView.post(new s0(textView, typeface, i4));
                } else {
                    textView.setTypeface(typeface, i4);
                }
            }
        }
    }

    @Override // b0.b
    public final void g(int i3) {
    }
}
